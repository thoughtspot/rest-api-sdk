/*
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.thoughtspot.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.thoughtspot.client.model.AuthorType;
import org.thoughtspot.client.model.CommitFileType;
import org.thoughtspot.client.model.CommiterType;
import org.thoughtspot.client.model.RevertedMetadata;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.thoughtspot.client.JSON;

/**
 * RevertResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-06T15:42:43.362610+05:30[Asia/Kolkata]")
public class RevertResponse {
  public static final String SERIALIZED_NAME_COMMITTER = "committer";
  @SerializedName(SERIALIZED_NAME_COMMITTER)
  private CommiterType committer;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private AuthorType author;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_COMMIT_TIME = "commit_time";
  @SerializedName(SERIALIZED_NAME_COMMIT_TIME)
  private String commitTime;

  public static final String SERIALIZED_NAME_COMMIT_ID = "commit_id";
  @SerializedName(SERIALIZED_NAME_COMMIT_ID)
  private String commitId;

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_COMMITTED_FILES = "committed_files";
  @SerializedName(SERIALIZED_NAME_COMMITTED_FILES)
  private List<CommitFileType> committedFiles;

  public static final String SERIALIZED_NAME_REVERTED_METADATA = "reverted_metadata";
  @SerializedName(SERIALIZED_NAME_REVERTED_METADATA)
  private List<RevertedMetadata> revertedMetadata;

  public RevertResponse() {
  }

  public RevertResponse committer(CommiterType committer) {
    
    this.committer = committer;
    return this;
  }

   /**
   * Get committer
   * @return committer
  **/
  @javax.annotation.Nullable
  public CommiterType getCommitter() {
    return committer;
  }


  public void setCommitter(CommiterType committer) {
    this.committer = committer;
  }


  public RevertResponse author(AuthorType author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nullable
  public AuthorType getAuthor() {
    return author;
  }


  public void setAuthor(AuthorType author) {
    this.author = author;
  }


  public RevertResponse comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Comments associated with the commit
   * @return comment
  **/
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public RevertResponse commitTime(String commitTime) {
    
    this.commitTime = commitTime;
    return this;
  }

   /**
   * Time at which the changes were committed.
   * @return commitTime
  **/
  @javax.annotation.Nullable
  public String getCommitTime() {
    return commitTime;
  }


  public void setCommitTime(String commitTime) {
    this.commitTime = commitTime;
  }


  public RevertResponse commitId(String commitId) {
    
    this.commitId = commitId;
    return this;
  }

   /**
   * SHA id associated with the commit
   * @return commitId
  **/
  @javax.annotation.Nullable
  public String getCommitId() {
    return commitId;
  }


  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }


  public RevertResponse branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * Branch where changes were committed
   * @return branch
  **/
  @javax.annotation.Nullable
  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    this.branch = branch;
  }


  public RevertResponse committedFiles(List<CommitFileType> committedFiles) {
    
    this.committedFiles = committedFiles;
    return this;
  }

  public RevertResponse addCommittedFilesItem(CommitFileType committedFilesItem) {
    if (this.committedFiles == null) {
      this.committedFiles = new ArrayList<>();
    }
    this.committedFiles.add(committedFilesItem);
    return this;
  }

   /**
   * Files that were pushed as part of this commit
   * @return committedFiles
  **/
  @javax.annotation.Nullable
  public List<CommitFileType> getCommittedFiles() {
    return committedFiles;
  }


  public void setCommittedFiles(List<CommitFileType> committedFiles) {
    this.committedFiles = committedFiles;
  }


  public RevertResponse revertedMetadata(List<RevertedMetadata> revertedMetadata) {
    
    this.revertedMetadata = revertedMetadata;
    return this;
  }

  public RevertResponse addRevertedMetadataItem(RevertedMetadata revertedMetadataItem) {
    if (this.revertedMetadata == null) {
      this.revertedMetadata = new ArrayList<>();
    }
    this.revertedMetadata.add(revertedMetadataItem);
    return this;
  }

   /**
   * Metadata of reverted file of this commit
   * @return revertedMetadata
  **/
  @javax.annotation.Nullable
  public List<RevertedMetadata> getRevertedMetadata() {
    return revertedMetadata;
  }


  public void setRevertedMetadata(List<RevertedMetadata> revertedMetadata) {
    this.revertedMetadata = revertedMetadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevertResponse revertResponse = (RevertResponse) o;
    return Objects.equals(this.committer, revertResponse.committer) &&
        Objects.equals(this.author, revertResponse.author) &&
        Objects.equals(this.comment, revertResponse.comment) &&
        Objects.equals(this.commitTime, revertResponse.commitTime) &&
        Objects.equals(this.commitId, revertResponse.commitId) &&
        Objects.equals(this.branch, revertResponse.branch) &&
        Objects.equals(this.committedFiles, revertResponse.committedFiles) &&
        Objects.equals(this.revertedMetadata, revertResponse.revertedMetadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(committer, author, comment, commitTime, commitId, branch, committedFiles, revertedMetadata);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevertResponse {\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    commitTime: ").append(toIndentedString(commitTime)).append("\n");
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    committedFiles: ").append(toIndentedString(committedFiles)).append("\n");
    sb.append("    revertedMetadata: ").append(toIndentedString(revertedMetadata)).append("\n");
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
    openapiFields.add("committed_files");
    openapiFields.add("reverted_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RevertResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RevertResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RevertResponse is not found in the empty JSON string", RevertResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RevertResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RevertResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `committer`
      if (jsonObj.get("committer") != null && !jsonObj.get("committer").isJsonNull()) {
        CommiterType.validateJsonObject(jsonObj.getAsJsonObject("committer"));
      }
      // validate the optional field `author`
      if (jsonObj.get("author") != null && !jsonObj.get("author").isJsonNull()) {
        AuthorType.validateJsonObject(jsonObj.getAsJsonObject("author"));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("commit_time") != null && !jsonObj.get("commit_time").isJsonNull()) && !jsonObj.get("commit_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_time").toString()));
      }
      if ((jsonObj.get("commit_id") != null && !jsonObj.get("commit_id").isJsonNull()) && !jsonObj.get("commit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_id").toString()));
      }
      if ((jsonObj.get("branch") != null && !jsonObj.get("branch").isJsonNull()) && !jsonObj.get("branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("branch").toString()));
      }
      if (jsonObj.get("committed_files") != null && !jsonObj.get("committed_files").isJsonNull()) {
        JsonArray jsonArraycommittedFiles = jsonObj.getAsJsonArray("committed_files");
        if (jsonArraycommittedFiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("committed_files").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `committed_files` to be an array in the JSON string but got `%s`", jsonObj.get("committed_files").toString()));
          }

          // validate the optional field `committed_files` (array)
          for (int i = 0; i < jsonArraycommittedFiles.size(); i++) {
            CommitFileType.validateJsonObject(jsonArraycommittedFiles.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("reverted_metadata") != null && !jsonObj.get("reverted_metadata").isJsonNull()) {
        JsonArray jsonArrayrevertedMetadata = jsonObj.getAsJsonArray("reverted_metadata");
        if (jsonArrayrevertedMetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reverted_metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reverted_metadata` to be an array in the JSON string but got `%s`", jsonObj.get("reverted_metadata").toString()));
          }

          // validate the optional field `reverted_metadata` (array)
          for (int i = 0; i < jsonArrayrevertedMetadata.size(); i++) {
            RevertedMetadata.validateJsonObject(jsonArrayrevertedMetadata.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RevertResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RevertResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RevertResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RevertResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<RevertResponse>() {
           @Override
           public void write(JsonWriter out, RevertResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RevertResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RevertResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RevertResponse
  * @throws IOException if the JSON string is invalid with respect to RevertResponse
  */
  public static RevertResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RevertResponse.class);
  }

 /**
  * Convert an instance of RevertResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

