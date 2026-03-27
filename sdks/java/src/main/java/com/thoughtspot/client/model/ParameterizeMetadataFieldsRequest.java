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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** ParameterizeMetadataFieldsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ParameterizeMetadataFieldsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Type of metadata object to parameterize. */
    @JsonAdapter(MetadataTypeEnum.Adapter.class)
    public enum MetadataTypeEnum {
        LOGICAL_TABLE("LOGICAL_TABLE"),

        CONNECTION("CONNECTION"),

        CONNECTION_CONFIG("CONNECTION_CONFIG");

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

    public static final String SERIALIZED_NAME_FIELD_NAMES = "field_names";

    @SerializedName(SERIALIZED_NAME_FIELD_NAMES)
    @javax.annotation.Nonnull
    private List<String> fieldNames;

    public static final String SERIALIZED_NAME_VARIABLE_IDENTIFIER = "variable_identifier";

    @SerializedName(SERIALIZED_NAME_VARIABLE_IDENTIFIER)
    @javax.annotation.Nonnull
    private String variableIdentifier;

    public ParameterizeMetadataFieldsRequest() {}

    public ParameterizeMetadataFieldsRequest metadataType(
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

    public ParameterizeMetadataFieldsRequest metadataIdentifier(
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

    public ParameterizeMetadataFieldsRequest fieldType(
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

    public ParameterizeMetadataFieldsRequest fieldNames(
            @javax.annotation.Nonnull List<String> fieldNames) {
        this.fieldNames = fieldNames;
        return this;
    }

    public ParameterizeMetadataFieldsRequest addFieldNamesItem(String fieldNamesItem) {
        if (this.fieldNames == null) {
            this.fieldNames = new ArrayList<>();
        }
        this.fieldNames.add(fieldNamesItem);
        return this;
    }

    /**
     * JSON array of field names to parameterize. Example: [schemaName, databaseName, tableName]
     *
     * @return fieldNames
     */
    @javax.annotation.Nonnull
    public List<String> getFieldNames() {
        return fieldNames;
    }

    public void setFieldNames(@javax.annotation.Nonnull List<String> fieldNames) {
        this.fieldNames = fieldNames;
    }

    public ParameterizeMetadataFieldsRequest variableIdentifier(
            @javax.annotation.Nonnull String variableIdentifier) {
        this.variableIdentifier = variableIdentifier;
        return this;
    }

    /**
     * Unique ID or name of the variable to use for parameterization of these fields.
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
     * @return the ParameterizeMetadataFieldsRequest instance itself
     */
    public ParameterizeMetadataFieldsRequest putAdditionalProperty(String key, Object value) {
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
        ParameterizeMetadataFieldsRequest parameterizeMetadataFieldsRequest =
                (ParameterizeMetadataFieldsRequest) o;
        return Objects.equals(this.metadataType, parameterizeMetadataFieldsRequest.metadataType)
                && Objects.equals(
                        this.metadataIdentifier,
                        parameterizeMetadataFieldsRequest.metadataIdentifier)
                && Objects.equals(this.fieldType, parameterizeMetadataFieldsRequest.fieldType)
                && Objects.equals(this.fieldNames, parameterizeMetadataFieldsRequest.fieldNames)
                && Objects.equals(
                        this.variableIdentifier,
                        parameterizeMetadataFieldsRequest.variableIdentifier)
                && Objects.equals(
                        this.additionalProperties,
                        parameterizeMetadataFieldsRequest.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metadataType,
                metadataIdentifier,
                fieldType,
                fieldNames,
                variableIdentifier,
                additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParameterizeMetadataFieldsRequest {\n");
        sb.append("    metadataType: ").append(toIndentedString(metadataType)).append("\n");
        sb.append("    metadataIdentifier: ")
                .append(toIndentedString(metadataIdentifier))
                .append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        sb.append("    fieldNames: ").append(toIndentedString(fieldNames)).append("\n");
        sb.append("    variableIdentifier: ")
                .append(toIndentedString(variableIdentifier))
                .append("\n");
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
        openapiFields.add("metadata_type");
        openapiFields.add("metadata_identifier");
        openapiFields.add("field_type");
        openapiFields.add("field_names");
        openapiFields.add("variable_identifier");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("metadata_identifier");
        openapiRequiredFields.add("field_type");
        openapiRequiredFields.add("field_names");
        openapiRequiredFields.add("variable_identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ParameterizeMetadataFieldsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ParameterizeMetadataFieldsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ParameterizeMetadataFieldsRequest is"
                                        + " not found in the empty JSON string",
                                ParameterizeMetadataFieldsRequest.openapiRequiredFields
                                        .toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ParameterizeMetadataFieldsRequest.openapiRequiredFields) {
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
        // ensure the required json array is present
        if (jsonObj.get("field_names") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("field_names").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `field_names` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("field_names").toString()));
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
            if (!ParameterizeMetadataFieldsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ParameterizeMetadataFieldsRequest' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ParameterizeMetadataFieldsRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ParameterizeMetadataFieldsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ParameterizeMetadataFieldsRequest>() {
                        @Override
                        public void write(JsonWriter out, ParameterizeMetadataFieldsRequest value)
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
                        public ParameterizeMetadataFieldsRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            ParameterizeMetadataFieldsRequest instance =
                                    thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of ParameterizeMetadataFieldsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ParameterizeMetadataFieldsRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     ParameterizeMetadataFieldsRequest
     */
    public static ParameterizeMetadataFieldsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ParameterizeMetadataFieldsRequest.class);
    }

    /**
     * Convert an instance of ParameterizeMetadataFieldsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
