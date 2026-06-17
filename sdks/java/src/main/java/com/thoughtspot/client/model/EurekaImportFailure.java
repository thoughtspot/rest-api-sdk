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
 * One per-item import failure surfaced by importMemory. &#x60;line_number&#x60; is the best-effort
 * line number in the uploaded YAML; UI uses it for click-to-locate. &#x60;field_name&#x60; is a
 * dotted path within the item (e.g. &#x60;content.rule_definition&#x60;) for inline highlighting;
 * absent when the failure is item-level rather than field-level.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class EurekaImportFailure implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_LINE_NUMBER = "line_number";

    @SerializedName(SERIALIZED_NAME_LINE_NUMBER)
    @javax.annotation.Nullable
    private Integer lineNumber;

    /**
     * Machine-readable category for the failure (e.g. &#x60;VALIDATION&#x60;,
     * &#x60;ACCESS_DENIED&#x60;, &#x60;CHAR_LIMIT&#x60;). UI uses this to decide messaging.
     */
    @JsonAdapter(ReasonEnum.Adapter.class)
    public enum ReasonEnum {
        UNKNOWN_FAILURE_REASON("UNKNOWN_FAILURE_REASON"),

        VALIDATION("VALIDATION"),

        UNRESOLVED_SOURCE("UNRESOLVED_SOURCE"),

        ACCESS_DENIED("ACCESS_DENIED"),

        CHAR_LIMIT("CHAR_LIMIT"),

        SCHEMA("SCHEMA");

        private String value;

        ReasonEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ReasonEnum fromValue(String value) {
            for (ReasonEnum b : ReasonEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ReasonEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ReasonEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ReasonEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ReasonEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_REASON = "reason";

    @SerializedName(SERIALIZED_NAME_REASON)
    @javax.annotation.Nullable
    private ReasonEnum reason;

    public static final String SERIALIZED_NAME_FIELD_NAME = "field_name";

    @SerializedName(SERIALIZED_NAME_FIELD_NAME)
    @javax.annotation.Nullable
    private String fieldName;

    public static final String SERIALIZED_NAME_MESSAGE = "message";

    @SerializedName(SERIALIZED_NAME_MESSAGE)
    @javax.annotation.Nullable
    private String message;

    public EurekaImportFailure() {}

    public EurekaImportFailure lineNumber(@javax.annotation.Nullable Integer lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    /**
     * Best-effort line number of the offending item in the uploaded YAML. UI uses it for
     * click-to-locate. May be null when the line cannot be determined.
     *
     * @return lineNumber
     */
    @javax.annotation.Nullable
    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(@javax.annotation.Nullable Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public EurekaImportFailure reason(@javax.annotation.Nullable ReasonEnum reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Machine-readable category for the failure (e.g. &#x60;VALIDATION&#x60;,
     * &#x60;ACCESS_DENIED&#x60;, &#x60;CHAR_LIMIT&#x60;). UI uses this to decide messaging.
     *
     * @return reason
     */
    @javax.annotation.Nullable
    public ReasonEnum getReason() {
        return reason;
    }

    public void setReason(@javax.annotation.Nullable ReasonEnum reason) {
        this.reason = reason;
    }

    public EurekaImportFailure fieldName(@javax.annotation.Nullable String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * Dotted path to the offending field within the item (e.g. &#x60;content.rule_definition&#x60;)
     * for inline highlighting. Absent when the failure is item-level rather than field-level.
     *
     * @return fieldName
     */
    @javax.annotation.Nullable
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(@javax.annotation.Nullable String fieldName) {
        this.fieldName = fieldName;
    }

    public EurekaImportFailure message(@javax.annotation.Nullable String message) {
        this.message = message;
        return this;
    }

    /**
     * Human-readable description of the failure.
     *
     * @return message
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return message;
    }

    public void setMessage(@javax.annotation.Nullable String message) {
        this.message = message;
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
     * @return the EurekaImportFailure instance itself
     */
    public EurekaImportFailure putAdditionalProperty(String key, Object value) {
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
        EurekaImportFailure eurekaImportFailure = (EurekaImportFailure) o;
        return Objects.equals(this.lineNumber, eurekaImportFailure.lineNumber)
                && Objects.equals(this.reason, eurekaImportFailure.reason)
                && Objects.equals(this.fieldName, eurekaImportFailure.fieldName)
                && Objects.equals(this.message, eurekaImportFailure.message)
                && Objects.equals(
                        this.additionalProperties, eurekaImportFailure.additionalProperties);
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
        return Objects.hash(lineNumber, reason, fieldName, message, additionalProperties);
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
        sb.append("class EurekaImportFailure {\n");
        sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
        openapiFields.add("line_number");
        openapiFields.add("reason");
        openapiFields.add("field_name");
        openapiFields.add("message");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to EurekaImportFailure
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!EurekaImportFailure.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in EurekaImportFailure is not found in"
                                        + " the empty JSON string",
                                EurekaImportFailure.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull())
                && !jsonObj.get("reason").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `reason` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("reason").toString()));
        }
        // validate the optional field `reason`
        if (jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) {
            ReasonEnum.validateJsonElement(jsonObj.get("reason"));
        }
        if ((jsonObj.get("field_name") != null && !jsonObj.get("field_name").isJsonNull())
                && !jsonObj.get("field_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `field_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("field_name").toString()));
        }
        if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull())
                && !jsonObj.get("message").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `message` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("message").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EurekaImportFailure.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'EurekaImportFailure' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EurekaImportFailure> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(EurekaImportFailure.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<EurekaImportFailure>() {
                        @Override
                        public void write(JsonWriter out, EurekaImportFailure value)
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
                        public EurekaImportFailure read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            EurekaImportFailure instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of EurekaImportFailure given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of EurekaImportFailure
     * @throws IOException if the JSON string is invalid with respect to EurekaImportFailure
     */
    public static EurekaImportFailure fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, EurekaImportFailure.class);
    }

    /**
     * Convert an instance of EurekaImportFailure to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
