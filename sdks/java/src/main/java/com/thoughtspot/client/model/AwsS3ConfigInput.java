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

/** Input type for AWS S3 storage configuration. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AwsS3ConfigInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_BUCKET_NAME = "bucket_name";

    @SerializedName(SERIALIZED_NAME_BUCKET_NAME)
    @javax.annotation.Nonnull
    private String bucketName;

    public static final String SERIALIZED_NAME_REGION = "region";

    @SerializedName(SERIALIZED_NAME_REGION)
    @javax.annotation.Nonnull
    private String region;

    public static final String SERIALIZED_NAME_ROLE_ARN = "role_arn";

    @SerializedName(SERIALIZED_NAME_ROLE_ARN)
    @javax.annotation.Nonnull
    private String roleArn;

    public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
    @javax.annotation.Nullable
    private String externalId;

    public static final String SERIALIZED_NAME_PATH_PREFIX = "path_prefix";

    @SerializedName(SERIALIZED_NAME_PATH_PREFIX)
    @javax.annotation.Nullable
    private String pathPrefix;

    public AwsS3ConfigInput() {}

    public AwsS3ConfigInput bucketName(@javax.annotation.Nonnull String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Name of the S3 bucket where webhook payloads will be stored. Example:
     * \&quot;my-webhook-files\&quot;
     *
     * @return bucketName
     */
    @javax.annotation.Nonnull
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(@javax.annotation.Nonnull String bucketName) {
        this.bucketName = bucketName;
    }

    public AwsS3ConfigInput region(@javax.annotation.Nonnull String region) {
        this.region = region;
        return this;
    }

    /**
     * AWS region where the S3 bucket is located. Example: \&quot;us-west-2\&quot;
     *
     * @return region
     */
    @javax.annotation.Nonnull
    public String getRegion() {
        return region;
    }

    public void setRegion(@javax.annotation.Nonnull String region) {
        this.region = region;
    }

    public AwsS3ConfigInput roleArn(@javax.annotation.Nonnull String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * ARN of the IAM role to assume for S3 access. Example:
     * \&quot;arn:aws:iam::123456789012:role/ThoughtSpotDeliveryRole\&quot;
     *
     * @return roleArn
     */
    @javax.annotation.Nonnull
    public String getRoleArn() {
        return roleArn;
    }

    public void setRoleArn(@javax.annotation.Nonnull String roleArn) {
        this.roleArn = roleArn;
    }

    public AwsS3ConfigInput externalId(@javax.annotation.Nullable String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * External ID for secure cross-account role assumption. Example:
     * \&quot;ts-webhook-a1b2c3d4-7890\&quot;
     *
     * @return externalId
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(@javax.annotation.Nullable String externalId) {
        this.externalId = externalId;
    }

    public AwsS3ConfigInput pathPrefix(@javax.annotation.Nullable String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }

    /**
     * Optional path prefix for organizing objects within the bucket. Example:
     * \&quot;thoughtspot-webhooks/\&quot;
     *
     * @return pathPrefix
     */
    @javax.annotation.Nullable
    public String getPathPrefix() {
        return pathPrefix;
    }

    public void setPathPrefix(@javax.annotation.Nullable String pathPrefix) {
        this.pathPrefix = pathPrefix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AwsS3ConfigInput awsS3ConfigInput = (AwsS3ConfigInput) o;
        return Objects.equals(this.bucketName, awsS3ConfigInput.bucketName)
                && Objects.equals(this.region, awsS3ConfigInput.region)
                && Objects.equals(this.roleArn, awsS3ConfigInput.roleArn)
                && Objects.equals(this.externalId, awsS3ConfigInput.externalId)
                && Objects.equals(this.pathPrefix, awsS3ConfigInput.pathPrefix);
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
        return Objects.hash(bucketName, region, roleArn, externalId, pathPrefix);
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
        sb.append("class AwsS3ConfigInput {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    pathPrefix: ").append(toIndentedString(pathPrefix)).append("\n");
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
        openapiFields.add("region");
        openapiFields.add("role_arn");
        openapiFields.add("external_id");
        openapiFields.add("path_prefix");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("bucket_name");
        openapiRequiredFields.add("region");
        openapiRequiredFields.add("role_arn");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AwsS3ConfigInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AwsS3ConfigInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AwsS3ConfigInput is not found in the"
                                        + " empty JSON string",
                                AwsS3ConfigInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!AwsS3ConfigInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `AwsS3ConfigInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : AwsS3ConfigInput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("bucket_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `bucket_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("bucket_name").toString()));
        }
        if (!jsonObj.get("region").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `region` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("region").toString()));
        }
        if (!jsonObj.get("role_arn").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `role_arn` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("role_arn").toString()));
        }
        if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull())
                && !jsonObj.get("external_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `external_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("external_id").toString()));
        }
        if ((jsonObj.get("path_prefix") != null && !jsonObj.get("path_prefix").isJsonNull())
                && !jsonObj.get("path_prefix").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `path_prefix` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("path_prefix").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AwsS3ConfigInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AwsS3ConfigInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AwsS3ConfigInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AwsS3ConfigInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AwsS3ConfigInput>() {
                        @Override
                        public void write(JsonWriter out, AwsS3ConfigInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AwsS3ConfigInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AwsS3ConfigInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AwsS3ConfigInput
     * @throws IOException if the JSON string is invalid with respect to AwsS3ConfigInput
     */
    public static AwsS3ConfigInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AwsS3ConfigInput.class);
    }

    /**
     * Convert an instance of AwsS3ConfigInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
