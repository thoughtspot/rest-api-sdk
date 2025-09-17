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

/** ColumnSecurityRule */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ColumnSecurityRule implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_COLUMN = "column";

    @SerializedName(SERIALIZED_NAME_COLUMN)
    @javax.annotation.Nonnull
    private ColumnSecurityRuleColumn column;

    public static final String SERIALIZED_NAME_GROUPS = "groups";

    @SerializedName(SERIALIZED_NAME_GROUPS)
    @javax.annotation.Nullable
    private List<ColumnSecurityRuleGroup> groups;

    public static final String SERIALIZED_NAME_SOURCE_TABLE_DETAILS = "sourceTableDetails";

    @SerializedName(SERIALIZED_NAME_SOURCE_TABLE_DETAILS)
    @javax.annotation.Nullable
    private ColumnSecurityRuleSourceTable sourceTableDetails;

    public ColumnSecurityRule() {}

    public ColumnSecurityRule column(@javax.annotation.Nonnull ColumnSecurityRuleColumn column) {
        this.column = column;
        return this;
    }

    /**
     * Get column
     *
     * @return column
     */
    @javax.annotation.Nonnull
    public ColumnSecurityRuleColumn getColumn() {
        return column;
    }

    public void setColumn(@javax.annotation.Nonnull ColumnSecurityRuleColumn column) {
        this.column = column;
    }

    public ColumnSecurityRule groups(
            @javax.annotation.Nullable List<ColumnSecurityRuleGroup> groups) {
        this.groups = groups;
        return this;
    }

    public ColumnSecurityRule addGroupsItem(ColumnSecurityRuleGroup groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    /**
     * Array of groups that have access to this column
     *
     * @return groups
     */
    @javax.annotation.Nullable
    public List<ColumnSecurityRuleGroup> getGroups() {
        return groups;
    }

    public void setGroups(@javax.annotation.Nullable List<ColumnSecurityRuleGroup> groups) {
        this.groups = groups;
    }

    public ColumnSecurityRule sourceTableDetails(
            @javax.annotation.Nullable ColumnSecurityRuleSourceTable sourceTableDetails) {
        this.sourceTableDetails = sourceTableDetails;
        return this;
    }

    /**
     * Get sourceTableDetails
     *
     * @return sourceTableDetails
     */
    @javax.annotation.Nullable
    public ColumnSecurityRuleSourceTable getSourceTableDetails() {
        return sourceTableDetails;
    }

    public void setSourceTableDetails(
            @javax.annotation.Nullable ColumnSecurityRuleSourceTable sourceTableDetails) {
        this.sourceTableDetails = sourceTableDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ColumnSecurityRule columnSecurityRule = (ColumnSecurityRule) o;
        return Objects.equals(this.column, columnSecurityRule.column)
                && Objects.equals(this.groups, columnSecurityRule.groups)
                && Objects.equals(this.sourceTableDetails, columnSecurityRule.sourceTableDetails);
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
        return Objects.hash(column, groups, sourceTableDetails);
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
        sb.append("class ColumnSecurityRule {\n");
        sb.append("    column: ").append(toIndentedString(column)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    sourceTableDetails: ")
                .append(toIndentedString(sourceTableDetails))
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
        openapiFields.add("column");
        openapiFields.add("groups");
        openapiFields.add("sourceTableDetails");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("column");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ColumnSecurityRule
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ColumnSecurityRule.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ColumnSecurityRule is not found in"
                                        + " the empty JSON string",
                                ColumnSecurityRule.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ColumnSecurityRule.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ColumnSecurityRule` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ColumnSecurityRule.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the required field `column`
        ColumnSecurityRuleColumn.validateJsonElement(jsonObj.get("column"));
        if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
            JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
            if (jsonArraygroups != null) {
                // ensure the json data is an array
                if (!jsonObj.get("groups").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `groups` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("groups").toString()));
                }

                // validate the optional field `groups` (array)
                for (int i = 0; i < jsonArraygroups.size(); i++) {
                    ColumnSecurityRuleGroup.validateJsonElement(jsonArraygroups.get(i));
                }
                ;
            }
        }
        // validate the optional field `sourceTableDetails`
        if (jsonObj.get("sourceTableDetails") != null
                && !jsonObj.get("sourceTableDetails").isJsonNull()) {
            ColumnSecurityRuleSourceTable.validateJsonElement(jsonObj.get("sourceTableDetails"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ColumnSecurityRule.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ColumnSecurityRule' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ColumnSecurityRule> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ColumnSecurityRule.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ColumnSecurityRule>() {
                        @Override
                        public void write(JsonWriter out, ColumnSecurityRule value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ColumnSecurityRule read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ColumnSecurityRule given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ColumnSecurityRule
     * @throws IOException if the JSON string is invalid with respect to ColumnSecurityRule
     */
    public static ColumnSecurityRule fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ColumnSecurityRule.class);
    }

    /**
     * Convert an instance of ColumnSecurityRule to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
