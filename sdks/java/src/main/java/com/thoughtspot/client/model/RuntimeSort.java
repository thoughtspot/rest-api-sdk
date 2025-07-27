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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** List of runtime parameters need to set during the session. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class RuntimeSort implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_RUNTIME_SORT = "runtime_sort";

    @SerializedName(SERIALIZED_NAME_RUNTIME_SORT)
    @javax.annotation.Nullable
    private Object runtimeSort;

    public RuntimeSort() {}

    public RuntimeSort runtimeSort(@javax.annotation.Nullable Object runtimeSort) {
        this.runtimeSort = runtimeSort;
        return this;
    }

    /**
     * Runtime sort parameter type in JWT.
     *
     * @return runtimeSort
     */
    @javax.annotation.Nullable
    public Object getRuntimeSort() {
        return runtimeSort;
    }

    public void setRuntimeSort(@javax.annotation.Nullable Object runtimeSort) {
        this.runtimeSort = runtimeSort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuntimeSort runtimeSort = (RuntimeSort) o;
        return Objects.equals(this.runtimeSort, runtimeSort.runtimeSort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runtimeSort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuntimeSort {\n");
        sb.append("    runtimeSort: ").append(toIndentedString(runtimeSort)).append("\n");
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
        openapiFields.add("runtime_sort");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to RuntimeSort
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!RuntimeSort.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in RuntimeSort is not found in the empty"
                                        + " JSON string",
                                RuntimeSort.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!RuntimeSort.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `RuntimeSort` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RuntimeSort.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RuntimeSort' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RuntimeSort> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(RuntimeSort.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<RuntimeSort>() {
                        @Override
                        public void write(JsonWriter out, RuntimeSort value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public RuntimeSort read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of RuntimeSort given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RuntimeSort
     * @throws IOException if the JSON string is invalid with respect to RuntimeSort
     */
    public static RuntimeSort fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RuntimeSort.class);
    }

    /**
     * Convert an instance of RuntimeSort to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
