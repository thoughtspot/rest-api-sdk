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
import com.google.gson.annotations.JsonAdapter;
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

/** UpdateCollectionRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UpdateCollectionRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nullable
    private String name;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nullable
    private String description;

    public static final String SERIALIZED_NAME_METADATA = "metadata";

    @SerializedName(SERIALIZED_NAME_METADATA)
    @javax.annotation.Nullable
    private List<CollectionMetadataInput> metadata;

    /** Type of update operation. Default operation type is REPLACE. */
    @JsonAdapter(OperationEnum.Adapter.class)
    public enum OperationEnum {
        ADD("ADD"),

        REMOVE("REMOVE"),

        REPLACE("REPLACE");

        private String value;

        OperationEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OperationEnum fromValue(String value) {
            for (OperationEnum b : OperationEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<OperationEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OperationEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OperationEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OperationEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            OperationEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_OPERATION = "operation";

    @SerializedName(SERIALIZED_NAME_OPERATION)
    @javax.annotation.Nullable
    private OperationEnum operation = OperationEnum.REPLACE;

    public UpdateCollectionRequest() {}

    public UpdateCollectionRequest name(@javax.annotation.Nullable String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the collection.
     *
     * @return name
     */
    @javax.annotation.Nullable
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nullable String name) {
        this.name = name;
    }

    public UpdateCollectionRequest description(@javax.annotation.Nullable String description) {
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

    public UpdateCollectionRequest metadata(
            @javax.annotation.Nullable List<CollectionMetadataInput> metadata) {
        this.metadata = metadata;
        return this;
    }

    public UpdateCollectionRequest addMetadataItem(CollectionMetadataInput metadataItem) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadataItem);
        return this;
    }

    /**
     * Metadata objects to add, remove, or replace in the collection.
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

    public UpdateCollectionRequest operation(@javax.annotation.Nullable OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Type of update operation. Default operation type is REPLACE.
     *
     * @return operation
     */
    @javax.annotation.Nullable
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(@javax.annotation.Nullable OperationEnum operation) {
        this.operation = operation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCollectionRequest updateCollectionRequest = (UpdateCollectionRequest) o;
        return Objects.equals(this.name, updateCollectionRequest.name)
                && Objects.equals(this.description, updateCollectionRequest.description)
                && Objects.equals(this.metadata, updateCollectionRequest.metadata)
                && Objects.equals(this.operation, updateCollectionRequest.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, metadata, operation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCollectionRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
        openapiFields.add("operation");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpdateCollectionRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UpdateCollectionRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateCollectionRequest is not found"
                                        + " in the empty JSON string",
                                UpdateCollectionRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!UpdateCollectionRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UpdateCollectionRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
                && !jsonObj.get("name").isJsonPrimitive()) {
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
        if ((jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull())
                && !jsonObj.get("operation").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `operation` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("operation").toString()));
        }
        // validate the optional field `operation`
        if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) {
            OperationEnum.validateJsonElement(jsonObj.get("operation"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateCollectionRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateCollectionRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateCollectionRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UpdateCollectionRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateCollectionRequest>() {
                        @Override
                        public void write(JsonWriter out, UpdateCollectionRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateCollectionRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateCollectionRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateCollectionRequest
     * @throws IOException if the JSON string is invalid with respect to UpdateCollectionRequest
     */
    public static UpdateCollectionRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateCollectionRequest.class);
    }

    /**
     * Convert an instance of UpdateCollectionRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
