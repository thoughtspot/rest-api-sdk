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

/** RiseSetter */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class RiseSetter implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_FIELD = "field";

    @SerializedName(SERIALIZED_NAME_FIELD)
    @javax.annotation.Nonnull
    private String field;

    public static final String SERIALIZED_NAME_PATH = "path";

    @SerializedName(SERIALIZED_NAME_PATH)
    @javax.annotation.Nonnull
    private String path;

    public RiseSetter() {}

    public RiseSetter field(@javax.annotation.Nonnull String field) {
        this.field = field;
        return this;
    }

    /**
     * Get field
     *
     * @return field
     */
    @javax.annotation.Nonnull
    public String getField() {
        return field;
    }

    public void setField(@javax.annotation.Nonnull String field) {
        this.field = field;
    }

    public RiseSetter path(@javax.annotation.Nonnull String path) {
        this.path = path;
        return this;
    }

    /**
     * Get path
     *
     * @return path
     */
    @javax.annotation.Nonnull
    public String getPath() {
        return path;
    }

    public void setPath(@javax.annotation.Nonnull String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RiseSetter riseSetter = (RiseSetter) o;
        return Objects.equals(this.field, riseSetter.field)
                && Objects.equals(this.path, riseSetter.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RiseSetter {\n");
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
        openapiFields.add("field");
        openapiFields.add("path");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("field");
        openapiRequiredFields.add("path");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to RiseSetter
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!RiseSetter.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in RiseSetter is not found in the empty"
                                        + " JSON string",
                                RiseSetter.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!RiseSetter.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `RiseSetter` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : RiseSetter.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("field").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `field` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("field").toString()));
        }
        if (!jsonObj.get("path").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `path` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("path").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RiseSetter.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RiseSetter' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RiseSetter> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(RiseSetter.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<RiseSetter>() {
                        @Override
                        public void write(JsonWriter out, RiseSetter value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public RiseSetter read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of RiseSetter given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RiseSetter
     * @throws IOException if the JSON string is invalid with respect to RiseSetter
     */
    public static RiseSetter fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RiseSetter.class);
    }

    /**
     * Convert an instance of RiseSetter to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
