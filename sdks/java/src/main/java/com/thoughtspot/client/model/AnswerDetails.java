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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** AnswerDetails */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AnswerDetails implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TITLE = "title";

    @SerializedName(SERIALIZED_NAME_TITLE)
    @javax.annotation.Nullable
    private String title;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nullable
    private String description;

    public static final String SERIALIZED_NAME_SESSION_IDENTIFIER = "session_identifier";

    @SerializedName(SERIALIZED_NAME_SESSION_IDENTIFIER)
    @javax.annotation.Nullable
    private String sessionIdentifier;

    public static final String SERIALIZED_NAME_GENERATION_NUMBER = "generation_number";

    @SerializedName(SERIALIZED_NAME_GENERATION_NUMBER)
    @javax.annotation.Nullable
    private Integer generationNumber;

    public static final String SERIALIZED_NAME_TOKENS = "tokens";

    @SerializedName(SERIALIZED_NAME_TOKENS)
    @javax.annotation.Nullable
    private List<String> tokens;

    /** Visualization type for the answer. */
    @JsonAdapter(VisualizationTypeEnum.Adapter.class)
    public enum VisualizationTypeEnum {
        CHART("Chart"),

        CHART2("CHART"),

        TABLE("Table"),

        TABLE2("TABLE"),

        UNDEFINED("Undefined"),

        UNDEFINED2("UNDEFINED");

        private String value;

        VisualizationTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static VisualizationTypeEnum fromValue(String value) {
            for (VisualizationTypeEnum b : VisualizationTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<VisualizationTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final VisualizationTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public VisualizationTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return VisualizationTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            VisualizationTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_VISUALIZATION_TYPE = "visualization_type";

    @SerializedName(SERIALIZED_NAME_VISUALIZATION_TYPE)
    @javax.annotation.Nullable
    private VisualizationTypeEnum visualizationType;

    public static final String SERIALIZED_NAME_FORMULAS = "formulas";

    @SerializedName(SERIALIZED_NAME_FORMULAS)
    @javax.annotation.Nullable
    private List<String> formulas;

    public static final String SERIALIZED_NAME_PARAMETERS = "parameters";

    @SerializedName(SERIALIZED_NAME_PARAMETERS)
    @javax.annotation.Nullable
    private List<String> parameters;

    public static final String SERIALIZED_NAME_SUB_QUERIES = "sub_queries";

    @SerializedName(SERIALIZED_NAME_SUB_QUERIES)
    @javax.annotation.Nullable
    private List<Object> subQueries;

    public static final String SERIALIZED_NAME_AC_STATE = "ac_state";

    @SerializedName(SERIALIZED_NAME_AC_STATE)
    @javax.annotation.Nullable
    private ACState acState;

    public AnswerDetails() {}

    public AnswerDetails title(@javax.annotation.Nullable String title) {
        this.title = title;
        return this;
    }

    /**
     * Display title of the answer.
     *
     * @return title
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return title;
    }

    public void setTitle(@javax.annotation.Nullable String title) {
        this.title = title;
    }

    public AnswerDetails description(@javax.annotation.Nullable String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the answer.
     *
     * @return description
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@javax.annotation.Nullable String description) {
        this.description = description;
    }

    public AnswerDetails sessionIdentifier(@javax.annotation.Nullable String sessionIdentifier) {
        this.sessionIdentifier = sessionIdentifier;
        return this;
    }

    /**
     * Unique identifier of the session.
     *
     * @return sessionIdentifier
     */
    @javax.annotation.Nullable
    public String getSessionIdentifier() {
        return sessionIdentifier;
    }

    public void setSessionIdentifier(@javax.annotation.Nullable String sessionIdentifier) {
        this.sessionIdentifier = sessionIdentifier;
    }

    public AnswerDetails generationNumber(@javax.annotation.Nullable Integer generationNumber) {
        this.generationNumber = generationNumber;
        return this;
    }

    /**
     * Generation number of the answer.
     *
     * @return generationNumber
     */
    @javax.annotation.Nullable
    public Integer getGenerationNumber() {
        return generationNumber;
    }

    public void setGenerationNumber(@javax.annotation.Nullable Integer generationNumber) {
        this.generationNumber = generationNumber;
    }

    public AnswerDetails tokens(@javax.annotation.Nullable List<String> tokens) {
        this.tokens = tokens;
        return this;
    }

    public AnswerDetails addTokensItem(String tokensItem) {
        if (this.tokens == null) {
            this.tokens = new ArrayList<>();
        }
        this.tokens.add(tokensItem);
        return this;
    }

    /**
     * Ordered list of TML token strings that make up the answer query.
     *
     * @return tokens
     */
    @javax.annotation.Nullable
    public List<String> getTokens() {
        return tokens;
    }

    public void setTokens(@javax.annotation.Nullable List<String> tokens) {
        this.tokens = tokens;
    }

    public AnswerDetails visualizationType(
            @javax.annotation.Nullable VisualizationTypeEnum visualizationType) {
        this.visualizationType = visualizationType;
        return this;
    }

    /**
     * Visualization type for the answer.
     *
     * @return visualizationType
     */
    @javax.annotation.Nullable
    public VisualizationTypeEnum getVisualizationType() {
        return visualizationType;
    }

    public void setVisualizationType(
            @javax.annotation.Nullable VisualizationTypeEnum visualizationType) {
        this.visualizationType = visualizationType;
    }

    public AnswerDetails formulas(@javax.annotation.Nullable List<String> formulas) {
        this.formulas = formulas;
        return this;
    }

    public AnswerDetails addFormulasItem(String formulasItem) {
        if (this.formulas == null) {
            this.formulas = new ArrayList<>();
        }
        this.formulas.add(formulasItem);
        return this;
    }

    /**
     * List of formulas used in the answer.
     *
     * @return formulas
     */
    @javax.annotation.Nullable
    public List<String> getFormulas() {
        return formulas;
    }

    public void setFormulas(@javax.annotation.Nullable List<String> formulas) {
        this.formulas = formulas;
    }

    public AnswerDetails parameters(@javax.annotation.Nullable List<String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public AnswerDetails addParametersItem(String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
     * List of parameters used in the answer.
     *
     * @return parameters
     */
    @javax.annotation.Nullable
    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(@javax.annotation.Nullable List<String> parameters) {
        this.parameters = parameters;
    }

    public AnswerDetails subQueries(@javax.annotation.Nullable List<Object> subQueries) {
        this.subQueries = subQueries;
        return this;
    }

    public AnswerDetails addSubQueriesItem(Object subQueriesItem) {
        if (this.subQueries == null) {
            this.subQueries = new ArrayList<>();
        }
        this.subQueries.add(subQueriesItem);
        return this;
    }

    /**
     * List of sub-queries used in the answer.
     *
     * @return subQueries
     */
    @javax.annotation.Nullable
    public List<Object> getSubQueries() {
        return subQueries;
    }

    public void setSubQueries(@javax.annotation.Nullable List<Object> subQueries) {
        this.subQueries = subQueries;
    }

    public AnswerDetails acState(@javax.annotation.Nullable ACState acState) {
        this.acState = acState;
        return this;
    }

    /**
     * Get acState
     *
     * @return acState
     */
    @javax.annotation.Nullable
    public ACState getAcState() {
        return acState;
    }

    public void setAcState(@javax.annotation.Nullable ACState acState) {
        this.acState = acState;
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
     * @return the AnswerDetails instance itself
     */
    public AnswerDetails putAdditionalProperty(String key, Object value) {
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
        AnswerDetails answerDetails = (AnswerDetails) o;
        return Objects.equals(this.title, answerDetails.title)
                && Objects.equals(this.description, answerDetails.description)
                && Objects.equals(this.sessionIdentifier, answerDetails.sessionIdentifier)
                && Objects.equals(this.generationNumber, answerDetails.generationNumber)
                && Objects.equals(this.tokens, answerDetails.tokens)
                && Objects.equals(this.visualizationType, answerDetails.visualizationType)
                && Objects.equals(this.formulas, answerDetails.formulas)
                && Objects.equals(this.parameters, answerDetails.parameters)
                && Objects.equals(this.subQueries, answerDetails.subQueries)
                && Objects.equals(this.acState, answerDetails.acState)
                && Objects.equals(this.additionalProperties, answerDetails.additionalProperties);
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
                title,
                description,
                sessionIdentifier,
                generationNumber,
                tokens,
                visualizationType,
                formulas,
                parameters,
                subQueries,
                acState,
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
        sb.append("class AnswerDetails {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sessionIdentifier: ")
                .append(toIndentedString(sessionIdentifier))
                .append("\n");
        sb.append("    generationNumber: ").append(toIndentedString(generationNumber)).append("\n");
        sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
        sb.append("    visualizationType: ")
                .append(toIndentedString(visualizationType))
                .append("\n");
        sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    subQueries: ").append(toIndentedString(subQueries)).append("\n");
        sb.append("    acState: ").append(toIndentedString(acState)).append("\n");
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
        openapiFields.add("title");
        openapiFields.add("description");
        openapiFields.add("session_identifier");
        openapiFields.add("generation_number");
        openapiFields.add("tokens");
        openapiFields.add("visualization_type");
        openapiFields.add("formulas");
        openapiFields.add("parameters");
        openapiFields.add("sub_queries");
        openapiFields.add("ac_state");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AnswerDetails
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AnswerDetails.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AnswerDetails is not found in the"
                                        + " empty JSON string",
                                AnswerDetails.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull())
                && !jsonObj.get("title").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `title` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("title").toString()));
        }
        if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
                && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("description").toString()));
        }
        if ((jsonObj.get("session_identifier") != null
                        && !jsonObj.get("session_identifier").isJsonNull())
                && !jsonObj.get("session_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `session_identifier` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("session_identifier").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("tokens") != null
                && !jsonObj.get("tokens").isJsonNull()
                && !jsonObj.get("tokens").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `tokens` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("tokens").toString()));
        }
        if ((jsonObj.get("visualization_type") != null
                        && !jsonObj.get("visualization_type").isJsonNull())
                && !jsonObj.get("visualization_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `visualization_type` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("visualization_type").toString()));
        }
        // validate the optional field `visualization_type`
        if (jsonObj.get("visualization_type") != null
                && !jsonObj.get("visualization_type").isJsonNull()) {
            VisualizationTypeEnum.validateJsonElement(jsonObj.get("visualization_type"));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("formulas") != null
                && !jsonObj.get("formulas").isJsonNull()
                && !jsonObj.get("formulas").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `formulas` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("formulas").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("parameters") != null
                && !jsonObj.get("parameters").isJsonNull()
                && !jsonObj.get("parameters").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `parameters` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("parameters").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("sub_queries") != null
                && !jsonObj.get("sub_queries").isJsonNull()
                && !jsonObj.get("sub_queries").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `sub_queries` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("sub_queries").toString()));
        }
        // validate the optional field `ac_state`
        if (jsonObj.get("ac_state") != null && !jsonObj.get("ac_state").isJsonNull()) {
            ACState.validateJsonElement(jsonObj.get("ac_state"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AnswerDetails.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AnswerDetails' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AnswerDetails> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AnswerDetails.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AnswerDetails>() {
                        @Override
                        public void write(JsonWriter out, AnswerDetails value) throws IOException {
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
                        public AnswerDetails read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            AnswerDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of AnswerDetails given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AnswerDetails
     * @throws IOException if the JSON string is invalid with respect to AnswerDetails
     */
    public static AnswerDetails fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AnswerDetails.class);
    }

    /**
     * Convert an instance of AnswerDetails to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
