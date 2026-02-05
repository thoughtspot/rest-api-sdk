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

/** CreateCollectionRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CreateCollectionRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nullable
    private String description;

    public static final String SERIALIZED_NAME_METADATA = "metadata";

    @SerializedName(SERIALIZED_NAME_METADATA)
    @javax.annotation.Nullable
    private List<CollectionMetadataInput> metadata;

    public CreateCollectionRequest() {}

    public CreateCollectionRequest name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the collection.
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

    public CreateCollectionRequest description(@javax.annotation.Nullable String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the collection.
     *
     * @return description
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@javax.annotation.Nullable String description) {
        this.description = description;
    }

    public CreateCollectionRequest metadata(
            @javax.annotation.Nullable List<CollectionMetadataInput> metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreateCollectionRequest addMetadataItem(CollectionMetadataInput metadataItem) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadataItem);
        return this;
    }

    /**
     * Metadata objects to add to the collection.
     *
     * @return metadata
     */
    @javax.annotation.Nullable
    public List<CollectionMetadataInput> getMetadata() {
        return metadata;
    }

    public void setMetadata(@javax.annotation.Nullable List<CollectionMetadataInput> metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCollectionRequest createCollectionRequest = (CreateCollectionRequest) o;
        return Objects.equals(this.name, createCollectionRequest.name)
                && Objects.equals(this.description, createCollectionRequest.description)
                && Objects.equals(this.metadata, createCollectionRequest.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCollectionRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
        openapiFields.add("description");
        openapiFields.add("metadata");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("name");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateCollectionRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CreateCollectionRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateCollectionRequest is not found"
                                        + " in the empty JSON string",
                                CreateCollectionRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CreateCollectionRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateCollectionRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateCollectionRequest.openapiRequiredFields) {
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
        if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
                && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("description").toString()));
        }
        if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
            JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
            if (jsonArraymetadata != null) {
                // ensure the json data is an array
                if (!jsonObj.get("metadata").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `metadata` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("metadata").toString()));
                }

                // validate the optional field `metadata` (array)
                for (int i = 0; i < jsonArraymetadata.size(); i++) {
                    CollectionMetadataInput.validateJsonElement(jsonArraymetadata.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateCollectionRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateCollectionRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateCollectionRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CreateCollectionRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateCollectionRequest>() {
                        @Override
                        public void write(JsonWriter out, CreateCollectionRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateCollectionRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateCollectionRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateCollectionRequest
     * @throws IOException if the JSON string is invalid with respect to CreateCollectionRequest
     */
    public static CreateCollectionRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateCollectionRequest.class);
    }

    /**
     * Convert an instance of CreateCollectionRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
