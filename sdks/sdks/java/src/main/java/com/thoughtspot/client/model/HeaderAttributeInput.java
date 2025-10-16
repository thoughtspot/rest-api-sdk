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

/** Attribute to update in a header. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class HeaderAttributeInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    public static final String SERIALIZED_NAME_VALUE = "value";

    @SerializedName(SERIALIZED_NAME_VALUE)
    @javax.annotation.Nonnull
    private String value;

    public HeaderAttributeInput() {}

    public HeaderAttributeInput name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Attribute name to be updated.
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

    public HeaderAttributeInput value(@javax.annotation.Nonnull String value) {
        this.value = value;
        return this;
    }

    /**
     * Attribute&#39;s new value.
     *
     * @return value
     */
    @javax.annotation.Nonnull
    public String getValue() {
        return value;
    }

    public void setValue(@javax.annotation.Nonnull String value) {
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
        HeaderAttributeInput headerAttributeInput = (HeaderAttributeInput) o;
        return Objects.equals(this.name, headerAttributeInput.name)
                && Objects.equals(this.value, headerAttributeInput.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HeaderAttributeInput {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
        openapiFields.add("name");
        openapiFields.add("value");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("value");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to HeaderAttributeInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!HeaderAttributeInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in HeaderAttributeInput is not found in"
                                        + " the empty JSON string",
                                HeaderAttributeInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!HeaderAttributeInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `HeaderAttributeInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : HeaderAttributeInput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if (!jsonObj.get("value").isJsonPrimitive()) {
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
            if (!HeaderAttributeInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'HeaderAttributeInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<HeaderAttributeInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(HeaderAttributeInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<HeaderAttributeInput>() {
                        @Override
                        public void write(JsonWriter out, HeaderAttributeInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public HeaderAttributeInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of HeaderAttributeInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of HeaderAttributeInput
     * @throws IOException if the JSON string is invalid with respect to HeaderAttributeInput
     */
    public static HeaderAttributeInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, HeaderAttributeInput.class);
    }

    /**
     * Convert an instance of HeaderAttributeInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
