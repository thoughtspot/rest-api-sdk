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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
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

    public static final String SERIALIZED_NAME_SOURCE_TABLE_DETAILS = "source_table_details";

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
     * @return the ColumnSecurityRule instance itself
     */
    public ColumnSecurityRule putAdditionalProperty(String key, Object value) {
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
        ColumnSecurityRule columnSecurityRule = (ColumnSecurityRule) o;
        return Objects.equals(this.column, columnSecurityRule.column)
                && Objects.equals(this.groups, columnSecurityRule.groups)
                && Objects.equals(this.sourceTableDetails, columnSecurityRule.sourceTableDetails)
                && Objects.equals(
                        this.additionalProperties, columnSecurityRule.additionalProperties);
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
        return Objects.hash(column, groups, sourceTableDetails, additionalProperties);
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
        openapiFields.add("column");
        openapiFields.add("groups");
        openapiFields.add("source_table_details");

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
        // validate the optional field `source_table_details`
        if (jsonObj.get("source_table_details") != null
                && !jsonObj.get("source_table_details").isJsonNull()) {
            ColumnSecurityRuleSourceTable.validateJsonElement(jsonObj.get("source_table_details"));
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
                        public ColumnSecurityRule read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            ColumnSecurityRule instance = thisAdapter.fromJsonTree(jsonObj);
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
