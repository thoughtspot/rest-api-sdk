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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** CreateAgentConversationRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CreateAgentConversationRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_METADATA_CONTEXT = "metadata_context";

    @SerializedName(SERIALIZED_NAME_METADATA_CONTEXT)
    @javax.annotation.Nonnull
    private ContextPayloadV2Input metadataContext;

    public static final String SERIALIZED_NAME_CONVERSATION_SETTINGS = "conversation_settings";

    @SerializedName(SERIALIZED_NAME_CONVERSATION_SETTINGS)
    @javax.annotation.Nonnull
    private ConversationSettingsInput conversationSettings;

    public CreateAgentConversationRequest() {}

    public CreateAgentConversationRequest metadataContext(
            @javax.annotation.Nonnull ContextPayloadV2Input metadataContext) {
        this.metadataContext = metadataContext;
        return this;
    }

    /**
     * Context for the conversation.
     *
     * @return metadataContext
     */
    @javax.annotation.Nonnull
    public ContextPayloadV2Input getMetadataContext() {
        return metadataContext;
    }

    public void setMetadataContext(
            @javax.annotation.Nonnull ContextPayloadV2Input metadataContext) {
        this.metadataContext = metadataContext;
    }

    public CreateAgentConversationRequest conversationSettings(
            @javax.annotation.Nonnull ConversationSettingsInput conversationSettings) {
        this.conversationSettings = conversationSettings;
        return this;
    }

    /**
     * Conversation settings.
     *
     * @return conversationSettings
     */
    @javax.annotation.Nonnull
    public ConversationSettingsInput getConversationSettings() {
        return conversationSettings;
    }

    public void setConversationSettings(
            @javax.annotation.Nonnull ConversationSettingsInput conversationSettings) {
        this.conversationSettings = conversationSettings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAgentConversationRequest createAgentConversationRequest =
                (CreateAgentConversationRequest) o;
        return Objects.equals(this.metadataContext, createAgentConversationRequest.metadataContext)
                && Objects.equals(
                        this.conversationSettings,
                        createAgentConversationRequest.conversationSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadataContext, conversationSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAgentConversationRequest {\n");
        sb.append("    metadataContext: ").append(toIndentedString(metadataContext)).append("\n");
        sb.append("    conversationSettings: ")
                .append(toIndentedString(conversationSettings))
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
        openapiFields.add("metadata_context");
        openapiFields.add("conversation_settings");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("metadata_context");
        openapiRequiredFields.add("conversation_settings");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     CreateAgentConversationRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CreateAgentConversationRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateAgentConversationRequest is not"
                                        + " found in the empty JSON string",
                                CreateAgentConversationRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CreateAgentConversationRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateAgentConversationRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateAgentConversationRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the required field `metadata_context`
        ContextPayloadV2Input.validateJsonElement(jsonObj.get("metadata_context"));
        // validate the required field `conversation_settings`
        ConversationSettingsInput.validateJsonElement(jsonObj.get("conversation_settings"));
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateAgentConversationRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateAgentConversationRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateAgentConversationRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(CreateAgentConversationRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateAgentConversationRequest>() {
                        @Override
                        public void write(JsonWriter out, CreateAgentConversationRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateAgentConversationRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateAgentConversationRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateAgentConversationRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     CreateAgentConversationRequest
     */
    public static CreateAgentConversationRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateAgentConversationRequest.class);
    }

    /**
     * Convert an instance of CreateAgentConversationRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
