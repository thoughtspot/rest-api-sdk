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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

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
                this.decomposedQueryResponse, eurekaDecomposeQueryResponse.decomposedQueryResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(decomposedQueryResponse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EurekaDecomposeQueryResponse {\n");
        sb.append("    decomposedQueryResponse: ")
                .append(toIndentedString(decomposedQueryResponse))
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

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!EurekaDecomposeQueryResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `EurekaDecomposeQueryResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
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
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public EurekaDecomposeQueryResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
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
