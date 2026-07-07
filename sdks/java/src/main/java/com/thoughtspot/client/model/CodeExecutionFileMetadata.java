/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
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
 * Sanitized public metadata for a code-execution-generated file. Internal storage identifiers (e.g.
 * Azure blob ids) are deliberately not exposed.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CodeExecutionFileMetadata implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_FILE_ID = "file_id";

    @SerializedName(SERIALIZED_NAME_FILE_ID)
    @javax.annotation.Nonnull
    private String fileId;

    public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
    @javax.annotation.Nullable
    private String displayName;

    public static final String SERIALIZED_NAME_FILE_TYPE = "file_type";

    @SerializedName(SERIALIZED_NAME_FILE_TYPE)
    @javax.annotation.Nullable
    private String fileType;

    public static final String SERIALIZED_NAME_CREATED_TIME_IN_MILLIS = "created_time_in_millis";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_IN_MILLIS)
    @javax.annotation.Nullable
    private Object createdTimeInMillis = null;

    public static final String SERIALIZED_NAME_EXPIRED = "expired";

    @SerializedName(SERIALIZED_NAME_EXPIRED)
    @javax.annotation.Nonnull
    private Boolean expired;

    public CodeExecutionFileMetadata() {}

    public CodeExecutionFileMetadata fileId(@javax.annotation.Nonnull String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Unique identifier of the code-execution-generated file. Stable across conversation turns.
     *
     * @return fileId
     */
    @javax.annotation.Nonnull
    public String getFileId() {
        return fileId;
    }

    public void setFileId(@javax.annotation.Nonnull String fileId) {
        this.fileId = fileId;
    }

    public CodeExecutionFileMetadata displayName(@javax.annotation.Nullable String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Human-readable file name.
     *
     * @return displayName
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(@javax.annotation.Nullable String displayName) {
        this.displayName = displayName;
    }

    public CodeExecutionFileMetadata fileType(@javax.annotation.Nullable String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * File type hint. Either a MIME string (e.g. &#x60;text/csv&#x60;) or an extension (e.g.
     * &#x60;csv&#x60;).
     *
     * @return fileType
     */
    @javax.annotation.Nullable
    public String getFileType() {
        return fileType;
    }

    public void setFileType(@javax.annotation.Nullable String fileType) {
        this.fileType = fileType;
    }

    public CodeExecutionFileMetadata createdTimeInMillis(
            @javax.annotation.Nullable Object createdTimeInMillis) {
        this.createdTimeInMillis = createdTimeInMillis;
        return this;
    }

    /**
     * Milliseconds since Unix epoch when the file was created.
     *
     * @return createdTimeInMillis
     */
    @javax.annotation.Nullable
    public Object getCreatedTimeInMillis() {
        return createdTimeInMillis;
    }

    public void setCreatedTimeInMillis(@javax.annotation.Nullable Object createdTimeInMillis) {
        this.createdTimeInMillis = createdTimeInMillis;
    }

    public CodeExecutionFileMetadata expired(@javax.annotation.Nonnull Boolean expired) {
        this.expired = expired;
        return this;
    }

    /**
     * True when the file is no longer downloadable (storage expired or evicted).
     *
     * @return expired
     */
    @javax.annotation.Nonnull
    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(@javax.annotation.Nonnull Boolean expired) {
        this.expired = expired;
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
     * @return the CodeExecutionFileMetadata instance itself
     */
    public CodeExecutionFileMetadata putAdditionalProperty(String key, Object value) {
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
        CodeExecutionFileMetadata codeExecutionFileMetadata = (CodeExecutionFileMetadata) o;
        return Objects.equals(this.fileId, codeExecutionFileMetadata.fileId)
                && Objects.equals(this.displayName, codeExecutionFileMetadata.displayName)
                && Objects.equals(this.fileType, codeExecutionFileMetadata.fileType)
                && Objects.equals(
                        this.createdTimeInMillis, codeExecutionFileMetadata.createdTimeInMillis)
                && Objects.equals(this.expired, codeExecutionFileMetadata.expired)
                && Objects.equals(
                        this.additionalProperties, codeExecutionFileMetadata.additionalProperties);
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
                fileId, displayName, fileType, createdTimeInMillis, expired, additionalProperties);
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
        sb.append("class CodeExecutionFileMetadata {\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    createdTimeInMillis: ")
                .append(toIndentedString(createdTimeInMillis))
                .append("\n");
        sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
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
        openapiFields.add("file_id");
        openapiFields.add("display_name");
        openapiFields.add("file_type");
        openapiFields.add("created_time_in_millis");
        openapiFields.add("expired");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("file_id");
        openapiRequiredFields.add("expired");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CodeExecutionFileMetadata
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CodeExecutionFileMetadata.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CodeExecutionFileMetadata is not"
                                        + " found in the empty JSON string",
                                CodeExecutionFileMetadata.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CodeExecutionFileMetadata.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("file_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `file_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("file_id").toString()));
        }
        if ((jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull())
                && !jsonObj.get("display_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `display_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("display_name").toString()));
        }
        if ((jsonObj.get("file_type") != null && !jsonObj.get("file_type").isJsonNull())
                && !jsonObj.get("file_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `file_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("file_type").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CodeExecutionFileMetadata.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CodeExecutionFileMetadata' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CodeExecutionFileMetadata> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CodeExecutionFileMetadata.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CodeExecutionFileMetadata>() {
                        @Override
                        public void write(JsonWriter out, CodeExecutionFileMetadata value)
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
                        public CodeExecutionFileMetadata read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            CodeExecutionFileMetadata instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of CodeExecutionFileMetadata given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CodeExecutionFileMetadata
     * @throws IOException if the JSON string is invalid with respect to CodeExecutionFileMetadata
     */
    public static CodeExecutionFileMetadata fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CodeExecutionFileMetadata.class);
    }

    /**
     * Convert an instance of CodeExecutionFileMetadata to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
