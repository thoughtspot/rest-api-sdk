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

/** GetNLInstructionsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GetNLInstructionsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DATA_SOURCE_IDENTIFIER = "data_source_identifier";

    @SerializedName(SERIALIZED_NAME_DATA_SOURCE_IDENTIFIER)
    @javax.annotation.Nonnull
    private String dataSourceIdentifier;

    public GetNLInstructionsRequest() {}

    public GetNLInstructionsRequest dataSourceIdentifier(
            @javax.annotation.Nonnull String dataSourceIdentifier) {
        this.dataSourceIdentifier = dataSourceIdentifier;
        return this;
    }

    /**
     * Unique ID or name of the data-model for which to retrieve NL instructions.
     *
     * @return dataSourceIdentifier
     */
    @javax.annotation.Nonnull
    public String getDataSourceIdentifier() {
        return dataSourceIdentifier;
    }

    public void setDataSourceIdentifier(@javax.annotation.Nonnull String dataSourceIdentifier) {
        this.dataSourceIdentifier = dataSourceIdentifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetNLInstructionsRequest getNLInstructionsRequest = (GetNLInstructionsRequest) o;
        return Objects.equals(
                this.dataSourceIdentifier, getNLInstructionsRequest.dataSourceIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSourceIdentifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetNLInstructionsRequest {\n");
        sb.append("    dataSourceIdentifier: ")
                .append(toIndentedString(dataSourceIdentifier))
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
        openapiFields.add("data_source_identifier");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("data_source_identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to GetNLInstructionsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetNLInstructionsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in GetNLInstructionsRequest is not found"
                                        + " in the empty JSON string",
                                GetNLInstructionsRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!GetNLInstructionsRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `GetNLInstructionsRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : GetNLInstructionsRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("data_source_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `data_source_identifier` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("data_source_identifier").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetNLInstructionsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetNLInstructionsRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetNLInstructionsRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(GetNLInstructionsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GetNLInstructionsRequest>() {
                        @Override
                        public void write(JsonWriter out, GetNLInstructionsRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GetNLInstructionsRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GetNLInstructionsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetNLInstructionsRequest
     * @throws IOException if the JSON string is invalid with respect to GetNLInstructionsRequest
     */
    public static GetNLInstructionsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetNLInstructionsRequest.class);
    }

    /**
     * Convert an instance of GetNLInstructionsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
