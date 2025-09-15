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

/** ColumnSecurityRuleTableInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ColumnSecurityRuleTableInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER)
    @javax.annotation.Nullable
    private String identifier;

    public static final String SERIALIZED_NAME_OBJ_IDENTIFIER = "obj_identifier";

    @SerializedName(SERIALIZED_NAME_OBJ_IDENTIFIER)
    @javax.annotation.Nullable
    private String objIdentifier;

    public ColumnSecurityRuleTableInput() {}

    public ColumnSecurityRuleTableInput identifier(@javax.annotation.Nullable String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Name or GUID of the table
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

    public ColumnSecurityRuleTableInput objIdentifier(
            @javax.annotation.Nullable String objIdentifier) {
        this.objIdentifier = objIdentifier;
        return this;
    }

    /**
     * Object ID of the table
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ColumnSecurityRuleTableInput columnSecurityRuleTableInput =
                (ColumnSecurityRuleTableInput) o;
        return Objects.equals(this.identifier, columnSecurityRuleTableInput.identifier)
                && Objects.equals(this.objIdentifier, columnSecurityRuleTableInput.objIdentifier);
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
        return Objects.hash(identifier, objIdentifier);
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
        sb.append("class ColumnSecurityRuleTableInput {\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    objIdentifier: ").append(toIndentedString(objIdentifier)).append("\n");
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

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ColumnSecurityRuleTableInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ColumnSecurityRuleTableInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ColumnSecurityRuleTableInput is not"
                                        + " found in the empty JSON string",
                                ColumnSecurityRuleTableInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ColumnSecurityRuleTableInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ColumnSecurityRuleTableInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
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
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ColumnSecurityRuleTableInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ColumnSecurityRuleTableInput' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ColumnSecurityRuleTableInput> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ColumnSecurityRuleTableInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ColumnSecurityRuleTableInput>() {
                        @Override
                        public void write(JsonWriter out, ColumnSecurityRuleTableInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ColumnSecurityRuleTableInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ColumnSecurityRuleTableInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ColumnSecurityRuleTableInput
     * @throws IOException if the JSON string is invalid with respect to
     *     ColumnSecurityRuleTableInput
     */
    public static ColumnSecurityRuleTableInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ColumnSecurityRuleTableInput.class);
    }

    /**
     * Convert an instance of ColumnSecurityRuleTableInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
