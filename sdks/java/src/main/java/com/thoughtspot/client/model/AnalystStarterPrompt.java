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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A user-defined starter prompt shown on the Analyst landing page. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AnalystStarterPrompt implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_LABEL = "label";

    @SerializedName(SERIALIZED_NAME_LABEL)
    @javax.annotation.Nonnull
    private String label;

    public static final String SERIALIZED_NAME_TEXT = "text";

    @SerializedName(SERIALIZED_NAME_TEXT)
    @javax.annotation.Nonnull
    private String text;

    public static final String SERIALIZED_NAME_ORDER = "order";

    @SerializedName(SERIALIZED_NAME_ORDER)
    @javax.annotation.Nonnull
    private Integer order;

    public static final String SERIALIZED_NAME_IS_AI_GENERATED = "is_ai_generated";

    @SerializedName(SERIALIZED_NAME_IS_AI_GENERATED)
    @javax.annotation.Nonnull
    private Boolean isAiGenerated;

    public AnalystStarterPrompt() {}

    public AnalystStarterPrompt label(@javax.annotation.Nonnull String label) {
        this.label = label;
        return this;
    }

    /**
     * Short display label shown in the UI.
     *
     * @return label
     */
    @javax.annotation.Nonnull
    public String getLabel() {
        return label;
    }

    public void setLabel(@javax.annotation.Nonnull String label) {
        this.label = label;
    }

    public AnalystStarterPrompt text(@javax.annotation.Nonnull String text) {
        this.text = text;
        return this;
    }

    /**
     * Full prompt text sent to the agent.
     *
     * @return text
     */
    @javax.annotation.Nonnull
    public String getText() {
        return text;
    }

    public void setText(@javax.annotation.Nonnull String text) {
        this.text = text;
    }

    public AnalystStarterPrompt order(@javax.annotation.Nonnull Integer order) {
        this.order = order;
        return this;
    }

    /**
     * Display order within the list.
     *
     * @return order
     */
    @javax.annotation.Nonnull
    public Integer getOrder() {
        return order;
    }

    public void setOrder(@javax.annotation.Nonnull Integer order) {
        this.order = order;
    }

    public AnalystStarterPrompt isAiGenerated(@javax.annotation.Nonnull Boolean isAiGenerated) {
        this.isAiGenerated = isAiGenerated;
        return this;
    }

    /**
     * Whether this prompt was AI-generated.
     *
     * @return isAiGenerated
     */
    @javax.annotation.Nonnull
    public Boolean getIsAiGenerated() {
        return isAiGenerated;
    }

    public void setIsAiGenerated(@javax.annotation.Nonnull Boolean isAiGenerated) {
        this.isAiGenerated = isAiGenerated;
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
     * @return the AnalystStarterPrompt instance itself
     */
    public AnalystStarterPrompt putAdditionalProperty(String key, Object value) {
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
        AnalystStarterPrompt analystStarterPrompt = (AnalystStarterPrompt) o;
        return Objects.equals(this.label, analystStarterPrompt.label)
                && Objects.equals(this.text, analystStarterPrompt.text)
                && Objects.equals(this.order, analystStarterPrompt.order)
                && Objects.equals(this.isAiGenerated, analystStarterPrompt.isAiGenerated)
                && Objects.equals(
                        this.additionalProperties, analystStarterPrompt.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, text, order, isAiGenerated, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalystStarterPrompt {\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    isAiGenerated: ").append(toIndentedString(isAiGenerated)).append("\n");
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
        openapiFields.add("label");
        openapiFields.add("text");
        openapiFields.add("order");
        openapiFields.add("is_ai_generated");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("label");
        openapiRequiredFields.add("text");
        openapiRequiredFields.add("order");
        openapiRequiredFields.add("is_ai_generated");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AnalystStarterPrompt
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AnalystStarterPrompt.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AnalystStarterPrompt is not found in"
                                        + " the empty JSON string",
                                AnalystStarterPrompt.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : AnalystStarterPrompt.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("label").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `label` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("label").toString()));
        }
        if (!jsonObj.get("text").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `text` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("text").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AnalystStarterPrompt.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AnalystStarterPrompt' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AnalystStarterPrompt> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AnalystStarterPrompt.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AnalystStarterPrompt>() {
                        @Override
                        public void write(JsonWriter out, AnalystStarterPrompt value)
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
                        public AnalystStarterPrompt read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            AnalystStarterPrompt instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of AnalystStarterPrompt given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AnalystStarterPrompt
     * @throws IOException if the JSON string is invalid with respect to AnalystStarterPrompt
     */
    public static AnalystStarterPrompt fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AnalystStarterPrompt.class);
    }

    /**
     * Convert an instance of AnalystStarterPrompt to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
