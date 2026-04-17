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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** WebhookSearchResponse */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class WebhookSearchResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_WEBHOOKS = "webhooks";

    @SerializedName(SERIALIZED_NAME_WEBHOOKS)
    @javax.annotation.Nonnull
    private List<WebhookResponse> webhooks;

    public static final String SERIALIZED_NAME_PAGINATION = "pagination";

    @SerializedName(SERIALIZED_NAME_PAGINATION)
    @javax.annotation.Nonnull
    private WebhookPagination pagination;

    public WebhookSearchResponse() {}

    public WebhookSearchResponse webhooks(
            @javax.annotation.Nonnull List<WebhookResponse> webhooks) {
        this.webhooks = webhooks;
        return this;
    }

    public WebhookSearchResponse addWebhooksItem(WebhookResponse webhooksItem) {
        if (this.webhooks == null) {
            this.webhooks = new ArrayList<>();
        }
        this.webhooks.add(webhooksItem);
        return this;
    }

    /**
     * List of webhook configurations matching the search criteria.
     *
     * @return webhooks
     */
    @javax.annotation.Nonnull
    public List<WebhookResponse> getWebhooks() {
        return webhooks;
    }

    public void setWebhooks(@javax.annotation.Nonnull List<WebhookResponse> webhooks) {
        this.webhooks = webhooks;
    }

    public WebhookSearchResponse pagination(
            @javax.annotation.Nonnull WebhookPagination pagination) {
        this.pagination = pagination;
        return this;
    }

    /**
     * Get pagination
     *
     * @return pagination
     */
    @javax.annotation.Nonnull
    public WebhookPagination getPagination() {
        return pagination;
    }

    public void setPagination(@javax.annotation.Nonnull WebhookPagination pagination) {
        this.pagination = pagination;
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
     * @return the WebhookSearchResponse instance itself
     */
    public WebhookSearchResponse putAdditionalProperty(String key, Object value) {
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
        WebhookSearchResponse webhookSearchResponse = (WebhookSearchResponse) o;
        return Objects.equals(this.webhooks, webhookSearchResponse.webhooks)
                && Objects.equals(this.pagination, webhookSearchResponse.pagination)
                && Objects.equals(
                        this.additionalProperties, webhookSearchResponse.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(webhooks, pagination, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookSearchResponse {\n");
        sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
        sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
        openapiFields.add("webhooks");
        openapiFields.add("pagination");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("webhooks");
        openapiRequiredFields.add("pagination");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to WebhookSearchResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!WebhookSearchResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in WebhookSearchResponse is not found in"
                                        + " the empty JSON string",
                                WebhookSearchResponse.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : WebhookSearchResponse.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the json data is an array
        if (!jsonObj.get("webhooks").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `webhooks` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("webhooks").toString()));
        }

        JsonArray jsonArraywebhooks = jsonObj.getAsJsonArray("webhooks");
        // validate the required field `webhooks` (array)
        for (int i = 0; i < jsonArraywebhooks.size(); i++) {
            WebhookResponse.validateJsonElement(jsonArraywebhooks.get(i));
        }
        ;
        // validate the required field `pagination`
        WebhookPagination.validateJsonElement(jsonObj.get("pagination"));
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WebhookSearchResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WebhookSearchResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WebhookSearchResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(WebhookSearchResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<WebhookSearchResponse>() {
                        @Override
                        public void write(JsonWriter out, WebhookSearchResponse value)
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
                        public WebhookSearchResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            WebhookSearchResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of WebhookSearchResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of WebhookSearchResponse
     * @throws IOException if the JSON string is invalid with respect to WebhookSearchResponse
     */
    public static WebhookSearchResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WebhookSearchResponse.class);
    }

    /**
     * Convert an instance of WebhookSearchResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
