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
     * @return the ChannelValidationAwsS3Info instance itself
     */
    public ChannelValidationAwsS3Info putAdditionalProperty(String key, Object value) {
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
        ChannelValidationAwsS3Info channelValidationAwsS3Info = (ChannelValidationAwsS3Info) o;
        return Objects.equals(this.bucketName, channelValidationAwsS3Info.bucketName)
                && Objects.equals(this.fileName, channelValidationAwsS3Info.fileName)
                && Objects.equals(this.objectKey, channelValidationAwsS3Info.objectKey)
                && Objects.equals(
                        this.additionalProperties, channelValidationAwsS3Info.additionalProperties);
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
        return Objects.hash(bucketName, fileName, objectKey, additionalProperties);
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
                        public ChannelValidationAwsS3Info read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            ChannelValidationAwsS3Info instance = thisAdapter.fromJsonTree(jsonObj);
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
