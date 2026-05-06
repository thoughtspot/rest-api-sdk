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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Font assignments grouped by visualization type. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class VisualizationFontsInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CHART_VISUALIZATION_FONTS =
            "chart_visualization_fonts";

    @SerializedName(SERIALIZED_NAME_CHART_VISUALIZATION_FONTS)
    @javax.annotation.Nullable
    private List<ChartFontAssignmentInput> chartVisualizationFonts;

    public static final String SERIALIZED_NAME_TABLE_VISUALIZATION_FONTS =
            "table_visualization_fonts";

    @SerializedName(SERIALIZED_NAME_TABLE_VISUALIZATION_FONTS)
    @javax.annotation.Nullable
    private List<TableFontAssignmentInput> tableVisualizationFonts;

    public VisualizationFontsInput() {}

    public VisualizationFontsInput chartVisualizationFonts(
            @javax.annotation.Nullable List<ChartFontAssignmentInput> chartVisualizationFonts) {
        this.chartVisualizationFonts = chartVisualizationFonts;
        return this;
    }

    public VisualizationFontsInput addChartVisualizationFontsItem(
            ChartFontAssignmentInput chartVisualizationFontsItem) {
        if (this.chartVisualizationFonts == null) {
            this.chartVisualizationFonts = new ArrayList<>();
        }
        this.chartVisualizationFonts.add(chartVisualizationFontsItem);
        return this;
    }

    /**
     * Font assignments for chart visualization areas. Provide only the areas to update; omitted
     * areas remain unchanged.
     *
     * @return chartVisualizationFonts
     */
    @javax.annotation.Nullable
    public List<ChartFontAssignmentInput> getChartVisualizationFonts() {
        return chartVisualizationFonts;
    }

    public void setChartVisualizationFonts(
            @javax.annotation.Nullable List<ChartFontAssignmentInput> chartVisualizationFonts) {
        this.chartVisualizationFonts = chartVisualizationFonts;
    }

    public VisualizationFontsInput tableVisualizationFonts(
            @javax.annotation.Nullable List<TableFontAssignmentInput> tableVisualizationFonts) {
        this.tableVisualizationFonts = tableVisualizationFonts;
        return this;
    }

    public VisualizationFontsInput addTableVisualizationFontsItem(
            TableFontAssignmentInput tableVisualizationFontsItem) {
        if (this.tableVisualizationFonts == null) {
            this.tableVisualizationFonts = new ArrayList<>();
        }
        this.tableVisualizationFonts.add(tableVisualizationFontsItem);
        return this;
    }

    /**
     * Font assignments for table visualization areas. Provide only the areas to update; omitted
     * areas remain unchanged.
     *
     * @return tableVisualizationFonts
     */
    @javax.annotation.Nullable
    public List<TableFontAssignmentInput> getTableVisualizationFonts() {
        return tableVisualizationFonts;
    }

    public void setTableVisualizationFonts(
            @javax.annotation.Nullable List<TableFontAssignmentInput> tableVisualizationFonts) {
        this.tableVisualizationFonts = tableVisualizationFonts;
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
     * @return the VisualizationFontsInput instance itself
     */
    public VisualizationFontsInput putAdditionalProperty(String key, Object value) {
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
        VisualizationFontsInput visualizationFontsInput = (VisualizationFontsInput) o;
        return Objects.equals(
                        this.chartVisualizationFonts,
                        visualizationFontsInput.chartVisualizationFonts)
                && Objects.equals(
                        this.tableVisualizationFonts,
                        visualizationFontsInput.tableVisualizationFonts)
                && Objects.equals(
                        this.additionalProperties, visualizationFontsInput.additionalProperties);
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
        return Objects.hash(chartVisualizationFonts, tableVisualizationFonts, additionalProperties);
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
        sb.append("class VisualizationFontsInput {\n");
        sb.append("    chartVisualizationFonts: ")
                .append(toIndentedString(chartVisualizationFonts))
                .append("\n");
        sb.append("    tableVisualizationFonts: ")
                .append(toIndentedString(tableVisualizationFonts))
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
        openapiFields.add("chart_visualization_fonts");
        openapiFields.add("table_visualization_fonts");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to VisualizationFontsInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!VisualizationFontsInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in VisualizationFontsInput is not found"
                                        + " in the empty JSON string",
                                VisualizationFontsInput.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (jsonObj.get("chart_visualization_fonts") != null
                && !jsonObj.get("chart_visualization_fonts").isJsonNull()) {
            JsonArray jsonArraychartVisualizationFonts =
                    jsonObj.getAsJsonArray("chart_visualization_fonts");
            if (jsonArraychartVisualizationFonts != null) {
                // ensure the json data is an array
                if (!jsonObj.get("chart_visualization_fonts").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `chart_visualization_fonts` to be an array"
                                            + " in the JSON string but got `%s`",
                                    jsonObj.get("chart_visualization_fonts").toString()));
                }

                // validate the optional field `chart_visualization_fonts` (array)
                for (int i = 0; i < jsonArraychartVisualizationFonts.size(); i++) {
                    ChartFontAssignmentInput.validateJsonElement(
                            jsonArraychartVisualizationFonts.get(i));
                }
                ;
            }
        }
        if (jsonObj.get("table_visualization_fonts") != null
                && !jsonObj.get("table_visualization_fonts").isJsonNull()) {
            JsonArray jsonArraytableVisualizationFonts =
                    jsonObj.getAsJsonArray("table_visualization_fonts");
            if (jsonArraytableVisualizationFonts != null) {
                // ensure the json data is an array
                if (!jsonObj.get("table_visualization_fonts").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `table_visualization_fonts` to be an array"
                                            + " in the JSON string but got `%s`",
                                    jsonObj.get("table_visualization_fonts").toString()));
                }

                // validate the optional field `table_visualization_fonts` (array)
                for (int i = 0; i < jsonArraytableVisualizationFonts.size(); i++) {
                    TableFontAssignmentInput.validateJsonElement(
                            jsonArraytableVisualizationFonts.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!VisualizationFontsInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'VisualizationFontsInput' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<VisualizationFontsInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(VisualizationFontsInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<VisualizationFontsInput>() {
                        @Override
                        public void write(JsonWriter out, VisualizationFontsInput value)
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
                        public VisualizationFontsInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            VisualizationFontsInput instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of VisualizationFontsInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of VisualizationFontsInput
     * @throws IOException if the JSON string is invalid with respect to VisualizationFontsInput
     */
    public static VisualizationFontsInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, VisualizationFontsInput.class);
    }

    /**
     * Convert an instance of VisualizationFontsInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
