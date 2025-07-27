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

/** SharePermissionsInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SharePermissionsInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_PRINCIPAL = "principal";

    @SerializedName(SERIALIZED_NAME_PRINCIPAL)
    @javax.annotation.Nonnull
    private PrincipalsInput principal;

    /** Type of access to the shared object */
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

    public SharePermissionsInput() {}

    public SharePermissionsInput principal(@javax.annotation.Nonnull PrincipalsInput principal) {
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

    public SharePermissionsInput shareMode(@javax.annotation.Nonnull ShareModeEnum shareMode) {
        this.shareMode = shareMode;
        return this;
    }

    /**
     * Type of access to the shared object
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SharePermissionsInput sharePermissionsInput = (SharePermissionsInput) o;
        return Objects.equals(this.principal, sharePermissionsInput.principal)
                && Objects.equals(this.shareMode, sharePermissionsInput.shareMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principal, shareMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SharePermissionsInput {\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
        sb.append("    shareMode: ").append(toIndentedString(shareMode)).append("\n");
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
     * @throws IOException if the JSON Element is invalid with respect to SharePermissionsInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SharePermissionsInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SharePermissionsInput is not found in"
                                        + " the empty JSON string",
                                SharePermissionsInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SharePermissionsInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SharePermissionsInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : SharePermissionsInput.openapiRequiredFields) {
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
            if (!SharePermissionsInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SharePermissionsInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SharePermissionsInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SharePermissionsInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SharePermissionsInput>() {
                        @Override
                        public void write(JsonWriter out, SharePermissionsInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SharePermissionsInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SharePermissionsInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SharePermissionsInput
     * @throws IOException if the JSON string is invalid with respect to SharePermissionsInput
     */
    public static SharePermissionsInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SharePermissionsInput.class);
    }

    /**
     * Convert an instance of SharePermissionsInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
