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

/** EurekaDecomposeQueryResponse */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class EurekaDecomposeQueryResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DECOMPOSED_QUERY_RESPONSE =
            "decomposedQueryResponse";

    @SerializedName(SERIALIZED_NAME_DECOMPOSED_QUERY_RESPONSE)
    @javax.annotation.Nullable
    private EurekaLLMDecomposeQueryResponse decomposedQueryResponse;

    public EurekaDecomposeQueryResponse() {}

    public EurekaDecomposeQueryResponse decomposedQueryResponse(
            @javax.annotation.Nullable EurekaLLMDecomposeQueryResponse decomposedQueryResponse) {
        this.decomposedQueryResponse = decomposedQueryResponse;
        return this;
    }

    /**
     * Get decomposedQueryResponse
     *
     * @return decomposedQueryResponse
     */
    @javax.annotation.Nullable
    public EurekaLLMDecomposeQueryResponse getDecomposedQueryResponse() {
        return decomposedQueryResponse;
    }

    public void setDecomposedQueryResponse(
            @javax.annotation.Nullable EurekaLLMDecomposeQueryResponse decomposedQueryResponse) {
        this.decomposedQueryResponse = decomposedQueryResponse;
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
     * @return the EurekaDecomposeQueryResponse instance itself
     */
    public EurekaDecomposeQueryResponse putAdditionalProperty(String key, Object value) {
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
        EurekaDecomposeQueryResponse eurekaDecomposeQueryResponse =
                (EurekaDecomposeQueryResponse) o;
        return Objects.equals(
                        this.decomposedQueryResponse,
                        eurekaDecomposeQueryResponse.decomposedQueryResponse)
                && Objects.equals(
                        this.additionalProperties,
                        eurekaDecomposeQueryResponse.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(decomposedQueryResponse, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EurekaDecomposeQueryResponse {\n");
        sb.append("    decomposedQueryResponse: ")
                .append(toIndentedString(decomposedQueryResponse))
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
        openapiFields.add("decomposedQueryResponse");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     EurekaDecomposeQueryResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!EurekaDecomposeQueryResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in EurekaDecomposeQueryResponse is not"
                                        + " found in the empty JSON string",
                                EurekaDecomposeQueryResponse.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the optional field `decomposedQueryResponse`
        if (jsonObj.get("decomposedQueryResponse") != null
                && !jsonObj.get("decomposedQueryResponse").isJsonNull()) {
            EurekaLLMDecomposeQueryResponse.validateJsonElement(
                    jsonObj.get("decomposedQueryResponse"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EurekaDecomposeQueryResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'EurekaDecomposeQueryResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EurekaDecomposeQueryResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(EurekaDecomposeQueryResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<EurekaDecomposeQueryResponse>() {
                        @Override
                        public void write(JsonWriter out, EurekaDecomposeQueryResponse value)
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
                        public EurekaDecomposeQueryResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            EurekaDecomposeQueryResponse instance =
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
     * Create an instance of EurekaDecomposeQueryResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of EurekaDecomposeQueryResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     EurekaDecomposeQueryResponse
     */
    public static EurekaDecomposeQueryResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, EurekaDecomposeQueryResponse.class);
    }

    /**
     * Convert an instance of EurekaDecomposeQueryResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
