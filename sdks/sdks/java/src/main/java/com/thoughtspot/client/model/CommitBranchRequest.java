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

/** CommitBranchRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CommitBranchRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_METADATA = "metadata";

    @SerializedName(SERIALIZED_NAME_METADATA)
    @javax.annotation.Nonnull
    private List<MetadataObject> metadata;

    public static final String SERIALIZED_NAME_DELETE_AWARE = "delete_aware";

    @SerializedName(SERIALIZED_NAME_DELETE_AWARE)
    @javax.annotation.Nullable
    private Boolean deleteAware = true;

    public static final String SERIALIZED_NAME_BRANCH_NAME = "branch_name";

    @SerializedName(SERIALIZED_NAME_BRANCH_NAME)
    @javax.annotation.Nullable
    private String branchName;

    public static final String SERIALIZED_NAME_COMMENT = "comment";

    @SerializedName(SERIALIZED_NAME_COMMENT)
    @javax.annotation.Nonnull
    private String comment;

    public CommitBranchRequest() {}

    public CommitBranchRequest metadata(@javax.annotation.Nonnull List<MetadataObject> metadata) {
        this.metadata = metadata;
        return this;
    }

    public CommitBranchRequest addMetadataItem(MetadataObject metadataItem) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadataItem);
        return this;
    }

    /**
     * Metadata objects.
     *
     * @return metadata
     */
    @javax.annotation.Nonnull
    public List<MetadataObject> getMetadata() {
        return metadata;
    }

    public void setMetadata(@javax.annotation.Nonnull List<MetadataObject> metadata) {
        this.metadata = metadata;
    }

    public CommitBranchRequest deleteAware(@javax.annotation.Nullable Boolean deleteAware) {
        this.deleteAware = deleteAware;
        return this;
    }

    /**
     * Delete the tml files from version control repo if it does not exist in the ThoughSpot
     * instance
     *
     * @return deleteAware
     */
    @javax.annotation.Nullable
    public Boolean getDeleteAware() {
        return deleteAware;
    }

    public void setDeleteAware(@javax.annotation.Nullable Boolean deleteAware) {
        this.deleteAware = deleteAware;
    }

    public CommitBranchRequest branchName(@javax.annotation.Nullable String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * Name of the remote branch where object should be pushed Note: If no branch_name is specified,
     * then the commit_branch_name will be considered.
     *
     * @return branchName
     */
    @javax.annotation.Nullable
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(@javax.annotation.Nullable String branchName) {
        this.branchName = branchName;
    }

    public CommitBranchRequest comment(@javax.annotation.Nonnull String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Comment to be added to the commit
     *
     * @return comment
     */
    @javax.annotation.Nonnull
    public String getComment() {
        return comment;
    }

    public void setComment(@javax.annotation.Nonnull String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommitBranchRequest commitBranchRequest = (CommitBranchRequest) o;
        return Objects.equals(this.metadata, commitBranchRequest.metadata)
                && Objects.equals(this.deleteAware, commitBranchRequest.deleteAware)
                && Objects.equals(this.branchName, commitBranchRequest.branchName)
                && Objects.equals(this.comment, commitBranchRequest.comment);
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
        return Objects.hash(metadata, deleteAware, branchName, comment);
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
        sb.append("class CommitBranchRequest {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    deleteAware: ").append(toIndentedString(deleteAware)).append("\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
        openapiFields.add("metadata");
        openapiFields.add("delete_aware");
        openapiFields.add("branch_name");
        openapiFields.add("comment");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("metadata");
        openapiRequiredFields.add("comment");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CommitBranchRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CommitBranchRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CommitBranchRequest is not found in"
                                        + " the empty JSON string",
                                CommitBranchRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CommitBranchRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CommitBranchRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CommitBranchRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the json data is an array
        if (!jsonObj.get("metadata").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("metadata").toString()));
        }

        JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
        // validate the required field `metadata` (array)
        for (int i = 0; i < jsonArraymetadata.size(); i++) {
            MetadataObject.validateJsonElement(jsonArraymetadata.get(i));
        }
        ;
        if ((jsonObj.get("branch_name") != null && !jsonObj.get("branch_name").isJsonNull())
                && !jsonObj.get("branch_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `branch_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("branch_name").toString()));
        }
        if (!jsonObj.get("comment").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `comment` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("comment").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CommitBranchRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CommitBranchRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CommitBranchRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CommitBranchRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CommitBranchRequest>() {
                        @Override
                        public void write(JsonWriter out, CommitBranchRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CommitBranchRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CommitBranchRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CommitBranchRequest
     * @throws IOException if the JSON string is invalid with respect to CommitBranchRequest
     */
    public static CommitBranchRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CommitBranchRequest.class);
    }

    /**
     * Convert an instance of CommitBranchRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
