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

/** DeleteCollectionRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DeleteCollectionRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_COLLECTION_IDENTIFIERS = "collection_identifiers";

    @SerializedName(SERIALIZED_NAME_COLLECTION_IDENTIFIERS)
    @javax.annotation.Nonnull
    private List<String> collectionIdentifiers;

    public static final String SERIALIZED_NAME_DELETE_CHILDREN = "delete_children";

    @SerializedName(SERIALIZED_NAME_DELETE_CHILDREN)
    @javax.annotation.Nullable
    private Boolean deleteChildren = false;

    public static final String SERIALIZED_NAME_DRY_RUN = "dry_run";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    @javax.annotation.Nullable
    private Boolean dryRun = false;

    public DeleteCollectionRequest() {}

    public DeleteCollectionRequest collectionIdentifiers(
            @javax.annotation.Nonnull List<String> collectionIdentifiers) {
        this.collectionIdentifiers = collectionIdentifiers;
        return this;
    }

    public DeleteCollectionRequest addCollectionIdentifiersItem(String collectionIdentifiersItem) {
        if (this.collectionIdentifiers == null) {
            this.collectionIdentifiers = new ArrayList<>();
        }
        this.collectionIdentifiers.add(collectionIdentifiersItem);
        return this;
    }

    /**
     * Unique GUIDs of collections to delete. Note: Collection names cannot be used as identifiers
     * since duplicate names are allowed.
     *
     * @return collectionIdentifiers
     */
    @javax.annotation.Nonnull
    public List<String> getCollectionIdentifiers() {
        return collectionIdentifiers;
    }

    public void setCollectionIdentifiers(
            @javax.annotation.Nonnull List<String> collectionIdentifiers) {
        this.collectionIdentifiers = collectionIdentifiers;
    }

    public DeleteCollectionRequest deleteChildren(
            @javax.annotation.Nullable Boolean deleteChildren) {
        this.deleteChildren = deleteChildren;
        return this;
    }

    /**
     * Flag to delete child objects of the collection that the user has access to.
     *
     * @return deleteChildren
     */
    @javax.annotation.Nullable
    public Boolean getDeleteChildren() {
        return deleteChildren;
    }

    public void setDeleteChildren(@javax.annotation.Nullable Boolean deleteChildren) {
        this.deleteChildren = deleteChildren;
    }

    public DeleteCollectionRequest dryRun(@javax.annotation.Nullable Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * Preview deletion without actually deleting. When set to true, returns what would be deleted
     * without performing the actual deletion.
     *
     * @return dryRun
     */
    @javax.annotation.Nullable
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(@javax.annotation.Nullable Boolean dryRun) {
        this.dryRun = dryRun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteCollectionRequest deleteCollectionRequest = (DeleteCollectionRequest) o;
        return Objects.equals(
                        this.collectionIdentifiers, deleteCollectionRequest.collectionIdentifiers)
                && Objects.equals(this.deleteChildren, deleteCollectionRequest.deleteChildren)
                && Objects.equals(this.dryRun, deleteCollectionRequest.dryRun);
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
        return Objects.hash(collectionIdentifiers, deleteChildren, dryRun);
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
        sb.append("class DeleteCollectionRequest {\n");
        sb.append("    collectionIdentifiers: ")
                .append(toIndentedString(collectionIdentifiers))
                .append("\n");
        sb.append("    deleteChildren: ").append(toIndentedString(deleteChildren)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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
        openapiFields.add("collection_identifiers");
        openapiFields.add("delete_children");
        openapiFields.add("dry_run");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("collection_identifiers");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to DeleteCollectionRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DeleteCollectionRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DeleteCollectionRequest is not found"
                                        + " in the empty JSON string",
                                DeleteCollectionRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!DeleteCollectionRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `DeleteCollectionRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : DeleteCollectionRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the required json array is present
        if (jsonObj.get("collection_identifiers") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("collection_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `collection_identifiers` to be an array in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("collection_identifiers").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DeleteCollectionRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DeleteCollectionRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DeleteCollectionRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(DeleteCollectionRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DeleteCollectionRequest>() {
                        @Override
                        public void write(JsonWriter out, DeleteCollectionRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DeleteCollectionRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DeleteCollectionRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DeleteCollectionRequest
     * @throws IOException if the JSON string is invalid with respect to DeleteCollectionRequest
     */
    public static DeleteCollectionRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DeleteCollectionRequest.class);
    }

    /**
     * Convert an instance of DeleteCollectionRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
