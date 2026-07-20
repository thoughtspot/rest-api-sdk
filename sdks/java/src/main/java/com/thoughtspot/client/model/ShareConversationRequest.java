/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
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

/** ShareConversationRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ShareConversationRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_REFRESH_SHARED_CONTENT = "refresh_shared_content";

    @SerializedName(SERIALIZED_NAME_REFRESH_SHARED_CONTENT)
    @javax.annotation.Nullable
    private Boolean refreshSharedContent = false;

    public static final String SERIALIZED_NAME_GRANT = "grant";

    @SerializedName(SERIALIZED_NAME_GRANT)
    @javax.annotation.Nonnull
    private List<PrincipalRefInput> grant = new ArrayList<>();

    public static final String SERIALIZED_NAME_REVOKE = "revoke";

    @SerializedName(SERIALIZED_NAME_REVOKE)
    @javax.annotation.Nonnull
    private List<PrincipalRefInput> revoke = new ArrayList<>();

    public static final String SERIALIZED_NAME_NOTIFY_ON_SHARE = "notify_on_share";

    @SerializedName(SERIALIZED_NAME_NOTIFY_ON_SHARE)
    @javax.annotation.Nullable
    private Boolean notifyOnShare = true;

    public ShareConversationRequest() {}

    public ShareConversationRequest refreshSharedContent(
            @javax.annotation.Nullable Boolean refreshSharedContent) {
        this.refreshSharedContent = refreshSharedContent;
        return this;
    }

    /**
     * When &#x60;true&#x60;, always regenerates the shared view from the latest conversation state,
     * even if one already exists. When &#x60;false&#x60; (default), reuses the existing shared
     * view.
     *
     * @return refreshSharedContent
     */
    @javax.annotation.Nullable
    public Boolean getRefreshSharedContent() {
        return refreshSharedContent;
    }

    public void setRefreshSharedContent(@javax.annotation.Nullable Boolean refreshSharedContent) {
        this.refreshSharedContent = refreshSharedContent;
    }

    public ShareConversationRequest grant(@javax.annotation.Nonnull List<PrincipalRefInput> grant) {
        this.grant = grant;
        return this;
    }

    public ShareConversationRequest addGrantItem(PrincipalRefInput grantItem) {
        if (this.grant == null) {
            this.grant = new ArrayList<>();
        }
        this.grant.add(grantItem);
        return this;
    }

    /**
     * Principals to grant read-only access to the conversation.
     *
     * @return grant
     */
    @javax.annotation.Nonnull
    public List<PrincipalRefInput> getGrant() {
        return grant;
    }

    public void setGrant(@javax.annotation.Nonnull List<PrincipalRefInput> grant) {
        this.grant = grant;
    }

    public ShareConversationRequest revoke(
            @javax.annotation.Nonnull List<PrincipalRefInput> revoke) {
        this.revoke = revoke;
        return this;
    }

    public ShareConversationRequest addRevokeItem(PrincipalRefInput revokeItem) {
        if (this.revoke == null) {
            this.revoke = new ArrayList<>();
        }
        this.revoke.add(revokeItem);
        return this;
    }

    /**
     * Principals to revoke access from the conversation.
     *
     * @return revoke
     */
    @javax.annotation.Nonnull
    public List<PrincipalRefInput> getRevoke() {
        return revoke;
    }

    public void setRevoke(@javax.annotation.Nonnull List<PrincipalRefInput> revoke) {
        this.revoke = revoke;
    }

    public ShareConversationRequest notifyOnShare(
            @javax.annotation.Nullable Boolean notifyOnShare) {
        this.notifyOnShare = notifyOnShare;
        return this;
    }

    /**
     * &lt;div&gt;Version: 26.10.0.cl or later &lt;/div&gt; When &#x60;true&#x60; (default), newly
     * granted principals are notified of the share. When &#x60;false&#x60;, access is granted
     * without sending a notification. Has no effect on principals passed in &#x60;revoke&#x60;.
     * Does not re-notify a principal who already had access.
     *
     * @return notifyOnShare
     */
    @javax.annotation.Nullable
    public Boolean getNotifyOnShare() {
        return notifyOnShare;
    }

    public void setNotifyOnShare(@javax.annotation.Nullable Boolean notifyOnShare) {
        this.notifyOnShare = notifyOnShare;
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
     * @return the ShareConversationRequest instance itself
     */
    public ShareConversationRequest putAdditionalProperty(String key, Object value) {
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
        ShareConversationRequest shareConversationRequest = (ShareConversationRequest) o;
        return Objects.equals(
                        this.refreshSharedContent, shareConversationRequest.refreshSharedContent)
                && Objects.equals(this.grant, shareConversationRequest.grant)
                && Objects.equals(this.revoke, shareConversationRequest.revoke)
                && Objects.equals(this.notifyOnShare, shareConversationRequest.notifyOnShare)
                && Objects.equals(
                        this.additionalProperties, shareConversationRequest.additionalProperties);
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
                refreshSharedContent, grant, revoke, notifyOnShare, additionalProperties);
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
        sb.append("class ShareConversationRequest {\n");
        sb.append("    refreshSharedContent: ")
                .append(toIndentedString(refreshSharedContent))
                .append("\n");
        sb.append("    grant: ").append(toIndentedString(grant)).append("\n");
        sb.append("    revoke: ").append(toIndentedString(revoke)).append("\n");
        sb.append("    notifyOnShare: ").append(toIndentedString(notifyOnShare)).append("\n");
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
        openapiFields.add("refresh_shared_content");
        openapiFields.add("grant");
        openapiFields.add("revoke");
        openapiFields.add("notify_on_share");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("grant");
        openapiRequiredFields.add("revoke");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ShareConversationRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ShareConversationRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ShareConversationRequest is not found"
                                        + " in the empty JSON string",
                                ShareConversationRequest.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ShareConversationRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the json data is an array
        if (!jsonObj.get("grant").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `grant` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("grant").toString()));
        }

        JsonArray jsonArraygrant = jsonObj.getAsJsonArray("grant");
        // validate the required field `grant` (array)
        for (int i = 0; i < jsonArraygrant.size(); i++) {
            PrincipalRefInput.validateJsonElement(jsonArraygrant.get(i));
        }
        ;
        // ensure the json data is an array
        if (!jsonObj.get("revoke").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `revoke` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("revoke").toString()));
        }

        JsonArray jsonArrayrevoke = jsonObj.getAsJsonArray("revoke");
        // validate the required field `revoke` (array)
        for (int i = 0; i < jsonArrayrevoke.size(); i++) {
            PrincipalRefInput.validateJsonElement(jsonArrayrevoke.get(i));
        }
        ;
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ShareConversationRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ShareConversationRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ShareConversationRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ShareConversationRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ShareConversationRequest>() {
                        @Override
                        public void write(JsonWriter out, ShareConversationRequest value)
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
                        public ShareConversationRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            ShareConversationRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of ShareConversationRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ShareConversationRequest
     * @throws IOException if the JSON string is invalid with respect to ShareConversationRequest
     */
    public static ShareConversationRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ShareConversationRequest.class);
    }

    /**
     * Convert an instance of ShareConversationRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
