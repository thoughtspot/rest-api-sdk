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

/** PublishMetadataRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class PublishMetadataRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_METADATA = "metadata";

    @SerializedName(SERIALIZED_NAME_METADATA)
    @javax.annotation.Nonnull
    private List<PublishMetadataListItem> metadata;

    public static final String SERIALIZED_NAME_ORG_IDENTIFIERS = "org_identifiers";

    @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIERS)
    @javax.annotation.Nonnull
    private List<String> orgIdentifiers;

    public static final String SERIALIZED_NAME_SKIP_VALIDATION = "skip_validation";

    @SerializedName(SERIALIZED_NAME_SKIP_VALIDATION)
    @javax.annotation.Nullable
    private Boolean skipValidation;

    public PublishMetadataRequest() {}

    public PublishMetadataRequest metadata(
            @javax.annotation.Nonnull List<PublishMetadataListItem> metadata) {
        this.metadata = metadata;
        return this;
    }

    public PublishMetadataRequest addMetadataItem(PublishMetadataListItem metadataItem) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadataItem);
        return this;
    }

    /**
     * Metadata objects to be published.
     *
     * @return metadata
     */
    @javax.annotation.Nonnull
    public List<PublishMetadataListItem> getMetadata() {
        return metadata;
    }

    public void setMetadata(@javax.annotation.Nonnull List<PublishMetadataListItem> metadata) {
        this.metadata = metadata;
    }

    public PublishMetadataRequest orgIdentifiers(
            @javax.annotation.Nonnull List<String> orgIdentifiers) {
        this.orgIdentifiers = orgIdentifiers;
        return this;
    }

    public PublishMetadataRequest addOrgIdentifiersItem(String orgIdentifiersItem) {
        if (this.orgIdentifiers == null) {
            this.orgIdentifiers = new ArrayList<>();
        }
        this.orgIdentifiers.add(orgIdentifiersItem);
        return this;
    }

    /**
     * Unique ID or name of orgs to which metadata objects should be published.
     *
     * @return orgIdentifiers
     */
    @javax.annotation.Nonnull
    public List<String> getOrgIdentifiers() {
        return orgIdentifiers;
    }

    public void setOrgIdentifiers(@javax.annotation.Nonnull List<String> orgIdentifiers) {
        this.orgIdentifiers = orgIdentifiers;
    }

    public PublishMetadataRequest skipValidation(
            @javax.annotation.Nullable Boolean skipValidation) {
        this.skipValidation = skipValidation;
        return this;
    }

    /**
     * Skip validations of objects to be published.
     *
     * @return skipValidation
     */
    @javax.annotation.Nullable
    public Boolean getSkipValidation() {
        return skipValidation;
    }

    public void setSkipValidation(@javax.annotation.Nullable Boolean skipValidation) {
        this.skipValidation = skipValidation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublishMetadataRequest publishMetadataRequest = (PublishMetadataRequest) o;
        return Objects.equals(this.metadata, publishMetadataRequest.metadata)
                && Objects.equals(this.orgIdentifiers, publishMetadataRequest.orgIdentifiers)
                && Objects.equals(this.skipValidation, publishMetadataRequest.skipValidation);
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
        return Objects.hash(metadata, orgIdentifiers, skipValidation);
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
        sb.append("class PublishMetadataRequest {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    orgIdentifiers: ").append(toIndentedString(orgIdentifiers)).append("\n");
        sb.append("    skipValidation: ").append(toIndentedString(skipValidation)).append("\n");
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
        openapiFields.add("org_identifiers");
        openapiFields.add("skip_validation");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("metadata");
        openapiRequiredFields.add("org_identifiers");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to PublishMetadataRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PublishMetadataRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in PublishMetadataRequest is not found"
                                        + " in the empty JSON string",
                                PublishMetadataRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!PublishMetadataRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `PublishMetadataRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : PublishMetadataRequest.openapiRequiredFields) {
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
            PublishMetadataListItem.validateJsonElement(jsonArraymetadata.get(i));
        }
        ;
        // ensure the required json array is present
        if (jsonObj.get("org_identifiers") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("org_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `org_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("org_identifiers").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PublishMetadataRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PublishMetadataRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PublishMetadataRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(PublishMetadataRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<PublishMetadataRequest>() {
                        @Override
                        public void write(JsonWriter out, PublishMetadataRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public PublishMetadataRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of PublishMetadataRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PublishMetadataRequest
     * @throws IOException if the JSON string is invalid with respect to PublishMetadataRequest
     */
    public static PublishMetadataRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PublishMetadataRequest.class);
    }

    /**
     * Convert an instance of PublishMetadataRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
