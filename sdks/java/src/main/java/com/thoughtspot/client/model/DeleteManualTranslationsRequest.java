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

/** DeleteManualTranslationsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DeleteManualTranslationsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Org scope for the delete. &#x60;ORG&#x60; (default) targets the calling user&#39;s current
     * org. &#x60;CLUSTER&#x60; targets the All-Org context.
     */
    @JsonAdapter(ScopeEnum.Adapter.class)
    public enum ScopeEnum {
        ORG("ORG"),

        CLUSTER("CLUSTER");

        private String value;

        ScopeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ScopeEnum fromValue(String value) {
            for (ScopeEnum b : ScopeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ScopeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ScopeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ScopeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ScopeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_SCOPE = "scope";

    @SerializedName(SERIALIZED_NAME_SCOPE)
    @javax.annotation.Nullable
    private ScopeEnum scope = ScopeEnum.ORG;

    public DeleteManualTranslationsRequest() {}

    public DeleteManualTranslationsRequest scope(@javax.annotation.Nullable ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Org scope for the delete. &#x60;ORG&#x60; (default) targets the calling user&#39;s current
     * org. &#x60;CLUSTER&#x60; targets the All-Org context.
     *
     * @return scope
     */
    @javax.annotation.Nullable
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(@javax.annotation.Nullable ScopeEnum scope) {
        this.scope = scope;
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
     * @return the DeleteManualTranslationsRequest instance itself
     */
    public DeleteManualTranslationsRequest putAdditionalProperty(String key, Object value) {
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
        DeleteManualTranslationsRequest deleteManualTranslationsRequest =
                (DeleteManualTranslationsRequest) o;
        return Objects.equals(this.scope, deleteManualTranslationsRequest.scope)
                && Objects.equals(
                        this.additionalProperties,
                        deleteManualTranslationsRequest.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scope, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteManualTranslationsRequest {\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
        openapiFields.add("scope");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     DeleteManualTranslationsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DeleteManualTranslationsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DeleteManualTranslationsRequest is"
                                        + " not found in the empty JSON string",
                                DeleteManualTranslationsRequest.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull())
                && !jsonObj.get("scope").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `scope` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("scope").toString()));
        }
        // validate the optional field `scope`
        if (jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) {
            ScopeEnum.validateJsonElement(jsonObj.get("scope"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DeleteManualTranslationsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DeleteManualTranslationsRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DeleteManualTranslationsRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(DeleteManualTranslationsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DeleteManualTranslationsRequest>() {
                        @Override
                        public void write(JsonWriter out, DeleteManualTranslationsRequest value)
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
                        public DeleteManualTranslationsRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            DeleteManualTranslationsRequest instance =
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
     * Create an instance of DeleteManualTranslationsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DeleteManualTranslationsRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     DeleteManualTranslationsRequest
     */
    public static DeleteManualTranslationsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DeleteManualTranslationsRequest.class);
    }

    /**
     * Convert an instance of DeleteManualTranslationsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
