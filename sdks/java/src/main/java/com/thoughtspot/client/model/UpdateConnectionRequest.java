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

/** UpdateConnectionRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UpdateConnectionRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONNECTION_IDENTIFIER = "connection_identifier";

    @SerializedName(SERIALIZED_NAME_CONNECTION_IDENTIFIER)
    @javax.annotation.Nonnull
    private String connectionIdentifier;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nullable
    private String name;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nullable
    private String description;

    public static final String SERIALIZED_NAME_DATA_WAREHOUSE_CONFIG = "data_warehouse_config";

    @SerializedName(SERIALIZED_NAME_DATA_WAREHOUSE_CONFIG)
    @javax.annotation.Nullable
    private Object dataWarehouseConfig;

    public static final String SERIALIZED_NAME_VALIDATE = "validate";

    @SerializedName(SERIALIZED_NAME_VALIDATE)
    @javax.annotation.Nullable
    private Boolean validate = true;

    public UpdateConnectionRequest() {}

    public UpdateConnectionRequest connectionIdentifier(
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

    public UpdateConnectionRequest name(@javax.annotation.Nullable String name) {
        this.name = name;
        return this;
    }

    /**
     * Updated name of the connection.
     *
     * @return name
     */
    @javax.annotation.Nullable
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nullable String name) {
        this.name = name;
    }

    public UpdateConnectionRequest description(@javax.annotation.Nullable String description) {
        this.description = description;
        return this;
    }

    /**
     * Updated description of the connection.
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

    public UpdateConnectionRequest dataWarehouseConfig(
            @javax.annotation.Nullable Object dataWarehouseConfig) {
        this.dataWarehouseConfig = dataWarehouseConfig;
        return this;
    }

    /**
     * Configuration of the data warehouse in JSON.
     *
     * @return dataWarehouseConfig
     */
    @javax.annotation.Nullable
    public Object getDataWarehouseConfig() {
        return dataWarehouseConfig;
    }

    public void setDataWarehouseConfig(@javax.annotation.Nullable Object dataWarehouseConfig) {
        this.dataWarehouseConfig = dataWarehouseConfig;
    }

    public UpdateConnectionRequest validate(@javax.annotation.Nullable Boolean validate) {
        this.validate = validate;
        return this;
    }

    /**
     * Indicates whether to validate the connection details.
     *
     * @return validate
     */
    @javax.annotation.Nullable
    public Boolean getValidate() {
        return validate;
    }

    public void setValidate(@javax.annotation.Nullable Boolean validate) {
        this.validate = validate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateConnectionRequest updateConnectionRequest = (UpdateConnectionRequest) o;
        return Objects.equals(
                        this.connectionIdentifier, updateConnectionRequest.connectionIdentifier)
                && Objects.equals(this.name, updateConnectionRequest.name)
                && Objects.equals(this.description, updateConnectionRequest.description)
                && Objects.equals(
                        this.dataWarehouseConfig, updateConnectionRequest.dataWarehouseConfig)
                && Objects.equals(this.validate, updateConnectionRequest.validate);
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
        return Objects.hash(connectionIdentifier, name, description, dataWarehouseConfig, validate);
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
        sb.append("class UpdateConnectionRequest {\n");
        sb.append("    connectionIdentifier: ")
                .append(toIndentedString(connectionIdentifier))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dataWarehouseConfig: ")
                .append(toIndentedString(dataWarehouseConfig))
                .append("\n");
        sb.append("    validate: ").append(toIndentedString(validate)).append("\n");
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
        openapiFields.add("description");
        openapiFields.add("data_warehouse_config");
        openapiFields.add("validate");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("connection_identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpdateConnectionRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UpdateConnectionRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateConnectionRequest is not found"
                                        + " in the empty JSON string",
                                UpdateConnectionRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!UpdateConnectionRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UpdateConnectionRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UpdateConnectionRequest.openapiRequiredFields) {
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
        if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
                && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
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
            if (!UpdateConnectionRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateConnectionRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateConnectionRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UpdateConnectionRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateConnectionRequest>() {
                        @Override
                        public void write(JsonWriter out, UpdateConnectionRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateConnectionRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateConnectionRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateConnectionRequest
     * @throws IOException if the JSON string is invalid with respect to UpdateConnectionRequest
     */
    public static UpdateConnectionRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateConnectionRequest.class);
    }

    /**
     * Convert an instance of UpdateConnectionRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
