/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
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

/** Input type for metadata to be added to a collection. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CollectionMetadataInput implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Type of metadata object. */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        LIVEBOARD("LIVEBOARD"),

        ANSWER("ANSWER"),

        LOGICAL_TABLE("LOGICAL_TABLE"),

        COLLECTION("COLLECTION");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<TypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            TypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @javax.annotation.Nonnull
    private TypeEnum type;

    public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";

    @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
    @javax.annotation.Nonnull
    private List<String> identifiers;

    public CollectionMetadataInput() {}

    public CollectionMetadataInput type(@javax.annotation.Nonnull TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Type of metadata object.
     *
     * @return type
     */
    @javax.annotation.Nonnull
    public TypeEnum getType() {
        return type;
    }

    public void setType(@javax.annotation.Nonnull TypeEnum type) {
        this.type = type;
    }

    public CollectionMetadataInput identifiers(@javax.annotation.Nonnull List<String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    public CollectionMetadataInput addIdentifiersItem(String identifiersItem) {
        if (this.identifiers == null) {
            this.identifiers = new ArrayList<>();
        }
        this.identifiers.add(identifiersItem);
        return this;
    }

    /**
     * List of unique IDs or names of metadata objects.
     *
     * @return identifiers
     */
    @javax.annotation.Nonnull
    public List<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(@javax.annotation.Nonnull List<String> identifiers) {
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
        CollectionMetadataInput collectionMetadataInput = (CollectionMetadataInput) o;
        return Objects.equals(this.type, collectionMetadataInput.type)
                && Objects.equals(this.identifiers, collectionMetadataInput.identifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, identifiers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectionMetadataInput {\n");
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
        openapiRequiredFields.add("type");
        openapiRequiredFields.add("identifiers");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CollectionMetadataInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CollectionMetadataInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CollectionMetadataInput is not found"
                                        + " in the empty JSON string",
                                CollectionMetadataInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CollectionMetadataInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CollectionMetadataInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CollectionMetadataInput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
        // validate the required field `type`
        TypeEnum.validateJsonElement(jsonObj.get("type"));
        // ensure the required json array is present
        if (jsonObj.get("identifiers") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `identifiers` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("identifiers").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CollectionMetadataInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CollectionMetadataInput' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CollectionMetadataInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CollectionMetadataInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CollectionMetadataInput>() {
                        @Override
                        public void write(JsonWriter out, CollectionMetadataInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CollectionMetadataInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CollectionMetadataInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CollectionMetadataInput
     * @throws IOException if the JSON string is invalid with respect to CollectionMetadataInput
     */
    public static CollectionMetadataInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CollectionMetadataInput.class);
    }

    /**
     * Convert an instance of CollectionMetadataInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
