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

/** SearchSecuritySettingsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SearchSecuritySettingsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Scope of security settings to retrieve. CLUSTER returns cluster-level settings, ORG returns
     * org-level settings for the current org. If not specified, returns both cluster and org
     * settings based on user privileges.
     */
    @JsonAdapter(ScopeEnum.Adapter.class)
    public enum ScopeEnum {
        CLUSTER("CLUSTER"),

        ORG("ORG");

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
    private ScopeEnum scope;

    public SearchSecuritySettingsRequest() {}

    public SearchSecuritySettingsRequest scope(@javax.annotation.Nullable ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Scope of security settings to retrieve. CLUSTER returns cluster-level settings, ORG returns
     * org-level settings for the current org. If not specified, returns both cluster and org
     * settings based on user privileges.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchSecuritySettingsRequest searchSecuritySettingsRequest =
                (SearchSecuritySettingsRequest) o;
        return Objects.equals(this.scope, searchSecuritySettingsRequest.scope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchSecuritySettingsRequest {\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
     *     SearchSecuritySettingsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SearchSecuritySettingsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SearchSecuritySettingsRequest is not"
                                        + " found in the empty JSON string",
                                SearchSecuritySettingsRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SearchSecuritySettingsRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SearchSecuritySettingsRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
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
            if (!SearchSecuritySettingsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SearchSecuritySettingsRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SearchSecuritySettingsRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(SearchSecuritySettingsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SearchSecuritySettingsRequest>() {
                        @Override
                        public void write(JsonWriter out, SearchSecuritySettingsRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SearchSecuritySettingsRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SearchSecuritySettingsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SearchSecuritySettingsRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     SearchSecuritySettingsRequest
     */
    public static SearchSecuritySettingsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SearchSecuritySettingsRequest.class);
    }

    /**
     * Convert an instance of SearchSecuritySettingsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
