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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** ResponseMessage */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ResponseMessage implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_SESSION_IDENTIFIER = "session_identifier";

    @SerializedName(SERIALIZED_NAME_SESSION_IDENTIFIER)
    @javax.annotation.Nullable
    private String sessionIdentifier;

    public static final String SERIALIZED_NAME_GENERATION_NUMBER = "generation_number";

    @SerializedName(SERIALIZED_NAME_GENERATION_NUMBER)
    @javax.annotation.Nullable
    private Integer generationNumber;

    /** Type of the generated response. */
    @JsonAdapter(MessageTypeEnum.Adapter.class)
    public enum MessageTypeEnum {
        TS_ANSWER("TSAnswer");

        private String value;

        MessageTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static MessageTypeEnum fromValue(String value) {
            for (MessageTypeEnum b : MessageTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<MessageTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final MessageTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MessageTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MessageTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            MessageTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_MESSAGE_TYPE = "message_type";

    @SerializedName(SERIALIZED_NAME_MESSAGE_TYPE)
    @javax.annotation.Nonnull
    private MessageTypeEnum messageType;

    /** Generated visualization type. */
    @JsonAdapter(VisualizationTypeEnum.Adapter.class)
    public enum VisualizationTypeEnum {
        CHART("Chart"),

        TABLE("Table"),

        UNDEFINED("Undefined");

        private String value;

        VisualizationTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static VisualizationTypeEnum fromValue(String value) {
            for (VisualizationTypeEnum b : VisualizationTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<VisualizationTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final VisualizationTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public VisualizationTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return VisualizationTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            VisualizationTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_VISUALIZATION_TYPE = "visualization_type";

    @SerializedName(SERIALIZED_NAME_VISUALIZATION_TYPE)
    @javax.annotation.Nullable
    private VisualizationTypeEnum visualizationType;

    public static final String SERIALIZED_NAME_TOKENS = "tokens";

    @SerializedName(SERIALIZED_NAME_TOKENS)
    @javax.annotation.Nullable
    private String tokens;

    public static final String SERIALIZED_NAME_DISPLAY_TOKENS = "display_tokens";

    @SerializedName(SERIALIZED_NAME_DISPLAY_TOKENS)
    @javax.annotation.Nullable
    private String displayTokens;

    public ResponseMessage() {}

    public ResponseMessage sessionIdentifier(@javax.annotation.Nullable String sessionIdentifier) {
        this.sessionIdentifier = sessionIdentifier;
        return this;
    }

    /**
     * Unique identifier of the generated response.
     *
     * @return sessionIdentifier
     */
    @javax.annotation.Nullable
    public String getSessionIdentifier() {
        return sessionIdentifier;
    }

    public void setSessionIdentifier(@javax.annotation.Nullable String sessionIdentifier) {
        this.sessionIdentifier = sessionIdentifier;
    }

    public ResponseMessage generationNumber(@javax.annotation.Nullable Integer generationNumber) {
        this.generationNumber = generationNumber;
        return this;
    }

    /**
     * Generate number of the response.
     *
     * @return generationNumber
     */
    @javax.annotation.Nullable
    public Integer getGenerationNumber() {
        return generationNumber;
    }

    public void setGenerationNumber(@javax.annotation.Nullable Integer generationNumber) {
        this.generationNumber = generationNumber;
    }

    public ResponseMessage messageType(@javax.annotation.Nonnull MessageTypeEnum messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * Type of the generated response.
     *
     * @return messageType
     */
    @javax.annotation.Nonnull
    public MessageTypeEnum getMessageType() {
        return messageType;
    }

    public void setMessageType(@javax.annotation.Nonnull MessageTypeEnum messageType) {
        this.messageType = messageType;
    }

    public ResponseMessage visualizationType(
            @javax.annotation.Nullable VisualizationTypeEnum visualizationType) {
        this.visualizationType = visualizationType;
        return this;
    }

    /**
     * Generated visualization type.
     *
     * @return visualizationType
     */
    @javax.annotation.Nullable
    public VisualizationTypeEnum getVisualizationType() {
        return visualizationType;
    }

    public void setVisualizationType(
            @javax.annotation.Nullable VisualizationTypeEnum visualizationType) {
        this.visualizationType = visualizationType;
    }

    public ResponseMessage tokens(@javax.annotation.Nullable String tokens) {
        this.tokens = tokens;
        return this;
    }

    /**
     * Tokens for the response.
     *
     * @return tokens
     */
    @javax.annotation.Nullable
    public String getTokens() {
        return tokens;
    }

    public void setTokens(@javax.annotation.Nullable String tokens) {
        this.tokens = tokens;
    }

    public ResponseMessage displayTokens(@javax.annotation.Nullable String displayTokens) {
        this.displayTokens = displayTokens;
        return this;
    }

    /**
     * User friendly tokens for the response.
     *
     * @return displayTokens
     */
    @javax.annotation.Nullable
    public String getDisplayTokens() {
        return displayTokens;
    }

    public void setDisplayTokens(@javax.annotation.Nullable String displayTokens) {
        this.displayTokens = displayTokens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseMessage responseMessage = (ResponseMessage) o;
        return Objects.equals(this.sessionIdentifier, responseMessage.sessionIdentifier)
                && Objects.equals(this.generationNumber, responseMessage.generationNumber)
                && Objects.equals(this.messageType, responseMessage.messageType)
                && Objects.equals(this.visualizationType, responseMessage.visualizationType)
                && Objects.equals(this.tokens, responseMessage.tokens)
                && Objects.equals(this.displayTokens, responseMessage.displayTokens);
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
                sessionIdentifier,
                generationNumber,
                messageType,
                visualizationType,
                tokens,
                displayTokens);
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
        sb.append("class ResponseMessage {\n");
        sb.append("    sessionIdentifier: ")
                .append(toIndentedString(sessionIdentifier))
                .append("\n");
        sb.append("    generationNumber: ").append(toIndentedString(generationNumber)).append("\n");
        sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
        sb.append("    visualizationType: ")
                .append(toIndentedString(visualizationType))
                .append("\n");
        sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
        sb.append("    displayTokens: ").append(toIndentedString(displayTokens)).append("\n");
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
        openapiFields.add("session_identifier");
        openapiFields.add("generation_number");
        openapiFields.add("message_type");
        openapiFields.add("visualization_type");
        openapiFields.add("tokens");
        openapiFields.add("display_tokens");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("message_type");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ResponseMessage
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ResponseMessage.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ResponseMessage is not found in the"
                                        + " empty JSON string",
                                ResponseMessage.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ResponseMessage.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ResponseMessage` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ResponseMessage.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("session_identifier") != null
                        && !jsonObj.get("session_identifier").isJsonNull())
                && !jsonObj.get("session_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `session_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("session_identifier").toString()));
        }
        if (!jsonObj.get("message_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `message_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("message_type").toString()));
        }
        // validate the required field `message_type`
        MessageTypeEnum.validateJsonElement(jsonObj.get("message_type"));
        if ((jsonObj.get("visualization_type") != null
                        && !jsonObj.get("visualization_type").isJsonNull())
                && !jsonObj.get("visualization_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `visualization_type` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("visualization_type").toString()));
        }
        // validate the optional field `visualization_type`
        if (jsonObj.get("visualization_type") != null
                && !jsonObj.get("visualization_type").isJsonNull()) {
            VisualizationTypeEnum.validateJsonElement(jsonObj.get("visualization_type"));
        }
        if ((jsonObj.get("tokens") != null && !jsonObj.get("tokens").isJsonNull())
                && !jsonObj.get("tokens").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `tokens` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("tokens").toString()));
        }
        if ((jsonObj.get("display_tokens") != null && !jsonObj.get("display_tokens").isJsonNull())
                && !jsonObj.get("display_tokens").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `display_tokens` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("display_tokens").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ResponseMessage.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ResponseMessage' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ResponseMessage> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ResponseMessage.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ResponseMessage>() {
                        @Override
                        public void write(JsonWriter out, ResponseMessage value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ResponseMessage read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ResponseMessage given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ResponseMessage
     * @throws IOException if the JSON string is invalid with respect to ResponseMessage
     */
    public static ResponseMessage fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ResponseMessage.class);
    }

    /**
     * Convert an instance of ResponseMessage to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
