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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** RevertedMetadata */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class RevertedMetadata implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_FILE_NAME = "file_name";

    @SerializedName(SERIALIZED_NAME_FILE_NAME)
    @javax.annotation.Nonnull
    private String fileName;

    public static final String SERIALIZED_NAME_METADATA_NAME = "metadata_name";

    @SerializedName(SERIALIZED_NAME_METADATA_NAME)
    @javax.annotation.Nonnull
    private String metadataName;

    public static final String SERIALIZED_NAME_METADATA_TYPE = "metadata_type";

    @SerializedName(SERIALIZED_NAME_METADATA_TYPE)
    @javax.annotation.Nonnull
    private String metadataType;

    public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";

    @SerializedName(SERIALIZED_NAME_STATUS_CODE)
    @javax.annotation.Nonnull
    private String statusCode;

    public static final String SERIALIZED_NAME_STATUS_MESSAGE = "status_message";

    @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
    @javax.annotation.Nonnull
    private String statusMessage;

    public RevertedMetadata() {}

    public RevertedMetadata fileName(@javax.annotation.Nonnull String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Name of the file deployed
     *
     * @return fileName
     */
    @javax.annotation.Nonnull
    public String getFileName() {
        return fileName;
    }

    public void setFileName(@javax.annotation.Nonnull String fileName) {
        this.fileName = fileName;
    }

    public RevertedMetadata metadataName(@javax.annotation.Nonnull String metadataName) {
        this.metadataName = metadataName;
        return this;
    }

    /**
     * Name of the metadata object
     *
     * @return metadataName
     */
    @javax.annotation.Nonnull
    public String getMetadataName() {
        return metadataName;
    }

    public void setMetadataName(@javax.annotation.Nonnull String metadataName) {
        this.metadataName = metadataName;
    }

    public RevertedMetadata metadataType(@javax.annotation.Nonnull String metadataType) {
        this.metadataType = metadataType;
        return this;
    }

    /**
     * Type of the metadata object
     *
     * @return metadataType
     */
    @javax.annotation.Nonnull
    public String getMetadataType() {
        return metadataType;
    }

    public void setMetadataType(@javax.annotation.Nonnull String metadataType) {
        this.metadataType = metadataType;
    }

    public RevertedMetadata statusCode(@javax.annotation.Nonnull String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Indicates the status of deployment for the file
     *
     * @return statusCode
     */
    @javax.annotation.Nonnull
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(@javax.annotation.Nonnull String statusCode) {
        this.statusCode = statusCode;
    }

    public RevertedMetadata statusMessage(@javax.annotation.Nonnull String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * Any error or warning with the deployment
     *
     * @return statusMessage
     */
    @javax.annotation.Nonnull
    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(@javax.annotation.Nonnull String statusMessage) {
        this.statusMessage = statusMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RevertedMetadata revertedMetadata = (RevertedMetadata) o;
        return Objects.equals(this.fileName, revertedMetadata.fileName)
                && Objects.equals(this.metadataName, revertedMetadata.metadataName)
                && Objects.equals(this.metadataType, revertedMetadata.metadataType)
                && Objects.equals(this.statusCode, revertedMetadata.statusCode)
                && Objects.equals(this.statusMessage, revertedMetadata.statusMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, metadataName, metadataType, statusCode, statusMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RevertedMetadata {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    metadataName: ").append(toIndentedString(metadataName)).append("\n");
        sb.append("    metadataType: ").append(toIndentedString(metadataType)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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
        openapiFields.add("file_name");
        openapiFields.add("metadata_name");
        openapiFields.add("metadata_type");
        openapiFields.add("status_code");
        openapiFields.add("status_message");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("file_name");
        openapiRequiredFields.add("metadata_name");
        openapiRequiredFields.add("metadata_type");
        openapiRequiredFields.add("status_code");
        openapiRequiredFields.add("status_message");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to RevertedMetadata
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!RevertedMetadata.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in RevertedMetadata is not found in the"
                                        + " empty JSON string",
                                RevertedMetadata.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!RevertedMetadata.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `RevertedMetadata` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : RevertedMetadata.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("file_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `file_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("file_name").toString()));
        }
        if (!jsonObj.get("metadata_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("metadata_name").toString()));
        }
        if (!jsonObj.get("metadata_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("metadata_type").toString()));
        }
        if (!jsonObj.get("status_code").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `status_code` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("status_code").toString()));
        }
        if (!jsonObj.get("status_message").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `status_message` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("status_message").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RevertedMetadata.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RevertedMetadata' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RevertedMetadata> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(RevertedMetadata.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<RevertedMetadata>() {
                        @Override
                        public void write(JsonWriter out, RevertedMetadata value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public RevertedMetadata read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of RevertedMetadata given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RevertedMetadata
     * @throws IOException if the JSON string is invalid with respect to RevertedMetadata
     */
    public static RevertedMetadata fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RevertedMetadata.class);
    }

    /**
     * Convert an instance of RevertedMetadata to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
