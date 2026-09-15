/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thoughtspot.client.JSON;

/**
 * ConnectionConfigurationSearchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ConnectionConfigurationSearchRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CONNECTION_IDENTIFIER = "connection_identifier";
  @SerializedName(SERIALIZED_NAME_CONNECTION_IDENTIFIER)
  @javax.annotation.Nonnull
  private String connectionIdentifier;

  public static final String SERIALIZED_NAME_CONFIGURATION_IDENTIFIER = "configuration_identifier";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_IDENTIFIER)
  @javax.annotation.Nullable
  private String configurationIdentifier;

  /**
   * Type of policy.
   */
  @JsonAdapter(PolicyTypeEnum.Adapter.class)
  public enum PolicyTypeEnum {
    NO_POLICY("NO_POLICY"),
    
    PRINCIPALS("PRINCIPALS"),
    
    PROCESSES("PROCESSES");

    private String value;

    PolicyTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PolicyTypeEnum fromValue(String value) {
      for (PolicyTypeEnum b : PolicyTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PolicyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PolicyTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PolicyTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PolicyTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PolicyTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_POLICY_TYPE = "policy_type";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
  @javax.annotation.Nullable
  private PolicyTypeEnum policyType;

  public ConnectionConfigurationSearchRequest() {
  }

  public ConnectionConfigurationSearchRequest connectionIdentifier(@javax.annotation.Nonnull String connectionIdentifier) {
    this.connectionIdentifier = connectionIdentifier;
    return this;
  }

  /**
   * Unique ID or name of the connection.
   * @return connectionIdentifier
   */
  @javax.annotation.Nonnull
  public String getConnectionIdentifier() {
    return connectionIdentifier;
  }

  public void setConnectionIdentifier(@javax.annotation.Nonnull String connectionIdentifier) {
    this.connectionIdentifier = connectionIdentifier;
  }


  public ConnectionConfigurationSearchRequest configurationIdentifier(@javax.annotation.Nullable String configurationIdentifier) {
    this.configurationIdentifier = configurationIdentifier;
    return this;
  }

  /**
   * Unique ID or name of the configuration.
   * @return configurationIdentifier
   */
  @javax.annotation.Nullable
  public String getConfigurationIdentifier() {
    return configurationIdentifier;
  }

  public void setConfigurationIdentifier(@javax.annotation.Nullable String configurationIdentifier) {
    this.configurationIdentifier = configurationIdentifier;
  }


  public ConnectionConfigurationSearchRequest policyType(@javax.annotation.Nullable PolicyTypeEnum policyType) {
    this.policyType = policyType;
    return this;
  }

  /**
   * Type of policy.
   * @return policyType
   */
  @javax.annotation.Nullable
  public PolicyTypeEnum getPolicyType() {
    return policyType;
  }

  public void setPolicyType(@javax.annotation.Nullable PolicyTypeEnum policyType) {
    this.policyType = policyType;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ConnectionConfigurationSearchRequest instance itself
   */
  public ConnectionConfigurationSearchRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionConfigurationSearchRequest connectionConfigurationSearchRequest = (ConnectionConfigurationSearchRequest) o;
    return Objects.equals(this.connectionIdentifier, connectionConfigurationSearchRequest.connectionIdentifier) &&
        Objects.equals(this.configurationIdentifier, connectionConfigurationSearchRequest.configurationIdentifier) &&
        Objects.equals(this.policyType, connectionConfigurationSearchRequest.policyType)&&
        Objects.equals(this.additionalProperties, connectionConfigurationSearchRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionIdentifier, configurationIdentifier, policyType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionConfigurationSearchRequest {\n");
    sb.append("    connectionIdentifier: ").append(toIndentedString(connectionIdentifier)).append("\n");
    sb.append("    configurationIdentifier: ").append(toIndentedString(configurationIdentifier)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("connection_identifier");
    openapiFields.add("configuration_identifier");
    openapiFields.add("policy_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("connection_identifier");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConnectionConfigurationSearchRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConnectionConfigurationSearchRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectionConfigurationSearchRequest is not found in the empty JSON string", ConnectionConfigurationSearchRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConnectionConfigurationSearchRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("connection_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_identifier").toString()));
      }
      if ((jsonObj.get("configuration_identifier") != null && !jsonObj.get("configuration_identifier").isJsonNull()) && !jsonObj.get("configuration_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configuration_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configuration_identifier").toString()));
      }
      if ((jsonObj.get("policy_type") != null && !jsonObj.get("policy_type").isJsonNull()) && !jsonObj.get("policy_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_type").toString()));
      }
      // validate the optional field `policy_type`
      if (jsonObj.get("policy_type") != null && !jsonObj.get("policy_type").isJsonNull()) {
        PolicyTypeEnum.validateJsonElement(jsonObj.get("policy_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectionConfigurationSearchRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectionConfigurationSearchRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectionConfigurationSearchRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectionConfigurationSearchRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectionConfigurationSearchRequest>() {
           @Override
           public void write(JsonWriter out, ConnectionConfigurationSearchRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ConnectionConfigurationSearchRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ConnectionConfigurationSearchRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConnectionConfigurationSearchRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConnectionConfigurationSearchRequest
   * @throws IOException if the JSON string is invalid with respect to ConnectionConfigurationSearchRequest
   */
  public static ConnectionConfigurationSearchRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectionConfigurationSearchRequest.class);
  }

  /**
   * Convert an instance of ConnectionConfigurationSearchRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

