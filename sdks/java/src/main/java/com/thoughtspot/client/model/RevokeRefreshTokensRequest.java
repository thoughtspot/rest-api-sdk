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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** RevokeRefreshTokensRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class RevokeRefreshTokensRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONFIGURATION_IDENTIFIERS =
            "configuration_identifiers";

    @SerializedName(SERIALIZED_NAME_CONFIGURATION_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> configurationIdentifiers;

    public static final String SERIALIZED_NAME_USER_IDENTIFIERS = "user_identifiers";

    @SerializedName(SERIALIZED_NAME_USER_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> userIdentifiers;

    public static final String SERIALIZED_NAME_ORG_IDENTIFIERS = "org_identifiers";

    @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> orgIdentifiers;

    public RevokeRefreshTokensRequest() {}

    public RevokeRefreshTokensRequest configurationIdentifiers(
            @javax.annotation.Nullable List<String> configurationIdentifiers) {
        this.configurationIdentifiers = configurationIdentifiers;
        return this;
    }

    public RevokeRefreshTokensRequest addConfigurationIdentifiersItem(
            String configurationIdentifiersItem) {
        if (this.configurationIdentifiers == null) {
            this.configurationIdentifiers = new ArrayList<>();
        }
        this.configurationIdentifiers.add(configurationIdentifiersItem);
        return this;
    }

    /**
     * Unique ID or name of the configuration. When provided, the refresh tokens of the users
     * associated with the connection configuration will be revoked.
     *
     * @return configurationIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getConfigurationIdentifiers() {
        return configurationIdentifiers;
    }

    public void setConfigurationIdentifiers(
            @javax.annotation.Nullable List<String> configurationIdentifiers) {
        this.configurationIdentifiers = configurationIdentifiers;
    }

    public RevokeRefreshTokensRequest userIdentifiers(
            @javax.annotation.Nullable List<String> userIdentifiers) {
        this.userIdentifiers = userIdentifiers;
        return this;
    }

    public RevokeRefreshTokensRequest addUserIdentifiersItem(String userIdentifiersItem) {
        if (this.userIdentifiers == null) {
            this.userIdentifiers = new ArrayList<>();
        }
        this.userIdentifiers.add(userIdentifiersItem);
        return this;
    }

    /**
     * Unique ID or name of the users. When provided, the refresh tokens of the specified users will
     * be revoked. If the request includes the user ID or name of the connection author, their token
     * will also be revoked.
     *
     * @return userIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getUserIdentifiers() {
        return userIdentifiers;
    }

    public void setUserIdentifiers(@javax.annotation.Nullable List<String> userIdentifiers) {
        this.userIdentifiers = userIdentifiers;
    }

    public RevokeRefreshTokensRequest orgIdentifiers(
            @javax.annotation.Nullable List<String> orgIdentifiers) {
        this.orgIdentifiers = orgIdentifiers;
        return this;
    }

    public RevokeRefreshTokensRequest addOrgIdentifiersItem(String orgIdentifiersItem) {
        if (this.orgIdentifiers == null) {
            this.orgIdentifiers = new ArrayList<>();
        }
        this.orgIdentifiers.add(orgIdentifiersItem);
        return this;
    }

    /**
     * Unique ID or name of the Org. When provided, the refresh tokens of all users associated with
     * the published connection in the Org will be revoked. This parameter is valid only for
     * published connections. Using it with unpublished connections will result in an error.
     *
     * @return orgIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getOrgIdentifiers() {
        return orgIdentifiers;
    }

    public void setOrgIdentifiers(@javax.annotation.Nullable List<String> orgIdentifiers) {
        this.orgIdentifiers = orgIdentifiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RevokeRefreshTokensRequest revokeRefreshTokensRequest = (RevokeRefreshTokensRequest) o;
        return Objects.equals(
                        this.configurationIdentifiers,
                        revokeRefreshTokensRequest.configurationIdentifiers)
                && Objects.equals(this.userIdentifiers, revokeRefreshTokensRequest.userIdentifiers)
                && Objects.equals(this.orgIdentifiers, revokeRefreshTokensRequest.orgIdentifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurationIdentifiers, userIdentifiers, orgIdentifiers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RevokeRefreshTokensRequest {\n");
        sb.append("    configurationIdentifiers: ")
                .append(toIndentedString(configurationIdentifiers))
                .append("\n");
        sb.append("    userIdentifiers: ").append(toIndentedString(userIdentifiers)).append("\n");
        sb.append("    orgIdentifiers: ").append(toIndentedString(orgIdentifiers)).append("\n");
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
        openapiFields.add("configuration_identifiers");
        openapiFields.add("user_identifiers");
        openapiFields.add("org_identifiers");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to RevokeRefreshTokensRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!RevokeRefreshTokensRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in RevokeRefreshTokensRequest is not"
                                        + " found in the empty JSON string",
                                RevokeRefreshTokensRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!RevokeRefreshTokensRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `RevokeRefreshTokensRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("configuration_identifiers") != null
                && !jsonObj.get("configuration_identifiers").isJsonNull()
                && !jsonObj.get("configuration_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `configuration_identifiers` to be an array in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("configuration_identifiers").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("user_identifiers") != null
                && !jsonObj.get("user_identifiers").isJsonNull()
                && !jsonObj.get("user_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `user_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("user_identifiers").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("org_identifiers") != null
                && !jsonObj.get("org_identifiers").isJsonNull()
                && !jsonObj.get("org_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `org_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("org_identifiers").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RevokeRefreshTokensRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RevokeRefreshTokensRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RevokeRefreshTokensRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(RevokeRefreshTokensRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<RevokeRefreshTokensRequest>() {
                        @Override
                        public void write(JsonWriter out, RevokeRefreshTokensRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public RevokeRefreshTokensRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of RevokeRefreshTokensRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RevokeRefreshTokensRequest
     * @throws IOException if the JSON string is invalid with respect to RevokeRefreshTokensRequest
     */
    public static RevokeRefreshTokensRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RevokeRefreshTokensRequest.class);
    }

    /**
     * Convert an instance of RevokeRefreshTokensRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
