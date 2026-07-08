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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Response object for a semantic integration. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SemanticIntegrationResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nullable
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nullable
    private String name;

    public static final String SERIALIZED_NAME_MODEL_ID = "model_id";

    @SerializedName(SERIALIZED_NAME_MODEL_ID)
    @javax.annotation.Nullable
    private String modelId;

    public static final String SERIALIZED_NAME_MODEL_NAME = "model_name";

    @SerializedName(SERIALIZED_NAME_MODEL_NAME)
    @javax.annotation.Nullable
    private String modelName;

    public static final String SERIALIZED_NAME_SEMANTIC_REPORT = "semantic_report";

    @SerializedName(SERIALIZED_NAME_SEMANTIC_REPORT)
    @javax.annotation.Nullable
    private SemanticIntegrationReport semanticReport;

    public SemanticIntegrationResponse() {}

    public SemanticIntegrationResponse id(@javax.annotation.Nullable String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the semantic integration.
     *
     * @return id
     */
    @javax.annotation.Nullable
    public String getId() {
        return id;
    }

    public void setId(@javax.annotation.Nullable String id) {
        this.id = id;
    }

    public SemanticIntegrationResponse name(@javax.annotation.Nullable String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the semantic integration.
     *
     * @return name
     */
    @javax.annotation.Nullable
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nullable String name) {
        this.name = name;
    }

    public SemanticIntegrationResponse modelId(@javax.annotation.Nullable String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Model GUID generated for this integration.
     *
     * @return modelId
     */
    @javax.annotation.Nullable
    public String getModelId() {
        return modelId;
    }

    public void setModelId(@javax.annotation.Nullable String modelId) {
        this.modelId = modelId;
    }

    public SemanticIntegrationResponse modelName(@javax.annotation.Nullable String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * Model name generated for this integration.
     *
     * @return modelName
     */
    @javax.annotation.Nullable
    public String getModelName() {
        return modelName;
    }

    public void setModelName(@javax.annotation.Nullable String modelName) {
        this.modelName = modelName;
    }

    public SemanticIntegrationResponse semanticReport(
            @javax.annotation.Nullable SemanticIntegrationReport semanticReport) {
        this.semanticReport = semanticReport;
        return this;
    }

    /**
     * Get semanticReport
     *
     * @return semanticReport
     */
    @javax.annotation.Nullable
    public SemanticIntegrationReport getSemanticReport() {
        return semanticReport;
    }

    public void setSemanticReport(
            @javax.annotation.Nullable SemanticIntegrationReport semanticReport) {
        this.semanticReport = semanticReport;
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
     * @return the SemanticIntegrationResponse instance itself
     */
    public SemanticIntegrationResponse putAdditionalProperty(String key, Object value) {
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
        SemanticIntegrationResponse semanticIntegrationResponse = (SemanticIntegrationResponse) o;
        return Objects.equals(this.id, semanticIntegrationResponse.id)
                && Objects.equals(this.name, semanticIntegrationResponse.name)
                && Objects.equals(this.modelId, semanticIntegrationResponse.modelId)
                && Objects.equals(this.modelName, semanticIntegrationResponse.modelName)
                && Objects.equals(this.semanticReport, semanticIntegrationResponse.semanticReport)
                && Objects.equals(
                        this.additionalProperties,
                        semanticIntegrationResponse.additionalProperties);
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
        return Objects.hash(id, name, modelId, modelName, semanticReport, additionalProperties);
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
        sb.append("class SemanticIntegrationResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
        sb.append("    semanticReport: ").append(toIndentedString(semanticReport)).append("\n");
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
        openapiFields.add("id");
        openapiFields.add("name");
        openapiFields.add("model_id");
        openapiFields.add("model_name");
        openapiFields.add("semantic_report");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     SemanticIntegrationResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SemanticIntegrationResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SemanticIntegrationResponse is not"
                                        + " found in the empty JSON string",
                                SemanticIntegrationResponse.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull())
                && !jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
        }
        if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
                && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if ((jsonObj.get("model_id") != null && !jsonObj.get("model_id").isJsonNull())
                && !jsonObj.get("model_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `model_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("model_id").toString()));
        }
        if ((jsonObj.get("model_name") != null && !jsonObj.get("model_name").isJsonNull())
                && !jsonObj.get("model_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `model_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("model_name").toString()));
        }
        // validate the optional field `semantic_report`
        if (jsonObj.get("semantic_report") != null
                && !jsonObj.get("semantic_report").isJsonNull()) {
            SemanticIntegrationReport.validateJsonElement(jsonObj.get("semantic_report"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SemanticIntegrationResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SemanticIntegrationResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SemanticIntegrationResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SemanticIntegrationResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SemanticIntegrationResponse>() {
                        @Override
                        public void write(JsonWriter out, SemanticIntegrationResponse value)
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
                        public SemanticIntegrationResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            SemanticIntegrationResponse instance =
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
     * Create an instance of SemanticIntegrationResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SemanticIntegrationResponse
     * @throws IOException if the JSON string is invalid with respect to SemanticIntegrationResponse
     */
    public static SemanticIntegrationResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SemanticIntegrationResponse.class);
    }

    /**
     * Convert an instance of SemanticIntegrationResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
