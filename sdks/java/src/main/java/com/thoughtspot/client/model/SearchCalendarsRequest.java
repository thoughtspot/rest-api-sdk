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

/** SearchCalendarsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SearchCalendarsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONNECTION_IDENTIFIER = "connection_identifier";

    @SerializedName(SERIALIZED_NAME_CONNECTION_IDENTIFIER)
    @javax.annotation.Nullable
    private String connectionIdentifier;

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

    public static final String SERIALIZED_NAME_SORT_OPTIONS = "sort_options";

    @SerializedName(SERIALIZED_NAME_SORT_OPTIONS)
    @javax.annotation.Nullable
    private SortOption sortOptions;

    public SearchCalendarsRequest() {}

    public SearchCalendarsRequest connectionIdentifier(
            @javax.annotation.Nullable String connectionIdentifier) {
        this.connectionIdentifier = connectionIdentifier;
        return this;
    }

    /**
     * Unique ID or name of the connection.
     *
     * @return connectionIdentifier
     */
    @javax.annotation.Nullable
    public String getConnectionIdentifier() {
        return connectionIdentifier;
    }

    public void setConnectionIdentifier(@javax.annotation.Nullable String connectionIdentifier) {
        this.connectionIdentifier = connectionIdentifier;
    }

    public SearchCalendarsRequest namePattern(@javax.annotation.Nullable String namePattern) {
        this.namePattern = namePattern;
        return this;
    }

    /**
     * Pattern to match for calendar names (use &#39;%&#39; for wildcard match).
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

    public SearchCalendarsRequest recordOffset(@javax.annotation.Nullable Integer recordOffset) {
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

    public SearchCalendarsRequest recordSize(@javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
        return this;
    }

    /**
     * The number of records that should be included.
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

    public SearchCalendarsRequest sortOptions(@javax.annotation.Nullable SortOption sortOptions) {
        this.sortOptions = sortOptions;
        return this;
    }

    /**
     * Sort options.
     *
     * @return sortOptions
     */
    @javax.annotation.Nullable
    public SortOption getSortOptions() {
        return sortOptions;
    }

    public void setSortOptions(@javax.annotation.Nullable SortOption sortOptions) {
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
        SearchCalendarsRequest searchCalendarsRequest = (SearchCalendarsRequest) o;
        return Objects.equals(
                        this.connectionIdentifier, searchCalendarsRequest.connectionIdentifier)
                && Objects.equals(this.namePattern, searchCalendarsRequest.namePattern)
                && Objects.equals(this.recordOffset, searchCalendarsRequest.recordOffset)
                && Objects.equals(this.recordSize, searchCalendarsRequest.recordSize)
                && Objects.equals(this.sortOptions, searchCalendarsRequest.sortOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                connectionIdentifier, namePattern, recordOffset, recordSize, sortOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchCalendarsRequest {\n");
        sb.append("    connectionIdentifier: ")
                .append(toIndentedString(connectionIdentifier))
                .append("\n");
        sb.append("    namePattern: ").append(toIndentedString(namePattern)).append("\n");
        sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
        sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
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
        openapiFields.add("connection_identifier");
        openapiFields.add("name_pattern");
        openapiFields.add("record_offset");
        openapiFields.add("record_size");
        openapiFields.add("sort_options");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SearchCalendarsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SearchCalendarsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SearchCalendarsRequest is not found"
                                        + " in the empty JSON string",
                                SearchCalendarsRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SearchCalendarsRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SearchCalendarsRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("connection_identifier") != null
                        && !jsonObj.get("connection_identifier").isJsonNull())
                && !jsonObj.get("connection_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `connection_identifier` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("connection_identifier").toString()));
        }
        if ((jsonObj.get("name_pattern") != null && !jsonObj.get("name_pattern").isJsonNull())
                && !jsonObj.get("name_pattern").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name_pattern` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("name_pattern").toString()));
        }
        // validate the optional field `sort_options`
        if (jsonObj.get("sort_options") != null && !jsonObj.get("sort_options").isJsonNull()) {
            SortOption.validateJsonElement(jsonObj.get("sort_options"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SearchCalendarsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SearchCalendarsRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SearchCalendarsRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SearchCalendarsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SearchCalendarsRequest>() {
                        @Override
                        public void write(JsonWriter out, SearchCalendarsRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SearchCalendarsRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SearchCalendarsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SearchCalendarsRequest
     * @throws IOException if the JSON string is invalid with respect to SearchCalendarsRequest
     */
    public static SearchCalendarsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SearchCalendarsRequest.class);
    }

    /**
     * Convert an instance of SearchCalendarsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
