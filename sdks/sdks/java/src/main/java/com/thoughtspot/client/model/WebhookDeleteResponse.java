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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** WebhookDeleteResponse */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class WebhookDeleteResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DELETED_COUNT = "deleted_count";

    @SerializedName(SERIALIZED_NAME_DELETED_COUNT)
    @javax.annotation.Nonnull
    private Integer deletedCount;

    public static final String SERIALIZED_NAME_FAILED_COUNT = "failed_count";

    @SerializedName(SERIALIZED_NAME_FAILED_COUNT)
    @javax.annotation.Nonnull
    private Integer failedCount;

    public static final String SERIALIZED_NAME_DELETED_WEBHOOKS = "deleted_webhooks";

    @SerializedName(SERIALIZED_NAME_DELETED_WEBHOOKS)
    @javax.annotation.Nonnull
    private List<WebhookResponse> deletedWebhooks;

    public static final String SERIALIZED_NAME_FAILED_WEBHOOKS = "failed_webhooks";

    @SerializedName(SERIALIZED_NAME_FAILED_WEBHOOKS)
    @javax.annotation.Nonnull
    private List<WebhookDeleteFailure> failedWebhooks;

    public WebhookDeleteResponse() {}

    public WebhookDeleteResponse deletedCount(@javax.annotation.Nonnull Integer deletedCount) {
        this.deletedCount = deletedCount;
        return this;
    }

    /**
     * Number of webhooks successfully deleted.
     *
     * @return deletedCount
     */
    @javax.annotation.Nonnull
    public Integer getDeletedCount() {
        return deletedCount;
    }

    public void setDeletedCount(@javax.annotation.Nonnull Integer deletedCount) {
        this.deletedCount = deletedCount;
    }

    public WebhookDeleteResponse failedCount(@javax.annotation.Nonnull Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    /**
     * Number of webhooks that failed to delete.
     *
     * @return failedCount
     */
    @javax.annotation.Nonnull
    public Integer getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(@javax.annotation.Nonnull Integer failedCount) {
        this.failedCount = failedCount;
    }

    public WebhookDeleteResponse deletedWebhooks(
            @javax.annotation.Nonnull List<WebhookResponse> deletedWebhooks) {
        this.deletedWebhooks = deletedWebhooks;
        return this;
    }

    public WebhookDeleteResponse addDeletedWebhooksItem(WebhookResponse deletedWebhooksItem) {
        if (this.deletedWebhooks == null) {
            this.deletedWebhooks = new ArrayList<>();
        }
        this.deletedWebhooks.add(deletedWebhooksItem);
        return this;
    }

    /**
     * List of successfully deleted webhooks.
     *
     * @return deletedWebhooks
     */
    @javax.annotation.Nonnull
    public List<WebhookResponse> getDeletedWebhooks() {
        return deletedWebhooks;
    }

    public void setDeletedWebhooks(
            @javax.annotation.Nonnull List<WebhookResponse> deletedWebhooks) {
        this.deletedWebhooks = deletedWebhooks;
    }

    public WebhookDeleteResponse failedWebhooks(
            @javax.annotation.Nonnull List<WebhookDeleteFailure> failedWebhooks) {
        this.failedWebhooks = failedWebhooks;
        return this;
    }

    public WebhookDeleteResponse addFailedWebhooksItem(WebhookDeleteFailure failedWebhooksItem) {
        if (this.failedWebhooks == null) {
            this.failedWebhooks = new ArrayList<>();
        }
        this.failedWebhooks.add(failedWebhooksItem);
        return this;
    }

    /**
     * List of webhooks that failed to delete with error details.
     *
     * @return failedWebhooks
     */
    @javax.annotation.Nonnull
    public List<WebhookDeleteFailure> getFailedWebhooks() {
        return failedWebhooks;
    }

    public void setFailedWebhooks(
            @javax.annotation.Nonnull List<WebhookDeleteFailure> failedWebhooks) {
        this.failedWebhooks = failedWebhooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookDeleteResponse webhookDeleteResponse = (WebhookDeleteResponse) o;
        return Objects.equals(this.deletedCount, webhookDeleteResponse.deletedCount)
                && Objects.equals(this.failedCount, webhookDeleteResponse.failedCount)
                && Objects.equals(this.deletedWebhooks, webhookDeleteResponse.deletedWebhooks)
                && Objects.equals(this.failedWebhooks, webhookDeleteResponse.failedWebhooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deletedCount, failedCount, deletedWebhooks, failedWebhooks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookDeleteResponse {\n");
        sb.append("    deletedCount: ").append(toIndentedString(deletedCount)).append("\n");
        sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
        sb.append("    deletedWebhooks: ").append(toIndentedString(deletedWebhooks)).append("\n");
        sb.append("    failedWebhooks: ").append(toIndentedString(failedWebhooks)).append("\n");
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
        openapiFields.add("deleted_count");
        openapiFields.add("failed_count");
        openapiFields.add("deleted_webhooks");
        openapiFields.add("failed_webhooks");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("deleted_count");
        openapiRequiredFields.add("failed_count");
        openapiRequiredFields.add("deleted_webhooks");
        openapiRequiredFields.add("failed_webhooks");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to WebhookDeleteResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!WebhookDeleteResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in WebhookDeleteResponse is not found in"
                                        + " the empty JSON string",
                                WebhookDeleteResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!WebhookDeleteResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `WebhookDeleteResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : WebhookDeleteResponse.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the json data is an array
        if (!jsonObj.get("deleted_webhooks").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `deleted_webhooks` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("deleted_webhooks").toString()));
        }

        JsonArray jsonArraydeletedWebhooks = jsonObj.getAsJsonArray("deleted_webhooks");
        // validate the required field `deleted_webhooks` (array)
        for (int i = 0; i < jsonArraydeletedWebhooks.size(); i++) {
            WebhookResponse.validateJsonElement(jsonArraydeletedWebhooks.get(i));
        }
        ;
        // ensure the json data is an array
        if (!jsonObj.get("failed_webhooks").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `failed_webhooks` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("failed_webhooks").toString()));
        }

        JsonArray jsonArrayfailedWebhooks = jsonObj.getAsJsonArray("failed_webhooks");
        // validate the required field `failed_webhooks` (array)
        for (int i = 0; i < jsonArrayfailedWebhooks.size(); i++) {
            WebhookDeleteFailure.validateJsonElement(jsonArrayfailedWebhooks.get(i));
        }
        ;
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WebhookDeleteResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WebhookDeleteResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WebhookDeleteResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(WebhookDeleteResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<WebhookDeleteResponse>() {
                        @Override
                        public void write(JsonWriter out, WebhookDeleteResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public WebhookDeleteResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of WebhookDeleteResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of WebhookDeleteResponse
     * @throws IOException if the JSON string is invalid with respect to WebhookDeleteResponse
     */
    public static WebhookDeleteResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WebhookDeleteResponse.class);
    }

    /**
     * Convert an instance of WebhookDeleteResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
