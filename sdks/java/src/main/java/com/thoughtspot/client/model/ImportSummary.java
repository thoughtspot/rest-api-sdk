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
 * Per (memory type, target source) summary of what importMemory did — or would do, in DRY_RUN.
 * &#x60;deleted_record_count&#x60; and &#x60;inserted_record_count&#x60; are previews in DRY_RUN
 * and actuals in EXECUTE_IMPORT.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ImportSummary implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * The kind of memory (&#x60;RULES&#x60;, &#x60;RECIPES&#x60;, or
     * &#x60;ALWAYS_APPLY_RULES&#x60;) these counts apply to.
     */
    @JsonAdapter(MemoryTypeEnum.Adapter.class)
    public enum MemoryTypeEnum {
        RULES("RULES"),

        RECIPES("RECIPES"),

        ALWAYS_APPLY_RULES("ALWAYS_APPLY_RULES");

        private String value;

        MemoryTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static MemoryTypeEnum fromValue(String value) {
            for (MemoryTypeEnum b : MemoryTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<MemoryTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final MemoryTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MemoryTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MemoryTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            MemoryTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_MEMORY_TYPE = "memory_type";

    @SerializedName(SERIALIZED_NAME_MEMORY_TYPE)
    @javax.annotation.Nullable
    private MemoryTypeEnum memoryType;

    public static final String SERIALIZED_NAME_SOURCE = "source";

    @SerializedName(SERIALIZED_NAME_SOURCE)
    @javax.annotation.Nullable
    private ImportTargetSource source;

    public static final String SERIALIZED_NAME_EXISTING_RECORD_COUNT = "existing_record_count";

    @SerializedName(SERIALIZED_NAME_EXISTING_RECORD_COUNT)
    @javax.annotation.Nullable
    private Integer existingRecordCount;

    public static final String SERIALIZED_NAME_DELETED_RECORD_COUNT = "deleted_record_count";

    @SerializedName(SERIALIZED_NAME_DELETED_RECORD_COUNT)
    @javax.annotation.Nullable
    private Integer deletedRecordCount;

    public static final String SERIALIZED_NAME_INSERTED_RECORD_COUNT = "inserted_record_count";

    @SerializedName(SERIALIZED_NAME_INSERTED_RECORD_COUNT)
    @javax.annotation.Nullable
    private Integer insertedRecordCount;

    public static final String SERIALIZED_NAME_FAILED_RECORD_COUNT = "failed_record_count";

    @SerializedName(SERIALIZED_NAME_FAILED_RECORD_COUNT)
    @javax.annotation.Nullable
    private Integer failedRecordCount;

    public ImportSummary() {}

    public ImportSummary memoryType(@javax.annotation.Nullable MemoryTypeEnum memoryType) {
        this.memoryType = memoryType;
        return this;
    }

    /**
     * The kind of memory (&#x60;RULES&#x60;, &#x60;RECIPES&#x60;, or
     * &#x60;ALWAYS_APPLY_RULES&#x60;) these counts apply to.
     *
     * @return memoryType
     */
    @javax.annotation.Nullable
    public MemoryTypeEnum getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(@javax.annotation.Nullable MemoryTypeEnum memoryType) {
        this.memoryType = memoryType;
    }

    public ImportSummary source(@javax.annotation.Nullable ImportTargetSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     *
     * @return source
     */
    @javax.annotation.Nullable
    public ImportTargetSource getSource() {
        return source;
    }

    public void setSource(@javax.annotation.Nullable ImportTargetSource source) {
        this.source = source;
    }

    public ImportSummary existingRecordCount(
            @javax.annotation.Nullable Integer existingRecordCount) {
        this.existingRecordCount = existingRecordCount;
        return this;
    }

    /**
     * Number of memory entries of this type that already existed on the target object before the
     * import.
     *
     * @return existingRecordCount
     */
    @javax.annotation.Nullable
    public Integer getExistingRecordCount() {
        return existingRecordCount;
    }

    public void setExistingRecordCount(@javax.annotation.Nullable Integer existingRecordCount) {
        this.existingRecordCount = existingRecordCount;
    }

    public ImportSummary deletedRecordCount(@javax.annotation.Nullable Integer deletedRecordCount) {
        this.deletedRecordCount = deletedRecordCount;
        return this;
    }

    /**
     * Number of existing entries that will be (DRY_RUN) or were (EXECUTE_IMPORT) deleted as part of
     * the replacement.
     *
     * @return deletedRecordCount
     */
    @javax.annotation.Nullable
    public Integer getDeletedRecordCount() {
        return deletedRecordCount;
    }

    public void setDeletedRecordCount(@javax.annotation.Nullable Integer deletedRecordCount) {
        this.deletedRecordCount = deletedRecordCount;
    }

    public ImportSummary insertedRecordCount(
            @javax.annotation.Nullable Integer insertedRecordCount) {
        this.insertedRecordCount = insertedRecordCount;
        return this;
    }

    /**
     * Number of entries from the payload that will be (DRY_RUN) or were (EXECUTE_IMPORT) inserted.
     *
     * @return insertedRecordCount
     */
    @javax.annotation.Nullable
    public Integer getInsertedRecordCount() {
        return insertedRecordCount;
    }

    public void setInsertedRecordCount(@javax.annotation.Nullable Integer insertedRecordCount) {
        this.insertedRecordCount = insertedRecordCount;
    }

    public ImportSummary failedRecordCount(@javax.annotation.Nullable Integer failedRecordCount) {
        this.failedRecordCount = failedRecordCount;
        return this;
    }

    /**
     * Number of records of this type that failed validation or processing.
     *
     * @return failedRecordCount
     */
    @javax.annotation.Nullable
    public Integer getFailedRecordCount() {
        return failedRecordCount;
    }

    public void setFailedRecordCount(@javax.annotation.Nullable Integer failedRecordCount) {
        this.failedRecordCount = failedRecordCount;
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
     * @return the ImportSummary instance itself
     */
    public ImportSummary putAdditionalProperty(String key, Object value) {
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
        ImportSummary importSummary = (ImportSummary) o;
        return Objects.equals(this.memoryType, importSummary.memoryType)
                && Objects.equals(this.source, importSummary.source)
                && Objects.equals(this.existingRecordCount, importSummary.existingRecordCount)
                && Objects.equals(this.deletedRecordCount, importSummary.deletedRecordCount)
                && Objects.equals(this.insertedRecordCount, importSummary.insertedRecordCount)
                && Objects.equals(this.failedRecordCount, importSummary.failedRecordCount)
                && Objects.equals(this.additionalProperties, importSummary.additionalProperties);
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
                memoryType,
                source,
                existingRecordCount,
                deletedRecordCount,
                insertedRecordCount,
                failedRecordCount,
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
        sb.append("class ImportSummary {\n");
        sb.append("    memoryType: ").append(toIndentedString(memoryType)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    existingRecordCount: ")
                .append(toIndentedString(existingRecordCount))
                .append("\n");
        sb.append("    deletedRecordCount: ")
                .append(toIndentedString(deletedRecordCount))
                .append("\n");
        sb.append("    insertedRecordCount: ")
                .append(toIndentedString(insertedRecordCount))
                .append("\n");
        sb.append("    failedRecordCount: ")
                .append(toIndentedString(failedRecordCount))
                .append("\n");
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
        openapiFields.add("memory_type");
        openapiFields.add("source");
        openapiFields.add("existing_record_count");
        openapiFields.add("deleted_record_count");
        openapiFields.add("inserted_record_count");
        openapiFields.add("failed_record_count");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ImportSummary
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ImportSummary.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ImportSummary is not found in the"
                                        + " empty JSON string",
                                ImportSummary.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("memory_type") != null && !jsonObj.get("memory_type").isJsonNull())
                && !jsonObj.get("memory_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `memory_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("memory_type").toString()));
        }
        // validate the optional field `memory_type`
        if (jsonObj.get("memory_type") != null && !jsonObj.get("memory_type").isJsonNull()) {
            MemoryTypeEnum.validateJsonElement(jsonObj.get("memory_type"));
        }
        // validate the optional field `source`
        if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) {
            ImportTargetSource.validateJsonElement(jsonObj.get("source"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ImportSummary.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ImportSummary' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ImportSummary> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ImportSummary.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ImportSummary>() {
                        @Override
                        public void write(JsonWriter out, ImportSummary value) throws IOException {
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
                        public ImportSummary read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            ImportSummary instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of ImportSummary given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ImportSummary
     * @throws IOException if the JSON string is invalid with respect to ImportSummary
     */
    public static ImportSummary fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ImportSummary.class);
    }

    /**
     * Convert an instance of ImportSummary to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
