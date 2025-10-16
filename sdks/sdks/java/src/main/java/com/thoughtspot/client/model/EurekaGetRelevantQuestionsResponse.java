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

/** EurekaGetRelevantQuestionsResponse */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class EurekaGetRelevantQuestionsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_RELEVANT_QUESTIONS = "relevant_questions";

    @SerializedName(SERIALIZED_NAME_RELEVANT_QUESTIONS)
    @javax.annotation.Nullable
    private List<EurekaRelevantQuestion> relevantQuestions;

    public EurekaGetRelevantQuestionsResponse() {}

    public EurekaGetRelevantQuestionsResponse relevantQuestions(
            @javax.annotation.Nullable List<EurekaRelevantQuestion> relevantQuestions) {
        this.relevantQuestions = relevantQuestions;
        return this;
    }

    public EurekaGetRelevantQuestionsResponse addRelevantQuestionsItem(
            EurekaRelevantQuestion relevantQuestionsItem) {
        if (this.relevantQuestions == null) {
            this.relevantQuestions = new ArrayList<>();
        }
        this.relevantQuestions.add(relevantQuestionsItem);
        return this;
    }

    /**
     * List of relevant questions that can be run on their respective data sources.
     *
     * @return relevantQuestions
     */
    @javax.annotation.Nullable
    public List<EurekaRelevantQuestion> getRelevantQuestions() {
        return relevantQuestions;
    }

    public void setRelevantQuestions(
            @javax.annotation.Nullable List<EurekaRelevantQuestion> relevantQuestions) {
        this.relevantQuestions = relevantQuestions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EurekaGetRelevantQuestionsResponse eurekaGetRelevantQuestionsResponse =
                (EurekaGetRelevantQuestionsResponse) o;
        return Objects.equals(
                this.relevantQuestions, eurekaGetRelevantQuestionsResponse.relevantQuestions);
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
        return Objects.hash(relevantQuestions);
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
        sb.append("class EurekaGetRelevantQuestionsResponse {\n");
        sb.append("    relevantQuestions: ")
                .append(toIndentedString(relevantQuestions))
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
        openapiFields.add("relevant_questions");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     EurekaGetRelevantQuestionsResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!EurekaGetRelevantQuestionsResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in EurekaGetRelevantQuestionsResponse is"
                                        + " not found in the empty JSON string",
                                EurekaGetRelevantQuestionsResponse.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!EurekaGetRelevantQuestionsResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `EurekaGetRelevantQuestionsResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (jsonObj.get("relevant_questions") != null
                && !jsonObj.get("relevant_questions").isJsonNull()) {
            JsonArray jsonArrayrelevantQuestions = jsonObj.getAsJsonArray("relevant_questions");
            if (jsonArrayrelevantQuestions != null) {
                // ensure the json data is an array
                if (!jsonObj.get("relevant_questions").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `relevant_questions` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("relevant_questions").toString()));
                }

                // validate the optional field `relevant_questions` (array)
                for (int i = 0; i < jsonArrayrelevantQuestions.size(); i++) {
                    EurekaRelevantQuestion.validateJsonElement(jsonArrayrelevantQuestions.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EurekaGetRelevantQuestionsResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'EurekaGetRelevantQuestionsResponse' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EurekaGetRelevantQuestionsResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(EurekaGetRelevantQuestionsResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<EurekaGetRelevantQuestionsResponse>() {
                        @Override
                        public void write(JsonWriter out, EurekaGetRelevantQuestionsResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public EurekaGetRelevantQuestionsResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of EurekaGetRelevantQuestionsResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of EurekaGetRelevantQuestionsResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     EurekaGetRelevantQuestionsResponse
     */
    public static EurekaGetRelevantQuestionsResponse fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, EurekaGetRelevantQuestionsResponse.class);
    }

    /**
     * Convert an instance of EurekaGetRelevantQuestionsResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
