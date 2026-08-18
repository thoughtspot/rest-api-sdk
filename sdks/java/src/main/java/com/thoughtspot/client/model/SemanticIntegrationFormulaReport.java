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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Import details for a single formula. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SemanticIntegrationFormulaReport implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nullable
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nullable
    private String name;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nullable
    private String description;

    public static final String SERIALIZED_NAME_SOURCE_EXPRESSION = "source_expression";

    @SerializedName(SERIALIZED_NAME_SOURCE_EXPRESSION)
    @javax.annotation.Nullable
    private String sourceExpression;

    public static final String SERIALIZED_NAME_TRANSLATED_FORMULA = "translated_formula";

    @SerializedName(SERIALIZED_NAME_TRANSLATED_FORMULA)
    @javax.annotation.Nullable
    private String translatedFormula;

    /** Import status. */
    @JsonAdapter(ImportStatusEnum.Adapter.class)
    public enum ImportStatusEnum {
        IMPORTED("IMPORTED"),

        FAILED("FAILED"),

        SKIPPED("SKIPPED");

        private String value;

        ImportStatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ImportStatusEnum fromValue(String value) {
            for (ImportStatusEnum b : ImportStatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ImportStatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ImportStatusEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ImportStatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ImportStatusEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ImportStatusEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_IMPORT_STATUS = "import_status";

    @SerializedName(SERIALIZED_NAME_IMPORT_STATUS)
    @javax.annotation.Nullable
    private ImportStatusEnum importStatus;

    /** Change status since last import. Null on initial create. */
    @JsonAdapter(ChangeStatusEnum.Adapter.class)
    public enum ChangeStatusEnum {
        NEW("NEW"),

        UPDATED("UPDATED"),

        UNCHANGED("UNCHANGED");

        private String value;

        ChangeStatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ChangeStatusEnum fromValue(String value) {
            for (ChangeStatusEnum b : ChangeStatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ChangeStatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ChangeStatusEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ChangeStatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ChangeStatusEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ChangeStatusEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_CHANGE_STATUS = "change_status";

    @SerializedName(SERIALIZED_NAME_CHANGE_STATUS)
    @javax.annotation.Nullable
    private ChangeStatusEnum changeStatus;

    public SemanticIntegrationFormulaReport() {}

    public SemanticIntegrationFormulaReport id(@javax.annotation.Nullable String id) {
        this.id = id;
        return this;
    }

    /**
     * Formula ID in the model.
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

    public SemanticIntegrationFormulaReport name(@javax.annotation.Nullable String name) {
        this.name = name;
        return this;
    }

    /**
     * Formula name.
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

    public SemanticIntegrationFormulaReport description(
            @javax.annotation.Nullable String description) {
        this.description = description;
        return this;
    }

    /**
     * Formula description.
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

    public SemanticIntegrationFormulaReport sourceExpression(
            @javax.annotation.Nullable String sourceExpression) {
        this.sourceExpression = sourceExpression;
        return this;
    }

    /**
     * CDW source expression.
     *
     * @return sourceExpression
     */
    @javax.annotation.Nullable
    public String getSourceExpression() {
        return sourceExpression;
    }

    public void setSourceExpression(@javax.annotation.Nullable String sourceExpression) {
        this.sourceExpression = sourceExpression;
    }

    public SemanticIntegrationFormulaReport translatedFormula(
            @javax.annotation.Nullable String translatedFormula) {
        this.translatedFormula = translatedFormula;
        return this;
    }

    /**
     * ThoughtSpot formula equivalent.
     *
     * @return translatedFormula
     */
    @javax.annotation.Nullable
    public String getTranslatedFormula() {
        return translatedFormula;
    }

    public void setTranslatedFormula(@javax.annotation.Nullable String translatedFormula) {
        this.translatedFormula = translatedFormula;
    }

    public SemanticIntegrationFormulaReport importStatus(
            @javax.annotation.Nullable ImportStatusEnum importStatus) {
        this.importStatus = importStatus;
        return this;
    }

    /**
     * Import status.
     *
     * @return importStatus
     */
    @javax.annotation.Nullable
    public ImportStatusEnum getImportStatus() {
        return importStatus;
    }

    public void setImportStatus(@javax.annotation.Nullable ImportStatusEnum importStatus) {
        this.importStatus = importStatus;
    }

    public SemanticIntegrationFormulaReport changeStatus(
            @javax.annotation.Nullable ChangeStatusEnum changeStatus) {
        this.changeStatus = changeStatus;
        return this;
    }

    /**
     * Change status since last import. Null on initial create.
     *
     * @return changeStatus
     */
    @javax.annotation.Nullable
    public ChangeStatusEnum getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(@javax.annotation.Nullable ChangeStatusEnum changeStatus) {
        this.changeStatus = changeStatus;
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
     * @return the SemanticIntegrationFormulaReport instance itself
     */
    public SemanticIntegrationFormulaReport putAdditionalProperty(String key, Object value) {
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
        SemanticIntegrationFormulaReport semanticIntegrationFormulaReport =
                (SemanticIntegrationFormulaReport) o;
        return Objects.equals(this.id, semanticIntegrationFormulaReport.id)
                && Objects.equals(this.name, semanticIntegrationFormulaReport.name)
                && Objects.equals(this.description, semanticIntegrationFormulaReport.description)
                && Objects.equals(
                        this.sourceExpression, semanticIntegrationFormulaReport.sourceExpression)
                && Objects.equals(
                        this.translatedFormula, semanticIntegrationFormulaReport.translatedFormula)
                && Objects.equals(this.importStatus, semanticIntegrationFormulaReport.importStatus)
                && Objects.equals(this.changeStatus, semanticIntegrationFormulaReport.changeStatus)
                && Objects.equals(
                        this.additionalProperties,
                        semanticIntegrationFormulaReport.additionalProperties);
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
                id,
                name,
                description,
                sourceExpression,
                translatedFormula,
                importStatus,
                changeStatus,
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
        sb.append("class SemanticIntegrationFormulaReport {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sourceExpression: ").append(toIndentedString(sourceExpression)).append("\n");
        sb.append("    translatedFormula: ")
                .append(toIndentedString(translatedFormula))
                .append("\n");
        sb.append("    importStatus: ").append(toIndentedString(importStatus)).append("\n");
        sb.append("    changeStatus: ").append(toIndentedString(changeStatus)).append("\n");
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
        openapiFields.add("description");
        openapiFields.add("source_expression");
        openapiFields.add("translated_formula");
        openapiFields.add("import_status");
        openapiFields.add("change_status");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     SemanticIntegrationFormulaReport
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SemanticIntegrationFormulaReport.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SemanticIntegrationFormulaReport is"
                                        + " not found in the empty JSON string",
                                SemanticIntegrationFormulaReport.openapiRequiredFields.toString()));
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
        if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
                && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("description").toString()));
        }
        if ((jsonObj.get("source_expression") != null
                        && !jsonObj.get("source_expression").isJsonNull())
                && !jsonObj.get("source_expression").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `source_expression` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("source_expression").toString()));
        }
        if ((jsonObj.get("translated_formula") != null
                        && !jsonObj.get("translated_formula").isJsonNull())
                && !jsonObj.get("translated_formula").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `translated_formula` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("translated_formula").toString()));
        }
        if ((jsonObj.get("import_status") != null && !jsonObj.get("import_status").isJsonNull())
                && !jsonObj.get("import_status").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `import_status` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("import_status").toString()));
        }
        // validate the optional field `import_status`
        if (jsonObj.get("import_status") != null && !jsonObj.get("import_status").isJsonNull()) {
            ImportStatusEnum.validateJsonElement(jsonObj.get("import_status"));
        }
        if ((jsonObj.get("change_status") != null && !jsonObj.get("change_status").isJsonNull())
                && !jsonObj.get("change_status").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `change_status` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("change_status").toString()));
        }
        // validate the optional field `change_status`
        if (jsonObj.get("change_status") != null && !jsonObj.get("change_status").isJsonNull()) {
            ChangeStatusEnum.validateJsonElement(jsonObj.get("change_status"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SemanticIntegrationFormulaReport.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SemanticIntegrationFormulaReport' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SemanticIntegrationFormulaReport> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(SemanticIntegrationFormulaReport.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SemanticIntegrationFormulaReport>() {
                        @Override
                        public void write(JsonWriter out, SemanticIntegrationFormulaReport value)
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
                        public SemanticIntegrationFormulaReport read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            SemanticIntegrationFormulaReport instance =
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
     * Create an instance of SemanticIntegrationFormulaReport given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SemanticIntegrationFormulaReport
     * @throws IOException if the JSON string is invalid with respect to
     *     SemanticIntegrationFormulaReport
     */
    public static SemanticIntegrationFormulaReport fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SemanticIntegrationFormulaReport.class);
    }

    /**
     * Convert an instance of SemanticIntegrationFormulaReport to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
