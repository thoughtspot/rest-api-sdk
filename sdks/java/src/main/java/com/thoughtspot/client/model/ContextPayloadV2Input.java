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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** ContextPayloadV2Input */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ContextPayloadV2Input implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Type of the context. */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        ANSWER("answer"),

        LIVEBOARD("liveboard"),

        DATA_SOURCE("data_source");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<TypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            TypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @javax.annotation.Nullable
    private TypeEnum type;

    public static final String SERIALIZED_NAME_ANSWER_CONTEXT = "answer_context";

    @SerializedName(SERIALIZED_NAME_ANSWER_CONTEXT)
    @javax.annotation.Nullable
    private AnswerContextInput answerContext;

    public static final String SERIALIZED_NAME_LIVEBOARD_CONTEXT = "liveboard_context";

    @SerializedName(SERIALIZED_NAME_LIVEBOARD_CONTEXT)
    @javax.annotation.Nullable
    private LBContextInput liveboardContext;

    public static final String SERIALIZED_NAME_DATA_SOURCE_CONTEXT = "data_source_context";

    @SerializedName(SERIALIZED_NAME_DATA_SOURCE_CONTEXT)
    @javax.annotation.Nullable
    private DataSourceContextInput dataSourceContext;

    public ContextPayloadV2Input() {}

    public ContextPayloadV2Input type(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Type of the context.
     *
     * @return type
     */
    @javax.annotation.Nullable
    public TypeEnum getType() {
        return type;
    }

    public void setType(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
    }

    public ContextPayloadV2Input answerContext(
            @javax.annotation.Nullable AnswerContextInput answerContext) {
        this.answerContext = answerContext;
        return this;
    }

    /**
     * Get answerContext
     *
     * @return answerContext
     */
    @javax.annotation.Nullable
    public AnswerContextInput getAnswerContext() {
        return answerContext;
    }

    public void setAnswerContext(@javax.annotation.Nullable AnswerContextInput answerContext) {
        this.answerContext = answerContext;
    }

    public ContextPayloadV2Input liveboardContext(
            @javax.annotation.Nullable LBContextInput liveboardContext) {
        this.liveboardContext = liveboardContext;
        return this;
    }

    /**
     * Get liveboardContext
     *
     * @return liveboardContext
     */
    @javax.annotation.Nullable
    public LBContextInput getLiveboardContext() {
        return liveboardContext;
    }

    public void setLiveboardContext(@javax.annotation.Nullable LBContextInput liveboardContext) {
        this.liveboardContext = liveboardContext;
    }

    public ContextPayloadV2Input dataSourceContext(
            @javax.annotation.Nullable DataSourceContextInput dataSourceContext) {
        this.dataSourceContext = dataSourceContext;
        return this;
    }

    /**
     * Get dataSourceContext
     *
     * @return dataSourceContext
     */
    @javax.annotation.Nullable
    public DataSourceContextInput getDataSourceContext() {
        return dataSourceContext;
    }

    public void setDataSourceContext(
            @javax.annotation.Nullable DataSourceContextInput dataSourceContext) {
        this.dataSourceContext = dataSourceContext;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContextPayloadV2Input contextPayloadV2Input = (ContextPayloadV2Input) o;
        return Objects.equals(this.type, contextPayloadV2Input.type)
                && Objects.equals(this.answerContext, contextPayloadV2Input.answerContext)
                && Objects.equals(this.liveboardContext, contextPayloadV2Input.liveboardContext)
                && Objects.equals(this.dataSourceContext, contextPayloadV2Input.dataSourceContext);
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
        return Objects.hash(type, answerContext, liveboardContext, dataSourceContext);
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
        sb.append("class ContextPayloadV2Input {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    answerContext: ").append(toIndentedString(answerContext)).append("\n");
        sb.append("    liveboardContext: ").append(toIndentedString(liveboardContext)).append("\n");
        sb.append("    dataSourceContext: ")
                .append(toIndentedString(dataSourceContext))
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
        openapiFields.add("type");
        openapiFields.add("answer_context");
        openapiFields.add("liveboard_context");
        openapiFields.add("data_source_context");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ContextPayloadV2Input
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ContextPayloadV2Input.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ContextPayloadV2Input is not found in"
                                        + " the empty JSON string",
                                ContextPayloadV2Input.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ContextPayloadV2Input.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ContextPayloadV2Input` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull())
                && !jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
        // validate the optional field `type`
        if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
            TypeEnum.validateJsonElement(jsonObj.get("type"));
        }
        // validate the optional field `answer_context`
        if (jsonObj.get("answer_context") != null && !jsonObj.get("answer_context").isJsonNull()) {
            AnswerContextInput.validateJsonElement(jsonObj.get("answer_context"));
        }
        // validate the optional field `liveboard_context`
        if (jsonObj.get("liveboard_context") != null
                && !jsonObj.get("liveboard_context").isJsonNull()) {
            LBContextInput.validateJsonElement(jsonObj.get("liveboard_context"));
        }
        // validate the optional field `data_source_context`
        if (jsonObj.get("data_source_context") != null
                && !jsonObj.get("data_source_context").isJsonNull()) {
            DataSourceContextInput.validateJsonElement(jsonObj.get("data_source_context"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ContextPayloadV2Input.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ContextPayloadV2Input' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ContextPayloadV2Input> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ContextPayloadV2Input.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ContextPayloadV2Input>() {
                        @Override
                        public void write(JsonWriter out, ContextPayloadV2Input value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ContextPayloadV2Input read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ContextPayloadV2Input given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ContextPayloadV2Input
     * @throws IOException if the JSON string is invalid with respect to ContextPayloadV2Input
     */
    public static ContextPayloadV2Input fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ContextPayloadV2Input.class);
    }

    /**
     * Convert an instance of ContextPayloadV2Input to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
