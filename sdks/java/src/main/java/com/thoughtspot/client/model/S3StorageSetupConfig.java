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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * S3 storage setup configuration containing ThoughtSpot-managed fields required for cross-account
 * storage access setup.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class S3StorageSetupConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_THOUGHTSPOT_AWS_ACCOUNT_ID =
            "thoughtspot_aws_account_id";

    @SerializedName(SERIALIZED_NAME_THOUGHTSPOT_AWS_ACCOUNT_ID)
    @javax.annotation.Nullable
    private String thoughtspotAwsAccountId;

    public static final String SERIALIZED_NAME_THOUGHTSPOT_GCP_SERVICE_ACCOUNT_ID =
            "thoughtspot_gcp_service_account_id";

    @SerializedName(SERIALIZED_NAME_THOUGHTSPOT_GCP_SERVICE_ACCOUNT_ID)
    @javax.annotation.Nullable
    private String thoughtspotGcpServiceAccountId;

    public static final String SERIALIZED_NAME_OIDC_PROVIDER = "oidc_provider";

    @SerializedName(SERIALIZED_NAME_OIDC_PROVIDER)
    @javax.annotation.Nullable
    private String oidcProvider;

    public static final String SERIALIZED_NAME_TRUST_POLICY_TEMPLATE = "trust_policy_template";

    @SerializedName(SERIALIZED_NAME_TRUST_POLICY_TEMPLATE)
    @javax.annotation.Nonnull
    private Object trustPolicyTemplate;

    public static final String SERIALIZED_NAME_SETUP_INSTRUCTIONS = "setup_instructions";

    @SerializedName(SERIALIZED_NAME_SETUP_INSTRUCTIONS)
    @javax.annotation.Nonnull
    private List<String> setupInstructions;

    public S3StorageSetupConfig() {}

    public S3StorageSetupConfig thoughtspotAwsAccountId(
            @javax.annotation.Nullable String thoughtspotAwsAccountId) {
        this.thoughtspotAwsAccountId = thoughtspotAwsAccountId;
        return this;
    }

    /**
     * ThoughtSpot&#39;s AWS account ID to use in the trust policy. Populated for AWS clusters.
     *
     * @return thoughtspotAwsAccountId
     */
    @javax.annotation.Nullable
    public String getThoughtspotAwsAccountId() {
        return thoughtspotAwsAccountId;
    }

    public void setThoughtspotAwsAccountId(
            @javax.annotation.Nullable String thoughtspotAwsAccountId) {
        this.thoughtspotAwsAccountId = thoughtspotAwsAccountId;
    }

    public S3StorageSetupConfig thoughtspotGcpServiceAccountId(
            @javax.annotation.Nullable String thoughtspotGcpServiceAccountId) {
        this.thoughtspotGcpServiceAccountId = thoughtspotGcpServiceAccountId;
        return this;
    }

    /**
     * ThoughtSpot&#39;s GCP service account ID for workload identity federation. Populated for GCP
     * clusters.
     *
     * @return thoughtspotGcpServiceAccountId
     */
    @javax.annotation.Nullable
    public String getThoughtspotGcpServiceAccountId() {
        return thoughtspotGcpServiceAccountId;
    }

    public void setThoughtspotGcpServiceAccountId(
            @javax.annotation.Nullable String thoughtspotGcpServiceAccountId) {
        this.thoughtspotGcpServiceAccountId = thoughtspotGcpServiceAccountId;
    }

    public S3StorageSetupConfig oidcProvider(@javax.annotation.Nullable String oidcProvider) {
        this.oidcProvider = oidcProvider;
        return this;
    }

    /**
     * OIDC provider URL for GCP workload identity federation. Populated for GCP clusters.
     *
     * @return oidcProvider
     */
    @javax.annotation.Nullable
    public String getOidcProvider() {
        return oidcProvider;
    }

    public void setOidcProvider(@javax.annotation.Nullable String oidcProvider) {
        this.oidcProvider = oidcProvider;
    }

    public S3StorageSetupConfig trustPolicyTemplate(
            @javax.annotation.Nonnull Object trustPolicyTemplate) {
        this.trustPolicyTemplate = trustPolicyTemplate;
        return this;
    }

    /**
     * IAM trust policy template to attach to the cross-account role.
     *
     * @return trustPolicyTemplate
     */
    @javax.annotation.Nonnull
    public Object getTrustPolicyTemplate() {
        return trustPolicyTemplate;
    }

    public void setTrustPolicyTemplate(@javax.annotation.Nonnull Object trustPolicyTemplate) {
        this.trustPolicyTemplate = trustPolicyTemplate;
    }

    public S3StorageSetupConfig setupInstructions(
            @javax.annotation.Nonnull List<String> setupInstructions) {
        this.setupInstructions = setupInstructions;
        return this;
    }

    public S3StorageSetupConfig addSetupInstructionsItem(String setupInstructionsItem) {
        if (this.setupInstructions == null) {
            this.setupInstructions = new ArrayList<>();
        }
        this.setupInstructions.add(setupInstructionsItem);
        return this;
    }

    /**
     * Step-by-step instructions for configuring storage access.
     *
     * @return setupInstructions
     */
    @javax.annotation.Nonnull
    public List<String> getSetupInstructions() {
        return setupInstructions;
    }

    public void setSetupInstructions(@javax.annotation.Nonnull List<String> setupInstructions) {
        this.setupInstructions = setupInstructions;
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
     * @return the S3StorageSetupConfig instance itself
     */
    public S3StorageSetupConfig putAdditionalProperty(String key, Object value) {
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
        S3StorageSetupConfig s3StorageSetupConfig = (S3StorageSetupConfig) o;
        return Objects.equals(
                        this.thoughtspotAwsAccountId, s3StorageSetupConfig.thoughtspotAwsAccountId)
                && Objects.equals(
                        this.thoughtspotGcpServiceAccountId,
                        s3StorageSetupConfig.thoughtspotGcpServiceAccountId)
                && Objects.equals(this.oidcProvider, s3StorageSetupConfig.oidcProvider)
                && Objects.equals(
                        this.trustPolicyTemplate, s3StorageSetupConfig.trustPolicyTemplate)
                && Objects.equals(this.setupInstructions, s3StorageSetupConfig.setupInstructions)
                && Objects.equals(
                        this.additionalProperties, s3StorageSetupConfig.additionalProperties);
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
                thoughtspotAwsAccountId,
                thoughtspotGcpServiceAccountId,
                oidcProvider,
                trustPolicyTemplate,
                setupInstructions,
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
        sb.append("class S3StorageSetupConfig {\n");
        sb.append("    thoughtspotAwsAccountId: ")
                .append(toIndentedString(thoughtspotAwsAccountId))
                .append("\n");
        sb.append("    thoughtspotGcpServiceAccountId: ")
                .append(toIndentedString(thoughtspotGcpServiceAccountId))
                .append("\n");
        sb.append("    oidcProvider: ").append(toIndentedString(oidcProvider)).append("\n");
        sb.append("    trustPolicyTemplate: ")
                .append(toIndentedString(trustPolicyTemplate))
                .append("\n");
        sb.append("    setupInstructions: ")
                .append(toIndentedString(setupInstructions))
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
        openapiFields.add("thoughtspot_aws_account_id");
        openapiFields.add("thoughtspot_gcp_service_account_id");
        openapiFields.add("oidc_provider");
        openapiFields.add("trust_policy_template");
        openapiFields.add("setup_instructions");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("trust_policy_template");
        openapiRequiredFields.add("setup_instructions");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to S3StorageSetupConfig
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!S3StorageSetupConfig.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in S3StorageSetupConfig is not found in"
                                        + " the empty JSON string",
                                S3StorageSetupConfig.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : S3StorageSetupConfig.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("thoughtspot_aws_account_id") != null
                        && !jsonObj.get("thoughtspot_aws_account_id").isJsonNull())
                && !jsonObj.get("thoughtspot_aws_account_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `thoughtspot_aws_account_id` to be a primitive"
                                    + " type in the JSON string but got `%s`",
                            jsonObj.get("thoughtspot_aws_account_id").toString()));
        }
        if ((jsonObj.get("thoughtspot_gcp_service_account_id") != null
                        && !jsonObj.get("thoughtspot_gcp_service_account_id").isJsonNull())
                && !jsonObj.get("thoughtspot_gcp_service_account_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `thoughtspot_gcp_service_account_id` to be a"
                                    + " primitive type in the JSON string but got `%s`",
                            jsonObj.get("thoughtspot_gcp_service_account_id").toString()));
        }
        if ((jsonObj.get("oidc_provider") != null && !jsonObj.get("oidc_provider").isJsonNull())
                && !jsonObj.get("oidc_provider").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `oidc_provider` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("oidc_provider").toString()));
        }
        // ensure the required json array is present
        if (jsonObj.get("setup_instructions") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("setup_instructions").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `setup_instructions` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("setup_instructions").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!S3StorageSetupConfig.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'S3StorageSetupConfig' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<S3StorageSetupConfig> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(S3StorageSetupConfig.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<S3StorageSetupConfig>() {
                        @Override
                        public void write(JsonWriter out, S3StorageSetupConfig value)
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
                        public S3StorageSetupConfig read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            S3StorageSetupConfig instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of S3StorageSetupConfig given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of S3StorageSetupConfig
     * @throws IOException if the JSON string is invalid with respect to S3StorageSetupConfig
     */
    public static S3StorageSetupConfig fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, S3StorageSetupConfig.class);
    }

    /**
     * Convert an instance of S3StorageSetupConfig to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
