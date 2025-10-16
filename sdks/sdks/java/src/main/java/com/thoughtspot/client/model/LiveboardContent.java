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

/** LiveboardContent */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class LiveboardContent implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_AVAILABLE_DATA_ROW_COUNT =
            "available_data_row_count";

    @SerializedName(SERIALIZED_NAME_AVAILABLE_DATA_ROW_COUNT)
    @javax.annotation.Nonnull
    private Integer availableDataRowCount;

    public static final String SERIALIZED_NAME_COLUMN_NAMES = "column_names";

    @SerializedName(SERIALIZED_NAME_COLUMN_NAMES)
    @javax.annotation.Nonnull
    private List<String> columnNames;

    public static final String SERIALIZED_NAME_DATA_ROWS = "data_rows";

    @SerializedName(SERIALIZED_NAME_DATA_ROWS)
    @javax.annotation.Nonnull
    private List<Object> dataRows;

    public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";

    @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
    @javax.annotation.Nonnull
    private Integer recordOffset;

    public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";

    @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
    @javax.annotation.Nonnull
    private Integer recordSize;

    public static final String SERIALIZED_NAME_RETURNED_DATA_ROW_COUNT = "returned_data_row_count";

    @SerializedName(SERIALIZED_NAME_RETURNED_DATA_ROW_COUNT)
    @javax.annotation.Nonnull
    private Integer returnedDataRowCount;

    public static final String SERIALIZED_NAME_SAMPLING_RATIO = "sampling_ratio";

    @SerializedName(SERIALIZED_NAME_SAMPLING_RATIO)
    @javax.annotation.Nonnull
    private Float samplingRatio;

    public static final String SERIALIZED_NAME_VISUALIZATION_ID = "visualization_id";

    @SerializedName(SERIALIZED_NAME_VISUALIZATION_ID)
    @javax.annotation.Nullable
    private String visualizationId;

    public static final String SERIALIZED_NAME_VISUALIZATION_NAME = "visualization_name";

    @SerializedName(SERIALIZED_NAME_VISUALIZATION_NAME)
    @javax.annotation.Nullable
    private String visualizationName;

    public LiveboardContent() {}

    public LiveboardContent availableDataRowCount(
            @javax.annotation.Nonnull Integer availableDataRowCount) {
        this.availableDataRowCount = availableDataRowCount;
        return this;
    }

    /**
     * Total available data row count.
     *
     * @return availableDataRowCount
     */
    @javax.annotation.Nonnull
    public Integer getAvailableDataRowCount() {
        return availableDataRowCount;
    }

    public void setAvailableDataRowCount(@javax.annotation.Nonnull Integer availableDataRowCount) {
        this.availableDataRowCount = availableDataRowCount;
    }

    public LiveboardContent columnNames(@javax.annotation.Nonnull List<String> columnNames) {
        this.columnNames = columnNames;
        return this;
    }

    public LiveboardContent addColumnNamesItem(String columnNamesItem) {
        if (this.columnNames == null) {
            this.columnNames = new ArrayList<>();
        }
        this.columnNames.add(columnNamesItem);
        return this;
    }

    /**
     * Name of the columns.
     *
     * @return columnNames
     */
    @javax.annotation.Nonnull
    public List<String> getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(@javax.annotation.Nonnull List<String> columnNames) {
        this.columnNames = columnNames;
    }

    public LiveboardContent dataRows(@javax.annotation.Nonnull List<Object> dataRows) {
        this.dataRows = dataRows;
        return this;
    }

    public LiveboardContent addDataRowsItem(Object dataRowsItem) {
        if (this.dataRows == null) {
            this.dataRows = new ArrayList<>();
        }
        this.dataRows.add(dataRowsItem);
        return this;
    }

    /**
     * Rows of data set.
     *
     * @return dataRows
     */
    @javax.annotation.Nonnull
    public List<Object> getDataRows() {
        return dataRows;
    }

    public void setDataRows(@javax.annotation.Nonnull List<Object> dataRows) {
        this.dataRows = dataRows;
    }

    public LiveboardContent recordOffset(@javax.annotation.Nonnull Integer recordOffset) {
        this.recordOffset = recordOffset;
        return this;
    }

    /**
     * The starting record number from where the records should be included.
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

    public LiveboardContent recordSize(@javax.annotation.Nonnull Integer recordSize) {
        this.recordSize = recordSize;
        return this;
    }

    /**
     * The number of records that should be included.
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

    public LiveboardContent returnedDataRowCount(
            @javax.annotation.Nonnull Integer returnedDataRowCount) {
        this.returnedDataRowCount = returnedDataRowCount;
        return this;
    }

    /**
     * Total returned data row count.
     *
     * @return returnedDataRowCount
     */
    @javax.annotation.Nonnull
    public Integer getReturnedDataRowCount() {
        return returnedDataRowCount;
    }

    public void setReturnedDataRowCount(@javax.annotation.Nonnull Integer returnedDataRowCount) {
        this.returnedDataRowCount = returnedDataRowCount;
    }

    public LiveboardContent samplingRatio(@javax.annotation.Nonnull Float samplingRatio) {
        this.samplingRatio = samplingRatio;
        return this;
    }

    /**
     * Sampling ratio (0 to 1). If the query was sampled, it is the ratio of keys returned in the
     * data set to the total number of keys expected in the query. If the value is 1.0, this means
     * that the complete result is returned.
     *
     * @return samplingRatio
     */
    @javax.annotation.Nonnull
    public Float getSamplingRatio() {
        return samplingRatio;
    }

    public void setSamplingRatio(@javax.annotation.Nonnull Float samplingRatio) {
        this.samplingRatio = samplingRatio;
    }

    public LiveboardContent visualizationId(@javax.annotation.Nullable String visualizationId) {
        this.visualizationId = visualizationId;
        return this;
    }

    /**
     * Unique ID of the visualization.
     *
     * @return visualizationId
     */
    @javax.annotation.Nullable
    public String getVisualizationId() {
        return visualizationId;
    }

    public void setVisualizationId(@javax.annotation.Nullable String visualizationId) {
        this.visualizationId = visualizationId;
    }

    public LiveboardContent visualizationName(@javax.annotation.Nullable String visualizationName) {
        this.visualizationName = visualizationName;
        return this;
    }

    /**
     * Name of the visualization.
     *
     * @return visualizationName
     */
    @javax.annotation.Nullable
    public String getVisualizationName() {
        return visualizationName;
    }

    public void setVisualizationName(@javax.annotation.Nullable String visualizationName) {
        this.visualizationName = visualizationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LiveboardContent liveboardContent = (LiveboardContent) o;
        return Objects.equals(this.availableDataRowCount, liveboardContent.availableDataRowCount)
                && Objects.equals(this.columnNames, liveboardContent.columnNames)
                && Objects.equals(this.dataRows, liveboardContent.dataRows)
                && Objects.equals(this.recordOffset, liveboardContent.recordOffset)
                && Objects.equals(this.recordSize, liveboardContent.recordSize)
                && Objects.equals(this.returnedDataRowCount, liveboardContent.returnedDataRowCount)
                && Objects.equals(this.samplingRatio, liveboardContent.samplingRatio)
                && Objects.equals(this.visualizationId, liveboardContent.visualizationId)
                && Objects.equals(this.visualizationName, liveboardContent.visualizationName);
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
                availableDataRowCount,
                columnNames,
                dataRows,
                recordOffset,
                recordSize,
                returnedDataRowCount,
                samplingRatio,
                visualizationId,
                visualizationName);
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
        sb.append("class LiveboardContent {\n");
        sb.append("    availableDataRowCount: ")
                .append(toIndentedString(availableDataRowCount))
                .append("\n");
        sb.append("    columnNames: ").append(toIndentedString(columnNames)).append("\n");
        sb.append("    dataRows: ").append(toIndentedString(dataRows)).append("\n");
        sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
        sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
        sb.append("    returnedDataRowCount: ")
                .append(toIndentedString(returnedDataRowCount))
                .append("\n");
        sb.append("    samplingRatio: ").append(toIndentedString(samplingRatio)).append("\n");
        sb.append("    visualizationId: ").append(toIndentedString(visualizationId)).append("\n");
        sb.append("    visualizationName: ")
                .append(toIndentedString(visualizationName))
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
        openapiFields.add("available_data_row_count");
        openapiFields.add("column_names");
        openapiFields.add("data_rows");
        openapiFields.add("record_offset");
        openapiFields.add("record_size");
        openapiFields.add("returned_data_row_count");
        openapiFields.add("sampling_ratio");
        openapiFields.add("visualization_id");
        openapiFields.add("visualization_name");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("available_data_row_count");
        openapiRequiredFields.add("column_names");
        openapiRequiredFields.add("data_rows");
        openapiRequiredFields.add("record_offset");
        openapiRequiredFields.add("record_size");
        openapiRequiredFields.add("returned_data_row_count");
        openapiRequiredFields.add("sampling_ratio");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to LiveboardContent
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!LiveboardContent.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in LiveboardContent is not found in the"
                                        + " empty JSON string",
                                LiveboardContent.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!LiveboardContent.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `LiveboardContent` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : LiveboardContent.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the required json array is present
        if (jsonObj.get("column_names") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("column_names").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `column_names` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("column_names").toString()));
        }
        // ensure the required json array is present
        if (jsonObj.get("data_rows") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("data_rows").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `data_rows` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("data_rows").toString()));
        }
        if ((jsonObj.get("visualization_id") != null
                        && !jsonObj.get("visualization_id").isJsonNull())
                && !jsonObj.get("visualization_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `visualization_id` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("visualization_id").toString()));
        }
        if ((jsonObj.get("visualization_name") != null
                        && !jsonObj.get("visualization_name").isJsonNull())
                && !jsonObj.get("visualization_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `visualization_name` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("visualization_name").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!LiveboardContent.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'LiveboardContent' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LiveboardContent> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(LiveboardContent.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<LiveboardContent>() {
                        @Override
                        public void write(JsonWriter out, LiveboardContent value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public LiveboardContent read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of LiveboardContent given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of LiveboardContent
     * @throws IOException if the JSON string is invalid with respect to LiveboardContent
     */
    public static LiveboardContent fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, LiveboardContent.class);
    }

    /**
     * Convert an instance of LiveboardContent to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
