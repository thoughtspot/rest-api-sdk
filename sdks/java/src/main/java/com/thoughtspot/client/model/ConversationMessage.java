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

/**
 * One conversational exchange: an optional user prompt (message and attachments), followed by the
 * agent&#39;s response items for that turn.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ConversationMessage implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_MESSAGE_ID = "message_id";

    @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
    @javax.annotation.Nonnull
    private String messageId;

    public static final String SERIALIZED_NAME_TIMESTAMP_IN_MILLIS = "timestamp_in_millis";

    @SerializedName(SERIALIZED_NAME_TIMESTAMP_IN_MILLIS)
    @javax.annotation.Nonnull
    private Object timestampInMillis;

    public static final String SERIALIZED_NAME_USER_PROMPT = "user_prompt";

    @SerializedName(SERIALIZED_NAME_USER_PROMPT)
    @javax.annotation.Nullable
    private UserPrompt userPrompt;

    public static final String SERIALIZED_NAME_RESPONSE_ITEMS = "response_items";

    @SerializedName(SERIALIZED_NAME_RESPONSE_ITEMS)
    @javax.annotation.Nullable
    private List<Object> responseItems;

    public ConversationMessage() {}

    public ConversationMessage messageId(@javax.annotation.Nonnull String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Stable identifier for the turn. For liveboard-started synthetic first turns, this is the root
     * node identifier.
     *
     * @return messageId
     */
    @javax.annotation.Nonnull
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(@javax.annotation.Nonnull String messageId) {
        this.messageId = messageId;
    }

    public ConversationMessage timestampInMillis(
            @javax.annotation.Nonnull Object timestampInMillis) {
        this.timestampInMillis = timestampInMillis;
        return this;
    }

    /**
     * Milliseconds since Unix epoch for the turn.
     *
     * @return timestampInMillis
     */
    @javax.annotation.Nonnull
    public Object getTimestampInMillis() {
        return timestampInMillis;
    }

    public void setTimestampInMillis(@javax.annotation.Nonnull Object timestampInMillis) {
        this.timestampInMillis = timestampInMillis;
    }

    public ConversationMessage userPrompt(@javax.annotation.Nullable UserPrompt userPrompt) {
        this.userPrompt = userPrompt;
        return this;
    }

    /**
     * Get userPrompt
     *
     * @return userPrompt
     */
    @javax.annotation.Nullable
    public UserPrompt getUserPrompt() {
        return userPrompt;
    }

    public void setUserPrompt(@javax.annotation.Nullable UserPrompt userPrompt) {
        this.userPrompt = userPrompt;
    }

    public ConversationMessage responseItems(
            @javax.annotation.Nullable List<Object> responseItems) {
        this.responseItems = responseItems;
        return this;
    }

    public ConversationMessage addResponseItemsItem(Object responseItemsItem) {
        if (this.responseItems == null) {
            this.responseItems = new ArrayList<>();
        }
        this.responseItems.add(responseItemsItem);
        return this;
    }

    /**
     * Agent-side output produced in response to this turn. Empty array for in-progress turns where
     * the agent has not yet produced output.
     *
     * @return responseItems
     */
    @javax.annotation.Nullable
    public List<Object> getResponseItems() {
        return responseItems;
    }

    public void setResponseItems(@javax.annotation.Nullable List<Object> responseItems) {
        this.responseItems = responseItems;
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
     * @return the ConversationMessage instance itself
     */
    public ConversationMessage putAdditionalProperty(String key, Object value) {
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
        ConversationMessage conversationMessage = (ConversationMessage) o;
        return Objects.equals(this.messageId, conversationMessage.messageId)
                && Objects.equals(this.timestampInMillis, conversationMessage.timestampInMillis)
                && Objects.equals(this.userPrompt, conversationMessage.userPrompt)
                && Objects.equals(this.responseItems, conversationMessage.responseItems)
                && Objects.equals(
                        this.additionalProperties, conversationMessage.additionalProperties);
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
                messageId, timestampInMillis, userPrompt, responseItems, additionalProperties);
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
        sb.append("class ConversationMessage {\n");
        sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
        sb.append("    timestampInMillis: ")
                .append(toIndentedString(timestampInMillis))
                .append("\n");
        sb.append("    userPrompt: ").append(toIndentedString(userPrompt)).append("\n");
        sb.append("    responseItems: ").append(toIndentedString(responseItems)).append("\n");
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
        openapiFields.add("message_id");
        openapiFields.add("timestamp_in_millis");
        openapiFields.add("user_prompt");
        openapiFields.add("response_items");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("message_id");
        openapiRequiredFields.add("timestamp_in_millis");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ConversationMessage
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ConversationMessage.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ConversationMessage is not found in"
                                        + " the empty JSON string",
                                ConversationMessage.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ConversationMessage.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("message_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `message_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("message_id").toString()));
        }
        // validate the optional field `user_prompt`
        if (jsonObj.get("user_prompt") != null && !jsonObj.get("user_prompt").isJsonNull()) {
            UserPrompt.validateJsonElement(jsonObj.get("user_prompt"));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("response_items") != null
                && !jsonObj.get("response_items").isJsonNull()
                && !jsonObj.get("response_items").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `response_items` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("response_items").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ConversationMessage.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ConversationMessage' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ConversationMessage> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ConversationMessage.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ConversationMessage>() {
                        @Override
                        public void write(JsonWriter out, ConversationMessage value)
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
                        public ConversationMessage read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            ConversationMessage instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of ConversationMessage given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ConversationMessage
     * @throws IOException if the JSON string is invalid with respect to ConversationMessage
     */
    public static ConversationMessage fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ConversationMessage.class);
    }

    /**
     * Convert an instance of ConversationMessage to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
