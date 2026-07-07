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

/** Agent text output. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class TextResponseItem implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @javax.annotation.Nonnull
    private String type;

    public static final String SERIALIZED_NAME_TIMESTAMP_IN_MILLIS = "timestamp_in_millis";

    @SerializedName(SERIALIZED_NAME_TIMESTAMP_IN_MILLIS)
    @javax.annotation.Nullable
    private Object timestampInMillis = null;

    public static final String SERIALIZED_NAME_IS_THINKING = "is_thinking";

    @SerializedName(SERIALIZED_NAME_IS_THINKING)
    @javax.annotation.Nullable
    private Boolean isThinking;

    public static final String SERIALIZED_NAME_STEP_TITLE = "step_title";

    @SerializedName(SERIALIZED_NAME_STEP_TITLE)
    @javax.annotation.Nullable
    private String stepTitle;

    public static final String SERIALIZED_NAME_CONTENT = "content";

    @SerializedName(SERIALIZED_NAME_CONTENT)
    @javax.annotation.Nonnull
    private String content;

    /** Rendering hint for the text content. See &#x60;ContentMimeType&#x60; for accepted values. */
    @JsonAdapter(ContentTypeEnum.Adapter.class)
    public enum ContentTypeEnum {
        TEXT_PLAIN("TEXT_PLAIN"),

        TEXT_MARKDOWN("TEXT_MARKDOWN"),

        TEXT_X_MARKDOWN_WITH_CODE("TEXT_X_MARKDOWN_WITH_CODE"),

        TEXT_HTML("TEXT_HTML");

        private String value;

        ContentTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ContentTypeEnum fromValue(String value) {
            for (ContentTypeEnum b : ContentTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ContentTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ContentTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ContentTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ContentTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ContentTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";

    @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
    @javax.annotation.Nullable
    private ContentTypeEnum contentType;

    public static final String SERIALIZED_NAME_FILE_REFERENCE = "file_reference";

    @SerializedName(SERIALIZED_NAME_FILE_REFERENCE)
    @javax.annotation.Nullable
    private FileReference fileReference;

    public TextResponseItem() {}

    public TextResponseItem type(@javax.annotation.Nonnull String type) {
        this.type = type;
        return this;
    }

    /**
     * Variant discriminator. Always &#x60;\&quot;text\&quot;&#x60;.
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

    public TextResponseItem timestampInMillis(@javax.annotation.Nullable Object timestampInMillis) {
        this.timestampInMillis = timestampInMillis;
        return this;
    }

    /**
     * Milliseconds since Unix epoch when this item was produced.
     *
     * @return timestampInMillis
     */
    @javax.annotation.Nullable
    public Object getTimestampInMillis() {
        return timestampInMillis;
    }

    public void setTimestampInMillis(@javax.annotation.Nullable Object timestampInMillis) {
        this.timestampInMillis = timestampInMillis;
    }

    public TextResponseItem isThinking(@javax.annotation.Nullable Boolean isThinking) {
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

    public TextResponseItem stepTitle(@javax.annotation.Nullable String stepTitle) {
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

    public TextResponseItem content(@javax.annotation.Nonnull String content) {
        this.content = content;
        return this;
    }

    /**
     * The text body.
     *
     * @return content
     */
    @javax.annotation.Nonnull
    public String getContent() {
        return content;
    }

    public void setContent(@javax.annotation.Nonnull String content) {
        this.content = content;
    }

    public TextResponseItem contentType(@javax.annotation.Nullable ContentTypeEnum contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Rendering hint for the text content. See &#x60;ContentMimeType&#x60; for accepted values.
     *
     * @return contentType
     */
    @javax.annotation.Nullable
    public ContentTypeEnum getContentType() {
        return contentType;
    }

    public void setContentType(@javax.annotation.Nullable ContentTypeEnum contentType) {
        this.contentType = contentType;
    }

    public TextResponseItem fileReference(@javax.annotation.Nullable FileReference fileReference) {
        this.fileReference = fileReference;
        return this;
    }

    /**
     * Get fileReference
     *
     * @return fileReference
     */
    @javax.annotation.Nullable
    public FileReference getFileReference() {
        return fileReference;
    }

    public void setFileReference(@javax.annotation.Nullable FileReference fileReference) {
        this.fileReference = fileReference;
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
     * @return the TextResponseItem instance itself
     */
    public TextResponseItem putAdditionalProperty(String key, Object value) {
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
        TextResponseItem textResponseItem = (TextResponseItem) o;
        return Objects.equals(this.type, textResponseItem.type)
                && Objects.equals(this.timestampInMillis, textResponseItem.timestampInMillis)
                && Objects.equals(this.isThinking, textResponseItem.isThinking)
                && Objects.equals(this.stepTitle, textResponseItem.stepTitle)
                && Objects.equals(this.content, textResponseItem.content)
                && Objects.equals(this.contentType, textResponseItem.contentType)
                && Objects.equals(this.fileReference, textResponseItem.fileReference)
                && Objects.equals(this.additionalProperties, textResponseItem.additionalProperties);
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
                content,
                contentType,
                fileReference,
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
        sb.append("class TextResponseItem {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    timestampInMillis: ")
                .append(toIndentedString(timestampInMillis))
                .append("\n");
        sb.append("    isThinking: ").append(toIndentedString(isThinking)).append("\n");
        sb.append("    stepTitle: ").append(toIndentedString(stepTitle)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    fileReference: ").append(toIndentedString(fileReference)).append("\n");
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
        openapiFields.add("content");
        openapiFields.add("content_type");
        openapiFields.add("file_reference");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("type");
        openapiRequiredFields.add("timestamp_in_millis");
        openapiRequiredFields.add("content");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to TextResponseItem
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!TextResponseItem.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in TextResponseItem is not found in the"
                                        + " empty JSON string",
                                TextResponseItem.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : TextResponseItem.openapiRequiredFields) {
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
        if (!jsonObj.get("content").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `content` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("content").toString()));
        }
        if ((jsonObj.get("content_type") != null && !jsonObj.get("content_type").isJsonNull())
                && !jsonObj.get("content_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `content_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("content_type").toString()));
        }
        // validate the optional field `content_type`
        if (jsonObj.get("content_type") != null && !jsonObj.get("content_type").isJsonNull()) {
            ContentTypeEnum.validateJsonElement(jsonObj.get("content_type"));
        }
        // validate the optional field `file_reference`
        if (jsonObj.get("file_reference") != null && !jsonObj.get("file_reference").isJsonNull()) {
            FileReference.validateJsonElement(jsonObj.get("file_reference"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TextResponseItem.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TextResponseItem' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TextResponseItem> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(TextResponseItem.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<TextResponseItem>() {
                        @Override
                        public void write(JsonWriter out, TextResponseItem value)
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
                        public TextResponseItem read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            TextResponseItem instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of TextResponseItem given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of TextResponseItem
     * @throws IOException if the JSON string is invalid with respect to TextResponseItem
     */
    public static TextResponseItem fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, TextResponseItem.class);
    }

    /**
     * Convert an instance of TextResponseItem to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
