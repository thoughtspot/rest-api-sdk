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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Admin instructions configured for the AI agent. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AgentInstructions implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nullable
    private String id;

    public static final String SERIALIZED_NAME_INSTRUCTIONS = "instructions";

    @SerializedName(SERIALIZED_NAME_INSTRUCTIONS)
    @javax.annotation.Nonnull
    private String instructions;

    public static final String SERIALIZED_NAME_CREATED_AT = "created_at";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    @javax.annotation.Nullable
    private String createdAt;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    @javax.annotation.Nullable
    private String updatedAt;

    public static final String SERIALIZED_NAME_LAST_UPDATED_BY = "last_updated_by";

    @SerializedName(SERIALIZED_NAME_LAST_UPDATED_BY)
    @javax.annotation.Nullable
    private String lastUpdatedBy;

    public AgentInstructions() {}

    public AgentInstructions id(@javax.annotation.Nullable String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the record.
     *
     * @return id
     */
    @javax.annotation.Nullable
    public String getId() {
        return id;
    }

    public void setId(@javax.annotation.Nullable String id) {
        this.id = id;
    }

    public AgentInstructions instructions(@javax.annotation.Nonnull String instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * The admin instructions text for the agent.
     *
     * @return instructions
     */
    @javax.annotation.Nonnull
    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(@javax.annotation.Nonnull String instructions) {
        this.instructions = instructions;
    }

    public AgentInstructions createdAt(@javax.annotation.Nullable String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * ISO timestamp when the instructions were created.
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

    public AgentInstructions updatedAt(@javax.annotation.Nullable String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * ISO timestamp when the instructions were last updated.
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

    public AgentInstructions lastUpdatedBy(@javax.annotation.Nullable String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    /**
     * User ID of the admin who last updated the instructions.
     *
     * @return lastUpdatedBy
     */
    @javax.annotation.Nullable
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(@javax.annotation.Nullable String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
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
     * @return the AgentInstructions instance itself
     */
    public AgentInstructions putAdditionalProperty(String key, Object value) {
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
        AgentInstructions agentInstructions = (AgentInstructions) o;
        return Objects.equals(this.id, agentInstructions.id)
                && Objects.equals(this.instructions, agentInstructions.instructions)
                && Objects.equals(this.createdAt, agentInstructions.createdAt)
                && Objects.equals(this.updatedAt, agentInstructions.updatedAt)
                && Objects.equals(this.lastUpdatedBy, agentInstructions.lastUpdatedBy)
                && Objects.equals(
                        this.additionalProperties, agentInstructions.additionalProperties);
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
                id, instructions, createdAt, updatedAt, lastUpdatedBy, additionalProperties);
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
        sb.append("class AgentInstructions {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
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
        openapiFields.add("instructions");
        openapiFields.add("created_at");
        openapiFields.add("updated_at");
        openapiFields.add("last_updated_by");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("instructions");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AgentInstructions
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AgentInstructions.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AgentInstructions is not found in the"
                                        + " empty JSON string",
                                AgentInstructions.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : AgentInstructions.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull())
                && !jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
        }
        if (!jsonObj.get("instructions").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `instructions` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("instructions").toString()));
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
        if ((jsonObj.get("last_updated_by") != null && !jsonObj.get("last_updated_by").isJsonNull())
                && !jsonObj.get("last_updated_by").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `last_updated_by` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("last_updated_by").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AgentInstructions.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AgentInstructions' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AgentInstructions> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AgentInstructions.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AgentInstructions>() {
                        @Override
                        public void write(JsonWriter out, AgentInstructions value)
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
                        public AgentInstructions read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            AgentInstructions instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of AgentInstructions given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AgentInstructions
     * @throws IOException if the JSON string is invalid with respect to AgentInstructions
     */
    public static AgentInstructions fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AgentInstructions.class);
    }

    /**
     * Convert an instance of AgentInstructions to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
