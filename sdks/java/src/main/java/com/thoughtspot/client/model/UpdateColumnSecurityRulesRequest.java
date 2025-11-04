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

/** UpdateColumnSecurityRulesRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UpdateColumnSecurityRulesRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER)
    @javax.annotation.Nullable
    private String identifier;

    public static final String SERIALIZED_NAME_OBJ_IDENTIFIER = "obj_identifier";

    @SerializedName(SERIALIZED_NAME_OBJ_IDENTIFIER)
    @javax.annotation.Nullable
    private String objIdentifier;

    public static final String SERIALIZED_NAME_CLEAR_CSR = "clear_csr";

    @SerializedName(SERIALIZED_NAME_CLEAR_CSR)
    @javax.annotation.Nullable
    private Boolean clearCsr;

    public static final String SERIALIZED_NAME_COLUMN_SECURITY_RULES = "column_security_rules";

    @SerializedName(SERIALIZED_NAME_COLUMN_SECURITY_RULES)
    @javax.annotation.Nonnull
    private List<ColumnSecurityRuleUpdate> columnSecurityRules;

    public UpdateColumnSecurityRulesRequest() {}

    public UpdateColumnSecurityRulesRequest identifier(
            @javax.annotation.Nullable String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * GUID or name of the table for which we want to create column security rules
     *
     * @return identifier
     */
    @javax.annotation.Nullable
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(@javax.annotation.Nullable String identifier) {
        this.identifier = identifier;
    }

    public UpdateColumnSecurityRulesRequest objIdentifier(
            @javax.annotation.Nullable String objIdentifier) {
        this.objIdentifier = objIdentifier;
        return this;
    }

    /**
     * The object ID of the table
     *
     * @return objIdentifier
     */
    @javax.annotation.Nullable
    public String getObjIdentifier() {
        return objIdentifier;
    }

    public void setObjIdentifier(@javax.annotation.Nullable String objIdentifier) {
        this.objIdentifier = objIdentifier;
    }

    public UpdateColumnSecurityRulesRequest clearCsr(@javax.annotation.Nullable Boolean clearCsr) {
        this.clearCsr = clearCsr;
        return this;
    }

    /**
     * If true, then all the secured columns will be marked as unprotected, and all the group
     * associations will be removed
     *
     * @return clearCsr
     */
    @javax.annotation.Nullable
    public Boolean getClearCsr() {
        return clearCsr;
    }

    public void setClearCsr(@javax.annotation.Nullable Boolean clearCsr) {
        this.clearCsr = clearCsr;
    }

    public UpdateColumnSecurityRulesRequest columnSecurityRules(
            @javax.annotation.Nonnull List<ColumnSecurityRuleUpdate> columnSecurityRules) {
        this.columnSecurityRules = columnSecurityRules;
        return this;
    }

    public UpdateColumnSecurityRulesRequest addColumnSecurityRulesItem(
            ColumnSecurityRuleUpdate columnSecurityRulesItem) {
        if (this.columnSecurityRules == null) {
            this.columnSecurityRules = new ArrayList<>();
        }
        this.columnSecurityRules.add(columnSecurityRulesItem);
        return this;
    }

    /**
     * Array where each object defines the security rule for a specific column
     *
     * @return columnSecurityRules
     */
    @javax.annotation.Nonnull
    public List<ColumnSecurityRuleUpdate> getColumnSecurityRules() {
        return columnSecurityRules;
    }

    public void setColumnSecurityRules(
            @javax.annotation.Nonnull List<ColumnSecurityRuleUpdate> columnSecurityRules) {
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
        UpdateColumnSecurityRulesRequest updateColumnSecurityRulesRequest =
                (UpdateColumnSecurityRulesRequest) o;
        return Objects.equals(this.identifier, updateColumnSecurityRulesRequest.identifier)
                && Objects.equals(
                        this.objIdentifier, updateColumnSecurityRulesRequest.objIdentifier)
                && Objects.equals(this.clearCsr, updateColumnSecurityRulesRequest.clearCsr)
                && Objects.equals(
                        this.columnSecurityRules,
                        updateColumnSecurityRulesRequest.columnSecurityRules);
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
        return Objects.hash(identifier, objIdentifier, clearCsr, columnSecurityRules);
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
        sb.append("class UpdateColumnSecurityRulesRequest {\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    objIdentifier: ").append(toIndentedString(objIdentifier)).append("\n");
        sb.append("    clearCsr: ").append(toIndentedString(clearCsr)).append("\n");
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
        openapiFields.add("identifier");
        openapiFields.add("obj_identifier");
        openapiFields.add("clear_csr");
        openapiFields.add("column_security_rules");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("column_security_rules");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     UpdateColumnSecurityRulesRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UpdateColumnSecurityRulesRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateColumnSecurityRulesRequest is"
                                        + " not found in the empty JSON string",
                                UpdateColumnSecurityRulesRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!UpdateColumnSecurityRulesRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `UpdateColumnSecurityRulesRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UpdateColumnSecurityRulesRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull())
                && !jsonObj.get("identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `identifier` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("identifier").toString()));
        }
        if ((jsonObj.get("obj_identifier") != null && !jsonObj.get("obj_identifier").isJsonNull())
                && !jsonObj.get("obj_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `obj_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("obj_identifier").toString()));
        }
        // ensure the json data is an array
        if (!jsonObj.get("column_security_rules").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `column_security_rules` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("column_security_rules").toString()));
        }

        JsonArray jsonArraycolumnSecurityRules = jsonObj.getAsJsonArray("column_security_rules");
        // validate the required field `column_security_rules` (array)
        for (int i = 0; i < jsonArraycolumnSecurityRules.size(); i++) {
            ColumnSecurityRuleUpdate.validateJsonElement(jsonArraycolumnSecurityRules.get(i));
        }
        ;
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateColumnSecurityRulesRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateColumnSecurityRulesRequest' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateColumnSecurityRulesRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(UpdateColumnSecurityRulesRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateColumnSecurityRulesRequest>() {
                        @Override
                        public void write(JsonWriter out, UpdateColumnSecurityRulesRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateColumnSecurityRulesRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateColumnSecurityRulesRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateColumnSecurityRulesRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     UpdateColumnSecurityRulesRequest
     */
    public static UpdateColumnSecurityRulesRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateColumnSecurityRulesRequest.class);
    }

    /**
     * Convert an instance of UpdateColumnSecurityRulesRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
