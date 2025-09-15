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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** GenerateCSVRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GenerateCSVRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_START_DATE = "start_date";

    @SerializedName(SERIALIZED_NAME_START_DATE)
    @javax.annotation.Nonnull
    private String startDate;

    public static final String SERIALIZED_NAME_END_DATE = "end_date";

    @SerializedName(SERIALIZED_NAME_END_DATE)
    @javax.annotation.Nonnull
    private String endDate;

    /** Type of the calendar. */
    @JsonAdapter(CalendarTypeEnum.Adapter.class)
    public enum CalendarTypeEnum {
        MONTH_OFFSET("MONTH_OFFSET"),

        FOUR_FOUR_FIVE("FOUR_FOUR_FIVE"),

        FOUR_FIVE_FOUR("FOUR_FIVE_FOUR"),

        FIVE_FOUR_FOUR("FIVE_FOUR_FOUR");

        private String value;

        CalendarTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CalendarTypeEnum fromValue(String value) {
            for (CalendarTypeEnum b : CalendarTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<CalendarTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final CalendarTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CalendarTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return CalendarTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            CalendarTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_CALENDAR_TYPE = "calendar_type";

    @SerializedName(SERIALIZED_NAME_CALENDAR_TYPE)
    @javax.annotation.Nullable
    private CalendarTypeEnum calendarType = CalendarTypeEnum.MONTH_OFFSET;

    /** Month offset to start calendar from &#x60;January&#x60;. */
    @JsonAdapter(MonthOffsetEnum.Adapter.class)
    public enum MonthOffsetEnum {
        JANUARY("January"),

        FEBRUARY("February"),

        MARCH("March"),

        APRIL("April"),

        MAY("May"),

        JUNE("June"),

        JULY("July"),

        AUGUST("August"),

        SEPTEMBER("September"),

        OCTOBER("October"),

        NOVEMBER("November"),

        DECEMBER("December");

        private String value;

        MonthOffsetEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static MonthOffsetEnum fromValue(String value) {
            for (MonthOffsetEnum b : MonthOffsetEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<MonthOffsetEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final MonthOffsetEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MonthOffsetEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MonthOffsetEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            MonthOffsetEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_MONTH_OFFSET = "month_offset";

    @SerializedName(SERIALIZED_NAME_MONTH_OFFSET)
    @javax.annotation.Nullable
    private MonthOffsetEnum monthOffset = MonthOffsetEnum.JANUARY;

    /** Specify the starting day of the week. */
    @JsonAdapter(StartDayOfWeekEnum.Adapter.class)
    public enum StartDayOfWeekEnum {
        SUNDAY("Sunday"),

        MONDAY("Monday"),

        TUESDAY("Tuesday"),

        WEDNESDAY("Wednesday"),

        THURSDAY("Thursday"),

        FRIDAY("Friday"),

        SATURDAY("Saturday");

        private String value;

        StartDayOfWeekEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StartDayOfWeekEnum fromValue(String value) {
            for (StartDayOfWeekEnum b : StartDayOfWeekEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<StartDayOfWeekEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StartDayOfWeekEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StartDayOfWeekEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StartDayOfWeekEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            StartDayOfWeekEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_START_DAY_OF_WEEK = "start_day_of_week";

    @SerializedName(SERIALIZED_NAME_START_DAY_OF_WEEK)
    @javax.annotation.Nullable
    private StartDayOfWeekEnum startDayOfWeek = StartDayOfWeekEnum.SUNDAY;

    public static final String SERIALIZED_NAME_QUARTER_NAME_PREFIX = "quarter_name_prefix";

    @SerializedName(SERIALIZED_NAME_QUARTER_NAME_PREFIX)
    @javax.annotation.Nullable
    private String quarterNamePrefix;

    public static final String SERIALIZED_NAME_YEAR_NAME_PREFIX = "year_name_prefix";

    @SerializedName(SERIALIZED_NAME_YEAR_NAME_PREFIX)
    @javax.annotation.Nullable
    private String yearNamePrefix;

    public GenerateCSVRequest() {}

    public GenerateCSVRequest startDate(@javax.annotation.Nonnull String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Start date for the calendar in &#x60;MM/dd/yyyy&#x60; format.
     *
     * @return startDate
     */
    @javax.annotation.Nonnull
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(@javax.annotation.Nonnull String startDate) {
        this.startDate = startDate;
    }

    public GenerateCSVRequest endDate(@javax.annotation.Nonnull String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * End date for the calendar in &#x60;MM/dd/yyyy&#x60; format.
     *
     * @return endDate
     */
    @javax.annotation.Nonnull
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(@javax.annotation.Nonnull String endDate) {
        this.endDate = endDate;
    }

    public GenerateCSVRequest calendarType(
            @javax.annotation.Nullable CalendarTypeEnum calendarType) {
        this.calendarType = calendarType;
        return this;
    }

    /**
     * Type of the calendar.
     *
     * @return calendarType
     */
    @javax.annotation.Nullable
    public CalendarTypeEnum getCalendarType() {
        return calendarType;
    }

    public void setCalendarType(@javax.annotation.Nullable CalendarTypeEnum calendarType) {
        this.calendarType = calendarType;
    }

    public GenerateCSVRequest monthOffset(@javax.annotation.Nullable MonthOffsetEnum monthOffset) {
        this.monthOffset = monthOffset;
        return this;
    }

    /**
     * Month offset to start calendar from &#x60;January&#x60;.
     *
     * @return monthOffset
     */
    @javax.annotation.Nullable
    public MonthOffsetEnum getMonthOffset() {
        return monthOffset;
    }

    public void setMonthOffset(@javax.annotation.Nullable MonthOffsetEnum monthOffset) {
        this.monthOffset = monthOffset;
    }

    public GenerateCSVRequest startDayOfWeek(
            @javax.annotation.Nullable StartDayOfWeekEnum startDayOfWeek) {
        this.startDayOfWeek = startDayOfWeek;
        return this;
    }

    /**
     * Specify the starting day of the week.
     *
     * @return startDayOfWeek
     */
    @javax.annotation.Nullable
    public StartDayOfWeekEnum getStartDayOfWeek() {
        return startDayOfWeek;
    }

    public void setStartDayOfWeek(@javax.annotation.Nullable StartDayOfWeekEnum startDayOfWeek) {
        this.startDayOfWeek = startDayOfWeek;
    }

    public GenerateCSVRequest quarterNamePrefix(
            @javax.annotation.Nullable String quarterNamePrefix) {
        this.quarterNamePrefix = quarterNamePrefix;
        return this;
    }

    /**
     * Prefix to add before the quarter.
     *
     * @return quarterNamePrefix
     */
    @javax.annotation.Nullable
    public String getQuarterNamePrefix() {
        return quarterNamePrefix;
    }

    public void setQuarterNamePrefix(@javax.annotation.Nullable String quarterNamePrefix) {
        this.quarterNamePrefix = quarterNamePrefix;
    }

    public GenerateCSVRequest yearNamePrefix(@javax.annotation.Nullable String yearNamePrefix) {
        this.yearNamePrefix = yearNamePrefix;
        return this;
    }

    /**
     * Prefix to add before the year.
     *
     * @return yearNamePrefix
     */
    @javax.annotation.Nullable
    public String getYearNamePrefix() {
        return yearNamePrefix;
    }

    public void setYearNamePrefix(@javax.annotation.Nullable String yearNamePrefix) {
        this.yearNamePrefix = yearNamePrefix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenerateCSVRequest generateCSVRequest = (GenerateCSVRequest) o;
        return Objects.equals(this.startDate, generateCSVRequest.startDate)
                && Objects.equals(this.endDate, generateCSVRequest.endDate)
                && Objects.equals(this.calendarType, generateCSVRequest.calendarType)
                && Objects.equals(this.monthOffset, generateCSVRequest.monthOffset)
                && Objects.equals(this.startDayOfWeek, generateCSVRequest.startDayOfWeek)
                && Objects.equals(this.quarterNamePrefix, generateCSVRequest.quarterNamePrefix)
                && Objects.equals(this.yearNamePrefix, generateCSVRequest.yearNamePrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                startDate,
                endDate,
                calendarType,
                monthOffset,
                startDayOfWeek,
                quarterNamePrefix,
                yearNamePrefix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateCSVRequest {\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    calendarType: ").append(toIndentedString(calendarType)).append("\n");
        sb.append("    monthOffset: ").append(toIndentedString(monthOffset)).append("\n");
        sb.append("    startDayOfWeek: ").append(toIndentedString(startDayOfWeek)).append("\n");
        sb.append("    quarterNamePrefix: ")
                .append(toIndentedString(quarterNamePrefix))
                .append("\n");
        sb.append("    yearNamePrefix: ").append(toIndentedString(yearNamePrefix)).append("\n");
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
        openapiFields.add("start_date");
        openapiFields.add("end_date");
        openapiFields.add("calendar_type");
        openapiFields.add("month_offset");
        openapiFields.add("start_day_of_week");
        openapiFields.add("quarter_name_prefix");
        openapiFields.add("year_name_prefix");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("start_date");
        openapiRequiredFields.add("end_date");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to GenerateCSVRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GenerateCSVRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in GenerateCSVRequest is not found in"
                                        + " the empty JSON string",
                                GenerateCSVRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!GenerateCSVRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `GenerateCSVRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : GenerateCSVRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("start_date").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `start_date` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("start_date").toString()));
        }
        if (!jsonObj.get("end_date").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `end_date` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("end_date").toString()));
        }
        if ((jsonObj.get("calendar_type") != null && !jsonObj.get("calendar_type").isJsonNull())
                && !jsonObj.get("calendar_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `calendar_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("calendar_type").toString()));
        }
        // validate the optional field `calendar_type`
        if (jsonObj.get("calendar_type") != null && !jsonObj.get("calendar_type").isJsonNull()) {
            CalendarTypeEnum.validateJsonElement(jsonObj.get("calendar_type"));
        }
        if ((jsonObj.get("month_offset") != null && !jsonObj.get("month_offset").isJsonNull())
                && !jsonObj.get("month_offset").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `month_offset` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("month_offset").toString()));
        }
        // validate the optional field `month_offset`
        if (jsonObj.get("month_offset") != null && !jsonObj.get("month_offset").isJsonNull()) {
            MonthOffsetEnum.validateJsonElement(jsonObj.get("month_offset"));
        }
        if ((jsonObj.get("start_day_of_week") != null
                        && !jsonObj.get("start_day_of_week").isJsonNull())
                && !jsonObj.get("start_day_of_week").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `start_day_of_week` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("start_day_of_week").toString()));
        }
        // validate the optional field `start_day_of_week`
        if (jsonObj.get("start_day_of_week") != null
                && !jsonObj.get("start_day_of_week").isJsonNull()) {
            StartDayOfWeekEnum.validateJsonElement(jsonObj.get("start_day_of_week"));
        }
        if ((jsonObj.get("quarter_name_prefix") != null
                        && !jsonObj.get("quarter_name_prefix").isJsonNull())
                && !jsonObj.get("quarter_name_prefix").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `quarter_name_prefix` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("quarter_name_prefix").toString()));
        }
        if ((jsonObj.get("year_name_prefix") != null
                        && !jsonObj.get("year_name_prefix").isJsonNull())
                && !jsonObj.get("year_name_prefix").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `year_name_prefix` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("year_name_prefix").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GenerateCSVRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GenerateCSVRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GenerateCSVRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(GenerateCSVRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GenerateCSVRequest>() {
                        @Override
                        public void write(JsonWriter out, GenerateCSVRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GenerateCSVRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GenerateCSVRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GenerateCSVRequest
     * @throws IOException if the JSON string is invalid with respect to GenerateCSVRequest
     */
    public static GenerateCSVRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GenerateCSVRequest.class);
    }

    /**
     * Convert an instance of GenerateCSVRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
