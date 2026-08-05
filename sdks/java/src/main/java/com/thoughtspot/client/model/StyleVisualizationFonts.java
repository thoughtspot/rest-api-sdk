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

/** Effective font assignments per visualization type. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class StyleVisualizationFonts implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CHART_VISUALIZATION_FONTS =
            "chart_visualization_fonts";

    @SerializedName(SERIALIZED_NAME_CHART_VISUALIZATION_FONTS)
    @javax.annotation.Nullable
    private List<ChartVisualizationFontRecord> chartVisualizationFonts;

    public static final String SERIALIZED_NAME_TABLE_VISUALIZATION_FONTS =
            "table_visualization_fonts";

    @SerializedName(SERIALIZED_NAME_TABLE_VISUALIZATION_FONTS)
    @javax.annotation.Nullable
    private List<TableVisualizationFontRecord> tableVisualizationFonts;

    public static final String SERIALIZED_NAME_ADVANCED_CHART_VISUALIZATION_FONTS =
            "advanced_chart_visualization_fonts";

    @SerializedName(SERIALIZED_NAME_ADVANCED_CHART_VISUALIZATION_FONTS)
    @javax.annotation.Nullable
    private List<AdvancedChartVisualizationFontRecord> advancedChartVisualizationFonts;

    public StyleVisualizationFonts() {}

    public StyleVisualizationFonts chartVisualizationFonts(
            @javax.annotation.Nullable List<ChartVisualizationFontRecord> chartVisualizationFonts) {
        this.chartVisualizationFonts = chartVisualizationFonts;
        return this;
    }

    public StyleVisualizationFonts addChartVisualizationFontsItem(
            ChartVisualizationFontRecord chartVisualizationFontsItem) {
        if (this.chartVisualizationFonts == null) {
            this.chartVisualizationFonts = new ArrayList<>();
        }
        this.chartVisualizationFonts.add(chartVisualizationFontsItem);
        return this;
    }

    /**
     * Font assignments for chart visualization areas.
     *
     * @return chartVisualizationFonts
     */
    @javax.annotation.Nullable
    public List<ChartVisualizationFontRecord> getChartVisualizationFonts() {
        return chartVisualizationFonts;
    }

    public void setChartVisualizationFonts(
            @javax.annotation.Nullable List<ChartVisualizationFontRecord> chartVisualizationFonts) {
        this.chartVisualizationFonts = chartVisualizationFonts;
    }

    public StyleVisualizationFonts tableVisualizationFonts(
            @javax.annotation.Nullable List<TableVisualizationFontRecord> tableVisualizationFonts) {
        this.tableVisualizationFonts = tableVisualizationFonts;
        return this;
    }

    public StyleVisualizationFonts addTableVisualizationFontsItem(
            TableVisualizationFontRecord tableVisualizationFontsItem) {
        if (this.tableVisualizationFonts == null) {
            this.tableVisualizationFonts = new ArrayList<>();
        }
        this.tableVisualizationFonts.add(tableVisualizationFontsItem);
        return this;
    }

    /**
     * Font assignments for table visualization areas.
     *
     * @return tableVisualizationFonts
     */
    @javax.annotation.Nullable
    public List<TableVisualizationFontRecord> getTableVisualizationFonts() {
        return tableVisualizationFonts;
    }

    public void setTableVisualizationFonts(
            @javax.annotation.Nullable List<TableVisualizationFontRecord> tableVisualizationFonts) {
        this.tableVisualizationFonts = tableVisualizationFonts;
    }

    public StyleVisualizationFonts advancedChartVisualizationFonts(
            @javax.annotation.Nullable
                    List<AdvancedChartVisualizationFontRecord> advancedChartVisualizationFonts) {
        this.advancedChartVisualizationFonts = advancedChartVisualizationFonts;
        return this;
    }

    public StyleVisualizationFonts addAdvancedChartVisualizationFontsItem(
            AdvancedChartVisualizationFontRecord advancedChartVisualizationFontsItem) {
        if (this.advancedChartVisualizationFonts == null) {
            this.advancedChartVisualizationFonts = new ArrayList<>();
        }
        this.advancedChartVisualizationFonts.add(advancedChartVisualizationFontsItem);
        return this;
    }

    /**
     * Font assignments for advanced chart visualization areas. Version: 26.7.0.cl or later
     *
     * @return advancedChartVisualizationFonts
     */
    @javax.annotation.Nullable
    public List<AdvancedChartVisualizationFontRecord> getAdvancedChartVisualizationFonts() {
        return advancedChartVisualizationFonts;
    }

    public void setAdvancedChartVisualizationFonts(
            @javax.annotation.Nullable
                    List<AdvancedChartVisualizationFontRecord> advancedChartVisualizationFonts) {
        this.advancedChartVisualizationFonts = advancedChartVisualizationFonts;
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
     * @return the StyleVisualizationFonts instance itself
     */
    public StyleVisualizationFonts putAdditionalProperty(String key, Object value) {
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
        StyleVisualizationFonts styleVisualizationFonts = (StyleVisualizationFonts) o;
        return Objects.equals(
                        this.chartVisualizationFonts,
                        styleVisualizationFonts.chartVisualizationFonts)
                && Objects.equals(
                        this.tableVisualizationFonts,
                        styleVisualizationFonts.tableVisualizationFonts)
                && Objects.equals(
                        this.advancedChartVisualizationFonts,
                        styleVisualizationFonts.advancedChartVisualizationFonts)
                && Objects.equals(
                        this.additionalProperties, styleVisualizationFonts.additionalProperties);
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
                chartVisualizationFonts,
                tableVisualizationFonts,
                advancedChartVisualizationFonts,
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
        sb.append("class StyleVisualizationFonts {\n");
        sb.append("    chartVisualizationFonts: ")
                .append(toIndentedString(chartVisualizationFonts))
                .append("\n");
        sb.append("    tableVisualizationFonts: ")
                .append(toIndentedString(tableVisualizationFonts))
                .append("\n");
        sb.append("    advancedChartVisualizationFonts: ")
                .append(toIndentedString(advancedChartVisualizationFonts))
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
        openapiFields.add("advanced_chart_visualization_fonts");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to StyleVisualizationFonts
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!StyleVisualizationFonts.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in StyleVisualizationFonts is not found"
                                        + " in the empty JSON string",
                                StyleVisualizationFonts.openapiRequiredFields.toString()));
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
                    ChartVisualizationFontRecord.validateJsonElement(
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
                    TableVisualizationFontRecord.validateJsonElement(
                            jsonArraytableVisualizationFonts.get(i));
                }
                ;
            }
        }
        if (jsonObj.get("advanced_chart_visualization_fonts") != null
                && !jsonObj.get("advanced_chart_visualization_fonts").isJsonNull()) {
            JsonArray jsonArrayadvancedChartVisualizationFonts =
                    jsonObj.getAsJsonArray("advanced_chart_visualization_fonts");
            if (jsonArrayadvancedChartVisualizationFonts != null) {
                // ensure the json data is an array
                if (!jsonObj.get("advanced_chart_visualization_fonts").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `advanced_chart_visualization_fonts` to be"
                                            + " an array in the JSON string but got `%s`",
                                    jsonObj.get("advanced_chart_visualization_fonts").toString()));
                }

                // validate the optional field `advanced_chart_visualization_fonts` (array)
                for (int i = 0; i < jsonArrayadvancedChartVisualizationFonts.size(); i++) {
                    AdvancedChartVisualizationFontRecord.validateJsonElement(
                            jsonArrayadvancedChartVisualizationFonts.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!StyleVisualizationFonts.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'StyleVisualizationFonts' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<StyleVisualizationFonts> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(StyleVisualizationFonts.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<StyleVisualizationFonts>() {
                        @Override
                        public void write(JsonWriter out, StyleVisualizationFonts value)
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
                        public StyleVisualizationFonts read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            StyleVisualizationFonts instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of StyleVisualizationFonts given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of StyleVisualizationFonts
     * @throws IOException if the JSON string is invalid with respect to StyleVisualizationFonts
     */
    public static StyleVisualizationFonts fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, StyleVisualizationFonts.class);
    }

    /**
     * Convert an instance of StyleVisualizationFonts to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
