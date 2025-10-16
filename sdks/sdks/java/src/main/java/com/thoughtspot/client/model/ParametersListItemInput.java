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

/** ParametersListItemInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ParametersListItemInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_KEY = "key";

    @SerializedName(SERIALIZED_NAME_KEY)
    @javax.annotation.Nullable
    private String key;

    public static final String SERIALIZED_NAME_VALUE = "value";

    @SerializedName(SERIALIZED_NAME_VALUE)
    @javax.annotation.Nullable
    private String value;

    public ParametersListItemInput() {}

    public ParametersListItemInput key(@javax.annotation.Nullable String key) {
        this.key = key;
        return this;
    }

    /**
     * Key for the url query parameter
     *
     * @return key
     */
    @javax.annotation.Nullable
    public String getKey() {
        return key;
    }

    public void setKey(@javax.annotation.Nullable String key) {
        this.key = key;
    }

    public ParametersListItemInput value(@javax.annotation.Nullable String value) {
        this.value = value;
        return this;
    }

    /**
     * Value for the url query parameter
     *
     * @return value
     */
    @javax.annotation.Nullable
    public String getValue() {
        return value;
    }

    public void setValue(@javax.annotation.Nullable String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParametersListItemInput parametersListItemInput = (ParametersListItemInput) o;
        return Objects.equals(this.key, parametersListItemInput.key)
                && Objects.equals(this.value, parametersListItemInput.value);
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
        return Objects.hash(key, value);
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
        sb.append("class ParametersListItemInput {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
        openapiFields.add("key");
        openapiFields.add("value");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ParametersListItemInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ParametersListItemInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ParametersListItemInput is not found"
                                        + " in the empty JSON string",
                                ParametersListItemInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ParametersListItemInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ParametersListItemInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull())
                && !jsonObj.get("key").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `key` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("key").toString()));
        }
        if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull())
                && !jsonObj.get("value").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `value` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("value").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ParametersListItemInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ParametersListItemInput' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ParametersListItemInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ParametersListItemInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ParametersListItemInput>() {
                        @Override
                        public void write(JsonWriter out, ParametersListItemInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ParametersListItemInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ParametersListItemInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ParametersListItemInput
     * @throws IOException if the JSON string is invalid with respect to ParametersListItemInput
     */
    public static ParametersListItemInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ParametersListItemInput.class);
    }

    /**
     * Convert an instance of ParametersListItemInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
