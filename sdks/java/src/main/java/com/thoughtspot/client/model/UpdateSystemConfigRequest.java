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

/** UpdateSystemConfigRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UpdateSystemConfigRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";

    @SerializedName(SERIALIZED_NAME_CONFIGURATION)
    @javax.annotation.Nonnull
    private Object _configuration;

    public UpdateSystemConfigRequest() {}

    public UpdateSystemConfigRequest _configuration(
            @javax.annotation.Nonnull Object _configuration) {
        this._configuration = _configuration;
        return this;
    }

    /**
     * Configuration JSON with the key-value pair of configuration attributes to be updated.
     *
     * @return _configuration
     */
    @javax.annotation.Nonnull
    public Object getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(@javax.annotation.Nonnull Object _configuration) {
        this._configuration = _configuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSystemConfigRequest updateSystemConfigRequest = (UpdateSystemConfigRequest) o;
        return Objects.equals(this._configuration, updateSystemConfigRequest._configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_configuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSystemConfigRequest {\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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
        openapiFields.add("configuration");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("configuration");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpdateSystemConfigRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UpdateSystemConfigRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateSystemConfigRequest is not"
                                        + " found in the empty JSON string",
                                UpdateSystemConfigRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!UpdateSystemConfigRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UpdateSystemConfigRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UpdateSystemConfigRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateSystemConfigRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateSystemConfigRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateSystemConfigRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UpdateSystemConfigRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateSystemConfigRequest>() {
                        @Override
                        public void write(JsonWriter out, UpdateSystemConfigRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateSystemConfigRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateSystemConfigRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateSystemConfigRequest
     * @throws IOException if the JSON string is invalid with respect to UpdateSystemConfigRequest
     */
    public static UpdateSystemConfigRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateSystemConfigRequest.class);
    }

    /**
     * Convert an instance of UpdateSystemConfigRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
