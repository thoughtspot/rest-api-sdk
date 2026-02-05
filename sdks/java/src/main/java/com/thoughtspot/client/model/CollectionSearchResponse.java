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

/** Response object for search collections operation. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CollectionSearchResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_COLLECTIONS = "collections";

    @SerializedName(SERIALIZED_NAME_COLLECTIONS)
    @javax.annotation.Nonnull
    private List<Collection> collections;

    public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";

    @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
    @javax.annotation.Nullable
    private Integer recordOffset;

    public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";

    @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
    @javax.annotation.Nullable
    private Integer recordSize;

    public static final String SERIALIZED_NAME_IS_LAST_BATCH = "is_last_batch";

    @SerializedName(SERIALIZED_NAME_IS_LAST_BATCH)
    @javax.annotation.Nullable
    private Boolean isLastBatch;

    public static final String SERIALIZED_NAME_COUNT = "count";

    @SerializedName(SERIALIZED_NAME_COUNT)
    @javax.annotation.Nullable
    private Integer count;

    public CollectionSearchResponse() {}

    public CollectionSearchResponse collections(
            @javax.annotation.Nonnull List<Collection> collections) {
        this.collections = collections;
        return this;
    }

    public CollectionSearchResponse addCollectionsItem(Collection collectionsItem) {
        if (this.collections == null) {
            this.collections = new ArrayList<>();
        }
        this.collections.add(collectionsItem);
        return this;
    }

    /**
     * List of collections matching the search criteria.
     *
     * @return collections
     */
    @javax.annotation.Nonnull
    public List<Collection> getCollections() {
        return collections;
    }

    public void setCollections(@javax.annotation.Nonnull List<Collection> collections) {
        this.collections = collections;
    }

    public CollectionSearchResponse recordOffset(@javax.annotation.Nullable Integer recordOffset) {
        this.recordOffset = recordOffset;
        return this;
    }

    /**
     * The starting record number from where the records are included.
     *
     * @return recordOffset
     */
    @javax.annotation.Nullable
    public Integer getRecordOffset() {
        return recordOffset;
    }

    public void setRecordOffset(@javax.annotation.Nullable Integer recordOffset) {
        this.recordOffset = recordOffset;
    }

    public CollectionSearchResponse recordSize(@javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
        return this;
    }

    /**
     * The number of records returned.
     *
     * @return recordSize
     */
    @javax.annotation.Nullable
    public Integer getRecordSize() {
        return recordSize;
    }

    public void setRecordSize(@javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
    }

    public CollectionSearchResponse isLastBatch(@javax.annotation.Nullable Boolean isLastBatch) {
        this.isLastBatch = isLastBatch;
        return this;
    }

    /**
     * Indicates if this is the last batch of results.
     *
     * @return isLastBatch
     */
    @javax.annotation.Nullable
    public Boolean getIsLastBatch() {
        return isLastBatch;
    }

    public void setIsLastBatch(@javax.annotation.Nullable Boolean isLastBatch) {
        this.isLastBatch = isLastBatch;
    }

    public CollectionSearchResponse count(@javax.annotation.Nullable Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Total count of records returned.
     *
     * @return count
     */
    @javax.annotation.Nullable
    public Integer getCount() {
        return count;
    }

    public void setCount(@javax.annotation.Nullable Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollectionSearchResponse collectionSearchResponse = (CollectionSearchResponse) o;
        return Objects.equals(this.collections, collectionSearchResponse.collections)
                && Objects.equals(this.recordOffset, collectionSearchResponse.recordOffset)
                && Objects.equals(this.recordSize, collectionSearchResponse.recordSize)
                && Objects.equals(this.isLastBatch, collectionSearchResponse.isLastBatch)
                && Objects.equals(this.count, collectionSearchResponse.count);
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
        return Objects.hash(collections, recordOffset, recordSize, isLastBatch, count);
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
        sb.append("class CollectionSearchResponse {\n");
        sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
        sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
        sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
        sb.append("    isLastBatch: ").append(toIndentedString(isLastBatch)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
        openapiFields.add("collections");
        openapiFields.add("record_offset");
        openapiFields.add("record_size");
        openapiFields.add("is_last_batch");
        openapiFields.add("count");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("collections");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CollectionSearchResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CollectionSearchResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CollectionSearchResponse is not found"
                                        + " in the empty JSON string",
                                CollectionSearchResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CollectionSearchResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CollectionSearchResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CollectionSearchResponse.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the json data is an array
        if (!jsonObj.get("collections").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `collections` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("collections").toString()));
        }

        JsonArray jsonArraycollections = jsonObj.getAsJsonArray("collections");
        // validate the required field `collections` (array)
        for (int i = 0; i < jsonArraycollections.size(); i++) {
            Collection.validateJsonElement(jsonArraycollections.get(i));
        }
        ;
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CollectionSearchResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CollectionSearchResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CollectionSearchResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CollectionSearchResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CollectionSearchResponse>() {
                        @Override
                        public void write(JsonWriter out, CollectionSearchResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CollectionSearchResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CollectionSearchResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CollectionSearchResponse
     * @throws IOException if the JSON string is invalid with respect to CollectionSearchResponse
     */
    public static CollectionSearchResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CollectionSearchResponse.class);
    }

    /**
     * Convert an instance of CollectionSearchResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
