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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Cluster-level security preferences. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SecuritySettingsClusterPreferences implements Serializable {
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
    private CspSettings cspSettings;

    public static final String SERIALIZED_NAME_SAML_REDIRECT_URLS = "saml_redirect_urls";

    @SerializedName(SERIALIZED_NAME_SAML_REDIRECT_URLS)
    @javax.annotation.Nullable
    private List<String> samlRedirectUrls;

    public static final String SERIALIZED_NAME_NON_EMBED_ACCESS = "non_embed_access";

    @SerializedName(SERIALIZED_NAME_NON_EMBED_ACCESS)
    @javax.annotation.Nullable
    private ClusterNonEmbedAccess nonEmbedAccess;

    public SecuritySettingsClusterPreferences() {}

    public SecuritySettingsClusterPreferences enablePartitionedCookies(
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

    public SecuritySettingsClusterPreferences corsWhitelistedUrls(
            @javax.annotation.Nullable List<String> corsWhitelistedUrls) {
        this.corsWhitelistedUrls = corsWhitelistedUrls;
        return this;
    }

    public SecuritySettingsClusterPreferences addCorsWhitelistedUrlsItem(
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

    public SecuritySettingsClusterPreferences cspSettings(
            @javax.annotation.Nullable CspSettings cspSettings) {
        this.cspSettings = cspSettings;
        return this;
    }

    /**
     * Get cspSettings
     *
     * @return cspSettings
     */
    @javax.annotation.Nullable
    public CspSettings getCspSettings() {
        return cspSettings;
    }

    public void setCspSettings(@javax.annotation.Nullable CspSettings cspSettings) {
        this.cspSettings = cspSettings;
    }

    public SecuritySettingsClusterPreferences samlRedirectUrls(
            @javax.annotation.Nullable List<String> samlRedirectUrls) {
        this.samlRedirectUrls = samlRedirectUrls;
        return this;
    }

    public SecuritySettingsClusterPreferences addSamlRedirectUrlsItem(String samlRedirectUrlsItem) {
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

    public SecuritySettingsClusterPreferences nonEmbedAccess(
            @javax.annotation.Nullable ClusterNonEmbedAccess nonEmbedAccess) {
        this.nonEmbedAccess = nonEmbedAccess;
        return this;
    }

    /**
     * Get nonEmbedAccess
     *
     * @return nonEmbedAccess
     */
    @javax.annotation.Nullable
    public ClusterNonEmbedAccess getNonEmbedAccess() {
        return nonEmbedAccess;
    }

    public void setNonEmbedAccess(@javax.annotation.Nullable ClusterNonEmbedAccess nonEmbedAccess) {
        this.nonEmbedAccess = nonEmbedAccess;
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
     * @return the SecuritySettingsClusterPreferences instance itself
     */
    public SecuritySettingsClusterPreferences putAdditionalProperty(String key, Object value) {
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
        SecuritySettingsClusterPreferences securitySettingsClusterPreferences =
                (SecuritySettingsClusterPreferences) o;
        return Objects.equals(
                        this.enablePartitionedCookies,
                        securitySettingsClusterPreferences.enablePartitionedCookies)
                && Objects.equals(
                        this.corsWhitelistedUrls,
                        securitySettingsClusterPreferences.corsWhitelistedUrls)
                && Objects.equals(this.cspSettings, securitySettingsClusterPreferences.cspSettings)
                && Objects.equals(
                        this.samlRedirectUrls, securitySettingsClusterPreferences.samlRedirectUrls)
                && Objects.equals(
                        this.nonEmbedAccess, securitySettingsClusterPreferences.nonEmbedAccess)
                && Objects.equals(
                        this.additionalProperties,
                        securitySettingsClusterPreferences.additionalProperties);
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
                nonEmbedAccess,
                additionalProperties);
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
        sb.append("class SecuritySettingsClusterPreferences {\n");
        sb.append("    enablePartitionedCookies: ")
                .append(toIndentedString(enablePartitionedCookies))
                .append("\n");
        sb.append("    corsWhitelistedUrls: ")
                .append(toIndentedString(corsWhitelistedUrls))
                .append("\n");
        sb.append("    cspSettings: ").append(toIndentedString(cspSettings)).append("\n");
        sb.append("    samlRedirectUrls: ").append(toIndentedString(samlRedirectUrls)).append("\n");
        sb.append("    nonEmbedAccess: ").append(toIndentedString(nonEmbedAccess)).append("\n");
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
     *     SecuritySettingsClusterPreferences
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SecuritySettingsClusterPreferences.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SecuritySettingsClusterPreferences is"
                                        + " not found in the empty JSON string",
                                SecuritySettingsClusterPreferences.openapiRequiredFields
                                        .toString()));
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
            CspSettings.validateJsonElement(jsonObj.get("csp_settings"));
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
            ClusterNonEmbedAccess.validateJsonElement(jsonObj.get("non_embed_access"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SecuritySettingsClusterPreferences.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SecuritySettingsClusterPreferences' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SecuritySettingsClusterPreferences> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(SecuritySettingsClusterPreferences.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SecuritySettingsClusterPreferences>() {
                        @Override
                        public void write(JsonWriter out, SecuritySettingsClusterPreferences value)
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
                        public SecuritySettingsClusterPreferences read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            SecuritySettingsClusterPreferences instance =
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
     * Create an instance of SecuritySettingsClusterPreferences given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SecuritySettingsClusterPreferences
     * @throws IOException if the JSON string is invalid with respect to
     *     SecuritySettingsClusterPreferences
     */
    public static SecuritySettingsClusterPreferences fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, SecuritySettingsClusterPreferences.class);
    }

    /**
     * Convert an instance of SecuritySettingsClusterPreferences to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
