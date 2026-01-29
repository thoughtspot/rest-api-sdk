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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Setup information for GCP clusters using STS AssumeRoleWithWebIdentity. ThoughtSpot will use its
 * GCP service account to obtain OIDC tokens for AWS access. Example: {
 * \&quot;thoughtspot_gcp_service_account_id\&quot;: \&quot;115663769112811637952\&quot;,
 * \&quot;oidc_provider\&quot;: \&quot;accounts.google.com\&quot;,
 * \&quot;trust_policy_template\&quot;: { \&quot;Version\&quot;: \&quot;2012-10-17\&quot;,
 * \&quot;Statement\&quot;: [{ \&quot;Effect\&quot;: \&quot;Allow\&quot;, \&quot;Principal\&quot;: {
 * \&quot;Federated\&quot;:
 * \&quot;arn:aws:iam::YOUR_AWS_ACCOUNT_ID:oidc-provider/accounts.google.com\&quot; },
 * \&quot;Action\&quot;: \&quot;sts:AssumeRoleWithWebIdentity\&quot;, \&quot;Condition\&quot;: {
 * \&quot;StringEquals\&quot;: { \&quot;accounts.google.com:sub\&quot;:
 * \&quot;115663769112811637952\&quot; } } }] }, \&quot;setup_instructions\&quot;: [ \&quot;1. Add
 * accounts.google.com as an Identity Provider in AWS IAM\&quot;, \&quot;2. Create an IAM role with
 * Web Identity Federation trust\&quot;, \&quot;3. Configure the trust policy with ThoughtSpot&#39;s
 * GCP service account ID\&quot;, \&quot;4. Attach S3 permissions (s3:PutObject, s3:PutObjectAcl) to
 * the role\&quot;, \&quot;5. Use the role ARN in your webhook storage configuration\&quot; ] }
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GCPWebIdentitySetup implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_THOUGHTSPOT_GCP_SERVICE_ACCOUNT_ID =
            "thoughtspot_gcp_service_account_id";

    @SerializedName(SERIALIZED_NAME_THOUGHTSPOT_GCP_SERVICE_ACCOUNT_ID)
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    private List<String> setupInstructions;

    public GCPWebIdentitySetup() {}

    public GCPWebIdentitySetup thoughtspotGcpServiceAccountId(
            @javax.annotation.Nonnull String thoughtspotGcpServiceAccountId) {
        this.thoughtspotGcpServiceAccountId = thoughtspotGcpServiceAccountId;
        return this;
    }

    /**
     * ThoughtSpot&#39;s GCP service account unique ID (numeric). This is the &#39;sub&#39; claim in
     * OIDC tokens and must be included in your IAM role&#39;s trust policy condition. Example:
     * \&quot;115663769112811637952\&quot;
     *
     * @return thoughtspotGcpServiceAccountId
     */
    @javax.annotation.Nonnull
    public String getThoughtspotGcpServiceAccountId() {
        return thoughtspotGcpServiceAccountId;
    }

    public void setThoughtspotGcpServiceAccountId(
            @javax.annotation.Nonnull String thoughtspotGcpServiceAccountId) {
        this.thoughtspotGcpServiceAccountId = thoughtspotGcpServiceAccountId;
    }

    public GCPWebIdentitySetup oidcProvider(@javax.annotation.Nullable String oidcProvider) {
        this.oidcProvider = oidcProvider;
        return this;
    }

    /**
     * The OIDC identity provider URL. For GCP, this is always &#39;accounts.google.com&#39;. You
     * must configure this as an Identity Provider in AWS IAM. Example:
     * \&quot;accounts.google.com\&quot;
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

    public GCPWebIdentitySetup trustPolicyTemplate(
            @javax.annotation.Nonnull Object trustPolicyTemplate) {
        this.trustPolicyTemplate = trustPolicyTemplate;
        return this;
    }

    /**
     * Sample IAM trust policy JSON object for Web Identity Federation. This policy allows
     * ThoughtSpot&#39;s GCP service account to assume your AWS role. Example: {
     * \&quot;Version\&quot;: \&quot;2012-10-17\&quot;, \&quot;Statement\&quot;: [{
     * \&quot;Effect\&quot;: \&quot;Allow\&quot;, \&quot;Principal\&quot;: {
     * \&quot;Federated\&quot;:
     * \&quot;arn:aws:iam::YOUR_AWS_ACCOUNT_ID:oidc-provider/accounts.google.com\&quot; },
     * \&quot;Action\&quot;: \&quot;sts:AssumeRoleWithWebIdentity\&quot;, \&quot;Condition\&quot;: {
     * \&quot;StringEquals\&quot;: { \&quot;accounts.google.com:sub\&quot;:
     * \&quot;115663769112811637952\&quot; } } }] }
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

    public GCPWebIdentitySetup setupInstructions(
            @javax.annotation.Nullable List<String> setupInstructions) {
        this.setupInstructions = setupInstructions;
        return this;
    }

    public GCPWebIdentitySetup addSetupInstructionsItem(String setupInstructionsItem) {
        if (this.setupInstructions == null) {
            this.setupInstructions = new ArrayList<>();
        }
        this.setupInstructions.add(setupInstructionsItem);
        return this;
    }

    /**
     * Step-by-step instructions to configure AWS for GCP Web Identity Federation. Example:
     * [\&quot;1. Add accounts.google.com as an Identity Provider in AWS IAM\&quot;, \&quot;2.
     * Create an IAM role with Web Identity Federation trust\&quot;]
     *
     * @return setupInstructions
     */
    @javax.annotation.Nullable
    public List<String> getSetupInstructions() {
        return setupInstructions;
    }

    public void setSetupInstructions(@javax.annotation.Nullable List<String> setupInstructions) {
        this.setupInstructions = setupInstructions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GCPWebIdentitySetup gcPWebIdentitySetup = (GCPWebIdentitySetup) o;
        return Objects.equals(
                        this.thoughtspotGcpServiceAccountId,
                        gcPWebIdentitySetup.thoughtspotGcpServiceAccountId)
                && Objects.equals(this.oidcProvider, gcPWebIdentitySetup.oidcProvider)
                && Objects.equals(this.trustPolicyTemplate, gcPWebIdentitySetup.trustPolicyTemplate)
                && Objects.equals(this.setupInstructions, gcPWebIdentitySetup.setupInstructions);
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
                thoughtspotGcpServiceAccountId,
                oidcProvider,
                trustPolicyTemplate,
                setupInstructions);
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
        sb.append("class GCPWebIdentitySetup {\n");
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
        openapiFields.add("thoughtspot_gcp_service_account_id");
        openapiFields.add("oidc_provider");
        openapiFields.add("trust_policy_template");
        openapiFields.add("setup_instructions");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("thoughtspot_gcp_service_account_id");
        openapiRequiredFields.add("trust_policy_template");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to GCPWebIdentitySetup
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GCPWebIdentitySetup.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in GCPWebIdentitySetup is not found in"
                                        + " the empty JSON string",
                                GCPWebIdentitySetup.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!GCPWebIdentitySetup.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `GCPWebIdentitySetup` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : GCPWebIdentitySetup.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("thoughtspot_gcp_service_account_id").isJsonPrimitive()) {
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
        // ensure the optional json data is an array if present
        if (jsonObj.get("setup_instructions") != null
                && !jsonObj.get("setup_instructions").isJsonNull()
                && !jsonObj.get("setup_instructions").isJsonArray()) {
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
            if (!GCPWebIdentitySetup.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GCPWebIdentitySetup' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GCPWebIdentitySetup> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(GCPWebIdentitySetup.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GCPWebIdentitySetup>() {
                        @Override
                        public void write(JsonWriter out, GCPWebIdentitySetup value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GCPWebIdentitySetup read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GCPWebIdentitySetup given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GCPWebIdentitySetup
     * @throws IOException if the JSON string is invalid with respect to GCPWebIdentitySetup
     */
    public static GCPWebIdentitySetup fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GCPWebIdentitySetup.class);
    }

    /**
     * Convert an instance of GCPWebIdentitySetup to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
