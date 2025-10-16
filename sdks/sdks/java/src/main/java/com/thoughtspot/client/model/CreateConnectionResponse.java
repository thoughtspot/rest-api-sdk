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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** CreateConnectionResponse */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CreateConnectionResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nonnull
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    /** Type of data warehouse. */
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

    public static final String SERIALIZED_NAME_DETAILS = "details";

    @SerializedName(SERIALIZED_NAME_DETAILS)
    @javax.annotation.Nullable
    private Object details;

    public CreateConnectionResponse() {}

    public CreateConnectionResponse id(@javax.annotation.Nonnull String id) {
        this.id = id;
        return this;
    }

    /**
     * ID of the connection created.
     *
     * @return id
     */
    @javax.annotation.Nonnull
    public String getId() {
        return id;
    }

    public void setId(@javax.annotation.Nonnull String id) {
        this.id = id;
    }

    public CreateConnectionResponse name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the connection.
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

    public CreateConnectionResponse dataWarehouseType(
            @javax.annotation.Nonnull DataWarehouseTypeEnum dataWarehouseType) {
        this.dataWarehouseType = dataWarehouseType;
        return this;
    }

    /**
     * Type of data warehouse.
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

    public CreateConnectionResponse details(@javax.annotation.Nullable Object details) {
        this.details = details;
        return this;
    }

    /**
     * Details of the connection.
     *
     * @return details
     */
    @javax.annotation.Nullable
    public Object getDetails() {
        return details;
    }

    public void setDetails(@javax.annotation.Nullable Object details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateConnectionResponse createConnectionResponse = (CreateConnectionResponse) o;
        return Objects.equals(this.id, createConnectionResponse.id)
                && Objects.equals(this.name, createConnectionResponse.name)
                && Objects.equals(
                        this.dataWarehouseType, createConnectionResponse.dataWarehouseType)
                && Objects.equals(this.details, createConnectionResponse.details);
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
        return Objects.hash(id, name, dataWarehouseType, details);
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
        sb.append("class CreateConnectionResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dataWarehouseType: ")
                .append(toIndentedString(dataWarehouseType))
                .append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
        openapiFields.add("id");
        openapiFields.add("name");
        openapiFields.add("data_warehouse_type");
        openapiFields.add("details");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("data_warehouse_type");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateConnectionResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CreateConnectionResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateConnectionResponse is not found"
                                        + " in the empty JSON string",
                                CreateConnectionResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CreateConnectionResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateConnectionResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateConnectionResponse.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
        }
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
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
            if (!CreateConnectionResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateConnectionResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateConnectionResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CreateConnectionResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateConnectionResponse>() {
                        @Override
                        public void write(JsonWriter out, CreateConnectionResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateConnectionResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateConnectionResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateConnectionResponse
     * @throws IOException if the JSON string is invalid with respect to CreateConnectionResponse
     */
    public static CreateConnectionResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateConnectionResponse.class);
    }

    /**
     * Convert an instance of CreateConnectionResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
