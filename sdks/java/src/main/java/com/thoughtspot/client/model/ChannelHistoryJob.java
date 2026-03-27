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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** A single job execution record for a channel. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ChannelHistoryJob implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nonnull
    private String id;

    /** Delivery status of this job. */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        PENDING("PENDING"),

        RETRY("RETRY"),

        SUCCESS("SUCCESS"),

        FAILED("FAILED");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StatusEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            StatusEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    @javax.annotation.Nonnull
    private StatusEnum status;

    public static final String SERIALIZED_NAME_CREATION_TIME_IN_MILLIS = "creation_time_in_millis";

    @SerializedName(SERIALIZED_NAME_CREATION_TIME_IN_MILLIS)
    @javax.annotation.Nonnull
    private Float creationTimeInMillis;

    public static final String SERIALIZED_NAME_EVENT = "event";

    @SerializedName(SERIALIZED_NAME_EVENT)
    @javax.annotation.Nullable
    private ChannelHistoryEventInfo event;

    public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";

    @SerializedName(SERIALIZED_NAME_RECIPIENTS)
    @javax.annotation.Nullable
    private List<JobRecipient> recipients;

    public static final String SERIALIZED_NAME_DETAIL = "detail";

    @SerializedName(SERIALIZED_NAME_DETAIL)
    @javax.annotation.Nullable
    private String detail;

    public static final String SERIALIZED_NAME_TRY_COUNT = "try_count";

    @SerializedName(SERIALIZED_NAME_TRY_COUNT)
    @javax.annotation.Nullable
    private Integer tryCount;

    public ChannelHistoryJob() {}

    public ChannelHistoryJob id(@javax.annotation.Nonnull String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier for this job.
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

    public ChannelHistoryJob status(@javax.annotation.Nonnull StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Delivery status of this job.
     *
     * @return status
     */
    @javax.annotation.Nonnull
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(@javax.annotation.Nonnull StatusEnum status) {
        this.status = status;
    }

    public ChannelHistoryJob creationTimeInMillis(
            @javax.annotation.Nonnull Float creationTimeInMillis) {
        this.creationTimeInMillis = creationTimeInMillis;
        return this;
    }

    /**
     * Timestamp when this job was created (epoch milliseconds).
     *
     * @return creationTimeInMillis
     */
    @javax.annotation.Nonnull
    public Float getCreationTimeInMillis() {
        return creationTimeInMillis;
    }

    public void setCreationTimeInMillis(@javax.annotation.Nonnull Float creationTimeInMillis) {
        this.creationTimeInMillis = creationTimeInMillis;
    }

    public ChannelHistoryJob event(@javax.annotation.Nullable ChannelHistoryEventInfo event) {
        this.event = event;
        return this;
    }

    /**
     * Get event
     *
     * @return event
     */
    @javax.annotation.Nullable
    public ChannelHistoryEventInfo getEvent() {
        return event;
    }

    public void setEvent(@javax.annotation.Nullable ChannelHistoryEventInfo event) {
        this.event = event;
    }

    public ChannelHistoryJob recipients(@javax.annotation.Nullable List<JobRecipient> recipients) {
        this.recipients = recipients;
        return this;
    }

    public ChannelHistoryJob addRecipientsItem(JobRecipient recipientsItem) {
        if (this.recipients == null) {
            this.recipients = new ArrayList<>();
        }
        this.recipients.add(recipientsItem);
        return this;
    }

    /**
     * The users, groups or external recipients for this job.
     *
     * @return recipients
     */
    @javax.annotation.Nullable
    public List<JobRecipient> getRecipients() {
        return recipients;
    }

    public void setRecipients(@javax.annotation.Nullable List<JobRecipient> recipients) {
        this.recipients = recipients;
    }

    public ChannelHistoryJob detail(@javax.annotation.Nullable String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Additional delivery details such as HTTP response code or error message.
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

    public ChannelHistoryJob tryCount(@javax.annotation.Nullable Integer tryCount) {
        this.tryCount = tryCount;
        return this;
    }

    /**
     * Number of attempts made. 1 indicates first attempt.
     *
     * @return tryCount
     */
    @javax.annotation.Nullable
    public Integer getTryCount() {
        return tryCount;
    }

    public void setTryCount(@javax.annotation.Nullable Integer tryCount) {
        this.tryCount = tryCount;
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
     * @return the ChannelHistoryJob instance itself
     */
    public ChannelHistoryJob putAdditionalProperty(String key, Object value) {
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
        ChannelHistoryJob channelHistoryJob = (ChannelHistoryJob) o;
        return Objects.equals(this.id, channelHistoryJob.id)
                && Objects.equals(this.status, channelHistoryJob.status)
                && Objects.equals(this.creationTimeInMillis, channelHistoryJob.creationTimeInMillis)
                && Objects.equals(this.event, channelHistoryJob.event)
                && Objects.equals(this.recipients, channelHistoryJob.recipients)
                && Objects.equals(this.detail, channelHistoryJob.detail)
                && Objects.equals(this.tryCount, channelHistoryJob.tryCount)
                && Objects.equals(
                        this.additionalProperties, channelHistoryJob.additionalProperties);
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
                id,
                status,
                creationTimeInMillis,
                event,
                recipients,
                detail,
                tryCount,
                additionalProperties);
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
        sb.append("class ChannelHistoryJob {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    creationTimeInMillis: ")
                .append(toIndentedString(creationTimeInMillis))
                .append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    tryCount: ").append(toIndentedString(tryCount)).append("\n");
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
        openapiFields.add("id");
        openapiFields.add("status");
        openapiFields.add("creation_time_in_millis");
        openapiFields.add("event");
        openapiFields.add("recipients");
        openapiFields.add("detail");
        openapiFields.add("try_count");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("status");
        openapiRequiredFields.add("creation_time_in_millis");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ChannelHistoryJob
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ChannelHistoryJob.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ChannelHistoryJob is not found in the"
                                        + " empty JSON string",
                                ChannelHistoryJob.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ChannelHistoryJob.openapiRequiredFields) {
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
        // validate the required field `status`
        StatusEnum.validateJsonElement(jsonObj.get("status"));
        // validate the optional field `event`
        if (jsonObj.get("event") != null && !jsonObj.get("event").isJsonNull()) {
            ChannelHistoryEventInfo.validateJsonElement(jsonObj.get("event"));
        }
        if (jsonObj.get("recipients") != null && !jsonObj.get("recipients").isJsonNull()) {
            JsonArray jsonArrayrecipients = jsonObj.getAsJsonArray("recipients");
            if (jsonArrayrecipients != null) {
                // ensure the json data is an array
                if (!jsonObj.get("recipients").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `recipients` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("recipients").toString()));
                }

                // validate the optional field `recipients` (array)
                for (int i = 0; i < jsonArrayrecipients.size(); i++) {
                    JobRecipient.validateJsonElement(jsonArrayrecipients.get(i));
                }
                ;
            }
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
            if (!ChannelHistoryJob.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ChannelHistoryJob' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ChannelHistoryJob> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ChannelHistoryJob.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ChannelHistoryJob>() {
                        @Override
                        public void write(JsonWriter out, ChannelHistoryJob value)
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
                        public ChannelHistoryJob read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            ChannelHistoryJob instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of ChannelHistoryJob given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ChannelHistoryJob
     * @throws IOException if the JSON string is invalid with respect to ChannelHistoryJob
     */
    public static ChannelHistoryJob fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ChannelHistoryJob.class);
    }

    /**
     * Convert an instance of ChannelHistoryJob to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
