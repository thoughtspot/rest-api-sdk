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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** AIContext */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AIContext implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_INSTRUCTIONS = "instructions";

    @SerializedName(SERIALIZED_NAME_INSTRUCTIONS)
    @javax.annotation.Nullable
    private List<String> instructions;

    public static final String SERIALIZED_NAME_CONTENT = "content";

    @SerializedName(SERIALIZED_NAME_CONTENT)
    @javax.annotation.Nullable
    private List<String> content;

    public AIContext() {}

    public AIContext instructions(@javax.annotation.Nullable List<String> instructions) {
        this.instructions = instructions;
        return this;
    }

    public AIContext addInstructionsItem(String instructionsItem) {
        if (this.instructions == null) {
            this.instructions = new ArrayList<>();
        }
        this.instructions.add(instructionsItem);
        return this;
    }

    /**
     * User specific text instructions sent to AI system for processing the query.
     *
     * @return instructions
     */
    @javax.annotation.Nullable
    public List<String> getInstructions() {
        return instructions;
    }

    public void setInstructions(@javax.annotation.Nullable List<String> instructions) {
        this.instructions = instructions;
    }

    public AIContext content(@javax.annotation.Nullable List<String> content) {
        this.content = content;
        return this;
    }

    public AIContext addContentItem(String contentItem) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
        return this;
    }

    /**
     * User provided content like text data, csv data as a string message to provide context &amp;
     * potentially improve the quality of the response.
     *
     * @return content
     */
    @javax.annotation.Nullable
    public List<String> getContent() {
        return content;
    }

    public void setContent(@javax.annotation.Nullable List<String> content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AIContext aiContext = (AIContext) o;
        return Objects.equals(this.instructions, aiContext.instructions)
                && Objects.equals(this.content, aiContext.content);
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
        return Objects.hash(instructions, content);
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
        sb.append("class AIContext {\n");
        sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
        openapiFields.add("instructions");
        openapiFields.add("content");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AIContext
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AIContext.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AIContext is not found in the empty"
                                        + " JSON string",
                                AIContext.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!AIContext.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `AIContext` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("instructions") != null
                && !jsonObj.get("instructions").isJsonNull()
                && !jsonObj.get("instructions").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `instructions` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("instructions").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("content") != null
                && !jsonObj.get("content").isJsonNull()
                && !jsonObj.get("content").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `content` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("content").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AIContext.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AIContext' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AIContext> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AIContext.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AIContext>() {
                        @Override
                        public void write(JsonWriter out, AIContext value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AIContext read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AIContext given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AIContext
     * @throws IOException if the JSON string is invalid with respect to AIContext
     */
    public static AIContext fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AIContext.class);
    }

    /**
     * Convert an instance of AIContext to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
