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

/** Input for cluster-level security preferences configuration. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SecuritySettingsClusterPreferencesInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ENABLE_PARTITIONED_COOKIES =
            "enable_partitioned_cookies";

    @SerializedName(SERIALIZED_NAME_ENABLE_PARTITIONED_COOKIES)
    @javax.annotation.Nullable
    private Boolean enablePartitionedCookies;

    public static final String SERIALIZED_NAME_CORS_WHITELISTED_URLS = "cors_whitelisted_urls";

    @SerializedName(SERIALIZED_NAME_CORS_WHITELISTED_URLS)
    @javax.annotation.Nullable
    private List<String> corsWhitelistedUrls;

    public static final String SERIALIZED_NAME_CSP_SETTINGS = "csp_settings";

    @SerializedName(SERIALIZED_NAME_CSP_SETTINGS)
    @javax.annotation.Nullable
    private CspSettingsInput cspSettings;

    public static final String SERIALIZED_NAME_SAML_REDIRECT_URLS = "saml_redirect_urls";

    @SerializedName(SERIALIZED_NAME_SAML_REDIRECT_URLS)
    @javax.annotation.Nullable
    private List<String> samlRedirectUrls;

    public static final String SERIALIZED_NAME_NON_EMBED_ACCESS = "non_embed_access";

    @SerializedName(SERIALIZED_NAME_NON_EMBED_ACCESS)
    @javax.annotation.Nullable
    private ClusterNonEmbedAccessInput nonEmbedAccess;

    public SecuritySettingsClusterPreferencesInput() {}

    public SecuritySettingsClusterPreferencesInput enablePartitionedCookies(
            @javax.annotation.Nullable Boolean enablePartitionedCookies) {
        this.enablePartitionedCookies = enablePartitionedCookies;
        return this;
    }

    /**
     * Support embedded access when third-party cookies are blocked.
     *
     * @return enablePartitionedCookies
     */
    @javax.annotation.Nullable
    public Boolean getEnablePartitionedCookies() {
        return enablePartitionedCookies;
    }

    public void setEnablePartitionedCookies(
            @javax.annotation.Nullable Boolean enablePartitionedCookies) {
        this.enablePartitionedCookies = enablePartitionedCookies;
    }

    public SecuritySettingsClusterPreferencesInput corsWhitelistedUrls(
            @javax.annotation.Nullable List<String> corsWhitelistedUrls) {
        this.corsWhitelistedUrls = corsWhitelistedUrls;
        return this;
    }

    public SecuritySettingsClusterPreferencesInput addCorsWhitelistedUrlsItem(
            String corsWhitelistedUrlsItem) {
        if (this.corsWhitelistedUrls == null) {
            this.corsWhitelistedUrls = new ArrayList<>();
        }
        this.corsWhitelistedUrls.add(corsWhitelistedUrlsItem);
        return this;
    }

    /**
     * Allowed origins for CORS.
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

    public SecuritySettingsClusterPreferencesInput cspSettings(
            @javax.annotation.Nullable CspSettingsInput cspSettings) {
        this.cspSettings = cspSettings;
        return this;
    }

    /**
     * Get cspSettings
     *
     * @return cspSettings
     */
    @javax.annotation.Nullable
    public CspSettingsInput getCspSettings() {
        return cspSettings;
    }

    public void setCspSettings(@javax.annotation.Nullable CspSettingsInput cspSettings) {
        this.cspSettings = cspSettings;
    }

    public SecuritySettingsClusterPreferencesInput samlRedirectUrls(
            @javax.annotation.Nullable List<String> samlRedirectUrls) {
        this.samlRedirectUrls = samlRedirectUrls;
        return this;
    }

    public SecuritySettingsClusterPreferencesInput addSamlRedirectUrlsItem(
            String samlRedirectUrlsItem) {
        if (this.samlRedirectUrls == null) {
            this.samlRedirectUrls = new ArrayList<>();
        }
        this.samlRedirectUrls.add(samlRedirectUrlsItem);
        return this;
    }

    /**
     * Allowed redirect hosts for SAML login.
     *
     * @return samlRedirectUrls
     */
    @javax.annotation.Nullable
    public List<String> getSamlRedirectUrls() {
        return samlRedirectUrls;
    }

    public void setSamlRedirectUrls(@javax.annotation.Nullable List<String> samlRedirectUrls) {
        this.samlRedirectUrls = samlRedirectUrls;
    }

    public SecuritySettingsClusterPreferencesInput nonEmbedAccess(
            @javax.annotation.Nullable ClusterNonEmbedAccessInput nonEmbedAccess) {
        this.nonEmbedAccess = nonEmbedAccess;
        return this;
    }

    /**
     * Get nonEmbedAccess
     *
     * @return nonEmbedAccess
     */
    @javax.annotation.Nullable
    public ClusterNonEmbedAccessInput getNonEmbedAccess() {
        return nonEmbedAccess;
    }

    public void setNonEmbedAccess(
            @javax.annotation.Nullable ClusterNonEmbedAccessInput nonEmbedAccess) {
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
        SecuritySettingsClusterPreferencesInput securitySettingsClusterPreferencesInput =
                (SecuritySettingsClusterPreferencesInput) o;
        return Objects.equals(
                        this.enablePartitionedCookies,
                        securitySettingsClusterPreferencesInput.enablePartitionedCookies)
                && Objects.equals(
                        this.corsWhitelistedUrls,
                        securitySettingsClusterPreferencesInput.corsWhitelistedUrls)
                && Objects.equals(
                        this.cspSettings, securitySettingsClusterPreferencesInput.cspSettings)
                && Objects.equals(
                        this.samlRedirectUrls,
                        securitySettingsClusterPreferencesInput.samlRedirectUrls)
                && Objects.equals(
                        this.nonEmbedAccess,
                        securitySettingsClusterPreferencesInput.nonEmbedAccess);
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
        return Objects.hash(
                enablePartitionedCookies,
                corsWhitelistedUrls,
                cspSettings,
                samlRedirectUrls,
                nonEmbedAccess);
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
        sb.append("class SecuritySettingsClusterPreferencesInput {\n");
        sb.append("    enablePartitionedCookies: ")
                .append(toIndentedString(enablePartitionedCookies))
                .append("\n");
        sb.append("    corsWhitelistedUrls: ")
                .append(toIndentedString(corsWhitelistedUrls))
                .append("\n");
        sb.append("    cspSettings: ").append(toIndentedString(cspSettings)).append("\n");
        sb.append("    samlRedirectUrls: ").append(toIndentedString(samlRedirectUrls)).append("\n");
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
        openapiFields.add("enable_partitioned_cookies");
        openapiFields.add("cors_whitelisted_urls");
        openapiFields.add("csp_settings");
        openapiFields.add("saml_redirect_urls");
        openapiFields.add("non_embed_access");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     SecuritySettingsClusterPreferencesInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SecuritySettingsClusterPreferencesInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                        + " SecuritySettingsClusterPreferencesInput is not found in"
                                        + " the empty JSON string",
                                SecuritySettingsClusterPreferencesInput.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SecuritySettingsClusterPreferencesInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SecuritySettingsClusterPreferencesInput` properties."
                                        + " JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
        // validate the optional field `csp_settings`
        if (jsonObj.get("csp_settings") != null && !jsonObj.get("csp_settings").isJsonNull()) {
            CspSettingsInput.validateJsonElement(jsonObj.get("csp_settings"));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("saml_redirect_urls") != null
                && !jsonObj.get("saml_redirect_urls").isJsonNull()
                && !jsonObj.get("saml_redirect_urls").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `saml_redirect_urls` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("saml_redirect_urls").toString()));
        }
        // validate the optional field `non_embed_access`
        if (jsonObj.get("non_embed_access") != null
                && !jsonObj.get("non_embed_access").isJsonNull()) {
            ClusterNonEmbedAccessInput.validateJsonElement(jsonObj.get("non_embed_access"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SecuritySettingsClusterPreferencesInput.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes 'SecuritySettingsClusterPreferencesInput'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SecuritySettingsClusterPreferencesInput> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(SecuritySettingsClusterPreferencesInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SecuritySettingsClusterPreferencesInput>() {
                        @Override
                        public void write(
                                JsonWriter out, SecuritySettingsClusterPreferencesInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SecuritySettingsClusterPreferencesInput read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SecuritySettingsClusterPreferencesInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SecuritySettingsClusterPreferencesInput
     * @throws IOException if the JSON string is invalid with respect to
     *     SecuritySettingsClusterPreferencesInput
     */
    public static SecuritySettingsClusterPreferencesInput fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, SecuritySettingsClusterPreferencesInput.class);
    }

    /**
     * Convert an instance of SecuritySettingsClusterPreferencesInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
