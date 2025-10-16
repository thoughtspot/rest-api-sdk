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
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * JWT user options to create a JWT token given the payload. *Deprecated in 9.12.0.cl. Use
 * user_parameters instead.*
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class JWTUserOptionsFull implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_PARAMETERS = "parameters";

    @SerializedName(SERIALIZED_NAME_PARAMETERS)
    @javax.annotation.Nullable
    private List<JWTParameter> parameters;

    public JWTUserOptionsFull() {}

    public JWTUserOptionsFull parameters(@javax.annotation.Nullable List<JWTParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public JWTUserOptionsFull addParametersItem(JWTParameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
     * Get parameters
     *
     * @return parameters
     */
    @javax.annotation.Nullable
    public List<JWTParameter> getParameters() {
        return parameters;
    }

    public void setParameters(@javax.annotation.Nullable List<JWTParameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JWTUserOptionsFull jwTUserOptionsFull = (JWTUserOptionsFull) o;
        return Objects.equals(this.parameters, jwTUserOptionsFull.parameters);
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
        return Objects.hash(parameters);
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
        sb.append("class JWTUserOptionsFull {\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
        openapiFields.add("parameters");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to JWTUserOptionsFull
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!JWTUserOptionsFull.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in JWTUserOptionsFull is not found in"
                                        + " the empty JSON string",
                                JWTUserOptionsFull.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!JWTUserOptionsFull.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `JWTUserOptionsFull` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
            JsonArray jsonArrayparameters = jsonObj.getAsJsonArray("parameters");
            if (jsonArrayparameters != null) {
                // ensure the json data is an array
                if (!jsonObj.get("parameters").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `parameters` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("parameters").toString()));
                }

                // validate the optional field `parameters` (array)
                for (int i = 0; i < jsonArrayparameters.size(); i++) {
                    JWTParameter.validateJsonElement(jsonArrayparameters.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!JWTUserOptionsFull.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'JWTUserOptionsFull' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<JWTUserOptionsFull> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(JWTUserOptionsFull.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<JWTUserOptionsFull>() {
                        @Override
                        public void write(JsonWriter out, JWTUserOptionsFull value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public JWTUserOptionsFull read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of JWTUserOptionsFull given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of JWTUserOptionsFull
     * @throws IOException if the JSON string is invalid with respect to JWTUserOptionsFull
     */
    public static JWTUserOptionsFull fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, JWTUserOptionsFull.class);
    }

    /**
     * Convert an instance of JWTUserOptionsFull to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
