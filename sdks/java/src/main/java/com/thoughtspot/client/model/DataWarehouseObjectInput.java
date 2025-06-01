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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** DataWarehouseObjectInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DataWarehouseObjectInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DATABASE = "database";

    @SerializedName(SERIALIZED_NAME_DATABASE)
    @javax.annotation.Nullable
    private String database;

    public static final String SERIALIZED_NAME_SCHEMA = "schema";

    @SerializedName(SERIALIZED_NAME_SCHEMA)
    @javax.annotation.Nullable
    private String schema;

    public static final String SERIALIZED_NAME_TABLE = "table";

    @SerializedName(SERIALIZED_NAME_TABLE)
    @javax.annotation.Nullable
    private String table;

    public static final String SERIALIZED_NAME_COLUMN = "column";

    @SerializedName(SERIALIZED_NAME_COLUMN)
    @javax.annotation.Nullable
    private String column;

    public DataWarehouseObjectInput() {}

    public DataWarehouseObjectInput database(@javax.annotation.Nullable String database) {
        this.database = database;
        return this;
    }

    /**
     * Name of the database.
     *
     * @return database
     */
    @javax.annotation.Nullable
    public String getDatabase() {
        return database;
    }

    public void setDatabase(@javax.annotation.Nullable String database) {
        this.database = database;
    }

    public DataWarehouseObjectInput schema(@javax.annotation.Nullable String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Name of the schema within the database.
     *
     * @return schema
     */
    @javax.annotation.Nullable
    public String getSchema() {
        return schema;
    }

    public void setSchema(@javax.annotation.Nullable String schema) {
        this.schema = schema;
    }

    public DataWarehouseObjectInput table(@javax.annotation.Nullable String table) {
        this.table = table;
        return this;
    }

    /**
     * Name of the table within the schema.
     *
     * @return table
     */
    @javax.annotation.Nullable
    public String getTable() {
        return table;
    }

    public void setTable(@javax.annotation.Nullable String table) {
        this.table = table;
    }

    public DataWarehouseObjectInput column(@javax.annotation.Nullable String column) {
        this.column = column;
        return this;
    }

    /**
     * Name of the column within the table.
     *
     * @return column
     */
    @javax.annotation.Nullable
    public String getColumn() {
        return column;
    }

    public void setColumn(@javax.annotation.Nullable String column) {
        this.column = column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataWarehouseObjectInput dataWarehouseObjectInput = (DataWarehouseObjectInput) o;
        return Objects.equals(this.database, dataWarehouseObjectInput.database)
                && Objects.equals(this.schema, dataWarehouseObjectInput.schema)
                && Objects.equals(this.table, dataWarehouseObjectInput.table)
                && Objects.equals(this.column, dataWarehouseObjectInput.column);
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
        return Objects.hash(database, schema, table, column);
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
        sb.append("class DataWarehouseObjectInput {\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    column: ").append(toIndentedString(column)).append("\n");
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
        openapiFields.add("database");
        openapiFields.add("schema");
        openapiFields.add("table");
        openapiFields.add("column");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to DataWarehouseObjectInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DataWarehouseObjectInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DataWarehouseObjectInput is not found"
                                        + " in the empty JSON string",
                                DataWarehouseObjectInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!DataWarehouseObjectInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `DataWarehouseObjectInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("database") != null && !jsonObj.get("database").isJsonNull())
                && !jsonObj.get("database").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `database` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("database").toString()));
        }
        if ((jsonObj.get("schema") != null && !jsonObj.get("schema").isJsonNull())
                && !jsonObj.get("schema").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `schema` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("schema").toString()));
        }
        if ((jsonObj.get("table") != null && !jsonObj.get("table").isJsonNull())
                && !jsonObj.get("table").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `table` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("table").toString()));
        }
        if ((jsonObj.get("column") != null && !jsonObj.get("column").isJsonNull())
                && !jsonObj.get("column").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `column` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("column").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DataWarehouseObjectInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DataWarehouseObjectInput' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DataWarehouseObjectInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(DataWarehouseObjectInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DataWarehouseObjectInput>() {
                        @Override
                        public void write(JsonWriter out, DataWarehouseObjectInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DataWarehouseObjectInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DataWarehouseObjectInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DataWarehouseObjectInput
     * @throws IOException if the JSON string is invalid with respect to DataWarehouseObjectInput
     */
    public static DataWarehouseObjectInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DataWarehouseObjectInput.class);
    }

    /**
     * Convert an instance of DataWarehouseObjectInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
