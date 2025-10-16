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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** Objects to apply the Runtime_Filters. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class RuntimeFilters implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_COLUMN_NAME = "column_name";

    @SerializedName(SERIALIZED_NAME_COLUMN_NAME)
    @javax.annotation.Nonnull
    private String columnName;

    public static final String SERIALIZED_NAME_VALUES = "values";

    @SerializedName(SERIALIZED_NAME_VALUES)
    @javax.annotation.Nonnull
    private List<String> values;

    /** Operator value. Example: EQ */
    @JsonAdapter(OperatorEnum.Adapter.class)
    public enum OperatorEnum {
        EQ("EQ"),

        NE("NE"),

        LT("LT"),

        LE("LE"),

        GT("GT"),

        GE("GE"),

        IN("IN"),

        BW("BW"),

        CONTAINS("CONTAINS"),

        BEGINS_WITH("BEGINS_WITH"),

        ENDS_WITH("ENDS_WITH"),

        BW_INC("BW_INC"),

        BW_INC_MIN("BW_INC_MIN"),

        BW_INC_MAX("BW_INC_MAX"),

        LIKE("LIKE"),

        NOT_IN("NOT_IN");

        private String value;

        OperatorEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OperatorEnum fromValue(String value) {
            for (OperatorEnum b : OperatorEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<OperatorEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OperatorEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OperatorEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            OperatorEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_OPERATOR = "operator";

    @SerializedName(SERIALIZED_NAME_OPERATOR)
    @javax.annotation.Nonnull
    private OperatorEnum operator;

    public static final String SERIALIZED_NAME_PERSIST = "persist";

    @SerializedName(SERIALIZED_NAME_PERSIST)
    @javax.annotation.Nullable
    private Boolean persist = false;

    public static final String SERIALIZED_NAME_OBJECTS = "objects";

    @SerializedName(SERIALIZED_NAME_OBJECTS)
    @javax.annotation.Nullable
    private List<UserObject> objects;

    public RuntimeFilters() {}

    public RuntimeFilters columnName(@javax.annotation.Nonnull String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * The column name to apply filter.
     *
     * @return columnName
     */
    @javax.annotation.Nonnull
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(@javax.annotation.Nonnull String columnName) {
        this.columnName = columnName;
    }

    public RuntimeFilters values(@javax.annotation.Nonnull List<String> values) {
        this.values = values;
        return this;
    }

    public RuntimeFilters addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    /**
     * Value of the filters.
     *
     * @return values
     */
    @javax.annotation.Nonnull
    public List<String> getValues() {
        return values;
    }

    public void setValues(@javax.annotation.Nonnull List<String> values) {
        this.values = values;
    }

    public RuntimeFilters operator(@javax.annotation.Nonnull OperatorEnum operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Operator value. Example: EQ
     *
     * @return operator
     */
    @javax.annotation.Nonnull
    public OperatorEnum getOperator() {
        return operator;
    }

    public void setOperator(@javax.annotation.Nonnull OperatorEnum operator) {
        this.operator = operator;
    }

    public RuntimeFilters persist(@javax.annotation.Nullable Boolean persist) {
        this.persist = persist;
        return this;
    }

    /**
     * Flag to persist the runtime filters. Version: 9.12.0.cl or later
     *
     * @return persist
     */
    @javax.annotation.Nullable
    public Boolean getPersist() {
        return persist;
    }

    public void setPersist(@javax.annotation.Nullable Boolean persist) {
        this.persist = persist;
    }

    public RuntimeFilters objects(@javax.annotation.Nullable List<UserObject> objects) {
        this.objects = objects;
        return this;
    }

    public RuntimeFilters addObjectsItem(UserObject objectsItem) {
        if (this.objects == null) {
            this.objects = new ArrayList<>();
        }
        this.objects.add(objectsItem);
        return this;
    }

    /**
     * Object to apply the runtime filter.
     *
     * @return objects
     */
    @javax.annotation.Nullable
    public List<UserObject> getObjects() {
        return objects;
    }

    public void setObjects(@javax.annotation.Nullable List<UserObject> objects) {
        this.objects = objects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuntimeFilters runtimeFilters = (RuntimeFilters) o;
        return Objects.equals(this.columnName, runtimeFilters.columnName)
                && Objects.equals(this.values, runtimeFilters.values)
                && Objects.equals(this.operator, runtimeFilters.operator)
                && Objects.equals(this.persist, runtimeFilters.persist)
                && Objects.equals(this.objects, runtimeFilters.objects);
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
        return Objects.hash(columnName, values, operator, persist, objects);
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
        sb.append("class RuntimeFilters {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    persist: ").append(toIndentedString(persist)).append("\n");
        sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
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
        openapiFields.add("column_name");
        openapiFields.add("values");
        openapiFields.add("operator");
        openapiFields.add("persist");
        openapiFields.add("objects");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("column_name");
        openapiRequiredFields.add("values");
        openapiRequiredFields.add("operator");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to RuntimeFilters
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!RuntimeFilters.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in RuntimeFilters is not found in the"
                                        + " empty JSON string",
                                RuntimeFilters.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!RuntimeFilters.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `RuntimeFilters` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : RuntimeFilters.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("column_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `column_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("column_name").toString()));
        }
        // ensure the required json array is present
        if (jsonObj.get("values") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("values").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `values` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("values").toString()));
        }
        if (!jsonObj.get("operator").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `operator` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("operator").toString()));
        }
        // validate the required field `operator`
        OperatorEnum.validateJsonElement(jsonObj.get("operator"));
        if (jsonObj.get("objects") != null && !jsonObj.get("objects").isJsonNull()) {
            JsonArray jsonArrayobjects = jsonObj.getAsJsonArray("objects");
            if (jsonArrayobjects != null) {
                // ensure the json data is an array
                if (!jsonObj.get("objects").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `objects` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("objects").toString()));
                }

                // validate the optional field `objects` (array)
                for (int i = 0; i < jsonArrayobjects.size(); i++) {
                    UserObject.validateJsonElement(jsonArrayobjects.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RuntimeFilters.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RuntimeFilters' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RuntimeFilters> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(RuntimeFilters.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<RuntimeFilters>() {
                        @Override
                        public void write(JsonWriter out, RuntimeFilters value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public RuntimeFilters read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of RuntimeFilters given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RuntimeFilters
     * @throws IOException if the JSON string is invalid with respect to RuntimeFilters
     */
    public static RuntimeFilters fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RuntimeFilters.class);
    }

    /**
     * Convert an instance of RuntimeFilters to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
