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
public class RuntimeParamOverride implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_RUNTIME_PARAM_OVERRIDE = "runtime_param_override";

    @SerializedName(SERIALIZED_NAME_RUNTIME_PARAM_OVERRIDE)
    @javax.annotation.Nullable
    private Object runtimeParamOverride;

    public RuntimeParamOverride() {}

    public RuntimeParamOverride runtimeParamOverride(
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
        RuntimeParamOverride runtimeParamOverride = (RuntimeParamOverride) o;
        return Objects.equals(this.runtimeParamOverride, runtimeParamOverride.runtimeParamOverride);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runtimeParamOverride);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuntimeParamOverride {\n");
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
        openapiFields.add("runtime_param_override");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to RuntimeParamOverride
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!RuntimeParamOverride.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in RuntimeParamOverride is not found in"
                                        + " the empty JSON string",
                                RuntimeParamOverride.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!RuntimeParamOverride.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `RuntimeParamOverride` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RuntimeParamOverride.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RuntimeParamOverride' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RuntimeParamOverride> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(RuntimeParamOverride.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<RuntimeParamOverride>() {
                        @Override
                        public void write(JsonWriter out, RuntimeParamOverride value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public RuntimeParamOverride read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of RuntimeParamOverride given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RuntimeParamOverride
     * @throws IOException if the JSON string is invalid with respect to RuntimeParamOverride
     */
    public static RuntimeParamOverride fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RuntimeParamOverride.class);
    }

    /**
     * Convert an instance of RuntimeParamOverride to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
