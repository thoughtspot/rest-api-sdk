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

/** A Spotter Analyst as returned in search results. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AnalystItem implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nonnull
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nullable
    private String name;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nullable
    private String description;

    public static final String SERIALIZED_NAME_INSTRUCTIONS = "instructions";

    @SerializedName(SERIALIZED_NAME_INSTRUCTIONS)
    @javax.annotation.Nullable
    private String instructions;

    public static final String SERIALIZED_NAME_SOURCES = "sources";

    @SerializedName(SERIALIZED_NAME_SOURCES)
    @javax.annotation.Nonnull
    private List<AnalystItemSource> sources;

    public static final String SERIALIZED_NAME_MCP_CONNECTORS = "mcp_connectors";

    @SerializedName(SERIALIZED_NAME_MCP_CONNECTORS)
    @javax.annotation.Nonnull
    private List<AnalystMcpConnector> mcpConnectors;

    public static final String SERIALIZED_NAME_ICON_ID = "icon_id";

    @SerializedName(SERIALIZED_NAME_ICON_ID)
    @javax.annotation.Nonnull
    private String iconId;

    public static final String SERIALIZED_NAME_STARTER_PROMPTS = "starter_prompts";

    @SerializedName(SERIALIZED_NAME_STARTER_PROMPTS)
    @javax.annotation.Nonnull
    private List<AnalystItemStarterPrompt> starterPrompts;

    public static final String SERIALIZED_NAME_UPDATED_TIME_IN_MILLIS = "updated_time_in_millis";

    @SerializedName(SERIALIZED_NAME_UPDATED_TIME_IN_MILLIS)
    @javax.annotation.Nullable
    private Object updatedTimeInMillis = null;

    public static final String SERIALIZED_NAME_LAST_ACCESSED_TIME_IN_MILLIS =
            "last_accessed_time_in_millis";

    @SerializedName(SERIALIZED_NAME_LAST_ACCESSED_TIME_IN_MILLIS)
    @javax.annotation.Nullable
    private Object lastAccessedTimeInMillis = null;

    public static final String SERIALIZED_NAME_CREATED_BY = "created_by";

    @SerializedName(SERIALIZED_NAME_CREATED_BY)
    @javax.annotation.Nullable
    private AnalystUser createdBy;

    public static final String SERIALIZED_NAME_UPDATED_BY = "updated_by";

    @SerializedName(SERIALIZED_NAME_UPDATED_BY)
    @javax.annotation.Nullable
    private AnalystUser updatedBy;

    public AnalystItem() {}

    public AnalystItem id(@javax.annotation.Nonnull String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the analyst.
     *
     * @return id
     */
    @javax.annotation.Nonnull
    public String getId() {
        return id;
    }

    public void setId(@javax.annotation.Nonnull String id) {
        this.id = id;
    }

    public AnalystItem name(@javax.annotation.Nullable String name) {
        this.name = name;
        return this;
    }

    /**
     * Display name of the analyst.
     *
     * @return name
     */
    @javax.annotation.Nullable
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nullable String name) {
        this.name = name;
    }

    public AnalystItem description(@javax.annotation.Nullable String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the analyst.
     *
     * @return description
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@javax.annotation.Nullable String description) {
        this.description = description;
    }

    public AnalystItem instructions(@javax.annotation.Nullable String instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * Natural-language instructions that guide the agent&#39;s behavior for this analyst.
     *
     * @return instructions
     */
    @javax.annotation.Nullable
    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(@javax.annotation.Nullable String instructions) {
        this.instructions = instructions;
    }

    public AnalystItem sources(@javax.annotation.Nonnull List<AnalystItemSource> sources) {
        this.sources = sources;
        return this;
    }

    public AnalystItem addSourcesItem(AnalystItemSource sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    /**
     * Data sources the analyst can query.
     *
     * @return sources
     */
    @javax.annotation.Nonnull
    public List<AnalystItemSource> getSources() {
        return sources;
    }

    public void setSources(@javax.annotation.Nonnull List<AnalystItemSource> sources) {
        this.sources = sources;
    }

    public AnalystItem mcpConnectors(
            @javax.annotation.Nonnull List<AnalystMcpConnector> mcpConnectors) {
        this.mcpConnectors = mcpConnectors;
        return this;
    }

    public AnalystItem addMcpConnectorsItem(AnalystMcpConnector mcpConnectorsItem) {
        if (this.mcpConnectors == null) {
            this.mcpConnectors = new ArrayList<>();
        }
        this.mcpConnectors.add(mcpConnectorsItem);
        return this;
    }

    /**
     * MCP connectors linked to this analyst.
     *
     * @return mcpConnectors
     */
    @javax.annotation.Nonnull
    public List<AnalystMcpConnector> getMcpConnectors() {
        return mcpConnectors;
    }

    public void setMcpConnectors(
            @javax.annotation.Nonnull List<AnalystMcpConnector> mcpConnectors) {
        this.mcpConnectors = mcpConnectors;
    }

    public AnalystItem iconId(@javax.annotation.Nonnull String iconId) {
        this.iconId = iconId;
        return this;
    }

    /**
     * Icon identifier. Empty string means the default icon.
     *
     * @return iconId
     */
    @javax.annotation.Nonnull
    public String getIconId() {
        return iconId;
    }

    public void setIconId(@javax.annotation.Nonnull String iconId) {
        this.iconId = iconId;
    }

    public AnalystItem starterPrompts(
            @javax.annotation.Nonnull List<AnalystItemStarterPrompt> starterPrompts) {
        this.starterPrompts = starterPrompts;
        return this;
    }

    public AnalystItem addStarterPromptsItem(AnalystItemStarterPrompt starterPromptsItem) {
        if (this.starterPrompts == null) {
            this.starterPrompts = new ArrayList<>();
        }
        this.starterPrompts.add(starterPromptsItem);
        return this;
    }

    /**
     * Starter prompts in display order, including the fixed prompt.
     *
     * @return starterPrompts
     */
    @javax.annotation.Nonnull
    public List<AnalystItemStarterPrompt> getStarterPrompts() {
        return starterPrompts;
    }

    public void setStarterPrompts(
            @javax.annotation.Nonnull List<AnalystItemStarterPrompt> starterPrompts) {
        this.starterPrompts = starterPrompts;
    }

    public AnalystItem updatedTimeInMillis(@javax.annotation.Nullable Object updatedTimeInMillis) {
        this.updatedTimeInMillis = updatedTimeInMillis;
        return this;
    }

    /**
     * Epoch milliseconds of the last update.
     *
     * @return updatedTimeInMillis
     */
    @javax.annotation.Nullable
    public Object getUpdatedTimeInMillis() {
        return updatedTimeInMillis;
    }

    public void setUpdatedTimeInMillis(@javax.annotation.Nullable Object updatedTimeInMillis) {
        this.updatedTimeInMillis = updatedTimeInMillis;
    }

    public AnalystItem lastAccessedTimeInMillis(
            @javax.annotation.Nullable Object lastAccessedTimeInMillis) {
        this.lastAccessedTimeInMillis = lastAccessedTimeInMillis;
        return this;
    }

    /**
     * Epoch milliseconds of the caller&#39;s last interaction with the analyst.
     *
     * @return lastAccessedTimeInMillis
     */
    @javax.annotation.Nullable
    public Object getLastAccessedTimeInMillis() {
        return lastAccessedTimeInMillis;
    }

    public void setLastAccessedTimeInMillis(
            @javax.annotation.Nullable Object lastAccessedTimeInMillis) {
        this.lastAccessedTimeInMillis = lastAccessedTimeInMillis;
    }

    public AnalystItem createdBy(@javax.annotation.Nullable AnalystUser createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get createdBy
     *
     * @return createdBy
     */
    @javax.annotation.Nullable
    public AnalystUser getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(@javax.annotation.Nullable AnalystUser createdBy) {
        this.createdBy = createdBy;
    }

    public AnalystItem updatedBy(@javax.annotation.Nullable AnalystUser updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Get updatedBy
     *
     * @return updatedBy
     */
    @javax.annotation.Nullable
    public AnalystUser getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(@javax.annotation.Nullable AnalystUser updatedBy) {
        this.updatedBy = updatedBy;
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
     * @return the AnalystItem instance itself
     */
    public AnalystItem putAdditionalProperty(String key, Object value) {
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
        AnalystItem analystItem = (AnalystItem) o;
        return Objects.equals(this.id, analystItem.id)
                && Objects.equals(this.name, analystItem.name)
                && Objects.equals(this.description, analystItem.description)
                && Objects.equals(this.instructions, analystItem.instructions)
                && Objects.equals(this.sources, analystItem.sources)
                && Objects.equals(this.mcpConnectors, analystItem.mcpConnectors)
                && Objects.equals(this.iconId, analystItem.iconId)
                && Objects.equals(this.starterPrompts, analystItem.starterPrompts)
                && Objects.equals(this.updatedTimeInMillis, analystItem.updatedTimeInMillis)
                && Objects.equals(
                        this.lastAccessedTimeInMillis, analystItem.lastAccessedTimeInMillis)
                && Objects.equals(this.createdBy, analystItem.createdBy)
                && Objects.equals(this.updatedBy, analystItem.updatedBy)
                && Objects.equals(this.additionalProperties, analystItem.additionalProperties);
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
                id,
                name,
                description,
                instructions,
                sources,
                mcpConnectors,
                iconId,
                starterPrompts,
                updatedTimeInMillis,
                lastAccessedTimeInMillis,
                createdBy,
                updatedBy,
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
        sb.append("class AnalystItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    mcpConnectors: ").append(toIndentedString(mcpConnectors)).append("\n");
        sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
        sb.append("    starterPrompts: ").append(toIndentedString(starterPrompts)).append("\n");
        sb.append("    updatedTimeInMillis: ")
                .append(toIndentedString(updatedTimeInMillis))
                .append("\n");
        sb.append("    lastAccessedTimeInMillis: ")
                .append(toIndentedString(lastAccessedTimeInMillis))
                .append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
        openapiFields.add("id");
        openapiFields.add("name");
        openapiFields.add("description");
        openapiFields.add("instructions");
        openapiFields.add("sources");
        openapiFields.add("mcp_connectors");
        openapiFields.add("icon_id");
        openapiFields.add("starter_prompts");
        openapiFields.add("updated_time_in_millis");
        openapiFields.add("last_accessed_time_in_millis");
        openapiFields.add("created_by");
        openapiFields.add("updated_by");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("sources");
        openapiRequiredFields.add("mcp_connectors");
        openapiRequiredFields.add("icon_id");
        openapiRequiredFields.add("starter_prompts");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AnalystItem
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AnalystItem.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AnalystItem is not found in the empty"
                                        + " JSON string",
                                AnalystItem.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : AnalystItem.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
        }
        if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
                && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
                && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("description").toString()));
        }
        if ((jsonObj.get("instructions") != null && !jsonObj.get("instructions").isJsonNull())
                && !jsonObj.get("instructions").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `instructions` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("instructions").toString()));
        }
        // ensure the json data is an array
        if (!jsonObj.get("sources").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `sources` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("sources").toString()));
        }

        JsonArray jsonArraysources = jsonObj.getAsJsonArray("sources");
        // validate the required field `sources` (array)
        for (int i = 0; i < jsonArraysources.size(); i++) {
            AnalystItemSource.validateJsonElement(jsonArraysources.get(i));
        }
        ;
        // ensure the json data is an array
        if (!jsonObj.get("mcp_connectors").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `mcp_connectors` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("mcp_connectors").toString()));
        }

        JsonArray jsonArraymcpConnectors = jsonObj.getAsJsonArray("mcp_connectors");
        // validate the required field `mcp_connectors` (array)
        for (int i = 0; i < jsonArraymcpConnectors.size(); i++) {
            AnalystMcpConnector.validateJsonElement(jsonArraymcpConnectors.get(i));
        }
        ;
        if (!jsonObj.get("icon_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `icon_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("icon_id").toString()));
        }
        // ensure the json data is an array
        if (!jsonObj.get("starter_prompts").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `starter_prompts` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("starter_prompts").toString()));
        }

        JsonArray jsonArraystarterPrompts = jsonObj.getAsJsonArray("starter_prompts");
        // validate the required field `starter_prompts` (array)
        for (int i = 0; i < jsonArraystarterPrompts.size(); i++) {
            AnalystItemStarterPrompt.validateJsonElement(jsonArraystarterPrompts.get(i));
        }
        ;
        // validate the optional field `created_by`
        if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) {
            AnalystUser.validateJsonElement(jsonObj.get("created_by"));
        }
        // validate the optional field `updated_by`
        if (jsonObj.get("updated_by") != null && !jsonObj.get("updated_by").isJsonNull()) {
            AnalystUser.validateJsonElement(jsonObj.get("updated_by"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AnalystItem.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AnalystItem' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AnalystItem> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AnalystItem.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AnalystItem>() {
                        @Override
                        public void write(JsonWriter out, AnalystItem value) throws IOException {
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
                        public AnalystItem read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            AnalystItem instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of AnalystItem given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AnalystItem
     * @throws IOException if the JSON string is invalid with respect to AnalystItem
     */
    public static AnalystItem fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AnalystItem.class);
    }

    /**
     * Convert an instance of AnalystItem to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
