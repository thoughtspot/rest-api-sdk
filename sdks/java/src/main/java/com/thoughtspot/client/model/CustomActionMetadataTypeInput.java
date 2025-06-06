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

/** MetadataType InputType used in Custom Action API&#39;s */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CustomActionMetadataTypeInput implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Type of metadata object. Required if the name of the object is set as the identifier. This
     * attribute is optional when the object GUID is specified as the identifier.
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        VISUALIZATION("VISUALIZATION"),

        ANSWER("ANSWER"),

        WORKSHEET("WORKSHEET");

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

    public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER)
    @javax.annotation.Nonnull
    private String identifier;

    public CustomActionMetadataTypeInput() {}

    public CustomActionMetadataTypeInput type(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Type of metadata object. Required if the name of the object is set as the identifier. This
     * attribute is optional when the object GUID is specified as the identifier.
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

    public CustomActionMetadataTypeInput identifier(@javax.annotation.Nonnull String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Unique ID or name of the metadata object.
     *
     * @return identifier
     */
    @javax.annotation.Nonnull
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(@javax.annotation.Nonnull String identifier) {
        this.identifier = identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomActionMetadataTypeInput customActionMetadataTypeInput =
                (CustomActionMetadataTypeInput) o;
        return Objects.equals(this.type, customActionMetadataTypeInput.type)
                && Objects.equals(this.identifier, customActionMetadataTypeInput.identifier);
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
        return Objects.hash(type, identifier);
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
        sb.append("class CustomActionMetadataTypeInput {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
        openapiFields.add("identifier");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     CustomActionMetadataTypeInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CustomActionMetadataTypeInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CustomActionMetadataTypeInput is not"
                                        + " found in the empty JSON string",
                                CustomActionMetadataTypeInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CustomActionMetadataTypeInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CustomActionMetadataTypeInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CustomActionMetadataTypeInput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
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
        // validate the optional field `type`
        if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
            TypeEnum.validateJsonElement(jsonObj.get("type"));
        }
        if (!jsonObj.get("identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `identifier` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("identifier").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CustomActionMetadataTypeInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CustomActionMetadataTypeInput' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CustomActionMetadataTypeInput> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(CustomActionMetadataTypeInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CustomActionMetadataTypeInput>() {
                        @Override
                        public void write(JsonWriter out, CustomActionMetadataTypeInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CustomActionMetadataTypeInput read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CustomActionMetadataTypeInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CustomActionMetadataTypeInput
     * @throws IOException if the JSON string is invalid with respect to
     *     CustomActionMetadataTypeInput
     */
    public static CustomActionMetadataTypeInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CustomActionMetadataTypeInput.class);
    }

    /**
     * Convert an instance of CustomActionMetadataTypeInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
