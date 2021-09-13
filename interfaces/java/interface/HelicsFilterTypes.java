/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.java.helics;

/**
 *  enumeration of the predefined filter types
 */
public final class HelicsFilterTypes {
  /**
   *  a custom filter type that executes a user defined callback
   */
  public final static HelicsFilterTypes HELICS_FILTER_TYPE_CUSTOM = new HelicsFilterTypes("HELICS_FILTER_TYPE_CUSTOM", helicsJNI.HELICS_FILTER_TYPE_CUSTOM_get());
  /**
   *  a filter type that executes a fixed delay on a message
   */
  public final static HelicsFilterTypes HELICS_FILTER_TYPE_DELAY = new HelicsFilterTypes("HELICS_FILTER_TYPE_DELAY", helicsJNI.HELICS_FILTER_TYPE_DELAY_get());
  /**
   *  a filter type that executes a random delay on the messages
   */
  public final static HelicsFilterTypes HELICS_FILTER_TYPE_RANDOM_DELAY = new HelicsFilterTypes("HELICS_FILTER_TYPE_RANDOM_DELAY", helicsJNI.HELICS_FILTER_TYPE_RANDOM_DELAY_get());
  /**
   *  a filter type that randomly drops messages
   */
  public final static HelicsFilterTypes HELICS_FILTER_TYPE_RANDOM_DROP = new HelicsFilterTypes("HELICS_FILTER_TYPE_RANDOM_DROP", helicsJNI.HELICS_FILTER_TYPE_RANDOM_DROP_get());
  /**
   *  a filter type that reroutes a message to a different destination than originally<br>
   *        specified
   */
  public final static HelicsFilterTypes HELICS_FILTER_TYPE_REROUTE = new HelicsFilterTypes("HELICS_FILTER_TYPE_REROUTE", helicsJNI.HELICS_FILTER_TYPE_REROUTE_get());
  /**
   *  a filter type that duplicates a message and sends the copy to a different destination
   */
  public final static HelicsFilterTypes HELICS_FILTER_TYPE_CLONE = new HelicsFilterTypes("HELICS_FILTER_TYPE_CLONE", helicsJNI.HELICS_FILTER_TYPE_CLONE_get());
  /**
   *  a customizable filter type that can perform different actions on a message based on<br>
   *        firewall like rules
   */
  public final static HelicsFilterTypes HELICS_FILTER_TYPE_FIREWALL = new HelicsFilterTypes("HELICS_FILTER_TYPE_FIREWALL", helicsJNI.HELICS_FILTER_TYPE_FIREWALL_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static HelicsFilterTypes swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + HelicsFilterTypes.class + " with value " + swigValue);
  }

  private HelicsFilterTypes(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private HelicsFilterTypes(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private HelicsFilterTypes(String swigName, HelicsFilterTypes swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static HelicsFilterTypes[] swigValues = { HELICS_FILTER_TYPE_CUSTOM, HELICS_FILTER_TYPE_DELAY, HELICS_FILTER_TYPE_RANDOM_DELAY, HELICS_FILTER_TYPE_RANDOM_DROP, HELICS_FILTER_TYPE_REROUTE, HELICS_FILTER_TYPE_CLONE, HELICS_FILTER_TYPE_FIREWALL };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
