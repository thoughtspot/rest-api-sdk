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

/** FetchObjectPrivilegesRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class FetchObjectPrivilegesRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_METADATA = "metadata";

    @SerializedName(SERIALIZED_NAME_METADATA)
    @javax.annotation.Nonnull
    private List<ObjectPrivilegesMetadataInput> metadata;

    public static final String SERIALIZED_NAME_PRINCIPALS = "principals";

    @SerializedName(SERIALIZED_NAME_PRINCIPALS)
    @javax.annotation.Nullable
    private List<PrincipalsInput> principals;

    public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";

    @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
    @javax.annotation.Nullable
    private Integer recordOffset = 0;

    public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";

    @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
    @javax.annotation.Nullable
    private Integer recordSize = 20;

    public FetchObjectPrivilegesRequest() {}

    public FetchObjectPrivilegesRequest metadata(
            @javax.annotation.Nonnull List<ObjectPrivilegesMetadataInput> metadata) {
        this.metadata = metadata;
        return this;
    }

    public FetchObjectPrivilegesRequest addMetadataItem(
            ObjectPrivilegesMetadataInput metadataItem) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadataItem);
        return this;
    }

    /**
     * Metadata objects for which you want to fetch object privileges. For now only LOGICAL_TABLE is
     * supported. It may be extended to other metadata types in the future.
     *
     * @return metadata
     */
    @javax.annotation.Nonnull
    public List<ObjectPrivilegesMetadataInput> getMetadata() {
        return metadata;
    }

    public void setMetadata(
            @javax.annotation.Nonnull List<ObjectPrivilegesMetadataInput> metadata) {
        this.metadata = metadata;
    }

    public FetchObjectPrivilegesRequest principals(
            @javax.annotation.Nullable List<PrincipalsInput> principals) {
        this.principals = principals;
        return this;
    }

    public FetchObjectPrivilegesRequest addPrincipalsItem(PrincipalsInput principalsItem) {
        if (this.principals == null) {
            this.principals = new ArrayList<>();
        }
        this.principals.add(principalsItem);
        return this;
    }

    /**
     * User or group objects for which you want to fetch object privileges. If not specified, the
     * API returns all users and groups that have object privileges on the specified metadata
     * objects.
     *
     * @return principals
     */
    @javax.annotation.Nullable
    public List<PrincipalsInput> getPrincipals() {
        return principals;
    }

    public void setPrincipals(@javax.annotation.Nullable List<PrincipalsInput> principals) {
        this.principals = principals;
    }

    public FetchObjectPrivilegesRequest recordOffset(
            @javax.annotation.Nullable Integer recordOffset) {
        this.recordOffset = recordOffset;
        return this;
    }

    /**
     * The starting record number from where the records should be included for each metadata type.
     *
     * @return recordOffset
     */
    @javax.annotation.Nullable
    public Integer getRecordOffset() {
        return recordOffset;
    }

    public void setRecordOffset(@javax.annotation.Nullable Integer recordOffset) {
        this.recordOffset = recordOffset;
    }

    public FetchObjectPrivilegesRequest recordSize(@javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
        return this;
    }

    /**
     * The number of records that should be included for each metadata type.
     *
     * @return recordSize
     */
    @javax.annotation.Nullable
    public Integer getRecordSize() {
        return recordSize;
    }

    public void setRecordSize(@javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FetchObjectPrivilegesRequest fetchObjectPrivilegesRequest =
                (FetchObjectPrivilegesRequest) o;
        return Objects.equals(this.metadata, fetchObjectPrivilegesRequest.metadata)
                && Objects.equals(this.principals, fetchObjectPrivilegesRequest.principals)
                && Objects.equals(this.recordOffset, fetchObjectPrivilegesRequest.recordOffset)
                && Objects.equals(this.recordSize, fetchObjectPrivilegesRequest.recordSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, principals, recordOffset, recordSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FetchObjectPrivilegesRequest {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    principals: ").append(toIndentedString(principals)).append("\n");
        sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
        sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
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
        openapiFields.add("principals");
        openapiFields.add("record_offset");
        openapiFields.add("record_size");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("metadata");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     FetchObjectPrivilegesRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!FetchObjectPrivilegesRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FetchObjectPrivilegesRequest is not"
                                        + " found in the empty JSON string",
                                FetchObjectPrivilegesRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!FetchObjectPrivilegesRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FetchObjectPrivilegesRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : FetchObjectPrivilegesRequest.openapiRequiredFields) {
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
            ObjectPrivilegesMetadataInput.validateJsonElement(jsonArraymetadata.get(i));
        }
        ;
        if (jsonObj.get("principals") != null && !jsonObj.get("principals").isJsonNull()) {
            JsonArray jsonArrayprincipals = jsonObj.getAsJsonArray("principals");
            if (jsonArrayprincipals != null) {
                // ensure the json data is an array
                if (!jsonObj.get("principals").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `principals` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("principals").toString()));
                }

                // validate the optional field `principals` (array)
                for (int i = 0; i < jsonArrayprincipals.size(); i++) {
                    PrincipalsInput.validateJsonElement(jsonArrayprincipals.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FetchObjectPrivilegesRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FetchObjectPrivilegesRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FetchObjectPrivilegesRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(FetchObjectPrivilegesRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FetchObjectPrivilegesRequest>() {
                        @Override
                        public void write(JsonWriter out, FetchObjectPrivilegesRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FetchObjectPrivilegesRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FetchObjectPrivilegesRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FetchObjectPrivilegesRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     FetchObjectPrivilegesRequest
     */
    public static FetchObjectPrivilegesRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FetchObjectPrivilegesRequest.class);
    }

    /**
     * Convert an instance of FetchObjectPrivilegesRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
