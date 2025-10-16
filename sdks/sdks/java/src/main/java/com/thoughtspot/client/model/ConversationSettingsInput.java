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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** ConversationSettingsInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ConversationSettingsInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ENABLE_CONTEXTUAL_CHANGE_ANALYSIS =
            "enable_contextual_change_analysis";

    @SerializedName(SERIALIZED_NAME_ENABLE_CONTEXTUAL_CHANGE_ANALYSIS)
    @javax.annotation.Nullable
    private Boolean enableContextualChangeAnalysis = false;

    public static final String SERIALIZED_NAME_ENABLE_NATURAL_LANGUAGE_ANSWER_GENERATION =
            "enable_natural_language_answer_generation";

    @SerializedName(SERIALIZED_NAME_ENABLE_NATURAL_LANGUAGE_ANSWER_GENERATION)
    @javax.annotation.Nullable
    private Boolean enableNaturalLanguageAnswerGeneration = true;

    public static final String SERIALIZED_NAME_ENABLE_REASONING = "enable_reasoning";

    @SerializedName(SERIALIZED_NAME_ENABLE_REASONING)
    @javax.annotation.Nullable
    private Boolean enableReasoning = false;

    public ConversationSettingsInput() {}

    public ConversationSettingsInput enableContextualChangeAnalysis(
            @javax.annotation.Nullable Boolean enableContextualChangeAnalysis) {
        this.enableContextualChangeAnalysis = enableContextualChangeAnalysis;
        return this;
    }

    /**
     * Enable contextual change analysis.
     *
     * @return enableContextualChangeAnalysis
     */
    @javax.annotation.Nullable
    public Boolean getEnableContextualChangeAnalysis() {
        return enableContextualChangeAnalysis;
    }

    public void setEnableContextualChangeAnalysis(
            @javax.annotation.Nullable Boolean enableContextualChangeAnalysis) {
        this.enableContextualChangeAnalysis = enableContextualChangeAnalysis;
    }

    public ConversationSettingsInput enableNaturalLanguageAnswerGeneration(
            @javax.annotation.Nullable Boolean enableNaturalLanguageAnswerGeneration) {
        this.enableNaturalLanguageAnswerGeneration = enableNaturalLanguageAnswerGeneration;
        return this;
    }

    /**
     * Enable natural language to answer generation.
     *
     * @return enableNaturalLanguageAnswerGeneration
     */
    @javax.annotation.Nullable
    public Boolean getEnableNaturalLanguageAnswerGeneration() {
        return enableNaturalLanguageAnswerGeneration;
    }

    public void setEnableNaturalLanguageAnswerGeneration(
            @javax.annotation.Nullable Boolean enableNaturalLanguageAnswerGeneration) {
        this.enableNaturalLanguageAnswerGeneration = enableNaturalLanguageAnswerGeneration;
    }

    public ConversationSettingsInput enableReasoning(
            @javax.annotation.Nullable Boolean enableReasoning) {
        this.enableReasoning = enableReasoning;
        return this;
    }

    /**
     * Enable reasoning.
     *
     * @return enableReasoning
     */
    @javax.annotation.Nullable
    public Boolean getEnableReasoning() {
        return enableReasoning;
    }

    public void setEnableReasoning(@javax.annotation.Nullable Boolean enableReasoning) {
        this.enableReasoning = enableReasoning;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConversationSettingsInput conversationSettingsInput = (ConversationSettingsInput) o;
        return Objects.equals(
                        this.enableContextualChangeAnalysis,
                        conversationSettingsInput.enableContextualChangeAnalysis)
                && Objects.equals(
                        this.enableNaturalLanguageAnswerGeneration,
                        conversationSettingsInput.enableNaturalLanguageAnswerGeneration)
                && Objects.equals(this.enableReasoning, conversationSettingsInput.enableReasoning);
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
                enableContextualChangeAnalysis,
                enableNaturalLanguageAnswerGeneration,
                enableReasoning);
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
        sb.append("class ConversationSettingsInput {\n");
        sb.append("    enableContextualChangeAnalysis: ")
                .append(toIndentedString(enableContextualChangeAnalysis))
                .append("\n");
        sb.append("    enableNaturalLanguageAnswerGeneration: ")
                .append(toIndentedString(enableNaturalLanguageAnswerGeneration))
                .append("\n");
        sb.append("    enableReasoning: ").append(toIndentedString(enableReasoning)).append("\n");
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
        openapiFields.add("enable_contextual_change_analysis");
        openapiFields.add("enable_natural_language_answer_generation");
        openapiFields.add("enable_reasoning");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ConversationSettingsInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ConversationSettingsInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ConversationSettingsInput is not"
                                        + " found in the empty JSON string",
                                ConversationSettingsInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ConversationSettingsInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ConversationSettingsInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ConversationSettingsInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ConversationSettingsInput' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ConversationSettingsInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ConversationSettingsInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ConversationSettingsInput>() {
                        @Override
                        public void write(JsonWriter out, ConversationSettingsInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ConversationSettingsInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ConversationSettingsInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ConversationSettingsInput
     * @throws IOException if the JSON string is invalid with respect to ConversationSettingsInput
     */
    public static ConversationSettingsInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ConversationSettingsInput.class);
    }

    /**
     * Convert an instance of ConversationSettingsInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
