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

/** Response returned by getConversationList. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AgentConversationHistoryResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONVERSATIONS = "conversations";

    @SerializedName(SERIALIZED_NAME_CONVERSATIONS)
    @javax.annotation.Nullable
    private List<AgentConversationList> conversations;

    public static final String SERIALIZED_NAME_HAS_MORE = "has_more";

    @SerializedName(SERIALIZED_NAME_HAS_MORE)
    @javax.annotation.Nullable
    private Boolean hasMore;

    public AgentConversationHistoryResponse() {}

    public AgentConversationHistoryResponse conversations(
            @javax.annotation.Nullable List<AgentConversationList> conversations) {
        this.conversations = conversations;
        return this;
    }

    public AgentConversationHistoryResponse addConversationsItem(
            AgentConversationList conversationsItem) {
        if (this.conversations == null) {
            this.conversations = new ArrayList<>();
        }
        this.conversations.add(conversationsItem);
        return this;
    }

    /**
     * List of saved agent conversations for the current user.
     *
     * @return conversations
     */
    @javax.annotation.Nullable
    public List<AgentConversationList> getConversations() {
        return conversations;
    }

    public void setConversations(
            @javax.annotation.Nullable List<AgentConversationList> conversations) {
        this.conversations = conversations;
    }

    public AgentConversationHistoryResponse hasMore(@javax.annotation.Nullable Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * Whether additional conversations exist beyond this page. &#x60;true&#x60; when one or more
     * conversations remain after the current page; &#x60;false&#x60; when the current page is the
     * last. Use &#x60;offset&#x60; to fetch the next page.
     *
     * @return hasMore
     */
    @javax.annotation.Nullable
    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(@javax.annotation.Nullable Boolean hasMore) {
        this.hasMore = hasMore;
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
     * @return the AgentConversationHistoryResponse instance itself
     */
    public AgentConversationHistoryResponse putAdditionalProperty(String key, Object value) {
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
        AgentConversationHistoryResponse agentConversationHistoryResponse =
                (AgentConversationHistoryResponse) o;
        return Objects.equals(this.conversations, agentConversationHistoryResponse.conversations)
                && Objects.equals(this.hasMore, agentConversationHistoryResponse.hasMore)
                && Objects.equals(
                        this.additionalProperties,
                        agentConversationHistoryResponse.additionalProperties);
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
        return Objects.hash(conversations, hasMore, additionalProperties);
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
        sb.append("class AgentConversationHistoryResponse {\n");
        sb.append("    conversations: ").append(toIndentedString(conversations)).append("\n");
        sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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
        openapiFields.add("conversations");
        openapiFields.add("has_more");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     AgentConversationHistoryResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AgentConversationHistoryResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AgentConversationHistoryResponse is"
                                        + " not found in the empty JSON string",
                                AgentConversationHistoryResponse.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (jsonObj.get("conversations") != null && !jsonObj.get("conversations").isJsonNull()) {
            JsonArray jsonArrayconversations = jsonObj.getAsJsonArray("conversations");
            if (jsonArrayconversations != null) {
                // ensure the json data is an array
                if (!jsonObj.get("conversations").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `conversations` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("conversations").toString()));
                }

                // validate the optional field `conversations` (array)
                for (int i = 0; i < jsonArrayconversations.size(); i++) {
                    AgentConversationList.validateJsonElement(jsonArrayconversations.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AgentConversationHistoryResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AgentConversationHistoryResponse' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AgentConversationHistoryResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(AgentConversationHistoryResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AgentConversationHistoryResponse>() {
                        @Override
                        public void write(JsonWriter out, AgentConversationHistoryResponse value)
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
                        public AgentConversationHistoryResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            AgentConversationHistoryResponse instance =
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
     * Create an instance of AgentConversationHistoryResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AgentConversationHistoryResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     AgentConversationHistoryResponse
     */
    public static AgentConversationHistoryResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AgentConversationHistoryResponse.class);
    }

    /**
     * Convert an instance of AgentConversationHistoryResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
