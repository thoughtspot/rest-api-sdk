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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** UpdateFeatureValueRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UpdateFeatureValueRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Determines the scope at which the value is set. Use CLUSTER to set the cluster-level value;
     * use ORG to set a per-Org value override.
     */
    @JsonAdapter(ScopeEnum.Adapter.class)
    public enum ScopeEnum {
        CLUSTER("CLUSTER"),

        ORG("ORG");

        private String value;

        ScopeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ScopeEnum fromValue(String value) {
            for (ScopeEnum b : ScopeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ScopeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ScopeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ScopeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ScopeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_SCOPE = "scope";

    @SerializedName(SERIALIZED_NAME_SCOPE)
    @javax.annotation.Nonnull
    private ScopeEnum scope;

    public static final String SERIALIZED_NAME_ORG_IDENTIFIER = "org_identifier";

    @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIER)
    @javax.annotation.Nullable
    private Integer orgIdentifier;

    public static final String SERIALIZED_NAME_FEATURE_IDENTIFIER = "feature_identifier";

    @SerializedName(SERIALIZED_NAME_FEATURE_IDENTIFIER)
    @javax.annotation.Nonnull
    private String featureIdentifier;

    public static final String SERIALIZED_NAME_FEATURE_VALUE = "feature_value";

    @SerializedName(SERIALIZED_NAME_FEATURE_VALUE)
    @javax.annotation.Nonnull
    private String featureValue;

    public static final String SERIALIZED_NAME_RESET_ORG_OVERRIDES = "reset_org_overrides";

    @SerializedName(SERIALIZED_NAME_RESET_ORG_OVERRIDES)
    @javax.annotation.Nullable
    private Boolean resetOrgOverrides;

    public UpdateFeatureValueRequest() {}

    public UpdateFeatureValueRequest scope(@javax.annotation.Nonnull ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Determines the scope at which the value is set. Use CLUSTER to set the cluster-level value;
     * use ORG to set a per-Org value override.
     *
     * @return scope
     */
    @javax.annotation.Nonnull
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(@javax.annotation.Nonnull ScopeEnum scope) {
        this.scope = scope;
    }

    public UpdateFeatureValueRequest orgIdentifier(
            @javax.annotation.Nullable Integer orgIdentifier) {
        this.orgIdentifier = orgIdentifier;
        return this;
    }

    /**
     * Numeric ID of the Org for which to set the value. Required when scope is ORG; ignored when
     * scope is CLUSTER.
     *
     * @return orgIdentifier
     */
    @javax.annotation.Nullable
    public Integer getOrgIdentifier() {
        return orgIdentifier;
    }

    public void setOrgIdentifier(@javax.annotation.Nullable Integer orgIdentifier) {
        this.orgIdentifier = orgIdentifier;
    }

    public UpdateFeatureValueRequest featureIdentifier(
            @javax.annotation.Nonnull String featureIdentifier) {
        this.featureIdentifier = featureIdentifier;
        return this;
    }

    /**
     * User-friendly feature name (feature_name) or the underlying feature ID (feature_id) of the
     * feature whose value should be set.
     *
     * @return featureIdentifier
     */
    @javax.annotation.Nonnull
    public String getFeatureIdentifier() {
        return featureIdentifier;
    }

    public void setFeatureIdentifier(@javax.annotation.Nonnull String featureIdentifier) {
        this.featureIdentifier = featureIdentifier;
    }

    public UpdateFeatureValueRequest featureValue(@javax.annotation.Nonnull String featureValue) {
        this.featureValue = featureValue;
        return this;
    }

    /**
     * New value to set for the feature.
     *
     * @return featureValue
     */
    @javax.annotation.Nonnull
    public String getFeatureValue() {
        return featureValue;
    }

    public void setFeatureValue(@javax.annotation.Nonnull String featureValue) {
        this.featureValue = featureValue;
    }

    public UpdateFeatureValueRequest resetOrgOverrides(
            @javax.annotation.Nullable Boolean resetOrgOverrides) {
        this.resetOrgOverrides = resetOrgOverrides;
        return this;
    }

    /**
     * Applicable only when &#x60;scope&#x60; is &#x60;CLUSTER&#x60;. When &#x60;true&#x60;, any
     * existing per-Org value overrides for this feature are removed so that all Orgs inherit the
     * new cluster-level value. Required when &#x60;scope&#x60; is &#x60;CLUSTER&#x60; for an
     * org-aware feature. Must be omitted when &#x60;scope&#x60; is &#x60;ORG&#x60;; passing it at
     * &#x60;ORG&#x60; scope returns a 400 error.
     *
     * @return resetOrgOverrides
     */
    @javax.annotation.Nullable
    public Boolean getResetOrgOverrides() {
        return resetOrgOverrides;
    }

    public void setResetOrgOverrides(@javax.annotation.Nullable Boolean resetOrgOverrides) {
        this.resetOrgOverrides = resetOrgOverrides;
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
     * @return the UpdateFeatureValueRequest instance itself
     */
    public UpdateFeatureValueRequest putAdditionalProperty(String key, Object value) {
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
        UpdateFeatureValueRequest updateFeatureValueRequest = (UpdateFeatureValueRequest) o;
        return Objects.equals(this.scope, updateFeatureValueRequest.scope)
                && Objects.equals(this.orgIdentifier, updateFeatureValueRequest.orgIdentifier)
                && Objects.equals(
                        this.featureIdentifier, updateFeatureValueRequest.featureIdentifier)
                && Objects.equals(this.featureValue, updateFeatureValueRequest.featureValue)
                && Objects.equals(
                        this.resetOrgOverrides, updateFeatureValueRequest.resetOrgOverrides)
                && Objects.equals(
                        this.additionalProperties, updateFeatureValueRequest.additionalProperties);
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
                scope,
                orgIdentifier,
                featureIdentifier,
                featureValue,
                resetOrgOverrides,
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
        sb.append("class UpdateFeatureValueRequest {\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
        sb.append("    featureIdentifier: ")
                .append(toIndentedString(featureIdentifier))
                .append("\n");
        sb.append("    featureValue: ").append(toIndentedString(featureValue)).append("\n");
        sb.append("    resetOrgOverrides: ")
                .append(toIndentedString(resetOrgOverrides))
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
        openapiFields.add("scope");
        openapiFields.add("org_identifier");
        openapiFields.add("feature_identifier");
        openapiFields.add("feature_value");
        openapiFields.add("reset_org_overrides");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("scope");
        openapiRequiredFields.add("feature_identifier");
        openapiRequiredFields.add("feature_value");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpdateFeatureValueRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UpdateFeatureValueRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateFeatureValueRequest is not"
                                        + " found in the empty JSON string",
                                UpdateFeatureValueRequest.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UpdateFeatureValueRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("scope").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `scope` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("scope").toString()));
        }
        // validate the required field `scope`
        ScopeEnum.validateJsonElement(jsonObj.get("scope"));
        if (!jsonObj.get("feature_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `feature_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("feature_identifier").toString()));
        }
        if (!jsonObj.get("feature_value").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `feature_value` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("feature_value").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateFeatureValueRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateFeatureValueRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateFeatureValueRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UpdateFeatureValueRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateFeatureValueRequest>() {
                        @Override
                        public void write(JsonWriter out, UpdateFeatureValueRequest value)
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
                        public UpdateFeatureValueRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            UpdateFeatureValueRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of UpdateFeatureValueRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateFeatureValueRequest
     * @throws IOException if the JSON string is invalid with respect to UpdateFeatureValueRequest
     */
    public static UpdateFeatureValueRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateFeatureValueRequest.class);
    }

    /**
     * Convert an instance of UpdateFeatureValueRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
