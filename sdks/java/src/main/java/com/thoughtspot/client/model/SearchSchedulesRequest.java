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

/** SearchSchedulesRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SearchSchedulesRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_METADATA = "metadata";

    @SerializedName(SERIALIZED_NAME_METADATA)
    @javax.annotation.Nullable
    private List<MetadataInput> metadata;

    public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";

    @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
    @javax.annotation.Nullable
    private Integer recordOffset;

    public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";

    @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
    @javax.annotation.Nullable
    private Integer recordSize;

    public static final String SERIALIZED_NAME_SORT_OPTIONS = "sort_options";

    @SerializedName(SERIALIZED_NAME_SORT_OPTIONS)
    @javax.annotation.Nullable
    private SortingOptions sortOptions;

    public static final String SERIALIZED_NAME_HISTORY_RUNS_OPTIONS = "history_runs_options";

    @SerializedName(SERIALIZED_NAME_HISTORY_RUNS_OPTIONS)
    @javax.annotation.Nullable
    private ScheduleHistoryRunsOptionsInput historyRunsOptions;

    public static final String SERIALIZED_NAME_SCHEDULE_IDENTIFIERS = "schedule_identifiers";

    @SerializedName(SERIALIZED_NAME_SCHEDULE_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> scheduleIdentifiers;

    public SearchSchedulesRequest() {}

    public SearchSchedulesRequest metadata(
            @javax.annotation.Nullable List<MetadataInput> metadata) {
        this.metadata = metadata;
        return this;
    }

    public SearchSchedulesRequest addMetadataItem(MetadataInput metadataItem) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadataItem);
        return this;
    }

    /**
     * Metadata objects associated with the scheduled jobs.
     *
     * @return metadata
     */
    @javax.annotation.Nullable
    public List<MetadataInput> getMetadata() {
        return metadata;
    }

    public void setMetadata(@javax.annotation.Nullable List<MetadataInput> metadata) {
        this.metadata = metadata;
    }

    public SearchSchedulesRequest recordOffset(@javax.annotation.Nullable Integer recordOffset) {
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

    public SearchSchedulesRequest recordSize(@javax.annotation.Nullable Integer recordSize) {
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

    public SearchSchedulesRequest sortOptions(
            @javax.annotation.Nullable SortingOptions sortOptions) {
        this.sortOptions = sortOptions;
        return this;
    }

    /**
     * Sort options.
     *
     * @return sortOptions
     */
    @javax.annotation.Nullable
    public SortingOptions getSortOptions() {
        return sortOptions;
    }

    public void setSortOptions(@javax.annotation.Nullable SortingOptions sortOptions) {
        this.sortOptions = sortOptions;
    }

    public SearchSchedulesRequest historyRunsOptions(
            @javax.annotation.Nullable ScheduleHistoryRunsOptionsInput historyRunsOptions) {
        this.historyRunsOptions = historyRunsOptions;
        return this;
    }

    /**
     * Options while fetching history runs for the schedule.
     *
     * @return historyRunsOptions
     */
    @javax.annotation.Nullable
    public ScheduleHistoryRunsOptionsInput getHistoryRunsOptions() {
        return historyRunsOptions;
    }

    public void setHistoryRunsOptions(
            @javax.annotation.Nullable ScheduleHistoryRunsOptionsInput historyRunsOptions) {
        this.historyRunsOptions = historyRunsOptions;
    }

    public SearchSchedulesRequest scheduleIdentifiers(
            @javax.annotation.Nullable List<String> scheduleIdentifiers) {
        this.scheduleIdentifiers = scheduleIdentifiers;
        return this;
    }

    public SearchSchedulesRequest addScheduleIdentifiersItem(String scheduleIdentifiersItem) {
        if (this.scheduleIdentifiers == null) {
            this.scheduleIdentifiers = new ArrayList<>();
        }
        this.scheduleIdentifiers.add(scheduleIdentifiersItem);
        return this;
    }

    /**
     * unique ID or name of the Schedule
     *
     * @return scheduleIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getScheduleIdentifiers() {
        return scheduleIdentifiers;
    }

    public void setScheduleIdentifiers(
            @javax.annotation.Nullable List<String> scheduleIdentifiers) {
        this.scheduleIdentifiers = scheduleIdentifiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchSchedulesRequest searchSchedulesRequest = (SearchSchedulesRequest) o;
        return Objects.equals(this.metadata, searchSchedulesRequest.metadata)
                && Objects.equals(this.recordOffset, searchSchedulesRequest.recordOffset)
                && Objects.equals(this.recordSize, searchSchedulesRequest.recordSize)
                && Objects.equals(this.sortOptions, searchSchedulesRequest.sortOptions)
                && Objects.equals(
                        this.historyRunsOptions, searchSchedulesRequest.historyRunsOptions)
                && Objects.equals(
                        this.scheduleIdentifiers, searchSchedulesRequest.scheduleIdentifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metadata,
                recordOffset,
                recordSize,
                sortOptions,
                historyRunsOptions,
                scheduleIdentifiers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchSchedulesRequest {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
        sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
        sb.append("    sortOptions: ").append(toIndentedString(sortOptions)).append("\n");
        sb.append("    historyRunsOptions: ")
                .append(toIndentedString(historyRunsOptions))
                .append("\n");
        sb.append("    scheduleIdentifiers: ")
                .append(toIndentedString(scheduleIdentifiers))
                .append("\n");
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
        openapiFields.add("record_offset");
        openapiFields.add("record_size");
        openapiFields.add("sort_options");
        openapiFields.add("history_runs_options");
        openapiFields.add("schedule_identifiers");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SearchSchedulesRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SearchSchedulesRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SearchSchedulesRequest is not found"
                                        + " in the empty JSON string",
                                SearchSchedulesRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SearchSchedulesRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SearchSchedulesRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
                    MetadataInput.validateJsonElement(jsonArraymetadata.get(i));
                }
                ;
            }
        }
        // validate the optional field `sort_options`
        if (jsonObj.get("sort_options") != null && !jsonObj.get("sort_options").isJsonNull()) {
            SortingOptions.validateJsonElement(jsonObj.get("sort_options"));
        }
        // validate the optional field `history_runs_options`
        if (jsonObj.get("history_runs_options") != null
                && !jsonObj.get("history_runs_options").isJsonNull()) {
            ScheduleHistoryRunsOptionsInput.validateJsonElement(
                    jsonObj.get("history_runs_options"));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("schedule_identifiers") != null
                && !jsonObj.get("schedule_identifiers").isJsonNull()
                && !jsonObj.get("schedule_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `schedule_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("schedule_identifiers").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SearchSchedulesRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SearchSchedulesRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SearchSchedulesRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SearchSchedulesRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SearchSchedulesRequest>() {
                        @Override
                        public void write(JsonWriter out, SearchSchedulesRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SearchSchedulesRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SearchSchedulesRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SearchSchedulesRequest
     * @throws IOException if the JSON string is invalid with respect to SearchSchedulesRequest
     */
    public static SearchSchedulesRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SearchSchedulesRequest.class);
    }

    /**
     * Convert an instance of SearchSchedulesRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
