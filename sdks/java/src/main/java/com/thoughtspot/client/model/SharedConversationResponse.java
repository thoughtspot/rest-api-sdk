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

/**
 * Response returned by getSharedContent. Contains the full read-only view of the shared
 * conversation including messages and data source metadata.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SharedConversationResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONVERSATION_ID = "conversation_id";

    @SerializedName(SERIALIZED_NAME_CONVERSATION_ID)
    @javax.annotation.Nonnull
    private String conversationId;

    public static final String SERIALIZED_NAME_SHARED_CONVERSATION_ID = "shared_conversation_id";

    @SerializedName(SERIALIZED_NAME_SHARED_CONVERSATION_ID)
    @javax.annotation.Nonnull
    private String sharedConversationId;

    public static final String SERIALIZED_NAME_CONVERSATION_TITLE = "conversation_title";

    @SerializedName(SERIALIZED_NAME_CONVERSATION_TITLE)
    @javax.annotation.Nullable
    private String conversationTitle;

    public static final String SERIALIZED_NAME_DATA_SOURCES = "data_sources";

    @SerializedName(SERIALIZED_NAME_DATA_SOURCES)
    @javax.annotation.Nonnull
    private List<DataSourceEntry> dataSources;

    public static final String SERIALIZED_NAME_MESSAGES = "messages";

    @SerializedName(SERIALIZED_NAME_MESSAGES)
    @javax.annotation.Nonnull
    private List<ConversationMessage> messages;

    public static final String SERIALIZED_NAME_CODE_EXECUTION_FILES = "code_execution_files";

    @SerializedName(SERIALIZED_NAME_CODE_EXECUTION_FILES)
    @javax.annotation.Nonnull
    private List<CodeExecutionFileMetadata> codeExecutionFiles;

    public SharedConversationResponse() {}

    public SharedConversationResponse conversationId(
            @javax.annotation.Nonnull String conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    /**
     * Unique identifier of the source conversation (echoes the request parameter).
     *
     * @return conversationId
     */
    @javax.annotation.Nonnull
    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(@javax.annotation.Nonnull String conversationId) {
        this.conversationId = conversationId;
    }

    public SharedConversationResponse sharedConversationId(
            @javax.annotation.Nonnull String sharedConversationId) {
        this.sharedConversationId = sharedConversationId;
        return this;
    }

    /**
     * Identifier for the shared view. Use this as &#x60;conversation_identifier&#x60; in follow-up
     * &#x60;loadAnswer&#x60; calls to hydrate answer items in the messages.
     *
     * @return sharedConversationId
     */
    @javax.annotation.Nonnull
    public String getSharedConversationId() {
        return sharedConversationId;
    }

    public void setSharedConversationId(@javax.annotation.Nonnull String sharedConversationId) {
        this.sharedConversationId = sharedConversationId;
    }

    public SharedConversationResponse conversationTitle(
            @javax.annotation.Nullable String conversationTitle) {
        this.conversationTitle = conversationTitle;
        return this;
    }

    /**
     * Display title of the conversation.
     *
     * @return conversationTitle
     */
    @javax.annotation.Nullable
    public String getConversationTitle() {
        return conversationTitle;
    }

    public void setConversationTitle(@javax.annotation.Nullable String conversationTitle) {
        this.conversationTitle = conversationTitle;
    }

    public SharedConversationResponse dataSources(
            @javax.annotation.Nonnull List<DataSourceEntry> dataSources) {
        this.dataSources = dataSources;
        return this;
    }

    public SharedConversationResponse addDataSourcesItem(DataSourceEntry dataSourcesItem) {
        if (this.dataSources == null) {
            this.dataSources = new ArrayList<>();
        }
        this.dataSources.add(dataSourcesItem);
        return this;
    }

    /**
     * Data sources used by the conversation, each with an identifier and display name.
     *
     * @return dataSources
     */
    @javax.annotation.Nonnull
    public List<DataSourceEntry> getDataSources() {
        return dataSources;
    }

    public void setDataSources(@javax.annotation.Nonnull List<DataSourceEntry> dataSources) {
        this.dataSources = dataSources;
    }

    public SharedConversationResponse messages(
            @javax.annotation.Nonnull List<ConversationMessage> messages) {
        this.messages = messages;
        return this;
    }

    public SharedConversationResponse addMessagesItem(ConversationMessage messagesItem) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(messagesItem);
        return this;
    }

    /**
     * Ordered conversation messages, oldest to newest. Same structure as the &#x60;messages&#x60;
     * field returned by &#x60;getConversation&#x60;. Empty array when the conversation has no
     * messages; never null.
     *
     * @return messages
     */
    @javax.annotation.Nonnull
    public List<ConversationMessage> getMessages() {
        return messages;
    }

    public void setMessages(@javax.annotation.Nonnull List<ConversationMessage> messages) {
        this.messages = messages;
    }

    public SharedConversationResponse codeExecutionFiles(
            @javax.annotation.Nonnull List<CodeExecutionFileMetadata> codeExecutionFiles) {
        this.codeExecutionFiles = codeExecutionFiles;
        return this;
    }

    public SharedConversationResponse addCodeExecutionFilesItem(
            CodeExecutionFileMetadata codeExecutionFilesItem) {
        if (this.codeExecutionFiles == null) {
            this.codeExecutionFiles = new ArrayList<>();
        }
        this.codeExecutionFiles.add(codeExecutionFilesItem);
        return this;
    }

    /**
     * Sanitized metadata for files generated by the code-execution tool during this conversation.
     * Empty when there are no such files.
     *
     * @return codeExecutionFiles
     */
    @javax.annotation.Nonnull
    public List<CodeExecutionFileMetadata> getCodeExecutionFiles() {
        return codeExecutionFiles;
    }

    public void setCodeExecutionFiles(
            @javax.annotation.Nonnull List<CodeExecutionFileMetadata> codeExecutionFiles) {
        this.codeExecutionFiles = codeExecutionFiles;
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
     * @return the SharedConversationResponse instance itself
     */
    public SharedConversationResponse putAdditionalProperty(String key, Object value) {
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
        SharedConversationResponse sharedConversationResponse = (SharedConversationResponse) o;
        return Objects.equals(this.conversationId, sharedConversationResponse.conversationId)
                && Objects.equals(
                        this.sharedConversationId, sharedConversationResponse.sharedConversationId)
                && Objects.equals(
                        this.conversationTitle, sharedConversationResponse.conversationTitle)
                && Objects.equals(this.dataSources, sharedConversationResponse.dataSources)
                && Objects.equals(this.messages, sharedConversationResponse.messages)
                && Objects.equals(
                        this.codeExecutionFiles, sharedConversationResponse.codeExecutionFiles)
                && Objects.equals(
                        this.additionalProperties, sharedConversationResponse.additionalProperties);
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
                conversationId,
                sharedConversationId,
                conversationTitle,
                dataSources,
                messages,
                codeExecutionFiles,
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
        sb.append("class SharedConversationResponse {\n");
        sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
        sb.append("    sharedConversationId: ")
                .append(toIndentedString(sharedConversationId))
                .append("\n");
        sb.append("    conversationTitle: ")
                .append(toIndentedString(conversationTitle))
                .append("\n");
        sb.append("    dataSources: ").append(toIndentedString(dataSources)).append("\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("    codeExecutionFiles: ")
                .append(toIndentedString(codeExecutionFiles))
                .append("\n");
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
        openapiFields.add("conversation_id");
        openapiFields.add("shared_conversation_id");
        openapiFields.add("conversation_title");
        openapiFields.add("data_sources");
        openapiFields.add("messages");
        openapiFields.add("code_execution_files");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("conversation_id");
        openapiRequiredFields.add("shared_conversation_id");
        openapiRequiredFields.add("data_sources");
        openapiRequiredFields.add("messages");
        openapiRequiredFields.add("code_execution_files");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SharedConversationResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SharedConversationResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SharedConversationResponse is not"
                                        + " found in the empty JSON string",
                                SharedConversationResponse.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : SharedConversationResponse.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("conversation_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `conversation_id` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("conversation_id").toString()));
        }
        if (!jsonObj.get("shared_conversation_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `shared_conversation_id` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("shared_conversation_id").toString()));
        }
        if ((jsonObj.get("conversation_title") != null
                        && !jsonObj.get("conversation_title").isJsonNull())
                && !jsonObj.get("conversation_title").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `conversation_title` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("conversation_title").toString()));
        }
        // ensure the json data is an array
        if (!jsonObj.get("data_sources").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `data_sources` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("data_sources").toString()));
        }

        JsonArray jsonArraydataSources = jsonObj.getAsJsonArray("data_sources");
        // validate the required field `data_sources` (array)
        for (int i = 0; i < jsonArraydataSources.size(); i++) {
            DataSourceEntry.validateJsonElement(jsonArraydataSources.get(i));
        }
        ;
        // ensure the json data is an array
        if (!jsonObj.get("messages").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `messages` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("messages").toString()));
        }

        JsonArray jsonArraymessages = jsonObj.getAsJsonArray("messages");
        // validate the required field `messages` (array)
        for (int i = 0; i < jsonArraymessages.size(); i++) {
            ConversationMessage.validateJsonElement(jsonArraymessages.get(i));
        }
        ;
        // ensure the json data is an array
        if (!jsonObj.get("code_execution_files").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `code_execution_files` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("code_execution_files").toString()));
        }

        JsonArray jsonArraycodeExecutionFiles = jsonObj.getAsJsonArray("code_execution_files");
        // validate the required field `code_execution_files` (array)
        for (int i = 0; i < jsonArraycodeExecutionFiles.size(); i++) {
            CodeExecutionFileMetadata.validateJsonElement(jsonArraycodeExecutionFiles.get(i));
        }
        ;
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SharedConversationResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SharedConversationResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SharedConversationResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SharedConversationResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SharedConversationResponse>() {
                        @Override
                        public void write(JsonWriter out, SharedConversationResponse value)
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
                        public SharedConversationResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            SharedConversationResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of SharedConversationResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SharedConversationResponse
     * @throws IOException if the JSON string is invalid with respect to SharedConversationResponse
     */
    public static SharedConversationResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SharedConversationResponse.class);
    }

    /**
     * Convert an instance of SharedConversationResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
