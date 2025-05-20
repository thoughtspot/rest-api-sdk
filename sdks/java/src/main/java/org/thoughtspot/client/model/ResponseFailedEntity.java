/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package org.thoughtspot.client.model;


import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.thoughtspot.client.JSON;

/** Unique ID of the failed worksheet. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ResponseFailedEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nonnull
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    public static final String SERIALIZED_NAME_ERROR = "error";

    @SerializedName(SERIALIZED_NAME_ERROR)
    @javax.annotation.Nonnull
    private String error;

    public ResponseFailedEntity() {}

    public ResponseFailedEntity id(@javax.annotation.Nonnull String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    public String getId() {
        return id;
    }

    public void setId(@javax.annotation.Nonnull String id) {
        this.id = id;
    }

    public ResponseFailedEntity name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the worksheet that failed to convert.
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

    public ResponseFailedEntity error(@javax.annotation.Nonnull String error) {
        this.error = error;
        return this;
    }

    /**
     * Error details related to the failed conversion.
     *
     * @return error
     */
    @javax.annotation.Nonnull
    public String getError() {
        return error;
    }

    public void setError(@javax.annotation.Nonnull String error) {
        this.error = error;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseFailedEntity responseFailedEntity = (ResponseFailedEntity) o;
        return Objects.equals(this.id, responseFailedEntity.id)
                && Objects.equals(this.name, responseFailedEntity.name)
                && Objects.equals(this.error, responseFailedEntity.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseFailedEntity {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
        openapiFields.add("id");
        openapiFields.add("name");
        openapiFields.add("error");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("error");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ResponseFailedEntity
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ResponseFailedEntity.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ResponseFailedEntity is not found in"
                                        + " the empty JSON string",
                                ResponseFailedEntity.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ResponseFailedEntity.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ResponseFailedEntity` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ResponseFailedEntity.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
        }
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if (!jsonObj.get("error").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `error` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("error").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ResponseFailedEntity.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ResponseFailedEntity' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ResponseFailedEntity> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ResponseFailedEntity.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ResponseFailedEntity>() {
                        @Override
                        public void write(JsonWriter out, ResponseFailedEntity value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ResponseFailedEntity read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ResponseFailedEntity given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ResponseFailedEntity
     * @throws IOException if the JSON string is invalid with respect to ResponseFailedEntity
     */
    public static ResponseFailedEntity fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ResponseFailedEntity.class);
    }

    /**
     * Convert an instance of ResponseFailedEntity to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
