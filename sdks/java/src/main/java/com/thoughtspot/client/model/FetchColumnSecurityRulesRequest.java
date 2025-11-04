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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** FetchColumnSecurityRulesRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class FetchColumnSecurityRulesRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TABLES = "tables";

    @SerializedName(SERIALIZED_NAME_TABLES)
    @javax.annotation.Nonnull
    private List<ColumnSecurityRuleTableInput> tables;

    public FetchColumnSecurityRulesRequest() {}

    public FetchColumnSecurityRulesRequest tables(
            @javax.annotation.Nonnull List<ColumnSecurityRuleTableInput> tables) {
        this.tables = tables;
        return this;
    }

    public FetchColumnSecurityRulesRequest addTablesItem(ColumnSecurityRuleTableInput tablesItem) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    /**
     * Array of table identifier objects for which to fetch column security rules
     *
     * @return tables
     */
    @javax.annotation.Nonnull
    public List<ColumnSecurityRuleTableInput> getTables() {
        return tables;
    }

    public void setTables(@javax.annotation.Nonnull List<ColumnSecurityRuleTableInput> tables) {
        this.tables = tables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FetchColumnSecurityRulesRequest fetchColumnSecurityRulesRequest =
                (FetchColumnSecurityRulesRequest) o;
        return Objects.equals(this.tables, fetchColumnSecurityRulesRequest.tables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FetchColumnSecurityRulesRequest {\n");
        sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("tables");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     FetchColumnSecurityRulesRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!FetchColumnSecurityRulesRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FetchColumnSecurityRulesRequest is"
                                        + " not found in the empty JSON string",
                                FetchColumnSecurityRulesRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!FetchColumnSecurityRulesRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FetchColumnSecurityRulesRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : FetchColumnSecurityRulesRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the json data is an array
        if (!jsonObj.get("tables").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `tables` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("tables").toString()));
        }

        JsonArray jsonArraytables = jsonObj.getAsJsonArray("tables");
        // validate the required field `tables` (array)
        for (int i = 0; i < jsonArraytables.size(); i++) {
            ColumnSecurityRuleTableInput.validateJsonElement(jsonArraytables.get(i));
        }
        ;
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FetchColumnSecurityRulesRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FetchColumnSecurityRulesRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FetchColumnSecurityRulesRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(FetchColumnSecurityRulesRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FetchColumnSecurityRulesRequest>() {
                        @Override
                        public void write(JsonWriter out, FetchColumnSecurityRulesRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FetchColumnSecurityRulesRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FetchColumnSecurityRulesRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FetchColumnSecurityRulesRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     FetchColumnSecurityRulesRequest
     */
    public static FetchColumnSecurityRulesRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FetchColumnSecurityRulesRequest.class);
    }

    /**
     * Convert an instance of FetchColumnSecurityRulesRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
