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

/** ColumnSecurityRuleResponse */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ColumnSecurityRuleResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TABLE_GUID = "table_guid";

    @SerializedName(SERIALIZED_NAME_TABLE_GUID)
    @javax.annotation.Nullable
    private String tableGuid;

    public static final String SERIALIZED_NAME_OBJ_ID = "obj_id";

    @SerializedName(SERIALIZED_NAME_OBJ_ID)
    @javax.annotation.Nullable
    private String objId;

    public static final String SERIALIZED_NAME_COLUMN_SECURITY_RULES = "column_security_rules";

    @SerializedName(SERIALIZED_NAME_COLUMN_SECURITY_RULES)
    @javax.annotation.Nullable
    private List<ColumnSecurityRule> columnSecurityRules;

    public ColumnSecurityRuleResponse() {}

    public ColumnSecurityRuleResponse tableGuid(@javax.annotation.Nullable String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }

    /**
     * GUID of the table for which the column security rules are fetched
     *
     * @return tableGuid
     */
    @javax.annotation.Nullable
    public String getTableGuid() {
        return tableGuid;
    }

    public void setTableGuid(@javax.annotation.Nullable String tableGuid) {
        this.tableGuid = tableGuid;
    }

    public ColumnSecurityRuleResponse objId(@javax.annotation.Nullable String objId) {
        this.objId = objId;
        return this;
    }

    /**
     * Object ID of the table for which the column security rules are fetched
     *
     * @return objId
     */
    @javax.annotation.Nullable
    public String getObjId() {
        return objId;
    }

    public void setObjId(@javax.annotation.Nullable String objId) {
        this.objId = objId;
    }

    public ColumnSecurityRuleResponse columnSecurityRules(
            @javax.annotation.Nullable List<ColumnSecurityRule> columnSecurityRules) {
        this.columnSecurityRules = columnSecurityRules;
        return this;
    }

    public ColumnSecurityRuleResponse addColumnSecurityRulesItem(
            ColumnSecurityRule columnSecurityRulesItem) {
        if (this.columnSecurityRules == null) {
            this.columnSecurityRules = new ArrayList<>();
        }
        this.columnSecurityRules.add(columnSecurityRulesItem);
        return this;
    }

    /**
     * Array containing column security rule objects
     *
     * @return columnSecurityRules
     */
    @javax.annotation.Nullable
    public List<ColumnSecurityRule> getColumnSecurityRules() {
        return columnSecurityRules;
    }

    public void setColumnSecurityRules(
            @javax.annotation.Nullable List<ColumnSecurityRule> columnSecurityRules) {
        this.columnSecurityRules = columnSecurityRules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ColumnSecurityRuleResponse columnSecurityRuleResponse = (ColumnSecurityRuleResponse) o;
        return Objects.equals(this.tableGuid, columnSecurityRuleResponse.tableGuid)
                && Objects.equals(this.objId, columnSecurityRuleResponse.objId)
                && Objects.equals(
                        this.columnSecurityRules, columnSecurityRuleResponse.columnSecurityRules);
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
        return Objects.hash(tableGuid, objId, columnSecurityRules);
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
        sb.append("class ColumnSecurityRuleResponse {\n");
        sb.append("    tableGuid: ").append(toIndentedString(tableGuid)).append("\n");
        sb.append("    objId: ").append(toIndentedString(objId)).append("\n");
        sb.append("    columnSecurityRules: ")
                .append(toIndentedString(columnSecurityRules))
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
        openapiFields.add("table_guid");
        openapiFields.add("obj_id");
        openapiFields.add("column_security_rules");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ColumnSecurityRuleResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ColumnSecurityRuleResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ColumnSecurityRuleResponse is not"
                                        + " found in the empty JSON string",
                                ColumnSecurityRuleResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ColumnSecurityRuleResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ColumnSecurityRuleResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("table_guid") != null && !jsonObj.get("table_guid").isJsonNull())
                && !jsonObj.get("table_guid").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `table_guid` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("table_guid").toString()));
        }
        if ((jsonObj.get("obj_id") != null && !jsonObj.get("obj_id").isJsonNull())
                && !jsonObj.get("obj_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `obj_id` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("obj_id").toString()));
        }
        if (jsonObj.get("column_security_rules") != null
                && !jsonObj.get("column_security_rules").isJsonNull()) {
            JsonArray jsonArraycolumnSecurityRules =
                    jsonObj.getAsJsonArray("column_security_rules");
            if (jsonArraycolumnSecurityRules != null) {
                // ensure the json data is an array
                if (!jsonObj.get("column_security_rules").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `column_security_rules` to be an array in"
                                            + " the JSON string but got `%s`",
                                    jsonObj.get("column_security_rules").toString()));
                }

                // validate the optional field `column_security_rules` (array)
                for (int i = 0; i < jsonArraycolumnSecurityRules.size(); i++) {
                    ColumnSecurityRule.validateJsonElement(jsonArraycolumnSecurityRules.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ColumnSecurityRuleResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ColumnSecurityRuleResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ColumnSecurityRuleResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ColumnSecurityRuleResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ColumnSecurityRuleResponse>() {
                        @Override
                        public void write(JsonWriter out, ColumnSecurityRuleResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ColumnSecurityRuleResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ColumnSecurityRuleResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ColumnSecurityRuleResponse
     * @throws IOException if the JSON string is invalid with respect to ColumnSecurityRuleResponse
     */
    public static ColumnSecurityRuleResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ColumnSecurityRuleResponse.class);
    }

    /**
     * Convert an instance of ColumnSecurityRuleResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
