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
                && Objects.equals(this.dataSourceName, eurekaRelevantQuestion.dataSourceName);
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
        return Objects.hash(query, dataSourceIdentifier, dataSourceName);
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

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!EurekaRelevantQuestion.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `EurekaRelevantQuestion` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
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
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public EurekaRelevantQuestion read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
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
