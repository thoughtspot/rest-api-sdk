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
import com.thoughtspot.client.model.UserPrincipal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
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
 * ConnectionConfigurationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ConnectionConfigurationResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CONFIGURATION_IDENTIFIER = "configuration_identifier";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_IDENTIFIER)
  @javax.annotation.Nullable
  private String configurationIdentifier;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  @javax.annotation.Nullable
  private Object _configuration;

  public static final String SERIALIZED_NAME_POLICY_PRINCIPALS = "policy_principals";
  @SerializedName(SERIALIZED_NAME_POLICY_PRINCIPALS)
  @javax.annotation.Nullable
  private List<UserPrincipal> policyPrincipals;

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

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  @javax.annotation.Nullable
  private Boolean disabled;

  /**
   * Gets or Sets dataWarehouseType
   */
  @JsonAdapter(DataWarehouseTypeEnum.Adapter.class)
  public enum DataWarehouseTypeEnum {
    SNOWFLAKE("SNOWFLAKE"),
    
    AMAZON_REDSHIFT("AMAZON_REDSHIFT"),
    
    GOOGLE_BIGQUERY("GOOGLE_BIGQUERY"),
    
    AZURE_SYNAPSE("AZURE_SYNAPSE"),
    
    TERADATA("TERADATA"),
    
    SAP_HANA("SAP_HANA"),
    
    STARBURST("STARBURST"),
    
    ORACLE_ADW("ORACLE_ADW"),
    
    DATABRICKS("DATABRICKS"),
    
    DENODO("DENODO"),
    
    DREMIO("DREMIO"),
    
    TRINO("TRINO"),
    
    PRESTO("PRESTO"),
    
    POSTGRES("POSTGRES"),
    
    SQLSERVER("SQLSERVER"),
    
    MYSQL("MYSQL"),
    
    GENERIC_JDBC("GENERIC_JDBC"),
    
    AMAZON_RDS_POSTGRESQL("AMAZON_RDS_POSTGRESQL"),
    
    AMAZON_AURORA_POSTGRESQL("AMAZON_AURORA_POSTGRESQL"),
    
    AMAZON_RDS_MYSQL("AMAZON_RDS_MYSQL"),
    
    AMAZON_AURORA_MYSQL("AMAZON_AURORA_MYSQL"),
    
    LOOKER("LOOKER"),
    
    AMAZON_ATHENA("AMAZON_ATHENA"),
    
    SINGLESTORE("SINGLESTORE"),
    
    GCP_SQLSERVER("GCP_SQLSERVER"),
    
    GCP_ALLOYDB_POSTGRESQL("GCP_ALLOYDB_POSTGRESQL"),
    
    GCP_POSTGRESQL("GCP_POSTGRESQL"),
    
    GCP_MYSQL("GCP_MYSQL"),
    
    MODE("MODE"),
    
    GOOGLE_SHEETS("GOOGLE_SHEETS"),
    
    FALCON("FALCON"),
    
    FALCON_ONPREM("FALCON_ONPREM"),
    
    CLICKHOUSE("CLICKHOUSE");

    private String value;

    DataWarehouseTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataWarehouseTypeEnum fromValue(String value) {
      for (DataWarehouseTypeEnum b : DataWarehouseTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DataWarehouseTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataWarehouseTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataWarehouseTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DataWarehouseTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DataWarehouseTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DATA_WAREHOUSE_TYPE = "data_warehouse_type";
  @SerializedName(SERIALIZED_NAME_DATA_WAREHOUSE_TYPE)
  @javax.annotation.Nullable
  private DataWarehouseTypeEnum dataWarehouseType;

  /**
   * Gets or Sets policyType
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
      return null;
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

  public ConnectionConfigurationResponse() {
  }

  public ConnectionConfigurationResponse configurationIdentifier(@javax.annotation.Nullable String configurationIdentifier) {
    this.configurationIdentifier = configurationIdentifier;
    return this;
  }

  /**
   * Get configurationIdentifier
   * @return configurationIdentifier
   */
  @javax.annotation.Nullable
  public String getConfigurationIdentifier() {
    return configurationIdentifier;
  }

  public void setConfigurationIdentifier(@javax.annotation.Nullable String configurationIdentifier) {
    this.configurationIdentifier = configurationIdentifier;
  }


  public ConnectionConfigurationResponse name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public ConnectionConfigurationResponse description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public ConnectionConfigurationResponse _configuration(@javax.annotation.Nullable Object _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * Get _configuration
   * @return _configuration
   */
  @javax.annotation.Nullable
  public Object getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(@javax.annotation.Nullable Object _configuration) {
    this._configuration = _configuration;
  }


  public ConnectionConfigurationResponse policyPrincipals(@javax.annotation.Nullable List<UserPrincipal> policyPrincipals) {
    this.policyPrincipals = policyPrincipals;
    return this;
  }

  public ConnectionConfigurationResponse addPolicyPrincipalsItem(UserPrincipal policyPrincipalsItem) {
    if (this.policyPrincipals == null) {
      this.policyPrincipals = new ArrayList<>();
    }
    this.policyPrincipals.add(policyPrincipalsItem);
    return this;
  }

  /**
   * Get policyPrincipals
   * @return policyPrincipals
   */
  @javax.annotation.Nullable
  public List<UserPrincipal> getPolicyPrincipals() {
    return policyPrincipals;
  }

  public void setPolicyPrincipals(@javax.annotation.Nullable List<UserPrincipal> policyPrincipals) {
    this.policyPrincipals = policyPrincipals;
  }


  public ConnectionConfigurationResponse policyProcesses(@javax.annotation.Nullable List<PolicyProcessesEnum> policyProcesses) {
    this.policyProcesses = policyProcesses;
    return this;
  }

  public ConnectionConfigurationResponse addPolicyProcessesItem(PolicyProcessesEnum policyProcessesItem) {
    if (this.policyProcesses == null) {
      this.policyProcesses = new ArrayList<>();
    }
    this.policyProcesses.add(policyProcessesItem);
    return this;
  }

  /**
   * Get policyProcesses
   * @return policyProcesses
   */
  @javax.annotation.Nullable
  public List<PolicyProcessesEnum> getPolicyProcesses() {
    return policyProcesses;
  }

  public void setPolicyProcesses(@javax.annotation.Nullable List<PolicyProcessesEnum> policyProcesses) {
    this.policyProcesses = policyProcesses;
  }


  public ConnectionConfigurationResponse disabled(@javax.annotation.Nullable Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Get disabled
   * @return disabled
   */
  @javax.annotation.Nullable
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(@javax.annotation.Nullable Boolean disabled) {
    this.disabled = disabled;
  }


  public ConnectionConfigurationResponse dataWarehouseType(@javax.annotation.Nullable DataWarehouseTypeEnum dataWarehouseType) {
    this.dataWarehouseType = dataWarehouseType;
    return this;
  }

  /**
   * Get dataWarehouseType
   * @return dataWarehouseType
   */
  @javax.annotation.Nullable
  public DataWarehouseTypeEnum getDataWarehouseType() {
    return dataWarehouseType;
  }

  public void setDataWarehouseType(@javax.annotation.Nullable DataWarehouseTypeEnum dataWarehouseType) {
    this.dataWarehouseType = dataWarehouseType;
  }


  public ConnectionConfigurationResponse policyType(@javax.annotation.Nullable PolicyTypeEnum policyType) {
    this.policyType = policyType;
    return this;
  }

  /**
   * Get policyType
   * @return policyType
   */
  @javax.annotation.Nullable
  public PolicyTypeEnum getPolicyType() {
    return policyType;
  }

  public void setPolicyType(@javax.annotation.Nullable PolicyTypeEnum policyType) {
    this.policyType = policyType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionConfigurationResponse connectionConfigurationResponse = (ConnectionConfigurationResponse) o;
    return Objects.equals(this.configurationIdentifier, connectionConfigurationResponse.configurationIdentifier) &&
        Objects.equals(this.name, connectionConfigurationResponse.name) &&
        Objects.equals(this.description, connectionConfigurationResponse.description) &&
        Objects.equals(this._configuration, connectionConfigurationResponse._configuration) &&
        Objects.equals(this.policyPrincipals, connectionConfigurationResponse.policyPrincipals) &&
        Objects.equals(this.policyProcesses, connectionConfigurationResponse.policyProcesses) &&
        Objects.equals(this.disabled, connectionConfigurationResponse.disabled) &&
        Objects.equals(this.dataWarehouseType, connectionConfigurationResponse.dataWarehouseType) &&
        Objects.equals(this.policyType, connectionConfigurationResponse.policyType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationIdentifier, name, description, _configuration, policyPrincipals, policyProcesses, disabled, dataWarehouseType, policyType);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionConfigurationResponse {\n");
    sb.append("    configurationIdentifier: ").append(toIndentedString(configurationIdentifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    policyPrincipals: ").append(toIndentedString(policyPrincipals)).append("\n");
    sb.append("    policyProcesses: ").append(toIndentedString(policyProcesses)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    dataWarehouseType: ").append(toIndentedString(dataWarehouseType)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
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
    openapiFields.add("configuration_identifier");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("configuration");
    openapiFields.add("policy_principals");
    openapiFields.add("policy_processes");
    openapiFields.add("disabled");
    openapiFields.add("data_warehouse_type");
    openapiFields.add("policy_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConnectionConfigurationResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConnectionConfigurationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectionConfigurationResponse is not found in the empty JSON string", ConnectionConfigurationResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConnectionConfigurationResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConnectionConfigurationResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("configuration_identifier") != null && !jsonObj.get("configuration_identifier").isJsonNull()) && !jsonObj.get("configuration_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configuration_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configuration_identifier").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("policy_principals") != null && !jsonObj.get("policy_principals").isJsonNull()) {
        JsonArray jsonArraypolicyPrincipals = jsonObj.getAsJsonArray("policy_principals");
        if (jsonArraypolicyPrincipals != null) {
          // ensure the json data is an array
          if (!jsonObj.get("policy_principals").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `policy_principals` to be an array in the JSON string but got `%s`", jsonObj.get("policy_principals").toString()));
          }

          // validate the optional field `policy_principals` (array)
          for (int i = 0; i < jsonArraypolicyPrincipals.size(); i++) {
            UserPrincipal.validateJsonElement(jsonArraypolicyPrincipals.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("policy_processes") != null && !jsonObj.get("policy_processes").isJsonNull() && !jsonObj.get("policy_processes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_processes` to be an array in the JSON string but got `%s`", jsonObj.get("policy_processes").toString()));
      }
      if ((jsonObj.get("data_warehouse_type") != null && !jsonObj.get("data_warehouse_type").isJsonNull()) && !jsonObj.get("data_warehouse_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_warehouse_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_warehouse_type").toString()));
      }
      // validate the optional field `data_warehouse_type`
      if (jsonObj.get("data_warehouse_type") != null && !jsonObj.get("data_warehouse_type").isJsonNull()) {
        DataWarehouseTypeEnum.validateJsonElement(jsonObj.get("data_warehouse_type"));
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
       if (!ConnectionConfigurationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectionConfigurationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectionConfigurationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectionConfigurationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectionConfigurationResponse>() {
           @Override
           public void write(JsonWriter out, ConnectionConfigurationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConnectionConfigurationResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConnectionConfigurationResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConnectionConfigurationResponse
   * @throws IOException if the JSON string is invalid with respect to ConnectionConfigurationResponse
   */
  public static ConnectionConfigurationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectionConfigurationResponse.class);
  }

  /**
   * Convert an instance of ConnectionConfigurationResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

