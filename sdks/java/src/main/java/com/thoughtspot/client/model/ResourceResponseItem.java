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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * MCP (Model Context Protocol) resource — typically a connector-provided artifact such as a
 * document excerpt.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ResourceResponseItem implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @javax.annotation.Nonnull
    private String type;

    public static final String SERIALIZED_NAME_TIMESTAMP_IN_MILLIS = "timestamp_in_millis";

    @SerializedName(SERIALIZED_NAME_TIMESTAMP_IN_MILLIS)
    @javax.annotation.Nonnull
    private Object timestampInMillis;

    public static final String SERIALIZED_NAME_IS_THINKING = "is_thinking";

    @SerializedName(SERIALIZED_NAME_IS_THINKING)
    @javax.annotation.Nullable
    private Boolean isThinking;

    public static final String SERIALIZED_NAME_STEP_TITLE = "step_title";

    @SerializedName(SERIALIZED_NAME_STEP_TITLE)
    @javax.annotation.Nullable
    private String stepTitle;

    public static final String SERIALIZED_NAME_TITLE = "title";

    @SerializedName(SERIALIZED_NAME_TITLE)
    @javax.annotation.Nonnull
    private String title;

    public static final String SERIALIZED_NAME_URI = "uri";

    @SerializedName(SERIALIZED_NAME_URI)
    @javax.annotation.Nonnull
    private String uri;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nullable
    private String name;

    public static final String SERIALIZED_NAME_MIME_TYPE = "mime_type";

    @SerializedName(SERIALIZED_NAME_MIME_TYPE)
    @javax.annotation.Nullable
    private String mimeType;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nullable
    private String description;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    @javax.annotation.Nullable
    private Integer size;

    public static final String SERIALIZED_NAME_CONNECTOR_ID = "connector_id";

    @SerializedName(SERIALIZED_NAME_CONNECTOR_ID)
    @javax.annotation.Nullable
    private String connectorId;

    public static final String SERIALIZED_NAME_CONNECTOR_NAME = "connector_name";

    @SerializedName(SERIALIZED_NAME_CONNECTOR_NAME)
    @javax.annotation.Nullable
    private String connectorName;

    public static final String SERIALIZED_NAME_CONNECTOR_SLUG = "connector_slug";

    @SerializedName(SERIALIZED_NAME_CONNECTOR_SLUG)
    @javax.annotation.Nullable
    private String connectorSlug;

    /**
     * Underlying transport protocol used by the MCP connector. See &#x60;TransportType&#x60; for
     * accepted values.
     */
    @JsonAdapter(TransportTypeEnum.Adapter.class)
    public enum TransportTypeEnum {
        STREAMABLE_HTTP("STREAMABLE_HTTP"),

        SSE("SSE");

        private String value;

        TransportTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TransportTypeEnum fromValue(String value) {
            for (TransportTypeEnum b : TransportTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<TransportTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TransportTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TransportTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TransportTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            TransportTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_TRANSPORT_TYPE = "transport_type";

    @SerializedName(SERIALIZED_NAME_TRANSPORT_TYPE)
    @javax.annotation.Nullable
    private TransportTypeEnum transportType;

    public ResourceResponseItem() {}

    public ResourceResponseItem type(@javax.annotation.Nonnull String type) {
        this.type = type;
        return this;
    }

    /**
     * Variant discriminator. Always &#x60;\&quot;resource\&quot;&#x60;.
     *
     * @return type
     */
    @javax.annotation.Nonnull
    public String getType() {
        return type;
    }

    public void setType(@javax.annotation.Nonnull String type) {
        this.type = type;
    }

    public ResourceResponseItem timestampInMillis(
            @javax.annotation.Nonnull Object timestampInMillis) {
        this.timestampInMillis = timestampInMillis;
        return this;
    }

    /**
     * Milliseconds since Unix epoch when this item was produced.
     *
     * @return timestampInMillis
     */
    @javax.annotation.Nonnull
    public Object getTimestampInMillis() {
        return timestampInMillis;
    }

    public void setTimestampInMillis(@javax.annotation.Nonnull Object timestampInMillis) {
        this.timestampInMillis = timestampInMillis;
    }

    public ResourceResponseItem isThinking(@javax.annotation.Nullable Boolean isThinking) {
        this.isThinking = isThinking;
        return this;
    }

    /**
     * True when the item represents internal agent reasoning rather than user-facing output.
     *
     * @return isThinking
     */
    @javax.annotation.Nullable
    public Boolean getIsThinking() {
        return isThinking;
    }

    public void setIsThinking(@javax.annotation.Nullable Boolean isThinking) {
        this.isThinking = isThinking;
    }

    public ResourceResponseItem stepTitle(@javax.annotation.Nullable String stepTitle) {
        this.stepTitle = stepTitle;
        return this;
    }

    /**
     * Human-readable label for the agent step producing this item.
     *
     * @return stepTitle
     */
    @javax.annotation.Nullable
    public String getStepTitle() {
        return stepTitle;
    }

    public void setStepTitle(@javax.annotation.Nullable String stepTitle) {
        this.stepTitle = stepTitle;
    }

    public ResourceResponseItem title(@javax.annotation.Nonnull String title) {
        this.title = title;
        return this;
    }

    /**
     * Human-readable title of the resource.
     *
     * @return title
     */
    @javax.annotation.Nonnull
    public String getTitle() {
        return title;
    }

    public void setTitle(@javax.annotation.Nonnull String title) {
        this.title = title;
    }

    public ResourceResponseItem uri(@javax.annotation.Nonnull String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Resource URI.
     *
     * @return uri
     */
    @javax.annotation.Nonnull
    public String getUri() {
        return uri;
    }

    public void setUri(@javax.annotation.Nonnull String uri) {
        this.uri = uri;
    }

    public ResourceResponseItem name(@javax.annotation.Nullable String name) {
        this.name = name;
        return this;
    }

    /**
     * Original name or filename.
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

    public ResourceResponseItem mimeType(@javax.annotation.Nullable String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    /**
     * MIME type.
     *
     * @return mimeType
     */
    @javax.annotation.Nullable
    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(@javax.annotation.Nullable String mimeType) {
        this.mimeType = mimeType;
    }

    public ResourceResponseItem description(@javax.annotation.Nullable String description) {
        this.description = description;
        return this;
    }

    /**
     * Short description.
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

    public ResourceResponseItem size(@javax.annotation.Nullable Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Size in bytes.
     *
     * @return size
     */
    @javax.annotation.Nullable
    public Integer getSize() {
        return size;
    }

    public void setSize(@javax.annotation.Nullable Integer size) {
        this.size = size;
    }

    public ResourceResponseItem connectorId(@javax.annotation.Nullable String connectorId) {
        this.connectorId = connectorId;
        return this;
    }

    /**
     * Connector instance identifier.
     *
     * @return connectorId
     */
    @javax.annotation.Nullable
    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(@javax.annotation.Nullable String connectorId) {
        this.connectorId = connectorId;
    }

    public ResourceResponseItem connectorName(@javax.annotation.Nullable String connectorName) {
        this.connectorName = connectorName;
        return this;
    }

    /**
     * Human-readable connector name.
     *
     * @return connectorName
     */
    @javax.annotation.Nullable
    public String getConnectorName() {
        return connectorName;
    }

    public void setConnectorName(@javax.annotation.Nullable String connectorName) {
        this.connectorName = connectorName;
    }

    public ResourceResponseItem connectorSlug(@javax.annotation.Nullable String connectorSlug) {
        this.connectorSlug = connectorSlug;
        return this;
    }

    /**
     * Connector slug or type key.
     *
     * @return connectorSlug
     */
    @javax.annotation.Nullable
    public String getConnectorSlug() {
        return connectorSlug;
    }

    public void setConnectorSlug(@javax.annotation.Nullable String connectorSlug) {
        this.connectorSlug = connectorSlug;
    }

    public ResourceResponseItem transportType(
            @javax.annotation.Nullable TransportTypeEnum transportType) {
        this.transportType = transportType;
        return this;
    }

    /**
     * Underlying transport protocol used by the MCP connector. See &#x60;TransportType&#x60; for
     * accepted values.
     *
     * @return transportType
     */
    @javax.annotation.Nullable
    public TransportTypeEnum getTransportType() {
        return transportType;
    }

    public void setTransportType(@javax.annotation.Nullable TransportTypeEnum transportType) {
        this.transportType = transportType;
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
     * @return the ResourceResponseItem instance itself
     */
    public ResourceResponseItem putAdditionalProperty(String key, Object value) {
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
        ResourceResponseItem resourceResponseItem = (ResourceResponseItem) o;
        return Objects.equals(this.type, resourceResponseItem.type)
                && Objects.equals(this.timestampInMillis, resourceResponseItem.timestampInMillis)
                && Objects.equals(this.isThinking, resourceResponseItem.isThinking)
                && Objects.equals(this.stepTitle, resourceResponseItem.stepTitle)
                && Objects.equals(this.title, resourceResponseItem.title)
                && Objects.equals(this.uri, resourceResponseItem.uri)
                && Objects.equals(this.name, resourceResponseItem.name)
                && Objects.equals(this.mimeType, resourceResponseItem.mimeType)
                && Objects.equals(this.description, resourceResponseItem.description)
                && Objects.equals(this.size, resourceResponseItem.size)
                && Objects.equals(this.connectorId, resourceResponseItem.connectorId)
                && Objects.equals(this.connectorName, resourceResponseItem.connectorName)
                && Objects.equals(this.connectorSlug, resourceResponseItem.connectorSlug)
                && Objects.equals(this.transportType, resourceResponseItem.transportType)
                && Objects.equals(
                        this.additionalProperties, resourceResponseItem.additionalProperties);
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
                type,
                timestampInMillis,
                isThinking,
                stepTitle,
                title,
                uri,
                name,
                mimeType,
                description,
                size,
                connectorId,
                connectorName,
                connectorSlug,
                transportType,
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
        sb.append("class ResourceResponseItem {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    timestampInMillis: ")
                .append(toIndentedString(timestampInMillis))
                .append("\n");
        sb.append("    isThinking: ").append(toIndentedString(isThinking)).append("\n");
        sb.append("    stepTitle: ").append(toIndentedString(stepTitle)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
        sb.append("    connectorName: ").append(toIndentedString(connectorName)).append("\n");
        sb.append("    connectorSlug: ").append(toIndentedString(connectorSlug)).append("\n");
        sb.append("    transportType: ").append(toIndentedString(transportType)).append("\n");
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
        openapiFields.add("type");
        openapiFields.add("timestamp_in_millis");
        openapiFields.add("is_thinking");
        openapiFields.add("step_title");
        openapiFields.add("title");
        openapiFields.add("uri");
        openapiFields.add("name");
        openapiFields.add("mime_type");
        openapiFields.add("description");
        openapiFields.add("size");
        openapiFields.add("connector_id");
        openapiFields.add("connector_name");
        openapiFields.add("connector_slug");
        openapiFields.add("transport_type");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("type");
        openapiRequiredFields.add("timestamp_in_millis");
        openapiRequiredFields.add("title");
        openapiRequiredFields.add("uri");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ResourceResponseItem
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ResourceResponseItem.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ResourceResponseItem is not found in"
                                        + " the empty JSON string",
                                ResourceResponseItem.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ResourceResponseItem.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
        if ((jsonObj.get("step_title") != null && !jsonObj.get("step_title").isJsonNull())
                && !jsonObj.get("step_title").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `step_title` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("step_title").toString()));
        }
        if (!jsonObj.get("title").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `title` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("title").toString()));
        }
        if (!jsonObj.get("uri").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `uri` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("uri").toString()));
        }
        if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
                && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if ((jsonObj.get("mime_type") != null && !jsonObj.get("mime_type").isJsonNull())
                && !jsonObj.get("mime_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `mime_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("mime_type").toString()));
        }
        if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
                && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("description").toString()));
        }
        if ((jsonObj.get("connector_id") != null && !jsonObj.get("connector_id").isJsonNull())
                && !jsonObj.get("connector_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `connector_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("connector_id").toString()));
        }
        if ((jsonObj.get("connector_name") != null && !jsonObj.get("connector_name").isJsonNull())
                && !jsonObj.get("connector_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `connector_name` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("connector_name").toString()));
        }
        if ((jsonObj.get("connector_slug") != null && !jsonObj.get("connector_slug").isJsonNull())
                && !jsonObj.get("connector_slug").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `connector_slug` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("connector_slug").toString()));
        }
        if ((jsonObj.get("transport_type") != null && !jsonObj.get("transport_type").isJsonNull())
                && !jsonObj.get("transport_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `transport_type` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("transport_type").toString()));
        }
        // validate the optional field `transport_type`
        if (jsonObj.get("transport_type") != null && !jsonObj.get("transport_type").isJsonNull()) {
            TransportTypeEnum.validateJsonElement(jsonObj.get("transport_type"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ResourceResponseItem.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ResourceResponseItem' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ResourceResponseItem> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ResourceResponseItem.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ResourceResponseItem>() {
                        @Override
                        public void write(JsonWriter out, ResourceResponseItem value)
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
                        public ResourceResponseItem read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            ResourceResponseItem instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of ResourceResponseItem given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ResourceResponseItem
     * @throws IOException if the JSON string is invalid with respect to ResourceResponseItem
     */
    public static ResourceResponseItem fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ResourceResponseItem.class);
    }

    /**
     * Convert an instance of ResourceResponseItem to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
