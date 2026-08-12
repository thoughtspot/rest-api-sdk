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
import com.google.gson.annotations.JsonAdapter;
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

/**
 * The set of Orgs a token is authorized to operate in, recorded at issuance. Used for token types
 * (e.g. AccessToken) that have no other {@code scope} field of their own.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AccessTokenScope implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Org scope the token is authorized for: SPECIFIC_ORGS or ALL_MEMBER_ORGS. */
    @JsonAdapter(OrgScopeEnum.Adapter.class)
    public enum OrgScopeEnum {
        SPECIFIC_ORGS("SPECIFIC_ORGS"),

        ALL_MEMBER_ORGS("ALL_MEMBER_ORGS");

        private String value;

        OrgScopeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OrgScopeEnum fromValue(String value) {
            for (OrgScopeEnum b : OrgScopeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<OrgScopeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OrgScopeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OrgScopeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OrgScopeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            OrgScopeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_ORG_SCOPE = "org_scope";

    @SerializedName(SERIALIZED_NAME_ORG_SCOPE)
    @javax.annotation.Nonnull
    private OrgScopeEnum orgScope;

    public static final String SERIALIZED_NAME_ORG_IDS = "org_ids";

    @SerializedName(SERIALIZED_NAME_ORG_IDS)
    @javax.annotation.Nullable
    private List<OrgInfo> orgIds;

    public AccessTokenScope() {}

    public AccessTokenScope orgScope(@javax.annotation.Nonnull OrgScopeEnum orgScope) {
        this.orgScope = orgScope;
        return this;
    }

    /**
     * Org scope the token is authorized for: SPECIFIC_ORGS or ALL_MEMBER_ORGS.
     *
     * @return orgScope
     */
    @javax.annotation.Nonnull
    public OrgScopeEnum getOrgScope() {
        return orgScope;
    }

    public void setOrgScope(@javax.annotation.Nonnull OrgScopeEnum orgScope) {
        this.orgScope = orgScope;
    }

    public AccessTokenScope orgIds(@javax.annotation.Nullable List<OrgInfo> orgIds) {
        this.orgIds = orgIds;
        return this;
    }

    public AccessTokenScope addOrgIdsItem(OrgInfo orgIdsItem) {
        if (this.orgIds == null) {
            this.orgIds = new ArrayList<>();
        }
        this.orgIds.add(orgIdsItem);
        return this;
    }

    /**
     * Orgs the token is authorized for when org_scope is SPECIFIC_ORGS.
     *
     * @return orgIds
     */
    @javax.annotation.Nullable
    public List<OrgInfo> getOrgIds() {
        return orgIds;
    }

    public void setOrgIds(@javax.annotation.Nullable List<OrgInfo> orgIds) {
        this.orgIds = orgIds;
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
     * @return the AccessTokenScope instance itself
     */
    public AccessTokenScope putAdditionalProperty(String key, Object value) {
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
        AccessTokenScope accessTokenScope = (AccessTokenScope) o;
        return Objects.equals(this.orgScope, accessTokenScope.orgScope)
                && Objects.equals(this.orgIds, accessTokenScope.orgIds)
                && Objects.equals(this.additionalProperties, accessTokenScope.additionalProperties);
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
        return Objects.hash(orgScope, orgIds, additionalProperties);
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
        sb.append("class AccessTokenScope {\n");
        sb.append("    orgScope: ").append(toIndentedString(orgScope)).append("\n");
        sb.append("    orgIds: ").append(toIndentedString(orgIds)).append("\n");
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
        openapiFields.add("org_scope");
        openapiFields.add("org_ids");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("org_scope");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AccessTokenScope
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AccessTokenScope.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AccessTokenScope is not found in the"
                                        + " empty JSON string",
                                AccessTokenScope.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : AccessTokenScope.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("org_scope").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `org_scope` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("org_scope").toString()));
        }
        // validate the required field `org_scope`
        OrgScopeEnum.validateJsonElement(jsonObj.get("org_scope"));
        if (jsonObj.get("org_ids") != null && !jsonObj.get("org_ids").isJsonNull()) {
            JsonArray jsonArrayorgIds = jsonObj.getAsJsonArray("org_ids");
            if (jsonArrayorgIds != null) {
                // ensure the json data is an array
                if (!jsonObj.get("org_ids").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `org_ids` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("org_ids").toString()));
                }

                // validate the optional field `org_ids` (array)
                for (int i = 0; i < jsonArrayorgIds.size(); i++) {
                    OrgInfo.validateJsonElement(jsonArrayorgIds.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AccessTokenScope.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AccessTokenScope' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AccessTokenScope> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AccessTokenScope.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AccessTokenScope>() {
                        @Override
                        public void write(JsonWriter out, AccessTokenScope value)
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
                        public AccessTokenScope read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            AccessTokenScope instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of AccessTokenScope given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AccessTokenScope
     * @throws IOException if the JSON string is invalid with respect to AccessTokenScope
     */
    public static AccessTokenScope fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AccessTokenScope.class);
    }

    /**
     * Convert an instance of AccessTokenScope to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
