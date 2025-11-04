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

/** WebhookPagination */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class WebhookPagination implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";

    @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
    @javax.annotation.Nonnull
    private Integer recordOffset;

    public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";

    @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
    @javax.annotation.Nonnull
    private Integer recordSize;

    public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";

    @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
    @javax.annotation.Nonnull
    private Integer totalCount;

    public static final String SERIALIZED_NAME_HAS_MORE = "has_more";

    @SerializedName(SERIALIZED_NAME_HAS_MORE)
    @javax.annotation.Nonnull
    private Boolean hasMore;

    public WebhookPagination() {}

    public WebhookPagination recordOffset(@javax.annotation.Nonnull Integer recordOffset) {
        this.recordOffset = recordOffset;
        return this;
    }

    /**
     * The starting record number from where the records are included.
     *
     * @return recordOffset
     */
    @javax.annotation.Nonnull
    public Integer getRecordOffset() {
        return recordOffset;
    }

    public void setRecordOffset(@javax.annotation.Nonnull Integer recordOffset) {
        this.recordOffset = recordOffset;
    }

    public WebhookPagination recordSize(@javax.annotation.Nonnull Integer recordSize) {
        this.recordSize = recordSize;
        return this;
    }

    /**
     * The number of records included in the response.
     *
     * @return recordSize
     */
    @javax.annotation.Nonnull
    public Integer getRecordSize() {
        return recordSize;
    }

    public void setRecordSize(@javax.annotation.Nonnull Integer recordSize) {
        this.recordSize = recordSize;
    }

    public WebhookPagination totalCount(@javax.annotation.Nonnull Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Total number of webhook configurations available.
     *
     * @return totalCount
     */
    @javax.annotation.Nonnull
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(@javax.annotation.Nonnull Integer totalCount) {
        this.totalCount = totalCount;
    }

    public WebhookPagination hasMore(@javax.annotation.Nonnull Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * Indicates whether more records are available beyond the current response.
     *
     * @return hasMore
     */
    @javax.annotation.Nonnull
    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(@javax.annotation.Nonnull Boolean hasMore) {
        this.hasMore = hasMore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookPagination webhookPagination = (WebhookPagination) o;
        return Objects.equals(this.recordOffset, webhookPagination.recordOffset)
                && Objects.equals(this.recordSize, webhookPagination.recordSize)
                && Objects.equals(this.totalCount, webhookPagination.totalCount)
                && Objects.equals(this.hasMore, webhookPagination.hasMore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordOffset, recordSize, totalCount, hasMore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPagination {\n");
        sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
        sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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
        openapiFields.add("record_offset");
        openapiFields.add("record_size");
        openapiFields.add("total_count");
        openapiFields.add("has_more");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("record_offset");
        openapiRequiredFields.add("record_size");
        openapiRequiredFields.add("total_count");
        openapiRequiredFields.add("has_more");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to WebhookPagination
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!WebhookPagination.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in WebhookPagination is not found in the"
                                        + " empty JSON string",
                                WebhookPagination.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!WebhookPagination.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `WebhookPagination` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : WebhookPagination.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WebhookPagination.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WebhookPagination' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WebhookPagination> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(WebhookPagination.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<WebhookPagination>() {
                        @Override
                        public void write(JsonWriter out, WebhookPagination value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public WebhookPagination read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of WebhookPagination given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of WebhookPagination
     * @throws IOException if the JSON string is invalid with respect to WebhookPagination
     */
    public static WebhookPagination fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WebhookPagination.class);
    }

    /**
     * Convert an instance of WebhookPagination to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
