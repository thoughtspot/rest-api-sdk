/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thoughtspot.client.JSON;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** NLInstructionsInfo */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class NLInstructionsInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_INSTRUCTIONS = "instructions";

    @SerializedName(SERIALIZED_NAME_INSTRUCTIONS)
    @javax.annotation.Nonnull
    private List<String> instructions;

    /** Scope of the instruction. */
    @JsonAdapter(ScopeEnum.Adapter.class)
    public enum ScopeEnum {
        GLOBAL("GLOBAL");

        private String value;

        ScopeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ScopeEnum fromValue(String value) {
            for (ScopeEnum b : ScopeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ScopeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ScopeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ScopeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ScopeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_SCOPE = "scope";

    @SerializedName(SERIALIZED_NAME_SCOPE)
    @javax.annotation.Nonnull
    private ScopeEnum scope;

    public NLInstructionsInfo() {}

    public NLInstructionsInfo instructions(@javax.annotation.Nonnull List<String> instructions) {
        this.instructions = instructions;
        return this;
    }

    public NLInstructionsInfo addInstructionsItem(String instructionsItem) {
        if (this.instructions == null) {
            this.instructions = new ArrayList<>();
        }
        this.instructions.add(instructionsItem);
        return this;
    }

    /**
     * User instructions for natural language processing.
     *
     * @return instructions
     */
    @javax.annotation.Nonnull
    public List<String> getInstructions() {
        return instructions;
    }

    public void setInstructions(@javax.annotation.Nonnull List<String> instructions) {
        this.instructions = instructions;
    }

    public NLInstructionsInfo scope(@javax.annotation.Nonnull ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Scope of the instruction.
     *
     * @return scope
     */
    @javax.annotation.Nonnull
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(@javax.annotation.Nonnull ScopeEnum scope) {
        this.scope = scope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NLInstructionsInfo nlInstructionsInfo = (NLInstructionsInfo) o;
        return Objects.equals(this.instructions, nlInstructionsInfo.instructions)
                && Objects.equals(this.scope, nlInstructionsInfo.scope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instructions, scope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NLInstructionsInfo {\n");
        sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
        openapiFields.add("scope");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("instructions");
        openapiRequiredFields.add("scope");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to NLInstructionsInfo
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!NLInstructionsInfo.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in NLInstructionsInfo is not found in"
                                        + " the empty JSON string",
                                NLInstructionsInfo.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!NLInstructionsInfo.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `NLInstructionsInfo` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : NLInstructionsInfo.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the required json array is present
        if (jsonObj.get("instructions") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("instructions").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `instructions` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("instructions").toString()));
        }
        if (!jsonObj.get("scope").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `scope` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("scope").toString()));
        }
        // validate the required field `scope`
        ScopeEnum.validateJsonElement(jsonObj.get("scope"));
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!NLInstructionsInfo.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'NLInstructionsInfo' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<NLInstructionsInfo> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(NLInstructionsInfo.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<NLInstructionsInfo>() {
                        @Override
                        public void write(JsonWriter out, NLInstructionsInfo value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public NLInstructionsInfo read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of NLInstructionsInfo given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of NLInstructionsInfo
     * @throws IOException if the JSON string is invalid with respect to NLInstructionsInfo
     */
    public static NLInstructionsInfo fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, NLInstructionsInfo.class);
    }

    /**
     * Convert an instance of NLInstructionsInfo to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
