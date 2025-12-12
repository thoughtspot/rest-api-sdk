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

/**
 * Input for org-level security preferences configuration. Note: cross-org operations are not
 * supported currently.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SecuritySettingsOrgPreferencesInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ORG_IDENTIFIER = "org_identifier";

    @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIER)
    @javax.annotation.Nonnull
    private String orgIdentifier;

    public static final String SERIALIZED_NAME_CORS_WHITELISTED_URLS = "cors_whitelisted_urls";

    @SerializedName(SERIALIZED_NAME_CORS_WHITELISTED_URLS)
    @javax.annotation.Nullable
    private List<String> corsWhitelistedUrls;

    public static final String SERIALIZED_NAME_NON_EMBED_ACCESS = "non_embed_access";

    @SerializedName(SERIALIZED_NAME_NON_EMBED_ACCESS)
    @javax.annotation.Nullable
    private OrgNonEmbedAccessInput nonEmbedAccess;

    public SecuritySettingsOrgPreferencesInput() {}

    public SecuritySettingsOrgPreferencesInput orgIdentifier(
            @javax.annotation.Nonnull String orgIdentifier) {
        this.orgIdentifier = orgIdentifier;
        return this;
    }

    /**
     * Unique identifier or name of the org
     *
     * @return orgIdentifier
     */
    @javax.annotation.Nonnull
    public String getOrgIdentifier() {
        return orgIdentifier;
    }

    public void setOrgIdentifier(@javax.annotation.Nonnull String orgIdentifier) {
        this.orgIdentifier = orgIdentifier;
    }

    public SecuritySettingsOrgPreferencesInput corsWhitelistedUrls(
            @javax.annotation.Nullable List<String> corsWhitelistedUrls) {
        this.corsWhitelistedUrls = corsWhitelistedUrls;
        return this;
    }

    public SecuritySettingsOrgPreferencesInput addCorsWhitelistedUrlsItem(
            String corsWhitelistedUrlsItem) {
        if (this.corsWhitelistedUrls == null) {
            this.corsWhitelistedUrls = new ArrayList<>();
        }
        this.corsWhitelistedUrls.add(corsWhitelistedUrlsItem);
        return this;
    }

    /**
     * Allowed origins for CORS for this org.
     *
     * @return corsWhitelistedUrls
     */
    @javax.annotation.Nullable
    public List<String> getCorsWhitelistedUrls() {
        return corsWhitelistedUrls;
    }

    public void setCorsWhitelistedUrls(
            @javax.annotation.Nullable List<String> corsWhitelistedUrls) {
        this.corsWhitelistedUrls = corsWhitelistedUrls;
    }

    public SecuritySettingsOrgPreferencesInput nonEmbedAccess(
            @javax.annotation.Nullable OrgNonEmbedAccessInput nonEmbedAccess) {
        this.nonEmbedAccess = nonEmbedAccess;
        return this;
    }

    /**
     * Get nonEmbedAccess
     *
     * @return nonEmbedAccess
     */
    @javax.annotation.Nullable
    public OrgNonEmbedAccessInput getNonEmbedAccess() {
        return nonEmbedAccess;
    }

    public void setNonEmbedAccess(
            @javax.annotation.Nullable OrgNonEmbedAccessInput nonEmbedAccess) {
        this.nonEmbedAccess = nonEmbedAccess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecuritySettingsOrgPreferencesInput securitySettingsOrgPreferencesInput =
                (SecuritySettingsOrgPreferencesInput) o;
        return Objects.equals(this.orgIdentifier, securitySettingsOrgPreferencesInput.orgIdentifier)
                && Objects.equals(
                        this.corsWhitelistedUrls,
                        securitySettingsOrgPreferencesInput.corsWhitelistedUrls)
                && Objects.equals(
                        this.nonEmbedAccess, securitySettingsOrgPreferencesInput.nonEmbedAccess);
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
        return Objects.hash(orgIdentifier, corsWhitelistedUrls, nonEmbedAccess);
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
        sb.append("class SecuritySettingsOrgPreferencesInput {\n");
        sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
        sb.append("    corsWhitelistedUrls: ")
                .append(toIndentedString(corsWhitelistedUrls))
                .append("\n");
        sb.append("    nonEmbedAccess: ").append(toIndentedString(nonEmbedAccess)).append("\n");
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
        openapiFields.add("org_identifier");
        openapiFields.add("cors_whitelisted_urls");
        openapiFields.add("non_embed_access");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("org_identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     SecuritySettingsOrgPreferencesInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SecuritySettingsOrgPreferencesInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SecuritySettingsOrgPreferencesInput"
                                        + " is not found in the empty JSON string",
                                SecuritySettingsOrgPreferencesInput.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SecuritySettingsOrgPreferencesInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SecuritySettingsOrgPreferencesInput` properties. JSON:"
                                        + " %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : SecuritySettingsOrgPreferencesInput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("org_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `org_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("org_identifier").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("cors_whitelisted_urls") != null
                && !jsonObj.get("cors_whitelisted_urls").isJsonNull()
                && !jsonObj.get("cors_whitelisted_urls").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `cors_whitelisted_urls` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("cors_whitelisted_urls").toString()));
        }
        // validate the optional field `non_embed_access`
        if (jsonObj.get("non_embed_access") != null
                && !jsonObj.get("non_embed_access").isJsonNull()) {
            OrgNonEmbedAccessInput.validateJsonElement(jsonObj.get("non_embed_access"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SecuritySettingsOrgPreferencesInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SecuritySettingsOrgPreferencesInput' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SecuritySettingsOrgPreferencesInput> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(SecuritySettingsOrgPreferencesInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SecuritySettingsOrgPreferencesInput>() {
                        @Override
                        public void write(JsonWriter out, SecuritySettingsOrgPreferencesInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SecuritySettingsOrgPreferencesInput read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SecuritySettingsOrgPreferencesInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SecuritySettingsOrgPreferencesInput
     * @throws IOException if the JSON string is invalid with respect to
     *     SecuritySettingsOrgPreferencesInput
     */
    public static SecuritySettingsOrgPreferencesInput fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, SecuritySettingsOrgPreferencesInput.class);
    }

    /**
     * Convert an instance of SecuritySettingsOrgPreferencesInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
