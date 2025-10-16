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

/** Table */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class Table implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    public static final String SERIALIZED_NAME_COLUMNS = "columns";

    @SerializedName(SERIALIZED_NAME_COLUMNS)
    @javax.annotation.Nullable
    private List<Column> columns;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @javax.annotation.Nullable
    private String type;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nullable
    private String description;

    public static final String SERIALIZED_NAME_SELECTED = "selected";

    @SerializedName(SERIALIZED_NAME_SELECTED)
    @javax.annotation.Nullable
    private Boolean selected;

    public static final String SERIALIZED_NAME_LINKED = "linked";

    @SerializedName(SERIALIZED_NAME_LINKED)
    @javax.annotation.Nullable
    private Boolean linked;

    public static final String SERIALIZED_NAME_RELATIONSHIPS = "relationships";

    @SerializedName(SERIALIZED_NAME_RELATIONSHIPS)
    @javax.annotation.Nullable
    private List<Object> relationships;

    public Table() {}

    public Table name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the table.
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

    public Table columns(@javax.annotation.Nullable List<Column> columns) {
        this.columns = columns;
        return this;
    }

    public Table addColumnsItem(Column columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    /**
     * Columns of the table.
     *
     * @return columns
     */
    @javax.annotation.Nullable
    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(@javax.annotation.Nullable List<Column> columns) {
        this.columns = columns;
    }

    public Table type(@javax.annotation.Nullable String type) {
        this.type = type;
        return this;
    }

    /**
     * Type of table. Either view or table
     *
     * @return type
     */
    @javax.annotation.Nullable
    public String getType() {
        return type;
    }

    public void setType(@javax.annotation.Nullable String type) {
        this.type = type;
    }

    public Table description(@javax.annotation.Nullable String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the table
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

    public Table selected(@javax.annotation.Nullable Boolean selected) {
        this.selected = selected;
        return this;
    }

    /**
     * Determines if the table is selected
     *
     * @return selected
     */
    @javax.annotation.Nullable
    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(@javax.annotation.Nullable Boolean selected) {
        this.selected = selected;
    }

    public Table linked(@javax.annotation.Nullable Boolean linked) {
        this.linked = linked;
        return this;
    }

    /**
     * Determines if the table is linked
     *
     * @return linked
     */
    @javax.annotation.Nullable
    public Boolean getLinked() {
        return linked;
    }

    public void setLinked(@javax.annotation.Nullable Boolean linked) {
        this.linked = linked;
    }

    public Table relationships(@javax.annotation.Nullable List<Object> relationships) {
        this.relationships = relationships;
        return this;
    }

    public Table addRelationshipsItem(Object relationshipsItem) {
        if (this.relationships == null) {
            this.relationships = new ArrayList<>();
        }
        this.relationships.add(relationshipsItem);
        return this;
    }

    /**
     * List of relationships for the table
     *
     * @return relationships
     */
    @javax.annotation.Nullable
    public List<Object> getRelationships() {
        return relationships;
    }

    public void setRelationships(@javax.annotation.Nullable List<Object> relationships) {
        this.relationships = relationships;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Table table = (Table) o;
        return Objects.equals(this.name, table.name)
                && Objects.equals(this.columns, table.columns)
                && Objects.equals(this.type, table.type)
                && Objects.equals(this.description, table.description)
                && Objects.equals(this.selected, table.selected)
                && Objects.equals(this.linked, table.linked)
                && Objects.equals(this.relationships, table.relationships);
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
        return Objects.hash(name, columns, type, description, selected, linked, relationships);
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
        sb.append("class Table {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
        sb.append("    linked: ").append(toIndentedString(linked)).append("\n");
        sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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
        openapiFields.add("name");
        openapiFields.add("columns");
        openapiFields.add("type");
        openapiFields.add("description");
        openapiFields.add("selected");
        openapiFields.add("linked");
        openapiFields.add("relationships");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("name");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Table
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!Table.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Table is not found in the empty JSON"
                                        + " string",
                                Table.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!Table.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `Table`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : Table.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if (jsonObj.get("columns") != null && !jsonObj.get("columns").isJsonNull()) {
            JsonArray jsonArraycolumns = jsonObj.getAsJsonArray("columns");
            if (jsonArraycolumns != null) {
                // ensure the json data is an array
                if (!jsonObj.get("columns").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `columns` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("columns").toString()));
                }

                // validate the optional field `columns` (array)
                for (int i = 0; i < jsonArraycolumns.size(); i++) {
                    Column.validateJsonElement(jsonArraycolumns.get(i));
                }
                ;
            }
        }
        if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull())
                && !jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
        if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
                && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("description").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("relationships") != null
                && !jsonObj.get("relationships").isJsonNull()
                && !jsonObj.get("relationships").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `relationships` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("relationships").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Table.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Table' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Table> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Table.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Table>() {
                        @Override
                        public void write(JsonWriter out, Table value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Table read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Table given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Table
     * @throws IOException if the JSON string is invalid with respect to Table
     */
    public static Table fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Table.class);
    }

    /**
     * Convert an instance of Table to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
