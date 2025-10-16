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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** ScheduleHistoryRunsOptionsInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ScheduleHistoryRunsOptionsInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_INCLUDE_HISTORY_RUNS = "include_history_runs";

    @SerializedName(SERIALIZED_NAME_INCLUDE_HISTORY_RUNS)
    @javax.annotation.Nullable
    private Boolean includeHistoryRuns = false;

    public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";

    @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
    @javax.annotation.Nullable
    private Integer recordSize = 10;

    public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";

    @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
    @javax.annotation.Nullable
    private Integer recordOffset = 0;

    public ScheduleHistoryRunsOptionsInput() {}

    public ScheduleHistoryRunsOptionsInput includeHistoryRuns(
            @javax.annotation.Nullable Boolean includeHistoryRuns) {
        this.includeHistoryRuns = includeHistoryRuns;
        return this;
    }

    /**
     * Indicates whether to fetch history runs for the scheduled notification.
     *
     * @return includeHistoryRuns
     */
    @javax.annotation.Nullable
    public Boolean getIncludeHistoryRuns() {
        return includeHistoryRuns;
    }

    public void setIncludeHistoryRuns(@javax.annotation.Nullable Boolean includeHistoryRuns) {
        this.includeHistoryRuns = includeHistoryRuns;
    }

    public ScheduleHistoryRunsOptionsInput recordSize(
            @javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
        return this;
    }

    /**
     * Indicates the max number of records that can be fetched as past runs of any scheduled job.
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

    public ScheduleHistoryRunsOptionsInput recordOffset(
            @javax.annotation.Nullable Integer recordOffset) {
        this.recordOffset = recordOffset;
        return this;
    }

    /**
     * Indicates the starting record number from where history runs records should be fetched.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScheduleHistoryRunsOptionsInput scheduleHistoryRunsOptionsInput =
                (ScheduleHistoryRunsOptionsInput) o;
        return Objects.equals(
                        this.includeHistoryRuns, scheduleHistoryRunsOptionsInput.includeHistoryRuns)
                && Objects.equals(this.recordSize, scheduleHistoryRunsOptionsInput.recordSize)
                && Objects.equals(this.recordOffset, scheduleHistoryRunsOptionsInput.recordOffset);
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
        return Objects.hash(includeHistoryRuns, recordSize, recordOffset);
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
        sb.append("class ScheduleHistoryRunsOptionsInput {\n");
        sb.append("    includeHistoryRuns: ")
                .append(toIndentedString(includeHistoryRuns))
                .append("\n");
        sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
        sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
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
        openapiFields.add("include_history_runs");
        openapiFields.add("record_size");
        openapiFields.add("record_offset");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ScheduleHistoryRunsOptionsInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ScheduleHistoryRunsOptionsInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ScheduleHistoryRunsOptionsInput is"
                                        + " not found in the empty JSON string",
                                ScheduleHistoryRunsOptionsInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ScheduleHistoryRunsOptionsInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ScheduleHistoryRunsOptionsInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ScheduleHistoryRunsOptionsInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ScheduleHistoryRunsOptionsInput' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ScheduleHistoryRunsOptionsInput> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ScheduleHistoryRunsOptionsInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ScheduleHistoryRunsOptionsInput>() {
                        @Override
                        public void write(JsonWriter out, ScheduleHistoryRunsOptionsInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ScheduleHistoryRunsOptionsInput read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ScheduleHistoryRunsOptionsInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ScheduleHistoryRunsOptionsInput
     * @throws IOException if the JSON string is invalid with respect to
     *     ScheduleHistoryRunsOptionsInput
     */
    public static ScheduleHistoryRunsOptionsInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ScheduleHistoryRunsOptionsInput.class);
    }

    /**
     * Convert an instance of ScheduleHistoryRunsOptionsInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
