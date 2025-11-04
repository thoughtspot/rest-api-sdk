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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** ParameterizeMetadataRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ParameterizeMetadataRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Type of metadata object to parameterize. */
    @JsonAdapter(MetadataTypeEnum.Adapter.class)
    public enum MetadataTypeEnum {
        LOGICAL_TABLE("LOGICAL_TABLE"),

        CONNECTION("CONNECTION");

        private String value;

        MetadataTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static MetadataTypeEnum fromValue(String value) {
            for (MetadataTypeEnum b : MetadataTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<MetadataTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final MetadataTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MetadataTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MetadataTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            MetadataTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_METADATA_TYPE = "metadata_type";

    @SerializedName(SERIALIZED_NAME_METADATA_TYPE)
    @javax.annotation.Nullable
    private MetadataTypeEnum metadataType;

    public static final String SERIALIZED_NAME_METADATA_IDENTIFIER = "metadata_identifier";

    @SerializedName(SERIALIZED_NAME_METADATA_IDENTIFIER)
    @javax.annotation.Nonnull
    private String metadataIdentifier;

    /** Type of field in the metadata to parameterize. */
    @JsonAdapter(FieldTypeEnum.Adapter.class)
    public enum FieldTypeEnum {
        ATTRIBUTE("ATTRIBUTE"),

        CONNECTION_PROPERTY("CONNECTION_PROPERTY");

        private String value;

        FieldTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static FieldTypeEnum fromValue(String value) {
            for (FieldTypeEnum b : FieldTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<FieldTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FieldTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FieldTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FieldTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            FieldTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_FIELD_TYPE = "field_type";

    @SerializedName(SERIALIZED_NAME_FIELD_TYPE)
    @javax.annotation.Nonnull
    private FieldTypeEnum fieldType;

    public static final String SERIALIZED_NAME_FIELD_NAME = "field_name";

    @SerializedName(SERIALIZED_NAME_FIELD_NAME)
    @javax.annotation.Nonnull
    private String fieldName;

    public static final String SERIALIZED_NAME_VARIABLE_IDENTIFIER = "variable_identifier";

    @SerializedName(SERIALIZED_NAME_VARIABLE_IDENTIFIER)
    @javax.annotation.Nonnull
    private String variableIdentifier;

    public ParameterizeMetadataRequest() {}

    public ParameterizeMetadataRequest metadataType(
            @javax.annotation.Nullable MetadataTypeEnum metadataType) {
        this.metadataType = metadataType;
        return this;
    }

    /**
     * Type of metadata object to parameterize.
     *
     * @return metadataType
     */
    @javax.annotation.Nullable
    public MetadataTypeEnum getMetadataType() {
        return metadataType;
    }

    public void setMetadataType(@javax.annotation.Nullable MetadataTypeEnum metadataType) {
        this.metadataType = metadataType;
    }

    public ParameterizeMetadataRequest metadataIdentifier(
            @javax.annotation.Nonnull String metadataIdentifier) {
        this.metadataIdentifier = metadataIdentifier;
        return this;
    }

    /**
     * Unique ID or name of the metadata object to parameterize.
     *
     * @return metadataIdentifier
     */
    @javax.annotation.Nonnull
    public String getMetadataIdentifier() {
        return metadataIdentifier;
    }

    public void setMetadataIdentifier(@javax.annotation.Nonnull String metadataIdentifier) {
        this.metadataIdentifier = metadataIdentifier;
    }

    public ParameterizeMetadataRequest fieldType(
            @javax.annotation.Nonnull FieldTypeEnum fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * Type of field in the metadata to parameterize.
     *
     * @return fieldType
     */
    @javax.annotation.Nonnull
    public FieldTypeEnum getFieldType() {
        return fieldType;
    }

    public void setFieldType(@javax.annotation.Nonnull FieldTypeEnum fieldType) {
        this.fieldType = fieldType;
    }

    public ParameterizeMetadataRequest fieldName(@javax.annotation.Nonnull String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * Name of the field which needs to be parameterized.
     *
     * @return fieldName
     */
    @javax.annotation.Nonnull
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(@javax.annotation.Nonnull String fieldName) {
        this.fieldName = fieldName;
    }

    public ParameterizeMetadataRequest variableIdentifier(
            @javax.annotation.Nonnull String variableIdentifier) {
        this.variableIdentifier = variableIdentifier;
        return this;
    }

    /**
     * Unique ID or name of the variable to use for parameterization
     *
     * @return variableIdentifier
     */
    @javax.annotation.Nonnull
    public String getVariableIdentifier() {
        return variableIdentifier;
    }

    public void setVariableIdentifier(@javax.annotation.Nonnull String variableIdentifier) {
        this.variableIdentifier = variableIdentifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParameterizeMetadataRequest parameterizeMetadataRequest = (ParameterizeMetadataRequest) o;
        return Objects.equals(this.metadataType, parameterizeMetadataRequest.metadataType)
                && Objects.equals(
                        this.metadataIdentifier, parameterizeMetadataRequest.metadataIdentifier)
                && Objects.equals(this.fieldType, parameterizeMetadataRequest.fieldType)
                && Objects.equals(this.fieldName, parameterizeMetadataRequest.fieldName)
                && Objects.equals(
                        this.variableIdentifier, parameterizeMetadataRequest.variableIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metadataType, metadataIdentifier, fieldType, fieldName, variableIdentifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParameterizeMetadataRequest {\n");
        sb.append("    metadataType: ").append(toIndentedString(metadataType)).append("\n");
        sb.append("    metadataIdentifier: ")
                .append(toIndentedString(metadataIdentifier))
                .append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
        sb.append("    variableIdentifier: ")
                .append(toIndentedString(variableIdentifier))
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
        openapiFields.add("metadata_type");
        openapiFields.add("metadata_identifier");
        openapiFields.add("field_type");
        openapiFields.add("field_name");
        openapiFields.add("variable_identifier");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("metadata_identifier");
        openapiRequiredFields.add("field_type");
        openapiRequiredFields.add("field_name");
        openapiRequiredFields.add("variable_identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ParameterizeMetadataRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ParameterizeMetadataRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ParameterizeMetadataRequest is not"
                                        + " found in the empty JSON string",
                                ParameterizeMetadataRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ParameterizeMetadataRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ParameterizeMetadataRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ParameterizeMetadataRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("metadata_type") != null && !jsonObj.get("metadata_type").isJsonNull())
                && !jsonObj.get("metadata_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("metadata_type").toString()));
        }
        // validate the optional field `metadata_type`
        if (jsonObj.get("metadata_type") != null && !jsonObj.get("metadata_type").isJsonNull()) {
            MetadataTypeEnum.validateJsonElement(jsonObj.get("metadata_type"));
        }
        if (!jsonObj.get("metadata_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_identifier` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("metadata_identifier").toString()));
        }
        if (!jsonObj.get("field_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `field_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("field_type").toString()));
        }
        // validate the required field `field_type`
        FieldTypeEnum.validateJsonElement(jsonObj.get("field_type"));
        if (!jsonObj.get("field_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `field_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("field_name").toString()));
        }
        if (!jsonObj.get("variable_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `variable_identifier` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("variable_identifier").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ParameterizeMetadataRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ParameterizeMetadataRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ParameterizeMetadataRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ParameterizeMetadataRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ParameterizeMetadataRequest>() {
                        @Override
                        public void write(JsonWriter out, ParameterizeMetadataRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ParameterizeMetadataRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ParameterizeMetadataRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ParameterizeMetadataRequest
     * @throws IOException if the JSON string is invalid with respect to ParameterizeMetadataRequest
     */
    public static ParameterizeMetadataRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ParameterizeMetadataRequest.class);
    }

    /**
     * Convert an instance of ParameterizeMetadataRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
