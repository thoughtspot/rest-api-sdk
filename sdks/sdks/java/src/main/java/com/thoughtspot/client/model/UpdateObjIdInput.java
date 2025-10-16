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

/** Input for updating object ID of a metadata object. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UpdateObjIdInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_METADATA_IDENTIFIER = "metadata_identifier";

    @SerializedName(SERIALIZED_NAME_METADATA_IDENTIFIER)
    @javax.annotation.Nullable
    private String metadataIdentifier;

    /** Type of metadata. Required if metadata_identifier is name of the object. */
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

    public static final String SERIALIZED_NAME_CURRENT_OBJ_ID = "current_obj_id";

    @SerializedName(SERIALIZED_NAME_CURRENT_OBJ_ID)
    @javax.annotation.Nullable
    private String currentObjId;

    public static final String SERIALIZED_NAME_NEW_OBJ_ID = "new_obj_id";

    @SerializedName(SERIALIZED_NAME_NEW_OBJ_ID)
    @javax.annotation.Nonnull
    private String newObjId;

    public UpdateObjIdInput() {}

    public UpdateObjIdInput metadataIdentifier(
            @javax.annotation.Nullable String metadataIdentifier) {
        this.metadataIdentifier = metadataIdentifier;
        return this;
    }

    /**
     * GUID or name of the metadata object.
     *
     * @return metadataIdentifier
     */
    @javax.annotation.Nullable
    public String getMetadataIdentifier() {
        return metadataIdentifier;
    }

    public void setMetadataIdentifier(@javax.annotation.Nullable String metadataIdentifier) {
        this.metadataIdentifier = metadataIdentifier;
    }

    public UpdateObjIdInput type(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Type of metadata. Required if metadata_identifier is name of the object.
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

    public UpdateObjIdInput currentObjId(@javax.annotation.Nullable String currentObjId) {
        this.currentObjId = currentObjId;
        return this;
    }

    /**
     * Current object ID value.
     *
     * @return currentObjId
     */
    @javax.annotation.Nullable
    public String getCurrentObjId() {
        return currentObjId;
    }

    public void setCurrentObjId(@javax.annotation.Nullable String currentObjId) {
        this.currentObjId = currentObjId;
    }

    public UpdateObjIdInput newObjId(@javax.annotation.Nonnull String newObjId) {
        this.newObjId = newObjId;
        return this;
    }

    /**
     * New object ID value to set.
     *
     * @return newObjId
     */
    @javax.annotation.Nonnull
    public String getNewObjId() {
        return newObjId;
    }

    public void setNewObjId(@javax.annotation.Nonnull String newObjId) {
        this.newObjId = newObjId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateObjIdInput updateObjIdInput = (UpdateObjIdInput) o;
        return Objects.equals(this.metadataIdentifier, updateObjIdInput.metadataIdentifier)
                && Objects.equals(this.type, updateObjIdInput.type)
                && Objects.equals(this.currentObjId, updateObjIdInput.currentObjId)
                && Objects.equals(this.newObjId, updateObjIdInput.newObjId);
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
        return Objects.hash(metadataIdentifier, type, currentObjId, newObjId);
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
        sb.append("class UpdateObjIdInput {\n");
        sb.append("    metadataIdentifier: ")
                .append(toIndentedString(metadataIdentifier))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    currentObjId: ").append(toIndentedString(currentObjId)).append("\n");
        sb.append("    newObjId: ").append(toIndentedString(newObjId)).append("\n");
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
        openapiFields.add("metadata_identifier");
        openapiFields.add("type");
        openapiFields.add("current_obj_id");
        openapiFields.add("new_obj_id");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("new_obj_id");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpdateObjIdInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UpdateObjIdInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateObjIdInput is not found in the"
                                        + " empty JSON string",
                                UpdateObjIdInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!UpdateObjIdInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UpdateObjIdInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UpdateObjIdInput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("metadata_identifier") != null
                        && !jsonObj.get("metadata_identifier").isJsonNull())
                && !jsonObj.get("metadata_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_identifier` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("metadata_identifier").toString()));
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
        if ((jsonObj.get("current_obj_id") != null && !jsonObj.get("current_obj_id").isJsonNull())
                && !jsonObj.get("current_obj_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `current_obj_id` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("current_obj_id").toString()));
        }
        if (!jsonObj.get("new_obj_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `new_obj_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("new_obj_id").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateObjIdInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateObjIdInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateObjIdInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UpdateObjIdInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateObjIdInput>() {
                        @Override
                        public void write(JsonWriter out, UpdateObjIdInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateObjIdInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateObjIdInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateObjIdInput
     * @throws IOException if the JSON string is invalid with respect to UpdateObjIdInput
     */
    public static UpdateObjIdInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateObjIdInput.class);
    }

    /**
     * Convert an instance of UpdateObjIdInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
