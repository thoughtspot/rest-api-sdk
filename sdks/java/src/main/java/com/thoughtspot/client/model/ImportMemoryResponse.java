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

/**
 * Response from importMemory. On &#x60;SUCCESS&#x60;, &#x60;summary&#x60; is fully populated.
 * &#x60;diagnostics&#x60; carries any fatal errors, rollbacks, and non-fatal warnings produced
 * during the import.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ImportMemoryResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Terminal status of the import. */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        SUCCESS("SUCCESS"),

        VALIDATION_FAILED("VALIDATION_FAILED"),

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

    public static final String SERIALIZED_NAME_SUMMARY = "summary";

    @SerializedName(SERIALIZED_NAME_SUMMARY)
    @javax.annotation.Nullable
    private List<ImportSummary> summary;

    public static final String SERIALIZED_NAME_VALIDATION_FAILURES = "validation_failures";

    @SerializedName(SERIALIZED_NAME_VALIDATION_FAILURES)
    @javax.annotation.Nullable
    private List<ImportFailure> validationFailures;

    public static final String SERIALIZED_NAME_DIAGNOSTICS = "diagnostics";

    @SerializedName(SERIALIZED_NAME_DIAGNOSTICS)
    @javax.annotation.Nullable
    private List<ImportDiagnostic> diagnostics;

    public static final String SERIALIZED_NAME_OPERATION_ID = "operation_id";

    @SerializedName(SERIALIZED_NAME_OPERATION_ID)
    @javax.annotation.Nullable
    private String operationId;

    public ImportMemoryResponse() {}

    public ImportMemoryResponse status(@javax.annotation.Nonnull StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Terminal status of the import.
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

    public ImportMemoryResponse summary(@javax.annotation.Nullable List<ImportSummary> summary) {
        this.summary = summary;
        return this;
    }

    public ImportMemoryResponse addSummaryItem(ImportSummary summaryItem) {
        if (this.summary == null) {
            this.summary = new ArrayList<>();
        }
        this.summary.add(summaryItem);
        return this;
    }

    /**
     * Per (memory type, target source) result entries. Null when the import failed before any
     * record processing occurred.
     *
     * @return summary
     */
    @javax.annotation.Nullable
    public List<ImportSummary> getSummary() {
        return summary;
    }

    public void setSummary(@javax.annotation.Nullable List<ImportSummary> summary) {
        this.summary = summary;
    }

    public ImportMemoryResponse validationFailures(
            @javax.annotation.Nullable List<ImportFailure> validationFailures) {
        this.validationFailures = validationFailures;
        return this;
    }

    public ImportMemoryResponse addValidationFailuresItem(ImportFailure validationFailuresItem) {
        if (this.validationFailures == null) {
            this.validationFailures = new ArrayList<>();
        }
        this.validationFailures.add(validationFailuresItem);
        return this;
    }

    /**
     * Per-item validation failure entries. Null when the import failed before item validation could
     * run.
     *
     * @return validationFailures
     */
    @javax.annotation.Nullable
    public List<ImportFailure> getValidationFailures() {
        return validationFailures;
    }

    public void setValidationFailures(
            @javax.annotation.Nullable List<ImportFailure> validationFailures) {
        this.validationFailures = validationFailures;
    }

    public ImportMemoryResponse diagnostics(
            @javax.annotation.Nullable List<ImportDiagnostic> diagnostics) {
        this.diagnostics = diagnostics;
        return this;
    }

    public ImportMemoryResponse addDiagnosticsItem(ImportDiagnostic diagnosticsItem) {
        if (this.diagnostics == null) {
            this.diagnostics = new ArrayList<>();
        }
        this.diagnostics.add(diagnosticsItem);
        return this;
    }

    /**
     * Diagnostic message groups (errors, rollbacks, and non-fatal warnings), each keyed by a
     * &#x60;sub_status&#x60;. Null when the import produced no diagnostics.
     *
     * @return diagnostics
     */
    @javax.annotation.Nullable
    public List<ImportDiagnostic> getDiagnostics() {
        return diagnostics;
    }

    public void setDiagnostics(@javax.annotation.Nullable List<ImportDiagnostic> diagnostics) {
        this.diagnostics = diagnostics;
    }

    public ImportMemoryResponse operationId(@javax.annotation.Nullable String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Server-generated identifier for this import operation. Include it in support tickets to help
     * correlate server-side logs.
     *
     * @return operationId
     */
    @javax.annotation.Nullable
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(@javax.annotation.Nullable String operationId) {
        this.operationId = operationId;
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
     * @return the ImportMemoryResponse instance itself
     */
    public ImportMemoryResponse putAdditionalProperty(String key, Object value) {
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
        ImportMemoryResponse importMemoryResponse = (ImportMemoryResponse) o;
        return Objects.equals(this.status, importMemoryResponse.status)
                && Objects.equals(this.summary, importMemoryResponse.summary)
                && Objects.equals(this.validationFailures, importMemoryResponse.validationFailures)
                && Objects.equals(this.diagnostics, importMemoryResponse.diagnostics)
                && Objects.equals(this.operationId, importMemoryResponse.operationId)
                && Objects.equals(
                        this.additionalProperties, importMemoryResponse.additionalProperties);
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
                status,
                summary,
                validationFailures,
                diagnostics,
                operationId,
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
        sb.append("class ImportMemoryResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    validationFailures: ")
                .append(toIndentedString(validationFailures))
                .append("\n");
        sb.append("    diagnostics: ").append(toIndentedString(diagnostics)).append("\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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
        openapiFields.add("status");
        openapiFields.add("summary");
        openapiFields.add("validation_failures");
        openapiFields.add("diagnostics");
        openapiFields.add("operation_id");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("status");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ImportMemoryResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ImportMemoryResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ImportMemoryResponse is not found in"
                                        + " the empty JSON string",
                                ImportMemoryResponse.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ImportMemoryResponse.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("status").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `status` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("status").toString()));
        }
        // validate the required field `status`
        StatusEnum.validateJsonElement(jsonObj.get("status"));
        if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) {
            JsonArray jsonArraysummary = jsonObj.getAsJsonArray("summary");
            if (jsonArraysummary != null) {
                // ensure the json data is an array
                if (!jsonObj.get("summary").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `summary` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("summary").toString()));
                }

                // validate the optional field `summary` (array)
                for (int i = 0; i < jsonArraysummary.size(); i++) {
                    ImportSummary.validateJsonElement(jsonArraysummary.get(i));
                }
                ;
            }
        }
        if (jsonObj.get("validation_failures") != null
                && !jsonObj.get("validation_failures").isJsonNull()) {
            JsonArray jsonArrayvalidationFailures = jsonObj.getAsJsonArray("validation_failures");
            if (jsonArrayvalidationFailures != null) {
                // ensure the json data is an array
                if (!jsonObj.get("validation_failures").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `validation_failures` to be an array in"
                                            + " the JSON string but got `%s`",
                                    jsonObj.get("validation_failures").toString()));
                }

                // validate the optional field `validation_failures` (array)
                for (int i = 0; i < jsonArrayvalidationFailures.size(); i++) {
                    ImportFailure.validateJsonElement(jsonArrayvalidationFailures.get(i));
                }
                ;
            }
        }
        if (jsonObj.get("diagnostics") != null && !jsonObj.get("diagnostics").isJsonNull()) {
            JsonArray jsonArraydiagnostics = jsonObj.getAsJsonArray("diagnostics");
            if (jsonArraydiagnostics != null) {
                // ensure the json data is an array
                if (!jsonObj.get("diagnostics").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `diagnostics` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("diagnostics").toString()));
                }

                // validate the optional field `diagnostics` (array)
                for (int i = 0; i < jsonArraydiagnostics.size(); i++) {
                    ImportDiagnostic.validateJsonElement(jsonArraydiagnostics.get(i));
                }
                ;
            }
        }
        if ((jsonObj.get("operation_id") != null && !jsonObj.get("operation_id").isJsonNull())
                && !jsonObj.get("operation_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `operation_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("operation_id").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ImportMemoryResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ImportMemoryResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ImportMemoryResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ImportMemoryResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ImportMemoryResponse>() {
                        @Override
                        public void write(JsonWriter out, ImportMemoryResponse value)
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
                        public ImportMemoryResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            ImportMemoryResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of ImportMemoryResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ImportMemoryResponse
     * @throws IOException if the JSON string is invalid with respect to ImportMemoryResponse
     */
    public static ImportMemoryResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ImportMemoryResponse.class);
    }

    /**
     * Convert an instance of ImportMemoryResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
