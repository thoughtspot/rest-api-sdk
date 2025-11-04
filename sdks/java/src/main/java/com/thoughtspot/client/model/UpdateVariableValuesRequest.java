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

    public static final String SERIALIZED_NAME_VARIABLE_ASSIGNMENT = "variable_assignment";

    @SerializedName(SERIALIZED_NAME_VARIABLE_ASSIGNMENT)
    @javax.annotation.Nonnull
    private List<VariableUpdateAssignmentInput> variableAssignment;

    public static final String SERIALIZED_NAME_VARIABLE_VALUE_SCOPE = "variable_value_scope";

    @SerializedName(SERIALIZED_NAME_VARIABLE_VALUE_SCOPE)
    @javax.annotation.Nonnull
    private List<VariableUpdateScopeInput> variableValueScope;

    public UpdateVariableValuesRequest() {}

    public UpdateVariableValuesRequest variableAssignment(
            @javax.annotation.Nonnull List<VariableUpdateAssignmentInput> variableAssignment) {
        this.variableAssignment = variableAssignment;
        return this;
    }

    public UpdateVariableValuesRequest addVariableAssignmentItem(
            VariableUpdateAssignmentInput variableAssignmentItem) {
        if (this.variableAssignment == null) {
            this.variableAssignment = new ArrayList<>();
        }
        this.variableAssignment.add(variableAssignmentItem);
        return this;
    }

    /**
     * Variables and values to update
     *
     * @return variableAssignment
     */
    @javax.annotation.Nonnull
    public List<VariableUpdateAssignmentInput> getVariableAssignment() {
        return variableAssignment;
    }

    public void setVariableAssignment(
            @javax.annotation.Nonnull List<VariableUpdateAssignmentInput> variableAssignment) {
        this.variableAssignment = variableAssignment;
    }

    public UpdateVariableValuesRequest variableValueScope(
            @javax.annotation.Nonnull List<VariableUpdateScopeInput> variableValueScope) {
        this.variableValueScope = variableValueScope;
        return this;
    }

    public UpdateVariableValuesRequest addVariableValueScopeItem(
            VariableUpdateScopeInput variableValueScopeItem) {
        if (this.variableValueScope == null) {
            this.variableValueScope = new ArrayList<>();
        }
        this.variableValueScope.add(variableValueScopeItem);
        return this;
    }

    /**
     * Variables and values to update
     *
     * @return variableValueScope
     */
    @javax.annotation.Nonnull
    public List<VariableUpdateScopeInput> getVariableValueScope() {
        return variableValueScope;
    }

    public void setVariableValueScope(
            @javax.annotation.Nonnull List<VariableUpdateScopeInput> variableValueScope) {
        this.variableValueScope = variableValueScope;
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
        return Objects.equals(
                        this.variableAssignment, updateVariableValuesRequest.variableAssignment)
                && Objects.equals(
                        this.variableValueScope, updateVariableValuesRequest.variableValueScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variableAssignment, variableValueScope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVariableValuesRequest {\n");
        sb.append("    variableAssignment: ")
                .append(toIndentedString(variableAssignment))
                .append("\n");
        sb.append("    variableValueScope: ")
                .append(toIndentedString(variableValueScope))
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
        openapiFields.add("variable_assignment");
        openapiFields.add("variable_value_scope");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("variable_assignment");
        openapiRequiredFields.add("variable_value_scope");
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
            VariableUpdateAssignmentInput.validateJsonElement(jsonArrayvariableAssignment.get(i));
        }
        ;
        // ensure the json data is an array
        if (!jsonObj.get("variable_value_scope").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `variable_value_scope` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("variable_value_scope").toString()));
        }

        JsonArray jsonArrayvariableValueScope = jsonObj.getAsJsonArray("variable_value_scope");
        // validate the required field `variable_value_scope` (array)
        for (int i = 0; i < jsonArrayvariableValueScope.size(); i++) {
            VariableUpdateScopeInput.validateJsonElement(jsonArrayvariableValueScope.get(i));
        }
        ;
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
