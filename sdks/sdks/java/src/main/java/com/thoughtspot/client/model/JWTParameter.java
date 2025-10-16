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

/** List of runtime parameters need to set during the session. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class JWTParameter implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_RUNTIME_FILTER = "runtime_filter";

    @SerializedName(SERIALIZED_NAME_RUNTIME_FILTER)
    @javax.annotation.Nullable
    private Object runtimeFilter;

    public static final String SERIALIZED_NAME_RUNTIME_SORT = "runtime_sort";

    @SerializedName(SERIALIZED_NAME_RUNTIME_SORT)
    @javax.annotation.Nullable
    private Object runtimeSort;

    public static final String SERIALIZED_NAME_RUNTIME_PARAM_OVERRIDE = "runtime_param_override";

    @SerializedName(SERIALIZED_NAME_RUNTIME_PARAM_OVERRIDE)
    @javax.annotation.Nullable
    private Object runtimeParamOverride;

    public JWTParameter() {}

    public JWTParameter runtimeFilter(@javax.annotation.Nullable Object runtimeFilter) {
        this.runtimeFilter = runtimeFilter;
        return this;
    }

    /**
     * Runtime filter parameter type in JWT.
     *
     * @return runtimeFilter
     */
    @javax.annotation.Nullable
    public Object getRuntimeFilter() {
        return runtimeFilter;
    }

    public void setRuntimeFilter(@javax.annotation.Nullable Object runtimeFilter) {
        this.runtimeFilter = runtimeFilter;
    }

    public JWTParameter runtimeSort(@javax.annotation.Nullable Object runtimeSort) {
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

    public JWTParameter runtimeParamOverride(
            @javax.annotation.Nullable Object runtimeParamOverride) {
        this.runtimeParamOverride = runtimeParamOverride;
        return this;
    }

    /**
     * Runtime param override type in JWT.
     *
     * @return runtimeParamOverride
     */
    @javax.annotation.Nullable
    public Object getRuntimeParamOverride() {
        return runtimeParamOverride;
    }

    public void setRuntimeParamOverride(@javax.annotation.Nullable Object runtimeParamOverride) {
        this.runtimeParamOverride = runtimeParamOverride;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JWTParameter jwTParameter = (JWTParameter) o;
        return Objects.equals(this.runtimeFilter, jwTParameter.runtimeFilter)
                && Objects.equals(this.runtimeSort, jwTParameter.runtimeSort)
                && Objects.equals(this.runtimeParamOverride, jwTParameter.runtimeParamOverride);
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
        return Objects.hash(runtimeFilter, runtimeSort, runtimeParamOverride);
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
        sb.append("class JWTParameter {\n");
        sb.append("    runtimeFilter: ").append(toIndentedString(runtimeFilter)).append("\n");
        sb.append("    runtimeSort: ").append(toIndentedString(runtimeSort)).append("\n");
        sb.append("    runtimeParamOverride: ")
                .append(toIndentedString(runtimeParamOverride))
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
        openapiFields.add("runtime_filter");
        openapiFields.add("runtime_sort");
        openapiFields.add("runtime_param_override");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to JWTParameter
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!JWTParameter.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in JWTParameter is not found in the"
                                        + " empty JSON string",
                                JWTParameter.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!JWTParameter.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `JWTParameter` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!JWTParameter.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'JWTParameter' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<JWTParameter> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(JWTParameter.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<JWTParameter>() {
                        @Override
                        public void write(JsonWriter out, JWTParameter value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public JWTParameter read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of JWTParameter given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of JWTParameter
     * @throws IOException if the JSON string is invalid with respect to JWTParameter
     */
    public static JWTParameter fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, JWTParameter.class);
    }

    /**
     * Convert an instance of JWTParameter to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
