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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Wrapper for the post-upgrade failed entities, as they are inside a &#39;data&#39; field in the
 * response.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ResponsePostUpgradeFailedEntities implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DATA = "data";

    @SerializedName(SERIALIZED_NAME_DATA)
    @javax.annotation.Nonnull
    private List<ResponsePostUpgradeFailedEntity> data;

    public ResponsePostUpgradeFailedEntities() {}

    public ResponsePostUpgradeFailedEntities data(
            @javax.annotation.Nonnull List<ResponsePostUpgradeFailedEntity> data) {
        this.data = data;
        return this;
    }

    public ResponsePostUpgradeFailedEntities addDataItem(ResponsePostUpgradeFailedEntity dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @javax.annotation.Nonnull
    public List<ResponsePostUpgradeFailedEntity> getData() {
        return data;
    }

    public void setData(@javax.annotation.Nonnull List<ResponsePostUpgradeFailedEntity> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponsePostUpgradeFailedEntities responsePostUpgradeFailedEntities =
                (ResponsePostUpgradeFailedEntities) o;
        return Objects.equals(this.data, responsePostUpgradeFailedEntities.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponsePostUpgradeFailedEntities {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
        openapiFields.add("data");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("data");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ResponsePostUpgradeFailedEntities
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ResponsePostUpgradeFailedEntities.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ResponsePostUpgradeFailedEntities is"
                                        + " not found in the empty JSON string",
                                ResponsePostUpgradeFailedEntities.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ResponsePostUpgradeFailedEntities.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `ResponsePostUpgradeFailedEntities` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ResponsePostUpgradeFailedEntities.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the json data is an array
        if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `data` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("data").toString()));
        }

        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        // validate the required field `data` (array)
        for (int i = 0; i < jsonArraydata.size(); i++) {
            ResponsePostUpgradeFailedEntity.validateJsonElement(jsonArraydata.get(i));
        }
        ;
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ResponsePostUpgradeFailedEntities.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ResponsePostUpgradeFailedEntities' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ResponsePostUpgradeFailedEntities> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ResponsePostUpgradeFailedEntities.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ResponsePostUpgradeFailedEntities>() {
                        @Override
                        public void write(JsonWriter out, ResponsePostUpgradeFailedEntities value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ResponsePostUpgradeFailedEntities read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ResponsePostUpgradeFailedEntities given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ResponsePostUpgradeFailedEntities
     * @throws IOException if the JSON string is invalid with respect to
     *     ResponsePostUpgradeFailedEntities
     */
    public static ResponsePostUpgradeFailedEntities fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ResponsePostUpgradeFailedEntities.class);
    }

    /**
     * Convert an instance of ResponsePostUpgradeFailedEntities to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
