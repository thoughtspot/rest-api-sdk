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

/** Validation detail result for a sub-step. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ChannelValidationDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    /** The validation step that was performed. */
    @JsonAdapter(ValidationStepEnum.Adapter.class)
    public enum ValidationStepEnum {
        HTTP_CONNECTION_CHECK("HTTP_CONNECTION_CHECK"),

        STORAGE_FILE_UPLOAD_CHECK("STORAGE_FILE_UPLOAD_CHECK");

        private String value;

        ValidationStepEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ValidationStepEnum fromValue(String value) {
            for (ValidationStepEnum b : ValidationStepEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ValidationStepEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ValidationStepEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ValidationStepEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ValidationStepEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ValidationStepEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_VALIDATION_STEP = "validation_step";

    @SerializedName(SERIALIZED_NAME_VALIDATION_STEP)
    @javax.annotation.Nonnull
    private ValidationStepEnum validationStep;

    /** Status of this validation step. */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
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

    /** Error code if the validation step failed. */
    @JsonAdapter(ErrorCodeEnum.Adapter.class)
    public enum ErrorCodeEnum {
        INVALID_CREDENTIALS("INVALID_CREDENTIALS"),

        FORBIDDEN("FORBIDDEN"),

        UNAUTHORIZED("UNAUTHORIZED"),

        CONNECTION_TIMEOUT("CONNECTION_TIMEOUT"),

        UNKNOWN("UNKNOWN");

        private String value;

        ErrorCodeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ErrorCodeEnum fromValue(String value) {
            for (ErrorCodeEnum b : ErrorCodeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ErrorCodeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ErrorCodeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ErrorCodeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ErrorCodeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ErrorCodeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE)
    @javax.annotation.Nullable
    private ErrorCodeEnum errorCode;

    public static final String SERIALIZED_NAME_HTTP_STATUS = "http_status";

    @SerializedName(SERIALIZED_NAME_HTTP_STATUS)
    @javax.annotation.Nullable
    private Integer httpStatus;

    public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
    @javax.annotation.Nullable
    private String errorMessage;

    public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additional_info";

    @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
    @javax.annotation.Nullable
    private String additionalInfo;

    public ChannelValidationDetail() {}

    public ChannelValidationDetail validationStep(
            @javax.annotation.Nonnull ValidationStepEnum validationStep) {
        this.validationStep = validationStep;
        return this;
    }

    /**
     * The validation step that was performed.
     *
     * @return validationStep
     */
    @javax.annotation.Nonnull
    public ValidationStepEnum getValidationStep() {
        return validationStep;
    }

    public void setValidationStep(@javax.annotation.Nonnull ValidationStepEnum validationStep) {
        this.validationStep = validationStep;
    }

    public ChannelValidationDetail status(@javax.annotation.Nonnull StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Status of this validation step.
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

    public ChannelValidationDetail errorCode(@javax.annotation.Nullable ErrorCodeEnum errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Error code if the validation step failed.
     *
     * @return errorCode
     */
    @javax.annotation.Nullable
    public ErrorCodeEnum getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(@javax.annotation.Nullable ErrorCodeEnum errorCode) {
        this.errorCode = errorCode;
    }

    public ChannelValidationDetail httpStatus(@javax.annotation.Nullable Integer httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }

    /**
     * HTTP status code returned by the channel (if applicable).
     *
     * @return httpStatus
     */
    @javax.annotation.Nullable
    public Integer getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(@javax.annotation.Nullable Integer httpStatus) {
        this.httpStatus = httpStatus;
    }

    public ChannelValidationDetail errorMessage(@javax.annotation.Nullable String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Error message from the channel or validation process.
     *
     * @return errorMessage
     */
    @javax.annotation.Nullable
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(@javax.annotation.Nullable String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ChannelValidationDetail additionalInfo(
            @javax.annotation.Nullable String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * Additional information about the validation step.
     *
     * @return additionalInfo
     */
    @javax.annotation.Nullable
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(@javax.annotation.Nullable String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChannelValidationDetail channelValidationDetail = (ChannelValidationDetail) o;
        return Objects.equals(this.validationStep, channelValidationDetail.validationStep)
                && Objects.equals(this.status, channelValidationDetail.status)
                && Objects.equals(this.errorCode, channelValidationDetail.errorCode)
                && Objects.equals(this.httpStatus, channelValidationDetail.httpStatus)
                && Objects.equals(this.errorMessage, channelValidationDetail.errorMessage)
                && Objects.equals(this.additionalInfo, channelValidationDetail.additionalInfo);
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
                validationStep, status, errorCode, httpStatus, errorMessage, additionalInfo);
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
        sb.append("class ChannelValidationDetail {\n");
        sb.append("    validationStep: ").append(toIndentedString(validationStep)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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
        openapiFields.add("validation_step");
        openapiFields.add("status");
        openapiFields.add("error_code");
        openapiFields.add("http_status");
        openapiFields.add("error_message");
        openapiFields.add("additional_info");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("validation_step");
        openapiRequiredFields.add("status");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ChannelValidationDetail
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ChannelValidationDetail.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ChannelValidationDetail is not found"
                                        + " in the empty JSON string",
                                ChannelValidationDetail.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ChannelValidationDetail.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ChannelValidationDetail` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ChannelValidationDetail.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("validation_step").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `validation_step` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("validation_step").toString()));
        }
        // validate the required field `validation_step`
        ValidationStepEnum.validateJsonElement(jsonObj.get("validation_step"));
        if (!jsonObj.get("status").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `status` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("status").toString()));
        }
        // validate the required field `status`
        StatusEnum.validateJsonElement(jsonObj.get("status"));
        if ((jsonObj.get("error_code") != null && !jsonObj.get("error_code").isJsonNull())
                && !jsonObj.get("error_code").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `error_code` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("error_code").toString()));
        }
        // validate the optional field `error_code`
        if (jsonObj.get("error_code") != null && !jsonObj.get("error_code").isJsonNull()) {
            ErrorCodeEnum.validateJsonElement(jsonObj.get("error_code"));
        }
        if ((jsonObj.get("error_message") != null && !jsonObj.get("error_message").isJsonNull())
                && !jsonObj.get("error_message").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `error_message` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("error_message").toString()));
        }
        if ((jsonObj.get("additional_info") != null && !jsonObj.get("additional_info").isJsonNull())
                && !jsonObj.get("additional_info").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `additional_info` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("additional_info").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ChannelValidationDetail.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ChannelValidationDetail' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ChannelValidationDetail> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ChannelValidationDetail.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ChannelValidationDetail>() {
                        @Override
                        public void write(JsonWriter out, ChannelValidationDetail value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ChannelValidationDetail read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ChannelValidationDetail given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ChannelValidationDetail
     * @throws IOException if the JSON string is invalid with respect to ChannelValidationDetail
     */
    public static ChannelValidationDetail fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ChannelValidationDetail.class);
    }

    /**
     * Convert an instance of ChannelValidationDetail to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
