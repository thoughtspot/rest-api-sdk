/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thoughtspot.client.JSON;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** CreateConnectionRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CreateConnectionRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nullable
    private String description;

    /** Type of the data warehouse. */
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
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<DataWarehouseTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final DataWarehouseTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DataWarehouseTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
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
    @javax.annotation.Nonnull
    private DataWarehouseTypeEnum dataWarehouseType;

    public static final String SERIALIZED_NAME_DATA_WAREHOUSE_CONFIG = "data_warehouse_config";

    @SerializedName(SERIALIZED_NAME_DATA_WAREHOUSE_CONFIG)
    @javax.annotation.Nonnull
    private Object dataWarehouseConfig;

    public static final String SERIALIZED_NAME_VALIDATE = "validate";

    @SerializedName(SERIALIZED_NAME_VALIDATE)
    @javax.annotation.Nullable
    private Boolean validate = true;

    public CreateConnectionRequest() {}

    public CreateConnectionRequest name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Unique name for the connection.
     *
     * @return name
     */
    @javax.annotation.Nonnull
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nonnull String name) {
        this.name = name;
    }

    public CreateConnectionRequest description(@javax.annotation.Nullable String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the connection.
     *
     * @return description
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@javax.annotation.Nullable String description) {
        this.description = description;
    }

    public CreateConnectionRequest dataWarehouseType(
            @javax.annotation.Nonnull DataWarehouseTypeEnum dataWarehouseType) {
        this.dataWarehouseType = dataWarehouseType;
        return this;
    }

    /**
     * Type of the data warehouse.
     *
     * @return dataWarehouseType
     */
    @javax.annotation.Nonnull
    public DataWarehouseTypeEnum getDataWarehouseType() {
        return dataWarehouseType;
    }

    public void setDataWarehouseType(
            @javax.annotation.Nonnull DataWarehouseTypeEnum dataWarehouseType) {
        this.dataWarehouseType = dataWarehouseType;
    }

    public CreateConnectionRequest dataWarehouseConfig(
            @javax.annotation.Nonnull Object dataWarehouseConfig) {
        this.dataWarehouseConfig = dataWarehouseConfig;
        return this;
    }

    /**
     * Connection configuration attributes in JSON format. To create a connection with tables,
     * include table attributes. See the documentation above for sample JSON.
     *
     * @return dataWarehouseConfig
     */
    @javax.annotation.Nonnull
    public Object getDataWarehouseConfig() {
        return dataWarehouseConfig;
    }

    public void setDataWarehouseConfig(@javax.annotation.Nonnull Object dataWarehouseConfig) {
        this.dataWarehouseConfig = dataWarehouseConfig;
    }

    public CreateConnectionRequest validate(@javax.annotation.Nullable Boolean validate) {
        this.validate = validate;
        return this;
    }

    /**
     * Validates the connection metadata if tables are included. If you are creating a connection
     * without tables, specify &#x60;false&#x60;.
     *
     * @return validate
     */
    @javax.annotation.Nullable
    public Boolean getValidate() {
        return validate;
    }

    public void setValidate(@javax.annotation.Nullable Boolean validate) {
        this.validate = validate;
    }

    /**
     * A container for additional, undeclared properties. This is a holder for any undeclared
     * properties as specified with the 'additionalProperties' keyword in the OAS document.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Set the additional (undeclared) property with the specified name and value. If the property
     * does not already exist, create it otherwise replace it.
     *
     * @param key name of the property
     * @param value value of the property
     * @return the CreateConnectionRequest instance itself
     */
    public CreateConnectionRequest putAdditionalProperty(String key, Object value) {
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
        CreateConnectionRequest createConnectionRequest = (CreateConnectionRequest) o;
        return Objects.equals(this.name, createConnectionRequest.name)
                && Objects.equals(this.description, createConnectionRequest.description)
                && Objects.equals(this.dataWarehouseType, createConnectionRequest.dataWarehouseType)
                && Objects.equals(
                        this.dataWarehouseConfig, createConnectionRequest.dataWarehouseConfig)
                && Objects.equals(this.validate, createConnectionRequest.validate)
                && Objects.equals(
                        this.additionalProperties, createConnectionRequest.additionalProperties);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                description,
                dataWarehouseType,
                dataWarehouseConfig,
                validate,
                additionalProperties);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConnectionRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dataWarehouseType: ")
                .append(toIndentedString(dataWarehouseType))
                .append("\n");
        sb.append("    dataWarehouseConfig: ")
                .append(toIndentedString(dataWarehouseConfig))
                .append("\n");
        sb.append("    validate: ").append(toIndentedString(validate)).append("\n");
        sb.append("    additionalProperties: ")
                .append(toIndentedString(additionalProperties))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
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
        openapiFields.add("data_warehouse_type");
        openapiFields.add("data_warehouse_config");
        openapiFields.add("validate");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("data_warehouse_type");
        openapiRequiredFields.add("data_warehouse_config");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateConnectionRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CreateConnectionRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateConnectionRequest is not found"
                                        + " in the empty JSON string",
                                CreateConnectionRequest.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateConnectionRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
                && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("description").toString()));
        }
        if (!jsonObj.get("data_warehouse_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `data_warehouse_type` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("data_warehouse_type").toString()));
        }
        // validate the required field `data_warehouse_type`
        DataWarehouseTypeEnum.validateJsonElement(jsonObj.get("data_warehouse_type"));
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateConnectionRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateConnectionRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateConnectionRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CreateConnectionRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateConnectionRequest>() {
                        @Override
                        public void write(JsonWriter out, CreateConnectionRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            obj.remove("additionalProperties");
                            // serialize additional properties
                            if (value.getAdditionalProperties() != null) {
                                for (Map.Entry<String, Object> entry :
                                        value.getAdditionalProperties().entrySet()) {
                                    if (entry.getValue() instanceof String)
                                        obj.addProperty(entry.getKey(), (String) entry.getValue());
                                    else if (entry.getValue() instanceof Number)
                                        obj.addProperty(entry.getKey(), (Number) entry.getValue());
                                    else if (entry.getValue() instanceof Boolean)
                                        obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                                    else if (entry.getValue() instanceof Character)
                                        obj.addProperty(
                                                entry.getKey(), (Character) entry.getValue());
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
                        public CreateConnectionRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            CreateConnectionRequest instance = thisAdapter.fromJsonTree(jsonObj);
                            for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
                                if (!openapiFields.contains(entry.getKey())) {
                                    if (entry.getValue().isJsonPrimitive()) { // primitive type
                                        if (entry.getValue().getAsJsonPrimitive().isString())
                                            instance.putAdditionalProperty(
                                                    entry.getKey(), entry.getValue().getAsString());
                                        else if (entry.getValue().getAsJsonPrimitive().isNumber())
                                            instance.putAdditionalProperty(
                                                    entry.getKey(), entry.getValue().getAsNumber());
                                        else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                                            instance.putAdditionalProperty(
                                                    entry.getKey(),
                                                    entry.getValue().getAsBoolean());
                                        else
                                            throw new IllegalArgumentException(
                                                    String.format(
                                                            "The field `%s` has unknown primitive"
                                                                    + " type. Value: %s",
                                                            entry.getKey(),
                                                            entry.getValue().toString()));
                                    } else if (entry.getValue().isJsonArray()) {
                                        instance.putAdditionalProperty(
                                                entry.getKey(),
                                                gson.fromJson(entry.getValue(), List.class));
                                    } else { // JSON object
                                        instance.putAdditionalProperty(
                                                entry.getKey(),
                                                gson.fromJson(entry.getValue(), HashMap.class));
                                    }
                                }
                            }
                            return instance;
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateConnectionRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateConnectionRequest
     * @throws IOException if the JSON string is invalid with respect to CreateConnectionRequest
     */
    public static CreateConnectionRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateConnectionRequest.class);
    }

    /**
     * Convert an instance of CreateConnectionRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
