/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package org.thoughtspot.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.thoughtspot.client.model.AuthorType;
import org.thoughtspot.client.model.CommiterType;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.thoughtspot.client.JSON;

/**
 * CommitHistoryResponse
 */

public class CommitHistoryResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COMMITTER = "committer";
  @SerializedName(SERIALIZED_NAME_COMMITTER)
  @javax.annotation.Nonnull
  private CommiterType committer;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  @javax.annotation.Nonnull
  private AuthorType author;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  @javax.annotation.Nonnull
  private String comment;

  public static final String SERIALIZED_NAME_COMMIT_TIME = "commit_time";
  @SerializedName(SERIALIZED_NAME_COMMIT_TIME)
  @javax.annotation.Nonnull
  private String commitTime;

  public static final String SERIALIZED_NAME_COMMIT_ID = "commit_id";
  @SerializedName(SERIALIZED_NAME_COMMIT_ID)
  @javax.annotation.Nonnull
  private String commitId;

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  @javax.annotation.Nonnull
  private String branch;

  public CommitHistoryResponse() {
  }

  public CommitHistoryResponse committer(@javax.annotation.Nonnull CommiterType committer) {
    this.committer = committer;
    return this;
  }

  /**
   * Get committer
   * @return committer
   */
  @javax.annotation.Nonnull
  public CommiterType getCommitter() {
    return committer;
  }

  public void setCommitter(@javax.annotation.Nonnull CommiterType committer) {
    this.committer = committer;
  }


  public CommitHistoryResponse author(@javax.annotation.Nonnull AuthorType author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   */
  @javax.annotation.Nonnull
  public AuthorType getAuthor() {
    return author;
  }

  public void setAuthor(@javax.annotation.Nonnull AuthorType author) {
    this.author = author;
  }


  public CommitHistoryResponse comment(@javax.annotation.Nonnull String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Comments associated with the commit
   * @return comment
   */
  @javax.annotation.Nonnull
  public String getComment() {
    return comment;
  }

  public void setComment(@javax.annotation.Nonnull String comment) {
    this.comment = comment;
  }


  public CommitHistoryResponse commitTime(@javax.annotation.Nonnull String commitTime) {
    this.commitTime = commitTime;
    return this;
  }

  /**
   * Time at which the changes were committed.
   * @return commitTime
   */
  @javax.annotation.Nonnull
  public String getCommitTime() {
    return commitTime;
  }

  public void setCommitTime(@javax.annotation.Nonnull String commitTime) {
    this.commitTime = commitTime;
  }


  public CommitHistoryResponse commitId(@javax.annotation.Nonnull String commitId) {
    this.commitId = commitId;
    return this;
  }

  /**
   * SHA id associated with the commit
   * @return commitId
   */
  @javax.annotation.Nonnull
  public String getCommitId() {
    return commitId;
  }

  public void setCommitId(@javax.annotation.Nonnull String commitId) {
    this.commitId = commitId;
  }


  public CommitHistoryResponse branch(@javax.annotation.Nonnull String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * Branch where changes were committed
   * @return branch
   */
  @javax.annotation.Nonnull
  public String getBranch() {
    return branch;
  }

  public void setBranch(@javax.annotation.Nonnull String branch) {
    this.branch = branch;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitHistoryResponse commitHistoryResponse = (CommitHistoryResponse) o;
    return Objects.equals(this.committer, commitHistoryResponse.committer) &&
        Objects.equals(this.author, commitHistoryResponse.author) &&
        Objects.equals(this.comment, commitHistoryResponse.comment) &&
        Objects.equals(this.commitTime, commitHistoryResponse.commitTime) &&
        Objects.equals(this.commitId, commitHistoryResponse.commitId) &&
        Objects.equals(this.branch, commitHistoryResponse.branch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(committer, author, comment, commitTime, commitId, branch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitHistoryResponse {\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    commitTime: ").append(toIndentedString(commitTime)).append("\n");
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("committer");
    openapiRequiredFields.add("author");
    openapiRequiredFields.add("comment");
    openapiRequiredFields.add("commit_time");
    openapiRequiredFields.add("commit_id");
    openapiRequiredFields.add("branch");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CommitHistoryResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CommitHistoryResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommitHistoryResponse is not found in the empty JSON string", CommitHistoryResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CommitHistoryResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommitHistoryResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CommitHistoryResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `committer`
      CommiterType.validateJsonElement(jsonObj.get("committer"));
      // validate the required field `author`
      AuthorType.validateJsonElement(jsonObj.get("author"));
      if (!jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if (!jsonObj.get("commit_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_time").toString()));
      }
      if (!jsonObj.get("commit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_id").toString()));
      }
      if (!jsonObj.get("branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("branch").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommitHistoryResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommitHistoryResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommitHistoryResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommitHistoryResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CommitHistoryResponse>() {
           @Override
           public void write(JsonWriter out, CommitHistoryResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommitHistoryResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CommitHistoryResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CommitHistoryResponse
   * @throws IOException if the JSON string is invalid with respect to CommitHistoryResponse
   */
  public static CommitHistoryResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommitHistoryResponse.class);
  }

  /**
   * Convert an instance of CommitHistoryResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

