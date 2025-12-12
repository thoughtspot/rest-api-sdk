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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** Script-src CSP settings. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ScriptSrcUrls implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    @javax.annotation.Nullable
    private Boolean enabled;

    public static final String SERIALIZED_NAME_URLS = "urls";

    @SerializedName(SERIALIZED_NAME_URLS)
    @javax.annotation.Nullable
    private List<String> urls;

    public ScriptSrcUrls() {}

    public ScriptSrcUrls enabled(@javax.annotation.Nullable Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Whether script-src customization is enabled.
     *
     * @return enabled
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(@javax.annotation.Nullable Boolean enabled) {
        this.enabled = enabled;
    }

    public ScriptSrcUrls urls(@javax.annotation.Nullable List<String> urls) {
        this.urls = urls;
        return this;
    }

    public ScriptSrcUrls addUrlsItem(String urlsItem) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    /**
     * Allowed URLs for script-src directive. Can only be set if enabled is true.
     *
     * @return urls
     */
    @javax.annotation.Nullable
    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(@javax.annotation.Nullable List<String> urls) {
        this.urls = urls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScriptSrcUrls scriptSrcUrls = (ScriptSrcUrls) o;
        return Objects.equals(this.enabled, scriptSrcUrls.enabled)
                && Objects.equals(this.urls, scriptSrcUrls.urls);
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
        return Objects.hash(enabled, urls);
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
        sb.append("class ScriptSrcUrls {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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
        openapiFields.add("enabled");
        openapiFields.add("urls");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ScriptSrcUrls
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ScriptSrcUrls.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ScriptSrcUrls is not found in the"
                                        + " empty JSON string",
                                ScriptSrcUrls.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ScriptSrcUrls.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ScriptSrcUrls` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("urls") != null
                && !jsonObj.get("urls").isJsonNull()
                && !jsonObj.get("urls").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `urls` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("urls").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ScriptSrcUrls.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ScriptSrcUrls' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ScriptSrcUrls> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ScriptSrcUrls.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ScriptSrcUrls>() {
                        @Override
                        public void write(JsonWriter out, ScriptSrcUrls value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ScriptSrcUrls read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ScriptSrcUrls given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ScriptSrcUrls
     * @throws IOException if the JSON string is invalid with respect to ScriptSrcUrls
     */
    public static ScriptSrcUrls fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ScriptSrcUrls.class);
    }

    /**
     * Convert an instance of ScriptSrcUrls to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
