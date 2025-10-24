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

/** WebhookSignatureVerificationInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class WebhookSignatureVerificationInput implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Signature verification method type. */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        HMAC_SHA256("HMAC_SHA256");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<TypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            TypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @javax.annotation.Nonnull
    private TypeEnum type;

    public static final String SERIALIZED_NAME_HEADER = "header";

    @SerializedName(SERIALIZED_NAME_HEADER)
    @javax.annotation.Nonnull
    private String header;

    /** Hash algorithm used for signature verification. */
    @JsonAdapter(AlgorithmEnum.Adapter.class)
    public enum AlgorithmEnum {
        SHA256("SHA256");

        private String value;

        AlgorithmEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static AlgorithmEnum fromValue(String value) {
            for (AlgorithmEnum b : AlgorithmEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<AlgorithmEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final AlgorithmEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AlgorithmEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return AlgorithmEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            AlgorithmEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_ALGORITHM = "algorithm";

    @SerializedName(SERIALIZED_NAME_ALGORITHM)
    @javax.annotation.Nonnull
    private AlgorithmEnum algorithm;

    public static final String SERIALIZED_NAME_SECRET = "secret";

    @SerializedName(SERIALIZED_NAME_SECRET)
    @javax.annotation.Nonnull
    private String secret;

    public WebhookSignatureVerificationInput() {}

    public WebhookSignatureVerificationInput type(@javax.annotation.Nonnull TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Signature verification method type.
     *
     * @return type
     */
    @javax.annotation.Nonnull
    public TypeEnum getType() {
        return type;
    }

    public void setType(@javax.annotation.Nonnull TypeEnum type) {
        this.type = type;
    }

    public WebhookSignatureVerificationInput header(@javax.annotation.Nonnull String header) {
        this.header = header;
        return this;
    }

    /**
     * HTTP header where the signature is sent.
     *
     * @return header
     */
    @javax.annotation.Nonnull
    public String getHeader() {
        return header;
    }

    public void setHeader(@javax.annotation.Nonnull String header) {
        this.header = header;
    }

    public WebhookSignatureVerificationInput algorithm(
            @javax.annotation.Nonnull AlgorithmEnum algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * Hash algorithm used for signature verification.
     *
     * @return algorithm
     */
    @javax.annotation.Nonnull
    public AlgorithmEnum getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(@javax.annotation.Nonnull AlgorithmEnum algorithm) {
        this.algorithm = algorithm;
    }

    public WebhookSignatureVerificationInput secret(@javax.annotation.Nonnull String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * Shared secret used for HMAC signature generation.
     *
     * @return secret
     */
    @javax.annotation.Nonnull
    public String getSecret() {
        return secret;
    }

    public void setSecret(@javax.annotation.Nonnull String secret) {
        this.secret = secret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookSignatureVerificationInput webhookSignatureVerificationInput =
                (WebhookSignatureVerificationInput) o;
        return Objects.equals(this.type, webhookSignatureVerificationInput.type)
                && Objects.equals(this.header, webhookSignatureVerificationInput.header)
                && Objects.equals(this.algorithm, webhookSignatureVerificationInput.algorithm)
                && Objects.equals(this.secret, webhookSignatureVerificationInput.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, header, algorithm, secret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookSignatureVerificationInput {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    header: ").append(toIndentedString(header)).append("\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
        openapiFields.add("header");
        openapiFields.add("algorithm");
        openapiFields.add("secret");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("type");
        openapiRequiredFields.add("header");
        openapiRequiredFields.add("algorithm");
        openapiRequiredFields.add("secret");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     WebhookSignatureVerificationInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!WebhookSignatureVerificationInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in WebhookSignatureVerificationInput is"
                                        + " not found in the empty JSON string",
                                WebhookSignatureVerificationInput.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!WebhookSignatureVerificationInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `WebhookSignatureVerificationInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : WebhookSignatureVerificationInput.openapiRequiredFields) {
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
        // validate the required field `type`
        TypeEnum.validateJsonElement(jsonObj.get("type"));
        if (!jsonObj.get("header").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `header` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("header").toString()));
        }
        if (!jsonObj.get("algorithm").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `algorithm` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("algorithm").toString()));
        }
        // validate the required field `algorithm`
        AlgorithmEnum.validateJsonElement(jsonObj.get("algorithm"));
        if (!jsonObj.get("secret").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `secret` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("secret").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WebhookSignatureVerificationInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WebhookSignatureVerificationInput' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WebhookSignatureVerificationInput> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(WebhookSignatureVerificationInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<WebhookSignatureVerificationInput>() {
                        @Override
                        public void write(JsonWriter out, WebhookSignatureVerificationInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public WebhookSignatureVerificationInput read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of WebhookSignatureVerificationInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of WebhookSignatureVerificationInput
     * @throws IOException if the JSON string is invalid with respect to
     *     WebhookSignatureVerificationInput
     */
    public static WebhookSignatureVerificationInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WebhookSignatureVerificationInput.class);
    }

    /**
     * Convert an instance of WebhookSignatureVerificationInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
