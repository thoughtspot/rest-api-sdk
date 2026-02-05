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

/** PutVariableValuesRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class PutVariableValuesRequest implements Serializable {
    private static final long serialVersionUID = 1L;

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
    @javax.annotation.Nullable
    private OperationEnum operation;

    public static final String SERIALIZED_NAME_VARIABLE_ASSIGNMENT = "variable_assignment";

    @SerializedName(SERIALIZED_NAME_VARIABLE_ASSIGNMENT)
    @javax.annotation.Nonnull
    private List<VariablePutAssignmentInput> variableAssignment;

    public PutVariableValuesRequest() {}

    public PutVariableValuesRequest operation(@javax.annotation.Nullable OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Operation to perform
     *
     * @return operation
     */
    @javax.annotation.Nullable
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(@javax.annotation.Nullable OperationEnum operation) {
        this.operation = operation;
    }

    public PutVariableValuesRequest variableAssignment(
            @javax.annotation.Nonnull List<VariablePutAssignmentInput> variableAssignment) {
        this.variableAssignment = variableAssignment;
        return this;
    }

    public PutVariableValuesRequest addVariableAssignmentItem(
            VariablePutAssignmentInput variableAssignmentItem) {
        if (this.variableAssignment == null) {
            this.variableAssignment = new ArrayList<>();
        }
        this.variableAssignment.add(variableAssignmentItem);
        return this;
    }

    /**
     * Variable assignments
     *
     * @return variableAssignment
     */
    @javax.annotation.Nonnull
    public List<VariablePutAssignmentInput> getVariableAssignment() {
        return variableAssignment;
    }

    public void setVariableAssignment(
            @javax.annotation.Nonnull List<VariablePutAssignmentInput> variableAssignment) {
        this.variableAssignment = variableAssignment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutVariableValuesRequest putVariableValuesRequest = (PutVariableValuesRequest) o;
        return Objects.equals(this.operation, putVariableValuesRequest.operation)
                && Objects.equals(
                        this.variableAssignment, putVariableValuesRequest.variableAssignment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, variableAssignment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutVariableValuesRequest {\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    variableAssignment: ")
                .append(toIndentedString(variableAssignment))
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
        openapiFields.add("operation");
        openapiFields.add("variable_assignment");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("variable_assignment");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to PutVariableValuesRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PutVariableValuesRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in PutVariableValuesRequest is not found"
                                        + " in the empty JSON string",
                                PutVariableValuesRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!PutVariableValuesRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `PutVariableValuesRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : PutVariableValuesRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull())
                && !jsonObj.get("operation").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `operation` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("operation").toString()));
        }
        // validate the optional field `operation`
        if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) {
            OperationEnum.validateJsonElement(jsonObj.get("operation"));
        }
        // ensure the json data is an array
        if (!jsonObj.get("variable_assignment").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `variable_assignment` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("variable_assignment").toString()));
        }

        JsonArray jsonArrayvariableAssignment = jsonObj.getAsJsonArray("variable_assignment");
        // validate the required field `variable_assignment` (array)
        for (int i = 0; i < jsonArrayvariableAssignment.size(); i++) {
            VariablePutAssignmentInput.validateJsonElement(jsonArrayvariableAssignment.get(i));
        }
        ;
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PutVariableValuesRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PutVariableValuesRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PutVariableValuesRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(PutVariableValuesRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<PutVariableValuesRequest>() {
                        @Override
                        public void write(JsonWriter out, PutVariableValuesRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public PutVariableValuesRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of PutVariableValuesRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PutVariableValuesRequest
     * @throws IOException if the JSON string is invalid with respect to PutVariableValuesRequest
     */
    public static PutVariableValuesRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PutVariableValuesRequest.class);
    }

    /**
     * Convert an instance of PutVariableValuesRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
