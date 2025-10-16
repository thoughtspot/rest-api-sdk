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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** EurekaLLMDecomposeQueryResponse */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class EurekaLLMDecomposeQueryResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DECOMPOSED_QUERIES = "decomposedQueries";

    @SerializedName(SERIALIZED_NAME_DECOMPOSED_QUERIES)
    @javax.annotation.Nullable
    private List<EurekaLLMSuggestedQuery> decomposedQueries;

    public EurekaLLMDecomposeQueryResponse() {}

    public EurekaLLMDecomposeQueryResponse decomposedQueries(
            @javax.annotation.Nullable List<EurekaLLMSuggestedQuery> decomposedQueries) {
        this.decomposedQueries = decomposedQueries;
        return this;
    }

    public EurekaLLMDecomposeQueryResponse addDecomposedQueriesItem(
            EurekaLLMSuggestedQuery decomposedQueriesItem) {
        if (this.decomposedQueries == null) {
            this.decomposedQueries = new ArrayList<>();
        }
        this.decomposedQueries.add(decomposedQueriesItem);
        return this;
    }

    /**
     * List of analytical questions that can be run on their respective worksheet/data sources.
     *
     * @return decomposedQueries
     */
    @javax.annotation.Nullable
    public List<EurekaLLMSuggestedQuery> getDecomposedQueries() {
        return decomposedQueries;
    }

    public void setDecomposedQueries(
            @javax.annotation.Nullable List<EurekaLLMSuggestedQuery> decomposedQueries) {
        this.decomposedQueries = decomposedQueries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EurekaLLMDecomposeQueryResponse eurekaLLMDecomposeQueryResponse =
                (EurekaLLMDecomposeQueryResponse) o;
        return Objects.equals(
                this.decomposedQueries, eurekaLLMDecomposeQueryResponse.decomposedQueries);
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
        return Objects.hash(decomposedQueries);
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
        sb.append("class EurekaLLMDecomposeQueryResponse {\n");
        sb.append("    decomposedQueries: ")
                .append(toIndentedString(decomposedQueries))
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
        openapiFields.add("decomposedQueries");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     EurekaLLMDecomposeQueryResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!EurekaLLMDecomposeQueryResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in EurekaLLMDecomposeQueryResponse is"
                                        + " not found in the empty JSON string",
                                EurekaLLMDecomposeQueryResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!EurekaLLMDecomposeQueryResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `EurekaLLMDecomposeQueryResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (jsonObj.get("decomposedQueries") != null
                && !jsonObj.get("decomposedQueries").isJsonNull()) {
            JsonArray jsonArraydecomposedQueries = jsonObj.getAsJsonArray("decomposedQueries");
            if (jsonArraydecomposedQueries != null) {
                // ensure the json data is an array
                if (!jsonObj.get("decomposedQueries").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `decomposedQueries` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("decomposedQueries").toString()));
                }

                // validate the optional field `decomposedQueries` (array)
                for (int i = 0; i < jsonArraydecomposedQueries.size(); i++) {
                    EurekaLLMSuggestedQuery.validateJsonElement(jsonArraydecomposedQueries.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EurekaLLMDecomposeQueryResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'EurekaLLMDecomposeQueryResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EurekaLLMDecomposeQueryResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(EurekaLLMDecomposeQueryResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<EurekaLLMDecomposeQueryResponse>() {
                        @Override
                        public void write(JsonWriter out, EurekaLLMDecomposeQueryResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public EurekaLLMDecomposeQueryResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of EurekaLLMDecomposeQueryResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of EurekaLLMDecomposeQueryResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     EurekaLLMDecomposeQueryResponse
     */
    public static EurekaLLMDecomposeQueryResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, EurekaLLMDecomposeQueryResponse.class);
    }

    /**
     * Convert an instance of EurekaLLMDecomposeQueryResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
