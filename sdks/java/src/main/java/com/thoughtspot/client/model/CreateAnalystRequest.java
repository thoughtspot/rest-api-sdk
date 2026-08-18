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

/** CreateAnalystRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CreateAnalystRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nonnull
    private String description;

    public static final String SERIALIZED_NAME_INSTRUCTIONS = "instructions";

    @SerializedName(SERIALIZED_NAME_INSTRUCTIONS)
    @javax.annotation.Nullable
    private String instructions;

    public static final String SERIALIZED_NAME_SOURCES = "sources";

    @SerializedName(SERIALIZED_NAME_SOURCES)
    @javax.annotation.Nonnull
    private List<AnalystSourceInput> sources;

    public static final String SERIALIZED_NAME_MCP_CONNECTOR_IDENTIFIERS =
            "mcp_connector_identifiers";

    @SerializedName(SERIALIZED_NAME_MCP_CONNECTOR_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> mcpConnectorIdentifiers = new ArrayList<>();

    public static final String SERIALIZED_NAME_STARTER_PROMPTS = "starter_prompts";

    @SerializedName(SERIALIZED_NAME_STARTER_PROMPTS)
    @javax.annotation.Nullable
    private List<String> starterPrompts = new ArrayList<>();

    public CreateAnalystRequest() {}

    public CreateAnalystRequest name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Display name of the analyst.
     *
     * @return name
     */
    @javax.annotation.Nonnull
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nonnull String name) {
        this.name = name;
    }

    public CreateAnalystRequest description(@javax.annotation.Nonnull String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the analyst. Maximum 200 characters.
     *
     * @return description
     */
    @javax.annotation.Nonnull
    public String getDescription() {
        return description;
    }

    public void setDescription(@javax.annotation.Nonnull String description) {
        this.description = description;
    }

    public CreateAnalystRequest instructions(@javax.annotation.Nullable String instructions) {
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

    public CreateAnalystRequest sources(
            @javax.annotation.Nonnull List<AnalystSourceInput> sources) {
        this.sources = sources;
        return this;
    }

    public CreateAnalystRequest addSourcesItem(AnalystSourceInput sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    /**
     * Data sources the analyst can query. At least one is required, and the caller must have view
     * access to every referenced source.
     *
     * @return sources
     */
    @javax.annotation.Nonnull
    public List<AnalystSourceInput> getSources() {
        return sources;
    }

    public void setSources(@javax.annotation.Nonnull List<AnalystSourceInput> sources) {
        this.sources = sources;
    }

    public CreateAnalystRequest mcpConnectorIdentifiers(
            @javax.annotation.Nullable List<String> mcpConnectorIdentifiers) {
        this.mcpConnectorIdentifiers = mcpConnectorIdentifiers;
        return this;
    }

    public CreateAnalystRequest addMcpConnectorIdentifiersItem(String mcpConnectorIdentifiersItem) {
        if (this.mcpConnectorIdentifiers == null) {
            this.mcpConnectorIdentifiers = new ArrayList<>();
        }
        this.mcpConnectorIdentifiers.add(mcpConnectorIdentifiersItem);
        return this;
    }

    /**
     * Identifiers of MCP connectors to link to this analyst.
     *
     * @return mcpConnectorIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getMcpConnectorIdentifiers() {
        return mcpConnectorIdentifiers;
    }

    public void setMcpConnectorIdentifiers(
            @javax.annotation.Nullable List<String> mcpConnectorIdentifiers) {
        this.mcpConnectorIdentifiers = mcpConnectorIdentifiers;
    }

    public CreateAnalystRequest starterPrompts(
            @javax.annotation.Nullable List<String> starterPrompts) {
        this.starterPrompts = starterPrompts;
        return this;
    }

    public CreateAnalystRequest addStarterPromptsItem(String starterPromptsItem) {
        if (this.starterPrompts == null) {
            this.starterPrompts = new ArrayList<>();
        }
        this.starterPrompts.add(starterPromptsItem);
        return this;
    }

    /**
     * Plain-text starter prompts shown on the analyst landing page. Maximum 4, each between 10 and
     * 250 characters; display order follows list position.
     *
     * @return starterPrompts
     */
    @javax.annotation.Nullable
    public List<String> getStarterPrompts() {
        return starterPrompts;
    }

    public void setStarterPrompts(@javax.annotation.Nullable List<String> starterPrompts) {
        this.starterPrompts = starterPrompts;
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
     * @return the CreateAnalystRequest instance itself
     */
    public CreateAnalystRequest putAdditionalProperty(String key, Object value) {
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
        CreateAnalystRequest createAnalystRequest = (CreateAnalystRequest) o;
        return Objects.equals(this.name, createAnalystRequest.name)
                && Objects.equals(this.description, createAnalystRequest.description)
                && Objects.equals(this.instructions, createAnalystRequest.instructions)
                && Objects.equals(this.sources, createAnalystRequest.sources)
                && Objects.equals(
                        this.mcpConnectorIdentifiers, createAnalystRequest.mcpConnectorIdentifiers)
                && Objects.equals(this.starterPrompts, createAnalystRequest.starterPrompts)
                && Objects.equals(
                        this.additionalProperties, createAnalystRequest.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                description,
                instructions,
                sources,
                mcpConnectorIdentifiers,
                starterPrompts,
                additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAnalystRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    mcpConnectorIdentifiers: ")
                .append(toIndentedString(mcpConnectorIdentifiers))
                .append("\n");
        sb.append("    starterPrompts: ").append(toIndentedString(starterPrompts)).append("\n");
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
        openapiFields.add("name");
        openapiFields.add("description");
        openapiFields.add("instructions");
        openapiFields.add("sources");
        openapiFields.add("mcp_connector_identifiers");
        openapiFields.add("starter_prompts");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("description");
        openapiRequiredFields.add("sources");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateAnalystRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CreateAnalystRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateAnalystRequest is not found in"
                                        + " the empty JSON string",
                                CreateAnalystRequest.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateAnalystRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if (!jsonObj.get("description").isJsonPrimitive()) {
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
            AnalystSourceInput.validateJsonElement(jsonArraysources.get(i));
        }
        ;
        // ensure the optional json data is an array if present
        if (jsonObj.get("mcp_connector_identifiers") != null
                && !jsonObj.get("mcp_connector_identifiers").isJsonNull()
                && !jsonObj.get("mcp_connector_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `mcp_connector_identifiers` to be an array in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("mcp_connector_identifiers").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("starter_prompts") != null
                && !jsonObj.get("starter_prompts").isJsonNull()
                && !jsonObj.get("starter_prompts").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `starter_prompts` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("starter_prompts").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateAnalystRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateAnalystRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateAnalystRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CreateAnalystRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateAnalystRequest>() {
                        @Override
                        public void write(JsonWriter out, CreateAnalystRequest value)
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
                        public CreateAnalystRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            CreateAnalystRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of CreateAnalystRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateAnalystRequest
     * @throws IOException if the JSON string is invalid with respect to CreateAnalystRequest
     */
    public static CreateAnalystRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateAnalystRequest.class);
    }

    /**
     * Convert an instance of CreateAnalystRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
