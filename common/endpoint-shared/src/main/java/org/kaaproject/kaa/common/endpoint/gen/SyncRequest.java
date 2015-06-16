/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class SyncRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SyncRequest\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"requestId\",\"type\":\"int\"},{\"name\":\"syncRequestMetaData\",\"type\":[{\"type\":\"record\",\"name\":\"SyncRequestMetaData\",\"fields\":[{\"name\":\"sdkToken\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"endpointPublicKeyHash\",\"type\":[\"bytes\",\"null\"]},{\"name\":\"profileHash\",\"type\":[\"bytes\",\"null\"]},{\"name\":\"timeout\",\"type\":[\"long\",\"null\"]}],\"direction\":\"out\"},\"null\"]},{\"name\":\"bootstrapSyncRequest\",\"type\":[{\"type\":\"record\",\"name\":\"BootstrapSyncRequest\",\"fields\":[{\"name\":\"requestId\",\"type\":\"int\"},{\"name\":\"supportedProtocols\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ProtocolVersionPair\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"version\",\"type\":\"int\"}]}}}],\"direction\":\"out\"},\"null\"]},{\"name\":\"profileSyncRequest\",\"type\":[{\"type\":\"record\",\"name\":\"ProfileSyncRequest\",\"fields\":[{\"name\":\"endpointPublicKey\",\"type\":[\"bytes\",\"null\"]},{\"name\":\"profileBody\",\"type\":\"bytes\"},{\"name\":\"endpointAccessToken\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]}],\"direction\":\"out\"},\"null\"]},{\"name\":\"configurationSyncRequest\",\"type\":[{\"type\":\"record\",\"name\":\"ConfigurationSyncRequest\",\"fields\":[{\"name\":\"appStateSeqNumber\",\"type\":\"int\"},{\"name\":\"configurationHash\",\"type\":[\"bytes\",\"null\"]},{\"name\":\"resyncOnly\",\"type\":[\"boolean\",\"null\"]}],\"direction\":\"out\"},\"null\"]},{\"name\":\"notificationSyncRequest\",\"type\":[{\"type\":\"record\",\"name\":\"NotificationSyncRequest\",\"fields\":[{\"name\":\"appStateSeqNumber\",\"type\":\"int\"},{\"name\":\"topicListHash\",\"type\":[\"bytes\",\"null\"]},{\"name\":\"topicStates\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TopicState\",\"fields\":[{\"name\":\"topicId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"seqNumber\",\"type\":\"int\"}],\"direction\":\"out\"}},\"null\"]},{\"name\":\"acceptedUnicastNotifications\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"null\"]},{\"name\":\"subscriptionCommands\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SubscriptionCommand\",\"fields\":[{\"name\":\"topicId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"command\",\"type\":{\"type\":\"enum\",\"name\":\"SubscriptionCommandType\",\"symbols\":[\"ADD\",\"REMOVE\"]}}],\"direction\":\"out\"}},\"null\"]}],\"direction\":\"out\"},\"null\"]},{\"name\":\"userSyncRequest\",\"type\":[{\"type\":\"record\",\"name\":\"UserSyncRequest\",\"fields\":[{\"name\":\"userAttachRequest\",\"type\":[{\"type\":\"record\",\"name\":\"UserAttachRequest\",\"fields\":[{\"name\":\"userVerifierId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"userExternalId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"userAccessToken\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"direction\":\"out\"},\"null\"]},{\"name\":\"endpointAttachRequests\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"EndpointAttachRequest\",\"fields\":[{\"name\":\"requestId\",\"type\":\"int\"},{\"name\":\"endpointAccessToken\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"direction\":\"out\"}},\"null\"]},{\"name\":\"endpointDetachRequests\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"EndpointDetachRequest\",\"fields\":[{\"name\":\"requestId\",\"type\":\"int\"},{\"name\":\"endpointKeyHash\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"direction\":\"out\"}},\"null\"]}],\"direction\":\"out\"},\"null\"]},{\"name\":\"eventSyncRequest\",\"type\":[{\"type\":\"record\",\"name\":\"EventSyncRequest\",\"fields\":[{\"name\":\"eventSequenceNumberRequest\",\"type\":[{\"type\":\"record\",\"name\":\"EventSequenceNumberRequest\",\"fields\":[],\"direction\":\"out\"},\"null\"]},{\"name\":\"eventListenersRequests\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"EventListenersRequest\",\"fields\":[{\"name\":\"requestId\",\"type\":\"int\"},{\"name\":\"eventClassFQNs\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}],\"direction\":\"out\"}},\"null\"]},{\"name\":\"events\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Event\",\"fields\":[{\"name\":\"seqNum\",\"type\":\"int\"},{\"name\":\"eventClassFQN\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"eventData\",\"type\":\"bytes\"},{\"name\":\"source\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"target\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]}]}},\"null\"]}],\"direction\":\"out\"},\"null\"]},{\"name\":\"logSyncRequest\",\"type\":[{\"type\":\"record\",\"name\":\"LogSyncRequest\",\"fields\":[{\"name\":\"requestId\",\"type\":\"int\"},{\"name\":\"logEntries\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"LogEntry\",\"fields\":[{\"name\":\"data\",\"type\":\"bytes\"}],\"direction\":\"out\"}},\"null\"]}],\"direction\":\"out\"},\"null\"]}],\"direction\":\"out\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private int requestId;
   private org.kaaproject.kaa.common.endpoint.gen.SyncRequestMetaData syncRequestMetaData;
   private org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest bootstrapSyncRequest;
   private org.kaaproject.kaa.common.endpoint.gen.ProfileSyncRequest profileSyncRequest;
   private org.kaaproject.kaa.common.endpoint.gen.ConfigurationSyncRequest configurationSyncRequest;
   private org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest notificationSyncRequest;
   private org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest userSyncRequest;
   private org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest eventSyncRequest;
   private org.kaaproject.kaa.common.endpoint.gen.LogSyncRequest logSyncRequest;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public SyncRequest() {}

  /**
   * All-args constructor.
   */
  public SyncRequest(java.lang.Integer requestId, org.kaaproject.kaa.common.endpoint.gen.SyncRequestMetaData syncRequestMetaData, org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest bootstrapSyncRequest, org.kaaproject.kaa.common.endpoint.gen.ProfileSyncRequest profileSyncRequest, org.kaaproject.kaa.common.endpoint.gen.ConfigurationSyncRequest configurationSyncRequest, org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest notificationSyncRequest, org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest userSyncRequest, org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest eventSyncRequest, org.kaaproject.kaa.common.endpoint.gen.LogSyncRequest logSyncRequest) {
    this.requestId = requestId;
    this.syncRequestMetaData = syncRequestMetaData;
    this.bootstrapSyncRequest = bootstrapSyncRequest;
    this.profileSyncRequest = profileSyncRequest;
    this.configurationSyncRequest = configurationSyncRequest;
    this.notificationSyncRequest = notificationSyncRequest;
    this.userSyncRequest = userSyncRequest;
    this.eventSyncRequest = eventSyncRequest;
    this.logSyncRequest = logSyncRequest;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return requestId;
    case 1: return syncRequestMetaData;
    case 2: return bootstrapSyncRequest;
    case 3: return profileSyncRequest;
    case 4: return configurationSyncRequest;
    case 5: return notificationSyncRequest;
    case 6: return userSyncRequest;
    case 7: return eventSyncRequest;
    case 8: return logSyncRequest;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: requestId = (java.lang.Integer)value$; break;
    case 1: syncRequestMetaData = (org.kaaproject.kaa.common.endpoint.gen.SyncRequestMetaData)value$; break;
    case 2: bootstrapSyncRequest = (org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest)value$; break;
    case 3: profileSyncRequest = (org.kaaproject.kaa.common.endpoint.gen.ProfileSyncRequest)value$; break;
    case 4: configurationSyncRequest = (org.kaaproject.kaa.common.endpoint.gen.ConfigurationSyncRequest)value$; break;
    case 5: notificationSyncRequest = (org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest)value$; break;
    case 6: userSyncRequest = (org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest)value$; break;
    case 7: eventSyncRequest = (org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest)value$; break;
    case 8: logSyncRequest = (org.kaaproject.kaa.common.endpoint.gen.LogSyncRequest)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'requestId' field.
   */
  public java.lang.Integer getRequestId() {
    return requestId;
  }

  /**
   * Sets the value of the 'requestId' field.
   * @param value the value to set.
   */
  public void setRequestId(java.lang.Integer value) {
    this.requestId = value;
  }

  /**
   * Gets the value of the 'syncRequestMetaData' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.SyncRequestMetaData getSyncRequestMetaData() {
    return syncRequestMetaData;
  }

  /**
   * Sets the value of the 'syncRequestMetaData' field.
   * @param value the value to set.
   */
  public void setSyncRequestMetaData(org.kaaproject.kaa.common.endpoint.gen.SyncRequestMetaData value) {
    this.syncRequestMetaData = value;
  }

  /**
   * Gets the value of the 'bootstrapSyncRequest' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest getBootstrapSyncRequest() {
    return bootstrapSyncRequest;
  }

  /**
   * Sets the value of the 'bootstrapSyncRequest' field.
   * @param value the value to set.
   */
  public void setBootstrapSyncRequest(org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest value) {
    this.bootstrapSyncRequest = value;
  }

  /**
   * Gets the value of the 'profileSyncRequest' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.ProfileSyncRequest getProfileSyncRequest() {
    return profileSyncRequest;
  }

  /**
   * Sets the value of the 'profileSyncRequest' field.
   * @param value the value to set.
   */
  public void setProfileSyncRequest(org.kaaproject.kaa.common.endpoint.gen.ProfileSyncRequest value) {
    this.profileSyncRequest = value;
  }

  /**
   * Gets the value of the 'configurationSyncRequest' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.ConfigurationSyncRequest getConfigurationSyncRequest() {
    return configurationSyncRequest;
  }

  /**
   * Sets the value of the 'configurationSyncRequest' field.
   * @param value the value to set.
   */
  public void setConfigurationSyncRequest(org.kaaproject.kaa.common.endpoint.gen.ConfigurationSyncRequest value) {
    this.configurationSyncRequest = value;
  }

  /**
   * Gets the value of the 'notificationSyncRequest' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest getNotificationSyncRequest() {
    return notificationSyncRequest;
  }

  /**
   * Sets the value of the 'notificationSyncRequest' field.
   * @param value the value to set.
   */
  public void setNotificationSyncRequest(org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest value) {
    this.notificationSyncRequest = value;
  }

  /**
   * Gets the value of the 'userSyncRequest' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest getUserSyncRequest() {
    return userSyncRequest;
  }

  /**
   * Sets the value of the 'userSyncRequest' field.
   * @param value the value to set.
   */
  public void setUserSyncRequest(org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest value) {
    this.userSyncRequest = value;
  }

  /**
   * Gets the value of the 'eventSyncRequest' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest getEventSyncRequest() {
    return eventSyncRequest;
  }

  /**
   * Sets the value of the 'eventSyncRequest' field.
   * @param value the value to set.
   */
  public void setEventSyncRequest(org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest value) {
    this.eventSyncRequest = value;
  }

  /**
   * Gets the value of the 'logSyncRequest' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.LogSyncRequest getLogSyncRequest() {
    return logSyncRequest;
  }

  /**
   * Sets the value of the 'logSyncRequest' field.
   * @param value the value to set.
   */
  public void setLogSyncRequest(org.kaaproject.kaa.common.endpoint.gen.LogSyncRequest value) {
    this.logSyncRequest = value;
  }

  /** Creates a new SyncRequest RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder();
  }
  
  /** Creates a new SyncRequest RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder(other);
  }
  
  /** Creates a new SyncRequest RecordBuilder by copying an existing SyncRequest instance */
  public static org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.SyncRequest other) {
    return new org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder(other);
  }
  
  /**
   * RecordBuilder for SyncRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SyncRequest>
    implements org.apache.avro.data.RecordBuilder<SyncRequest> {

    private int requestId;
    private org.kaaproject.kaa.common.endpoint.gen.SyncRequestMetaData syncRequestMetaData;
    private org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest bootstrapSyncRequest;
    private org.kaaproject.kaa.common.endpoint.gen.ProfileSyncRequest profileSyncRequest;
    private org.kaaproject.kaa.common.endpoint.gen.ConfigurationSyncRequest configurationSyncRequest;
    private org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest notificationSyncRequest;
    private org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest userSyncRequest;
    private org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest eventSyncRequest;
    private org.kaaproject.kaa.common.endpoint.gen.LogSyncRequest logSyncRequest;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.SyncRequest.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.requestId)) {
        this.requestId = data().deepCopy(fields()[0].schema(), other.requestId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.syncRequestMetaData)) {
        this.syncRequestMetaData = data().deepCopy(fields()[1].schema(), other.syncRequestMetaData);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.bootstrapSyncRequest)) {
        this.bootstrapSyncRequest = data().deepCopy(fields()[2].schema(), other.bootstrapSyncRequest);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.profileSyncRequest)) {
        this.profileSyncRequest = data().deepCopy(fields()[3].schema(), other.profileSyncRequest);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.configurationSyncRequest)) {
        this.configurationSyncRequest = data().deepCopy(fields()[4].schema(), other.configurationSyncRequest);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.notificationSyncRequest)) {
        this.notificationSyncRequest = data().deepCopy(fields()[5].schema(), other.notificationSyncRequest);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.userSyncRequest)) {
        this.userSyncRequest = data().deepCopy(fields()[6].schema(), other.userSyncRequest);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.eventSyncRequest)) {
        this.eventSyncRequest = data().deepCopy(fields()[7].schema(), other.eventSyncRequest);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.logSyncRequest)) {
        this.logSyncRequest = data().deepCopy(fields()[8].schema(), other.logSyncRequest);
        fieldSetFlags()[8] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SyncRequest instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.SyncRequest other) {
            super(org.kaaproject.kaa.common.endpoint.gen.SyncRequest.SCHEMA$);
      if (isValidValue(fields()[0], other.requestId)) {
        this.requestId = data().deepCopy(fields()[0].schema(), other.requestId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.syncRequestMetaData)) {
        this.syncRequestMetaData = data().deepCopy(fields()[1].schema(), other.syncRequestMetaData);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.bootstrapSyncRequest)) {
        this.bootstrapSyncRequest = data().deepCopy(fields()[2].schema(), other.bootstrapSyncRequest);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.profileSyncRequest)) {
        this.profileSyncRequest = data().deepCopy(fields()[3].schema(), other.profileSyncRequest);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.configurationSyncRequest)) {
        this.configurationSyncRequest = data().deepCopy(fields()[4].schema(), other.configurationSyncRequest);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.notificationSyncRequest)) {
        this.notificationSyncRequest = data().deepCopy(fields()[5].schema(), other.notificationSyncRequest);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.userSyncRequest)) {
        this.userSyncRequest = data().deepCopy(fields()[6].schema(), other.userSyncRequest);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.eventSyncRequest)) {
        this.eventSyncRequest = data().deepCopy(fields()[7].schema(), other.eventSyncRequest);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.logSyncRequest)) {
        this.logSyncRequest = data().deepCopy(fields()[8].schema(), other.logSyncRequest);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'requestId' field */
    public java.lang.Integer getRequestId() {
      return requestId;
    }
    
    /** Sets the value of the 'requestId' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder setRequestId(int value) {
      validate(fields()[0], value);
      this.requestId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'requestId' field has been set */
    public boolean hasRequestId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'requestId' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder clearRequestId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'syncRequestMetaData' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequestMetaData getSyncRequestMetaData() {
      return syncRequestMetaData;
    }
    
    /** Sets the value of the 'syncRequestMetaData' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder setSyncRequestMetaData(org.kaaproject.kaa.common.endpoint.gen.SyncRequestMetaData value) {
      validate(fields()[1], value);
      this.syncRequestMetaData = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'syncRequestMetaData' field has been set */
    public boolean hasSyncRequestMetaData() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'syncRequestMetaData' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder clearSyncRequestMetaData() {
      syncRequestMetaData = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'bootstrapSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest getBootstrapSyncRequest() {
      return bootstrapSyncRequest;
    }
    
    /** Sets the value of the 'bootstrapSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder setBootstrapSyncRequest(org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest value) {
      validate(fields()[2], value);
      this.bootstrapSyncRequest = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'bootstrapSyncRequest' field has been set */
    public boolean hasBootstrapSyncRequest() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'bootstrapSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder clearBootstrapSyncRequest() {
      bootstrapSyncRequest = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'profileSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.ProfileSyncRequest getProfileSyncRequest() {
      return profileSyncRequest;
    }
    
    /** Sets the value of the 'profileSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder setProfileSyncRequest(org.kaaproject.kaa.common.endpoint.gen.ProfileSyncRequest value) {
      validate(fields()[3], value);
      this.profileSyncRequest = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'profileSyncRequest' field has been set */
    public boolean hasProfileSyncRequest() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'profileSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder clearProfileSyncRequest() {
      profileSyncRequest = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'configurationSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.ConfigurationSyncRequest getConfigurationSyncRequest() {
      return configurationSyncRequest;
    }
    
    /** Sets the value of the 'configurationSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder setConfigurationSyncRequest(org.kaaproject.kaa.common.endpoint.gen.ConfigurationSyncRequest value) {
      validate(fields()[4], value);
      this.configurationSyncRequest = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'configurationSyncRequest' field has been set */
    public boolean hasConfigurationSyncRequest() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'configurationSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder clearConfigurationSyncRequest() {
      configurationSyncRequest = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'notificationSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest getNotificationSyncRequest() {
      return notificationSyncRequest;
    }
    
    /** Sets the value of the 'notificationSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder setNotificationSyncRequest(org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest value) {
      validate(fields()[5], value);
      this.notificationSyncRequest = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'notificationSyncRequest' field has been set */
    public boolean hasNotificationSyncRequest() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'notificationSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder clearNotificationSyncRequest() {
      notificationSyncRequest = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'userSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest getUserSyncRequest() {
      return userSyncRequest;
    }
    
    /** Sets the value of the 'userSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder setUserSyncRequest(org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest value) {
      validate(fields()[6], value);
      this.userSyncRequest = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'userSyncRequest' field has been set */
    public boolean hasUserSyncRequest() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'userSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder clearUserSyncRequest() {
      userSyncRequest = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'eventSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest getEventSyncRequest() {
      return eventSyncRequest;
    }
    
    /** Sets the value of the 'eventSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder setEventSyncRequest(org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest value) {
      validate(fields()[7], value);
      this.eventSyncRequest = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'eventSyncRequest' field has been set */
    public boolean hasEventSyncRequest() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'eventSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder clearEventSyncRequest() {
      eventSyncRequest = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'logSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.LogSyncRequest getLogSyncRequest() {
      return logSyncRequest;
    }
    
    /** Sets the value of the 'logSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder setLogSyncRequest(org.kaaproject.kaa.common.endpoint.gen.LogSyncRequest value) {
      validate(fields()[8], value);
      this.logSyncRequest = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'logSyncRequest' field has been set */
    public boolean hasLogSyncRequest() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'logSyncRequest' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncRequest.Builder clearLogSyncRequest() {
      logSyncRequest = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public SyncRequest build() {
      try {
        SyncRequest record = new SyncRequest();
        record.requestId = fieldSetFlags()[0] ? this.requestId : (java.lang.Integer) defaultValue(fields()[0]);
        record.syncRequestMetaData = fieldSetFlags()[1] ? this.syncRequestMetaData : (org.kaaproject.kaa.common.endpoint.gen.SyncRequestMetaData) defaultValue(fields()[1]);
        record.bootstrapSyncRequest = fieldSetFlags()[2] ? this.bootstrapSyncRequest : (org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest) defaultValue(fields()[2]);
        record.profileSyncRequest = fieldSetFlags()[3] ? this.profileSyncRequest : (org.kaaproject.kaa.common.endpoint.gen.ProfileSyncRequest) defaultValue(fields()[3]);
        record.configurationSyncRequest = fieldSetFlags()[4] ? this.configurationSyncRequest : (org.kaaproject.kaa.common.endpoint.gen.ConfigurationSyncRequest) defaultValue(fields()[4]);
        record.notificationSyncRequest = fieldSetFlags()[5] ? this.notificationSyncRequest : (org.kaaproject.kaa.common.endpoint.gen.NotificationSyncRequest) defaultValue(fields()[5]);
        record.userSyncRequest = fieldSetFlags()[6] ? this.userSyncRequest : (org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest) defaultValue(fields()[6]);
        record.eventSyncRequest = fieldSetFlags()[7] ? this.eventSyncRequest : (org.kaaproject.kaa.common.endpoint.gen.EventSyncRequest) defaultValue(fields()[7]);
        record.logSyncRequest = fieldSetFlags()[8] ? this.logSyncRequest : (org.kaaproject.kaa.common.endpoint.gen.LogSyncRequest) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
