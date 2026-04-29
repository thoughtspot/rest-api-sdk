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
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thoughtspot.client.JSON;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** SearchChannelHistoryRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SearchChannelHistoryRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Type of communication channel to search history for. */
    @JsonAdapter(ChannelTypeEnum.Adapter.class)
    public enum ChannelTypeEnum {
        WEBHOOK("WEBHOOK");

        private String value;

        ChannelTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ChannelTypeEnum fromValue(String value) {
            for (ChannelTypeEnum b : ChannelTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ChannelTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ChannelTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ChannelTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ChannelTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ChannelTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channel_type";

    @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
    @javax.annotation.Nonnull
    private ChannelTypeEnum channelType;

    public static final String SERIALIZED_NAME_JOB_IDS = "job_ids";

    @SerializedName(SERIALIZED_NAME_JOB_IDS)
    @javax.annotation.Nullable
    private List<String> jobIds;

    public static final String SERIALIZED_NAME_CHANNEL_IDENTIFIERS = "channel_identifiers";

    @SerializedName(SERIALIZED_NAME_CHANNEL_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> channelIdentifiers;

    /** Filter by channel delivery status. */
    @JsonAdapter(ChannelStatusEnum.Adapter.class)
    public enum ChannelStatusEnum {
        PENDING("PENDING"),

        RETRY("RETRY"),

        SUCCESS("SUCCESS"),

        FAILED("FAILED");

        private String value;

        ChannelStatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ChannelStatusEnum fromValue(String value) {
            for (ChannelStatusEnum b : ChannelStatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ChannelStatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ChannelStatusEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ChannelStatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ChannelStatusEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ChannelStatusEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_CHANNEL_STATUS = "channel_status";

    @SerializedName(SERIALIZED_NAME_CHANNEL_STATUS)
    @javax.annotation.Nullable
    private ChannelStatusEnum channelStatus;

    public static final String SERIALIZED_NAME_EVENTS = "events";

    @SerializedName(SERIALIZED_NAME_EVENTS)
    @javax.annotation.Nullable
    private List<ChannelHistoryEventInput> events;

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

    public SearchChannelHistoryRequest() {}

    public SearchChannelHistoryRequest channelType(
            @javax.annotation.Nonnull ChannelTypeEnum channelType) {
        this.channelType = channelType;
        return this;
    }

    /**
     * Type of communication channel to search history for.
     *
     * @return channelType
     */
    @javax.annotation.Nonnull
    public ChannelTypeEnum getChannelType() {
        return channelType;
    }

    public void setChannelType(@javax.annotation.Nonnull ChannelTypeEnum channelType) {
        this.channelType = channelType;
    }

    public SearchChannelHistoryRequest jobIds(@javax.annotation.Nullable List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }

    public SearchChannelHistoryRequest addJobIdsItem(String jobIdsItem) {
        if (this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        this.jobIds.add(jobIdsItem);
        return this;
    }

    /**
     * List of job execution record IDs to retrieve.
     *
     * @return jobIds
     */
    @javax.annotation.Nullable
    public List<String> getJobIds() {
        return jobIds;
    }

    public void setJobIds(@javax.annotation.Nullable List<String> jobIds) {
        this.jobIds = jobIds;
    }

    public SearchChannelHistoryRequest channelIdentifiers(
            @javax.annotation.Nullable List<String> channelIdentifiers) {
        this.channelIdentifiers = channelIdentifiers;
        return this;
    }

    public SearchChannelHistoryRequest addChannelIdentifiersItem(String channelIdentifiersItem) {
        if (this.channelIdentifiers == null) {
            this.channelIdentifiers = new ArrayList<>();
        }
        this.channelIdentifiers.add(channelIdentifiersItem);
        return this;
    }

    /**
     * List of channel IDs or names to filter by.
     *
     * @return channelIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getChannelIdentifiers() {
        return channelIdentifiers;
    }

    public void setChannelIdentifiers(@javax.annotation.Nullable List<String> channelIdentifiers) {
        this.channelIdentifiers = channelIdentifiers;
    }

    public SearchChannelHistoryRequest channelStatus(
            @javax.annotation.Nullable ChannelStatusEnum channelStatus) {
        this.channelStatus = channelStatus;
        return this;
    }

    /**
     * Filter by channel delivery status.
     *
     * @return channelStatus
     */
    @javax.annotation.Nullable
    public ChannelStatusEnum getChannelStatus() {
        return channelStatus;
    }

    public void setChannelStatus(@javax.annotation.Nullable ChannelStatusEnum channelStatus) {
        this.channelStatus = channelStatus;
    }

    public SearchChannelHistoryRequest events(
            @javax.annotation.Nullable List<ChannelHistoryEventInput> events) {
        this.events = events;
        return this;
    }

    public SearchChannelHistoryRequest addEventsItem(ChannelHistoryEventInput eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
     * Filter by events that triggered the channel.
     *
     * @return events
     */
    @javax.annotation.Nullable
    public List<ChannelHistoryEventInput> getEvents() {
        return events;
    }

    public void setEvents(@javax.annotation.Nullable List<ChannelHistoryEventInput> events) {
        this.events = events;
    }

    public SearchChannelHistoryRequest startEpochTimeInMillis(
            @javax.annotation.Nullable Float startEpochTimeInMillis) {
        this.startEpochTimeInMillis = startEpochTimeInMillis;
        return this;
    }

    /**
     * Filter records created on or after this time (epoch milliseconds).
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

    public SearchChannelHistoryRequest endEpochTimeInMillis(
            @javax.annotation.Nullable Float endEpochTimeInMillis) {
        this.endEpochTimeInMillis = endEpochTimeInMillis;
        return this;
    }

    /**
     * Filter records created on or before this time (epoch milliseconds). Version: 26.7.0.cl or
     * later
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

    /**
     * A container for additional, undeclared properties. This is a holder for any undeclared
     * properties as specified with the 'additionalProperties' keyword in the OAS document.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Set the additional (undeclared) property with the specified name and value. If the property
     * does not already exist, create it otherwise replace it.
     *
     * @param key name of the property
     * @param value value of the property
     * @return the SearchChannelHistoryRequest instance itself
     */
    public SearchChannelHistoryRequest putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
     * Return the additional (undeclared) property.
     *
     * @return a map of objects
     */
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Return the additional (undeclared) property with the specified name.
     *
     * @param key name of the property
     * @return an object
     */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchChannelHistoryRequest searchChannelHistoryRequest = (SearchChannelHistoryRequest) o;
        return Objects.equals(this.channelType, searchChannelHistoryRequest.channelType)
                && Objects.equals(this.jobIds, searchChannelHistoryRequest.jobIds)
                && Objects.equals(
                        this.channelIdentifiers, searchChannelHistoryRequest.channelIdentifiers)
                && Objects.equals(this.channelStatus, searchChannelHistoryRequest.channelStatus)
                && Objects.equals(this.events, searchChannelHistoryRequest.events)
                && Objects.equals(
                        this.startEpochTimeInMillis,
                        searchChannelHistoryRequest.startEpochTimeInMillis)
                && Objects.equals(
                        this.endEpochTimeInMillis, searchChannelHistoryRequest.endEpochTimeInMillis)
                && Objects.equals(
                        this.additionalProperties,
                        searchChannelHistoryRequest.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                channelType,
                jobIds,
                channelIdentifiers,
                channelStatus,
                events,
                startEpochTimeInMillis,
                endEpochTimeInMillis,
                additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchChannelHistoryRequest {\n");
        sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
        sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
        sb.append("    channelIdentifiers: ")
                .append(toIndentedString(channelIdentifiers))
                .append("\n");
        sb.append("    channelStatus: ").append(toIndentedString(channelStatus)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    startEpochTimeInMillis: ")
                .append(toIndentedString(startEpochTimeInMillis))
                .append("\n");
        sb.append("    endEpochTimeInMillis: ")
                .append(toIndentedString(endEpochTimeInMillis))
                .append("\n");
        sb.append("    additionalProperties: ")
                .append(toIndentedString(additionalProperties))
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
        openapiFields.add("channel_type");
        openapiFields.add("job_ids");
        openapiFields.add("channel_identifiers");
        openapiFields.add("channel_status");
        openapiFields.add("events");
        openapiFields.add("start_epoch_time_in_millis");
        openapiFields.add("end_epoch_time_in_millis");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("channel_type");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     SearchChannelHistoryRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SearchChannelHistoryRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SearchChannelHistoryRequest is not"
                                        + " found in the empty JSON string",
                                SearchChannelHistoryRequest.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : SearchChannelHistoryRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("channel_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `channel_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("channel_type").toString()));
        }
        // validate the required field `channel_type`
        ChannelTypeEnum.validateJsonElement(jsonObj.get("channel_type"));
        // ensure the optional json data is an array if present
        if (jsonObj.get("job_ids") != null
                && !jsonObj.get("job_ids").isJsonNull()
                && !jsonObj.get("job_ids").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `job_ids` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("job_ids").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("channel_identifiers") != null
                && !jsonObj.get("channel_identifiers").isJsonNull()
                && !jsonObj.get("channel_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `channel_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("channel_identifiers").toString()));
        }
        if ((jsonObj.get("channel_status") != null && !jsonObj.get("channel_status").isJsonNull())
                && !jsonObj.get("channel_status").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `channel_status` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("channel_status").toString()));
        }
        // validate the optional field `channel_status`
        if (jsonObj.get("channel_status") != null && !jsonObj.get("channel_status").isJsonNull()) {
            ChannelStatusEnum.validateJsonElement(jsonObj.get("channel_status"));
        }
        if (jsonObj.get("events") != null && !jsonObj.get("events").isJsonNull()) {
            JsonArray jsonArrayevents = jsonObj.getAsJsonArray("events");
            if (jsonArrayevents != null) {
                // ensure the json data is an array
                if (!jsonObj.get("events").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `events` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("events").toString()));
                }

                // validate the optional field `events` (array)
                for (int i = 0; i < jsonArrayevents.size(); i++) {
                    ChannelHistoryEventInput.validateJsonElement(jsonArrayevents.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SearchChannelHistoryRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SearchChannelHistoryRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SearchChannelHistoryRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SearchChannelHistoryRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SearchChannelHistoryRequest>() {
                        @Override
                        public void write(JsonWriter out, SearchChannelHistoryRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            obj.remove("additionalProperties");
                            // serialize additional properties
                            if (value.getAdditionalProperties() != null) {
                                for (Map.Entry<String, Object> entry :
                                        value.getAdditionalProperties().entrySet()) {
                                    if (entry.getValue() instanceof String)
                                        obj.addProperty(entry.getKey(), (String) entry.getValue());
                                    else if (entry.getValue() instanceof Number)
                                        obj.addProperty(entry.getKey(), (Number) entry.getValue());
                                    else if (entry.getValue() instanceof Boolean)
                                        obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                                    else if (entry.getValue() instanceof Character)
                                        obj.addProperty(
                                                entry.getKey(), (Character) entry.getValue());
                                    else {
                                        JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                                        if (jsonElement.isJsonArray()) {
                                            obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                                        } else {
                                            obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                                        }
                                    }
                                }
                            }
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SearchChannelHistoryRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            SearchChannelHistoryRequest instance =
                                    thisAdapter.fromJsonTree(jsonObj);
                            for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
                                if (!openapiFields.contains(entry.getKey())) {
                                    if (entry.getValue().isJsonPrimitive()) { // primitive type
                                        if (entry.getValue().getAsJsonPrimitive().isString())
                                            instance.putAdditionalProperty(
                                                    entry.getKey(), entry.getValue().getAsString());
                                        else if (entry.getValue().getAsJsonPrimitive().isNumber())
                                            instance.putAdditionalProperty(
                                                    entry.getKey(), entry.getValue().getAsNumber());
                                        else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                                            instance.putAdditionalProperty(
                                                    entry.getKey(),
                                                    entry.getValue().getAsBoolean());
                                        else
                                            throw new IllegalArgumentException(
                                                    String.format(
                                                            "The field `%s` has unknown primitive"
                                                                    + " type. Value: %s",
                                                            entry.getKey(),
                                                            entry.getValue().toString()));
                                    } else if (entry.getValue().isJsonArray()) {
                                        instance.putAdditionalProperty(
                                                entry.getKey(),
                                                gson.fromJson(entry.getValue(), List.class));
                                    } else { // JSON object
                                        instance.putAdditionalProperty(
                                                entry.getKey(),
                                                gson.fromJson(entry.getValue(), HashMap.class));
                                    }
                                }
                            }
                            return instance;
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SearchChannelHistoryRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SearchChannelHistoryRequest
     * @throws IOException if the JSON string is invalid with respect to SearchChannelHistoryRequest
     */
    public static SearchChannelHistoryRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SearchChannelHistoryRequest.class);
    }

    /**
     * Convert an instance of SearchChannelHistoryRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
