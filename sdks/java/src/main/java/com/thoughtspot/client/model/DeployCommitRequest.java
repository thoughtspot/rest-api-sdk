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

/** DeployCommitRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DeployCommitRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_COMMIT_ID = "commit_id";

    @SerializedName(SERIALIZED_NAME_COMMIT_ID)
    @javax.annotation.Nullable
    private String commitId;

    public static final String SERIALIZED_NAME_BRANCH_NAME = "branch_name";

    @SerializedName(SERIALIZED_NAME_BRANCH_NAME)
    @javax.annotation.Nonnull
    private String branchName;

    /**
     * Indicates if all files or only modified file at specified commit point should be considered
     */
    @JsonAdapter(DeployTypeEnum.Adapter.class)
    public enum DeployTypeEnum {
        FULL("FULL"),

        DELTA("DELTA");

        private String value;

        DeployTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DeployTypeEnum fromValue(String value) {
            for (DeployTypeEnum b : DeployTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<DeployTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final DeployTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DeployTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DeployTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            DeployTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_DEPLOY_TYPE = "deploy_type";

    @SerializedName(SERIALIZED_NAME_DEPLOY_TYPE)
    @javax.annotation.Nullable
    private DeployTypeEnum deployType = DeployTypeEnum.DELTA;

    /**
     * Define the policy to follow while importing TML in the ThoughtSpot environment. Use
     * “ALL_OR_NONE” to cancel the deployment of all ThoughtSpot objects if at least one of them
     * fails to import. Use “Partial” to import ThoughtSpot objects that validate successfully even
     * if other objects in the same deploy operations fail to import.
     */
    @JsonAdapter(DeployPolicyEnum.Adapter.class)
    public enum DeployPolicyEnum {
        ALL_OR_NONE("ALL_OR_NONE"),

        PARTIAL("PARTIAL"),

        VALIDATE_ONLY("VALIDATE_ONLY");

        private String value;

        DeployPolicyEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DeployPolicyEnum fromValue(String value) {
            for (DeployPolicyEnum b : DeployPolicyEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<DeployPolicyEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final DeployPolicyEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DeployPolicyEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DeployPolicyEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            DeployPolicyEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_DEPLOY_POLICY = "deploy_policy";

    @SerializedName(SERIALIZED_NAME_DEPLOY_POLICY)
    @javax.annotation.Nullable
    private DeployPolicyEnum deployPolicy = DeployPolicyEnum.ALL_OR_NONE;

    public DeployCommitRequest() {}

    public DeployCommitRequest commitId(@javax.annotation.Nullable String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * Commit_id against which the files should be picked to deploy. Note: If no commit_id is
     * specified, then the head of the branch is considered.
     *
     * @return commitId
     */
    @javax.annotation.Nullable
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(@javax.annotation.Nullable String commitId) {
        this.commitId = commitId;
    }

    public DeployCommitRequest branchName(@javax.annotation.Nonnull String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * Name of the remote branch where changes should be picked
     *
     * @return branchName
     */
    @javax.annotation.Nonnull
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(@javax.annotation.Nonnull String branchName) {
        this.branchName = branchName;
    }

    public DeployCommitRequest deployType(@javax.annotation.Nullable DeployTypeEnum deployType) {
        this.deployType = deployType;
        return this;
    }

    /**
     * Indicates if all files or only modified file at specified commit point should be considered
     *
     * @return deployType
     */
    @javax.annotation.Nullable
    public DeployTypeEnum getDeployType() {
        return deployType;
    }

    public void setDeployType(@javax.annotation.Nullable DeployTypeEnum deployType) {
        this.deployType = deployType;
    }

    public DeployCommitRequest deployPolicy(
            @javax.annotation.Nullable DeployPolicyEnum deployPolicy) {
        this.deployPolicy = deployPolicy;
        return this;
    }

    /**
     * Define the policy to follow while importing TML in the ThoughtSpot environment. Use
     * “ALL_OR_NONE” to cancel the deployment of all ThoughtSpot objects if at least one of them
     * fails to import. Use “Partial” to import ThoughtSpot objects that validate successfully even
     * if other objects in the same deploy operations fail to import.
     *
     * @return deployPolicy
     */
    @javax.annotation.Nullable
    public DeployPolicyEnum getDeployPolicy() {
        return deployPolicy;
    }

    public void setDeployPolicy(@javax.annotation.Nullable DeployPolicyEnum deployPolicy) {
        this.deployPolicy = deployPolicy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeployCommitRequest deployCommitRequest = (DeployCommitRequest) o;
        return Objects.equals(this.commitId, deployCommitRequest.commitId)
                && Objects.equals(this.branchName, deployCommitRequest.branchName)
                && Objects.equals(this.deployType, deployCommitRequest.deployType)
                && Objects.equals(this.deployPolicy, deployCommitRequest.deployPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commitId, branchName, deployType, deployPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployCommitRequest {\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    deployPolicy: ").append(toIndentedString(deployPolicy)).append("\n");
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
        openapiFields.add("commit_id");
        openapiFields.add("branch_name");
        openapiFields.add("deploy_type");
        openapiFields.add("deploy_policy");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("branch_name");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to DeployCommitRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DeployCommitRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DeployCommitRequest is not found in"
                                        + " the empty JSON string",
                                DeployCommitRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!DeployCommitRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `DeployCommitRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : DeployCommitRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("commit_id") != null && !jsonObj.get("commit_id").isJsonNull())
                && !jsonObj.get("commit_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `commit_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("commit_id").toString()));
        }
        if (!jsonObj.get("branch_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `branch_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("branch_name").toString()));
        }
        if ((jsonObj.get("deploy_type") != null && !jsonObj.get("deploy_type").isJsonNull())
                && !jsonObj.get("deploy_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `deploy_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("deploy_type").toString()));
        }
        // validate the optional field `deploy_type`
        if (jsonObj.get("deploy_type") != null && !jsonObj.get("deploy_type").isJsonNull()) {
            DeployTypeEnum.validateJsonElement(jsonObj.get("deploy_type"));
        }
        if ((jsonObj.get("deploy_policy") != null && !jsonObj.get("deploy_policy").isJsonNull())
                && !jsonObj.get("deploy_policy").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `deploy_policy` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("deploy_policy").toString()));
        }
        // validate the optional field `deploy_policy`
        if (jsonObj.get("deploy_policy") != null && !jsonObj.get("deploy_policy").isJsonNull()) {
            DeployPolicyEnum.validateJsonElement(jsonObj.get("deploy_policy"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DeployCommitRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DeployCommitRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DeployCommitRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(DeployCommitRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DeployCommitRequest>() {
                        @Override
                        public void write(JsonWriter out, DeployCommitRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DeployCommitRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DeployCommitRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DeployCommitRequest
     * @throws IOException if the JSON string is invalid with respect to DeployCommitRequest
     */
    public static DeployCommitRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DeployCommitRequest.class);
    }

    /**
     * Convert an instance of DeployCommitRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
