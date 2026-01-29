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
 * Setup information for AWS clusters using STS AssumeRole. ThoughtSpot will use its AWS IAM role to
 * assume your role in your AWS account. Example: { \&quot;thoughtspot_aws_account_id\&quot;:
 * \&quot;123456789012\&quot;, \&quot;trust_policy_template\&quot;: { \&quot;Version\&quot;:
 * \&quot;2012-10-17\&quot;, \&quot;Statement\&quot;: [{ \&quot;Effect\&quot;: \&quot;Allow\&quot;,
 * \&quot;Principal\&quot;: { \&quot;AWS\&quot;: \&quot;arn:aws:iam::123456789012:root\&quot; },
 * \&quot;Action\&quot;: \&quot;sts:AssumeRole\&quot;, \&quot;Condition\&quot;: {
 * \&quot;StringEquals\&quot;: { \&quot;sts:ExternalId\&quot;: \&quot;your-external-id\&quot; } } }]
 * }, \&quot;setup_instructions\&quot;: [ \&quot;1. Create an IAM role in your AWS account\&quot;,
 * \&quot;2. Copy the trust policy template and attach it to your role\&quot;, \&quot;3. Attach S3
 * permissions (s3:PutObject, s3:PutObjectAcl) to the role\&quot;, \&quot;4. Use the role ARN in
 * your webhook storage configuration\&quot; ] }
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AWSAssumeRoleSetup implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_THOUGHTSPOT_AWS_ACCOUNT_ID =
            "thoughtspot_aws_account_id";

    @SerializedName(SERIALIZED_NAME_THOUGHTSPOT_AWS_ACCOUNT_ID)
    @javax.annotation.Nonnull
    private String thoughtspotAwsAccountId;

    public static final String SERIALIZED_NAME_TRUST_POLICY_TEMPLATE = "trust_policy_template";

    @SerializedName(SERIALIZED_NAME_TRUST_POLICY_TEMPLATE)
    @javax.annotation.Nonnull
    private Object trustPolicyTemplate;

    public static final String SERIALIZED_NAME_SETUP_INSTRUCTIONS = "setup_instructions";

    @SerializedName(SERIALIZED_NAME_SETUP_INSTRUCTIONS)
    @javax.annotation.Nullable
    private List<String> setupInstructions;

    public AWSAssumeRoleSetup() {}

    public AWSAssumeRoleSetup thoughtspotAwsAccountId(
            @javax.annotation.Nonnull String thoughtspotAwsAccountId) {
        this.thoughtspotAwsAccountId = thoughtspotAwsAccountId;
        return this;
    }

    /**
     * ThoughtSpot&#39;s AWS Account ID. You must include this in your IAM role&#39;s trust policy
     * to allow ThoughtSpot to assume your role. Example: \&quot;123456789012\&quot;
     *
     * @return thoughtspotAwsAccountId
     */
    @javax.annotation.Nonnull
    public String getThoughtspotAwsAccountId() {
        return thoughtspotAwsAccountId;
    }

    public void setThoughtspotAwsAccountId(
            @javax.annotation.Nonnull String thoughtspotAwsAccountId) {
        this.thoughtspotAwsAccountId = thoughtspotAwsAccountId;
    }

    public AWSAssumeRoleSetup trustPolicyTemplate(
            @javax.annotation.Nonnull Object trustPolicyTemplate) {
        this.trustPolicyTemplate = trustPolicyTemplate;
        return this;
    }

    /**
     * Sample IAM trust policy JSON object that you should attach to your IAM role. The policy
     * includes ThoughtSpot&#39;s AWS Account ID and your External ID. Example: {
     * \&quot;Version\&quot;: \&quot;2012-10-17\&quot;, \&quot;Statement\&quot;: [{
     * \&quot;Effect\&quot;: \&quot;Allow\&quot;, \&quot;Principal\&quot;: { \&quot;AWS\&quot;:
     * \&quot;arn:aws:iam::123456789012:root\&quot; }, \&quot;Action\&quot;:
     * \&quot;sts:AssumeRole\&quot;, \&quot;Condition\&quot;: { \&quot;StringEquals\&quot;: {
     * \&quot;sts:ExternalId\&quot;: \&quot;your-external-id\&quot; } } }] }
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

    public AWSAssumeRoleSetup setupInstructions(
            @javax.annotation.Nullable List<String> setupInstructions) {
        this.setupInstructions = setupInstructions;
        return this;
    }

    public AWSAssumeRoleSetup addSetupInstructionsItem(String setupInstructionsItem) {
        if (this.setupInstructions == null) {
            this.setupInstructions = new ArrayList<>();
        }
        this.setupInstructions.add(setupInstructionsItem);
        return this;
    }

    /**
     * Step-by-step instructions to configure your AWS IAM role. Example: [\&quot;1. Create an IAM
     * role in your AWS account\&quot;, \&quot;2. Add the trust policy with ThoughtSpot&#39;s AWS
     * Account ID\&quot;]
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
        AWSAssumeRoleSetup awSAssumeRoleSetup = (AWSAssumeRoleSetup) o;
        return Objects.equals(
                        this.thoughtspotAwsAccountId, awSAssumeRoleSetup.thoughtspotAwsAccountId)
                && Objects.equals(this.trustPolicyTemplate, awSAssumeRoleSetup.trustPolicyTemplate)
                && Objects.equals(this.setupInstructions, awSAssumeRoleSetup.setupInstructions);
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
        return Objects.hash(thoughtspotAwsAccountId, trustPolicyTemplate, setupInstructions);
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
        sb.append("class AWSAssumeRoleSetup {\n");
        sb.append("    thoughtspotAwsAccountId: ")
                .append(toIndentedString(thoughtspotAwsAccountId))
                .append("\n");
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
        openapiFields.add("thoughtspot_aws_account_id");
        openapiFields.add("trust_policy_template");
        openapiFields.add("setup_instructions");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("thoughtspot_aws_account_id");
        openapiRequiredFields.add("trust_policy_template");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AWSAssumeRoleSetup
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AWSAssumeRoleSetup.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AWSAssumeRoleSetup is not found in"
                                        + " the empty JSON string",
                                AWSAssumeRoleSetup.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!AWSAssumeRoleSetup.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `AWSAssumeRoleSetup` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : AWSAssumeRoleSetup.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("thoughtspot_aws_account_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `thoughtspot_aws_account_id` to be a primitive"
                                    + " type in the JSON string but got `%s`",
                            jsonObj.get("thoughtspot_aws_account_id").toString()));
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
            if (!AWSAssumeRoleSetup.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AWSAssumeRoleSetup' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AWSAssumeRoleSetup> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AWSAssumeRoleSetup.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AWSAssumeRoleSetup>() {
                        @Override
                        public void write(JsonWriter out, AWSAssumeRoleSetup value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AWSAssumeRoleSetup read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AWSAssumeRoleSetup given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AWSAssumeRoleSetup
     * @throws IOException if the JSON string is invalid with respect to AWSAssumeRoleSetup
     */
    public static AWSAssumeRoleSetup fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AWSAssumeRoleSetup.class);
    }

    /**
     * Convert an instance of AWSAssumeRoleSetup to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
