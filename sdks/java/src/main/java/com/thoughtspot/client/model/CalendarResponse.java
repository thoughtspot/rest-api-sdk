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

/** CalendarResponse */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CalendarResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CALENDAR_NAME = "calendar_name";

    @SerializedName(SERIALIZED_NAME_CALENDAR_NAME)
    @javax.annotation.Nullable
    private String calendarName;

    public static final String SERIALIZED_NAME_CONNECTION_NAME = "connection_name";

    @SerializedName(SERIALIZED_NAME_CONNECTION_NAME)
    @javax.annotation.Nullable
    private String connectionName;

    public static final String SERIALIZED_NAME_DATA_WAREHOUSE_TYPE = "data_warehouse_type";

    @SerializedName(SERIALIZED_NAME_DATA_WAREHOUSE_TYPE)
    @javax.annotation.Nullable
    private String dataWarehouseType;

    public static final String SERIALIZED_NAME_MODIFICATION_TIME_IN_MILLIS =
            "modification_time_in_millis";

    @SerializedName(SERIALIZED_NAME_MODIFICATION_TIME_IN_MILLIS)
    @javax.annotation.Nullable
    private String modificationTimeInMillis;

    public static final String SERIALIZED_NAME_AUTHOR_NAME = "author_name";

    @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
    @javax.annotation.Nullable
    private String authorName;

    public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";

    @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
    @javax.annotation.Nullable
    private String connectionId;

    public static final String SERIALIZED_NAME_CALENDAR_ID = "calendar_id";

    @SerializedName(SERIALIZED_NAME_CALENDAR_ID)
    @javax.annotation.Nullable
    private String calendarId;

    public CalendarResponse() {}

    public CalendarResponse calendarName(@javax.annotation.Nullable String calendarName) {
        this.calendarName = calendarName;
        return this;
    }

    /**
     * Name of the calendar
     *
     * @return calendarName
     */
    @javax.annotation.Nullable
    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(@javax.annotation.Nullable String calendarName) {
        this.calendarName = calendarName;
    }

    public CalendarResponse connectionName(@javax.annotation.Nullable String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * Name of the connection
     *
     * @return connectionName
     */
    @javax.annotation.Nullable
    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(@javax.annotation.Nullable String connectionName) {
        this.connectionName = connectionName;
    }

    public CalendarResponse dataWarehouseType(@javax.annotation.Nullable String dataWarehouseType) {
        this.dataWarehouseType = dataWarehouseType;
        return this;
    }

    /**
     * Type of data warehouse
     *
     * @return dataWarehouseType
     */
    @javax.annotation.Nullable
    public String getDataWarehouseType() {
        return dataWarehouseType;
    }

    public void setDataWarehouseType(@javax.annotation.Nullable String dataWarehouseType) {
        this.dataWarehouseType = dataWarehouseType;
    }

    public CalendarResponse modificationTimeInMillis(
            @javax.annotation.Nullable String modificationTimeInMillis) {
        this.modificationTimeInMillis = modificationTimeInMillis;
        return this;
    }

    /**
     * Last modification time in milliseconds
     *
     * @return modificationTimeInMillis
     */
    @javax.annotation.Nullable
    public String getModificationTimeInMillis() {
        return modificationTimeInMillis;
    }

    public void setModificationTimeInMillis(
            @javax.annotation.Nullable String modificationTimeInMillis) {
        this.modificationTimeInMillis = modificationTimeInMillis;
    }

    public CalendarResponse authorName(@javax.annotation.Nullable String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * Name of the author who created the calendar
     *
     * @return authorName
     */
    @javax.annotation.Nullable
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(@javax.annotation.Nullable String authorName) {
        this.authorName = authorName;
    }

    public CalendarResponse connectionId(@javax.annotation.Nullable String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique ID of the connection
     *
     * @return connectionId
     */
    @javax.annotation.Nullable
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(@javax.annotation.Nullable String connectionId) {
        this.connectionId = connectionId;
    }

    public CalendarResponse calendarId(@javax.annotation.Nullable String calendarId) {
        this.calendarId = calendarId;
        return this;
    }

    /**
     * Unique ID of the calendar
     *
     * @return calendarId
     */
    @javax.annotation.Nullable
    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(@javax.annotation.Nullable String calendarId) {
        this.calendarId = calendarId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CalendarResponse calendarResponse = (CalendarResponse) o;
        return Objects.equals(this.calendarName, calendarResponse.calendarName)
                && Objects.equals(this.connectionName, calendarResponse.connectionName)
                && Objects.equals(this.dataWarehouseType, calendarResponse.dataWarehouseType)
                && Objects.equals(
                        this.modificationTimeInMillis, calendarResponse.modificationTimeInMillis)
                && Objects.equals(this.authorName, calendarResponse.authorName)
                && Objects.equals(this.connectionId, calendarResponse.connectionId)
                && Objects.equals(this.calendarId, calendarResponse.calendarId);
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
                calendarName,
                connectionName,
                dataWarehouseType,
                modificationTimeInMillis,
                authorName,
                connectionId,
                calendarId);
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
        sb.append("class CalendarResponse {\n");
        sb.append("    calendarName: ").append(toIndentedString(calendarName)).append("\n");
        sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
        sb.append("    dataWarehouseType: ")
                .append(toIndentedString(dataWarehouseType))
                .append("\n");
        sb.append("    modificationTimeInMillis: ")
                .append(toIndentedString(modificationTimeInMillis))
                .append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    calendarId: ").append(toIndentedString(calendarId)).append("\n");
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
        openapiFields.add("calendar_name");
        openapiFields.add("connection_name");
        openapiFields.add("data_warehouse_type");
        openapiFields.add("modification_time_in_millis");
        openapiFields.add("author_name");
        openapiFields.add("connection_id");
        openapiFields.add("calendar_id");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CalendarResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CalendarResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CalendarResponse is not found in the"
                                        + " empty JSON string",
                                CalendarResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CalendarResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CalendarResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("calendar_name") != null && !jsonObj.get("calendar_name").isJsonNull())
                && !jsonObj.get("calendar_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `calendar_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("calendar_name").toString()));
        }
        if ((jsonObj.get("connection_name") != null && !jsonObj.get("connection_name").isJsonNull())
                && !jsonObj.get("connection_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `connection_name` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("connection_name").toString()));
        }
        if ((jsonObj.get("data_warehouse_type") != null
                        && !jsonObj.get("data_warehouse_type").isJsonNull())
                && !jsonObj.get("data_warehouse_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `data_warehouse_type` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("data_warehouse_type").toString()));
        }
        if ((jsonObj.get("modification_time_in_millis") != null
                        && !jsonObj.get("modification_time_in_millis").isJsonNull())
                && !jsonObj.get("modification_time_in_millis").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `modification_time_in_millis` to be a primitive"
                                    + " type in the JSON string but got `%s`",
                            jsonObj.get("modification_time_in_millis").toString()));
        }
        if ((jsonObj.get("author_name") != null && !jsonObj.get("author_name").isJsonNull())
                && !jsonObj.get("author_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `author_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("author_name").toString()));
        }
        if ((jsonObj.get("connection_id") != null && !jsonObj.get("connection_id").isJsonNull())
                && !jsonObj.get("connection_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `connection_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("connection_id").toString()));
        }
        if ((jsonObj.get("calendar_id") != null && !jsonObj.get("calendar_id").isJsonNull())
                && !jsonObj.get("calendar_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `calendar_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("calendar_id").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CalendarResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CalendarResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CalendarResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CalendarResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CalendarResponse>() {
                        @Override
                        public void write(JsonWriter out, CalendarResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CalendarResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CalendarResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CalendarResponse
     * @throws IOException if the JSON string is invalid with respect to CalendarResponse
     */
    public static CalendarResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CalendarResponse.class);
    }

    /**
     * Convert an instance of CalendarResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
