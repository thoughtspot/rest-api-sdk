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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * CreateConnectionConfigurationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class CreateConnectionConfigurationRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_CONNECTION_IDENTIFIER = "connection_identifier";
  @SerializedName(SERIALIZED_NAME_CONNECTION_IDENTIFIER)
  @javax.annotation.Nonnull
  private String connectionIdentifier;

  /**
   * Type of authentication used for the connection.
   */
  @JsonAdapter(AuthenticationTypeEnum.Adapter.class)
  public enum AuthenticationTypeEnum {
    SERVICE_ACCOUNT("SERVICE_ACCOUNT"),
    
    KEY_PAIR("KEY_PAIR"),
    
    PERSONAL_ACCESS_TOKEN("PERSONAL_ACCESS_TOKEN"),
    
    OAUTH_WITH_SERVICE_PRINCIPAL("OAUTH_WITH_SERVICE_PRINCIPAL"),
    
    OAUTH_CLIENT_CREDENTIALS("OAUTH_CLIENT_CREDENTIALS");

    private String value;

    AuthenticationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthenticationTypeEnum fromValue(String value) {
      for (AuthenticationTypeEnum b : AuthenticationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthenticationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthenticationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthenticationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthenticationTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AuthenticationTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_AUTHENTICATION_TYPE = "authentication_type";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_TYPE)
  @javax.annotation.Nullable
  private AuthenticationTypeEnum authenticationType = AuthenticationTypeEnum.SERVICE_ACCOUNT;

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  @javax.annotation.Nonnull
  private Object _configuration;

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
  private PolicyTypeEnum policyType = PolicyTypeEnum.NO_POLICY;

  public static final String SERIALIZED_NAME_POLICY_PRINCIPALS = "policy_principals";
  @SerializedName(SERIALIZED_NAME_POLICY_PRINCIPALS)
  @javax.annotation.Nullable
  private List<String> policyPrincipals;

  /**
   * Gets or Sets policyProcesses
   */
  @JsonAdapter(PolicyProcessesEnum.Adapter.class)
  public enum PolicyProcessesEnum {
    SAGE_INDEXING("SAGE_INDEXING"),
    
    ROW_COUNT_STATS("ROW_COUNT_STATS");

    private String value;

    PolicyProcessesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PolicyProcessesEnum fromValue(String value) {
      for (PolicyProcessesEnum b : PolicyProcessesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PolicyProcessesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PolicyProcessesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PolicyProcessesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PolicyProcessesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PolicyProcessesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_POLICY_PROCESSES = "policy_processes";
  @SerializedName(SERIALIZED_NAME_POLICY_PROCESSES)
  @javax.annotation.Nullable
  private List<PolicyProcessesEnum> policyProcesses;

  public CreateConnectionConfigurationRequest() {
  }

  public CreateConnectionConfigurationRequest name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique name for the configuration.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public CreateConnectionConfigurationRequest description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the configuration.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public CreateConnectionConfigurationRequest connectionIdentifier(@javax.annotation.Nonnull String connectionIdentifier) {
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


  public CreateConnectionConfigurationRequest authenticationType(@javax.annotation.Nullable AuthenticationTypeEnum authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

  /**
   * Type of authentication used for the connection.
   * @return authenticationType
   */
  @javax.annotation.Nullable
  public AuthenticationTypeEnum getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(@javax.annotation.Nullable AuthenticationTypeEnum authenticationType) {
    this.authenticationType = authenticationType;
  }


  public CreateConnectionConfigurationRequest _configuration(@javax.annotation.Nonnull Object _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * Configuration properties in JSON.
   * @return _configuration
   */
  @javax.annotation.Nonnull
  public Object getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(@javax.annotation.Nonnull Object _configuration) {
    this._configuration = _configuration;
  }


  public CreateConnectionConfigurationRequest policyType(@javax.annotation.Nullable PolicyTypeEnum policyType) {
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


  public CreateConnectionConfigurationRequest policyPrincipals(@javax.annotation.Nullable List<String> policyPrincipals) {
    this.policyPrincipals = policyPrincipals;
    return this;
  }

  public CreateConnectionConfigurationRequest addPolicyPrincipalsItem(String policyPrincipalsItem) {
    if (this.policyPrincipals == null) {
      this.policyPrincipals = new ArrayList<>();
    }
    this.policyPrincipals.add(policyPrincipalsItem);
    return this;
  }

  /**
   * Unique ID or name of the User and User Groups.
   * @return policyPrincipals
   */
  @javax.annotation.Nullable
  public List<String> getPolicyPrincipals() {
    return policyPrincipals;
  }

  public void setPolicyPrincipals(@javax.annotation.Nullable List<String> policyPrincipals) {
    this.policyPrincipals = policyPrincipals;
  }


  public CreateConnectionConfigurationRequest policyProcesses(@javax.annotation.Nullable List<PolicyProcessesEnum> policyProcesses) {
    this.policyProcesses = policyProcesses;
    return this;
  }

  public CreateConnectionConfigurationRequest addPolicyProcessesItem(PolicyProcessesEnum policyProcessesItem) {
    if (this.policyProcesses == null) {
      this.policyProcesses = new ArrayList<>();
    }
    this.policyProcesses.add(policyProcessesItem);
    return this;
  }

  /**
   * Action that the query performed on the data warehouse, such as SAGE_INDEXING and ROW_COUNT_STATS.
   * @return policyProcesses
   */
  @javax.annotation.Nullable
  public List<PolicyProcessesEnum> getPolicyProcesses() {
    return policyProcesses;
  }

  public void setPolicyProcesses(@javax.annotation.Nullable List<PolicyProcessesEnum> policyProcesses) {
    this.policyProcesses = policyProcesses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConnectionConfigurationRequest createConnectionConfigurationRequest = (CreateConnectionConfigurationRequest) o;
    return Objects.equals(this.name, createConnectionConfigurationRequest.name) &&
        Objects.equals(this.description, createConnectionConfigurationRequest.description) &&
        Objects.equals(this.connectionIdentifier, createConnectionConfigurationRequest.connectionIdentifier) &&
        Objects.equals(this.authenticationType, createConnectionConfigurationRequest.authenticationType) &&
        Objects.equals(this._configuration, createConnectionConfigurationRequest._configuration) &&
        Objects.equals(this.policyType, createConnectionConfigurationRequest.policyType) &&
        Objects.equals(this.policyPrincipals, createConnectionConfigurationRequest.policyPrincipals) &&
        Objects.equals(this.policyProcesses, createConnectionConfigurationRequest.policyProcesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, connectionIdentifier, authenticationType, _configuration, policyType, policyPrincipals, policyProcesses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConnectionConfigurationRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    connectionIdentifier: ").append(toIndentedString(connectionIdentifier)).append("\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    policyPrincipals: ").append(toIndentedString(policyPrincipals)).append("\n");
    sb.append("    policyProcesses: ").append(toIndentedString(policyProcesses)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("connection_identifier");
    openapiFields.add("authentication_type");
    openapiFields.add("configuration");
    openapiFields.add("policy_type");
    openapiFields.add("policy_principals");
    openapiFields.add("policy_processes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("connection_identifier");
    openapiRequiredFields.add("configuration");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateConnectionConfigurationRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateConnectionConfigurationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateConnectionConfigurationRequest is not found in the empty JSON string", CreateConnectionConfigurationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateConnectionConfigurationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateConnectionConfigurationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateConnectionConfigurationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("connection_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_identifier").toString()));
      }
      if ((jsonObj.get("authentication_type") != null && !jsonObj.get("authentication_type").isJsonNull()) && !jsonObj.get("authentication_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authentication_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authentication_type").toString()));
      }
      // validate the optional field `authentication_type`
      if (jsonObj.get("authentication_type") != null && !jsonObj.get("authentication_type").isJsonNull()) {
        AuthenticationTypeEnum.validateJsonElement(jsonObj.get("authentication_type"));
      }
      if ((jsonObj.get("policy_type") != null && !jsonObj.get("policy_type").isJsonNull()) && !jsonObj.get("policy_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_type").toString()));
      }
      // validate the optional field `policy_type`
      if (jsonObj.get("policy_type") != null && !jsonObj.get("policy_type").isJsonNull()) {
        PolicyTypeEnum.validateJsonElement(jsonObj.get("policy_type"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("policy_principals") != null && !jsonObj.get("policy_principals").isJsonNull() && !jsonObj.get("policy_principals").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_principals` to be an array in the JSON string but got `%s`", jsonObj.get("policy_principals").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("policy_processes") != null && !jsonObj.get("policy_processes").isJsonNull() && !jsonObj.get("policy_processes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_processes` to be an array in the JSON string but got `%s`", jsonObj.get("policy_processes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateConnectionConfigurationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateConnectionConfigurationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateConnectionConfigurationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateConnectionConfigurationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateConnectionConfigurationRequest>() {
           @Override
           public void write(JsonWriter out, CreateConnectionConfigurationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateConnectionConfigurationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateConnectionConfigurationRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateConnectionConfigurationRequest
   * @throws IOException if the JSON string is invalid with respect to CreateConnectionConfigurationRequest
   */
  public static CreateConnectionConfigurationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateConnectionConfigurationRequest.class);
  }

  /**
   * Convert an instance of CreateConnectionConfigurationRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

