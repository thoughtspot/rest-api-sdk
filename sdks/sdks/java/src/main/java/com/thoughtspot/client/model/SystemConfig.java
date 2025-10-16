/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
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

/** SystemConfig */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SystemConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ONBOARDING_CONTENT_URL = "onboarding_content_url";

    @SerializedName(SERIALIZED_NAME_ONBOARDING_CONTENT_URL)
    @javax.annotation.Nullable
    private String onboardingContentUrl;

    public SystemConfig() {}

    public SystemConfig onboardingContentUrl(
            @javax.annotation.Nullable String onboardingContentUrl) {
        this.onboardingContentUrl = onboardingContentUrl;
        return this;
    }

    /**
     * Get onboardingContentUrl
     *
     * @return onboardingContentUrl
     */
    @javax.annotation.Nullable
    public String getOnboardingContentUrl() {
        return onboardingContentUrl;
    }

    public void setOnboardingContentUrl(@javax.annotation.Nullable String onboardingContentUrl) {
        this.onboardingContentUrl = onboardingContentUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemConfig systemConfig = (SystemConfig) o;
        return Objects.equals(this.onboardingContentUrl, systemConfig.onboardingContentUrl);
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
        return Objects.hash(onboardingContentUrl);
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
        sb.append("class SystemConfig {\n");
        sb.append("    onboardingContentUrl: ")
                .append(toIndentedString(onboardingContentUrl))
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
        openapiFields.add("onboarding_content_url");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SystemConfig
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SystemConfig.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SystemConfig is not found in the"
                                        + " empty JSON string",
                                SystemConfig.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SystemConfig.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SystemConfig` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("onboarding_content_url") != null
                        && !jsonObj.get("onboarding_content_url").isJsonNull())
                && !jsonObj.get("onboarding_content_url").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `onboarding_content_url` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("onboarding_content_url").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SystemConfig.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SystemConfig' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SystemConfig> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SystemConfig.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SystemConfig>() {
                        @Override
                        public void write(JsonWriter out, SystemConfig value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SystemConfig read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SystemConfig given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SystemConfig
     * @throws IOException if the JSON string is invalid with respect to SystemConfig
     */
    public static SystemConfig fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SystemConfig.class);
    }

    /**
     * Convert an instance of SystemConfig to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
