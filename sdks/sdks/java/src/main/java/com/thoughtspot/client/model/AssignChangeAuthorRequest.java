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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** AssignChangeAuthorRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AssignChangeAuthorRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_METADATA = "metadata";

    @SerializedName(SERIALIZED_NAME_METADATA)
    @javax.annotation.Nonnull
    private List<AuthorMetadataTypeInput> metadata;

    public static final String SERIALIZED_NAME_USER_IDENTIFIER = "user_identifier";

    @SerializedName(SERIALIZED_NAME_USER_IDENTIFIER)
    @javax.annotation.Nonnull
    private String userIdentifier;

    public static final String SERIALIZED_NAME_CURRENT_OWNER_IDENTIFIER =
            "current_owner_identifier";

    @SerializedName(SERIALIZED_NAME_CURRENT_OWNER_IDENTIFIER)
    @javax.annotation.Nullable
    private String currentOwnerIdentifier;

    public AssignChangeAuthorRequest() {}

    public AssignChangeAuthorRequest metadata(
            @javax.annotation.Nonnull List<AuthorMetadataTypeInput> metadata) {
        this.metadata = metadata;
        return this;
    }

    public AssignChangeAuthorRequest addMetadataItem(AuthorMetadataTypeInput metadataItem) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadataItem);
        return this;
    }

    /**
     * GUID or name of the metadata object.
     *
     * @return metadata
     */
    @javax.annotation.Nonnull
    public List<AuthorMetadataTypeInput> getMetadata() {
        return metadata;
    }

    public void setMetadata(@javax.annotation.Nonnull List<AuthorMetadataTypeInput> metadata) {
        this.metadata = metadata;
    }

    public AssignChangeAuthorRequest userIdentifier(
            @javax.annotation.Nonnull String userIdentifier) {
        this.userIdentifier = userIdentifier;
        return this;
    }

    /**
     * GUID or name of the user who you want to assign as the author.
     *
     * @return userIdentifier
     */
    @javax.annotation.Nonnull
    public String getUserIdentifier() {
        return userIdentifier;
    }

    public void setUserIdentifier(@javax.annotation.Nonnull String userIdentifier) {
        this.userIdentifier = userIdentifier;
    }

    public AssignChangeAuthorRequest currentOwnerIdentifier(
            @javax.annotation.Nullable String currentOwnerIdentifier) {
        this.currentOwnerIdentifier = currentOwnerIdentifier;
        return this;
    }

    /**
     * GUID or name of the current author. When defined, the metadata objects authored by the
     * specified owner are filtered for the API operation.
     *
     * @return currentOwnerIdentifier
     */
    @javax.annotation.Nullable
    public String getCurrentOwnerIdentifier() {
        return currentOwnerIdentifier;
    }

    public void setCurrentOwnerIdentifier(
            @javax.annotation.Nullable String currentOwnerIdentifier) {
        this.currentOwnerIdentifier = currentOwnerIdentifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssignChangeAuthorRequest assignChangeAuthorRequest = (AssignChangeAuthorRequest) o;
        return Objects.equals(this.metadata, assignChangeAuthorRequest.metadata)
                && Objects.equals(this.userIdentifier, assignChangeAuthorRequest.userIdentifier)
                && Objects.equals(
                        this.currentOwnerIdentifier,
                        assignChangeAuthorRequest.currentOwnerIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, userIdentifier, currentOwnerIdentifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssignChangeAuthorRequest {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    userIdentifier: ").append(toIndentedString(userIdentifier)).append("\n");
        sb.append("    currentOwnerIdentifier: ")
                .append(toIndentedString(currentOwnerIdentifier))
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
        openapiFields.add("metadata");
        openapiFields.add("user_identifier");
        openapiFields.add("current_owner_identifier");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("metadata");
        openapiRequiredFields.add("user_identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AssignChangeAuthorRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AssignChangeAuthorRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AssignChangeAuthorRequest is not"
                                        + " found in the empty JSON string",
                                AssignChangeAuthorRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!AssignChangeAuthorRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `AssignChangeAuthorRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : AssignChangeAuthorRequest.openapiRequiredFields) {
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
            AuthorMetadataTypeInput.validateJsonElement(jsonArraymetadata.get(i));
        }
        ;
        if (!jsonObj.get("user_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `user_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("user_identifier").toString()));
        }
        if ((jsonObj.get("current_owner_identifier") != null
                        && !jsonObj.get("current_owner_identifier").isJsonNull())
                && !jsonObj.get("current_owner_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `current_owner_identifier` to be a primitive type"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("current_owner_identifier").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AssignChangeAuthorRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AssignChangeAuthorRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AssignChangeAuthorRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AssignChangeAuthorRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AssignChangeAuthorRequest>() {
                        @Override
                        public void write(JsonWriter out, AssignChangeAuthorRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AssignChangeAuthorRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AssignChangeAuthorRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AssignChangeAuthorRequest
     * @throws IOException if the JSON string is invalid with respect to AssignChangeAuthorRequest
     */
    public static AssignChangeAuthorRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AssignChangeAuthorRequest.class);
    }

    /**
     * Convert an instance of AssignChangeAuthorRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
