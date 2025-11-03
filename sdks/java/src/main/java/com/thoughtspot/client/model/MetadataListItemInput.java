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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** MetadataListItemInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class MetadataListItemInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER)
    @javax.annotation.Nullable
    private String identifier;

    public static final String SERIALIZED_NAME_OBJ_IDENTIFIER = "obj_identifier";

    @SerializedName(SERIALIZED_NAME_OBJ_IDENTIFIER)
    @javax.annotation.Nullable
    private String objIdentifier;

    public static final String SERIALIZED_NAME_NAME_PATTERN = "name_pattern";

    @SerializedName(SERIALIZED_NAME_NAME_PATTERN)
    @javax.annotation.Nullable
    private String namePattern;

    /**
     * Type of metadata. Required if the name of the object is set as identifier. This attribute is
     * optional when the object GUID is specified as identifier. 1. Liveboard 2. Answers 3.
     * LOGICAL_TABLE for any data object such as table, worksheet or view. 4. LOGICAL_COLUMN for a
     * column of any data object such as table, worksheet or view. 5. CONNECTION for creating or
     * modify data connections. 6. TAG for tag objects. 7. USER for user objects. 8. USER_GROUP for
     * group objects. 9. LOGICAL_RELATIONSHIP for table or worksheet joins. A join combines from one
     * or several data object by using matching values 10. INSIGHT_SPEC for SpotIQ objects
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        LIVEBOARD("LIVEBOARD"),

        ANSWER("ANSWER"),

        LOGICAL_TABLE("LOGICAL_TABLE"),

        LOGICAL_COLUMN("LOGICAL_COLUMN"),

        CONNECTION("CONNECTION"),

        TAG("TAG"),

        USER("USER"),

        USER_GROUP("USER_GROUP"),

        LOGICAL_RELATIONSHIP("LOGICAL_RELATIONSHIP"),

        INSIGHT_SPEC("INSIGHT_SPEC");

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

    public MetadataListItemInput() {}

    public MetadataListItemInput identifier(@javax.annotation.Nullable String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Unique ID or name of the metadata.
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

    public MetadataListItemInput objIdentifier(@javax.annotation.Nullable String objIdentifier) {
        this.objIdentifier = objIdentifier;
        return this;
    }

    /**
     * CustomObjectId of the metadata.
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

    public MetadataListItemInput namePattern(@javax.annotation.Nullable String namePattern) {
        this.namePattern = namePattern;
        return this;
    }

    /**
     * A pattern to match the case-insensitive name of the metadata object. User % for a wildcard
     * match.
     *
     * @return namePattern
     */
    @javax.annotation.Nullable
    public String getNamePattern() {
        return namePattern;
    }

    public void setNamePattern(@javax.annotation.Nullable String namePattern) {
        this.namePattern = namePattern;
    }

    public MetadataListItemInput type(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Type of metadata. Required if the name of the object is set as identifier. This attribute is
     * optional when the object GUID is specified as identifier. 1. Liveboard 2. Answers 3.
     * LOGICAL_TABLE for any data object such as table, worksheet or view. 4. LOGICAL_COLUMN for a
     * column of any data object such as table, worksheet or view. 5. CONNECTION for creating or
     * modify data connections. 6. TAG for tag objects. 7. USER for user objects. 8. USER_GROUP for
     * group objects. 9. LOGICAL_RELATIONSHIP for table or worksheet joins. A join combines from one
     * or several data object by using matching values 10. INSIGHT_SPEC for SpotIQ objects
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetadataListItemInput metadataListItemInput = (MetadataListItemInput) o;
        return Objects.equals(this.identifier, metadataListItemInput.identifier)
                && Objects.equals(this.objIdentifier, metadataListItemInput.objIdentifier)
                && Objects.equals(this.namePattern, metadataListItemInput.namePattern)
                && Objects.equals(this.type, metadataListItemInput.type);
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
        return Objects.hash(identifier, objIdentifier, namePattern, type);
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
        sb.append("class MetadataListItemInput {\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    objIdentifier: ").append(toIndentedString(objIdentifier)).append("\n");
        sb.append("    namePattern: ").append(toIndentedString(namePattern)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
        openapiFields.add("name_pattern");
        openapiFields.add("type");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to MetadataListItemInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!MetadataListItemInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in MetadataListItemInput is not found in"
                                        + " the empty JSON string",
                                MetadataListItemInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!MetadataListItemInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `MetadataListItemInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
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
        if ((jsonObj.get("name_pattern") != null && !jsonObj.get("name_pattern").isJsonNull())
                && !jsonObj.get("name_pattern").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name_pattern` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("name_pattern").toString()));
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
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!MetadataListItemInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'MetadataListItemInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<MetadataListItemInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(MetadataListItemInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<MetadataListItemInput>() {
                        @Override
                        public void write(JsonWriter out, MetadataListItemInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public MetadataListItemInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of MetadataListItemInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of MetadataListItemInput
     * @throws IOException if the JSON string is invalid with respect to MetadataListItemInput
     */
    public static MetadataListItemInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, MetadataListItemInput.class);
    }

    /**
     * Convert an instance of MetadataListItemInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
