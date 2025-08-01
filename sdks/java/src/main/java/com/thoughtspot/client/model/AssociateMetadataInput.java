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

/** AssociateMetadataInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AssociateMetadataInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ACTION_CONFIG = "action_config";

    @SerializedName(SERIALIZED_NAME_ACTION_CONFIG)
    @javax.annotation.Nullable
    private ActionConfigInput actionConfig;

    public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER)
    @javax.annotation.Nullable
    private String identifier;

    /**
     * Type of metadata. Required if the name of the object is set as the identifier. This attribute
     * is optional when the object GUID is specified as the identifier.
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

    public AssociateMetadataInput() {}

    public AssociateMetadataInput actionConfig(
            @javax.annotation.Nullable ActionConfigInput actionConfig) {
        this.actionConfig = actionConfig;
        return this;
    }

    /**
     * Get actionConfig
     *
     * @return actionConfig
     */
    @javax.annotation.Nullable
    public ActionConfigInput getActionConfig() {
        return actionConfig;
    }

    public void setActionConfig(@javax.annotation.Nullable ActionConfigInput actionConfig) {
        this.actionConfig = actionConfig;
    }

    public AssociateMetadataInput identifier(@javax.annotation.Nullable String identifier) {
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

    public AssociateMetadataInput type(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Type of metadata. Required if the name of the object is set as the identifier. This attribute
     * is optional when the object GUID is specified as the identifier.
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
        AssociateMetadataInput associateMetadataInput = (AssociateMetadataInput) o;
        return Objects.equals(this.actionConfig, associateMetadataInput.actionConfig)
                && Objects.equals(this.identifier, associateMetadataInput.identifier)
                && Objects.equals(this.type, associateMetadataInput.type);
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
        return Objects.hash(actionConfig, identifier, type);
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
        sb.append("class AssociateMetadataInput {\n");
        sb.append("    actionConfig: ").append(toIndentedString(actionConfig)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
        openapiFields.add("action_config");
        openapiFields.add("identifier");
        openapiFields.add("type");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AssociateMetadataInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AssociateMetadataInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AssociateMetadataInput is not found"
                                        + " in the empty JSON string",
                                AssociateMetadataInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!AssociateMetadataInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `AssociateMetadataInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the optional field `action_config`
        if (jsonObj.get("action_config") != null && !jsonObj.get("action_config").isJsonNull()) {
            ActionConfigInput.validateJsonElement(jsonObj.get("action_config"));
        }
        if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull())
                && !jsonObj.get("identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `identifier` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("identifier").toString()));
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
            if (!AssociateMetadataInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AssociateMetadataInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AssociateMetadataInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AssociateMetadataInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AssociateMetadataInput>() {
                        @Override
                        public void write(JsonWriter out, AssociateMetadataInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AssociateMetadataInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AssociateMetadataInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AssociateMetadataInput
     * @throws IOException if the JSON string is invalid with respect to AssociateMetadataInput
     */
    public static AssociateMetadataInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AssociateMetadataInput.class);
    }

    /**
     * Convert an instance of AssociateMetadataInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
