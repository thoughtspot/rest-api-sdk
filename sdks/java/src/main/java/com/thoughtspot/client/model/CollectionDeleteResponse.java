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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Response object for delete collection operation. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CollectionDeleteResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_METADATA_DELETED = "metadata_deleted";

    @SerializedName(SERIALIZED_NAME_METADATA_DELETED)
    @javax.annotation.Nullable
    private List<CollectionDeleteTypeIdentifiers> metadataDeleted;

    public static final String SERIALIZED_NAME_METADATA_SKIPPED = "metadata_skipped";

    @SerializedName(SERIALIZED_NAME_METADATA_SKIPPED)
    @javax.annotation.Nullable
    private List<CollectionDeleteTypeIdentifiers> metadataSkipped;

    public CollectionDeleteResponse() {}

    public CollectionDeleteResponse metadataDeleted(
            @javax.annotation.Nullable List<CollectionDeleteTypeIdentifiers> metadataDeleted) {
        this.metadataDeleted = metadataDeleted;
        return this;
    }

    public CollectionDeleteResponse addMetadataDeletedItem(
            CollectionDeleteTypeIdentifiers metadataDeletedItem) {
        if (this.metadataDeleted == null) {
            this.metadataDeleted = new ArrayList<>();
        }
        this.metadataDeleted.add(metadataDeletedItem);
        return this;
    }

    /**
     * List of metadata objects that were successfully deleted.
     *
     * @return metadataDeleted
     */
    @javax.annotation.Nullable
    public List<CollectionDeleteTypeIdentifiers> getMetadataDeleted() {
        return metadataDeleted;
    }

    public void setMetadataDeleted(
            @javax.annotation.Nullable List<CollectionDeleteTypeIdentifiers> metadataDeleted) {
        this.metadataDeleted = metadataDeleted;
    }

    public CollectionDeleteResponse metadataSkipped(
            @javax.annotation.Nullable List<CollectionDeleteTypeIdentifiers> metadataSkipped) {
        this.metadataSkipped = metadataSkipped;
        return this;
    }

    public CollectionDeleteResponse addMetadataSkippedItem(
            CollectionDeleteTypeIdentifiers metadataSkippedItem) {
        if (this.metadataSkipped == null) {
            this.metadataSkipped = new ArrayList<>();
        }
        this.metadataSkipped.add(metadataSkippedItem);
        return this;
    }

    /**
     * List of metadata objects that were skipped during deletion. Objects may be skipped due to
     * lack of permissions, dependencies, or other constraints.
     *
     * @return metadataSkipped
     */
    @javax.annotation.Nullable
    public List<CollectionDeleteTypeIdentifiers> getMetadataSkipped() {
        return metadataSkipped;
    }

    public void setMetadataSkipped(
            @javax.annotation.Nullable List<CollectionDeleteTypeIdentifiers> metadataSkipped) {
        this.metadataSkipped = metadataSkipped;
    }

    /**
     * A container for additional, undeclared properties. This is a holder for any undeclared
     * properties as specified with the 'additionalProperties' keyword in the OAS document.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Set the additional (undeclared) property with the specified name and value. If the property
     * does not already exist, create it otherwise replace it.
     *
     * @param key name of the property
     * @param value value of the property
     * @return the CollectionDeleteResponse instance itself
     */
    public CollectionDeleteResponse putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
     * Return the additional (undeclared) property.
     *
     * @return a map of objects
     */
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Return the additional (undeclared) property with the specified name.
     *
     * @param key name of the property
     * @return an object
     */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollectionDeleteResponse collectionDeleteResponse = (CollectionDeleteResponse) o;
        return Objects.equals(this.metadataDeleted, collectionDeleteResponse.metadataDeleted)
                && Objects.equals(this.metadataSkipped, collectionDeleteResponse.metadataSkipped)
                && Objects.equals(
                        this.additionalProperties, collectionDeleteResponse.additionalProperties);
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
        return Objects.hash(metadataDeleted, metadataSkipped, additionalProperties);
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
        sb.append("class CollectionDeleteResponse {\n");
        sb.append("    metadataDeleted: ").append(toIndentedString(metadataDeleted)).append("\n");
        sb.append("    metadataSkipped: ").append(toIndentedString(metadataSkipped)).append("\n");
        sb.append("    additionalProperties: ")
                .append(toIndentedString(additionalProperties))
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
        openapiFields.add("metadata_deleted");
        openapiFields.add("metadata_skipped");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CollectionDeleteResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CollectionDeleteResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CollectionDeleteResponse is not found"
                                        + " in the empty JSON string",
                                CollectionDeleteResponse.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (jsonObj.get("metadata_deleted") != null
                && !jsonObj.get("metadata_deleted").isJsonNull()) {
            JsonArray jsonArraymetadataDeleted = jsonObj.getAsJsonArray("metadata_deleted");
            if (jsonArraymetadataDeleted != null) {
                // ensure the json data is an array
                if (!jsonObj.get("metadata_deleted").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `metadata_deleted` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("metadata_deleted").toString()));
                }

                // validate the optional field `metadata_deleted` (array)
                for (int i = 0; i < jsonArraymetadataDeleted.size(); i++) {
                    CollectionDeleteTypeIdentifiers.validateJsonElement(
                            jsonArraymetadataDeleted.get(i));
                }
                ;
            }
        }
        if (jsonObj.get("metadata_skipped") != null
                && !jsonObj.get("metadata_skipped").isJsonNull()) {
            JsonArray jsonArraymetadataSkipped = jsonObj.getAsJsonArray("metadata_skipped");
            if (jsonArraymetadataSkipped != null) {
                // ensure the json data is an array
                if (!jsonObj.get("metadata_skipped").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `metadata_skipped` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("metadata_skipped").toString()));
                }

                // validate the optional field `metadata_skipped` (array)
                for (int i = 0; i < jsonArraymetadataSkipped.size(); i++) {
                    CollectionDeleteTypeIdentifiers.validateJsonElement(
                            jsonArraymetadataSkipped.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CollectionDeleteResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CollectionDeleteResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CollectionDeleteResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CollectionDeleteResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CollectionDeleteResponse>() {
                        @Override
                        public void write(JsonWriter out, CollectionDeleteResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            obj.remove("additionalProperties");
                            // serialize additional properties
                            if (value.getAdditionalProperties() != null) {
                                for (Map.Entry<String, Object> entry :
                                        value.getAdditionalProperties().entrySet()) {
                                    if (entry.getValue() instanceof String)
                                        obj.addProperty(entry.getKey(), (String) entry.getValue());
                                    else if (entry.getValue() instanceof Number)
                                        obj.addProperty(entry.getKey(), (Number) entry.getValue());
                                    else if (entry.getValue() instanceof Boolean)
                                        obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                                    else if (entry.getValue() instanceof Character)
                                        obj.addProperty(
                                                entry.getKey(), (Character) entry.getValue());
                                    else {
                                        JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                                        if (jsonElement.isJsonArray()) {
                                            obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                                        } else {
                                            obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                                        }
                                    }
                                }
                            }
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CollectionDeleteResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            CollectionDeleteResponse instance = thisAdapter.fromJsonTree(jsonObj);
                            for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
                                if (!openapiFields.contains(entry.getKey())) {
                                    if (entry.getValue().isJsonPrimitive()) { // primitive type
                                        if (entry.getValue().getAsJsonPrimitive().isString())
                                            instance.putAdditionalProperty(
                                                    entry.getKey(), entry.getValue().getAsString());
                                        else if (entry.getValue().getAsJsonPrimitive().isNumber())
                                            instance.putAdditionalProperty(
                                                    entry.getKey(), entry.getValue().getAsNumber());
                                        else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                                            instance.putAdditionalProperty(
                                                    entry.getKey(),
                                                    entry.getValue().getAsBoolean());
                                        else
                                            throw new IllegalArgumentException(
                                                    String.format(
                                                            "The field `%s` has unknown primitive"
                                                                    + " type. Value: %s",
                                                            entry.getKey(),
                                                            entry.getValue().toString()));
                                    } else if (entry.getValue().isJsonArray()) {
                                        instance.putAdditionalProperty(
                                                entry.getKey(),
                                                gson.fromJson(entry.getValue(), List.class));
                                    } else { // JSON object
                                        instance.putAdditionalProperty(
                                                entry.getKey(),
                                                gson.fromJson(entry.getValue(), HashMap.class));
                                    }
                                }
                            }
                            return instance;
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CollectionDeleteResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CollectionDeleteResponse
     * @throws IOException if the JSON string is invalid with respect to CollectionDeleteResponse
     */
    public static CollectionDeleteResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CollectionDeleteResponse.class);
    }

    /**
     * Convert an instance of CollectionDeleteResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
