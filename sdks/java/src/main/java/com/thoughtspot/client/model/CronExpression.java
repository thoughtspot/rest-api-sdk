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

/** Schedule selected cron expression. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CronExpression implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DAY_OF_MONTH = "day_of_month";

    @SerializedName(SERIALIZED_NAME_DAY_OF_MONTH)
    @javax.annotation.Nonnull
    private String dayOfMonth;

    public static final String SERIALIZED_NAME_DAY_OF_WEEK = "day_of_week";

    @SerializedName(SERIALIZED_NAME_DAY_OF_WEEK)
    @javax.annotation.Nonnull
    private String dayOfWeek;

    public static final String SERIALIZED_NAME_HOUR = "hour";

    @SerializedName(SERIALIZED_NAME_HOUR)
    @javax.annotation.Nonnull
    private String hour;

    public static final String SERIALIZED_NAME_MINUTE = "minute";

    @SerializedName(SERIALIZED_NAME_MINUTE)
    @javax.annotation.Nonnull
    private String minute;

    public static final String SERIALIZED_NAME_MONTH = "month";

    @SerializedName(SERIALIZED_NAME_MONTH)
    @javax.annotation.Nonnull
    private String month;

    public static final String SERIALIZED_NAME_SECOND = "second";

    @SerializedName(SERIALIZED_NAME_SECOND)
    @javax.annotation.Nonnull
    private String second;

    public CronExpression() {}

    public CronExpression dayOfMonth(@javax.annotation.Nonnull String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        return this;
    }

    /**
     * Day of month of the object.
     *
     * @return dayOfMonth
     */
    @javax.annotation.Nonnull
    public String getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(@javax.annotation.Nonnull String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public CronExpression dayOfWeek(@javax.annotation.Nonnull String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * Day of Week of the object.
     *
     * @return dayOfWeek
     */
    @javax.annotation.Nonnull
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(@javax.annotation.Nonnull String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public CronExpression hour(@javax.annotation.Nonnull String hour) {
        this.hour = hour;
        return this;
    }

    /**
     * Hour of the object.
     *
     * @return hour
     */
    @javax.annotation.Nonnull
    public String getHour() {
        return hour;
    }

    public void setHour(@javax.annotation.Nonnull String hour) {
        this.hour = hour;
    }

    public CronExpression minute(@javax.annotation.Nonnull String minute) {
        this.minute = minute;
        return this;
    }

    /**
     * Minute of the object.
     *
     * @return minute
     */
    @javax.annotation.Nonnull
    public String getMinute() {
        return minute;
    }

    public void setMinute(@javax.annotation.Nonnull String minute) {
        this.minute = minute;
    }

    public CronExpression month(@javax.annotation.Nonnull String month) {
        this.month = month;
        return this;
    }

    /**
     * Month of the object.
     *
     * @return month
     */
    @javax.annotation.Nonnull
    public String getMonth() {
        return month;
    }

    public void setMonth(@javax.annotation.Nonnull String month) {
        this.month = month;
    }

    public CronExpression second(@javax.annotation.Nonnull String second) {
        this.second = second;
        return this;
    }

    /**
     * Second of the object.
     *
     * @return second
     */
    @javax.annotation.Nonnull
    public String getSecond() {
        return second;
    }

    public void setSecond(@javax.annotation.Nonnull String second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CronExpression cronExpression = (CronExpression) o;
        return Objects.equals(this.dayOfMonth, cronExpression.dayOfMonth)
                && Objects.equals(this.dayOfWeek, cronExpression.dayOfWeek)
                && Objects.equals(this.hour, cronExpression.hour)
                && Objects.equals(this.minute, cronExpression.minute)
                && Objects.equals(this.month, cronExpression.month)
                && Objects.equals(this.second, cronExpression.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayOfMonth, dayOfWeek, hour, minute, month, second);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CronExpression {\n");
        sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
        sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
        sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
        sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
        sb.append("    month: ").append(toIndentedString(month)).append("\n");
        sb.append("    second: ").append(toIndentedString(second)).append("\n");
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
        openapiFields.add("day_of_month");
        openapiFields.add("day_of_week");
        openapiFields.add("hour");
        openapiFields.add("minute");
        openapiFields.add("month");
        openapiFields.add("second");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("day_of_month");
        openapiRequiredFields.add("day_of_week");
        openapiRequiredFields.add("hour");
        openapiRequiredFields.add("minute");
        openapiRequiredFields.add("month");
        openapiRequiredFields.add("second");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CronExpression
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CronExpression.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CronExpression is not found in the"
                                        + " empty JSON string",
                                CronExpression.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CronExpression.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CronExpression` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CronExpression.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("day_of_month").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `day_of_month` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("day_of_month").toString()));
        }
        if (!jsonObj.get("day_of_week").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `day_of_week` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("day_of_week").toString()));
        }
        if (!jsonObj.get("hour").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `hour` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("hour").toString()));
        }
        if (!jsonObj.get("minute").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `minute` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("minute").toString()));
        }
        if (!jsonObj.get("month").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `month` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("month").toString()));
        }
        if (!jsonObj.get("second").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `second` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("second").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CronExpression.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CronExpression' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CronExpression> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CronExpression.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CronExpression>() {
                        @Override
                        public void write(JsonWriter out, CronExpression value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CronExpression read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CronExpression given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CronExpression
     * @throws IOException if the JSON string is invalid with respect to CronExpression
     */
    public static CronExpression fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CronExpression.class);
    }

    /**
     * Convert an instance of CronExpression to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
