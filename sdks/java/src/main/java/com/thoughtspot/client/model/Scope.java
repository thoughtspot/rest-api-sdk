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

/** Scope */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class Scope implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ACCESS_TYPE = "access_type";

    @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
    @javax.annotation.Nonnull
    private String accessType;

    public static final String SERIALIZED_NAME_ORG_ID = "org_id";

    @SerializedName(SERIALIZED_NAME_ORG_ID)
    @javax.annotation.Nullable
    private Integer orgId;

    public static final String SERIALIZED_NAME_METADATA_ID = "metadata_id";

    @SerializedName(SERIALIZED_NAME_METADATA_ID)
    @javax.annotation.Nullable
    private String metadataId;

    /**
     * Org scope the token is authorized for. Absent for a legacy single-org token. Version:
     * 26.10.0.cl or later
     */
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
            return null;
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
    @javax.annotation.Nullable
    private OrgScopeEnum orgScope;

    public static final String SERIALIZED_NAME_ORG_IDS = "org_ids";

    @SerializedName(SERIALIZED_NAME_ORG_IDS)
    @javax.annotation.Nullable
    private List<OrgInfo> orgIds;

    public Scope() {}

    public Scope accessType(@javax.annotation.Nonnull String accessType) {
        this.accessType = accessType;
        return this;
    }

    /**
     * Object access scope type.
     *
     * @return accessType
     */
    @javax.annotation.Nonnull
    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(@javax.annotation.Nonnull String accessType) {
        this.accessType = accessType;
    }

    public Scope orgId(@javax.annotation.Nullable Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
     * Unique identifier of the Org.
     *
     * @return orgId
     */
    @javax.annotation.Nullable
    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(@javax.annotation.Nullable Integer orgId) {
        this.orgId = orgId;
    }

    public Scope metadataId(@javax.annotation.Nullable String metadataId) {
        this.metadataId = metadataId;
        return this;
    }

    /**
     * Unique identifier of the metadata.
     *
     * @return metadataId
     */
    @javax.annotation.Nullable
    public String getMetadataId() {
        return metadataId;
    }

    public void setMetadataId(@javax.annotation.Nullable String metadataId) {
        this.metadataId = metadataId;
    }

    public Scope orgScope(@javax.annotation.Nullable OrgScopeEnum orgScope) {
        this.orgScope = orgScope;
        return this;
    }

    /**
     * Org scope the token is authorized for. Absent for a legacy single-org token. Version:
     * 26.10.0.cl or later
     *
     * @return orgScope
     */
    @javax.annotation.Nullable
    public OrgScopeEnum getOrgScope() {
        return orgScope;
    }

    public void setOrgScope(@javax.annotation.Nullable OrgScopeEnum orgScope) {
        this.orgScope = orgScope;
    }

    public Scope orgIds(@javax.annotation.Nullable List<OrgInfo> orgIds) {
        this.orgIds = orgIds;
        return this;
    }

    public Scope addOrgIdsItem(OrgInfo orgIdsItem) {
        if (this.orgIds == null) {
            this.orgIds = new ArrayList<>();
        }
        this.orgIds.add(orgIdsItem);
        return this;
    }

    /**
     * Orgs the token is authorized for when org_scope is SPECIFIC_ORGS. Version: 26.10.0.cl or
     * later
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
     * @return the Scope instance itself
     */
    public Scope putAdditionalProperty(String key, Object value) {
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
        Scope scope = (Scope) o;
        return Objects.equals(this.accessType, scope.accessType)
                && Objects.equals(this.orgId, scope.orgId)
                && Objects.equals(this.metadataId, scope.metadataId)
                && Objects.equals(this.orgScope, scope.orgScope)
                && Objects.equals(this.orgIds, scope.orgIds)
                && Objects.equals(this.additionalProperties, scope.additionalProperties);
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
        return Objects.hash(accessType, orgId, metadataId, orgScope, orgIds, additionalProperties);
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
        sb.append("class Scope {\n");
        sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    metadataId: ").append(toIndentedString(metadataId)).append("\n");
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
        openapiFields.add("access_type");
        openapiFields.add("org_id");
        openapiFields.add("metadata_id");
        openapiFields.add("org_scope");
        openapiFields.add("org_ids");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("access_type");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Scope
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!Scope.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Scope is not found in the empty JSON"
                                        + " string",
                                Scope.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : Scope.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("access_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `access_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("access_type").toString()));
        }
        if ((jsonObj.get("metadata_id") != null && !jsonObj.get("metadata_id").isJsonNull())
                && !jsonObj.get("metadata_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("metadata_id").toString()));
        }
        if ((jsonObj.get("org_scope") != null && !jsonObj.get("org_scope").isJsonNull())
                && !jsonObj.get("org_scope").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `org_scope` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("org_scope").toString()));
        }
        // validate the optional field `org_scope`
        if (jsonObj.get("org_scope") != null && !jsonObj.get("org_scope").isJsonNull()) {
            OrgScopeEnum.validateJsonElement(jsonObj.get("org_scope"));
        }
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
            if (!Scope.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Scope' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Scope> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Scope.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Scope>() {
                        @Override
                        public void write(JsonWriter out, Scope value) throws IOException {
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
                        public Scope read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            Scope instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of Scope given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Scope
     * @throws IOException if the JSON string is invalid with respect to Scope
     */
    public static Scope fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Scope.class);
    }

    /**
     * Convert an instance of Scope to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
