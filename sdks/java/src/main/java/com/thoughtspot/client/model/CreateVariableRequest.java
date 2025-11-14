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

/** CreateVariableRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CreateVariableRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Type of variable */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        CONNECTION_PROPERTY("CONNECTION_PROPERTY"),

        TABLE_MAPPING("TABLE_MAPPING"),

        CONNECTION_PROPERTY_PER_PRINCIPAL("CONNECTION_PROPERTY_PER_PRINCIPAL"),

        FORMULA_VARIABLE("FORMULA_VARIABLE");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<TypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            TypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @javax.annotation.Nonnull
    private TypeEnum type;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    public static final String SERIALIZED_NAME_IS_SENSITIVE = "is_sensitive";

    @SerializedName(SERIALIZED_NAME_IS_SENSITIVE)
    @javax.annotation.Nullable
    private Boolean isSensitive = false;

    /** Variable Data Type */
    @JsonAdapter(DataTypeEnum.Adapter.class)
    public enum DataTypeEnum {
        VARCHAR("VARCHAR"),

        INT32("INT32"),

        INT64("INT64"),

        DOUBLE("DOUBLE"),

        DATE("DATE"),

        DATE_TIME("DATE_TIME");

        private String value;

        DataTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DataTypeEnum fromValue(String value) {
            for (DataTypeEnum b : DataTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<DataTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final DataTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DataTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DataTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            DataTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";

    @SerializedName(SERIALIZED_NAME_DATA_TYPE)
    @javax.annotation.Nullable
    private DataTypeEnum dataType;

    public CreateVariableRequest() {}

    public CreateVariableRequest type(@javax.annotation.Nonnull TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Type of variable
     *
     * @return type
     */
    @javax.annotation.Nonnull
    public TypeEnum getType() {
        return type;
    }

    public void setType(@javax.annotation.Nonnull TypeEnum type) {
        this.type = type;
    }

    public CreateVariableRequest name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the variable. This is unique across the cluster.
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

    public CreateVariableRequest isSensitive(@javax.annotation.Nullable Boolean isSensitive) {
        this.isSensitive = isSensitive;
        return this;
    }

    /**
     * If the variable contains sensitive values like passwords
     *
     * @return isSensitive
     */
    @javax.annotation.Nullable
    public Boolean getIsSensitive() {
        return isSensitive;
    }

    public void setIsSensitive(@javax.annotation.Nullable Boolean isSensitive) {
        this.isSensitive = isSensitive;
    }

    public CreateVariableRequest dataType(@javax.annotation.Nullable DataTypeEnum dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Variable Data Type
     *
     * @return dataType
     */
    @javax.annotation.Nullable
    public DataTypeEnum getDataType() {
        return dataType;
    }

    public void setDataType(@javax.annotation.Nullable DataTypeEnum dataType) {
        this.dataType = dataType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVariableRequest createVariableRequest = (CreateVariableRequest) o;
        return Objects.equals(this.type, createVariableRequest.type)
                && Objects.equals(this.name, createVariableRequest.name)
                && Objects.equals(this.isSensitive, createVariableRequest.isSensitive)
                && Objects.equals(this.dataType, createVariableRequest.dataType);
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
        return Objects.hash(type, name, isSensitive, dataType);
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
        sb.append("class CreateVariableRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isSensitive: ").append(toIndentedString(isSensitive)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
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
        openapiFields.add("type");
        openapiFields.add("name");
        openapiFields.add("is_sensitive");
        openapiFields.add("data_type");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("type");
        openapiRequiredFields.add("name");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateVariableRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CreateVariableRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateVariableRequest is not found in"
                                        + " the empty JSON string",
                                CreateVariableRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CreateVariableRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateVariableRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateVariableRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
        // validate the required field `type`
        TypeEnum.validateJsonElement(jsonObj.get("type"));
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if ((jsonObj.get("data_type") != null && !jsonObj.get("data_type").isJsonNull())
                && !jsonObj.get("data_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `data_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("data_type").toString()));
        }
        // validate the optional field `data_type`
        if (jsonObj.get("data_type") != null && !jsonObj.get("data_type").isJsonNull()) {
            DataTypeEnum.validateJsonElement(jsonObj.get("data_type"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateVariableRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateVariableRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateVariableRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CreateVariableRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateVariableRequest>() {
                        @Override
                        public void write(JsonWriter out, CreateVariableRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateVariableRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateVariableRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateVariableRequest
     * @throws IOException if the JSON string is invalid with respect to CreateVariableRequest
     */
    public static CreateVariableRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateVariableRequest.class);
    }

    /**
     * Convert an instance of CreateVariableRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
