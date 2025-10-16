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

/**
 * Default Custom action configuration. This includes the custom action&#39;s visibility across all
 * visualizations and Answers. By default, a custom action is added to all visualizations and
 * Answers.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DefaultActionConfigInputCreate implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_VISIBILITY = "visibility";

    @SerializedName(SERIALIZED_NAME_VISIBILITY)
    @javax.annotation.Nullable
    private Boolean visibility = true;

    public DefaultActionConfigInputCreate() {}

    public DefaultActionConfigInputCreate visibility(
            @javax.annotation.Nullable Boolean visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Custom action is available on all visualizations. Earlier naming convention: LOCAL/GLOBAL.
     * TRUE signifies GLOBAL for backward compatibility. Default: true
     *
     * @return visibility
     */
    @javax.annotation.Nullable
    public Boolean getVisibility() {
        return visibility;
    }

    public void setVisibility(@javax.annotation.Nullable Boolean visibility) {
        this.visibility = visibility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DefaultActionConfigInputCreate defaultActionConfigInputCreate =
                (DefaultActionConfigInputCreate) o;
        return Objects.equals(this.visibility, defaultActionConfigInputCreate.visibility);
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
        return Objects.hash(visibility);
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
        sb.append("class DefaultActionConfigInputCreate {\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
        openapiFields.add("visibility");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     DefaultActionConfigInputCreate
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DefaultActionConfigInputCreate.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DefaultActionConfigInputCreate is not"
                                        + " found in the empty JSON string",
                                DefaultActionConfigInputCreate.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!DefaultActionConfigInputCreate.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `DefaultActionConfigInputCreate` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DefaultActionConfigInputCreate.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DefaultActionConfigInputCreate' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DefaultActionConfigInputCreate> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(DefaultActionConfigInputCreate.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DefaultActionConfigInputCreate>() {
                        @Override
                        public void write(JsonWriter out, DefaultActionConfigInputCreate value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DefaultActionConfigInputCreate read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DefaultActionConfigInputCreate given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DefaultActionConfigInputCreate
     * @throws IOException if the JSON string is invalid with respect to
     *     DefaultActionConfigInputCreate
     */
    public static DefaultActionConfigInputCreate fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DefaultActionConfigInputCreate.class);
    }

    /**
     * Convert an instance of DefaultActionConfigInputCreate to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
