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

/** UpdateVariableValuesRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UpdateVariableValuesRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_VARIABLE_UPDATES = "variable_updates";

    @SerializedName(SERIALIZED_NAME_VARIABLE_UPDATES)
    @javax.annotation.Nonnull
    private List<VariableValueInput> variableUpdates;

    /** Type of update operation */
    @JsonAdapter(OperationEnum.Adapter.class)
    public enum OperationEnum {
        ADD("ADD"),

        REMOVE("REMOVE"),

        REPLACE("REPLACE");

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

    public UpdateVariableValuesRequest() {}

    public UpdateVariableValuesRequest variableUpdates(
            @javax.annotation.Nonnull List<VariableValueInput> variableUpdates) {
        this.variableUpdates = variableUpdates;
        return this;
    }

    public UpdateVariableValuesRequest addVariableUpdatesItem(
            VariableValueInput variableUpdatesItem) {
        if (this.variableUpdates == null) {
            this.variableUpdates = new ArrayList<>();
        }
        this.variableUpdates.add(variableUpdatesItem);
        return this;
    }

    /**
     * Variables and values
     *
     * @return variableUpdates
     */
    @javax.annotation.Nonnull
    public List<VariableValueInput> getVariableUpdates() {
        return variableUpdates;
    }

    public void setVariableUpdates(
            @javax.annotation.Nonnull List<VariableValueInput> variableUpdates) {
        this.variableUpdates = variableUpdates;
    }

    public UpdateVariableValuesRequest operation(
            @javax.annotation.Nonnull OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Type of update operation
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
        UpdateVariableValuesRequest updateVariableValuesRequest = (UpdateVariableValuesRequest) o;
        return Objects.equals(this.variableUpdates, updateVariableValuesRequest.variableUpdates)
                && Objects.equals(this.operation, updateVariableValuesRequest.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variableUpdates, operation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVariableValuesRequest {\n");
        sb.append("    variableUpdates: ").append(toIndentedString(variableUpdates)).append("\n");
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
        openapiFields.add("variable_updates");
        openapiFields.add("operation");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("variable_updates");
        openapiRequiredFields.add("operation");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     UpdateVariableValuesRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UpdateVariableValuesRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateVariableValuesRequest is not"
                                        + " found in the empty JSON string",
                                UpdateVariableValuesRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!UpdateVariableValuesRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UpdateVariableValuesRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UpdateVariableValuesRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the json data is an array
        if (!jsonObj.get("variable_updates").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `variable_updates` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("variable_updates").toString()));
        }

        JsonArray jsonArrayvariableUpdates = jsonObj.getAsJsonArray("variable_updates");
        // validate the required field `variable_updates` (array)
        for (int i = 0; i < jsonArrayvariableUpdates.size(); i++) {
            VariableValueInput.validateJsonElement(jsonArrayvariableUpdates.get(i));
        }
        ;
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
            if (!UpdateVariableValuesRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateVariableValuesRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateVariableValuesRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UpdateVariableValuesRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateVariableValuesRequest>() {
                        @Override
                        public void write(JsonWriter out, UpdateVariableValuesRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateVariableValuesRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateVariableValuesRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateVariableValuesRequest
     * @throws IOException if the JSON string is invalid with respect to UpdateVariableValuesRequest
     */
    public static UpdateVariableValuesRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateVariableValuesRequest.class);
    }

    /**
     * Convert an instance of UpdateVariableValuesRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
