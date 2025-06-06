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

/** Database */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class Database implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    public static final String SERIALIZED_NAME_SCHEMAS = "schemas";

    @SerializedName(SERIALIZED_NAME_SCHEMAS)
    @javax.annotation.Nullable
    private List<SchemaObject> schemas;

    public static final String SERIALIZED_NAME_AUTO_CREATED = "auto_created";

    @SerializedName(SERIALIZED_NAME_AUTO_CREATED)
    @javax.annotation.Nullable
    private Boolean autoCreated;

    public Database() {}

    public Database name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the database.
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

    public Database schemas(@javax.annotation.Nullable List<SchemaObject> schemas) {
        this.schemas = schemas;
        return this;
    }

    public Database addSchemasItem(SchemaObject schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    /**
     * Schemas of the database.
     *
     * @return schemas
     */
    @javax.annotation.Nullable
    public List<SchemaObject> getSchemas() {
        return schemas;
    }

    public void setSchemas(@javax.annotation.Nullable List<SchemaObject> schemas) {
        this.schemas = schemas;
    }

    public Database autoCreated(@javax.annotation.Nullable Boolean autoCreated) {
        this.autoCreated = autoCreated;
        return this;
    }

    /**
     * Determines if the object is auto created.
     *
     * @return autoCreated
     */
    @javax.annotation.Nullable
    public Boolean getAutoCreated() {
        return autoCreated;
    }

    public void setAutoCreated(@javax.annotation.Nullable Boolean autoCreated) {
        this.autoCreated = autoCreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Database database = (Database) o;
        return Objects.equals(this.name, database.name)
                && Objects.equals(this.schemas, database.schemas)
                && Objects.equals(this.autoCreated, database.autoCreated);
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
        return Objects.hash(name, schemas, autoCreated);
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
        sb.append("class Database {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
        sb.append("    autoCreated: ").append(toIndentedString(autoCreated)).append("\n");
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
        openapiFields.add("schemas");
        openapiFields.add("auto_created");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("name");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Database
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!Database.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Database is not found in the empty"
                                        + " JSON string",
                                Database.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!Database.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `Database` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : Database.openapiRequiredFields) {
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
        if (jsonObj.get("schemas") != null && !jsonObj.get("schemas").isJsonNull()) {
            JsonArray jsonArrayschemas = jsonObj.getAsJsonArray("schemas");
            if (jsonArrayschemas != null) {
                // ensure the json data is an array
                if (!jsonObj.get("schemas").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `schemas` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("schemas").toString()));
                }

                // validate the optional field `schemas` (array)
                for (int i = 0; i < jsonArrayschemas.size(); i++) {
                    SchemaObject.validateJsonElement(jsonArrayschemas.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Database.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Database' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Database> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Database.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Database>() {
                        @Override
                        public void write(JsonWriter out, Database value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Database read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Database given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Database
     * @throws IOException if the JSON string is invalid with respect to Database
     */
    public static Database fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Database.class);
    }

    /**
     * Convert an instance of Database to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
