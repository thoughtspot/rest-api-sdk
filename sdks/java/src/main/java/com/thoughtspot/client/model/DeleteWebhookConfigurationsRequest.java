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

/** DeleteWebhookConfigurationsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DeleteWebhookConfigurationsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_WEBHOOK_IDENTIFIERS = "webhook_identifiers";

    @SerializedName(SERIALIZED_NAME_WEBHOOK_IDENTIFIERS)
    @javax.annotation.Nonnull
    private List<String> webhookIdentifiers;

    public DeleteWebhookConfigurationsRequest() {}

    public DeleteWebhookConfigurationsRequest webhookIdentifiers(
            @javax.annotation.Nonnull List<String> webhookIdentifiers) {
        this.webhookIdentifiers = webhookIdentifiers;
        return this;
    }

    public DeleteWebhookConfigurationsRequest addWebhookIdentifiersItem(
            String webhookIdentifiersItem) {
        if (this.webhookIdentifiers == null) {
            this.webhookIdentifiers = new ArrayList<>();
        }
        this.webhookIdentifiers.add(webhookIdentifiersItem);
        return this;
    }

    /**
     * List of webhook identifiers to delete.
     *
     * @return webhookIdentifiers
     */
    @javax.annotation.Nonnull
    public List<String> getWebhookIdentifiers() {
        return webhookIdentifiers;
    }

    public void setWebhookIdentifiers(@javax.annotation.Nonnull List<String> webhookIdentifiers) {
        this.webhookIdentifiers = webhookIdentifiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteWebhookConfigurationsRequest deleteWebhookConfigurationsRequest =
                (DeleteWebhookConfigurationsRequest) o;
        return Objects.equals(
                this.webhookIdentifiers, deleteWebhookConfigurationsRequest.webhookIdentifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(webhookIdentifiers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteWebhookConfigurationsRequest {\n");
        sb.append("    webhookIdentifiers: ")
                .append(toIndentedString(webhookIdentifiers))
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
        openapiFields.add("webhook_identifiers");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("webhook_identifiers");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     DeleteWebhookConfigurationsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DeleteWebhookConfigurationsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DeleteWebhookConfigurationsRequest is"
                                        + " not found in the empty JSON string",
                                DeleteWebhookConfigurationsRequest.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!DeleteWebhookConfigurationsRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `DeleteWebhookConfigurationsRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : DeleteWebhookConfigurationsRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the required json array is present
        if (jsonObj.get("webhook_identifiers") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("webhook_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `webhook_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("webhook_identifiers").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DeleteWebhookConfigurationsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DeleteWebhookConfigurationsRequest' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DeleteWebhookConfigurationsRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(DeleteWebhookConfigurationsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DeleteWebhookConfigurationsRequest>() {
                        @Override
                        public void write(JsonWriter out, DeleteWebhookConfigurationsRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DeleteWebhookConfigurationsRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DeleteWebhookConfigurationsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DeleteWebhookConfigurationsRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     DeleteWebhookConfigurationsRequest
     */
    public static DeleteWebhookConfigurationsRequest fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, DeleteWebhookConfigurationsRequest.class);
    }

    /**
     * Convert an instance of DeleteWebhookConfigurationsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
