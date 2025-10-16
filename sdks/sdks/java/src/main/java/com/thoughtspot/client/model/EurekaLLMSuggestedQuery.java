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

/** EurekaLLMSuggestedQuery */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class EurekaLLMSuggestedQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_QUERY = "query";

    @SerializedName(SERIALIZED_NAME_QUERY)
    @javax.annotation.Nullable
    private String query;

    public static final String SERIALIZED_NAME_WORKSHEET_ID = "worksheetId";

    @SerializedName(SERIALIZED_NAME_WORKSHEET_ID)
    @javax.annotation.Nullable
    private String worksheetId;

    public static final String SERIALIZED_NAME_WORKSHEET_NAME = "worksheetName";

    @SerializedName(SERIALIZED_NAME_WORKSHEET_NAME)
    @javax.annotation.Nullable
    private String worksheetName;

    public EurekaLLMSuggestedQuery() {}

    public EurekaLLMSuggestedQuery query(@javax.annotation.Nullable String query) {
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

    public EurekaLLMSuggestedQuery worksheetId(@javax.annotation.Nullable String worksheetId) {
        this.worksheetId = worksheetId;
        return this;
    }

    /**
     * Unique identifier of the worksheet on which this query can be run on.
     *
     * @return worksheetId
     */
    @javax.annotation.Nullable
    public String getWorksheetId() {
        return worksheetId;
    }

    public void setWorksheetId(@javax.annotation.Nullable String worksheetId) {
        this.worksheetId = worksheetId;
    }

    public EurekaLLMSuggestedQuery worksheetName(@javax.annotation.Nullable String worksheetName) {
        this.worksheetName = worksheetName;
        return this;
    }

    /**
     * Display name of the worksheet on which this query can be run on.
     *
     * @return worksheetName
     */
    @javax.annotation.Nullable
    public String getWorksheetName() {
        return worksheetName;
    }

    public void setWorksheetName(@javax.annotation.Nullable String worksheetName) {
        this.worksheetName = worksheetName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EurekaLLMSuggestedQuery eurekaLLMSuggestedQuery = (EurekaLLMSuggestedQuery) o;
        return Objects.equals(this.query, eurekaLLMSuggestedQuery.query)
                && Objects.equals(this.worksheetId, eurekaLLMSuggestedQuery.worksheetId)
                && Objects.equals(this.worksheetName, eurekaLLMSuggestedQuery.worksheetName);
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
        return Objects.hash(query, worksheetId, worksheetName);
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
        sb.append("class EurekaLLMSuggestedQuery {\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    worksheetId: ").append(toIndentedString(worksheetId)).append("\n");
        sb.append("    worksheetName: ").append(toIndentedString(worksheetName)).append("\n");
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
        openapiFields.add("worksheetId");
        openapiFields.add("worksheetName");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to EurekaLLMSuggestedQuery
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!EurekaLLMSuggestedQuery.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in EurekaLLMSuggestedQuery is not found"
                                        + " in the empty JSON string",
                                EurekaLLMSuggestedQuery.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!EurekaLLMSuggestedQuery.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `EurekaLLMSuggestedQuery` properties. JSON: %s",
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
        if ((jsonObj.get("worksheetId") != null && !jsonObj.get("worksheetId").isJsonNull())
                && !jsonObj.get("worksheetId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `worksheetId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("worksheetId").toString()));
        }
        if ((jsonObj.get("worksheetName") != null && !jsonObj.get("worksheetName").isJsonNull())
                && !jsonObj.get("worksheetName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `worksheetName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("worksheetName").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EurekaLLMSuggestedQuery.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'EurekaLLMSuggestedQuery' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EurekaLLMSuggestedQuery> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(EurekaLLMSuggestedQuery.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<EurekaLLMSuggestedQuery>() {
                        @Override
                        public void write(JsonWriter out, EurekaLLMSuggestedQuery value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public EurekaLLMSuggestedQuery read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of EurekaLLMSuggestedQuery given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of EurekaLLMSuggestedQuery
     * @throws IOException if the JSON string is invalid with respect to EurekaLLMSuggestedQuery
     */
    public static EurekaLLMSuggestedQuery fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, EurekaLLMSuggestedQuery.class);
    }

    /**
     * Convert an instance of EurekaLLMSuggestedQuery to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
