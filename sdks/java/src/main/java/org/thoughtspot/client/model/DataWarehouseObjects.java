/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package org.thoughtspot.client.model;


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
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.thoughtspot.client.JSON;

/** DataWarehouseObjects */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DataWarehouseObjects implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DATABASES = "databases";

    @SerializedName(SERIALIZED_NAME_DATABASES)
    @javax.annotation.Nonnull
    private List<Database> databases;

    public DataWarehouseObjects() {}

    public DataWarehouseObjects databases(@javax.annotation.Nonnull List<Database> databases) {
        this.databases = databases;
        return this;
    }

    public DataWarehouseObjects addDatabasesItem(Database databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    /**
     * Databases of the connection.
     *
     * @return databases
     */
    @javax.annotation.Nonnull
    public List<Database> getDatabases() {
        return databases;
    }

    public void setDatabases(@javax.annotation.Nonnull List<Database> databases) {
        this.databases = databases;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataWarehouseObjects dataWarehouseObjects = (DataWarehouseObjects) o;
        return Objects.equals(this.databases, dataWarehouseObjects.databases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataWarehouseObjects {\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
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
        openapiFields.add("databases");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("databases");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to DataWarehouseObjects
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DataWarehouseObjects.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DataWarehouseObjects is not found in"
                                        + " the empty JSON string",
                                DataWarehouseObjects.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!DataWarehouseObjects.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `DataWarehouseObjects` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : DataWarehouseObjects.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the json data is an array
        if (!jsonObj.get("databases").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `databases` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("databases").toString()));
        }

        JsonArray jsonArraydatabases = jsonObj.getAsJsonArray("databases");
        // validate the required field `databases` (array)
        for (int i = 0; i < jsonArraydatabases.size(); i++) {
            Database.validateJsonElement(jsonArraydatabases.get(i));
        }
        ;
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DataWarehouseObjects.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DataWarehouseObjects' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DataWarehouseObjects> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(DataWarehouseObjects.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DataWarehouseObjects>() {
                        @Override
                        public void write(JsonWriter out, DataWarehouseObjects value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DataWarehouseObjects read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DataWarehouseObjects given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DataWarehouseObjects
     * @throws IOException if the JSON string is invalid with respect to DataWarehouseObjects
     */
    public static DataWarehouseObjects fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DataWarehouseObjects.class);
    }

    /**
     * Convert an instance of DataWarehouseObjects to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
