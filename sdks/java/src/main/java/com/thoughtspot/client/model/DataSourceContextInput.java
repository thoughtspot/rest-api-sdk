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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** DataSourceContextInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DataSourceContextInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DATA_SOURCE_IDENTIFIER = "data_source_identifier";

    @SerializedName(SERIALIZED_NAME_DATA_SOURCE_IDENTIFIER)
    @javax.annotation.Nullable
    private String dataSourceIdentifier;

    public static final String SERIALIZED_NAME_DATA_SOURCE_IDENTIFIERS = "data_source_identifiers";

    @SerializedName(SERIALIZED_NAME_DATA_SOURCE_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> dataSourceIdentifiers;

    public static final String SERIALIZED_NAME_GUID = "guid";

    @SerializedName(SERIALIZED_NAME_GUID)
    @javax.annotation.Nullable
    private String guid;

    public DataSourceContextInput() {}

    public DataSourceContextInput dataSourceIdentifier(
            @javax.annotation.Nullable String dataSourceIdentifier) {
        this.dataSourceIdentifier = dataSourceIdentifier;
        return this;
    }

    /**
     * Unique identifier of the data source. Required when context type is DATA_SOURCE and
     * &#x60;data_source_identifiers&#x60; is not provided. At least one of
     * &#x60;data_source_identifier&#x60; or &#x60;data_source_identifiers&#x60; must be supplied
     * for DATA_SOURCE context; omit only when context type is AUTO_MODE. Version: 26.5.0.cl or
     * later
     *
     * @return dataSourceIdentifier
     */
    @javax.annotation.Nullable
    public String getDataSourceIdentifier() {
        return dataSourceIdentifier;
    }

    public void setDataSourceIdentifier(@javax.annotation.Nullable String dataSourceIdentifier) {
        this.dataSourceIdentifier = dataSourceIdentifier;
    }

    public DataSourceContextInput dataSourceIdentifiers(
            @javax.annotation.Nullable List<String> dataSourceIdentifiers) {
        this.dataSourceIdentifiers = dataSourceIdentifiers;
        return this;
    }

    public DataSourceContextInput addDataSourceIdentifiersItem(String dataSourceIdentifiersItem) {
        if (this.dataSourceIdentifiers == null) {
            this.dataSourceIdentifiers = new ArrayList<>();
        }
        this.dataSourceIdentifiers.add(dataSourceIdentifiersItem);
        return this;
    }

    /**
     * Unique identifiers of data sources for multi-data-source context. Required when context type
     * is DATA_SOURCE and &#x60;data_source_identifier&#x60; is not provided. Version: 26.5.0.cl or
     * later
     *
     * @return dataSourceIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getDataSourceIdentifiers() {
        return dataSourceIdentifiers;
    }

    public void setDataSourceIdentifiers(
            @javax.annotation.Nullable List<String> dataSourceIdentifiers) {
        this.dataSourceIdentifiers = dataSourceIdentifiers;
    }

    public DataSourceContextInput guid(@javax.annotation.Nullable String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * Deprecated. Use &#x60;data_source_identifier&#x60; instead. Previously required when neither
     * &#x60;data_source_identifier&#x60; nor &#x60;data_source_identifiers&#x60; was provided for
     * DATA_SOURCE context. Version: 26.2.0.cl or later
     *
     * @return guid
     */
    @javax.annotation.Nullable
    public String getGuid() {
        return guid;
    }

    public void setGuid(@javax.annotation.Nullable String guid) {
        this.guid = guid;
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
     * @return the DataSourceContextInput instance itself
     */
    public DataSourceContextInput putAdditionalProperty(String key, Object value) {
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
        DataSourceContextInput dataSourceContextInput = (DataSourceContextInput) o;
        return Objects.equals(
                        this.dataSourceIdentifier, dataSourceContextInput.dataSourceIdentifier)
                && Objects.equals(
                        this.dataSourceIdentifiers, dataSourceContextInput.dataSourceIdentifiers)
                && Objects.equals(this.guid, dataSourceContextInput.guid)
                && Objects.equals(
                        this.additionalProperties, dataSourceContextInput.additionalProperties);
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
                dataSourceIdentifier, dataSourceIdentifiers, guid, additionalProperties);
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
        sb.append("class DataSourceContextInput {\n");
        sb.append("    dataSourceIdentifier: ")
                .append(toIndentedString(dataSourceIdentifier))
                .append("\n");
        sb.append("    dataSourceIdentifiers: ")
                .append(toIndentedString(dataSourceIdentifiers))
                .append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
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
        openapiFields.add("data_source_identifier");
        openapiFields.add("data_source_identifiers");
        openapiFields.add("guid");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to DataSourceContextInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DataSourceContextInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DataSourceContextInput is not found"
                                        + " in the empty JSON string",
                                DataSourceContextInput.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("data_source_identifier") != null
                        && !jsonObj.get("data_source_identifier").isJsonNull())
                && !jsonObj.get("data_source_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `data_source_identifier` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("data_source_identifier").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("data_source_identifiers") != null
                && !jsonObj.get("data_source_identifiers").isJsonNull()
                && !jsonObj.get("data_source_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `data_source_identifiers` to be an array in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("data_source_identifiers").toString()));
        }
        if ((jsonObj.get("guid") != null && !jsonObj.get("guid").isJsonNull())
                && !jsonObj.get("guid").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `guid` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("guid").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DataSourceContextInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DataSourceContextInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DataSourceContextInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(DataSourceContextInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DataSourceContextInput>() {
                        @Override
                        public void write(JsonWriter out, DataSourceContextInput value)
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
                        public DataSourceContextInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            DataSourceContextInput instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of DataSourceContextInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DataSourceContextInput
     * @throws IOException if the JSON string is invalid with respect to DataSourceContextInput
     */
    public static DataSourceContextInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DataSourceContextInput.class);
    }

    /**
     * Convert an instance of DataSourceContextInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
