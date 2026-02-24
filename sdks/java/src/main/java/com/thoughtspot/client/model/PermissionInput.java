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

/** Details of users or groups. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class PermissionInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_PRINCIPAL = "principal";

    @SerializedName(SERIALIZED_NAME_PRINCIPAL)
    @javax.annotation.Nonnull
    private PrincipalsInput principal;

    /** Object share mode. */
    @JsonAdapter(ShareModeEnum.Adapter.class)
    public enum ShareModeEnum {
        READ_ONLY("READ_ONLY"),

        MODIFY("MODIFY"),

        NO_ACCESS("NO_ACCESS");

        private String value;

        ShareModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ShareModeEnum fromValue(String value) {
            for (ShareModeEnum b : ShareModeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ShareModeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ShareModeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ShareModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ShareModeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ShareModeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_SHARE_MODE = "share_mode";

    @SerializedName(SERIALIZED_NAME_SHARE_MODE)
    @javax.annotation.Nonnull
    private ShareModeEnum shareMode;

    public PermissionInput() {}

    public PermissionInput principal(@javax.annotation.Nonnull PrincipalsInput principal) {
        this.principal = principal;
        return this;
    }

    /**
     * Get principal
     *
     * @return principal
     */
    @javax.annotation.Nonnull
    public PrincipalsInput getPrincipal() {
        return principal;
    }

    public void setPrincipal(@javax.annotation.Nonnull PrincipalsInput principal) {
        this.principal = principal;
    }

    public PermissionInput shareMode(@javax.annotation.Nonnull ShareModeEnum shareMode) {
        this.shareMode = shareMode;
        return this;
    }

    /**
     * Object share mode.
     *
     * @return shareMode
     */
    @javax.annotation.Nonnull
    public ShareModeEnum getShareMode() {
        return shareMode;
    }

    public void setShareMode(@javax.annotation.Nonnull ShareModeEnum shareMode) {
        this.shareMode = shareMode;
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
     * @return the PermissionInput instance itself
     */
    public PermissionInput putAdditionalProperty(String key, Object value) {
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
        PermissionInput permissionInput = (PermissionInput) o;
        return Objects.equals(this.principal, permissionInput.principal)
                && Objects.equals(this.shareMode, permissionInput.shareMode)
                && Objects.equals(this.additionalProperties, permissionInput.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principal, shareMode, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionInput {\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
        sb.append("    shareMode: ").append(toIndentedString(shareMode)).append("\n");
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
        openapiFields.add("principal");
        openapiFields.add("share_mode");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("principal");
        openapiRequiredFields.add("share_mode");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to PermissionInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PermissionInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in PermissionInput is not found in the"
                                        + " empty JSON string",
                                PermissionInput.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : PermissionInput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the required field `principal`
        PrincipalsInput.validateJsonElement(jsonObj.get("principal"));
        if (!jsonObj.get("share_mode").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `share_mode` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("share_mode").toString()));
        }
        // validate the required field `share_mode`
        ShareModeEnum.validateJsonElement(jsonObj.get("share_mode"));
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PermissionInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PermissionInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PermissionInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(PermissionInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<PermissionInput>() {
                        @Override
                        public void write(JsonWriter out, PermissionInput value)
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
                        public PermissionInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            PermissionInput instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of PermissionInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PermissionInput
     * @throws IOException if the JSON string is invalid with respect to PermissionInput
     */
    public static PermissionInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PermissionInput.class);
    }

    /**
     * Convert an instance of PermissionInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
