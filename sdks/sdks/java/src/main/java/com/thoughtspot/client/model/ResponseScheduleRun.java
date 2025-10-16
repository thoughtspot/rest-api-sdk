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

/** Schedule run response object */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ResponseScheduleRun implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nonnull
    private String id;

    public static final String SERIALIZED_NAME_START_TIME_IN_MILLIS = "start_time_in_millis";

    @SerializedName(SERIALIZED_NAME_START_TIME_IN_MILLIS)
    @javax.annotation.Nonnull
    private Integer startTimeInMillis;

    public static final String SERIALIZED_NAME_END_TIME_IN_MILLIS = "end_time_in_millis";

    @SerializedName(SERIALIZED_NAME_END_TIME_IN_MILLIS)
    @javax.annotation.Nonnull
    private Integer endTimeInMillis;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    @javax.annotation.Nonnull
    private String status;

    public static final String SERIALIZED_NAME_DETAIL = "detail";

    @SerializedName(SERIALIZED_NAME_DETAIL)
    @javax.annotation.Nullable
    private String detail;

    public ResponseScheduleRun() {}

    public ResponseScheduleRun id(@javax.annotation.Nonnull String id) {
        this.id = id;
        return this;
    }

    /**
     * GUID of the scheduled job.
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

    public ResponseScheduleRun startTimeInMillis(
            @javax.annotation.Nonnull Integer startTimeInMillis) {
        this.startTimeInMillis = startTimeInMillis;
        return this;
    }

    /**
     * Schedule run start time in milliseconds.
     *
     * @return startTimeInMillis
     */
    @javax.annotation.Nonnull
    public Integer getStartTimeInMillis() {
        return startTimeInMillis;
    }

    public void setStartTimeInMillis(@javax.annotation.Nonnull Integer startTimeInMillis) {
        this.startTimeInMillis = startTimeInMillis;
    }

    public ResponseScheduleRun endTimeInMillis(@javax.annotation.Nonnull Integer endTimeInMillis) {
        this.endTimeInMillis = endTimeInMillis;
        return this;
    }

    /**
     * Schedule run end time in milliseconds.
     *
     * @return endTimeInMillis
     */
    @javax.annotation.Nonnull
    public Integer getEndTimeInMillis() {
        return endTimeInMillis;
    }

    public void setEndTimeInMillis(@javax.annotation.Nonnull Integer endTimeInMillis) {
        this.endTimeInMillis = endTimeInMillis;
    }

    public ResponseScheduleRun status(@javax.annotation.Nonnull String status) {
        this.status = status;
        return this;
    }

    /**
     * Status of the schedule run.
     *
     * @return status
     */
    @javax.annotation.Nonnull
    public String getStatus() {
        return status;
    }

    public void setStatus(@javax.annotation.Nonnull String status) {
        this.status = status;
    }

    public ResponseScheduleRun detail(@javax.annotation.Nullable String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Message details related to the schedule run.
     *
     * @return detail
     */
    @javax.annotation.Nullable
    public String getDetail() {
        return detail;
    }

    public void setDetail(@javax.annotation.Nullable String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseScheduleRun responseScheduleRun = (ResponseScheduleRun) o;
        return Objects.equals(this.id, responseScheduleRun.id)
                && Objects.equals(this.startTimeInMillis, responseScheduleRun.startTimeInMillis)
                && Objects.equals(this.endTimeInMillis, responseScheduleRun.endTimeInMillis)
                && Objects.equals(this.status, responseScheduleRun.status)
                && Objects.equals(this.detail, responseScheduleRun.detail);
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
        return Objects.hash(id, startTimeInMillis, endTimeInMillis, status, detail);
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
        sb.append("class ResponseScheduleRun {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    startTimeInMillis: ")
                .append(toIndentedString(startTimeInMillis))
                .append("\n");
        sb.append("    endTimeInMillis: ").append(toIndentedString(endTimeInMillis)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
        openapiFields.add("start_time_in_millis");
        openapiFields.add("end_time_in_millis");
        openapiFields.add("status");
        openapiFields.add("detail");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("start_time_in_millis");
        openapiRequiredFields.add("end_time_in_millis");
        openapiRequiredFields.add("status");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ResponseScheduleRun
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ResponseScheduleRun.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ResponseScheduleRun is not found in"
                                        + " the empty JSON string",
                                ResponseScheduleRun.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ResponseScheduleRun.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ResponseScheduleRun` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ResponseScheduleRun.openapiRequiredFields) {
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
        if (!jsonObj.get("status").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `status` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("status").toString()));
        }
        if ((jsonObj.get("detail") != null && !jsonObj.get("detail").isJsonNull())
                && !jsonObj.get("detail").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `detail` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("detail").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ResponseScheduleRun.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ResponseScheduleRun' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ResponseScheduleRun> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ResponseScheduleRun.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ResponseScheduleRun>() {
                        @Override
                        public void write(JsonWriter out, ResponseScheduleRun value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ResponseScheduleRun read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ResponseScheduleRun given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ResponseScheduleRun
     * @throws IOException if the JSON string is invalid with respect to ResponseScheduleRun
     */
    public static ResponseScheduleRun fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ResponseScheduleRun.class);
    }

    /**
     * Convert an instance of ResponseScheduleRun to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
