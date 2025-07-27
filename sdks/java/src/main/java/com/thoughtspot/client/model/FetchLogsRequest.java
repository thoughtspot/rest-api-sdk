/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** FetchLogsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class FetchLogsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Name of the log type */
    @JsonAdapter(LogTypeEnum.Adapter.class)
    public enum LogTypeEnum {
        SECURITY_AUDIT("SECURITY_AUDIT");

        private String value;

        LogTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static LogTypeEnum fromValue(String value) {
            for (LogTypeEnum b : LogTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<LogTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final LogTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public LogTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return LogTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            LogTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_LOG_TYPE = "log_type";

    @SerializedName(SERIALIZED_NAME_LOG_TYPE)
    @javax.annotation.Nonnull
    private LogTypeEnum logType;

    public static final String SERIALIZED_NAME_START_EPOCH_TIME_IN_MILLIS =
            "start_epoch_time_in_millis";

    @SerializedName(SERIALIZED_NAME_START_EPOCH_TIME_IN_MILLIS)
    @javax.annotation.Nullable
    private Float startEpochTimeInMillis;

    public static final String SERIALIZED_NAME_END_EPOCH_TIME_IN_MILLIS =
            "end_epoch_time_in_millis";

    @SerializedName(SERIALIZED_NAME_END_EPOCH_TIME_IN_MILLIS)
    @javax.annotation.Nullable
    private Float endEpochTimeInMillis;

    public static final String SERIALIZED_NAME_GET_ALL_LOGS = "get_all_logs";

    @SerializedName(SERIALIZED_NAME_GET_ALL_LOGS)
    @javax.annotation.Nullable
    private Boolean getAllLogs = true;

    public FetchLogsRequest() {}

    public FetchLogsRequest logType(@javax.annotation.Nonnull LogTypeEnum logType) {
        this.logType = logType;
        return this;
    }

    /**
     * Name of the log type
     *
     * @return logType
     */
    @javax.annotation.Nonnull
    public LogTypeEnum getLogType() {
        return logType;
    }

    public void setLogType(@javax.annotation.Nonnull LogTypeEnum logType) {
        this.logType = logType;
    }

    public FetchLogsRequest startEpochTimeInMillis(
            @javax.annotation.Nullable Float startEpochTimeInMillis) {
        this.startEpochTimeInMillis = startEpochTimeInMillis;
        return this;
    }

    /**
     * Start time in EPOCH format
     *
     * @return startEpochTimeInMillis
     */
    @javax.annotation.Nullable
    public Float getStartEpochTimeInMillis() {
        return startEpochTimeInMillis;
    }

    public void setStartEpochTimeInMillis(@javax.annotation.Nullable Float startEpochTimeInMillis) {
        this.startEpochTimeInMillis = startEpochTimeInMillis;
    }

    public FetchLogsRequest endEpochTimeInMillis(
            @javax.annotation.Nullable Float endEpochTimeInMillis) {
        this.endEpochTimeInMillis = endEpochTimeInMillis;
        return this;
    }

    /**
     * End time in EPOCH format
     *
     * @return endEpochTimeInMillis
     */
    @javax.annotation.Nullable
    public Float getEndEpochTimeInMillis() {
        return endEpochTimeInMillis;
    }

    public void setEndEpochTimeInMillis(@javax.annotation.Nullable Float endEpochTimeInMillis) {
        this.endEpochTimeInMillis = endEpochTimeInMillis;
    }

    public FetchLogsRequest getAllLogs(@javax.annotation.Nullable Boolean getAllLogs) {
        this.getAllLogs = getAllLogs;
        return this;
    }

    /**
     * Fetch all the logs. This is available from 9.10.5.cl
     *
     * @return getAllLogs
     */
    @javax.annotation.Nullable
    public Boolean getGetAllLogs() {
        return getAllLogs;
    }

    public void setGetAllLogs(@javax.annotation.Nullable Boolean getAllLogs) {
        this.getAllLogs = getAllLogs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FetchLogsRequest fetchLogsRequest = (FetchLogsRequest) o;
        return Objects.equals(this.logType, fetchLogsRequest.logType)
                && Objects.equals(
                        this.startEpochTimeInMillis, fetchLogsRequest.startEpochTimeInMillis)
                && Objects.equals(this.endEpochTimeInMillis, fetchLogsRequest.endEpochTimeInMillis)
                && Objects.equals(this.getAllLogs, fetchLogsRequest.getAllLogs);
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
        return Objects.hash(logType, startEpochTimeInMillis, endEpochTimeInMillis, getAllLogs);
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
        sb.append("class FetchLogsRequest {\n");
        sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
        sb.append("    startEpochTimeInMillis: ")
                .append(toIndentedString(startEpochTimeInMillis))
                .append("\n");
        sb.append("    endEpochTimeInMillis: ")
                .append(toIndentedString(endEpochTimeInMillis))
                .append("\n");
        sb.append("    getAllLogs: ").append(toIndentedString(getAllLogs)).append("\n");
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
        openapiFields.add("log_type");
        openapiFields.add("start_epoch_time_in_millis");
        openapiFields.add("end_epoch_time_in_millis");
        openapiFields.add("get_all_logs");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("log_type");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to FetchLogsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!FetchLogsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FetchLogsRequest is not found in the"
                                        + " empty JSON string",
                                FetchLogsRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!FetchLogsRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FetchLogsRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : FetchLogsRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("log_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `log_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("log_type").toString()));
        }
        // validate the required field `log_type`
        LogTypeEnum.validateJsonElement(jsonObj.get("log_type"));
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FetchLogsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FetchLogsRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FetchLogsRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FetchLogsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FetchLogsRequest>() {
                        @Override
                        public void write(JsonWriter out, FetchLogsRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FetchLogsRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FetchLogsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FetchLogsRequest
     * @throws IOException if the JSON string is invalid with respect to FetchLogsRequest
     */
    public static FetchLogsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FetchLogsRequest.class);
    }

    /**
     * Convert an instance of FetchLogsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
