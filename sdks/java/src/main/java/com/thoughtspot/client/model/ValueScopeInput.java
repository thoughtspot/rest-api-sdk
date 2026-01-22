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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** Input for filtering variable values by scope in search operations */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ValueScopeInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ORG_IDENTIFIER = "org_identifier";

    @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIER)
    @javax.annotation.Nullable
    private String orgIdentifier;

    /**
     * Type of principal to filter by. Use USER to filter values assigned to specific users, or
     * USER_GROUP to filter values assigned to groups.
     */
    @JsonAdapter(PrincipalTypeEnum.Adapter.class)
    public enum PrincipalTypeEnum {
        USER("USER"),

        USER_GROUP("USER_GROUP");

        private String value;

        PrincipalTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PrincipalTypeEnum fromValue(String value) {
            for (PrincipalTypeEnum b : PrincipalTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<PrincipalTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PrincipalTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PrincipalTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PrincipalTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            PrincipalTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_PRINCIPAL_TYPE = "principal_type";

    @SerializedName(SERIALIZED_NAME_PRINCIPAL_TYPE)
    @javax.annotation.Nullable
    private PrincipalTypeEnum principalType;

    public static final String SERIALIZED_NAME_PRINCIPAL_IDENTIFIER = "principal_identifier";

    @SerializedName(SERIALIZED_NAME_PRINCIPAL_IDENTIFIER)
    @javax.annotation.Nullable
    private String principalIdentifier;

    public static final String SERIALIZED_NAME_MODEL_IDENTIFIER = "model_identifier";

    @SerializedName(SERIALIZED_NAME_MODEL_IDENTIFIER)
    @javax.annotation.Nullable
    private String modelIdentifier;

    public ValueScopeInput() {}

    public ValueScopeInput orgIdentifier(@javax.annotation.Nullable String orgIdentifier) {
        this.orgIdentifier = orgIdentifier;
        return this;
    }

    /**
     * The unique name of the org
     *
     * @return orgIdentifier
     */
    @javax.annotation.Nullable
    public String getOrgIdentifier() {
        return orgIdentifier;
    }

    public void setOrgIdentifier(@javax.annotation.Nullable String orgIdentifier) {
        this.orgIdentifier = orgIdentifier;
    }

    public ValueScopeInput principalType(
            @javax.annotation.Nullable PrincipalTypeEnum principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * Type of principal to filter by. Use USER to filter values assigned to specific users, or
     * USER_GROUP to filter values assigned to groups.
     *
     * @return principalType
     */
    @javax.annotation.Nullable
    public PrincipalTypeEnum getPrincipalType() {
        return principalType;
    }

    public void setPrincipalType(@javax.annotation.Nullable PrincipalTypeEnum principalType) {
        this.principalType = principalType;
    }

    public ValueScopeInput principalIdentifier(
            @javax.annotation.Nullable String principalIdentifier) {
        this.principalIdentifier = principalIdentifier;
        return this;
    }

    /**
     * Unique ID or name of the principal
     *
     * @return principalIdentifier
     */
    @javax.annotation.Nullable
    public String getPrincipalIdentifier() {
        return principalIdentifier;
    }

    public void setPrincipalIdentifier(@javax.annotation.Nullable String principalIdentifier) {
        this.principalIdentifier = principalIdentifier;
    }

    public ValueScopeInput modelIdentifier(@javax.annotation.Nullable String modelIdentifier) {
        this.modelIdentifier = modelIdentifier;
        return this;
    }

    /**
     * Unique ID or name of the model to filter by. Applicable only for FORMULA_VARIABLE type.
     *
     * @return modelIdentifier
     */
    @javax.annotation.Nullable
    public String getModelIdentifier() {
        return modelIdentifier;
    }

    public void setModelIdentifier(@javax.annotation.Nullable String modelIdentifier) {
        this.modelIdentifier = modelIdentifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValueScopeInput valueScopeInput = (ValueScopeInput) o;
        return Objects.equals(this.orgIdentifier, valueScopeInput.orgIdentifier)
                && Objects.equals(this.principalType, valueScopeInput.principalType)
                && Objects.equals(this.principalIdentifier, valueScopeInput.principalIdentifier)
                && Objects.equals(this.modelIdentifier, valueScopeInput.modelIdentifier);
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
        return Objects.hash(orgIdentifier, principalType, principalIdentifier, modelIdentifier);
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
        sb.append("class ValueScopeInput {\n");
        sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
        sb.append("    principalType: ").append(toIndentedString(principalType)).append("\n");
        sb.append("    principalIdentifier: ")
                .append(toIndentedString(principalIdentifier))
                .append("\n");
        sb.append("    modelIdentifier: ").append(toIndentedString(modelIdentifier)).append("\n");
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
        openapiFields.add("org_identifier");
        openapiFields.add("principal_type");
        openapiFields.add("principal_identifier");
        openapiFields.add("model_identifier");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ValueScopeInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ValueScopeInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ValueScopeInput is not found in the"
                                        + " empty JSON string",
                                ValueScopeInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ValueScopeInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ValueScopeInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("org_identifier") != null && !jsonObj.get("org_identifier").isJsonNull())
                && !jsonObj.get("org_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `org_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("org_identifier").toString()));
        }
        if ((jsonObj.get("principal_type") != null && !jsonObj.get("principal_type").isJsonNull())
                && !jsonObj.get("principal_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `principal_type` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("principal_type").toString()));
        }
        // validate the optional field `principal_type`
        if (jsonObj.get("principal_type") != null && !jsonObj.get("principal_type").isJsonNull()) {
            PrincipalTypeEnum.validateJsonElement(jsonObj.get("principal_type"));
        }
        if ((jsonObj.get("principal_identifier") != null
                        && !jsonObj.get("principal_identifier").isJsonNull())
                && !jsonObj.get("principal_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `principal_identifier` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("principal_identifier").toString()));
        }
        if ((jsonObj.get("model_identifier") != null
                        && !jsonObj.get("model_identifier").isJsonNull())
                && !jsonObj.get("model_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `model_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("model_identifier").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ValueScopeInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ValueScopeInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ValueScopeInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ValueScopeInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ValueScopeInput>() {
                        @Override
                        public void write(JsonWriter out, ValueScopeInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ValueScopeInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ValueScopeInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ValueScopeInput
     * @throws IOException if the JSON string is invalid with respect to ValueScopeInput
     */
    public static ValueScopeInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ValueScopeInput.class);
    }

    /**
     * Convert an instance of ValueScopeInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
