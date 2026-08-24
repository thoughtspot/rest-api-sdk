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
 * A named group of related features. Returned by searchFeatures; the contents of features depend on
 * the requested scope (cluster-admin vs. org-admin view).
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class FeatureGroup implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_FEATURE_GROUP = "feature_group";

    @SerializedName(SERIALIZED_NAME_FEATURE_GROUP)
    @javax.annotation.Nullable
    private String featureGroup;

    public static final String SERIALIZED_NAME_DOCS_URL = "docs_url";

    @SerializedName(SERIALIZED_NAME_DOCS_URL)
    @javax.annotation.Nullable
    private String docsUrl;

    public static final String SERIALIZED_NAME_FEATURES = "features";

    @SerializedName(SERIALIZED_NAME_FEATURES)
    @javax.annotation.Nonnull
    private List<FeatureDetail> features;

    public FeatureGroup() {}

    public FeatureGroup featureGroup(@javax.annotation.Nullable String featureGroup) {
        this.featureGroup = featureGroup;
        return this;
    }

    /**
     * Display name of the feature group.
     *
     * @return featureGroup
     */
    @javax.annotation.Nullable
    public String getFeatureGroup() {
        return featureGroup;
    }

    public void setFeatureGroup(@javax.annotation.Nullable String featureGroup) {
        this.featureGroup = featureGroup;
    }

    public FeatureGroup docsUrl(@javax.annotation.Nullable String docsUrl) {
        this.docsUrl = docsUrl;
        return this;
    }

    /**
     * Documentation URL for the feature group, when available.
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

    public FeatureGroup features(@javax.annotation.Nonnull List<FeatureDetail> features) {
        this.features = features;
        return this;
    }

    public FeatureGroup addFeaturesItem(FeatureDetail featuresItem) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }
        this.features.add(featuresItem);
        return this;
    }

    /**
     * Feature details within this group. Each entry contains the fields relevant to the requested
     * scope; org-admin-only and cluster-admin-only fields are null in the other view.
     *
     * @return features
     */
    @javax.annotation.Nonnull
    public List<FeatureDetail> getFeatures() {
        return features;
    }

    public void setFeatures(@javax.annotation.Nonnull List<FeatureDetail> features) {
        this.features = features;
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
     * @return the FeatureGroup instance itself
     */
    public FeatureGroup putAdditionalProperty(String key, Object value) {
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
        FeatureGroup featureGroup = (FeatureGroup) o;
        return Objects.equals(this.featureGroup, featureGroup.featureGroup)
                && Objects.equals(this.docsUrl, featureGroup.docsUrl)
                && Objects.equals(this.features, featureGroup.features)
                && Objects.equals(this.additionalProperties, featureGroup.additionalProperties);
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
        return Objects.hash(featureGroup, docsUrl, features, additionalProperties);
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
        sb.append("class FeatureGroup {\n");
        sb.append("    featureGroup: ").append(toIndentedString(featureGroup)).append("\n");
        sb.append("    docsUrl: ").append(toIndentedString(docsUrl)).append("\n");
        sb.append("    features: ").append(toIndentedString(features)).append("\n");
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
        openapiFields.add("feature_group");
        openapiFields.add("docs_url");
        openapiFields.add("features");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("features");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to FeatureGroup
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!FeatureGroup.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FeatureGroup is not found in the"
                                        + " empty JSON string",
                                FeatureGroup.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : FeatureGroup.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("feature_group") != null && !jsonObj.get("feature_group").isJsonNull())
                && !jsonObj.get("feature_group").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `feature_group` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("feature_group").toString()));
        }
        if ((jsonObj.get("docs_url") != null && !jsonObj.get("docs_url").isJsonNull())
                && !jsonObj.get("docs_url").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `docs_url` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("docs_url").toString()));
        }
        // ensure the json data is an array
        if (!jsonObj.get("features").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `features` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("features").toString()));
        }

        JsonArray jsonArrayfeatures = jsonObj.getAsJsonArray("features");
        // validate the required field `features` (array)
        for (int i = 0; i < jsonArrayfeatures.size(); i++) {
            FeatureDetail.validateJsonElement(jsonArrayfeatures.get(i));
        }
        ;
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FeatureGroup.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FeatureGroup' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FeatureGroup> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FeatureGroup.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FeatureGroup>() {
                        @Override
                        public void write(JsonWriter out, FeatureGroup value) throws IOException {
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
                        public FeatureGroup read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            FeatureGroup instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of FeatureGroup given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FeatureGroup
     * @throws IOException if the JSON string is invalid with respect to FeatureGroup
     */
    public static FeatureGroup fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FeatureGroup.class);
    }

    /**
     * Convert an instance of FeatureGroup to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
