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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** SyncMetadataRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SyncMetadataRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TABLES = "tables";

    @SerializedName(SERIALIZED_NAME_TABLES)
    @javax.annotation.Nullable
    private Object tables;

    /** Gets or Sets syncAttributes */
    @JsonAdapter(SyncAttributesEnum.Adapter.class)
    public enum SyncAttributesEnum {
        DESCRIPTION("DESCRIPTION");

        private String value;

        SyncAttributesEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SyncAttributesEnum fromValue(String value) {
            for (SyncAttributesEnum b : SyncAttributesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<SyncAttributesEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final SyncAttributesEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SyncAttributesEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return SyncAttributesEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            SyncAttributesEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_SYNC_ATTRIBUTES = "sync_attributes";

    @SerializedName(SERIALIZED_NAME_SYNC_ATTRIBUTES)
    @javax.annotation.Nullable
    private List<SyncAttributesEnum> syncAttributes =
            new ArrayList<>(Arrays.asList(SyncAttributesEnum.DESCRIPTION));

    public SyncMetadataRequest() {}

    public SyncMetadataRequest tables(@javax.annotation.Nullable Object tables) {
        this.tables = tables;
        return this;
    }

    /**
     * Array of tables to sync. Each element can be: - String: Table identifier (GUID or name) to
     * sync all columns for that table. - Object: {tableId: [columnIds]} to sync specific columns.
     * If not provided, syncs all tables in the connection.
     *
     * @return tables
     */
    @javax.annotation.Nullable
    public Object getTables() {
        return tables;
    }

    public void setTables(@javax.annotation.Nullable Object tables) {
        this.tables = tables;
    }

    public SyncMetadataRequest syncAttributes(
            @javax.annotation.Nullable List<SyncAttributesEnum> syncAttributes) {
        this.syncAttributes = syncAttributes;
        return this;
    }

    public SyncMetadataRequest addSyncAttributesItem(SyncAttributesEnum syncAttributesItem) {
        if (this.syncAttributes == null) {
            this.syncAttributes = new ArrayList<>(Arrays.asList(SyncAttributesEnum.DESCRIPTION));
        }
        this.syncAttributes.add(syncAttributesItem);
        return this;
    }

    /**
     * List of sync_attributes to sync from CDW. The default value is DESCRIPTION.
     *
     * @return syncAttributes
     */
    @javax.annotation.Nullable
    public List<SyncAttributesEnum> getSyncAttributes() {
        return syncAttributes;
    }

    public void setSyncAttributes(
            @javax.annotation.Nullable List<SyncAttributesEnum> syncAttributes) {
        this.syncAttributes = syncAttributes;
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
     * @return the SyncMetadataRequest instance itself
     */
    public SyncMetadataRequest putAdditionalProperty(String key, Object value) {
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
        SyncMetadataRequest syncMetadataRequest = (SyncMetadataRequest) o;
        return Objects.equals(this.tables, syncMetadataRequest.tables)
                && Objects.equals(this.syncAttributes, syncMetadataRequest.syncAttributes)
                && Objects.equals(
                        this.additionalProperties, syncMetadataRequest.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tables, syncAttributes, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncMetadataRequest {\n");
        sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
        sb.append("    syncAttributes: ").append(toIndentedString(syncAttributes)).append("\n");
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
        openapiFields.add("tables");
        openapiFields.add("sync_attributes");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SyncMetadataRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SyncMetadataRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SyncMetadataRequest is not found in"
                                        + " the empty JSON string",
                                SyncMetadataRequest.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("sync_attributes") != null
                && !jsonObj.get("sync_attributes").isJsonNull()
                && !jsonObj.get("sync_attributes").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `sync_attributes` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("sync_attributes").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SyncMetadataRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SyncMetadataRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SyncMetadataRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SyncMetadataRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SyncMetadataRequest>() {
                        @Override
                        public void write(JsonWriter out, SyncMetadataRequest value)
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
                        public SyncMetadataRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            SyncMetadataRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of SyncMetadataRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SyncMetadataRequest
     * @throws IOException if the JSON string is invalid with respect to SyncMetadataRequest
     */
    public static SyncMetadataRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SyncMetadataRequest.class);
    }

    /**
     * Convert an instance of SyncMetadataRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
