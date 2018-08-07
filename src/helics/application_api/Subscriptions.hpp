/*
Copyright © 2017-2018,
Battelle Memorial Institute; Lawrence Livermore National Security, LLC; Alliance for Sustainable Energy, LLC
All rights reserved. See LICENSE file and DISCLAIMER for more details.
*/
#pragma once

#include "Inputs.hpp"

namespace helics
{
/** primary subscription object class
@details can convert between the helics primary base class types
*/
class Subscription : public Input
{
  private:
    std::string target_;

  public:
    Subscription () = default;
    Subscription (ValueFederate *valueFed, std::string key, const std::string &units = std::string ())
        : Input (valueFed, std::string (), units), target_ (std::move (key))
    {
        addTarget (target_);
    }

    template <class FedPtr>
    Subscription (FedPtr &valueFed, std::string key, const std::string &units = std::string ())
        : Input (valueFed, std::string (), units), target_ (std::move (key))
    {
        addTarget (target_);
    }

    Subscription (ValueFederate *valueFed,
                  std::string key,
                  helics_type_t defType,
                  const std::string &units = std::string ())
        : Input (valueFed, std::string (), defType, units), target_ (std::move (key))
    {
        addTarget (target_);
    }

    template <class FedPtr>
    Subscription (FedPtr &valueFed,
                  std::string key,
                  helics_type_t defType,
                  const std::string &units = std::string ())
        : Input (valueFed, std::string(), defType, units), target_ (std::move(key))
    {
        addTarget (target_);
    }

    /** generate a subscription object from a preexisting subscription
    @param valueFed a pointer to the appropriate value Federate
    @param subIndex the index of the subscription
    */
    Subscription (ValueFederate *valueFed, int subIndex) : Input (valueFed, subIndex) {}
    /** get the target of a subscription*/
    const std::string &getTarget () const { return target_; }
};

/** class to handle a subscription
@tparam X the class of the value associated with a subscription*/
template <class X>
class SubscriptionT : public InputT<X>
{
  private:
    std::string target_;

  public:
    SubscriptionT () = default;
    /**constructor to build a subscription object
    @param[in] valueFed  the ValueFederate to use
    @param[in] name the name of the subscription
    @param[in] units the units associated with a Federate
    */
    SubscriptionT (ValueFederate *valueFed, std::string target, const std::string &units = std::string ())
        : InputT(valueFed, std::string (), units), target_ (std::move (target))
    {
        addTarget (target_);
    }
    /**constructor to build a subscription object
    @param[in] valueFed  the ValueFederate to use
    @param[in] target the key of the field to subscribe to
    @param[in] units the units associated with a Federate
    */
    template <class FedPtr>
    SubscriptionT (FedPtr &valueFed, std::string target, const std::string &units = std::string ())
        : InputT(valueFed, std::string(), units), target_ (std::move (target))
    {
        addTarget (target_);
    }

    const std::string &getTarget () const { return target_; }
};

/** class to handle a Vector Subscription
@tparam X the class of the value associated with the vector subscription*/
template <class X>
class VectorSubscription
{
  private:
    ValueFederate *fed = nullptr;  //!< reference to the value federate
    std::string m_key;  //!< the key for the subscription
    std::string m_units;  //!< the defined units of the federate
    std::vector<input_id_t> ids;  //!< the id of the federate
    std::function<void(int, Time)> update_callback;  //!< callback function for when a value is updated
    std::vector<X> vals;  //!< storage for the values
  public:
    VectorSubscription () noexcept {};
    /**constructor to build a subscription object
   @param[in] valueFed  the ValueFederate to use
   @param[in] key the identifier for the publication to subscribe to
   @param[in] startIndex the index to start with
   @param[in] count the number of values to subscribe to
   @param[in] defValue the default value
   @param[in] units the units associated with the Subscription
   */
    VectorSubscription (ValueFederate *valueFed,
                        const std::string &key,
                        int startIndex,
                        int count,
                        const X &defValue,
                        const std::string &units = std::string ())
        : fed (*valueFed), m_key (key), m_units (units)
    {
        ids.reserve (count);
        vals.resize (count, defValue);
        if (required == interface_availability::required)
        {
        for (auto ind = startIndex; ind < startIndex + count; ++ind)
        {
                auto id = fed->registerRequiredSubscription<X> (m_key, ind, m_units);
            ids.push_back (id);
        }
        }
        else
        {
            for (auto ind = startIndex; ind < startIndex + count; ++ind)
            {
                auto id = fed->registerOptionalSubscription<X> (m_key, ind, m_units);
                ids.push_back (id);
            }
        }
        fed->registerSubscriptionNotificationCallback (ids, [this](input_id_t id, Time tm) {
            handleCallback (id, tm);
        });
    }
    /**constructor to build a subscription object
    @param[in] valueFed  the ValueFederate to use
    @param[in] key the identifier for the publication to subscribe to
    @param[in] startIndex the index to start with
    @param[in] count the number of values to subscribe to
    @param[in] defValue the default value
    @param[in] units the units associated with the Subscription
    */
    template <class FedPtr>
    VectorSubscription (FedPtr valueFed,
                        const std::string &key,
                        int startIndex,
                        int count,
                        const X &defValue,
                        const std::string &units = std::string ())
        : VectorSubscription (std::addressof (*valueFed), key, startIndex, count, defValue, units)
    {
        static_assert (std::is_base_of<ValueFederate, std::remove_reference_t<decltype (*valueFed)>>::value,
                       "first argument must be a pointer to a ValueFederate");
    }

