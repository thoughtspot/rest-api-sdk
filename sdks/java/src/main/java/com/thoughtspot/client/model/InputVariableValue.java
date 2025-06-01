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

/** InputVariableValue */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class InputVariableValue implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_VALUE = "value";

    @SerializedName(SERIALIZED_NAME_VALUE)
    @javax.annotation.Nonnull
    private String value;

    public static final String SERIALIZED_NAME_ORG_IDENTIFIER = "org_identifier";

    @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIER)
    @javax.annotation.Nonnull
    private String orgIdentifier;

    /** Principal type */
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

    public static final String SERIALIZED_NAME_PRIORITY = "priority";

    @SerializedName(SERIALIZED_NAME_PRIORITY)
    @javax.annotation.Nullable
    private Integer priority;

    public InputVariableValue() {}

    public InputVariableValue value(@javax.annotation.Nonnull String value) {
        this.value = value;
        return this;
    }

    /**
     * The connection property value
     *
     * @return value
     */
    @javax.annotation.Nonnull
    public String getValue() {
        return value;
    }

    public void setValue(@javax.annotation.Nonnull String value) {
        this.value = value;
    }

    public InputVariableValue orgIdentifier(@javax.annotation.Nonnull String orgIdentifier) {
        this.orgIdentifier = orgIdentifier;
        return this;
    }

    /**
     * The unique name of the org
     *
     * @return orgIdentifier
     */
    @javax.annotation.Nonnull
    public String getOrgIdentifier() {
        return orgIdentifier;
    }

    public void setOrgIdentifier(@javax.annotation.Nonnull String orgIdentifier) {
        this.orgIdentifier = orgIdentifier;
    }

    public InputVariableValue principalType(
            @javax.annotation.Nullable PrincipalTypeEnum principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * Principal type
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

    public InputVariableValue principalIdentifier(
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

    public InputVariableValue priority(@javax.annotation.Nullable Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * The priority assigned to this value. If there are 2 matching values, the one with the higher
     * priority will be picked.
     *
     * @return priority
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(@javax.annotation.Nullable Integer priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InputVariableValue inputVariableValue = (InputVariableValue) o;
        return Objects.equals(this.value, inputVariableValue.value)
                && Objects.equals(this.orgIdentifier, inputVariableValue.orgIdentifier)
                && Objects.equals(this.principalType, inputVariableValue.principalType)
                && Objects.equals(this.principalIdentifier, inputVariableValue.principalIdentifier)
                && Objects.equals(this.priority, inputVariableValue.priority);
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
        return Objects.hash(value, orgIdentifier, principalType, principalIdentifier, priority);
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
        sb.append("class InputVariableValue {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
        sb.append("    principalType: ").append(toIndentedString(principalType)).append("\n");
        sb.append("    principalIdentifier: ")
                .append(toIndentedString(principalIdentifier))
                .append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
        openapiFields.add("value");
        openapiFields.add("org_identifier");
        openapiFields.add("principal_type");
        openapiFields.add("principal_identifier");
        openapiFields.add("priority");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("value");
        openapiRequiredFields.add("org_identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to InputVariableValue
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!InputVariableValue.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in InputVariableValue is not found in"
                                        + " the empty JSON string",
                                InputVariableValue.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!InputVariableValue.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `InputVariableValue` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : InputVariableValue.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("value").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `value` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("value").toString()));
        }
        if (!jsonObj.get("org_identifier").isJsonPrimitive()) {
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
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!InputVariableValue.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'InputVariableValue' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<InputVariableValue> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(InputVariableValue.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<InputVariableValue>() {
                        @Override
                        public void write(JsonWriter out, InputVariableValue value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public InputVariableValue read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of InputVariableValue given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of InputVariableValue
     * @throws IOException if the JSON string is invalid with respect to InputVariableValue
     */
    public static InputVariableValue fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, InputVariableValue.class);
    }

    /**
     * Convert an instance of InputVariableValue to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
