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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Setup information for customer-managed storage configuration. Provides ThoughtSpot&#39;s identity
 * information and IAM policy configuration required for customers to set up cross-account access to
 * their S3 buckets. The response contains cluster-specific configuration based on the cluster_type:
 * - For AWS clusters: aws_config will be populated - For GCP clusters: gcp_config will be populated
 * Example query: &#x60;&#x60;&#x60;graphql query { getWebhookStorageConfig(webhook_identifier:
 * \&quot;my-webhook\&quot;) { cluster_type storage_type aws_config { thoughtspot_aws_account_id
 * trust_policy_template setup_instructions } gcp_config { thoughtspot_gcp_service_account_id
 * oidc_provider trust_policy_template setup_instructions } } } &#x60;&#x60;&#x60; Example AWS
 * response: { \&quot;cluster_type\&quot;: \&quot;AWS\&quot;, \&quot;storage_type\&quot;:
 * \&quot;AWS_S3\&quot;, \&quot;aws_config\&quot;: { \&quot;thoughtspot_aws_account_id\&quot;:
 * \&quot;123456789012\&quot;, \&quot;trust_policy_template\&quot;: { \&quot;Version\&quot;:
 * \&quot;2012-10-17\&quot;, \&quot;Statement\&quot;: [...] }, \&quot;setup_instructions\&quot;:
 * [\&quot;1. Create an IAM role...\&quot;, \&quot;2. Add trust policy...\&quot;] },
 * \&quot;gcp_config\&quot;: null } Example GCP response: { \&quot;cluster_type\&quot;:
 * \&quot;GCP\&quot;, \&quot;storage_type\&quot;: \&quot;AWS_S3\&quot;, \&quot;aws_config\&quot;:
 * null, \&quot;gcp_config\&quot;: { \&quot;thoughtspot_gcp_service_account_id\&quot;:
 * \&quot;115663769112811637952\&quot;, \&quot;oidc_provider\&quot;:
 * \&quot;accounts.google.com\&quot;, \&quot;trust_policy_template\&quot;: { \&quot;Version\&quot;:
 * \&quot;2012-10-17\&quot;, \&quot;Statement\&quot;: [...] }, \&quot;setup_instructions\&quot;:
 * [\&quot;1. Add accounts.google.com as Identity Provider...\&quot;] } }
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class StorageSetupInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * The type of ThoughtSpot cluster deployment. Determines which authentication method is used
     * for S3 access. Example: \&quot;AWS\&quot; or \&quot;GCP\&quot;
     */
    @JsonAdapter(ClusterTypeEnum.Adapter.class)
    public enum ClusterTypeEnum {
        AWS("AWS"),

        GCP("GCP");

        private String value;

        ClusterTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ClusterTypeEnum fromValue(String value) {
            for (ClusterTypeEnum b : ClusterTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ClusterTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ClusterTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ClusterTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ClusterTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ClusterTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_CLUSTER_TYPE = "cluster_type";

    @SerializedName(SERIALIZED_NAME_CLUSTER_TYPE)
    @javax.annotation.Nonnull
    private ClusterTypeEnum clusterType;

    /** Type of storage destination (e.g., AWS_S3). */
    @JsonAdapter(StorageTypeEnum.Adapter.class)
    public enum StorageTypeEnum {
        AWS_S3("AWS_S3");

        private String value;

        StorageTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StorageTypeEnum fromValue(String value) {
            for (StorageTypeEnum b : StorageTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<StorageTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StorageTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StorageTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StorageTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            StorageTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_STORAGE_TYPE = "storage_type";

    @SerializedName(SERIALIZED_NAME_STORAGE_TYPE)
    @javax.annotation.Nonnull
    private StorageTypeEnum storageType;

    public static final String SERIALIZED_NAME_AWS_CONFIG = "aws_config";

    @SerializedName(SERIALIZED_NAME_AWS_CONFIG)
    @javax.annotation.Nullable
    private AWSAssumeRoleSetup awsConfig;

    public static final String SERIALIZED_NAME_GCP_CONFIG = "gcp_config";

    @SerializedName(SERIALIZED_NAME_GCP_CONFIG)
    @javax.annotation.Nullable
    private GCPWebIdentitySetup gcpConfig;

    public StorageSetupInfo() {}

    public StorageSetupInfo clusterType(@javax.annotation.Nonnull ClusterTypeEnum clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * The type of ThoughtSpot cluster deployment. Determines which authentication method is used
     * for S3 access. Example: \&quot;AWS\&quot; or \&quot;GCP\&quot;
     *
     * @return clusterType
     */
    @javax.annotation.Nonnull
    public ClusterTypeEnum getClusterType() {
        return clusterType;
    }

    public void setClusterType(@javax.annotation.Nonnull ClusterTypeEnum clusterType) {
        this.clusterType = clusterType;
    }

    public StorageSetupInfo storageType(@javax.annotation.Nonnull StorageTypeEnum storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * Type of storage destination (e.g., AWS_S3).
     *
     * @return storageType
     */
    @javax.annotation.Nonnull
    public StorageTypeEnum getStorageType() {
        return storageType;
    }

    public void setStorageType(@javax.annotation.Nonnull StorageTypeEnum storageType) {
        this.storageType = storageType;
    }

    public StorageSetupInfo awsConfig(@javax.annotation.Nullable AWSAssumeRoleSetup awsConfig) {
        this.awsConfig = awsConfig;
        return this;
    }

    /**
     * Get awsConfig
     *
     * @return awsConfig
     */
    @javax.annotation.Nullable
    public AWSAssumeRoleSetup getAwsConfig() {
        return awsConfig;
    }

    public void setAwsConfig(@javax.annotation.Nullable AWSAssumeRoleSetup awsConfig) {
        this.awsConfig = awsConfig;
    }

    public StorageSetupInfo gcpConfig(@javax.annotation.Nullable GCPWebIdentitySetup gcpConfig) {
        this.gcpConfig = gcpConfig;
        return this;
    }

    /**
     * Get gcpConfig
     *
     * @return gcpConfig
     */
    @javax.annotation.Nullable
    public GCPWebIdentitySetup getGcpConfig() {
        return gcpConfig;
    }

    public void setGcpConfig(@javax.annotation.Nullable GCPWebIdentitySetup gcpConfig) {
        this.gcpConfig = gcpConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageSetupInfo storageSetupInfo = (StorageSetupInfo) o;
        return Objects.equals(this.clusterType, storageSetupInfo.clusterType)
                && Objects.equals(this.storageType, storageSetupInfo.storageType)
                && Objects.equals(this.awsConfig, storageSetupInfo.awsConfig)
                && Objects.equals(this.gcpConfig, storageSetupInfo.gcpConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterType, storageType, awsConfig, gcpConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageSetupInfo {\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    awsConfig: ").append(toIndentedString(awsConfig)).append("\n");
        sb.append("    gcpConfig: ").append(toIndentedString(gcpConfig)).append("\n");
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
        openapiFields.add("cluster_type");
        openapiFields.add("storage_type");
        openapiFields.add("aws_config");
        openapiFields.add("gcp_config");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("cluster_type");
        openapiRequiredFields.add("storage_type");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to StorageSetupInfo
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!StorageSetupInfo.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in StorageSetupInfo is not found in the"
                                        + " empty JSON string",
                                StorageSetupInfo.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!StorageSetupInfo.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `StorageSetupInfo` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : StorageSetupInfo.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("cluster_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `cluster_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("cluster_type").toString()));
        }
        // validate the required field `cluster_type`
        ClusterTypeEnum.validateJsonElement(jsonObj.get("cluster_type"));
        if (!jsonObj.get("storage_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `storage_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("storage_type").toString()));
        }
        // validate the required field `storage_type`
        StorageTypeEnum.validateJsonElement(jsonObj.get("storage_type"));
        // validate the optional field `aws_config`
        if (jsonObj.get("aws_config") != null && !jsonObj.get("aws_config").isJsonNull()) {
            AWSAssumeRoleSetup.validateJsonElement(jsonObj.get("aws_config"));
        }
        // validate the optional field `gcp_config`
        if (jsonObj.get("gcp_config") != null && !jsonObj.get("gcp_config").isJsonNull()) {
            GCPWebIdentitySetup.validateJsonElement(jsonObj.get("gcp_config"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!StorageSetupInfo.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'StorageSetupInfo' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<StorageSetupInfo> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(StorageSetupInfo.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<StorageSetupInfo>() {
                        @Override
                        public void write(JsonWriter out, StorageSetupInfo value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public StorageSetupInfo read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of StorageSetupInfo given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of StorageSetupInfo
     * @throws IOException if the JSON string is invalid with respect to StorageSetupInfo
     */
    public static StorageSetupInfo fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, StorageSetupInfo.class);
    }

    /**
     * Convert an instance of StorageSetupInfo to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