    /** move constructor*/
    VectorSubscription (VectorSubscription &&vs) noexcept
        : fed (vs.fed), m_key (std::move (vs.m_key)), m_units (std::move (vs.m_units)), ids (std::move (vs.ids)),
          update_callback (std::move (vs.update_callback)), vals (std::move (vs.vals))
    {
        // need to transfer the callback to the new object
        fed->registerSubscriptionNotificationCallback (id, [this](input_id_t id, Time tm) {
            handleCallback (id, tm);
        });
    };
    /** move assignment*/
    VectorSubscription &operator= (VectorSubscription &&vs) noexcept
    {
        fed = vs.fed;
        m_key = std::move (vs.m_key);
        m_units = std::move (vs.m_units);
        ids = std::move (vs.ids);
        update_callback = std::move (vs.update_callback);
        vals = std::move (vs.vals);
        // need to transfer the callback to the new object
        fed->registerSubscriptionNotificationCallback (id, [this](input_id_t id, Time tm) {
            handleCallback (id, tm);
        });
        return *this;
    }
    /** get the most recent value
    @return the value*/
    const std::vector<X> &getVals () const { return vals; }
    /** store the value in the given variable
    @param[out] out the location to store the value
    */
    const X &operator[] (int index) const { return vals[index]; }
    /** register a callback for the update
    @details the callback is called in the just before the time request function returns
    @param[in] callback a function with signature void(X val, Time time)
    val is the new value and time is the time the value was updated
    */
    void registerCallback (std::function<void(int, Time)> callback) { update_callback = std::move (callback); }

  private:
    void handleCallback (input_id_t id, Time time)
    {
        X out;
        auto res = std::lower_bound (ids.begin (), ids.end (), id);
        int index = static_cast<int> (res - ids.begin ());
        fed->getValue (ids[index], out);
        vals[index] = out;
        if (update_callback)
        {
            update_callback (index, time);
        }
    }
};

/** class to handle a Vector Subscription
@tparam X the class of the value associated with the vector subscription*/
template <class X>
class VectorSubscription2d
{
  private:
    ValueFederate *fed = nullptr;  //!< reference to the value federate
    std::string m_key;  //!< the name of the subscription
    std::string m_units;  //!< the defined units of the federate
    std::vector<input_id_t> ids;  //!< the id of the federate
    std::function<void(int, Time)> update_callback;  //!< callback function for when a value is updated
    std::vector<X> vals;  //!< storage for the values
    std::array<int, 4> indices;  //!< storage for the indices and start values
  public:
    VectorSubscription2d () noexcept {};

