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

/**
 * Detail for a single feature. Fields are populated according to the scope of the search:
 * cluster-admin (CLUSTER) responses populate assigned_orgs, is_org_aware, and (for non-org-aware
 * features) feature_value; org-admin (ORG) responses populate element_type, element_config, and
 * element_value.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class FeatureDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_FEATURE_ID = "feature_id";

    @SerializedName(SERIALIZED_NAME_FEATURE_ID)
    @javax.annotation.Nonnull
    private String featureId;

    public static final String SERIALIZED_NAME_FEATURE_NAME = "feature_name";

    @SerializedName(SERIALIZED_NAME_FEATURE_NAME)
    @javax.annotation.Nullable
    private String featureName;

    public static final String SERIALIZED_NAME_ASSIGNED_ORGS = "assigned_orgs";

    @SerializedName(SERIALIZED_NAME_ASSIGNED_ORGS)
    @javax.annotation.Nullable
    private List<FeatureOrgInfo> assignedOrgs;

    public static final String SERIALIZED_NAME_IS_ORG_AWARE = "is_org_aware";

    @SerializedName(SERIALIZED_NAME_IS_ORG_AWARE)
    @javax.annotation.Nullable
    private Boolean isOrgAware;

    public static final String SERIALIZED_NAME_FEATURE_VALUE = "feature_value";

    @SerializedName(SERIALIZED_NAME_FEATURE_VALUE)
    @javax.annotation.Nullable
    private String featureValue;

    public static final String SERIALIZED_NAME_ELEMENT_TYPE = "element_type";

    @SerializedName(SERIALIZED_NAME_ELEMENT_TYPE)
    @javax.annotation.Nullable
    private String elementType;

    public static final String SERIALIZED_NAME_ELEMENT_CONFIG = "element_config";

    @SerializedName(SERIALIZED_NAME_ELEMENT_CONFIG)
    @javax.annotation.Nullable
    private Object elementConfig = null;

    public static final String SERIALIZED_NAME_ELEMENT_VALUE = "element_value";

    @SerializedName(SERIALIZED_NAME_ELEMENT_VALUE)
    @javax.annotation.Nullable
    private String elementValue;

    public static final String SERIALIZED_NAME_DOCS_URL = "docs_url";

    @SerializedName(SERIALIZED_NAME_DOCS_URL)
    @javax.annotation.Nullable
    private String docsUrl;

    public FeatureDetail() {}

    public FeatureDetail featureId(@javax.annotation.Nonnull String featureId) {
        this.featureId = featureId;
        return this;
    }

    /**
     * Underlying unique feature ID.
     *
     * @return featureId
     */
    @javax.annotation.Nonnull
    public String getFeatureId() {
        return featureId;
    }

    public void setFeatureId(@javax.annotation.Nonnull String featureId) {
        this.featureId = featureId;
    }

    public FeatureDetail featureName(@javax.annotation.Nullable String featureName) {
        this.featureName = featureName;
        return this;
    }

    /**
     * User-friendly feature name. Present when the feature declares one.
     *
     * @return featureName
     */
    @javax.annotation.Nullable
    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(@javax.annotation.Nullable String featureName) {
        this.featureName = featureName;
    }

    public FeatureDetail assignedOrgs(
            @javax.annotation.Nullable List<FeatureOrgInfo> assignedOrgs) {
        this.assignedOrgs = assignedOrgs;
        return this;
    }

    public FeatureDetail addAssignedOrgsItem(FeatureOrgInfo assignedOrgsItem) {
        if (this.assignedOrgs == null) {
            this.assignedOrgs = new ArrayList<>();
        }
        this.assignedOrgs.add(assignedOrgsItem);
        return this;
    }

    /**
     * Orgs currently assigned to this feature. Populated in the cluster-admin view.
     *
     * @return assignedOrgs
     */
    @javax.annotation.Nullable
    public List<FeatureOrgInfo> getAssignedOrgs() {
        return assignedOrgs;
    }

    public void setAssignedOrgs(@javax.annotation.Nullable List<FeatureOrgInfo> assignedOrgs) {
        this.assignedOrgs = assignedOrgs;
    }

    public FeatureDetail isOrgAware(@javax.annotation.Nullable Boolean isOrgAware) {
        this.isOrgAware = isOrgAware;
        return this;
    }

    /**
     * Whether the feature is Org-aware. Org-aware features are managed via per-Org assignment;
     * non-org-aware features are cluster-level toggles. Populated in the cluster-admin view.
     *
     * @return isOrgAware
     */
    @javax.annotation.Nullable
    public Boolean getIsOrgAware() {
        return isOrgAware;
    }

    public void setIsOrgAware(@javax.annotation.Nullable Boolean isOrgAware) {
        this.isOrgAware = isOrgAware;
    }

    public FeatureDetail featureValue(@javax.annotation.Nullable String featureValue) {
        this.featureValue = featureValue;
        return this;
    }

    /**
     * Current cluster-level value of the feature. Populated in the cluster-admin view for
     * non-org-aware features; null for Org-aware features.
     *
     * @return featureValue
     */
    @javax.annotation.Nullable
    public String getFeatureValue() {
        return featureValue;
    }

    public void setFeatureValue(@javax.annotation.Nullable String featureValue) {
        this.featureValue = featureValue;
    }

    public FeatureDetail elementType(@javax.annotation.Nullable String elementType) {
        this.elementType = elementType;
        return this;
    }

    /**
     * UI element type hint for the feature. Populated in the org-admin view.
     *
     * @return elementType
     */
    @javax.annotation.Nullable
    public String getElementType() {
        return elementType;
    }

    public void setElementType(@javax.annotation.Nullable String elementType) {
        this.elementType = elementType;
    }

    public FeatureDetail elementConfig(@javax.annotation.Nullable Object elementConfig) {
        this.elementConfig = elementConfig;
        return this;
    }

    /**
     * UI element configuration for the feature. Populated in the org-admin view.
     *
     * @return elementConfig
     */
    @javax.annotation.Nullable
    public Object getElementConfig() {
        return elementConfig;
    }

    public void setElementConfig(@javax.annotation.Nullable Object elementConfig) {
        this.elementConfig = elementConfig;
    }

    public FeatureDetail elementValue(@javax.annotation.Nullable String elementValue) {
        this.elementValue = elementValue;
        return this;
    }

    /**
     * Current value of the feature for the requested Org. Populated in the org-admin view.
     *
     * @return elementValue
     */
    @javax.annotation.Nullable
    public String getElementValue() {
        return elementValue;
    }

    public void setElementValue(@javax.annotation.Nullable String elementValue) {
        this.elementValue = elementValue;
    }

    public FeatureDetail docsUrl(@javax.annotation.Nullable String docsUrl) {
        this.docsUrl = docsUrl;
        return this;
    }

    /**
     * Per-feature documentation URL, when available.
     *
     * @return docsUrl
     */
    @javax.annotation.Nullable
    public String getDocsUrl() {
        return docsUrl;
    }

    public void setDocsUrl(@javax.annotation.Nullable String docsUrl) {
        this.docsUrl = docsUrl;
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
     * @return the FeatureDetail instance itself
     */
    public FeatureDetail putAdditionalProperty(String key, Object value) {
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
        FeatureDetail featureDetail = (FeatureDetail) o;
        return Objects.equals(this.featureId, featureDetail.featureId)
                && Objects.equals(this.featureName, featureDetail.featureName)
                && Objects.equals(this.assignedOrgs, featureDetail.assignedOrgs)
                && Objects.equals(this.isOrgAware, featureDetail.isOrgAware)
                && Objects.equals(this.featureValue, featureDetail.featureValue)
                && Objects.equals(this.elementType, featureDetail.elementType)
                && Objects.equals(this.elementConfig, featureDetail.elementConfig)
                && Objects.equals(this.elementValue, featureDetail.elementValue)
                && Objects.equals(this.docsUrl, featureDetail.docsUrl)
                && Objects.equals(this.additionalProperties, featureDetail.additionalProperties);
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
        return Objects.hash(
                featureId,
                featureName,
                assignedOrgs,
                isOrgAware,
                featureValue,
                elementType,
                elementConfig,
                elementValue,
                docsUrl,
                additionalProperties);
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
        sb.append("class FeatureDetail {\n");
        sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
        sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
        sb.append("    assignedOrgs: ").append(toIndentedString(assignedOrgs)).append("\n");
        sb.append("    isOrgAware: ").append(toIndentedString(isOrgAware)).append("\n");
        sb.append("    featureValue: ").append(toIndentedString(featureValue)).append("\n");
        sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
        sb.append("    elementConfig: ").append(toIndentedString(elementConfig)).append("\n");
        sb.append("    elementValue: ").append(toIndentedString(elementValue)).append("\n");
        sb.append("    docsUrl: ").append(toIndentedString(docsUrl)).append("\n");
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
        openapiFields.add("feature_id");
        openapiFields.add("feature_name");
        openapiFields.add("assigned_orgs");
        openapiFields.add("is_org_aware");
        openapiFields.add("feature_value");
        openapiFields.add("element_type");
        openapiFields.add("element_config");
        openapiFields.add("element_value");
        openapiFields.add("docs_url");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("feature_id");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to FeatureDetail
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!FeatureDetail.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FeatureDetail is not found in the"
                                        + " empty JSON string",
                                FeatureDetail.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : FeatureDetail.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("feature_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `feature_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("feature_id").toString()));
        }
        if ((jsonObj.get("feature_name") != null && !jsonObj.get("feature_name").isJsonNull())
                && !jsonObj.get("feature_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `feature_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("feature_name").toString()));
        }
        if (jsonObj.get("assigned_orgs") != null && !jsonObj.get("assigned_orgs").isJsonNull()) {
            JsonArray jsonArrayassignedOrgs = jsonObj.getAsJsonArray("assigned_orgs");
            if (jsonArrayassignedOrgs != null) {
                // ensure the json data is an array
                if (!jsonObj.get("assigned_orgs").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `assigned_orgs` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("assigned_orgs").toString()));
                }

                // validate the optional field `assigned_orgs` (array)
                for (int i = 0; i < jsonArrayassignedOrgs.size(); i++) {
                    FeatureOrgInfo.validateJsonElement(jsonArrayassignedOrgs.get(i));
                }
                ;
            }
        }
        if ((jsonObj.get("feature_value") != null && !jsonObj.get("feature_value").isJsonNull())
                && !jsonObj.get("feature_value").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `feature_value` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("feature_value").toString()));
        }
        if ((jsonObj.get("element_type") != null && !jsonObj.get("element_type").isJsonNull())
                && !jsonObj.get("element_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `element_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("element_type").toString()));
        }
        if ((jsonObj.get("element_value") != null && !jsonObj.get("element_value").isJsonNull())
                && !jsonObj.get("element_value").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `element_value` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("element_value").toString()));
        }
        if ((jsonObj.get("docs_url") != null && !jsonObj.get("docs_url").isJsonNull())
                && !jsonObj.get("docs_url").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `docs_url` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("docs_url").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FeatureDetail.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FeatureDetail' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FeatureDetail> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FeatureDetail.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FeatureDetail>() {
                        @Override
                        public void write(JsonWriter out, FeatureDetail value) throws IOException {
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
                        public FeatureDetail read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            FeatureDetail instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of FeatureDetail given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FeatureDetail
     * @throws IOException if the JSON string is invalid with respect to FeatureDetail
     */
    public static FeatureDetail fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FeatureDetail.class);
    }

    /**
     * Convert an instance of FeatureDetail to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
