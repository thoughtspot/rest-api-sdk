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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** SearchCollectionsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SearchCollectionsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME_PATTERN = "name_pattern";

    @SerializedName(SERIALIZED_NAME_NAME_PATTERN)
    @javax.annotation.Nullable
    private String namePattern;

    public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";

    @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
    @javax.annotation.Nullable
    private Integer recordOffset = 0;

    public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";

    @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
    @javax.annotation.Nullable
    private Integer recordSize = 10;

    public static final String SERIALIZED_NAME_COLLECTION_IDENTIFIERS = "collection_identifiers";

    @SerializedName(SERIALIZED_NAME_COLLECTION_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> collectionIdentifiers;

    public static final String SERIALIZED_NAME_CREATED_BY_USER_IDENTIFIERS =
            "created_by_user_identifiers";

    @SerializedName(SERIALIZED_NAME_CREATED_BY_USER_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> createdByUserIdentifiers;

    public static final String SERIALIZED_NAME_INCLUDE_METADATA = "include_metadata";

    @SerializedName(SERIALIZED_NAME_INCLUDE_METADATA)
    @javax.annotation.Nullable
    private Boolean includeMetadata = false;

    public static final String SERIALIZED_NAME_SORT_OPTIONS = "sort_options";

    @SerializedName(SERIALIZED_NAME_SORT_OPTIONS)
    @javax.annotation.Nullable
    private SortOptions sortOptions;

    public SearchCollectionsRequest() {}

    public SearchCollectionsRequest namePattern(@javax.annotation.Nullable String namePattern) {
        this.namePattern = namePattern;
        return this;
    }

    /**
     * A pattern to match case-insensitive name of the Collection object. Use &#39;%&#39; for
     * wildcard match.
     *
     * @return namePattern
     */
    @javax.annotation.Nullable
    public String getNamePattern() {
        return namePattern;
    }

    public void setNamePattern(@javax.annotation.Nullable String namePattern) {
        this.namePattern = namePattern;
    }

    public SearchCollectionsRequest recordOffset(@javax.annotation.Nullable Integer recordOffset) {
        this.recordOffset = recordOffset;
        return this;
    }

    /**
     * The starting record number from where the records should be included.
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

    public SearchCollectionsRequest recordSize(@javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
        return this;
    }

    /**
     * The number of records that should be included. -1 implies no pagination.
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

    public SearchCollectionsRequest collectionIdentifiers(
            @javax.annotation.Nullable List<String> collectionIdentifiers) {
        this.collectionIdentifiers = collectionIdentifiers;
        return this;
    }

    public SearchCollectionsRequest addCollectionIdentifiersItem(String collectionIdentifiersItem) {
        if (this.collectionIdentifiers == null) {
            this.collectionIdentifiers = new ArrayList<>();
        }
        this.collectionIdentifiers.add(collectionIdentifiersItem);
        return this;
    }

    /**
     * Unique GUIDs of collections to search. Note: Collection names cannot be used as identifiers
     * since duplicate names are allowed.
     *
     * @return collectionIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getCollectionIdentifiers() {
        return collectionIdentifiers;
    }

    public void setCollectionIdentifiers(
            @javax.annotation.Nullable List<String> collectionIdentifiers) {
        this.collectionIdentifiers = collectionIdentifiers;
    }

    public SearchCollectionsRequest createdByUserIdentifiers(
            @javax.annotation.Nullable List<String> createdByUserIdentifiers) {
        this.createdByUserIdentifiers = createdByUserIdentifiers;
        return this;
    }

    public SearchCollectionsRequest addCreatedByUserIdentifiersItem(
            String createdByUserIdentifiersItem) {
        if (this.createdByUserIdentifiers == null) {
            this.createdByUserIdentifiers = new ArrayList<>();
        }
        this.createdByUserIdentifiers.add(createdByUserIdentifiersItem);
        return this;
    }

    /**
     * Filter collections by author. Provide unique IDs or names of users who created the
     * collections.
     *
     * @return createdByUserIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getCreatedByUserIdentifiers() {
        return createdByUserIdentifiers;
    }

    public void setCreatedByUserIdentifiers(
            @javax.annotation.Nullable List<String> createdByUserIdentifiers) {
        this.createdByUserIdentifiers = createdByUserIdentifiers;
    }

    public SearchCollectionsRequest includeMetadata(
            @javax.annotation.Nullable Boolean includeMetadata) {
        this.includeMetadata = includeMetadata;
        return this;
    }

    /**
     * Include collection metadata items in the response.
     *
     * @return includeMetadata
     */
    @javax.annotation.Nullable
    public Boolean getIncludeMetadata() {
        return includeMetadata;
    }

    public void setIncludeMetadata(@javax.annotation.Nullable Boolean includeMetadata) {
        this.includeMetadata = includeMetadata;
    }

    public SearchCollectionsRequest sortOptions(
            @javax.annotation.Nullable SortOptions sortOptions) {
        this.sortOptions = sortOptions;
        return this;
    }

    /**
     * Sort options.
     *
     * @return sortOptions
     */
    @javax.annotation.Nullable
    public SortOptions getSortOptions() {
        return sortOptions;
    }

    public void setSortOptions(@javax.annotation.Nullable SortOptions sortOptions) {
        this.sortOptions = sortOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchCollectionsRequest searchCollectionsRequest = (SearchCollectionsRequest) o;
        return Objects.equals(this.namePattern, searchCollectionsRequest.namePattern)
                && Objects.equals(this.recordOffset, searchCollectionsRequest.recordOffset)
                && Objects.equals(this.recordSize, searchCollectionsRequest.recordSize)
                && Objects.equals(
                        this.collectionIdentifiers, searchCollectionsRequest.collectionIdentifiers)
                && Objects.equals(
                        this.createdByUserIdentifiers,
                        searchCollectionsRequest.createdByUserIdentifiers)
                && Objects.equals(this.includeMetadata, searchCollectionsRequest.includeMetadata)
                && Objects.equals(this.sortOptions, searchCollectionsRequest.sortOptions);
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
                namePattern,
                recordOffset,
                recordSize,
                collectionIdentifiers,
                createdByUserIdentifiers,
                includeMetadata,
                sortOptions);
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
        sb.append("class SearchCollectionsRequest {\n");
        sb.append("    namePattern: ").append(toIndentedString(namePattern)).append("\n");
        sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
        sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
        sb.append("    collectionIdentifiers: ")
                .append(toIndentedString(collectionIdentifiers))
                .append("\n");
        sb.append("    createdByUserIdentifiers: ")
                .append(toIndentedString(createdByUserIdentifiers))
                .append("\n");
        sb.append("    includeMetadata: ").append(toIndentedString(includeMetadata)).append("\n");
        sb.append("    sortOptions: ").append(toIndentedString(sortOptions)).append("\n");
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
        openapiFields.add("name_pattern");
        openapiFields.add("record_offset");
        openapiFields.add("record_size");
        openapiFields.add("collection_identifiers");
        openapiFields.add("created_by_user_identifiers");
        openapiFields.add("include_metadata");
        openapiFields.add("sort_options");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SearchCollectionsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SearchCollectionsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SearchCollectionsRequest is not found"
                                        + " in the empty JSON string",
                                SearchCollectionsRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SearchCollectionsRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SearchCollectionsRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("name_pattern") != null && !jsonObj.get("name_pattern").isJsonNull())
                && !jsonObj.get("name_pattern").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name_pattern` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("name_pattern").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("collection_identifiers") != null
                && !jsonObj.get("collection_identifiers").isJsonNull()
                && !jsonObj.get("collection_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `collection_identifiers` to be an array in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("collection_identifiers").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("created_by_user_identifiers") != null
                && !jsonObj.get("created_by_user_identifiers").isJsonNull()
                && !jsonObj.get("created_by_user_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `created_by_user_identifiers` to be an array in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("created_by_user_identifiers").toString()));
        }
        // validate the optional field `sort_options`
        if (jsonObj.get("sort_options") != null && !jsonObj.get("sort_options").isJsonNull()) {
            SortOptions.validateJsonElement(jsonObj.get("sort_options"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SearchCollectionsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SearchCollectionsRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SearchCollectionsRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SearchCollectionsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SearchCollectionsRequest>() {
                        @Override
                        public void write(JsonWriter out, SearchCollectionsRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SearchCollectionsRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SearchCollectionsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SearchCollectionsRequest
     * @throws IOException if the JSON string is invalid with respect to SearchCollectionsRequest
     */
    public static SearchCollectionsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SearchCollectionsRequest.class);
    }

    /**
     * Convert an instance of SearchCollectionsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
