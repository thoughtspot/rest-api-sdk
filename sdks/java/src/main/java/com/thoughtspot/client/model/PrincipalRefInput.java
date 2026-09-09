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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Input reference to a principal (user or group) used when granting or revoking access to a shared
 * resource.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class PrincipalRefInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_PRINCIPAL_IDENTIFIER = "principal_identifier";

    @SerializedName(SERIALIZED_NAME_PRINCIPAL_IDENTIFIER)
    @javax.annotation.Nonnull
    private String principalIdentifier;

    /** Whether the principal is an individual user or a group. */
    @JsonAdapter(PrincipalTypeEnum.Adapter.class)
    public enum PrincipalTypeEnum {
        USER("USER"),

        USER_GROUP("USER_GROUP");

        private String value;

        PrincipalTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PrincipalTypeEnum fromValue(String value) {
            for (PrincipalTypeEnum b : PrincipalTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<PrincipalTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PrincipalTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PrincipalTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PrincipalTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            PrincipalTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_PRINCIPAL_TYPE = "principal_type";

    @SerializedName(SERIALIZED_NAME_PRINCIPAL_TYPE)
    @javax.annotation.Nonnull
    private PrincipalTypeEnum principalType;

    public PrincipalRefInput() {}

    public PrincipalRefInput principalIdentifier(
            @javax.annotation.Nonnull String principalIdentifier) {
        this.principalIdentifier = principalIdentifier;
        return this;
    }

    /**
     * Unique identifier of the user or group.
     *
     * @return principalIdentifier
     */
    @javax.annotation.Nonnull
    public String getPrincipalIdentifier() {
        return principalIdentifier;
    }

    public void setPrincipalIdentifier(@javax.annotation.Nonnull String principalIdentifier) {
        this.principalIdentifier = principalIdentifier;
    }

    public PrincipalRefInput principalType(
            @javax.annotation.Nonnull PrincipalTypeEnum principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * Whether the principal is an individual user or a group.
     *
     * @return principalType
     */
    @javax.annotation.Nonnull
    public PrincipalTypeEnum getPrincipalType() {
        return principalType;
    }

    public void setPrincipalType(@javax.annotation.Nonnull PrincipalTypeEnum principalType) {
        this.principalType = principalType;
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
     * @return the PrincipalRefInput instance itself
     */
    public PrincipalRefInput putAdditionalProperty(String key, Object value) {
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
        PrincipalRefInput principalRefInput = (PrincipalRefInput) o;
        return Objects.equals(this.principalIdentifier, principalRefInput.principalIdentifier)
                && Objects.equals(this.principalType, principalRefInput.principalType)
                && Objects.equals(
                        this.additionalProperties, principalRefInput.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principalIdentifier, principalType, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrincipalRefInput {\n");
        sb.append("    principalIdentifier: ")
                .append(toIndentedString(principalIdentifier))
                .append("\n");
        sb.append("    principalType: ").append(toIndentedString(principalType)).append("\n");
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
        openapiFields.add("principal_identifier");
        openapiFields.add("principal_type");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("principal_identifier");
        openapiRequiredFields.add("principal_type");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to PrincipalRefInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PrincipalRefInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in PrincipalRefInput is not found in the"
                                        + " empty JSON string",
                                PrincipalRefInput.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : PrincipalRefInput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("principal_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `principal_identifier` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("principal_identifier").toString()));
        }
        if (!jsonObj.get("principal_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `principal_type` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("principal_type").toString()));
        }
        // validate the required field `principal_type`
        PrincipalTypeEnum.validateJsonElement(jsonObj.get("principal_type"));
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PrincipalRefInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PrincipalRefInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PrincipalRefInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(PrincipalRefInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<PrincipalRefInput>() {
                        @Override
                        public void write(JsonWriter out, PrincipalRefInput value)
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
                        public PrincipalRefInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            PrincipalRefInput instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of PrincipalRefInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PrincipalRefInput
     * @throws IOException if the JSON string is invalid with respect to PrincipalRefInput
     */
    public static PrincipalRefInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PrincipalRefInput.class);
    }

    /**
     * Convert an instance of PrincipalRefInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
