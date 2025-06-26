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
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** Variable object */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class Variable implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nonnull
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    /** Type of the variable */
    @JsonAdapter(VariableTypeEnum.Adapter.class)
    public enum VariableTypeEnum {
        CONNECTION_PROPERTY("CONNECTION_PROPERTY"),

        TABLE_MAPPING("TABLE_MAPPING"),

        CONNECTION_PROPERTY_PER_PRINCIPAL("CONNECTION_PROPERTY_PER_PRINCIPAL");

        private String value;

        VariableTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static VariableTypeEnum fromValue(String value) {
            for (VariableTypeEnum b : VariableTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<VariableTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final VariableTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public VariableTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return VariableTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            VariableTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_VARIABLE_TYPE = "variable_type";

    @SerializedName(SERIALIZED_NAME_VARIABLE_TYPE)
    @javax.annotation.Nullable
    private VariableTypeEnum variableType;

    public static final String SERIALIZED_NAME_SENSITIVE = "sensitive";

    @SerializedName(SERIALIZED_NAME_SENSITIVE)
    @javax.annotation.Nullable
    private Boolean sensitive;

    public static final String SERIALIZED_NAME_VALUES = "values";

    @SerializedName(SERIALIZED_NAME_VALUES)
    @javax.annotation.Nullable
    private List<VariableValue> values;

    public Variable() {}

    public Variable id(@javax.annotation.Nonnull String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the variable
     *
     * @return id
     */
    @javax.annotation.Nonnull
    public String getId() {
        return id;
    }

    public void setId(@javax.annotation.Nonnull String id) {
        this.id = id;
    }

    public Variable name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the variable
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

    public Variable variableType(@javax.annotation.Nullable VariableTypeEnum variableType) {
        this.variableType = variableType;
        return this;
    }

    /**
     * Type of the variable
     *
     * @return variableType
     */
    @javax.annotation.Nullable
    public VariableTypeEnum getVariableType() {
        return variableType;
    }

    public void setVariableType(@javax.annotation.Nullable VariableTypeEnum variableType) {
        this.variableType = variableType;
    }

    public Variable sensitive(@javax.annotation.Nullable Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }

    /**
     * If the variable is sensitive
     *
     * @return sensitive
     */
    @javax.annotation.Nullable
    public Boolean getSensitive() {
        return sensitive;
    }

    public void setSensitive(@javax.annotation.Nullable Boolean sensitive) {
        this.sensitive = sensitive;
    }

    public Variable values(@javax.annotation.Nullable List<VariableValue> values) {
        this.values = values;
        return this;
    }

    public Variable addValuesItem(VariableValue valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    /**
     * Values of the variable
     *
     * @return values
     */
    @javax.annotation.Nullable
    public List<VariableValue> getValues() {
        return values;
    }

    public void setValues(@javax.annotation.Nullable List<VariableValue> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Variable variable = (Variable) o;
        return Objects.equals(this.id, variable.id)
                && Objects.equals(this.name, variable.name)
                && Objects.equals(this.variableType, variable.variableType)
                && Objects.equals(this.sensitive, variable.sensitive)
                && Objects.equals(this.values, variable.values);
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
        return Objects.hash(id, name, variableType, sensitive, values);
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
        sb.append("class Variable {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
        sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
        openapiFields.add("name");
        openapiFields.add("variable_type");
        openapiFields.add("sensitive");
        openapiFields.add("values");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("name");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Variable
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!Variable.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Variable is not found in the empty"
                                        + " JSON string",
                                Variable.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!Variable.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `Variable` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : Variable.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
        }
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if ((jsonObj.get("variable_type") != null && !jsonObj.get("variable_type").isJsonNull())
                && !jsonObj.get("variable_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `variable_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("variable_type").toString()));
        }
        // validate the optional field `variable_type`
        if (jsonObj.get("variable_type") != null && !jsonObj.get("variable_type").isJsonNull()) {
            VariableTypeEnum.validateJsonElement(jsonObj.get("variable_type"));
        }
        if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull()) {
            JsonArray jsonArrayvalues = jsonObj.getAsJsonArray("values");
            if (jsonArrayvalues != null) {
                // ensure the json data is an array
                if (!jsonObj.get("values").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `values` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("values").toString()));
                }

                // validate the optional field `values` (array)
                for (int i = 0; i < jsonArrayvalues.size(); i++) {
                    VariableValue.validateJsonElement(jsonArrayvalues.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Variable.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Variable' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Variable> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Variable.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Variable>() {
                        @Override
                        public void write(JsonWriter out, Variable value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Variable read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Variable given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Variable
     * @throws IOException if the JSON string is invalid with respect to Variable
     */
    public static Variable fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Variable.class);
    }

    /**
     * Convert an instance of Variable to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
