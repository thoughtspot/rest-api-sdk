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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Lightweight Org identifier and display name, as returned in feature assignment responses. The
 * field names org_id / org_name intentionally deviate from the bare id / name used by the shared
 * Org type: they are the literal wire keys emitted by the Callosum backend, so they are
 * load-bearing for Prism&#39;s response field mapping and cannot be renamed without a backend
 * change.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class FeatureOrgInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ORG_ID = "org_id";

    @SerializedName(SERIALIZED_NAME_ORG_ID)
    @javax.annotation.Nonnull
    private Integer orgId;

    public static final String SERIALIZED_NAME_ORG_NAME = "org_name";

    @SerializedName(SERIALIZED_NAME_ORG_NAME)
    @javax.annotation.Nonnull
    private String orgName;

    public FeatureOrgInfo() {}

    public FeatureOrgInfo orgId(@javax.annotation.Nonnull Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
     * Numeric ID of the Org.
     *
     * @return orgId
     */
    @javax.annotation.Nonnull
    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(@javax.annotation.Nonnull Integer orgId) {
        this.orgId = orgId;
    }

    public FeatureOrgInfo orgName(@javax.annotation.Nonnull String orgName) {
        this.orgName = orgName;
        return this;
    }

    /**
     * Display name of the Org.
     *
     * @return orgName
     */
    @javax.annotation.Nonnull
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(@javax.annotation.Nonnull String orgName) {
        this.orgName = orgName;
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
     * @return the FeatureOrgInfo instance itself
     */
    public FeatureOrgInfo putAdditionalProperty(String key, Object value) {
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
        FeatureOrgInfo featureOrgInfo = (FeatureOrgInfo) o;
        return Objects.equals(this.orgId, featureOrgInfo.orgId)
                && Objects.equals(this.orgName, featureOrgInfo.orgName)
                && Objects.equals(this.additionalProperties, featureOrgInfo.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgId, orgName, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeatureOrgInfo {\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
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
        openapiFields.add("org_id");
        openapiFields.add("org_name");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("org_id");
        openapiRequiredFields.add("org_name");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to FeatureOrgInfo
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!FeatureOrgInfo.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FeatureOrgInfo is not found in the"
                                        + " empty JSON string",
                                FeatureOrgInfo.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : FeatureOrgInfo.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("org_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `org_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("org_name").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FeatureOrgInfo.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FeatureOrgInfo' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FeatureOrgInfo> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FeatureOrgInfo.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FeatureOrgInfo>() {
                        @Override
                        public void write(JsonWriter out, FeatureOrgInfo value) throws IOException {
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
                        public FeatureOrgInfo read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            FeatureOrgInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of FeatureOrgInfo given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FeatureOrgInfo
     * @throws IOException if the JSON string is invalid with respect to FeatureOrgInfo
     */
    public static FeatureOrgInfo fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FeatureOrgInfo.class);
    }

    /**
     * Convert an instance of FeatureOrgInfo to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
