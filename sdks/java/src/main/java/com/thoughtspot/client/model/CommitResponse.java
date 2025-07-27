/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
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

/** CommitResponse */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CommitResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_COMMITTER = "committer";

    @SerializedName(SERIALIZED_NAME_COMMITTER)
    @javax.annotation.Nullable
    private CommiterType committer;

    public static final String SERIALIZED_NAME_AUTHOR = "author";

    @SerializedName(SERIALIZED_NAME_AUTHOR)
    @javax.annotation.Nullable
    private AuthorType author;

    public static final String SERIALIZED_NAME_COMMENT = "comment";

    @SerializedName(SERIALIZED_NAME_COMMENT)
    @javax.annotation.Nullable
    private String comment;

    public static final String SERIALIZED_NAME_COMMIT_TIME = "commit_time";

    @SerializedName(SERIALIZED_NAME_COMMIT_TIME)
    @javax.annotation.Nullable
    private String commitTime;

    public static final String SERIALIZED_NAME_COMMIT_ID = "commit_id";

    @SerializedName(SERIALIZED_NAME_COMMIT_ID)
    @javax.annotation.Nullable
    private String commitId;

    public static final String SERIALIZED_NAME_BRANCH = "branch";

    @SerializedName(SERIALIZED_NAME_BRANCH)
    @javax.annotation.Nullable
    private String branch;

    public static final String SERIALIZED_NAME_COMMITTED_FILES = "committed_files";

    @SerializedName(SERIALIZED_NAME_COMMITTED_FILES)
    @javax.annotation.Nullable
    private List<CommitFileType> committedFiles;

    public CommitResponse() {}

    public CommitResponse committer(@javax.annotation.Nullable CommiterType committer) {
        this.committer = committer;
        return this;
    }

    /**
     * Get committer
     *
     * @return committer
     */
    @javax.annotation.Nullable
    public CommiterType getCommitter() {
        return committer;
    }

    public void setCommitter(@javax.annotation.Nullable CommiterType committer) {
        this.committer = committer;
    }

    public CommitResponse author(@javax.annotation.Nullable AuthorType author) {
        this.author = author;
        return this;
    }

    /**
     * Get author
     *
     * @return author
     */
    @javax.annotation.Nullable
    public AuthorType getAuthor() {
        return author;
    }

    public void setAuthor(@javax.annotation.Nullable AuthorType author) {
        this.author = author;
    }

    public CommitResponse comment(@javax.annotation.Nullable String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Comments associated with the commit
     *
     * @return comment
     */
    @javax.annotation.Nullable
    public String getComment() {
        return comment;
    }

    public void setComment(@javax.annotation.Nullable String comment) {
        this.comment = comment;
    }

    public CommitResponse commitTime(@javax.annotation.Nullable String commitTime) {
        this.commitTime = commitTime;
        return this;
    }

    /**
     * Time at which the changes were committed.
     *
     * @return commitTime
     */
    @javax.annotation.Nullable
    public String getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(@javax.annotation.Nullable String commitTime) {
        this.commitTime = commitTime;
    }

    public CommitResponse commitId(@javax.annotation.Nullable String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * SHA id associated with the commit
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

    public CommitResponse branch(@javax.annotation.Nullable String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Branch where changes were committed
     *
     * @return branch
     */
    @javax.annotation.Nullable
    public String getBranch() {
        return branch;
    }

    public void setBranch(@javax.annotation.Nullable String branch) {
        this.branch = branch;
    }

    public CommitResponse committedFiles(
            @javax.annotation.Nullable List<CommitFileType> committedFiles) {
        this.committedFiles = committedFiles;
        return this;
    }

    public CommitResponse addCommittedFilesItem(CommitFileType committedFilesItem) {
        if (this.committedFiles == null) {
            this.committedFiles = new ArrayList<>();
        }
        this.committedFiles.add(committedFilesItem);
        return this;
    }

    /**
     * Files that were pushed as part of this commit
     *
     * @return committedFiles
     */
    @javax.annotation.Nullable
    public List<CommitFileType> getCommittedFiles() {
        return committedFiles;
    }

    public void setCommittedFiles(@javax.annotation.Nullable List<CommitFileType> committedFiles) {
        this.committedFiles = committedFiles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommitResponse commitResponse = (CommitResponse) o;
        return Objects.equals(this.committer, commitResponse.committer)
                && Objects.equals(this.author, commitResponse.author)
                && Objects.equals(this.comment, commitResponse.comment)
                && Objects.equals(this.commitTime, commitResponse.commitTime)
                && Objects.equals(this.commitId, commitResponse.commitId)
                && Objects.equals(this.branch, commitResponse.branch)
                && Objects.equals(this.committedFiles, commitResponse.committedFiles);
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
                committer, author, comment, commitTime, commitId, branch, committedFiles);
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
        sb.append("class CommitResponse {\n");
        sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    commitTime: ").append(toIndentedString(commitTime)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    committedFiles: ").append(toIndentedString(committedFiles)).append("\n");
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
        openapiFields.add("committer");
        openapiFields.add("author");
        openapiFields.add("comment");
        openapiFields.add("commit_time");
        openapiFields.add("commit_id");
        openapiFields.add("branch");
        openapiFields.add("committed_files");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CommitResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CommitResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CommitResponse is not found in the"
                                        + " empty JSON string",
                                CommitResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CommitResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CommitResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the optional field `committer`
        if (jsonObj.get("committer") != null && !jsonObj.get("committer").isJsonNull()) {
            CommiterType.validateJsonElement(jsonObj.get("committer"));
        }
        // validate the optional field `author`
        if (jsonObj.get("author") != null && !jsonObj.get("author").isJsonNull()) {
            AuthorType.validateJsonElement(jsonObj.get("author"));
        }
        if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull())
                && !jsonObj.get("comment").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `comment` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("comment").toString()));
        }
        if ((jsonObj.get("commit_time") != null && !jsonObj.get("commit_time").isJsonNull())
                && !jsonObj.get("commit_time").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `commit_time` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("commit_time").toString()));
        }
        if ((jsonObj.get("commit_id") != null && !jsonObj.get("commit_id").isJsonNull())
                && !jsonObj.get("commit_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `commit_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("commit_id").toString()));
        }
        if ((jsonObj.get("branch") != null && !jsonObj.get("branch").isJsonNull())
                && !jsonObj.get("branch").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `branch` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("branch").toString()));
        }
        if (jsonObj.get("committed_files") != null
                && !jsonObj.get("committed_files").isJsonNull()) {
            JsonArray jsonArraycommittedFiles = jsonObj.getAsJsonArray("committed_files");
            if (jsonArraycommittedFiles != null) {
                // ensure the json data is an array
                if (!jsonObj.get("committed_files").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `committed_files` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("committed_files").toString()));
                }

                // validate the optional field `committed_files` (array)
                for (int i = 0; i < jsonArraycommittedFiles.size(); i++) {
                    CommitFileType.validateJsonElement(jsonArraycommittedFiles.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CommitResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CommitResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CommitResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CommitResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CommitResponse>() {
                        @Override
                        public void write(JsonWriter out, CommitResponse value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CommitResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CommitResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CommitResponse
     * @throws IOException if the JSON string is invalid with respect to CommitResponse
     */
    public static CommitResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CommitResponse.class);
    }

    /**
     * Convert an instance of CommitResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
