/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ExternalTableInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ExternalTableInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONNECTION_IDENTIFIER = "connection_identifier";

    @SerializedName(SERIALIZED_NAME_CONNECTION_IDENTIFIER)
    @javax.annotation.Nonnull
    private String connectionIdentifier;

    public static final String SERIALIZED_NAME_DATABASE_NAME = "database_name";

    @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
    @javax.annotation.Nullable
    private String databaseName = "";

    public static final String SERIALIZED_NAME_SCHEMA_NAME = "schema_name";

    @SerializedName(SERIALIZED_NAME_SCHEMA_NAME)
    @javax.annotation.Nullable
    private String schemaName = "";

    public static final String SERIALIZED_NAME_TABLE_NAME = "table_name";

    @SerializedName(SERIALIZED_NAME_TABLE_NAME)
    @javax.annotation.Nonnull
    private String tableName;

    public ExternalTableInput() {}

    public ExternalTableInput connectionIdentifier(
            @javax.annotation.Nonnull String connectionIdentifier) {
        this.connectionIdentifier = connectionIdentifier;
        return this;
    }

    /**
     * Unique ID or name of the connection.
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

    public ExternalTableInput databaseName(@javax.annotation.Nullable String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Name of the database.
     *
     * @return databaseName
     */
    @javax.annotation.Nullable
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(@javax.annotation.Nullable String databaseName) {
        this.databaseName = databaseName;
    }

    public ExternalTableInput schemaName(@javax.annotation.Nullable String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * Name of the schema.
     *
     * @return schemaName
     */
    @javax.annotation.Nullable
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(@javax.annotation.Nullable String schemaName) {
        this.schemaName = schemaName;
    }

    public ExternalTableInput tableName(@javax.annotation.Nonnull String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Name of the table. Table names may be case-sensitive depending on the database system.
     *
     * @return tableName
     */
    @javax.annotation.Nonnull
    public String getTableName() {
        return tableName;
    }

    public void setTableName(@javax.annotation.Nonnull String tableName) {
        this.tableName = tableName;
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
     * @return the ExternalTableInput instance itself
     */
    public ExternalTableInput putAdditionalProperty(String key, Object value) {
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
        ExternalTableInput externalTableInput = (ExternalTableInput) o;
        return Objects.equals(this.connectionIdentifier, externalTableInput.connectionIdentifier)
                && Objects.equals(this.databaseName, externalTableInput.databaseName)
                && Objects.equals(this.schemaName, externalTableInput.schemaName)
                && Objects.equals(this.tableName, externalTableInput.tableName)
                && Objects.equals(
                        this.additionalProperties, externalTableInput.additionalProperties);
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
        return Objects.hash(
                connectionIdentifier, databaseName, schemaName, tableName, additionalProperties);
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
        sb.append("class ExternalTableInput {\n");
        sb.append("    connectionIdentifier: ")
                .append(toIndentedString(connectionIdentifier))
                .append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
        openapiFields.add("database_name");
        openapiFields.add("schema_name");
        openapiFields.add("table_name");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("connection_identifier");
        openapiRequiredFields.add("table_name");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ExternalTableInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ExternalTableInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ExternalTableInput is not found in"
                                        + " the empty JSON string",
                                ExternalTableInput.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ExternalTableInput.openapiRequiredFields) {
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
        if ((jsonObj.get("database_name") != null && !jsonObj.get("database_name").isJsonNull())
                && !jsonObj.get("database_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `database_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("database_name").toString()));
        }
        if ((jsonObj.get("schema_name") != null && !jsonObj.get("schema_name").isJsonNull())
                && !jsonObj.get("schema_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `schema_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("schema_name").toString()));
        }
        if (!jsonObj.get("table_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `table_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("table_name").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ExternalTableInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ExternalTableInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ExternalTableInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ExternalTableInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ExternalTableInput>() {
                        @Override
                        public void write(JsonWriter out, ExternalTableInput value)
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
                        public ExternalTableInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            ExternalTableInput instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of ExternalTableInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ExternalTableInput
     * @throws IOException if the JSON string is invalid with respect to ExternalTableInput
     */
    public static ExternalTableInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ExternalTableInput.class);
    }

    /**
     * Convert an instance of ExternalTableInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
