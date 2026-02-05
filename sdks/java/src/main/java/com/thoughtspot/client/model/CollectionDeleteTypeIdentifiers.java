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

/** Group of metadata objects identified by type. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CollectionDeleteTypeIdentifiers implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @javax.annotation.Nullable
    private String type;

    public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";

    @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<GenericInfo> identifiers;

    public CollectionDeleteTypeIdentifiers() {}

    public CollectionDeleteTypeIdentifiers type(@javax.annotation.Nullable String type) {
        this.type = type;
        return this;
    }

    /**
     * Type of the metadata object (e.g., Collection, Worksheet, Table).
     *
     * @return type
     */
    @javax.annotation.Nullable
    public String getType() {
        return type;
    }

    public void setType(@javax.annotation.Nullable String type) {
        this.type = type;
    }

    public CollectionDeleteTypeIdentifiers identifiers(
            @javax.annotation.Nullable List<GenericInfo> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    public CollectionDeleteTypeIdentifiers addIdentifiersItem(GenericInfo identifiersItem) {
        if (this.identifiers == null) {
            this.identifiers = new ArrayList<>();
        }
        this.identifiers.add(identifiersItem);
        return this;
    }

    /**
     * List of metadata identifiers belonging to the given type.
     *
     * @return identifiers
     */
    @javax.annotation.Nullable
    public List<GenericInfo> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(@javax.annotation.Nullable List<GenericInfo> identifiers) {
        this.identifiers = identifiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollectionDeleteTypeIdentifiers collectionDeleteTypeIdentifiers =
                (CollectionDeleteTypeIdentifiers) o;
        return Objects.equals(this.type, collectionDeleteTypeIdentifiers.type)
                && Objects.equals(this.identifiers, collectionDeleteTypeIdentifiers.identifiers);
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
        return Objects.hash(type, identifiers);
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
        sb.append("class CollectionDeleteTypeIdentifiers {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
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
        openapiFields.add("type");
        openapiFields.add("identifiers");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     CollectionDeleteTypeIdentifiers
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CollectionDeleteTypeIdentifiers.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CollectionDeleteTypeIdentifiers is"
                                        + " not found in the empty JSON string",
                                CollectionDeleteTypeIdentifiers.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CollectionDeleteTypeIdentifiers.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CollectionDeleteTypeIdentifiers` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull())
                && !jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
        if (jsonObj.get("identifiers") != null && !jsonObj.get("identifiers").isJsonNull()) {
            JsonArray jsonArrayidentifiers = jsonObj.getAsJsonArray("identifiers");
            if (jsonArrayidentifiers != null) {
                // ensure the json data is an array
                if (!jsonObj.get("identifiers").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `identifiers` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("identifiers").toString()));
                }

                // validate the optional field `identifiers` (array)
                for (int i = 0; i < jsonArrayidentifiers.size(); i++) {
                    GenericInfo.validateJsonElement(jsonArrayidentifiers.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CollectionDeleteTypeIdentifiers.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CollectionDeleteTypeIdentifiers' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CollectionDeleteTypeIdentifiers> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(CollectionDeleteTypeIdentifiers.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CollectionDeleteTypeIdentifiers>() {
                        @Override
                        public void write(JsonWriter out, CollectionDeleteTypeIdentifiers value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CollectionDeleteTypeIdentifiers read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CollectionDeleteTypeIdentifiers given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CollectionDeleteTypeIdentifiers
     * @throws IOException if the JSON string is invalid with respect to
     *     CollectionDeleteTypeIdentifiers
     */
    public static CollectionDeleteTypeIdentifiers fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CollectionDeleteTypeIdentifiers.class);
    }

    /**
     * Convert an instance of CollectionDeleteTypeIdentifiers to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
