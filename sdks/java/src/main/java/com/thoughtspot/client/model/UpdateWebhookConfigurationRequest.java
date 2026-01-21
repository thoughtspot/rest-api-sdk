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

/** UpdateWebhookConfigurationRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UpdateWebhookConfigurationRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nullable
    private String name;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nullable
    private String description;

    public static final String SERIALIZED_NAME_URL = "url";

    @SerializedName(SERIALIZED_NAME_URL)
    @javax.annotation.Nullable
    private String url;

    public static final String SERIALIZED_NAME_URL_PARAMS = "url_params";

    @SerializedName(SERIALIZED_NAME_URL_PARAMS)
    @javax.annotation.Nullable
    private Object urlParams;

    /** Gets or Sets events */
    @JsonAdapter(EventsEnum.Adapter.class)
    public enum EventsEnum {
        LIVEBOARD_SCHEDULE("LIVEBOARD_SCHEDULE");

        private String value;

        EventsEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static EventsEnum fromValue(String value) {
            for (EventsEnum b : EventsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<EventsEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final EventsEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public EventsEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return EventsEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            EventsEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_EVENTS = "events";

    @SerializedName(SERIALIZED_NAME_EVENTS)
    @javax.annotation.Nullable
    private List<EventsEnum> events;

    public static final String SERIALIZED_NAME_AUTHENTICATION = "authentication";

    @SerializedName(SERIALIZED_NAME_AUTHENTICATION)
    @javax.annotation.Nullable
    private WebhookAuthenticationInput authentication;

    public static final String SERIALIZED_NAME_SIGNATURE_VERIFICATION = "signature_verification";

    @SerializedName(SERIALIZED_NAME_SIGNATURE_VERIFICATION)
    @javax.annotation.Nullable
    private WebhookSignatureVerificationInput signatureVerification;

    public static final String SERIALIZED_NAME_STORAGE_DESTINATION = "storage_destination";

    @SerializedName(SERIALIZED_NAME_STORAGE_DESTINATION)
    @javax.annotation.Nullable
    private StorageDestinationInput storageDestination;

    public UpdateWebhookConfigurationRequest() {}

    public UpdateWebhookConfigurationRequest name(@javax.annotation.Nullable String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the webhook configuration.
     *
     * @return name
     */
    @javax.annotation.Nullable
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nullable String name) {
        this.name = name;
    }

    public UpdateWebhookConfigurationRequest description(
            @javax.annotation.Nullable String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the webhook configuration.
     *
     * @return description
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@javax.annotation.Nullable String description) {
        this.description = description;
    }

    public UpdateWebhookConfigurationRequest url(@javax.annotation.Nullable String url) {
        this.url = url;
        return this;
    }

    /**
     * The webhook endpoint URL.
     *
     * @return url
     */
    @javax.annotation.Nullable
    public String getUrl() {
        return url;
    }

    public void setUrl(@javax.annotation.Nullable String url) {
        this.url = url;
    }

    public UpdateWebhookConfigurationRequest urlParams(
            @javax.annotation.Nullable Object urlParams) {
        this.urlParams = urlParams;
        return this;
    }

    /**
     * Additional URL parameters as key-value pairs.
     *
     * @return urlParams
     */
    @javax.annotation.Nullable
    public Object getUrlParams() {
        return urlParams;
    }

    public void setUrlParams(@javax.annotation.Nullable Object urlParams) {
        this.urlParams = urlParams;
    }

    public UpdateWebhookConfigurationRequest events(
            @javax.annotation.Nullable List<EventsEnum> events) {
        this.events = events;
        return this;
    }

    public UpdateWebhookConfigurationRequest addEventsItem(EventsEnum eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
     * List of events to subscribe to.
     *
     * @return events
     */
    @javax.annotation.Nullable
    public List<EventsEnum> getEvents() {
        return events;
    }

    public void setEvents(@javax.annotation.Nullable List<EventsEnum> events) {
        this.events = events;
    }

    public UpdateWebhookConfigurationRequest authentication(
            @javax.annotation.Nullable WebhookAuthenticationInput authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Authorization configuration for the webhook.
     *
     * @return authentication
     */
    @javax.annotation.Nullable
    public WebhookAuthenticationInput getAuthentication() {
        return authentication;
    }

    public void setAuthentication(
            @javax.annotation.Nullable WebhookAuthenticationInput authentication) {
        this.authentication = authentication;
    }

    public UpdateWebhookConfigurationRequest signatureVerification(
            @javax.annotation.Nullable WebhookSignatureVerificationInput signatureVerification) {
        this.signatureVerification = signatureVerification;
        return this;
    }

    /**
     * Configuration for webhook signature verification.
     *
     * @return signatureVerification
     */
    @javax.annotation.Nullable
    public WebhookSignatureVerificationInput getSignatureVerification() {
        return signatureVerification;
    }

    public void setSignatureVerification(
            @javax.annotation.Nullable WebhookSignatureVerificationInput signatureVerification) {
        this.signatureVerification = signatureVerification;
    }

    public UpdateWebhookConfigurationRequest storageDestination(
            @javax.annotation.Nullable StorageDestinationInput storageDestination) {
        this.storageDestination = storageDestination;
        return this;
    }

    /**
     * Configuration for storage destination. Example: {\&quot;storage_type\&quot;:
     * \&quot;AWS_S3\&quot;, \&quot;storage_config\&quot;: {\&quot;aws_s3_config\&quot;:
     * {\&quot;bucket_name\&quot;: \&quot;my-webhook-files\&quot;, \&quot;region\&quot;:
     * \&quot;us-west-2\&quot;, \&quot;role_arn\&quot;:
     * \&quot;arn:aws:iam::123456789012:role/ThoughtSpotDeliveryRole\&quot;,
     * \&quot;external_id\&quot;: \&quot;ts-webhook-a1b2c3d4-7890\&quot;, \&quot;path_prefix\&quot;:
     * \&quot;thoughtspot-webhooks/\&quot;}}} Version: 26.3.0.cl or later
     *
     * @return storageDestination
     */
    @javax.annotation.Nullable
    public StorageDestinationInput getStorageDestination() {
        return storageDestination;
    }

    public void setStorageDestination(
            @javax.annotation.Nullable StorageDestinationInput storageDestination) {
        this.storageDestination = storageDestination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateWebhookConfigurationRequest updateWebhookConfigurationRequest =
                (UpdateWebhookConfigurationRequest) o;
        return Objects.equals(this.name, updateWebhookConfigurationRequest.name)
                && Objects.equals(this.description, updateWebhookConfigurationRequest.description)
                && Objects.equals(this.url, updateWebhookConfigurationRequest.url)
                && Objects.equals(this.urlParams, updateWebhookConfigurationRequest.urlParams)
                && Objects.equals(this.events, updateWebhookConfigurationRequest.events)
                && Objects.equals(
                        this.authentication, updateWebhookConfigurationRequest.authentication)
                && Objects.equals(
                        this.signatureVerification,
                        updateWebhookConfigurationRequest.signatureVerification)
                && Objects.equals(
                        this.storageDestination,
                        updateWebhookConfigurationRequest.storageDestination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                description,
                url,
                urlParams,
                events,
                authentication,
                signatureVerification,
                storageDestination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWebhookConfigurationRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    urlParams: ").append(toIndentedString(urlParams)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
        sb.append("    signatureVerification: ")
                .append(toIndentedString(signatureVerification))
                .append("\n");
        sb.append("    storageDestination: ")
                .append(toIndentedString(storageDestination))
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
        openapiFields.add("name");
        openapiFields.add("description");
        openapiFields.add("url");
        openapiFields.add("url_params");
        openapiFields.add("events");
        openapiFields.add("authentication");
        openapiFields.add("signature_verification");
        openapiFields.add("storage_destination");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     UpdateWebhookConfigurationRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UpdateWebhookConfigurationRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateWebhookConfigurationRequest is"
                                        + " not found in the empty JSON string",
                                UpdateWebhookConfigurationRequest.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!UpdateWebhookConfigurationRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `UpdateWebhookConfigurationRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
                && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
                && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("description").toString()));
        }
        if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull())
                && !jsonObj.get("url").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `url` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("url").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("events") != null
                && !jsonObj.get("events").isJsonNull()
                && !jsonObj.get("events").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `events` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("events").toString()));
        }
        // validate the optional field `authentication`
        if (jsonObj.get("authentication") != null && !jsonObj.get("authentication").isJsonNull()) {
            WebhookAuthenticationInput.validateJsonElement(jsonObj.get("authentication"));
        }
        // validate the optional field `signature_verification`
        if (jsonObj.get("signature_verification") != null
                && !jsonObj.get("signature_verification").isJsonNull()) {
            WebhookSignatureVerificationInput.validateJsonElement(
                    jsonObj.get("signature_verification"));
        }
        // validate the optional field `storage_destination`
        if (jsonObj.get("storage_destination") != null
                && !jsonObj.get("storage_destination").isJsonNull()) {
            StorageDestinationInput.validateJsonElement(jsonObj.get("storage_destination"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateWebhookConfigurationRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateWebhookConfigurationRequest' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateWebhookConfigurationRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(UpdateWebhookConfigurationRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateWebhookConfigurationRequest>() {
                        @Override
                        public void write(JsonWriter out, UpdateWebhookConfigurationRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateWebhookConfigurationRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateWebhookConfigurationRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateWebhookConfigurationRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     UpdateWebhookConfigurationRequest
     */
    public static UpdateWebhookConfigurationRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateWebhookConfigurationRequest.class);
    }

    /**
     * Convert an instance of UpdateWebhookConfigurationRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
