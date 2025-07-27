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
import com.google.gson.annotations.JsonAdapter;
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

/** Favorite object options. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class HeaderUpdateInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER)
    @javax.annotation.Nullable
    private String identifier;

    public static final String SERIALIZED_NAME_OBJ_IDENTIFIER = "obj_identifier";

    @SerializedName(SERIALIZED_NAME_OBJ_IDENTIFIER)
    @javax.annotation.Nullable
    private String objIdentifier;

    /** Optional type of the header object. */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        ANSWER("ANSWER"),

        LOGICAL_TABLE("LOGICAL_TABLE"),

        LOGICAL_COLUMN("LOGICAL_COLUMN"),

        LIVEBOARD("LIVEBOARD"),

        ACTION_OBJECT("ACTION_OBJECT"),

        DATA_SOURCE("DATA_SOURCE"),

        USER("USER"),

        USER_GROUP("USER_GROUP");

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
            return null;
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
    @javax.annotation.Nullable
    private TypeEnum type;

    public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";

    @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
    @javax.annotation.Nonnull
    private List<HeaderAttributeInput> attributes;

    public HeaderUpdateInput() {}

    public HeaderUpdateInput identifier(@javax.annotation.Nullable String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Unique ID of a specified type to identify the header.
     *
     * @return identifier
     */
    @javax.annotation.Nullable
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(@javax.annotation.Nullable String identifier) {
        this.identifier = identifier;
    }

    public HeaderUpdateInput objIdentifier(@javax.annotation.Nullable String objIdentifier) {
        this.objIdentifier = objIdentifier;
        return this;
    }

    /**
     * Custom object identifier to uniquely identify header.
     *
     * @return objIdentifier
     */
    @javax.annotation.Nullable
    public String getObjIdentifier() {
        return objIdentifier;
    }

    public void setObjIdentifier(@javax.annotation.Nullable String objIdentifier) {
        this.objIdentifier = objIdentifier;
    }

    public HeaderUpdateInput type(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Optional type of the header object.
     *
     * @return type
     */
    @javax.annotation.Nullable
    public TypeEnum getType() {
        return type;
    }

    public void setType(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
    }

    public HeaderUpdateInput attributes(
            @javax.annotation.Nonnull List<HeaderAttributeInput> attributes) {
        this.attributes = attributes;
        return this;
    }

    public HeaderUpdateInput addAttributesItem(HeaderAttributeInput attributesItem) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(attributesItem);
        return this;
    }

    /**
     * List of attributes to update
     *
     * @return attributes
     */
    @javax.annotation.Nonnull
    public List<HeaderAttributeInput> getAttributes() {
        return attributes;
    }

    public void setAttributes(@javax.annotation.Nonnull List<HeaderAttributeInput> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HeaderUpdateInput headerUpdateInput = (HeaderUpdateInput) o;
        return Objects.equals(this.identifier, headerUpdateInput.identifier)
                && Objects.equals(this.objIdentifier, headerUpdateInput.objIdentifier)
                && Objects.equals(this.type, headerUpdateInput.type)
                && Objects.equals(this.attributes, headerUpdateInput.attributes);
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
        return Objects.hash(identifier, objIdentifier, type, attributes);
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
        sb.append("class HeaderUpdateInput {\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    objIdentifier: ").append(toIndentedString(objIdentifier)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
        openapiFields.add("identifier");
        openapiFields.add("obj_identifier");
        openapiFields.add("type");
        openapiFields.add("attributes");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("attributes");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to HeaderUpdateInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!HeaderUpdateInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in HeaderUpdateInput is not found in the"
                                        + " empty JSON string",
                                HeaderUpdateInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!HeaderUpdateInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `HeaderUpdateInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : HeaderUpdateInput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull())
                && !jsonObj.get("identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `identifier` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("identifier").toString()));
        }
        if ((jsonObj.get("obj_identifier") != null && !jsonObj.get("obj_identifier").isJsonNull())
                && !jsonObj.get("obj_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `obj_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("obj_identifier").toString()));
        }
        if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull())
                && !jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
        // validate the optional field `type`
        if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
            TypeEnum.validateJsonElement(jsonObj.get("type"));
        }
        // ensure the json data is an array
        if (!jsonObj.get("attributes").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `attributes` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("attributes").toString()));
        }

        JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
        // validate the required field `attributes` (array)
        for (int i = 0; i < jsonArrayattributes.size(); i++) {
            HeaderAttributeInput.validateJsonElement(jsonArrayattributes.get(i));
        }
        ;
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!HeaderUpdateInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'HeaderUpdateInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<HeaderUpdateInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(HeaderUpdateInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<HeaderUpdateInput>() {
                        @Override
                        public void write(JsonWriter out, HeaderUpdateInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public HeaderUpdateInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of HeaderUpdateInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of HeaderUpdateInput
     * @throws IOException if the JSON string is invalid with respect to HeaderUpdateInput
     */
    public static HeaderUpdateInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, HeaderUpdateInput.class);
    }

    /**
     * Convert an instance of HeaderUpdateInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
