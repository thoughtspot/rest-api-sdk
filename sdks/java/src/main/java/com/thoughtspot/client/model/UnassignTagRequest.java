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

/** UnassignTagRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UnassignTagRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_METADATA = "metadata";

    @SerializedName(SERIALIZED_NAME_METADATA)
    @javax.annotation.Nonnull
    private List<TagMetadataTypeInput> metadata;

    public static final String SERIALIZED_NAME_TAG_IDENTIFIERS = "tag_identifiers";

    @SerializedName(SERIALIZED_NAME_TAG_IDENTIFIERS)
    @javax.annotation.Nonnull
    private List<String> tagIdentifiers;

    public UnassignTagRequest() {}

    public UnassignTagRequest metadata(
            @javax.annotation.Nonnull List<TagMetadataTypeInput> metadata) {
        this.metadata = metadata;
        return this;
    }

    public UnassignTagRequest addMetadataItem(TagMetadataTypeInput metadataItem) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadataItem);
        return this;
    }

    /**
     * Metadata objects.
     *
     * @return metadata
     */
    @javax.annotation.Nonnull
    public List<TagMetadataTypeInput> getMetadata() {
        return metadata;
    }

    public void setMetadata(@javax.annotation.Nonnull List<TagMetadataTypeInput> metadata) {
        this.metadata = metadata;
    }

    public UnassignTagRequest tagIdentifiers(
            @javax.annotation.Nonnull List<String> tagIdentifiers) {
        this.tagIdentifiers = tagIdentifiers;
        return this;
    }

    public UnassignTagRequest addTagIdentifiersItem(String tagIdentifiersItem) {
        if (this.tagIdentifiers == null) {
            this.tagIdentifiers = new ArrayList<>();
        }
        this.tagIdentifiers.add(tagIdentifiersItem);
        return this;
    }

    /**
     * GUID or name of the tag.
     *
     * @return tagIdentifiers
     */
    @javax.annotation.Nonnull
    public List<String> getTagIdentifiers() {
        return tagIdentifiers;
    }

    public void setTagIdentifiers(@javax.annotation.Nonnull List<String> tagIdentifiers) {
        this.tagIdentifiers = tagIdentifiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnassignTagRequest unassignTagRequest = (UnassignTagRequest) o;
        return Objects.equals(this.metadata, unassignTagRequest.metadata)
                && Objects.equals(this.tagIdentifiers, unassignTagRequest.tagIdentifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, tagIdentifiers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnassignTagRequest {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    tagIdentifiers: ").append(toIndentedString(tagIdentifiers)).append("\n");
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
        openapiFields.add("metadata");
        openapiFields.add("tag_identifiers");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("metadata");
        openapiRequiredFields.add("tag_identifiers");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UnassignTagRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UnassignTagRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UnassignTagRequest is not found in"
                                        + " the empty JSON string",
                                UnassignTagRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!UnassignTagRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UnassignTagRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UnassignTagRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the json data is an array
        if (!jsonObj.get("metadata").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("metadata").toString()));
        }

        JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
        // validate the required field `metadata` (array)
        for (int i = 0; i < jsonArraymetadata.size(); i++) {
            TagMetadataTypeInput.validateJsonElement(jsonArraymetadata.get(i));
        }
        ;
        // ensure the required json array is present
        if (jsonObj.get("tag_identifiers") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("tag_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `tag_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("tag_identifiers").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UnassignTagRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UnassignTagRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UnassignTagRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UnassignTagRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UnassignTagRequest>() {
                        @Override
                        public void write(JsonWriter out, UnassignTagRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UnassignTagRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UnassignTagRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UnassignTagRequest
     * @throws IOException if the JSON string is invalid with respect to UnassignTagRequest
     */
    public static UnassignTagRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UnassignTagRequest.class);
    }

    /**
     * Convert an instance of UnassignTagRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
