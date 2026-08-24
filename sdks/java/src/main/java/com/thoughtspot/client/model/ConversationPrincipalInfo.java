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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A principal that has been granted access to a shared conversation. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ConversationPrincipalInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nonnull
    private String id;

    /** Whether the principal is an individual user or a group. */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
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

    public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
    @javax.annotation.Nonnull
    private String displayName;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    /**
     * Access level granted to the principal. Always &#x60;READ_ONLY&#x60; for shared conversations.
     */
    @JsonAdapter(PermissionEnum.Adapter.class)
    public enum PermissionEnum {
        READ_ONLY("READ_ONLY"),

        MODIFY("MODIFY"),

        NO_ACCESS("NO_ACCESS");

        private String value;

        PermissionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PermissionEnum fromValue(String value) {
            for (PermissionEnum b : PermissionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<PermissionEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PermissionEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PermissionEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PermissionEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            PermissionEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_PERMISSION = "permission";

    @SerializedName(SERIALIZED_NAME_PERMISSION)
    @javax.annotation.Nonnull
    private PermissionEnum permission;

    public ConversationPrincipalInfo() {}

    public ConversationPrincipalInfo id(@javax.annotation.Nonnull String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the user or group.
     *
     * @return id
     */
    @javax.annotation.Nonnull
    public String getId() {
        return id;
    }

    public void setId(@javax.annotation.Nonnull String id) {
        this.id = id;
    }

    public ConversationPrincipalInfo type(@javax.annotation.Nonnull TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Whether the principal is an individual user or a group.
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

    public ConversationPrincipalInfo displayName(@javax.annotation.Nonnull String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Display name of the principal as shown in the UI.
     *
     * @return displayName
     */
    @javax.annotation.Nonnull
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(@javax.annotation.Nonnull String displayName) {
        this.displayName = displayName;
    }

    public ConversationPrincipalInfo name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Internal name of the principal.
     *
     * @return name
     */
    @javax.annotation.Nonnull
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nonnull String name) {
        this.name = name;
    }

    public ConversationPrincipalInfo permission(
            @javax.annotation.Nonnull PermissionEnum permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Access level granted to the principal. Always &#x60;READ_ONLY&#x60; for shared conversations.
     *
     * @return permission
     */
    @javax.annotation.Nonnull
    public PermissionEnum getPermission() {
        return permission;
    }

    public void setPermission(@javax.annotation.Nonnull PermissionEnum permission) {
        this.permission = permission;
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
     * @return the ConversationPrincipalInfo instance itself
     */
    public ConversationPrincipalInfo putAdditionalProperty(String key, Object value) {
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
        ConversationPrincipalInfo conversationPrincipalInfo = (ConversationPrincipalInfo) o;
        return Objects.equals(this.id, conversationPrincipalInfo.id)
                && Objects.equals(this.type, conversationPrincipalInfo.type)
                && Objects.equals(this.displayName, conversationPrincipalInfo.displayName)
                && Objects.equals(this.name, conversationPrincipalInfo.name)
                && Objects.equals(this.permission, conversationPrincipalInfo.permission)
                && Objects.equals(
                        this.additionalProperties, conversationPrincipalInfo.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, displayName, name, permission, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversationPrincipalInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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
        openapiFields.add("id");
        openapiFields.add("type");
        openapiFields.add("display_name");
        openapiFields.add("name");
        openapiFields.add("permission");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("type");
        openapiRequiredFields.add("display_name");
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("permission");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ConversationPrincipalInfo
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ConversationPrincipalInfo.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ConversationPrincipalInfo is not"
                                        + " found in the empty JSON string",
                                ConversationPrincipalInfo.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ConversationPrincipalInfo.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
        }
        if (!jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
        // validate the required field `type`
        TypeEnum.validateJsonElement(jsonObj.get("type"));
        if (!jsonObj.get("display_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `display_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("display_name").toString()));
        }
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if (!jsonObj.get("permission").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `permission` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("permission").toString()));
        }
        // validate the required field `permission`
        PermissionEnum.validateJsonElement(jsonObj.get("permission"));
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ConversationPrincipalInfo.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ConversationPrincipalInfo' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ConversationPrincipalInfo> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ConversationPrincipalInfo.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ConversationPrincipalInfo>() {
                        @Override
                        public void write(JsonWriter out, ConversationPrincipalInfo value)
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
                        public ConversationPrincipalInfo read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            ConversationPrincipalInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of ConversationPrincipalInfo given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ConversationPrincipalInfo
     * @throws IOException if the JSON string is invalid with respect to ConversationPrincipalInfo
     */
    public static ConversationPrincipalInfo fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ConversationPrincipalInfo.class);
    }

    /**
     * Convert an instance of ConversationPrincipalInfo to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
