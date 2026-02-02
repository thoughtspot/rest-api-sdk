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

/** ValidateCommunicationChannelRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ValidateCommunicationChannelRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Type of communication channel to validate (e.g., WEBHOOK). */
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

    public static final String SERIALIZED_NAME_CHANNEL_IDENTIFIER = "channel_identifier";

    @SerializedName(SERIALIZED_NAME_CHANNEL_IDENTIFIER)
    @javax.annotation.Nonnull
    private String channelIdentifier;

    /** Event type to validate for this channel. */
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

    public ValidateCommunicationChannelRequest() {}

    public ValidateCommunicationChannelRequest channelType(
            @javax.annotation.Nonnull ChannelTypeEnum channelType) {
        this.channelType = channelType;
        return this;
    }

    /**
     * Type of communication channel to validate (e.g., WEBHOOK).
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

    public ValidateCommunicationChannelRequest channelIdentifier(
            @javax.annotation.Nonnull String channelIdentifier) {
        this.channelIdentifier = channelIdentifier;
        return this;
    }

    /**
     * Unique identifier or name for the communication channel.
     *
     * @return channelIdentifier
     */
    @javax.annotation.Nonnull
    public String getChannelIdentifier() {
        return channelIdentifier;
    }

    public void setChannelIdentifier(@javax.annotation.Nonnull String channelIdentifier) {
        this.channelIdentifier = channelIdentifier;
    }

    public ValidateCommunicationChannelRequest eventType(
            @javax.annotation.Nonnull EventTypeEnum eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Event type to validate for this channel.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValidateCommunicationChannelRequest validateCommunicationChannelRequest =
                (ValidateCommunicationChannelRequest) o;
        return Objects.equals(this.channelType, validateCommunicationChannelRequest.channelType)
                && Objects.equals(
                        this.channelIdentifier,
                        validateCommunicationChannelRequest.channelIdentifier)
                && Objects.equals(this.eventType, validateCommunicationChannelRequest.eventType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelType, channelIdentifier, eventType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateCommunicationChannelRequest {\n");
        sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
        sb.append("    channelIdentifier: ")
                .append(toIndentedString(channelIdentifier))
                .append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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
        openapiFields.add("channel_identifier");
        openapiFields.add("event_type");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("channel_type");
        openapiRequiredFields.add("channel_identifier");
        openapiRequiredFields.add("event_type");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ValidateCommunicationChannelRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ValidateCommunicationChannelRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ValidateCommunicationChannelRequest"
                                        + " is not found in the empty JSON string",
                                ValidateCommunicationChannelRequest.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ValidateCommunicationChannelRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ValidateCommunicationChannelRequest` properties. JSON:"
                                        + " %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ValidateCommunicationChannelRequest.openapiRequiredFields) {
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
        if (!jsonObj.get("channel_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `channel_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("channel_identifier").toString()));
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
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ValidateCommunicationChannelRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ValidateCommunicationChannelRequest' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ValidateCommunicationChannelRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ValidateCommunicationChannelRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ValidateCommunicationChannelRequest>() {
                        @Override
                        public void write(JsonWriter out, ValidateCommunicationChannelRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ValidateCommunicationChannelRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ValidateCommunicationChannelRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ValidateCommunicationChannelRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     ValidateCommunicationChannelRequest
     */
    public static ValidateCommunicationChannelRequest fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, ValidateCommunicationChannelRequest.class);
    }

    /**
     * Convert an instance of ValidateCommunicationChannelRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
