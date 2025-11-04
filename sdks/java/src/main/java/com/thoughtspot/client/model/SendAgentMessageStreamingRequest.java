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

/** SendAgentMessageStreamingRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SendAgentMessageStreamingRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONVERSATION_IDENTIFIER = "conversation_identifier";

    @SerializedName(SERIALIZED_NAME_CONVERSATION_IDENTIFIER)
    @javax.annotation.Nonnull
    private String conversationIdentifier;

    public static final String SERIALIZED_NAME_MESSAGES = "messages";

    @SerializedName(SERIALIZED_NAME_MESSAGES)
    @javax.annotation.Nonnull
    private List<String> messages;

    public SendAgentMessageStreamingRequest() {}

    public SendAgentMessageStreamingRequest conversationIdentifier(
            @javax.annotation.Nonnull String conversationIdentifier) {
        this.conversationIdentifier = conversationIdentifier;
        return this;
    }

    /**
     * Unique identifier for the conversation (used to track context)
     *
     * @return conversationIdentifier
     */
    @javax.annotation.Nonnull
    public String getConversationIdentifier() {
        return conversationIdentifier;
    }

    public void setConversationIdentifier(@javax.annotation.Nonnull String conversationIdentifier) {
        this.conversationIdentifier = conversationIdentifier;
    }

    public SendAgentMessageStreamingRequest messages(
            @javax.annotation.Nonnull List<String> messages) {
        this.messages = messages;
        return this;
    }

    public SendAgentMessageStreamingRequest addMessagesItem(String messagesItem) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(messagesItem);
        return this;
    }

    /**
     * messages to be sent to the agent
     *
     * @return messages
     */
    @javax.annotation.Nonnull
    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(@javax.annotation.Nonnull List<String> messages) {
        this.messages = messages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendAgentMessageStreamingRequest sendAgentMessageStreamingRequest =
                (SendAgentMessageStreamingRequest) o;
        return Objects.equals(
                        this.conversationIdentifier,
                        sendAgentMessageStreamingRequest.conversationIdentifier)
                && Objects.equals(this.messages, sendAgentMessageStreamingRequest.messages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conversationIdentifier, messages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendAgentMessageStreamingRequest {\n");
        sb.append("    conversationIdentifier: ")
                .append(toIndentedString(conversationIdentifier))
                .append("\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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
        openapiFields.add("conversation_identifier");
        openapiFields.add("messages");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("conversation_identifier");
        openapiRequiredFields.add("messages");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     SendAgentMessageStreamingRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SendAgentMessageStreamingRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SendAgentMessageStreamingRequest is"
                                        + " not found in the empty JSON string",
                                SendAgentMessageStreamingRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SendAgentMessageStreamingRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `SendAgentMessageStreamingRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : SendAgentMessageStreamingRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("conversation_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `conversation_identifier` to be a primitive type"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("conversation_identifier").toString()));
        }
        // ensure the required json array is present
        if (jsonObj.get("messages") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("messages").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `messages` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("messages").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SendAgentMessageStreamingRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SendAgentMessageStreamingRequest' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SendAgentMessageStreamingRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(SendAgentMessageStreamingRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SendAgentMessageStreamingRequest>() {
                        @Override
                        public void write(JsonWriter out, SendAgentMessageStreamingRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SendAgentMessageStreamingRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SendAgentMessageStreamingRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SendAgentMessageStreamingRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     SendAgentMessageStreamingRequest
     */
    public static SendAgentMessageStreamingRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SendAgentMessageStreamingRequest.class);
    }

    /**
     * Convert an instance of SendAgentMessageStreamingRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