    /**constructor to build a subscription object
    @param[in] required a flag indicating that the subscription is required to have a matching publication
    @param[in] valueFed  the ValueFederate to use
     @param[in] key the identifier for the publication to subscribe to
    @param[in] startIndex_x the index to start with in the x dimension
    @param[in] count_x the number of values in the x direction
    @param[in] startIndex_y the index to start with in the x dimension
    @param[in] count_y the number of values in the x direction
    @param[in] defValue the default value
    @param[in] units the units associated with the Subscription
    */
    template <class FedPtr>
    VectorSubscription2d (interface_availability required,
                          FedPtr valueFed,
                          const std::string &key,
                          int startIndex_x,
                          int count_x,
                          int startIndex_y,
                          int count_y,
                          const X &defValue,
                          const std::string &units = std::string ())
        : fed (std::addressof (*valueFed)), m_key (key), m_units (units)
    {
        static_assert (std::is_base_of<ValueFederate, std::remove_reference_t<decltype (*valueFed)>>::value,
                       "Second argument must be a pointer to a ValueFederate");
        ids.reserve (count_x * count_y);
        vals.resize (count_x * count_y, defValue);
        if (required == interface_availability::required)
        {
        for (auto ind_x = startIndex_x; ind_x < startIndex_x + count_x; ++ind_x)
        {
            for (auto ind_y = startIndex_y; ind_y < startIndex_y + count_y; ++ind_y)
            {
                    auto id = fed->registerRequiredSubscriptionIndexed<X> (m_key, ind_x, ind_y, m_units);
                    ids.push_back (id);
            }
        }
        }
        else
        {
            for (auto ind_x = startIndex_x; ind_x < startIndex_x + count_x; ++ind_x)
            {
                for (auto ind_y = startIndex_y; ind_y < startIndex_y + count_y; ++ind_y)
                {
                    auto id = fed->registerOptionalSubscriptionIndexed<X> (m_key, ind_x, ind_y, m_units);
                    ids.push_back (id);
                }
            }
        }
        indices[0] = startIndex_x;
        indices[1] = count_x;
        indices[2] = startIndex_y;
        indices[3] = count_y;
        fed->registerSubscriptionNotificationCallback (ids, [this](input_id_t id, Time tm) {
            handleCallback (id, tm);
        });
    }

    /**constructor to build a subscription object
    @param[in] valueFed  the ValueFederate to use
    @param[in] key the identifier for the publication to subscribe to
    @param[in] startIndex_x the index to start with in the x dimension
    @param[in] count_x the number of values in the x direction
    @param[in] startIndex_y the index to start with in the x dimension
    @param[in] count_y the number of values in the x direction
    @param[in] defValue the default value
    @param[in] units the units associated with the Subscription
    */
    template <class FedPtr>
    VectorSubscription2d (FedPtr valueFed,
                          const std::string &key,
                          int startIndex_x,
                          int count_x,
                          int startIndex_y,
                          int count_y,
                          const X &defValue,
                          const std::string &units = std::string ())
        : VectorSubscription2d (interface_availability::optional,
                                valueFed,
                                key,
                                startIndex_x,
                                count_x,
                                startIndex_y,
                                count_y,
                                defValue,
                                units)
    {
    }
    /** move constructor*/
    VectorSubscription2d (VectorSubscription2d &&vs) noexcept
        : fed (vs.fed), m_key (std::move (vs.m_key)), m_units (std::move (vs.m_units)), ids (std::move (vs.ids)),
          update_callback (std::move (vs.update_callback)), vals (std::move (vs.vals)), indices (vs.indices)
    {
        // need to transfer the callback to the new object
        fed->registerSubscriptionNotificationCallback (ids, [this](input_id_t id, Time tm) {
            handleCallback (id, tm);
        });
    };

    /** move assignment*/
    VectorSubscription2d &operator= (VectorSubscription2d &&vs) noexcept
    {
        fed = vs.fed;
        m_key = std::move (vs.m_key);
        m_units = std::move (vs.m_units);
        ids = std::move (vs.ids);
        update_callback = std::move (vs.update_callback);
        vals = std::move (vs.vals);
        // need to transfer the callback to the new object
        fed->registerSubscriptionNotificationCallback (ids, [this](input_id_t id, Time tm) {
            handleCallback (id, tm);
        });
        indices = vs.indices;
        return *this;
    }
    /** get the most recent value
    @return the value*/
    const std::vector<X> &getVals () const { return vals; }
    /** get the value in the given variable
    @param[out] out the location to store the value
    */
    const X &operator[] (int index) const { return vals[index]; }

    /** get the value in the given variable
    @param[out] out the location to store the value
    */
    const X &at (int index_x, int index_y) const
    {
        return vals[(index_x - indices[0]) * indices[3] + (index_y - indices[2])];
    }
    /** register a callback for the update
    @details the callback is called in the just before the time request function returns
    @param[in] callback a function with signature void(X val, Time time)
    val is the new value and time is the time the value was updated
    */
    void registerCallback (std::function<void(int, Time)> callback) { update_callback = std::move (callback); }

  private:
    void handleCallback (input_id_t id, Time time)
    {
        auto res = std::lower_bound (ids.begin (), ids.end (), id);
        int index = static_cast<int> (res - ids.begin ());
        fed->getValue (ids[index], vals[index]);
        if (update_callback)
        {
            update_callback (index, time);
    }
    }
};

}  // namespace helics
