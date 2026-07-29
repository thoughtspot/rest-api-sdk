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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** UpdateFeatureAssignmentsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UpdateFeatureAssignmentsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_FEATURE_IDENTIFIER = "feature_identifier";

    @SerializedName(SERIALIZED_NAME_FEATURE_IDENTIFIER)
    @javax.annotation.Nonnull
    private String featureIdentifier;

    public static final String SERIALIZED_NAME_ORG_IDENTIFIERS = "org_identifiers";

    @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIERS)
    @javax.annotation.Nonnull
    private List<Integer> orgIdentifiers;

    /**
     * Type of update to apply to the Org assignments. ADD assigns the given Orgs in addition to
     * existing ones; REMOVE unassigns the given Orgs; REPLACE sets the assignment to exactly the
     * given Orgs. Defaults to REPLACE.
     */
    @JsonAdapter(OperationEnum.Adapter.class)
    public enum OperationEnum {
        ADD("ADD"),

        REMOVE("REMOVE"),

        REPLACE("REPLACE");

        private String value;

        OperationEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OperationEnum fromValue(String value) {
            for (OperationEnum b : OperationEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<OperationEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OperationEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OperationEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OperationEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            OperationEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_OPERATION = "operation";

    @SerializedName(SERIALIZED_NAME_OPERATION)
    @javax.annotation.Nullable
    private OperationEnum operation = OperationEnum.REPLACE;

    public UpdateFeatureAssignmentsRequest() {}

    public UpdateFeatureAssignmentsRequest featureIdentifier(
            @javax.annotation.Nonnull String featureIdentifier) {
        this.featureIdentifier = featureIdentifier;
        return this;
    }

    /**
     * User-friendly feature name (feature_name) or the underlying feature ID (feature_id) of the
     * feature whose Org assignments should be updated.
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

    public UpdateFeatureAssignmentsRequest orgIdentifiers(
            @javax.annotation.Nonnull List<Integer> orgIdentifiers) {
        this.orgIdentifiers = orgIdentifiers;
        return this;
    }

    public UpdateFeatureAssignmentsRequest addOrgIdentifiersItem(Integer orgIdentifiersItem) {
        if (this.orgIdentifiers == null) {
            this.orgIdentifiers = new ArrayList<>();
        }
        this.orgIdentifiers.add(orgIdentifiersItem);
        return this;
    }

    /**
     * Numeric IDs of the Orgs to assign to the feature. Send an empty array with operation REPLACE
     * to clear all Org assignments for this feature.
     *
     * @return orgIdentifiers
     */
    @javax.annotation.Nonnull
    public List<Integer> getOrgIdentifiers() {
        return orgIdentifiers;
    }

    public void setOrgIdentifiers(@javax.annotation.Nonnull List<Integer> orgIdentifiers) {
        this.orgIdentifiers = orgIdentifiers;
    }

    public UpdateFeatureAssignmentsRequest operation(
            @javax.annotation.Nullable OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Type of update to apply to the Org assignments. ADD assigns the given Orgs in addition to
     * existing ones; REMOVE unassigns the given Orgs; REPLACE sets the assignment to exactly the
     * given Orgs. Defaults to REPLACE.
     *
     * @return operation
     */
    @javax.annotation.Nullable
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(@javax.annotation.Nullable OperationEnum operation) {
        this.operation = operation;
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
     * @return the UpdateFeatureAssignmentsRequest instance itself
     */
    public UpdateFeatureAssignmentsRequest putAdditionalProperty(String key, Object value) {
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
        UpdateFeatureAssignmentsRequest updateFeatureAssignmentsRequest =
                (UpdateFeatureAssignmentsRequest) o;
        return Objects.equals(
                        this.featureIdentifier, updateFeatureAssignmentsRequest.featureIdentifier)
                && Objects.equals(
                        this.orgIdentifiers, updateFeatureAssignmentsRequest.orgIdentifiers)
                && Objects.equals(this.operation, updateFeatureAssignmentsRequest.operation)
                && Objects.equals(
                        this.additionalProperties,
                        updateFeatureAssignmentsRequest.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(featureIdentifier, orgIdentifiers, operation, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFeatureAssignmentsRequest {\n");
        sb.append("    featureIdentifier: ")
                .append(toIndentedString(featureIdentifier))
                .append("\n");
        sb.append("    orgIdentifiers: ").append(toIndentedString(orgIdentifiers)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
        openapiFields.add("feature_identifier");
        openapiFields.add("org_identifiers");
        openapiFields.add("operation");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("feature_identifier");
        openapiRequiredFields.add("org_identifiers");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     UpdateFeatureAssignmentsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UpdateFeatureAssignmentsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateFeatureAssignmentsRequest is"
                                        + " not found in the empty JSON string",
                                UpdateFeatureAssignmentsRequest.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UpdateFeatureAssignmentsRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("feature_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `feature_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("feature_identifier").toString()));
        }
        // ensure the required json array is present
        if (jsonObj.get("org_identifiers") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("org_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `org_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("org_identifiers").toString()));
        }
        if ((jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull())
                && !jsonObj.get("operation").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `operation` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("operation").toString()));
        }
        // validate the optional field `operation`
        if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) {
            OperationEnum.validateJsonElement(jsonObj.get("operation"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateFeatureAssignmentsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateFeatureAssignmentsRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateFeatureAssignmentsRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(UpdateFeatureAssignmentsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateFeatureAssignmentsRequest>() {
                        @Override
                        public void write(JsonWriter out, UpdateFeatureAssignmentsRequest value)
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
                        public UpdateFeatureAssignmentsRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            UpdateFeatureAssignmentsRequest instance =
                                    thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of UpdateFeatureAssignmentsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateFeatureAssignmentsRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     UpdateFeatureAssignmentsRequest
     */
    public static UpdateFeatureAssignmentsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateFeatureAssignmentsRequest.class);
    }

    /**
     * Convert an instance of UpdateFeatureAssignmentsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
