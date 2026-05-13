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

/** A saved agent conversation item returned in list responses. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AgentConversationList implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONVERSATION_IDENTIFIER = "conversation_identifier";

    @SerializedName(SERIALIZED_NAME_CONVERSATION_IDENTIFIER)
    @javax.annotation.Nonnull
    private String conversationIdentifier;

    public static final String SERIALIZED_NAME_CONVERSATION_TITLE = "conversation_title";

    @SerializedName(SERIALIZED_NAME_CONVERSATION_TITLE)
    @javax.annotation.Nullable
    private String conversationTitle;

    public static final String SERIALIZED_NAME_CREATED_AT = "created_at";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    @javax.annotation.Nullable
    private String createdAt;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    @javax.annotation.Nullable
    private String updatedAt;

    public static final String SERIALIZED_NAME_DATA_SOURCE_IDENTIFIERS = "data_source_identifiers";

    @SerializedName(SERIALIZED_NAME_DATA_SOURCE_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> dataSourceIdentifiers;

    public static final String SERIALIZED_NAME_DATA_SOURCE_NAMES = "data_source_names";

    @SerializedName(SERIALIZED_NAME_DATA_SOURCE_NAMES)
    @javax.annotation.Nullable
    private List<DataSourceEntry> dataSourceNames;

    public AgentConversationList() {}

    public AgentConversationList conversationIdentifier(
            @javax.annotation.Nonnull String conversationIdentifier) {
        this.conversationIdentifier = conversationIdentifier;
        return this;
    }

    /**
     * Unique identifier of the conversation.
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

    public AgentConversationList conversationTitle(
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

    public AgentConversationList createdAt(@javax.annotation.Nullable String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * ISO 8601 timestamp when the conversation was created.
     *
     * @return createdAt
     */
    @javax.annotation.Nullable
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(@javax.annotation.Nullable String createdAt) {
        this.createdAt = createdAt;
    }

    public AgentConversationList updatedAt(@javax.annotation.Nullable String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * ISO 8601 timestamp when the conversation was last updated.
     *
     * @return updatedAt
     */
    @javax.annotation.Nullable
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(@javax.annotation.Nullable String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public AgentConversationList dataSourceIdentifiers(
            @javax.annotation.Nullable List<String> dataSourceIdentifiers) {
        this.dataSourceIdentifiers = dataSourceIdentifiers;
        return this;
    }

    public AgentConversationList addDataSourceIdentifiersItem(String dataSourceIdentifiersItem) {
        if (this.dataSourceIdentifiers == null) {
            this.dataSourceIdentifiers = new ArrayList<>();
        }
        this.dataSourceIdentifiers.add(dataSourceIdentifiersItem);
        return this;
    }

    /**
     * Unique identifiers of the data sources associated with the conversation.
     *
     * @return dataSourceIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getDataSourceIdentifiers() {
        return dataSourceIdentifiers;
    }

    public void setDataSourceIdentifiers(
            @javax.annotation.Nullable List<String> dataSourceIdentifiers) {
        this.dataSourceIdentifiers = dataSourceIdentifiers;
    }

    public AgentConversationList dataSourceNames(
            @javax.annotation.Nullable List<DataSourceEntry> dataSourceNames) {
        this.dataSourceNames = dataSourceNames;
        return this;
    }

    public AgentConversationList addDataSourceNamesItem(DataSourceEntry dataSourceNamesItem) {
        if (this.dataSourceNames == null) {
            this.dataSourceNames = new ArrayList<>();
        }
        this.dataSourceNames.add(dataSourceNamesItem);
        return this;
    }

    /**
     * Data sources associated with the conversation, each with an &#x60;id&#x60; and
     * &#x60;name&#x60;.
     *
     * @return dataSourceNames
     */
    @javax.annotation.Nullable
    public List<DataSourceEntry> getDataSourceNames() {
        return dataSourceNames;
    }

    public void setDataSourceNames(
            @javax.annotation.Nullable List<DataSourceEntry> dataSourceNames) {
        this.dataSourceNames = dataSourceNames;
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
     * @return the AgentConversationList instance itself
     */
    public AgentConversationList putAdditionalProperty(String key, Object value) {
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
        AgentConversationList agentConversationList = (AgentConversationList) o;
        return Objects.equals(
                        this.conversationIdentifier, agentConversationList.conversationIdentifier)
                && Objects.equals(this.conversationTitle, agentConversationList.conversationTitle)
                && Objects.equals(this.createdAt, agentConversationList.createdAt)
                && Objects.equals(this.updatedAt, agentConversationList.updatedAt)
                && Objects.equals(
                        this.dataSourceIdentifiers, agentConversationList.dataSourceIdentifiers)
                && Objects.equals(this.dataSourceNames, agentConversationList.dataSourceNames)
                && Objects.equals(
                        this.additionalProperties, agentConversationList.additionalProperties);
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
                conversationIdentifier,
                conversationTitle,
                createdAt,
                updatedAt,
                dataSourceIdentifiers,
                dataSourceNames,
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
        sb.append("class AgentConversationList {\n");
        sb.append("    conversationIdentifier: ")
                .append(toIndentedString(conversationIdentifier))
                .append("\n");
        sb.append("    conversationTitle: ")
                .append(toIndentedString(conversationTitle))
                .append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    dataSourceIdentifiers: ")
                .append(toIndentedString(dataSourceIdentifiers))
                .append("\n");
        sb.append("    dataSourceNames: ").append(toIndentedString(dataSourceNames)).append("\n");
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
        openapiFields.add("conversation_identifier");
        openapiFields.add("conversation_title");
        openapiFields.add("created_at");
        openapiFields.add("updated_at");
        openapiFields.add("data_source_identifiers");
        openapiFields.add("data_source_names");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("conversation_identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AgentConversationList
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AgentConversationList.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AgentConversationList is not found in"
                                        + " the empty JSON string",
                                AgentConversationList.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : AgentConversationList.openapiRequiredFields) {
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
        if ((jsonObj.get("conversation_title") != null
                        && !jsonObj.get("conversation_title").isJsonNull())
                && !jsonObj.get("conversation_title").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `conversation_title` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("conversation_title").toString()));
        }
        if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull())
                && !jsonObj.get("created_at").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `created_at` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("created_at").toString()));
        }
        if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull())
                && !jsonObj.get("updated_at").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `updated_at` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("updated_at").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("data_source_identifiers") != null
                && !jsonObj.get("data_source_identifiers").isJsonNull()
                && !jsonObj.get("data_source_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `data_source_identifiers` to be an array in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("data_source_identifiers").toString()));
        }
        if (jsonObj.get("data_source_names") != null
                && !jsonObj.get("data_source_names").isJsonNull()) {
            JsonArray jsonArraydataSourceNames = jsonObj.getAsJsonArray("data_source_names");
            if (jsonArraydataSourceNames != null) {
                // ensure the json data is an array
                if (!jsonObj.get("data_source_names").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `data_source_names` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("data_source_names").toString()));
                }

                // validate the optional field `data_source_names` (array)
                for (int i = 0; i < jsonArraydataSourceNames.size(); i++) {
                    DataSourceEntry.validateJsonElement(jsonArraydataSourceNames.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AgentConversationList.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AgentConversationList' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AgentConversationList> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AgentConversationList.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AgentConversationList>() {
                        @Override
                        public void write(JsonWriter out, AgentConversationList value)
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
                        public AgentConversationList read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            AgentConversationList instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of AgentConversationList given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AgentConversationList
     * @throws IOException if the JSON string is invalid with respect to AgentConversationList
     */
    public static AgentConversationList fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AgentConversationList.class);
    }

    /**
     * Convert an instance of AgentConversationList to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
