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

/** AWS S3 storage information returned from a validation step. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ChannelValidationAwsS3Info implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_BUCKET_NAME = "bucket_name";

    @SerializedName(SERIALIZED_NAME_BUCKET_NAME)
    @javax.annotation.Nullable
    private String bucketName;

    public static final String SERIALIZED_NAME_FILE_NAME = "file_name";

    @SerializedName(SERIALIZED_NAME_FILE_NAME)
    @javax.annotation.Nullable
    private String fileName;

    public static final String SERIALIZED_NAME_OBJECT_KEY = "object_key";

    @SerializedName(SERIALIZED_NAME_OBJECT_KEY)
    @javax.annotation.Nullable
    private String objectKey;

    public ChannelValidationAwsS3Info() {}

    public ChannelValidationAwsS3Info bucketName(@javax.annotation.Nullable String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Name of the S3 bucket.
     *
     * @return bucketName
     */
    @javax.annotation.Nullable
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(@javax.annotation.Nullable String bucketName) {
        this.bucketName = bucketName;
    }

    public ChannelValidationAwsS3Info fileName(@javax.annotation.Nullable String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Name of the uploaded file.
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

    public ChannelValidationAwsS3Info objectKey(@javax.annotation.Nullable String objectKey) {
        this.objectKey = objectKey;
        return this;
    }

    /**
     * Key of the object in S3 storage.
     *
     * @return objectKey
     */
    @javax.annotation.Nullable
    public String getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(@javax.annotation.Nullable String objectKey) {
        this.objectKey = objectKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChannelValidationAwsS3Info channelValidationAwsS3Info = (ChannelValidationAwsS3Info) o;
        return Objects.equals(this.bucketName, channelValidationAwsS3Info.bucketName)
                && Objects.equals(this.fileName, channelValidationAwsS3Info.fileName)
                && Objects.equals(this.objectKey, channelValidationAwsS3Info.objectKey);
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
        return Objects.hash(bucketName, fileName, objectKey);
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
        sb.append("class ChannelValidationAwsS3Info {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
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
        openapiFields.add("bucket_name");
        openapiFields.add("file_name");
        openapiFields.add("object_key");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ChannelValidationAwsS3Info
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ChannelValidationAwsS3Info.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ChannelValidationAwsS3Info is not"
                                        + " found in the empty JSON string",
                                ChannelValidationAwsS3Info.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ChannelValidationAwsS3Info.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ChannelValidationAwsS3Info` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("bucket_name") != null && !jsonObj.get("bucket_name").isJsonNull())
                && !jsonObj.get("bucket_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `bucket_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("bucket_name").toString()));
        }
        if ((jsonObj.get("file_name") != null && !jsonObj.get("file_name").isJsonNull())
                && !jsonObj.get("file_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `file_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("file_name").toString()));
        }
        if ((jsonObj.get("object_key") != null && !jsonObj.get("object_key").isJsonNull())
                && !jsonObj.get("object_key").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `object_key` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("object_key").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ChannelValidationAwsS3Info.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ChannelValidationAwsS3Info' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ChannelValidationAwsS3Info> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ChannelValidationAwsS3Info.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ChannelValidationAwsS3Info>() {
                        @Override
                        public void write(JsonWriter out, ChannelValidationAwsS3Info value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ChannelValidationAwsS3Info read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ChannelValidationAwsS3Info given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ChannelValidationAwsS3Info
     * @throws IOException if the JSON string is invalid with respect to ChannelValidationAwsS3Info
     */
    public static ChannelValidationAwsS3Info fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ChannelValidationAwsS3Info.class);
    }

    /**
     * Convert an instance of ChannelValidationAwsS3Info to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
