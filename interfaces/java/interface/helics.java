/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.java.helics;

public class helics {
  public static double getHelics_time_zero() {
    return helicsJNI.helics_time_zero_get();
  }

  public static double getHelics_time_epsilon() {
    return helicsJNI.helics_time_epsilon_get();
  }

  public static double getHelics_time_invalid() {
    return helicsJNI.helics_time_invalid_get();
  }

  public static double getHelics_time_maxtime() {
    return helicsJNI.helics_time_maxtime_get();
  }

  public static int getHelics_true() {
    return helicsJNI.helics_true_get();
  }

  public static int getHelics_false() {
    return helicsJNI.helics_false_get();
  }

  public static String helicsGetVersion() {
    return helicsJNI.helicsGetVersion();
  }

  public static int helicsIsCoreTypeAvailable(String type) {
    return helicsJNI.helicsIsCoreTypeAvailable(type);
  }

  public static SWIGTYPE_p_void helicsCreateCore(String type, String name, String initString) {
    long cPtr = helicsJNI.helicsCreateCore(type, name, initString);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsCreateCoreFromArgs(String type, String name, String[] argc) {
    long cPtr = helicsJNI.helicsCreateCoreFromArgs(type, name, argc);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsCoreClone(SWIGTYPE_p_void core) {
    long cPtr = helicsJNI.helicsCoreClone(SWIGTYPE_p_void.getCPtr(core));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static int helicsCoreIsValid(SWIGTYPE_p_void core) {
    return helicsJNI.helicsCoreIsValid(SWIGTYPE_p_void.getCPtr(core));
  }

  public static SWIGTYPE_p_void helicsCreateBroker(String type, String name, String initString) {
    long cPtr = helicsJNI.helicsCreateBroker(type, name, initString);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsCreateBrokerFromArgs(String type, String name, String[] argc) {
    long cPtr = helicsJNI.helicsCreateBrokerFromArgs(type, name, argc);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsBrokerClone(SWIGTYPE_p_void broker) {
    long cPtr = helicsJNI.helicsBrokerClone(SWIGTYPE_p_void.getCPtr(broker));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static int helicsBrokerIsValid(SWIGTYPE_p_void broker) {
    return helicsJNI.helicsBrokerIsValid(SWIGTYPE_p_void.getCPtr(broker));
  }

  public static int helicsBrokerIsConnected(SWIGTYPE_p_void broker) {
    return helicsJNI.helicsBrokerIsConnected(SWIGTYPE_p_void.getCPtr(broker));
  }

  public static void helicsBrokerDataLink(SWIGTYPE_p_void broker, String source, String target) {
    helicsJNI.helicsBrokerDataLink(SWIGTYPE_p_void.getCPtr(broker), source, target);
  }

  public static void helicsBrokerAddSourceFilterToEndpoint(SWIGTYPE_p_void broker, String filter, String endpoint) {
    helicsJNI.helicsBrokerAddSourceFilterToEndpoint(SWIGTYPE_p_void.getCPtr(broker), filter, endpoint);
  }

  public static void helicsBrokerAddDestinationFilterToEndpoint(SWIGTYPE_p_void broker, String filter, String endpoint) {
    helicsJNI.helicsBrokerAddDestinationFilterToEndpoint(SWIGTYPE_p_void.getCPtr(broker), filter, endpoint);
  }

  public static int helicsBrokerWaitForDisconnect(SWIGTYPE_p_void broker, int msToWait) {
    return helicsJNI.helicsBrokerWaitForDisconnect(SWIGTYPE_p_void.getCPtr(broker), msToWait);
  }

  public static int helicsCoreIsConnected(SWIGTYPE_p_void core) {
    return helicsJNI.helicsCoreIsConnected(SWIGTYPE_p_void.getCPtr(core));
  }

  public static void helicsCoreDataLink(SWIGTYPE_p_void core, String source, String target) {
    helicsJNI.helicsCoreDataLink(SWIGTYPE_p_void.getCPtr(core), source, target);
  }

  public static void helicsCoreAddSourceFilterToEndpoint(SWIGTYPE_p_void core, String filter, String endpoint) {
    helicsJNI.helicsCoreAddSourceFilterToEndpoint(SWIGTYPE_p_void.getCPtr(core), filter, endpoint);
  }

  public static void helicsCoreAddDestinationFilterToEndpoint(SWIGTYPE_p_void core, String filter, String endpoint) {
    helicsJNI.helicsCoreAddDestinationFilterToEndpoint(SWIGTYPE_p_void.getCPtr(core), filter, endpoint);
  }

  public static String helicsBrokerGetIdentifier(SWIGTYPE_p_void broker) {
    return helicsJNI.helicsBrokerGetIdentifier(SWIGTYPE_p_void.getCPtr(broker));
  }

  public static String helicsCoreGetIdentifier(SWIGTYPE_p_void core) {
    return helicsJNI.helicsCoreGetIdentifier(SWIGTYPE_p_void.getCPtr(core));
  }

  public static String helicsBrokerGetAddress(SWIGTYPE_p_void broker) {
    return helicsJNI.helicsBrokerGetAddress(SWIGTYPE_p_void.getCPtr(broker));
  }

  public static void helicsCoreSetReadyToInit(SWIGTYPE_p_void core) {
    helicsJNI.helicsCoreSetReadyToInit(SWIGTYPE_p_void.getCPtr(core));
  }

  public static void helicsCoreDisconnect(SWIGTYPE_p_void core) {
    helicsJNI.helicsCoreDisconnect(SWIGTYPE_p_void.getCPtr(core));
  }

  public static SWIGTYPE_p_void helicsGetFederateByName(String fedName) {
    long cPtr = helicsJNI.helicsGetFederateByName(fedName);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static void helicsBrokerDisconnect(SWIGTYPE_p_void broker) {
    helicsJNI.helicsBrokerDisconnect(SWIGTYPE_p_void.getCPtr(broker));
  }

  public static void helicsFederateDestroy(SWIGTYPE_p_void fed) {
    helicsJNI.helicsFederateDestroy(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static void helicsBrokerDestroy(SWIGTYPE_p_void broker) {
    helicsJNI.helicsBrokerDestroy(SWIGTYPE_p_void.getCPtr(broker));
  }

  public static void helicsCoreDestroy(SWIGTYPE_p_void core) {
    helicsJNI.helicsCoreDestroy(SWIGTYPE_p_void.getCPtr(core));
  }

  public static void helicsCoreFree(SWIGTYPE_p_void core) {
    helicsJNI.helicsCoreFree(SWIGTYPE_p_void.getCPtr(core));
  }

  public static void helicsBrokerFree(SWIGTYPE_p_void broker) {
    helicsJNI.helicsBrokerFree(SWIGTYPE_p_void.getCPtr(broker));
  }

  public static SWIGTYPE_p_void helicsCreateValueFederate(String fedName, SWIGTYPE_p_void fi) {
    long cPtr = helicsJNI.helicsCreateValueFederate(fedName, SWIGTYPE_p_void.getCPtr(fi));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsCreateValueFederateFromConfig(String configFile) {
    long cPtr = helicsJNI.helicsCreateValueFederateFromConfig(configFile);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsCreateMessageFederate(String fedName, SWIGTYPE_p_void fi) {
    long cPtr = helicsJNI.helicsCreateMessageFederate(fedName, SWIGTYPE_p_void.getCPtr(fi));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsCreateMessageFederateFromConfig(String configFile) {
    long cPtr = helicsJNI.helicsCreateMessageFederateFromConfig(configFile);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsCreateCombinationFederate(String fedName, SWIGTYPE_p_void fi) {
    long cPtr = helicsJNI.helicsCreateCombinationFederate(fedName, SWIGTYPE_p_void.getCPtr(fi));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsCreateCombinationFederateFromConfig(String configFile) {
    long cPtr = helicsJNI.helicsCreateCombinationFederateFromConfig(configFile);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateClone(SWIGTYPE_p_void fed) {
    long cPtr = helicsJNI.helicsFederateClone(SWIGTYPE_p_void.getCPtr(fed));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsCreateFederateInfo() {
    long cPtr = helicsJNI.helicsCreateFederateInfo();
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static void helicsFederateInfoLoadFromArgs(SWIGTYPE_p_void fi, String[] argc) {
    helicsJNI.helicsFederateInfoLoadFromArgs(SWIGTYPE_p_void.getCPtr(fi), argc);
  }

  public static void helicsFederateInfoFree(SWIGTYPE_p_void fi) {
    helicsJNI.helicsFederateInfoFree(SWIGTYPE_p_void.getCPtr(fi));
  }

  public static int helicsFederateIsValid(SWIGTYPE_p_void fed) {
    return helicsJNI.helicsFederateIsValid(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static void helicsFederateInfoSetCoreName(SWIGTYPE_p_void fi, String corename) {
    helicsJNI.helicsFederateInfoSetCoreName(SWIGTYPE_p_void.getCPtr(fi), corename);
  }

  public static void helicsFederateInfoSetCoreInitString(SWIGTYPE_p_void fi, String coreInit) {
    helicsJNI.helicsFederateInfoSetCoreInitString(SWIGTYPE_p_void.getCPtr(fi), coreInit);
  }

  public static void helicsFederateInfoSetCoreType(SWIGTYPE_p_void fi, int coretype) {
    helicsJNI.helicsFederateInfoSetCoreType(SWIGTYPE_p_void.getCPtr(fi), coretype);
  }

  public static void helicsFederateInfoSetCoreTypeFromString(SWIGTYPE_p_void fi, String coretype) {
    helicsJNI.helicsFederateInfoSetCoreTypeFromString(SWIGTYPE_p_void.getCPtr(fi), coretype);
  }

  public static void helicsFederateInfoSetBroker(SWIGTYPE_p_void fi, String broker) {
    helicsJNI.helicsFederateInfoSetBroker(SWIGTYPE_p_void.getCPtr(fi), broker);
  }

  public static void helicsFederateInfoSetBrokerPort(SWIGTYPE_p_void fi, int brokerPort) {
    helicsJNI.helicsFederateInfoSetBrokerPort(SWIGTYPE_p_void.getCPtr(fi), brokerPort);
  }

  public static void helicsFederateInfoSetLocalPort(SWIGTYPE_p_void fi, String localPort) {
    helicsJNI.helicsFederateInfoSetLocalPort(SWIGTYPE_p_void.getCPtr(fi), localPort);
  }

  public static int helicsGetPropertyIndex(String val) {
    return helicsJNI.helicsGetPropertyIndex(val);
  }

  public static void helicsFederateInfoSetFlagOption(SWIGTYPE_p_void fi, int flag, int value) {
    helicsJNI.helicsFederateInfoSetFlagOption(SWIGTYPE_p_void.getCPtr(fi), flag, value);
  }

  public static void helicsFederateInfoSetSeparator(SWIGTYPE_p_void fi, char separator) {
    helicsJNI.helicsFederateInfoSetSeparator(SWIGTYPE_p_void.getCPtr(fi), separator);
  }

  public static void helicsFederateInfoSetTimeProperty(SWIGTYPE_p_void fi, int timeProperty, double propertyValue) {
    helicsJNI.helicsFederateInfoSetTimeProperty(SWIGTYPE_p_void.getCPtr(fi), timeProperty, propertyValue);
  }

  public static void helicsFederateInfoSetIntegerProperty(SWIGTYPE_p_void fi, int intProperty, int propertyValue) {
    helicsJNI.helicsFederateInfoSetIntegerProperty(SWIGTYPE_p_void.getCPtr(fi), intProperty, propertyValue);
  }

  public static void helicsFederateRegisterInterfaces(SWIGTYPE_p_void fed, String file) {
    helicsJNI.helicsFederateRegisterInterfaces(SWIGTYPE_p_void.getCPtr(fed), file);
  }

  public static void helicsFederateFinalize(SWIGTYPE_p_void fed) {
    helicsJNI.helicsFederateFinalize(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static void helicsFederateFree(SWIGTYPE_p_void fed) {
    helicsJNI.helicsFederateFree(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static void helicsCloseLibrary() {
    helicsJNI.helicsCloseLibrary();
  }

  public static void helicsFederateEnterInitializingMode(SWIGTYPE_p_void fed) {
    helicsJNI.helicsFederateEnterInitializingMode(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static void helicsFederateEnterInitializingModeAsync(SWIGTYPE_p_void fed) {
    helicsJNI.helicsFederateEnterInitializingModeAsync(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static int helicsFederateIsAsyncOperationCompleted(SWIGTYPE_p_void fed) {
    return helicsJNI.helicsFederateIsAsyncOperationCompleted(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static void helicsFederateEnterInitializingModeComplete(SWIGTYPE_p_void fed) {
    helicsJNI.helicsFederateEnterInitializingModeComplete(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static void helicsFederateEnterExecutingMode(SWIGTYPE_p_void fed) {
    helicsJNI.helicsFederateEnterExecutingMode(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static void helicsFederateEnterExecutingModeAsync(SWIGTYPE_p_void fed) {
    helicsJNI.helicsFederateEnterExecutingModeAsync(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static void helicsFederateEnterExecutingModeComplete(SWIGTYPE_p_void fed) {
    helicsJNI.helicsFederateEnterExecutingModeComplete(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static helics_iteration_result helicsFederateEnterExecutingModeIterative(SWIGTYPE_p_void fed, helics_iteration_request iterate) {
    return helics_iteration_result.swigToEnum(helicsJNI.helicsFederateEnterExecutingModeIterative(SWIGTYPE_p_void.getCPtr(fed), iterate.swigValue()));
  }

  public static void helicsFederateEnterExecutingModeIterativeAsync(SWIGTYPE_p_void fed, helics_iteration_request iterate) {
    helicsJNI.helicsFederateEnterExecutingModeIterativeAsync(SWIGTYPE_p_void.getCPtr(fed), iterate.swigValue());
  }

  public static helics_iteration_result helicsFederateEnterExecutingModeIterativeComplete(SWIGTYPE_p_void fed) {
    return helics_iteration_result.swigToEnum(helicsJNI.helicsFederateEnterExecutingModeIterativeComplete(SWIGTYPE_p_void.getCPtr(fed)));
  }

  public static helics_federate_state helicsFederateGetState(SWIGTYPE_p_void fed) {
    return helics_federate_state.swigToEnum(helicsJNI.helicsFederateGetState(SWIGTYPE_p_void.getCPtr(fed)));
  }

  public static SWIGTYPE_p_void helicsFederateGetCoreObject(SWIGTYPE_p_void fed) {
    long cPtr = helicsJNI.helicsFederateGetCoreObject(SWIGTYPE_p_void.getCPtr(fed));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static double helicsFederateRequestTime(SWIGTYPE_p_void fed, double requestTime) {
    return helicsJNI.helicsFederateRequestTime(SWIGTYPE_p_void.getCPtr(fed), requestTime);
  }

  public static double helicsFederateRequestNextStep(SWIGTYPE_p_void fed) {
    return helicsJNI.helicsFederateRequestNextStep(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static double helicsFederateRequestTimeIterative(SWIGTYPE_p_void fed, double requestTime, helics_iteration_request iterate, int[] outIterate) {
    return helicsJNI.helicsFederateRequestTimeIterative(SWIGTYPE_p_void.getCPtr(fed), requestTime, iterate.swigValue(), outIterate);
  }

  public static void helicsFederateRequestTimeAsync(SWIGTYPE_p_void fed, double requestTime) {
    helicsJNI.helicsFederateRequestTimeAsync(SWIGTYPE_p_void.getCPtr(fed), requestTime);
  }

  public static double helicsFederateRequestTimeComplete(SWIGTYPE_p_void fed) {
    return helicsJNI.helicsFederateRequestTimeComplete(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static void helicsFederateRequestTimeIterativeAsync(SWIGTYPE_p_void fed, double requestTime, helics_iteration_request iterate) {
    helicsJNI.helicsFederateRequestTimeIterativeAsync(SWIGTYPE_p_void.getCPtr(fed), requestTime, iterate.swigValue());
  }

  public static double helicsFederateRequestTimeIterativeComplete(SWIGTYPE_p_void fed, int[] outIterate) {
    return helicsJNI.helicsFederateRequestTimeIterativeComplete(SWIGTYPE_p_void.getCPtr(fed), outIterate);
  }

  public static String helicsFederateGetName(SWIGTYPE_p_void fed) {
    return helicsJNI.helicsFederateGetName(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static void helicsFederateSetTimeProperty(SWIGTYPE_p_void fed, int timeProperty, double time) {
    helicsJNI.helicsFederateSetTimeProperty(SWIGTYPE_p_void.getCPtr(fed), timeProperty, time);
  }

  public static void helicsFederateSetFlagOption(SWIGTYPE_p_void fed, int flag, int flagValue) {
    helicsJNI.helicsFederateSetFlagOption(SWIGTYPE_p_void.getCPtr(fed), flag, flagValue);
  }

  public static void helicsFederateSetSeparator(SWIGTYPE_p_void fed, char separator) {
    helicsJNI.helicsFederateSetSeparator(SWIGTYPE_p_void.getCPtr(fed), separator);
  }

  public static void helicsFederateSetIntegerProperty(SWIGTYPE_p_void fed, int intProperty, int propertyVal) {
    helicsJNI.helicsFederateSetIntegerProperty(SWIGTYPE_p_void.getCPtr(fed), intProperty, propertyVal);
  }

  public static double helicsFederateGetTimeProperty(SWIGTYPE_p_void fed, int timeProperty) {
    return helicsJNI.helicsFederateGetTimeProperty(SWIGTYPE_p_void.getCPtr(fed), timeProperty);
  }

  public static int helicsFederateGetFlagOption(SWIGTYPE_p_void fed, int flag) {
    return helicsJNI.helicsFederateGetFlagOption(SWIGTYPE_p_void.getCPtr(fed), flag);
  }

  public static int helicsFederateGetIntegerProperty(SWIGTYPE_p_void fed, int intProperty) {
    return helicsJNI.helicsFederateGetIntegerProperty(SWIGTYPE_p_void.getCPtr(fed), intProperty);
  }

  public static double helicsFederateGetCurrentTime(SWIGTYPE_p_void fed) {
    return helicsJNI.helicsFederateGetCurrentTime(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static SWIGTYPE_p_void helicsCreateQuery(String target, String query) {
    long cPtr = helicsJNI.helicsCreateQuery(target, query);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static String helicsQueryExecute(SWIGTYPE_p_void query, SWIGTYPE_p_void fed) {
    return helicsJNI.helicsQueryExecute(SWIGTYPE_p_void.getCPtr(query), SWIGTYPE_p_void.getCPtr(fed));
  }

  public static String helicsQueryCoreExecute(SWIGTYPE_p_void query, SWIGTYPE_p_void core) {
    return helicsJNI.helicsQueryCoreExecute(SWIGTYPE_p_void.getCPtr(query), SWIGTYPE_p_void.getCPtr(core));
  }

  public static String helicsQueryBrokerExecute(SWIGTYPE_p_void query, SWIGTYPE_p_void broker) {
    return helicsJNI.helicsQueryBrokerExecute(SWIGTYPE_p_void.getCPtr(query), SWIGTYPE_p_void.getCPtr(broker));
  }

  public static void helicsQueryExecuteAsync(SWIGTYPE_p_void query, SWIGTYPE_p_void fed) {
    helicsJNI.helicsQueryExecuteAsync(SWIGTYPE_p_void.getCPtr(query), SWIGTYPE_p_void.getCPtr(fed));
  }

  public static String helicsQueryExecuteComplete(SWIGTYPE_p_void query) {
    return helicsJNI.helicsQueryExecuteComplete(SWIGTYPE_p_void.getCPtr(query));
  }

  public static int helicsQueryIsCompleted(SWIGTYPE_p_void query) {
    return helicsJNI.helicsQueryIsCompleted(SWIGTYPE_p_void.getCPtr(query));
  }

  public static void helicsQueryFree(SWIGTYPE_p_void arg0) {
    helicsJNI.helicsQueryFree(SWIGTYPE_p_void.getCPtr(arg0));
  }

  public static void helicsCleanupLibrary() {
    helicsJNI.helicsCleanupLibrary();
  }

  public static SWIGTYPE_p_void helicsFederateRegisterSubscription(SWIGTYPE_p_void fed, String key, String units) {
    long cPtr = helicsJNI.helicsFederateRegisterSubscription(SWIGTYPE_p_void.getCPtr(fed), key, units);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateRegisterPublication(SWIGTYPE_p_void fed, String key, helics_data_type type, String units) {
    long cPtr = helicsJNI.helicsFederateRegisterPublication(SWIGTYPE_p_void.getCPtr(fed), key, type.swigValue(), units);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateRegisterTypePublication(SWIGTYPE_p_void fed, String key, String type, String units) {
    long cPtr = helicsJNI.helicsFederateRegisterTypePublication(SWIGTYPE_p_void.getCPtr(fed), key, type, units);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateRegisterGlobalPublication(SWIGTYPE_p_void fed, String key, helics_data_type type, String units) {
    long cPtr = helicsJNI.helicsFederateRegisterGlobalPublication(SWIGTYPE_p_void.getCPtr(fed), key, type.swigValue(), units);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateRegisterGlobalTypePublication(SWIGTYPE_p_void fed, String key, String type, String units) {
    long cPtr = helicsJNI.helicsFederateRegisterGlobalTypePublication(SWIGTYPE_p_void.getCPtr(fed), key, type, units);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateRegisterInput(SWIGTYPE_p_void fed, String name, helics_data_type type, String units) {
    long cPtr = helicsJNI.helicsFederateRegisterInput(SWIGTYPE_p_void.getCPtr(fed), name, type.swigValue(), units);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateRegisterTypeInput(SWIGTYPE_p_void fed, String key, String type, String units) {
    long cPtr = helicsJNI.helicsFederateRegisterTypeInput(SWIGTYPE_p_void.getCPtr(fed), key, type, units);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateRegisterGlobalInput(SWIGTYPE_p_void fed, String key, helics_data_type type, String units) {
    long cPtr = helicsJNI.helicsFederateRegisterGlobalInput(SWIGTYPE_p_void.getCPtr(fed), key, type.swigValue(), units);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateRegisterGlobalTypeInput(SWIGTYPE_p_void fed, String key, String type, String units) {
    long cPtr = helicsJNI.helicsFederateRegisterGlobalTypeInput(SWIGTYPE_p_void.getCPtr(fed), key, type, units);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateGetPublication(SWIGTYPE_p_void fed, String key) {
    long cPtr = helicsJNI.helicsFederateGetPublication(SWIGTYPE_p_void.getCPtr(fed), key);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateGetPublicationByIndex(SWIGTYPE_p_void fed, int index) {
    long cPtr = helicsJNI.helicsFederateGetPublicationByIndex(SWIGTYPE_p_void.getCPtr(fed), index);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateGetInput(SWIGTYPE_p_void fed, String key) {
    long cPtr = helicsJNI.helicsFederateGetInput(SWIGTYPE_p_void.getCPtr(fed), key);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateGetInputByIndex(SWIGTYPE_p_void fed, int index) {
    long cPtr = helicsJNI.helicsFederateGetInputByIndex(SWIGTYPE_p_void.getCPtr(fed), index);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateGetSubscription(SWIGTYPE_p_void fed, String key) {
    long cPtr = helicsJNI.helicsFederateGetSubscription(SWIGTYPE_p_void.getCPtr(fed), key);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static void helicsPublicationPublishRaw(SWIGTYPE_p_void pub, SWIGTYPE_p_void data, int inputDataLength) {
    helicsJNI.helicsPublicationPublishRaw(SWIGTYPE_p_void.getCPtr(pub), SWIGTYPE_p_void.getCPtr(data), inputDataLength);
  }

  public static void helicsPublicationPublishString(SWIGTYPE_p_void pub, String str) {
    helicsJNI.helicsPublicationPublishString(SWIGTYPE_p_void.getCPtr(pub), str);
  }

  public static void helicsPublicationPublishInteger(SWIGTYPE_p_void pub, long val) {
    helicsJNI.helicsPublicationPublishInteger(SWIGTYPE_p_void.getCPtr(pub), val);
  }

  public static void helicsPublicationPublishBoolean(SWIGTYPE_p_void pub, int val) {
    helicsJNI.helicsPublicationPublishBoolean(SWIGTYPE_p_void.getCPtr(pub), val);
  }

  public static void helicsPublicationPublishDouble(SWIGTYPE_p_void pub, double val) {
    helicsJNI.helicsPublicationPublishDouble(SWIGTYPE_p_void.getCPtr(pub), val);
  }

  public static void helicsPublicationPublishTime(SWIGTYPE_p_void pub, double val) {
    helicsJNI.helicsPublicationPublishTime(SWIGTYPE_p_void.getCPtr(pub), val);
  }

  public static void helicsPublicationPublishChar(SWIGTYPE_p_void pub, char val) {
    helicsJNI.helicsPublicationPublishChar(SWIGTYPE_p_void.getCPtr(pub), val);
  }

  public static void helicsPublicationPublishComplex(SWIGTYPE_p_void pub, double real, double imag) {
    helicsJNI.helicsPublicationPublishComplex(SWIGTYPE_p_void.getCPtr(pub), real, imag);
  }

  public static void helicsPublicationPublishVector(SWIGTYPE_p_void pub, double[] vectorInput, int vectorlength) {
    helicsJNI.helicsPublicationPublishVector(SWIGTYPE_p_void.getCPtr(pub), vectorInput, vectorlength);
  }

  public static void helicsPublicationPublishNamedPoint(SWIGTYPE_p_void pub, String str, double val) {
    helicsJNI.helicsPublicationPublishNamedPoint(SWIGTYPE_p_void.getCPtr(pub), str, val);
  }

  public static void helicsPublicationAddTarget(SWIGTYPE_p_void pub, String target) {
    helicsJNI.helicsPublicationAddTarget(SWIGTYPE_p_void.getCPtr(pub), target);
  }

  public static void helicsInputAddTarget(SWIGTYPE_p_void ipt, String target) {
    helicsJNI.helicsInputAddTarget(SWIGTYPE_p_void.getCPtr(ipt), target);
  }

  public static int helicsInputGetRawValueSize(SWIGTYPE_p_void ipt) {
    return helicsJNI.helicsInputGetRawValueSize(SWIGTYPE_p_void.getCPtr(ipt));
  }

  public static void helicsInputGetRawValue(SWIGTYPE_p_void ipt, SWIGTYPE_p_void data, int maxlen, int[] actualSize) {
    helicsJNI.helicsInputGetRawValue(SWIGTYPE_p_void.getCPtr(ipt), SWIGTYPE_p_void.getCPtr(data), maxlen, actualSize);
  }

  public static int helicsInputGetStringSize(SWIGTYPE_p_void ipt) {
    return helicsJNI.helicsInputGetStringSize(SWIGTYPE_p_void.getCPtr(ipt));
  }

  public static void helicsInputGetString(SWIGTYPE_p_void ipt, byte[] outputString, int[] actualLength) {
    helicsJNI.helicsInputGetString(SWIGTYPE_p_void.getCPtr(ipt), outputString, actualLength);
  }

  public static long helicsInputGetInteger(SWIGTYPE_p_void ipt) {
    return helicsJNI.helicsInputGetInteger(SWIGTYPE_p_void.getCPtr(ipt));
  }

  public static int helicsInputGetBoolean(SWIGTYPE_p_void ipt) {
    return helicsJNI.helicsInputGetBoolean(SWIGTYPE_p_void.getCPtr(ipt));
  }

  public static double helicsInputGetDouble(SWIGTYPE_p_void ipt) {
    return helicsJNI.helicsInputGetDouble(SWIGTYPE_p_void.getCPtr(ipt));
  }

  public static double helicsInputGetTime(SWIGTYPE_p_void ipt) {
    return helicsJNI.helicsInputGetTime(SWIGTYPE_p_void.getCPtr(ipt));
  }

  public static char helicsInputGetChar(SWIGTYPE_p_void ipt) {
    return helicsJNI.helicsInputGetChar(SWIGTYPE_p_void.getCPtr(ipt));
  }

  public static helics_complex helicsInputGetComplexObject(SWIGTYPE_p_void ipt) {
    return new helics_complex(helicsJNI.helicsInputGetComplexObject(SWIGTYPE_p_void.getCPtr(ipt)), true);
  }

  public static void helicsInputGetComplex(SWIGTYPE_p_void ipt, double[] real, double[] imag) {
    helicsJNI.helicsInputGetComplex(SWIGTYPE_p_void.getCPtr(ipt), real, imag);
  }

  public static int helicsInputGetVectorSize(SWIGTYPE_p_void ipt) {
    return helicsJNI.helicsInputGetVectorSize(SWIGTYPE_p_void.getCPtr(ipt));
  }

  public static void helicsInputGetVector(SWIGTYPE_p_void ipt, SWIGTYPE_p_double data, int maxlen, int[] actualSize) {
    helicsJNI.helicsInputGetVector(SWIGTYPE_p_void.getCPtr(ipt), SWIGTYPE_p_double.getCPtr(data), maxlen, actualSize);
  }

  public static void helicsInputGetNamedPoint(SWIGTYPE_p_void ipt, byte[] outputString, int[] actualLength, double[] val) {
    helicsJNI.helicsInputGetNamedPoint(SWIGTYPE_p_void.getCPtr(ipt), outputString, actualLength, val);
  }

  public static void helicsInputSetDefaultRaw(SWIGTYPE_p_void ipt, SWIGTYPE_p_void data, int inputDataLength) {
    helicsJNI.helicsInputSetDefaultRaw(SWIGTYPE_p_void.getCPtr(ipt), SWIGTYPE_p_void.getCPtr(data), inputDataLength);
  }

  public static void helicsInputSetDefaultString(SWIGTYPE_p_void ipt, String str) {
    helicsJNI.helicsInputSetDefaultString(SWIGTYPE_p_void.getCPtr(ipt), str);
  }

  public static void helicsInputSetDefaultInteger(SWIGTYPE_p_void ipt, long val) {
    helicsJNI.helicsInputSetDefaultInteger(SWIGTYPE_p_void.getCPtr(ipt), val);
  }

  public static void helicsInputSetDefaultBoolean(SWIGTYPE_p_void ipt, int val) {
    helicsJNI.helicsInputSetDefaultBoolean(SWIGTYPE_p_void.getCPtr(ipt), val);
  }

  public static void helicsInputSetDefaultTime(SWIGTYPE_p_void ipt, double val) {
    helicsJNI.helicsInputSetDefaultTime(SWIGTYPE_p_void.getCPtr(ipt), val);
  }

  public static void helicsInputSetDefaultChar(SWIGTYPE_p_void ipt, char val) {
    helicsJNI.helicsInputSetDefaultChar(SWIGTYPE_p_void.getCPtr(ipt), val);
  }

  public static void helicsInputSetDefaultDouble(SWIGTYPE_p_void ipt, double val) {
    helicsJNI.helicsInputSetDefaultDouble(SWIGTYPE_p_void.getCPtr(ipt), val);
  }

  public static void helicsInputSetDefaultComplex(SWIGTYPE_p_void ipt, double real, double imag) {
    helicsJNI.helicsInputSetDefaultComplex(SWIGTYPE_p_void.getCPtr(ipt), real, imag);
  }

  public static void helicsInputSetDefaultVector(SWIGTYPE_p_void ipt, double[] vectorInput, int vectorlength) {
    helicsJNI.helicsInputSetDefaultVector(SWIGTYPE_p_void.getCPtr(ipt), vectorInput, vectorlength);
  }

  public static void helicsInputSetDefaultNamedPoint(SWIGTYPE_p_void ipt, String str, double val) {
    helicsJNI.helicsInputSetDefaultNamedPoint(SWIGTYPE_p_void.getCPtr(ipt), str, val);
  }

  public static String helicsInputGetType(SWIGTYPE_p_void ipt) {
    return helicsJNI.helicsInputGetType(SWIGTYPE_p_void.getCPtr(ipt));
  }

  public static String helicsPublicationGetType(SWIGTYPE_p_void pub) {
    return helicsJNI.helicsPublicationGetType(SWIGTYPE_p_void.getCPtr(pub));
  }

  public static String helicsInputGetKey(SWIGTYPE_p_void ipt) {
    return helicsJNI.helicsInputGetKey(SWIGTYPE_p_void.getCPtr(ipt));
  }

  public static String helicsSubscriptionGetKey(SWIGTYPE_p_void sub) {
    return helicsJNI.helicsSubscriptionGetKey(SWIGTYPE_p_void.getCPtr(sub));
  }

  public static String helicsPublicationGetKey(SWIGTYPE_p_void pub) {
    return helicsJNI.helicsPublicationGetKey(SWIGTYPE_p_void.getCPtr(pub));
  }

  public static String helicsInputGetUnits(SWIGTYPE_p_void ipt) {
    return helicsJNI.helicsInputGetUnits(SWIGTYPE_p_void.getCPtr(ipt));
  }

  public static String helicsPublicationGetUnits(SWIGTYPE_p_void pub) {
    return helicsJNI.helicsPublicationGetUnits(SWIGTYPE_p_void.getCPtr(pub));
  }

  public static String helicsInputGetInfo(SWIGTYPE_p_void inp) {
    return helicsJNI.helicsInputGetInfo(SWIGTYPE_p_void.getCPtr(inp));
  }

  public static void helicsInputSetInfo(SWIGTYPE_p_void inp, String info) {
    helicsJNI.helicsInputSetInfo(SWIGTYPE_p_void.getCPtr(inp), info);
  }

  public static String helicsPublicationGetInfo(SWIGTYPE_p_void pub) {
    return helicsJNI.helicsPublicationGetInfo(SWIGTYPE_p_void.getCPtr(pub));
  }

  public static void helicsPublicationSetInfo(SWIGTYPE_p_void pub, String info) {
    helicsJNI.helicsPublicationSetInfo(SWIGTYPE_p_void.getCPtr(pub), info);
  }

  public static int helicsInputIsUpdated(SWIGTYPE_p_void ipt) {
    return helicsJNI.helicsInputIsUpdated(SWIGTYPE_p_void.getCPtr(ipt));
  }

  public static double helicsInputLastUpdateTime(SWIGTYPE_p_void ipt) {
    return helicsJNI.helicsInputLastUpdateTime(SWIGTYPE_p_void.getCPtr(ipt));
  }

  public static int helicsFederateGetPublicationCount(SWIGTYPE_p_void fed) {
    return helicsJNI.helicsFederateGetPublicationCount(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static int helicsFederateGetInputCount(SWIGTYPE_p_void fed) {
    return helicsJNI.helicsFederateGetInputCount(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static SWIGTYPE_p_void helicsFederateRegisterEndpoint(SWIGTYPE_p_void fed, String name, String type) {
    long cPtr = helicsJNI.helicsFederateRegisterEndpoint(SWIGTYPE_p_void.getCPtr(fed), name, type);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateRegisterGlobalEndpoint(SWIGTYPE_p_void fed, String name, String type) {
    long cPtr = helicsJNI.helicsFederateRegisterGlobalEndpoint(SWIGTYPE_p_void.getCPtr(fed), name, type);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateGetEndpoint(SWIGTYPE_p_void fed, String name) {
    long cPtr = helicsJNI.helicsFederateGetEndpoint(SWIGTYPE_p_void.getCPtr(fed), name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateGetEndpointByIndex(SWIGTYPE_p_void fed, int index) {
    long cPtr = helicsJNI.helicsFederateGetEndpointByIndex(SWIGTYPE_p_void.getCPtr(fed), index);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static void helicsEndpointSetDefaultDestination(SWIGTYPE_p_void endpoint, String dest) {
    helicsJNI.helicsEndpointSetDefaultDestination(SWIGTYPE_p_void.getCPtr(endpoint), dest);
  }

  public static void helicsEndpointSendMessageRaw(SWIGTYPE_p_void endpoint, String dest, SWIGTYPE_p_void data, int inputDataLength) {
    helicsJNI.helicsEndpointSendMessageRaw(SWIGTYPE_p_void.getCPtr(endpoint), dest, SWIGTYPE_p_void.getCPtr(data), inputDataLength);
  }

  public static void helicsEndpointSendEventRaw(SWIGTYPE_p_void endpoint, String dest, SWIGTYPE_p_void data, int inputDataLength, double time) {
    helicsJNI.helicsEndpointSendEventRaw(SWIGTYPE_p_void.getCPtr(endpoint), dest, SWIGTYPE_p_void.getCPtr(data), inputDataLength, time);
  }

  public static void helicsEndpointSendMessage(SWIGTYPE_p_void endpoint, helics_message message) {
    helicsJNI.helicsEndpointSendMessage(SWIGTYPE_p_void.getCPtr(endpoint), helics_message.getCPtr(message), message);
  }

  public static void helicsEndpointSubscribe(SWIGTYPE_p_void endpoint, String key) {
    helicsJNI.helicsEndpointSubscribe(SWIGTYPE_p_void.getCPtr(endpoint), key);
  }

  public static int helicsFederateHasMessage(SWIGTYPE_p_void fed) {
    return helicsJNI.helicsFederateHasMessage(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static int helicsEndpointHasMessage(SWIGTYPE_p_void endpoint) {
    return helicsJNI.helicsEndpointHasMessage(SWIGTYPE_p_void.getCPtr(endpoint));
  }

  public static int helicsFederatePendingMessages(SWIGTYPE_p_void fed) {
    return helicsJNI.helicsFederatePendingMessages(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static int helicsEndpointPendingMessages(SWIGTYPE_p_void endpoint) {
    return helicsJNI.helicsEndpointPendingMessages(SWIGTYPE_p_void.getCPtr(endpoint));
  }

  public static helics_message helicsEndpointGetMessage(SWIGTYPE_p_void endpoint) {
    return new helics_message(helicsJNI.helicsEndpointGetMessage(SWIGTYPE_p_void.getCPtr(endpoint)), true);
  }

  public static helics_message helicsFederateGetMessage(SWIGTYPE_p_void fed) {
    return new helics_message(helicsJNI.helicsFederateGetMessage(SWIGTYPE_p_void.getCPtr(fed)), true);
  }

  public static String helicsEndpointGetType(SWIGTYPE_p_void endpoint) {
    return helicsJNI.helicsEndpointGetType(SWIGTYPE_p_void.getCPtr(endpoint));
  }

  public static String helicsEndpointGetName(SWIGTYPE_p_void endpoint) {
    return helicsJNI.helicsEndpointGetName(SWIGTYPE_p_void.getCPtr(endpoint));
  }

  public static int helicsFederateGetEndpointCount(SWIGTYPE_p_void fed) {
    return helicsJNI.helicsFederateGetEndpointCount(SWIGTYPE_p_void.getCPtr(fed));
  }

  public static String helicsEndpointGetInfo(SWIGTYPE_p_void end) {
    return helicsJNI.helicsEndpointGetInfo(SWIGTYPE_p_void.getCPtr(end));
  }

  public static void helicsEndpointSetInfo(SWIGTYPE_p_void end, String info) {
    helicsJNI.helicsEndpointSetInfo(SWIGTYPE_p_void.getCPtr(end), info);
  }

  public static SWIGTYPE_p_void helicsFederateRegisterFilter(SWIGTYPE_p_void fed, helics_filter_type_t type, String name) {
    long cPtr = helicsJNI.helicsFederateRegisterFilter(SWIGTYPE_p_void.getCPtr(fed), type.swigValue(), name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateRegisterGlobalFilter(SWIGTYPE_p_void fed, helics_filter_type_t type, String name) {
    long cPtr = helicsJNI.helicsFederateRegisterGlobalFilter(SWIGTYPE_p_void.getCPtr(fed), type.swigValue(), name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateRegisterCloningFilter(SWIGTYPE_p_void fed, String deliveryEndpoint) {
    long cPtr = helicsJNI.helicsFederateRegisterCloningFilter(SWIGTYPE_p_void.getCPtr(fed), deliveryEndpoint);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateRegisterGlobalCloningFilter(SWIGTYPE_p_void fed, String deliveryEndpoint) {
    long cPtr = helicsJNI.helicsFederateRegisterGlobalCloningFilter(SWIGTYPE_p_void.getCPtr(fed), deliveryEndpoint);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsCoreRegisterFilter(SWIGTYPE_p_void core, helics_filter_type_t type, String name) {
    long cPtr = helicsJNI.helicsCoreRegisterFilter(SWIGTYPE_p_void.getCPtr(core), type.swigValue(), name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsCoreRegisterCloningFilter(SWIGTYPE_p_void core, String deliveryEndpoint) {
    long cPtr = helicsJNI.helicsCoreRegisterCloningFilter(SWIGTYPE_p_void.getCPtr(core), deliveryEndpoint);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateGetFilter(SWIGTYPE_p_void fed, String name) {
    long cPtr = helicsJNI.helicsFederateGetFilter(SWIGTYPE_p_void.getCPtr(fed), name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void helicsFederateGetFilterByIndex(SWIGTYPE_p_void fed, int index) {
    long cPtr = helicsJNI.helicsFederateGetFilterByIndex(SWIGTYPE_p_void.getCPtr(fed), index);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static String helicsFilterGetName(SWIGTYPE_p_void filt) {
    return helicsJNI.helicsFilterGetName(SWIGTYPE_p_void.getCPtr(filt));
  }

  public static void helicsFilterSet(SWIGTYPE_p_void filt, String property, double val) {
    helicsJNI.helicsFilterSet(SWIGTYPE_p_void.getCPtr(filt), property, val);
  }

  public static void helicsFilterSetString(SWIGTYPE_p_void filt, String property, String val) {
    helicsJNI.helicsFilterSetString(SWIGTYPE_p_void.getCPtr(filt), property, val);
  }

  public static void helicsFilterAddDestinationTarget(SWIGTYPE_p_void filt, String dest) {
    helicsJNI.helicsFilterAddDestinationTarget(SWIGTYPE_p_void.getCPtr(filt), dest);
  }

  public static void helicsFilterAddSourceTarget(SWIGTYPE_p_void filt, String source) {
    helicsJNI.helicsFilterAddSourceTarget(SWIGTYPE_p_void.getCPtr(filt), source);
  }

  public static void helicsFilterAddDeliveryEndpoint(SWIGTYPE_p_void filt, String deliveryEndpoint) {
    helicsJNI.helicsFilterAddDeliveryEndpoint(SWIGTYPE_p_void.getCPtr(filt), deliveryEndpoint);
  }

  public static void helicsFilterRemoveTarget(SWIGTYPE_p_void filt, String dest) {
    helicsJNI.helicsFilterRemoveTarget(SWIGTYPE_p_void.getCPtr(filt), dest);
  }

  public static void helicsFilterRemoveDeliveryEndpoint(SWIGTYPE_p_void filt, String deliveryEndpoint) {
    helicsJNI.helicsFilterRemoveDeliveryEndpoint(SWIGTYPE_p_void.getCPtr(filt), deliveryEndpoint);
  }

  public static String helicsFilterGetInfo(SWIGTYPE_p_void filt) {
    return helicsJNI.helicsFilterGetInfo(SWIGTYPE_p_void.getCPtr(filt));
  }

  public static void helicsFilterSetInfo(SWIGTYPE_p_void filt, String info) {
    helicsJNI.helicsFilterSetInfo(SWIGTYPE_p_void.getCPtr(filt), info);
  }

}
