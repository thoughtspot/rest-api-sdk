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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** EventChannelConfigInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class EventChannelConfigInput implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Type of event for which communication channels are configured */
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

    /** Gets or Sets channels */
    @JsonAdapter(ChannelsEnum.Adapter.class)
    public enum ChannelsEnum {
        EMAIL("EMAIL"),

        WEBHOOK("WEBHOOK");

        private String value;

        ChannelsEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ChannelsEnum fromValue(String value) {
            for (ChannelsEnum b : ChannelsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ChannelsEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ChannelsEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ChannelsEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ChannelsEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ChannelsEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_CHANNELS = "channels";

    @SerializedName(SERIALIZED_NAME_CHANNELS)
    @javax.annotation.Nonnull
    private List<ChannelsEnum> channels;

    public EventChannelConfigInput() {}

    public EventChannelConfigInput eventType(@javax.annotation.Nonnull EventTypeEnum eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Type of event for which communication channels are configured
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

    public EventChannelConfigInput channels(@javax.annotation.Nonnull List<ChannelsEnum> channels) {
        this.channels = channels;
        return this;
    }

    public EventChannelConfigInput addChannelsItem(ChannelsEnum channelsItem) {
        if (this.channels == null) {
            this.channels = new ArrayList<>();
        }
        this.channels.add(channelsItem);
        return this;
    }

    /**
     * Communication channels enabled for this event type. Empty array disables all channels for
     * this event.
     *
     * @return channels
     */
    @javax.annotation.Nonnull
    public List<ChannelsEnum> getChannels() {
        return channels;
    }

    public void setChannels(@javax.annotation.Nonnull List<ChannelsEnum> channels) {
        this.channels = channels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventChannelConfigInput eventChannelConfigInput = (EventChannelConfigInput) o;
        return Objects.equals(this.eventType, eventChannelConfigInput.eventType)
                && Objects.equals(this.channels, eventChannelConfigInput.channels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType, channels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventChannelConfigInput {\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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
        openapiFields.add("event_type");
        openapiFields.add("channels");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("event_type");
        openapiRequiredFields.add("channels");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to EventChannelConfigInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!EventChannelConfigInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in EventChannelConfigInput is not found"
                                        + " in the empty JSON string",
                                EventChannelConfigInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!EventChannelConfigInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `EventChannelConfigInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : EventChannelConfigInput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("event_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `event_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("event_type").toString()));
        }
        // validate the required field `event_type`
        EventTypeEnum.validateJsonElement(jsonObj.get("event_type"));
        // ensure the required json array is present
        if (jsonObj.get("channels") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("channels").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `channels` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("channels").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EventChannelConfigInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'EventChannelConfigInput' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EventChannelConfigInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(EventChannelConfigInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<EventChannelConfigInput>() {
                        @Override
                        public void write(JsonWriter out, EventChannelConfigInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public EventChannelConfigInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of EventChannelConfigInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of EventChannelConfigInput
     * @throws IOException if the JSON string is invalid with respect to EventChannelConfigInput
     */
    public static EventChannelConfigInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, EventChannelConfigInput.class);
    }

    /**
     * Convert an instance of EventChannelConfigInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
