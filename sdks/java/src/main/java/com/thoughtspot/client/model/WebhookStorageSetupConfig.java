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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Storage setup configuration for a specific upload path. The populated fields depend on
 * config_type: AWS_TO_S3_STORAGE: aws_account_id, trust_policy_template, setup_instructions.
 * GCP_TO_S3_STORAGE: gcp_service_account_id, oidc_provider, trust_policy_template,
 * setup_instructions. GCP_TO_GCS_STORAGE: service_account_email, required_role, setup_instructions.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class WebhookStorageSetupConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Discriminator identifying the upload path. One of: AWS_TO_S3_STORAGE, GCP_TO_S3_STORAGE,
     * GCP_TO_GCS_STORAGE.
     */
    @JsonAdapter(ConfigTypeEnum.Adapter.class)
    public enum ConfigTypeEnum {
        AWS_TO_S3_STORAGE("AWS_TO_S3_STORAGE"),

        GCP_TO_S3_STORAGE("GCP_TO_S3_STORAGE"),

        GCP_TO_GCS_STORAGE("GCP_TO_GCS_STORAGE");

        private String value;

        ConfigTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ConfigTypeEnum fromValue(String value) {
            for (ConfigTypeEnum b : ConfigTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ConfigTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ConfigTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ConfigTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ConfigTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ConfigTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_CONFIG_TYPE = "config_type";

    @SerializedName(SERIALIZED_NAME_CONFIG_TYPE)
    @javax.annotation.Nonnull
    private ConfigTypeEnum configType;

    public static final String SERIALIZED_NAME_AWS_ACCOUNT_ID = "aws_account_id";

    @SerializedName(SERIALIZED_NAME_AWS_ACCOUNT_ID)
    @javax.annotation.Nullable
    private String awsAccountId;

    public static final String SERIALIZED_NAME_GCP_SERVICE_ACCOUNT_ID = "gcp_service_account_id";

    @SerializedName(SERIALIZED_NAME_GCP_SERVICE_ACCOUNT_ID)
    @javax.annotation.Nullable
    private String gcpServiceAccountId;

    public static final String SERIALIZED_NAME_OIDC_PROVIDER = "oidc_provider";

    @SerializedName(SERIALIZED_NAME_OIDC_PROVIDER)
    @javax.annotation.Nullable
    private String oidcProvider;

    public static final String SERIALIZED_NAME_TRUST_POLICY_TEMPLATE = "trust_policy_template";

    @SerializedName(SERIALIZED_NAME_TRUST_POLICY_TEMPLATE)
    @javax.annotation.Nullable
    private Object trustPolicyTemplate = null;

    public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_EMAIL = "service_account_email";

    @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_EMAIL)
    @javax.annotation.Nullable
    private String serviceAccountEmail;

    public static final String SERIALIZED_NAME_REQUIRED_ROLE = "required_role";

    @SerializedName(SERIALIZED_NAME_REQUIRED_ROLE)
    @javax.annotation.Nullable
    private String requiredRole;

    public static final String SERIALIZED_NAME_SETUP_INSTRUCTIONS = "setup_instructions";

    @SerializedName(SERIALIZED_NAME_SETUP_INSTRUCTIONS)
    @javax.annotation.Nonnull
    private List<String> setupInstructions;

    public WebhookStorageSetupConfig() {}

    public WebhookStorageSetupConfig configType(
            @javax.annotation.Nonnull ConfigTypeEnum configType) {
        this.configType = configType;
        return this;
    }

    /**
     * Discriminator identifying the upload path. One of: AWS_TO_S3_STORAGE, GCP_TO_S3_STORAGE,
     * GCP_TO_GCS_STORAGE.
     *
     * @return configType
     */
    @javax.annotation.Nonnull
    public ConfigTypeEnum getConfigType() {
        return configType;
    }

    public void setConfigType(@javax.annotation.Nonnull ConfigTypeEnum configType) {
        this.configType = configType;
    }

    public WebhookStorageSetupConfig awsAccountId(@javax.annotation.Nullable String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * AWS Account ID of the platform. Populated for AWS_TO_S3_STORAGE. Include in your IAM role
     * trust policy.
     *
     * @return awsAccountId
     */
    @javax.annotation.Nullable
    public String getAwsAccountId() {
        return awsAccountId;
    }

    public void setAwsAccountId(@javax.annotation.Nullable String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    public WebhookStorageSetupConfig gcpServiceAccountId(
            @javax.annotation.Nullable String gcpServiceAccountId) {
        this.gcpServiceAccountId = gcpServiceAccountId;
        return this;
    }

    /**
     * GCP service account numeric ID of the platform (the &#39;sub&#39; claim in OIDC tokens).
     * Populated for GCP_TO_S3_STORAGE.
     *
     * @return gcpServiceAccountId
     */
    @javax.annotation.Nullable
    public String getGcpServiceAccountId() {
        return gcpServiceAccountId;
    }

    public void setGcpServiceAccountId(@javax.annotation.Nullable String gcpServiceAccountId) {
        this.gcpServiceAccountId = gcpServiceAccountId;
    }

    public WebhookStorageSetupConfig oidcProvider(@javax.annotation.Nullable String oidcProvider) {
        this.oidcProvider = oidcProvider;
        return this;
    }

    /**
     * OIDC identity provider URL. Populated for GCP_TO_S3_STORAGE; always
     * &#39;accounts.google.com&#39; for GCP.
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

    public WebhookStorageSetupConfig trustPolicyTemplate(
            @javax.annotation.Nullable Object trustPolicyTemplate) {
        this.trustPolicyTemplate = trustPolicyTemplate;
        return this;
    }

    /**
     * Sample IAM trust policy JSON. Populated for AWS_TO_S3_STORAGE and GCP_TO_S3_STORAGE.
     *
     * @return trustPolicyTemplate
     */
    @javax.annotation.Nullable
    public Object getTrustPolicyTemplate() {
        return trustPolicyTemplate;
    }

    public void setTrustPolicyTemplate(@javax.annotation.Nullable Object trustPolicyTemplate) {
        this.trustPolicyTemplate = trustPolicyTemplate;
    }

    public WebhookStorageSetupConfig serviceAccountEmail(
            @javax.annotation.Nullable String serviceAccountEmail) {
        this.serviceAccountEmail = serviceAccountEmail;
        return this;
    }

    /**
     * GCP service account email of the platform. Populated for GCP_TO_GCS_STORAGE. Grant it
     * roles/iam.serviceAccountTokenCreator on your service account.
     *
     * @return serviceAccountEmail
     */
    @javax.annotation.Nullable
    public String getServiceAccountEmail() {
        return serviceAccountEmail;
    }

    public void setServiceAccountEmail(@javax.annotation.Nullable String serviceAccountEmail) {
        this.serviceAccountEmail = serviceAccountEmail;
    }

    public WebhookStorageSetupConfig requiredRole(@javax.annotation.Nullable String requiredRole) {
        this.requiredRole = requiredRole;
        return this;
    }

    /**
     * IAM role the customer must grant to the platform service account. Populated for
     * GCP_TO_GCS_STORAGE.
     *
     * @return requiredRole
     */
    @javax.annotation.Nullable
    public String getRequiredRole() {
        return requiredRole;
    }

    public void setRequiredRole(@javax.annotation.Nullable String requiredRole) {
        this.requiredRole = requiredRole;
    }

    public WebhookStorageSetupConfig setupInstructions(
            @javax.annotation.Nonnull List<String> setupInstructions) {
        this.setupInstructions = setupInstructions;
        return this;
    }

    public WebhookStorageSetupConfig addSetupInstructionsItem(String setupInstructionsItem) {
        if (this.setupInstructions == null) {
            this.setupInstructions = new ArrayList<>();
        }
        this.setupInstructions.add(setupInstructionsItem);
        return this;
    }

    /**
     * Step-by-step instructions to configure the storage destination.
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
     * @return the WebhookStorageSetupConfig instance itself
     */
    public WebhookStorageSetupConfig putAdditionalProperty(String key, Object value) {
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
        WebhookStorageSetupConfig webhookStorageSetupConfig = (WebhookStorageSetupConfig) o;
        return Objects.equals(this.configType, webhookStorageSetupConfig.configType)
                && Objects.equals(this.awsAccountId, webhookStorageSetupConfig.awsAccountId)
                && Objects.equals(
                        this.gcpServiceAccountId, webhookStorageSetupConfig.gcpServiceAccountId)
                && Objects.equals(this.oidcProvider, webhookStorageSetupConfig.oidcProvider)
                && Objects.equals(
                        this.trustPolicyTemplate, webhookStorageSetupConfig.trustPolicyTemplate)
                && Objects.equals(
                        this.serviceAccountEmail, webhookStorageSetupConfig.serviceAccountEmail)
                && Objects.equals(this.requiredRole, webhookStorageSetupConfig.requiredRole)
                && Objects.equals(
                        this.setupInstructions, webhookStorageSetupConfig.setupInstructions)
                && Objects.equals(
                        this.additionalProperties, webhookStorageSetupConfig.additionalProperties);
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
                configType,
                awsAccountId,
                gcpServiceAccountId,
                oidcProvider,
                trustPolicyTemplate,
                serviceAccountEmail,
                requiredRole,
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
        sb.append("class WebhookStorageSetupConfig {\n");
        sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
        sb.append("    awsAccountId: ").append(toIndentedString(awsAccountId)).append("\n");
        sb.append("    gcpServiceAccountId: ")
                .append(toIndentedString(gcpServiceAccountId))
                .append("\n");
        sb.append("    oidcProvider: ").append(toIndentedString(oidcProvider)).append("\n");
        sb.append("    trustPolicyTemplate: ")
                .append(toIndentedString(trustPolicyTemplate))
                .append("\n");
        sb.append("    serviceAccountEmail: ")
                .append(toIndentedString(serviceAccountEmail))
                .append("\n");
        sb.append("    requiredRole: ").append(toIndentedString(requiredRole)).append("\n");
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
        openapiFields.add("config_type");
        openapiFields.add("aws_account_id");
        openapiFields.add("gcp_service_account_id");
        openapiFields.add("oidc_provider");
        openapiFields.add("trust_policy_template");
        openapiFields.add("service_account_email");
        openapiFields.add("required_role");
        openapiFields.add("setup_instructions");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("config_type");
        openapiRequiredFields.add("setup_instructions");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to WebhookStorageSetupConfig
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!WebhookStorageSetupConfig.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in WebhookStorageSetupConfig is not"
                                        + " found in the empty JSON string",
                                WebhookStorageSetupConfig.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : WebhookStorageSetupConfig.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("config_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `config_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("config_type").toString()));
        }
        // validate the required field `config_type`
        ConfigTypeEnum.validateJsonElement(jsonObj.get("config_type"));
        if ((jsonObj.get("aws_account_id") != null && !jsonObj.get("aws_account_id").isJsonNull())
                && !jsonObj.get("aws_account_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `aws_account_id` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("aws_account_id").toString()));
        }
        if ((jsonObj.get("gcp_service_account_id") != null
                        && !jsonObj.get("gcp_service_account_id").isJsonNull())
                && !jsonObj.get("gcp_service_account_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `gcp_service_account_id` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("gcp_service_account_id").toString()));
        }
        if ((jsonObj.get("oidc_provider") != null && !jsonObj.get("oidc_provider").isJsonNull())
                && !jsonObj.get("oidc_provider").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `oidc_provider` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("oidc_provider").toString()));
        }
        if ((jsonObj.get("service_account_email") != null
                        && !jsonObj.get("service_account_email").isJsonNull())
                && !jsonObj.get("service_account_email").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `service_account_email` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("service_account_email").toString()));
        }
        if ((jsonObj.get("required_role") != null && !jsonObj.get("required_role").isJsonNull())
                && !jsonObj.get("required_role").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `required_role` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("required_role").toString()));
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
            if (!WebhookStorageSetupConfig.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WebhookStorageSetupConfig' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WebhookStorageSetupConfig> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(WebhookStorageSetupConfig.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<WebhookStorageSetupConfig>() {
                        @Override
                        public void write(JsonWriter out, WebhookStorageSetupConfig value)
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
                        public WebhookStorageSetupConfig read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            WebhookStorageSetupConfig instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of WebhookStorageSetupConfig given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of WebhookStorageSetupConfig
     * @throws IOException if the JSON string is invalid with respect to WebhookStorageSetupConfig
     */
    public static WebhookStorageSetupConfig fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WebhookStorageSetupConfig.class);
    }

    /**
     * Convert an instance of WebhookStorageSetupConfig to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
