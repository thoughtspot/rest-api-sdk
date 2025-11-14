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

/** Input for variable value update in batch operations */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class VariableUpdateAssignmentInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_VARIABLE_IDENTIFIER = "variable_identifier";

    @SerializedName(SERIALIZED_NAME_VARIABLE_IDENTIFIER)
    @javax.annotation.Nonnull
    private String variableIdentifier;

    public static final String SERIALIZED_NAME_VARIABLE_VALUES = "variable_values";

    @SerializedName(SERIALIZED_NAME_VARIABLE_VALUES)
    @javax.annotation.Nonnull
    private List<String> variableValues;

    /** Operation to perform */
    @JsonAdapter(OperationEnum.Adapter.class)
    public enum OperationEnum {
        ADD("ADD"),

        REMOVE("REMOVE"),

        REPLACE("REPLACE"),

        RESET("RESET");

        private String value;

        OperationEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OperationEnum fromValue(String value) {
            for (OperationEnum b : OperationEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<OperationEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OperationEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OperationEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OperationEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            OperationEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_OPERATION = "operation";

    @SerializedName(SERIALIZED_NAME_OPERATION)
    @javax.annotation.Nonnull
    private OperationEnum operation;

    public VariableUpdateAssignmentInput() {}

    public VariableUpdateAssignmentInput variableIdentifier(
            @javax.annotation.Nonnull String variableIdentifier) {
        this.variableIdentifier = variableIdentifier;
        return this;
    }

    /**
     * ID or Name of the variable
     *
     * @return variableIdentifier
     */
    @javax.annotation.Nonnull
    public String getVariableIdentifier() {
        return variableIdentifier;
    }

    public void setVariableIdentifier(@javax.annotation.Nonnull String variableIdentifier) {
        this.variableIdentifier = variableIdentifier;
    }

    public VariableUpdateAssignmentInput variableValues(
            @javax.annotation.Nonnull List<String> variableValues) {
        this.variableValues = variableValues;
        return this;
    }

    public VariableUpdateAssignmentInput addVariableValuesItem(String variableValuesItem) {
        if (this.variableValues == null) {
            this.variableValues = new ArrayList<>();
        }
        this.variableValues.add(variableValuesItem);
        return this;
    }

    /**
     * Values of the variable
     *
     * @return variableValues
     */
    @javax.annotation.Nonnull
    public List<String> getVariableValues() {
        return variableValues;
    }

    public void setVariableValues(@javax.annotation.Nonnull List<String> variableValues) {
        this.variableValues = variableValues;
    }

    public VariableUpdateAssignmentInput operation(
            @javax.annotation.Nonnull OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Operation to perform
     *
     * @return operation
     */
    @javax.annotation.Nonnull
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(@javax.annotation.Nonnull OperationEnum operation) {
        this.operation = operation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VariableUpdateAssignmentInput variableUpdateAssignmentInput =
                (VariableUpdateAssignmentInput) o;
        return Objects.equals(
                        this.variableIdentifier, variableUpdateAssignmentInput.variableIdentifier)
                && Objects.equals(this.variableValues, variableUpdateAssignmentInput.variableValues)
                && Objects.equals(this.operation, variableUpdateAssignmentInput.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variableIdentifier, variableValues, operation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VariableUpdateAssignmentInput {\n");
        sb.append("    variableIdentifier: ")
                .append(toIndentedString(variableIdentifier))
                .append("\n");
        sb.append("    variableValues: ").append(toIndentedString(variableValues)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
        openapiFields.add("variable_identifier");
        openapiFields.add("variable_values");
        openapiFields.add("operation");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("variable_identifier");
        openapiRequiredFields.add("variable_values");
        openapiRequiredFields.add("operation");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     VariableUpdateAssignmentInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!VariableUpdateAssignmentInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in VariableUpdateAssignmentInput is not"
                                        + " found in the empty JSON string",
                                VariableUpdateAssignmentInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!VariableUpdateAssignmentInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `VariableUpdateAssignmentInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : VariableUpdateAssignmentInput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("variable_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `variable_identifier` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("variable_identifier").toString()));
        }
        // ensure the required json array is present
        if (jsonObj.get("variable_values") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("variable_values").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `variable_values` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("variable_values").toString()));
        }
        if (!jsonObj.get("operation").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `operation` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("operation").toString()));
        }
        // validate the required field `operation`
        OperationEnum.validateJsonElement(jsonObj.get("operation"));
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!VariableUpdateAssignmentInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'VariableUpdateAssignmentInput' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<VariableUpdateAssignmentInput> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(VariableUpdateAssignmentInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<VariableUpdateAssignmentInput>() {
                        @Override
                        public void write(JsonWriter out, VariableUpdateAssignmentInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public VariableUpdateAssignmentInput read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of VariableUpdateAssignmentInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of VariableUpdateAssignmentInput
     * @throws IOException if the JSON string is invalid with respect to
     *     VariableUpdateAssignmentInput
     */
    public static VariableUpdateAssignmentInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, VariableUpdateAssignmentInput.class);
    }

    /**
     * Convert an instance of VariableUpdateAssignmentInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
