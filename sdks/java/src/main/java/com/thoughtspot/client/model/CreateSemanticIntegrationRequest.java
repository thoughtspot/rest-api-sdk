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

/** CreateSemanticIntegrationRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CreateSemanticIntegrationRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONNECTION_IDENTIFIER = "connection_identifier";

    @SerializedName(SERIALIZED_NAME_CONNECTION_IDENTIFIER)
    @javax.annotation.Nonnull
    private String connectionIdentifier;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    public static final String SERIALIZED_NAME_DATABASE_NAME = "database_name";

    @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
    @javax.annotation.Nonnull
    private String databaseName;

    public static final String SERIALIZED_NAME_SCHEMA_NAME = "schema_name";

    @SerializedName(SERIALIZED_NAME_SCHEMA_NAME)
    @javax.annotation.Nonnull
    private String schemaName;

    public static final String SERIALIZED_NAME_SEMANTIC_VIEW_NAME = "semantic_view_name";

    @SerializedName(SERIALIZED_NAME_SEMANTIC_VIEW_NAME)
    @javax.annotation.Nonnull
    private String semanticViewName;

    /** CDW connector type. */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        RDBMS_SNOWFLAKE("RDBMS_SNOWFLAKE");

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

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nullable
    private String description;

    public CreateSemanticIntegrationRequest() {}

    public CreateSemanticIntegrationRequest connectionIdentifier(
            @javax.annotation.Nonnull String connectionIdentifier) {
        this.connectionIdentifier = connectionIdentifier;
        return this;
    }

    /**
     * ID or name of the CDW connection.
     *
     * @return connectionIdentifier
     */
    @javax.annotation.Nonnull
    public String getConnectionIdentifier() {
        return connectionIdentifier;
    }

    public void setConnectionIdentifier(@javax.annotation.Nonnull String connectionIdentifier) {
        this.connectionIdentifier = connectionIdentifier;
    }

    public CreateSemanticIntegrationRequest name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the semantic integration. Must be unique.
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

    public CreateSemanticIntegrationRequest databaseName(
            @javax.annotation.Nonnull String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Database name in the CDW.
     *
     * @return databaseName
     */
    @javax.annotation.Nonnull
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(@javax.annotation.Nonnull String databaseName) {
        this.databaseName = databaseName;
    }

    public CreateSemanticIntegrationRequest schemaName(
            @javax.annotation.Nonnull String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * Schema name in the CDW.
     *
     * @return schemaName
     */
    @javax.annotation.Nonnull
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(@javax.annotation.Nonnull String schemaName) {
        this.schemaName = schemaName;
    }

    public CreateSemanticIntegrationRequest semanticViewName(
            @javax.annotation.Nonnull String semanticViewName) {
        this.semanticViewName = semanticViewName;
        return this;
    }

    /**
     * Semantic view name in the CDW.
     *
     * @return semanticViewName
     */
    @javax.annotation.Nonnull
    public String getSemanticViewName() {
        return semanticViewName;
    }

    public void setSemanticViewName(@javax.annotation.Nonnull String semanticViewName) {
        this.semanticViewName = semanticViewName;
    }

    public CreateSemanticIntegrationRequest type(@javax.annotation.Nonnull TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * CDW connector type.
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

    public CreateSemanticIntegrationRequest description(
            @javax.annotation.Nullable String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional description of the semantic integration.
     *
     * @return description
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@javax.annotation.Nullable String description) {
        this.description = description;
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
     * @return the CreateSemanticIntegrationRequest instance itself
     */
    public CreateSemanticIntegrationRequest putAdditionalProperty(String key, Object value) {
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
        CreateSemanticIntegrationRequest createSemanticIntegrationRequest =
                (CreateSemanticIntegrationRequest) o;
        return Objects.equals(
                        this.connectionIdentifier,
                        createSemanticIntegrationRequest.connectionIdentifier)
                && Objects.equals(this.name, createSemanticIntegrationRequest.name)
                && Objects.equals(this.databaseName, createSemanticIntegrationRequest.databaseName)
                && Objects.equals(this.schemaName, createSemanticIntegrationRequest.schemaName)
                && Objects.equals(
                        this.semanticViewName, createSemanticIntegrationRequest.semanticViewName)
                && Objects.equals(this.type, createSemanticIntegrationRequest.type)
                && Objects.equals(this.description, createSemanticIntegrationRequest.description)
                && Objects.equals(
                        this.additionalProperties,
                        createSemanticIntegrationRequest.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                connectionIdentifier,
                name,
                databaseName,
                schemaName,
                semanticViewName,
                type,
                description,
                additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSemanticIntegrationRequest {\n");
        sb.append("    connectionIdentifier: ")
                .append(toIndentedString(connectionIdentifier))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    semanticViewName: ").append(toIndentedString(semanticViewName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
        openapiFields.add("connection_identifier");
        openapiFields.add("name");
        openapiFields.add("database_name");
        openapiFields.add("schema_name");
        openapiFields.add("semantic_view_name");
        openapiFields.add("type");
        openapiFields.add("description");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("connection_identifier");
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("database_name");
        openapiRequiredFields.add("schema_name");
        openapiRequiredFields.add("semantic_view_name");
        openapiRequiredFields.add("type");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     CreateSemanticIntegrationRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CreateSemanticIntegrationRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateSemanticIntegrationRequest is"
                                        + " not found in the empty JSON string",
                                CreateSemanticIntegrationRequest.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateSemanticIntegrationRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("connection_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `connection_identifier` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("connection_identifier").toString()));
        }
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if (!jsonObj.get("database_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `database_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("database_name").toString()));
        }
        if (!jsonObj.get("schema_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `schema_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("schema_name").toString()));
        }
        if (!jsonObj.get("semantic_view_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `semantic_view_name` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("semantic_view_name").toString()));
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
        if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
                && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("description").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateSemanticIntegrationRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateSemanticIntegrationRequest' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateSemanticIntegrationRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(CreateSemanticIntegrationRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateSemanticIntegrationRequest>() {
                        @Override
                        public void write(JsonWriter out, CreateSemanticIntegrationRequest value)
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
                        public CreateSemanticIntegrationRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            CreateSemanticIntegrationRequest instance =
                                    thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of CreateSemanticIntegrationRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateSemanticIntegrationRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     CreateSemanticIntegrationRequest
     */
    public static CreateSemanticIntegrationRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateSemanticIntegrationRequest.class);
    }

    /**
     * Convert an instance of CreateSemanticIntegrationRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
