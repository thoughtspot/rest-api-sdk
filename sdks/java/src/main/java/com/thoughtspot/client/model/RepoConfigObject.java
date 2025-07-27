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

/** RepoConfigObject */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class RepoConfigObject implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_REPOSITORY_URL = "repository_url";

    @SerializedName(SERIALIZED_NAME_REPOSITORY_URL)
    @javax.annotation.Nullable
    private String repositoryUrl;

    public static final String SERIALIZED_NAME_USERNAME = "username";

    @SerializedName(SERIALIZED_NAME_USERNAME)
    @javax.annotation.Nullable
    private String username;

    public static final String SERIALIZED_NAME_COMMIT_BRANCH_NAME = "commit_branch_name";

    @SerializedName(SERIALIZED_NAME_COMMIT_BRANCH_NAME)
    @javax.annotation.Nullable
    private String commitBranchName;

    public static final String SERIALIZED_NAME_BRANCHES = "branches";

    @SerializedName(SERIALIZED_NAME_BRANCHES)
    @javax.annotation.Nullable
    private List<String> branches;

    public static final String SERIALIZED_NAME_ENABLE_GUID_MAPPING = "enable_guid_mapping";

    @SerializedName(SERIALIZED_NAME_ENABLE_GUID_MAPPING)
    @javax.annotation.Nullable
    private Boolean enableGuidMapping;

    public static final String SERIALIZED_NAME_CONFIGURATION_BRANCH_NAME =
            "configuration_branch_name";

    @SerializedName(SERIALIZED_NAME_CONFIGURATION_BRANCH_NAME)
    @javax.annotation.Nullable
    private String configurationBranchName;

    public static final String SERIALIZED_NAME_ORG = "org";

    @SerializedName(SERIALIZED_NAME_ORG)
    @javax.annotation.Nullable
    private Org org;

    public RepoConfigObject() {}

    public RepoConfigObject repositoryUrl(@javax.annotation.Nullable String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Remote repository URL configured
     *
     * @return repositoryUrl
     */
    @javax.annotation.Nullable
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(@javax.annotation.Nullable String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public RepoConfigObject username(@javax.annotation.Nullable String username) {
        this.username = username;
        return this;
    }

    /**
     * Username to authenticate connection to the version control system
     *
     * @return username
     */
    @javax.annotation.Nullable
    public String getUsername() {
        return username;
    }

    public void setUsername(@javax.annotation.Nullable String username) {
        this.username = username;
    }

    public RepoConfigObject commitBranchName(@javax.annotation.Nullable String commitBranchName) {
        this.commitBranchName = commitBranchName;
        return this;
    }

    /**
     * Name of the remote branch where objects from this Thoughtspot instance will be versioned.
     *
     * @return commitBranchName
     */
    @javax.annotation.Nullable
    public String getCommitBranchName() {
        return commitBranchName;
    }

    public void setCommitBranchName(@javax.annotation.Nullable String commitBranchName) {
        this.commitBranchName = commitBranchName;
    }

    public RepoConfigObject branches(@javax.annotation.Nullable List<String> branches) {
        this.branches = branches;
        return this;
    }

    public RepoConfigObject addBranchesItem(String branchesItem) {
        if (this.branches == null) {
            this.branches = new ArrayList<>();
        }
        this.branches.add(branchesItem);
        return this;
    }

    /**
     * Branches that have been pulled in local repository
     *
     * @return branches
     */
    @javax.annotation.Nullable
    public List<String> getBranches() {
        return branches;
    }

    public void setBranches(@javax.annotation.Nullable List<String> branches) {
        this.branches = branches;
    }

    public RepoConfigObject enableGuidMapping(
            @javax.annotation.Nullable Boolean enableGuidMapping) {
        this.enableGuidMapping = enableGuidMapping;
        return this;
    }

    /**
     * Maintain mapping of guid for the deployment to an instance
     *
     * @return enableGuidMapping
     */
    @javax.annotation.Nullable
    public Boolean getEnableGuidMapping() {
        return enableGuidMapping;
    }

    public void setEnableGuidMapping(@javax.annotation.Nullable Boolean enableGuidMapping) {
        this.enableGuidMapping = enableGuidMapping;
    }

    public RepoConfigObject configurationBranchName(
            @javax.annotation.Nullable String configurationBranchName) {
        this.configurationBranchName = configurationBranchName;
        return this;
    }

    /**
     * Name of the branch where the configuration files related to operations between Thoughtspot
     * and version control repo should be maintained.
     *
     * @return configurationBranchName
     */
    @javax.annotation.Nullable
    public String getConfigurationBranchName() {
        return configurationBranchName;
    }

    public void setConfigurationBranchName(
            @javax.annotation.Nullable String configurationBranchName) {
        this.configurationBranchName = configurationBranchName;
    }

    public RepoConfigObject org(@javax.annotation.Nullable Org org) {
        this.org = org;
        return this;
    }

    /**
     * Get org
     *
     * @return org
     */
    @javax.annotation.Nullable
    public Org getOrg() {
        return org;
    }

    public void setOrg(@javax.annotation.Nullable Org org) {
        this.org = org;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepoConfigObject repoConfigObject = (RepoConfigObject) o;
        return Objects.equals(this.repositoryUrl, repoConfigObject.repositoryUrl)
                && Objects.equals(this.username, repoConfigObject.username)
                && Objects.equals(this.commitBranchName, repoConfigObject.commitBranchName)
                && Objects.equals(this.branches, repoConfigObject.branches)
                && Objects.equals(this.enableGuidMapping, repoConfigObject.enableGuidMapping)
                && Objects.equals(
                        this.configurationBranchName, repoConfigObject.configurationBranchName)
                && Objects.equals(this.org, repoConfigObject.org);
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
                repositoryUrl,
                username,
                commitBranchName,
                branches,
                enableGuidMapping,
                configurationBranchName,
                org);
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
        sb.append("class RepoConfigObject {\n");
        sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    commitBranchName: ").append(toIndentedString(commitBranchName)).append("\n");
        sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
        sb.append("    enableGuidMapping: ")
                .append(toIndentedString(enableGuidMapping))
                .append("\n");
        sb.append("    configurationBranchName: ")
                .append(toIndentedString(configurationBranchName))
                .append("\n");
        sb.append("    org: ").append(toIndentedString(org)).append("\n");
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
        openapiFields.add("repository_url");
        openapiFields.add("username");
        openapiFields.add("commit_branch_name");
        openapiFields.add("branches");
        openapiFields.add("enable_guid_mapping");
        openapiFields.add("configuration_branch_name");
        openapiFields.add("org");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to RepoConfigObject
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!RepoConfigObject.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in RepoConfigObject is not found in the"
                                        + " empty JSON string",
                                RepoConfigObject.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!RepoConfigObject.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `RepoConfigObject` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("repository_url") != null && !jsonObj.get("repository_url").isJsonNull())
                && !jsonObj.get("repository_url").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `repository_url` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("repository_url").toString()));
        }
        if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull())
                && !jsonObj.get("username").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `username` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("username").toString()));
        }
        if ((jsonObj.get("commit_branch_name") != null
                        && !jsonObj.get("commit_branch_name").isJsonNull())
                && !jsonObj.get("commit_branch_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `commit_branch_name` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("commit_branch_name").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("branches") != null
                && !jsonObj.get("branches").isJsonNull()
                && !jsonObj.get("branches").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `branches` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("branches").toString()));
        }
        if ((jsonObj.get("configuration_branch_name") != null
                        && !jsonObj.get("configuration_branch_name").isJsonNull())
                && !jsonObj.get("configuration_branch_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `configuration_branch_name` to be a primitive type"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("configuration_branch_name").toString()));
        }
        // validate the optional field `org`
        if (jsonObj.get("org") != null && !jsonObj.get("org").isJsonNull()) {
            Org.validateJsonElement(jsonObj.get("org"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RepoConfigObject.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RepoConfigObject' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RepoConfigObject> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(RepoConfigObject.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<RepoConfigObject>() {
                        @Override
                        public void write(JsonWriter out, RepoConfigObject value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public RepoConfigObject read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of RepoConfigObject given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RepoConfigObject
     * @throws IOException if the JSON string is invalid with respect to RepoConfigObject
     */
    public static RepoConfigObject fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RepoConfigObject.class);
    }

    /**
     * Convert an instance of RepoConfigObject to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
