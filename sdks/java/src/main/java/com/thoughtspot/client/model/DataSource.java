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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** DataSource */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DataSource implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";

    @SerializedName(SERIALIZED_NAME_CONFIDENCE)
    @javax.annotation.Nullable
    private Float confidence;

    public static final String SERIALIZED_NAME_DETAILS = "details";

    @SerializedName(SERIALIZED_NAME_DETAILS)
    @javax.annotation.Nullable
    private EntityHeader details;

    public static final String SERIALIZED_NAME_REASONING = "reasoning";

    @SerializedName(SERIALIZED_NAME_REASONING)
    @javax.annotation.Nullable
    private String reasoning;

    public DataSource() {}

    public DataSource confidence(@javax.annotation.Nullable Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Confidence score for the data source suggestion.
     *
     * @return confidence
     */
    @javax.annotation.Nullable
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(@javax.annotation.Nullable Float confidence) {
        this.confidence = confidence;
    }

    public DataSource details(@javax.annotation.Nullable EntityHeader details) {
        this.details = details;
        return this;
    }

    /**
     * Get details
     *
     * @return details
     */
    @javax.annotation.Nullable
    public EntityHeader getDetails() {
        return details;
    }

    public void setDetails(@javax.annotation.Nullable EntityHeader details) {
        this.details = details;
    }

    public DataSource reasoning(@javax.annotation.Nullable String reasoning) {
        this.reasoning = reasoning;
        return this;
    }

    /**
     * LLM reasoning for the data source.
     *
     * @return reasoning
     */
    @javax.annotation.Nullable
    public String getReasoning() {
        return reasoning;
    }

    public void setReasoning(@javax.annotation.Nullable String reasoning) {
        this.reasoning = reasoning;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataSource dataSource = (DataSource) o;
        return Objects.equals(this.confidence, dataSource.confidence)
                && Objects.equals(this.details, dataSource.details)
                && Objects.equals(this.reasoning, dataSource.reasoning);
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
        return Objects.hash(confidence, details, reasoning);
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
        sb.append("class DataSource {\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
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
        openapiFields.add("confidence");
        openapiFields.add("details");
        openapiFields.add("reasoning");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to DataSource
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DataSource.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DataSource is not found in the empty"
                                        + " JSON string",
                                DataSource.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!DataSource.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `DataSource` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the optional field `details`
        if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
            EntityHeader.validateJsonElement(jsonObj.get("details"));
        }
        if ((jsonObj.get("reasoning") != null && !jsonObj.get("reasoning").isJsonNull())
                && !jsonObj.get("reasoning").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `reasoning` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("reasoning").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DataSource.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DataSource' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DataSource> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(DataSource.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DataSource>() {
                        @Override
                        public void write(JsonWriter out, DataSource value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DataSource read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DataSource given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DataSource
     * @throws IOException if the JSON string is invalid with respect to DataSource
     */
    public static DataSource fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DataSource.class);
    }

    /**
     * Convert an instance of DataSource to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
