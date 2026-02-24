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

/** EurekaRelevantQuestion */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class EurekaRelevantQuestion implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_QUERY = "query";

    @SerializedName(SERIALIZED_NAME_QUERY)
    @javax.annotation.Nullable
    private String query;

    public static final String SERIALIZED_NAME_DATA_SOURCE_IDENTIFIER = "data_source_identifier";

    @SerializedName(SERIALIZED_NAME_DATA_SOURCE_IDENTIFIER)
    @javax.annotation.Nullable
    private String dataSourceIdentifier;

    public static final String SERIALIZED_NAME_DATA_SOURCE_NAME = "data_source_name";

    @SerializedName(SERIALIZED_NAME_DATA_SOURCE_NAME)
    @javax.annotation.Nullable
    private String dataSourceName;

    public EurekaRelevantQuestion() {}

    public EurekaRelevantQuestion query(@javax.annotation.Nullable String query) {
        this.query = query;
        return this;
    }

    /**
     * NL query that can be run using spotter aka natural language search to get an AI generated
     * answer.
     *
     * @return query
     */
    @javax.annotation.Nullable
    public String getQuery() {
        return query;
    }

    public void setQuery(@javax.annotation.Nullable String query) {
        this.query = query;
    }

    public EurekaRelevantQuestion dataSourceIdentifier(
            @javax.annotation.Nullable String dataSourceIdentifier) {
        this.dataSourceIdentifier = dataSourceIdentifier;
        return this;
    }

    /**
     * Unique identifier of the data source on which this query can be run on.
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

    public EurekaRelevantQuestion dataSourceName(@javax.annotation.Nullable String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }

    /**
     * Display name of the data source on which this query can be run on.
     *
     * @return dataSourceName
     */
    @javax.annotation.Nullable
    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(@javax.annotation.Nullable String dataSourceName) {
        this.dataSourceName = dataSourceName;
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
     * @return the EurekaRelevantQuestion instance itself
     */
    public EurekaRelevantQuestion putAdditionalProperty(String key, Object value) {
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
        EurekaRelevantQuestion eurekaRelevantQuestion = (EurekaRelevantQuestion) o;
        return Objects.equals(this.query, eurekaRelevantQuestion.query)
                && Objects.equals(
                        this.dataSourceIdentifier, eurekaRelevantQuestion.dataSourceIdentifier)
                && Objects.equals(this.dataSourceName, eurekaRelevantQuestion.dataSourceName)
                && Objects.equals(
                        this.additionalProperties, eurekaRelevantQuestion.additionalProperties);
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
        return Objects.hash(query, dataSourceIdentifier, dataSourceName, additionalProperties);
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
        sb.append("class EurekaRelevantQuestion {\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    dataSourceIdentifier: ")
                .append(toIndentedString(dataSourceIdentifier))
                .append("\n");
        sb.append("    dataSourceName: ").append(toIndentedString(dataSourceName)).append("\n");
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
        openapiFields.add("query");
        openapiFields.add("data_source_identifier");
        openapiFields.add("data_source_name");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to EurekaRelevantQuestion
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!EurekaRelevantQuestion.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in EurekaRelevantQuestion is not found"
                                        + " in the empty JSON string",
                                EurekaRelevantQuestion.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull())
                && !jsonObj.get("query").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `query` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("query").toString()));
        }
        if ((jsonObj.get("data_source_identifier") != null
                        && !jsonObj.get("data_source_identifier").isJsonNull())
                && !jsonObj.get("data_source_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `data_source_identifier` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("data_source_identifier").toString()));
        }
        if ((jsonObj.get("data_source_name") != null
                        && !jsonObj.get("data_source_name").isJsonNull())
                && !jsonObj.get("data_source_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `data_source_name` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("data_source_name").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EurekaRelevantQuestion.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'EurekaRelevantQuestion' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EurekaRelevantQuestion> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(EurekaRelevantQuestion.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<EurekaRelevantQuestion>() {
                        @Override
                        public void write(JsonWriter out, EurekaRelevantQuestion value)
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
                        public EurekaRelevantQuestion read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            EurekaRelevantQuestion instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of EurekaRelevantQuestion given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of EurekaRelevantQuestion
     * @throws IOException if the JSON string is invalid with respect to EurekaRelevantQuestion
     */
    public static EurekaRelevantQuestion fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, EurekaRelevantQuestion.class);
    }

    /**
     * Convert an instance of EurekaRelevantQuestion to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
