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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** DeployResponse */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DeployResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_FILE_NAME = "file_name";

    @SerializedName(SERIALIZED_NAME_FILE_NAME)
    @javax.annotation.Nullable
    private String fileName;

    public static final String SERIALIZED_NAME_METADATA_NAME = "metadata_name";

    @SerializedName(SERIALIZED_NAME_METADATA_NAME)
    @javax.annotation.Nullable
    private String metadataName;

    public static final String SERIALIZED_NAME_METADATA_TYPE = "metadata_type";

    @SerializedName(SERIALIZED_NAME_METADATA_TYPE)
    @javax.annotation.Nullable
    private String metadataType;

    public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";

    @SerializedName(SERIALIZED_NAME_STATUS_CODE)
    @javax.annotation.Nullable
    private String statusCode;

    public static final String SERIALIZED_NAME_STATUS_MESSAGE = "status_message";

    @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
    @javax.annotation.Nullable
    private String statusMessage;

    public DeployResponse() {}

    public DeployResponse fileName(@javax.annotation.Nullable String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Name of the file deployed
     *
     * @return fileName
     */
    @javax.annotation.Nullable
    public String getFileName() {
        return fileName;
    }

    public void setFileName(@javax.annotation.Nullable String fileName) {
        this.fileName = fileName;
    }

    public DeployResponse metadataName(@javax.annotation.Nullable String metadataName) {
        this.metadataName = metadataName;
        return this;
    }

    /**
     * Name of the metadata object
     *
     * @return metadataName
     */
    @javax.annotation.Nullable
    public String getMetadataName() {
        return metadataName;
    }

    public void setMetadataName(@javax.annotation.Nullable String metadataName) {
        this.metadataName = metadataName;
    }

    public DeployResponse metadataType(@javax.annotation.Nullable String metadataType) {
        this.metadataType = metadataType;
        return this;
    }

    /**
     * Type of the metadata object
     *
     * @return metadataType
     */
    @javax.annotation.Nullable
    public String getMetadataType() {
        return metadataType;
    }

    public void setMetadataType(@javax.annotation.Nullable String metadataType) {
        this.metadataType = metadataType;
    }

    public DeployResponse statusCode(@javax.annotation.Nullable String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Indicates the status of deployment for the file
     *
     * @return statusCode
     */
    @javax.annotation.Nullable
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(@javax.annotation.Nullable String statusCode) {
        this.statusCode = statusCode;
    }

    public DeployResponse statusMessage(@javax.annotation.Nullable String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * Any error or warning with the deployment
     *
     * @return statusMessage
     */
    @javax.annotation.Nullable
    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(@javax.annotation.Nullable String statusMessage) {
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
        DeployResponse deployResponse = (DeployResponse) o;
        return Objects.equals(this.fileName, deployResponse.fileName)
                && Objects.equals(this.metadataName, deployResponse.metadataName)
                && Objects.equals(this.metadataType, deployResponse.metadataType)
                && Objects.equals(this.statusCode, deployResponse.statusCode)
                && Objects.equals(this.statusMessage, deployResponse.statusMessage);
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
        return Objects.hash(fileName, metadataName, metadataType, statusCode, statusMessage);
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
        sb.append("class DeployResponse {\n");
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
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to DeployResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DeployResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DeployResponse is not found in the"
                                        + " empty JSON string",
                                DeployResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!DeployResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `DeployResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("file_name") != null && !jsonObj.get("file_name").isJsonNull())
                && !jsonObj.get("file_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `file_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("file_name").toString()));
        }
        if ((jsonObj.get("metadata_name") != null && !jsonObj.get("metadata_name").isJsonNull())
                && !jsonObj.get("metadata_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("metadata_name").toString()));
        }
        if ((jsonObj.get("metadata_type") != null && !jsonObj.get("metadata_type").isJsonNull())
                && !jsonObj.get("metadata_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("metadata_type").toString()));
        }
        if ((jsonObj.get("status_code") != null && !jsonObj.get("status_code").isJsonNull())
                && !jsonObj.get("status_code").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `status_code` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("status_code").toString()));
        }
        if ((jsonObj.get("status_message") != null && !jsonObj.get("status_message").isJsonNull())
                && !jsonObj.get("status_message").isJsonPrimitive()) {
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
            if (!DeployResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DeployResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DeployResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(DeployResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DeployResponse>() {
                        @Override
                        public void write(JsonWriter out, DeployResponse value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DeployResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DeployResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DeployResponse
     * @throws IOException if the JSON string is invalid with respect to DeployResponse
     */
    public static DeployResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DeployResponse.class);
    }

    /**
     * Convert an instance of DeployResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
