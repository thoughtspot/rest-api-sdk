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

/** SearchWebhookConfigurationsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SearchWebhookConfigurationsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ORG_IDENTIFIER = "org_identifier";

    @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIER)
    @javax.annotation.Nullable
    private String orgIdentifier;

    public static final String SERIALIZED_NAME_WEBHOOK_IDENTIFIER = "webhook_identifier";

    @SerializedName(SERIALIZED_NAME_WEBHOOK_IDENTIFIER)
    @javax.annotation.Nullable
    private String webhookIdentifier;

    /** Type of webhook event to filter by. */
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
    @javax.annotation.Nullable
    private EventTypeEnum eventType;

    public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";

    @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
    @javax.annotation.Nullable
    private Integer recordOffset = 0;

    public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";

    @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
    @javax.annotation.Nullable
    private Integer recordSize = 50;

    public static final String SERIALIZED_NAME_SORT_OPTIONS = "sort_options";

    @SerializedName(SERIALIZED_NAME_SORT_OPTIONS)
    @javax.annotation.Nullable
    private WebhookSortOptionsInput sortOptions;

    public SearchWebhookConfigurationsRequest() {}

    public SearchWebhookConfigurationsRequest orgIdentifier(
            @javax.annotation.Nullable String orgIdentifier) {
        this.orgIdentifier = orgIdentifier;
        return this;
    }

    /**
     * Unique ID or name of the org.
     *
     * @return orgIdentifier
     */
    @javax.annotation.Nullable
    public String getOrgIdentifier() {
        return orgIdentifier;
    }

    public void setOrgIdentifier(@javax.annotation.Nullable String orgIdentifier) {
        this.orgIdentifier = orgIdentifier;
    }

    public SearchWebhookConfigurationsRequest webhookIdentifier(
            @javax.annotation.Nullable String webhookIdentifier) {
        this.webhookIdentifier = webhookIdentifier;
        return this;
    }

    /**
     * Unique ID or name of the webhook.
     *
     * @return webhookIdentifier
     */
    @javax.annotation.Nullable
    public String getWebhookIdentifier() {
        return webhookIdentifier;
    }

    public void setWebhookIdentifier(@javax.annotation.Nullable String webhookIdentifier) {
        this.webhookIdentifier = webhookIdentifier;
    }

    public SearchWebhookConfigurationsRequest eventType(
            @javax.annotation.Nullable EventTypeEnum eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Type of webhook event to filter by.
     *
     * @return eventType
     */
    @javax.annotation.Nullable
    public EventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(@javax.annotation.Nullable EventTypeEnum eventType) {
        this.eventType = eventType;
    }

    public SearchWebhookConfigurationsRequest recordOffset(
            @javax.annotation.Nullable Integer recordOffset) {
        this.recordOffset = recordOffset;
        return this;
    }

    /**
     * The offset point, starting from where the webhooks should be included in the response.
     *
     * @return recordOffset
     */
    @javax.annotation.Nullable
    public Integer getRecordOffset() {
        return recordOffset;
    }

    public void setRecordOffset(@javax.annotation.Nullable Integer recordOffset) {
        this.recordOffset = recordOffset;
    }

    public SearchWebhookConfigurationsRequest recordSize(
            @javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
        return this;
    }

    /**
     * The number of webhooks that should be included in the response starting from offset position.
     *
     * @return recordSize
     */
    @javax.annotation.Nullable
    public Integer getRecordSize() {
        return recordSize;
    }

    public void setRecordSize(@javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
    }

    public SearchWebhookConfigurationsRequest sortOptions(
            @javax.annotation.Nullable WebhookSortOptionsInput sortOptions) {
        this.sortOptions = sortOptions;
        return this;
    }

    /**
     * Sort option includes sort field and sort order.
     *
     * @return sortOptions
     */
    @javax.annotation.Nullable
    public WebhookSortOptionsInput getSortOptions() {
        return sortOptions;
    }

    public void setSortOptions(@javax.annotation.Nullable WebhookSortOptionsInput sortOptions) {
        this.sortOptions = sortOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchWebhookConfigurationsRequest searchWebhookConfigurationsRequest =
                (SearchWebhookConfigurationsRequest) o;
        return Objects.equals(this.orgIdentifier, searchWebhookConfigurationsRequest.orgIdentifier)
                && Objects.equals(
                        this.webhookIdentifier,
                        searchWebhookConfigurationsRequest.webhookIdentifier)
                && Objects.equals(this.eventType, searchWebhookConfigurationsRequest.eventType)
                && Objects.equals(
                        this.recordOffset, searchWebhookConfigurationsRequest.recordOffset)
                && Objects.equals(this.recordSize, searchWebhookConfigurationsRequest.recordSize)
                && Objects.equals(this.sortOptions, searchWebhookConfigurationsRequest.sortOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                orgIdentifier, webhookIdentifier, eventType, recordOffset, recordSize, sortOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchWebhookConfigurationsRequest {\n");
        sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
        sb.append("    webhookIdentifier: ")
                .append(toIndentedString(webhookIdentifier))
                .append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
        sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
        sb.append("    sortOptions: ").append(toIndentedString(sortOptions)).append("\n");
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
        openapiFields.add("org_identifier");
        openapiFields.add("webhook_identifier");
        openapiFields.add("event_type");
        openapiFields.add("record_offset");
        openapiFields.add("record_size");
        openapiFields.add("sort_options");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     SearchWebhookConfigurationsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SearchWebhookConfigurationsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SearchWebhookConfigurationsRequest is"
                                        + " not found in the empty JSON string",
                                SearchWebhookConfigurationsRequest.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SearchWebhookConfigurationsRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `SearchWebhookConfigurationsRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("org_identifier") != null && !jsonObj.get("org_identifier").isJsonNull())
                && !jsonObj.get("org_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `org_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("org_identifier").toString()));
        }
        if ((jsonObj.get("webhook_identifier") != null
                        && !jsonObj.get("webhook_identifier").isJsonNull())
                && !jsonObj.get("webhook_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `webhook_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("webhook_identifier").toString()));
        }
        if ((jsonObj.get("event_type") != null && !jsonObj.get("event_type").isJsonNull())
                && !jsonObj.get("event_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `event_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("event_type").toString()));
        }
        // validate the optional field `event_type`
        if (jsonObj.get("event_type") != null && !jsonObj.get("event_type").isJsonNull()) {
            EventTypeEnum.validateJsonElement(jsonObj.get("event_type"));
        }
        // validate the optional field `sort_options`
        if (jsonObj.get("sort_options") != null && !jsonObj.get("sort_options").isJsonNull()) {
            WebhookSortOptionsInput.validateJsonElement(jsonObj.get("sort_options"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SearchWebhookConfigurationsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SearchWebhookConfigurationsRequest' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SearchWebhookConfigurationsRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(SearchWebhookConfigurationsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SearchWebhookConfigurationsRequest>() {
                        @Override
                        public void write(JsonWriter out, SearchWebhookConfigurationsRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SearchWebhookConfigurationsRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SearchWebhookConfigurationsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SearchWebhookConfigurationsRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     SearchWebhookConfigurationsRequest
     */
    public static SearchWebhookConfigurationsRequest fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, SearchWebhookConfigurationsRequest.class);
    }

    /**
     * Convert an instance of SearchWebhookConfigurationsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
