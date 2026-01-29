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
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** Response containing validation results for communication channel configuration. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CommunicationChannelValidateResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Type of communication channel that was validated. */
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

    public static final String SERIALIZED_NAME_CHANNEL_ID = "channel_id";

    @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
    @javax.annotation.Nonnull
    private String channelId;

    public static final String SERIALIZED_NAME_CHANNEL_NAME = "channel_name";

    @SerializedName(SERIALIZED_NAME_CHANNEL_NAME)
    @javax.annotation.Nullable
    private String channelName;

    /** Event type that was validated. */
    @JsonAdapter(EventTypeEnum.Adapter.class)
    public enum EventTypeEnum {
        LIVEBOARD_SCHEDULE("LIVEBOARD_SCHEDULE");

        private String value;

        EventTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static EventTypeEnum fromValue(String value) {
            for (EventTypeEnum b : EventTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<EventTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final EventTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public EventTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return EventTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            EventTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";

    @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
    @javax.annotation.Nonnull
    private EventTypeEnum eventType;

    /** Overall result of the validation. */
    @JsonAdapter(ResultCodeEnum.Adapter.class)
    public enum ResultCodeEnum {
        SUCCESS("SUCCESS"),

        FAILED("FAILED"),

        PARTIAL_SUCCESS("PARTIAL_SUCCESS");

        private String value;

        ResultCodeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ResultCodeEnum fromValue(String value) {
            for (ResultCodeEnum b : ResultCodeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ResultCodeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ResultCodeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ResultCodeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ResultCodeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ResultCodeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_RESULT_CODE = "result_code";

    @SerializedName(SERIALIZED_NAME_RESULT_CODE)
    @javax.annotation.Nonnull
    private ResultCodeEnum resultCode;

    public static final String SERIALIZED_NAME_DETAILS = "details";

    @SerializedName(SERIALIZED_NAME_DETAILS)
    @javax.annotation.Nullable
    private List<ChannelValidationDetail> details;

    public CommunicationChannelValidateResponse() {}

    public CommunicationChannelValidateResponse channelType(
            @javax.annotation.Nonnull ChannelTypeEnum channelType) {
        this.channelType = channelType;
        return this;
    }

    /**
     * Type of communication channel that was validated.
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

    public CommunicationChannelValidateResponse channelId(
            @javax.annotation.Nonnull String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * ID of the communication channel (e.g., webhook_id).
     *
     * @return channelId
     */
    @javax.annotation.Nonnull
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(@javax.annotation.Nonnull String channelId) {
        this.channelId = channelId;
    }

    public CommunicationChannelValidateResponse channelName(
            @javax.annotation.Nullable String channelName) {
        this.channelName = channelName;
        return this;
    }

    /**
     * Name of the communication channel (e.g., webhook name).
     *
     * @return channelName
     */
    @javax.annotation.Nullable
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(@javax.annotation.Nullable String channelName) {
        this.channelName = channelName;
    }

    public CommunicationChannelValidateResponse eventType(
            @javax.annotation.Nonnull EventTypeEnum eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Event type that was validated.
     *
     * @return eventType
     */
    @javax.annotation.Nonnull
    public EventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(@javax.annotation.Nonnull EventTypeEnum eventType) {
        this.eventType = eventType;
    }

    public CommunicationChannelValidateResponse resultCode(
            @javax.annotation.Nonnull ResultCodeEnum resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * Overall result of the validation.
     *
     * @return resultCode
     */
    @javax.annotation.Nonnull
    public ResultCodeEnum getResultCode() {
        return resultCode;
    }

    public void setResultCode(@javax.annotation.Nonnull ResultCodeEnum resultCode) {
        this.resultCode = resultCode;
    }

    public CommunicationChannelValidateResponse details(
            @javax.annotation.Nullable List<ChannelValidationDetail> details) {
        this.details = details;
        return this;
    }

    public CommunicationChannelValidateResponse addDetailsItem(
            ChannelValidationDetail detailsItem) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    /**
     * Detailed results of various validation sub-steps.
     *
     * @return details
     */
    @javax.annotation.Nullable
    public List<ChannelValidationDetail> getDetails() {
        return details;
    }

    public void setDetails(@javax.annotation.Nullable List<ChannelValidationDetail> details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommunicationChannelValidateResponse communicationChannelValidateResponse =
                (CommunicationChannelValidateResponse) o;
        return Objects.equals(this.channelType, communicationChannelValidateResponse.channelType)
                && Objects.equals(this.channelId, communicationChannelValidateResponse.channelId)
                && Objects.equals(
                        this.channelName, communicationChannelValidateResponse.channelName)
                && Objects.equals(this.eventType, communicationChannelValidateResponse.eventType)
                && Objects.equals(this.resultCode, communicationChannelValidateResponse.resultCode)
                && Objects.equals(this.details, communicationChannelValidateResponse.details);
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
        return Objects.hash(channelType, channelId, channelName, eventType, resultCode, details);
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
        sb.append("class CommunicationChannelValidateResponse {\n");
        sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
        openapiFields.add("channel_id");
        openapiFields.add("channel_name");
        openapiFields.add("event_type");
        openapiFields.add("result_code");
        openapiFields.add("details");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("channel_type");
        openapiRequiredFields.add("channel_id");
        openapiRequiredFields.add("event_type");
        openapiRequiredFields.add("result_code");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     CommunicationChannelValidateResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CommunicationChannelValidateResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CommunicationChannelValidateResponse"
                                        + " is not found in the empty JSON string",
                                CommunicationChannelValidateResponse.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CommunicationChannelValidateResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `CommunicationChannelValidateResponse` properties. JSON:"
                                    + " %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CommunicationChannelValidateResponse.openapiRequiredFields) {
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
        if (!jsonObj.get("channel_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `channel_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("channel_id").toString()));
        }
        if ((jsonObj.get("channel_name") != null && !jsonObj.get("channel_name").isJsonNull())
                && !jsonObj.get("channel_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `channel_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("channel_name").toString()));
        }
        if (!jsonObj.get("event_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `event_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("event_type").toString()));
        }
        // validate the required field `event_type`
        EventTypeEnum.validateJsonElement(jsonObj.get("event_type"));
        if (!jsonObj.get("result_code").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `result_code` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("result_code").toString()));
        }
        // validate the required field `result_code`
        ResultCodeEnum.validateJsonElement(jsonObj.get("result_code"));
        if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
            JsonArray jsonArraydetails = jsonObj.getAsJsonArray("details");
            if (jsonArraydetails != null) {
                // ensure the json data is an array
                if (!jsonObj.get("details").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `details` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("details").toString()));
                }

                // validate the optional field `details` (array)
                for (int i = 0; i < jsonArraydetails.size(); i++) {
                    ChannelValidationDetail.validateJsonElement(jsonArraydetails.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CommunicationChannelValidateResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CommunicationChannelValidateResponse'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CommunicationChannelValidateResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(CommunicationChannelValidateResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CommunicationChannelValidateResponse>() {
                        @Override
                        public void write(
                                JsonWriter out, CommunicationChannelValidateResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CommunicationChannelValidateResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CommunicationChannelValidateResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CommunicationChannelValidateResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     CommunicationChannelValidateResponse
     */
    public static CommunicationChannelValidateResponse fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, CommunicationChannelValidateResponse.class);
    }

    /**
     * Convert an instance of CommunicationChannelValidateResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
