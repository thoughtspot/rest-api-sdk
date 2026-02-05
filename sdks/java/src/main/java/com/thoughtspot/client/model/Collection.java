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
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** Response object for a collection. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class Collection implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nonnull
    private String id;

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
    private List<CollectionMetadataItem> metadata;

    public static final String SERIALIZED_NAME_CREATED_AT = "created_at";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    @javax.annotation.Nullable
    private String createdAt;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    @javax.annotation.Nullable
    private String updatedAt;

    public static final String SERIALIZED_NAME_AUTHOR_NAME = "author_name";

    @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
    @javax.annotation.Nullable
    private String authorName;

    public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";

    @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
    @javax.annotation.Nullable
    private String authorId;

    public static final String SERIALIZED_NAME_ORG = "org";

    @SerializedName(SERIALIZED_NAME_ORG)
    @javax.annotation.Nullable
    private CollectionEntityIdentifier org;

    public Collection() {}

    public Collection id(@javax.annotation.Nonnull String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the collection.
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

    public Collection name(@javax.annotation.Nonnull String name) {
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

    public Collection description(@javax.annotation.Nullable String description) {
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

    public Collection metadata(@javax.annotation.Nullable List<CollectionMetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

    public Collection addMetadataItem(CollectionMetadataItem metadataItem) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadataItem);
        return this;
    }

    /**
     * Metadata objects in the collection.
     *
     * @return metadata
     */
    @javax.annotation.Nullable
    public List<CollectionMetadataItem> getMetadata() {
        return metadata;
    }

    public void setMetadata(@javax.annotation.Nullable List<CollectionMetadataItem> metadata) {
        this.metadata = metadata;
    }

    public Collection createdAt(@javax.annotation.Nullable String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Creation timestamp in milliseconds.
     *
     * @return createdAt
     */
    @javax.annotation.Nullable
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(@javax.annotation.Nullable String createdAt) {
        this.createdAt = createdAt;
    }

    public Collection updatedAt(@javax.annotation.Nullable String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Last updated timestamp in milliseconds.
     *
     * @return updatedAt
     */
    @javax.annotation.Nullable
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(@javax.annotation.Nullable String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Collection authorName(@javax.annotation.Nullable String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * Name of the author who created the collection.
     *
     * @return authorName
     */
    @javax.annotation.Nullable
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(@javax.annotation.Nullable String authorName) {
        this.authorName = authorName;
    }

    public Collection authorId(@javax.annotation.Nullable String authorId) {
        this.authorId = authorId;
        return this;
    }

    /**
     * Unique identifier of the author.
     *
     * @return authorId
     */
    @javax.annotation.Nullable
    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(@javax.annotation.Nullable String authorId) {
        this.authorId = authorId;
    }

    public Collection org(@javax.annotation.Nullable CollectionEntityIdentifier org) {
        this.org = org;
        return this;
    }

    /**
     * Get org
     *
     * @return org
     */
    @javax.annotation.Nullable
    public CollectionEntityIdentifier getOrg() {
        return org;
    }

    public void setOrg(@javax.annotation.Nullable CollectionEntityIdentifier org) {
        this.org = org;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Collection collection = (Collection) o;
        return Objects.equals(this.id, collection.id)
                && Objects.equals(this.name, collection.name)
                && Objects.equals(this.description, collection.description)
                && Objects.equals(this.metadata, collection.metadata)
                && Objects.equals(this.createdAt, collection.createdAt)
                && Objects.equals(this.updatedAt, collection.updatedAt)
                && Objects.equals(this.authorName, collection.authorName)
                && Objects.equals(this.authorId, collection.authorId)
                && Objects.equals(this.org, collection.org);
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
        return Objects.hash(
                id, name, description, metadata, createdAt, updatedAt, authorName, authorId, org);
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
        sb.append("class Collection {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
        sb.append("    org: ").append(toIndentedString(org)).append("\n");
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
        openapiFields.add("description");
        openapiFields.add("metadata");
        openapiFields.add("created_at");
        openapiFields.add("updated_at");
        openapiFields.add("author_name");
        openapiFields.add("author_id");
        openapiFields.add("org");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("name");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Collection
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!Collection.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Collection is not found in the empty"
                                        + " JSON string",
                                Collection.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!Collection.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `Collection` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : Collection.openapiRequiredFields) {
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
                    CollectionMetadataItem.validateJsonElement(jsonArraymetadata.get(i));
                }
                ;
            }
        }
        if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull())
                && !jsonObj.get("created_at").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `created_at` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("created_at").toString()));
        }
        if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull())
                && !jsonObj.get("updated_at").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `updated_at` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("updated_at").toString()));
        }
        if ((jsonObj.get("author_name") != null && !jsonObj.get("author_name").isJsonNull())
                && !jsonObj.get("author_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `author_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("author_name").toString()));
        }
        if ((jsonObj.get("author_id") != null && !jsonObj.get("author_id").isJsonNull())
                && !jsonObj.get("author_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `author_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("author_id").toString()));
        }
        // validate the optional field `org`
        if (jsonObj.get("org") != null && !jsonObj.get("org").isJsonNull()) {
            CollectionEntityIdentifier.validateJsonElement(jsonObj.get("org"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Collection.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Collection' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Collection> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Collection.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Collection>() {
                        @Override
                        public void write(JsonWriter out, Collection value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Collection read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Collection given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Collection
     * @throws IOException if the JSON string is invalid with respect to Collection
     */
    public static Collection fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Collection.class);
    }

    /**
     * Convert an instance of Collection to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
