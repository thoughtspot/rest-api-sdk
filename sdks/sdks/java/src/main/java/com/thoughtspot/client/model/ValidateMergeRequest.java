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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** ValidateMergeRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ValidateMergeRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_SOURCE_BRANCH_NAME = "source_branch_name";

    @SerializedName(SERIALIZED_NAME_SOURCE_BRANCH_NAME)
    @javax.annotation.Nonnull
    private String sourceBranchName;

    public static final String SERIALIZED_NAME_TARGET_BRANCH_NAME = "target_branch_name";

    @SerializedName(SERIALIZED_NAME_TARGET_BRANCH_NAME)
    @javax.annotation.Nonnull
    private String targetBranchName;

    public ValidateMergeRequest() {}

    public ValidateMergeRequest sourceBranchName(
            @javax.annotation.Nonnull String sourceBranchName) {
        this.sourceBranchName = sourceBranchName;
        return this;
    }

    /**
     * Name of the branch from which changes need to be picked for validation
     *
     * @return sourceBranchName
     */
    @javax.annotation.Nonnull
    public String getSourceBranchName() {
        return sourceBranchName;
    }

    public void setSourceBranchName(@javax.annotation.Nonnull String sourceBranchName) {
        this.sourceBranchName = sourceBranchName;
    }

    public ValidateMergeRequest targetBranchName(
            @javax.annotation.Nonnull String targetBranchName) {
        this.targetBranchName = targetBranchName;
        return this;
    }

    /**
     * Name of the branch where files will be merged
     *
     * @return targetBranchName
     */
    @javax.annotation.Nonnull
    public String getTargetBranchName() {
        return targetBranchName;
    }

    public void setTargetBranchName(@javax.annotation.Nonnull String targetBranchName) {
        this.targetBranchName = targetBranchName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValidateMergeRequest validateMergeRequest = (ValidateMergeRequest) o;
        return Objects.equals(this.sourceBranchName, validateMergeRequest.sourceBranchName)
                && Objects.equals(this.targetBranchName, validateMergeRequest.targetBranchName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceBranchName, targetBranchName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateMergeRequest {\n");
        sb.append("    sourceBranchName: ").append(toIndentedString(sourceBranchName)).append("\n");
        sb.append("    targetBranchName: ").append(toIndentedString(targetBranchName)).append("\n");
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
        openapiFields.add("source_branch_name");
        openapiFields.add("target_branch_name");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("source_branch_name");
        openapiRequiredFields.add("target_branch_name");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ValidateMergeRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ValidateMergeRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ValidateMergeRequest is not found in"
                                        + " the empty JSON string",
                                ValidateMergeRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ValidateMergeRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ValidateMergeRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ValidateMergeRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("source_branch_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `source_branch_name` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("source_branch_name").toString()));
        }
        if (!jsonObj.get("target_branch_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `target_branch_name` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("target_branch_name").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ValidateMergeRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ValidateMergeRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ValidateMergeRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ValidateMergeRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ValidateMergeRequest>() {
                        @Override
                        public void write(JsonWriter out, ValidateMergeRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ValidateMergeRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ValidateMergeRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ValidateMergeRequest
     * @throws IOException if the JSON string is invalid with respect to ValidateMergeRequest
     */
    public static ValidateMergeRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ValidateMergeRequest.class);
    }

    /**
     * Convert an instance of ValidateMergeRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
