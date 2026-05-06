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

/** Font assignment for a chart visualization area in the response. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ChartVisualizationFontRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Chart visualization area. */
    @JsonAdapter(VisualizationAreaEnum.Adapter.class)
    public enum VisualizationAreaEnum {
        CHART_X_AXIS_LABELS("CHART_X_AXIS_LABELS"),

        CHART_X_AXIS_TITLE("CHART_X_AXIS_TITLE"),

        CHART_Y_AXIS_LABELS("CHART_Y_AXIS_LABELS"),

        CHART_Y_AXIS_TITLE("CHART_Y_AXIS_TITLE"),

        CHART_TOOLTIP("CHART_TOOLTIP"),

        CHART_SCATTER_DATA_LABELS("CHART_SCATTER_DATA_LABELS"),

        CHART_DONUT_DATA_LABELS("CHART_DONUT_DATA_LABELS"),

        CHART_LINE_DATA_LABELS("CHART_LINE_DATA_LABELS"),

        CHART_COLUMN_DATA_LABELS("CHART_COLUMN_DATA_LABELS"),

        CHART_BAR_DATA_LABELS("CHART_BAR_DATA_LABELS"),

        CHART_AREA_DATA_LABELS("CHART_AREA_DATA_LABELS");

        private String value;

        VisualizationAreaEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static VisualizationAreaEnum fromValue(String value) {
            for (VisualizationAreaEnum b : VisualizationAreaEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<VisualizationAreaEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final VisualizationAreaEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public VisualizationAreaEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return VisualizationAreaEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            VisualizationAreaEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_VISUALIZATION_AREA = "visualization_area";

    @SerializedName(SERIALIZED_NAME_VISUALIZATION_AREA)
    @javax.annotation.Nullable
    private VisualizationAreaEnum visualizationArea;

    public static final String SERIALIZED_NAME_FONT_ID = "font_id";

    @SerializedName(SERIALIZED_NAME_FONT_ID)
    @javax.annotation.Nullable
    private String fontId;

    public static final String SERIALIZED_NAME_FONT_NAME = "font_name";

    @SerializedName(SERIALIZED_NAME_FONT_NAME)
    @javax.annotation.Nullable
    private String fontName;

    public static final String SERIALIZED_NAME_IS_OVERRIDDEN = "is_overridden";

    @SerializedName(SERIALIZED_NAME_IS_OVERRIDDEN)
    @javax.annotation.Nullable
    private Boolean isOverridden;

    public ChartVisualizationFontRecord() {}

    public ChartVisualizationFontRecord visualizationArea(
            @javax.annotation.Nullable VisualizationAreaEnum visualizationArea) {
        this.visualizationArea = visualizationArea;
        return this;
    }

    /**
     * Chart visualization area.
     *
     * @return visualizationArea
     */
    @javax.annotation.Nullable
    public VisualizationAreaEnum getVisualizationArea() {
        return visualizationArea;
    }

    public void setVisualizationArea(
            @javax.annotation.Nullable VisualizationAreaEnum visualizationArea) {
        this.visualizationArea = visualizationArea;
    }

    public ChartVisualizationFontRecord fontId(@javax.annotation.Nullable String fontId) {
        this.fontId = fontId;
        return this;
    }

    /**
     * UUID of the font assigned to this area. Null when the system default font is active.
     *
     * @return fontId
     */
    @javax.annotation.Nullable
    public String getFontId() {
        return fontId;
    }

    public void setFontId(@javax.annotation.Nullable String fontId) {
        this.fontId = fontId;
    }

    public ChartVisualizationFontRecord fontName(@javax.annotation.Nullable String fontName) {
        this.fontName = fontName;
        return this;
    }

    /**
     * Display name of the font assigned to this area. Null when the system default font is active.
     *
     * @return fontName
     */
    @javax.annotation.Nullable
    public String getFontName() {
        return fontName;
    }

    public void setFontName(@javax.annotation.Nullable String fontName) {
        this.fontName = fontName;
    }

    public ChartVisualizationFontRecord isOverridden(
            @javax.annotation.Nullable Boolean isOverridden) {
        this.isOverridden = isOverridden;
        return this;
    }

    /**
     * True if explicitly set at this scope, overriding any inherited value.
     *
     * @return isOverridden
     */
    @javax.annotation.Nullable
    public Boolean getIsOverridden() {
        return isOverridden;
    }

    public void setIsOverridden(@javax.annotation.Nullable Boolean isOverridden) {
        this.isOverridden = isOverridden;
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
     * @return the ChartVisualizationFontRecord instance itself
     */
    public ChartVisualizationFontRecord putAdditionalProperty(String key, Object value) {
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
        ChartVisualizationFontRecord chartVisualizationFontRecord =
                (ChartVisualizationFontRecord) o;
        return Objects.equals(
                        this.visualizationArea, chartVisualizationFontRecord.visualizationArea)
                && Objects.equals(this.fontId, chartVisualizationFontRecord.fontId)
                && Objects.equals(this.fontName, chartVisualizationFontRecord.fontName)
                && Objects.equals(this.isOverridden, chartVisualizationFontRecord.isOverridden)
                && Objects.equals(
                        this.additionalProperties,
                        chartVisualizationFontRecord.additionalProperties);
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
                visualizationArea, fontId, fontName, isOverridden, additionalProperties);
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
        sb.append("class ChartVisualizationFontRecord {\n");
        sb.append("    visualizationArea: ")
                .append(toIndentedString(visualizationArea))
                .append("\n");
        sb.append("    fontId: ").append(toIndentedString(fontId)).append("\n");
        sb.append("    fontName: ").append(toIndentedString(fontName)).append("\n");
        sb.append("    isOverridden: ").append(toIndentedString(isOverridden)).append("\n");
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
        openapiFields.add("visualization_area");
        openapiFields.add("font_id");
        openapiFields.add("font_name");
        openapiFields.add("is_overridden");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ChartVisualizationFontRecord
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ChartVisualizationFontRecord.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ChartVisualizationFontRecord is not"
                                        + " found in the empty JSON string",
                                ChartVisualizationFontRecord.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("visualization_area") != null
                        && !jsonObj.get("visualization_area").isJsonNull())
                && !jsonObj.get("visualization_area").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `visualization_area` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("visualization_area").toString()));
        }
        // validate the optional field `visualization_area`
        if (jsonObj.get("visualization_area") != null
                && !jsonObj.get("visualization_area").isJsonNull()) {
            VisualizationAreaEnum.validateJsonElement(jsonObj.get("visualization_area"));
        }
        if ((jsonObj.get("font_id") != null && !jsonObj.get("font_id").isJsonNull())
                && !jsonObj.get("font_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `font_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("font_id").toString()));
        }
        if ((jsonObj.get("font_name") != null && !jsonObj.get("font_name").isJsonNull())
                && !jsonObj.get("font_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `font_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("font_name").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ChartVisualizationFontRecord.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ChartVisualizationFontRecord' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ChartVisualizationFontRecord> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ChartVisualizationFontRecord.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ChartVisualizationFontRecord>() {
                        @Override
                        public void write(JsonWriter out, ChartVisualizationFontRecord value)
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
                        public ChartVisualizationFontRecord read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            ChartVisualizationFontRecord instance =
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
     * Create an instance of ChartVisualizationFontRecord given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ChartVisualizationFontRecord
     * @throws IOException if the JSON string is invalid with respect to
     *     ChartVisualizationFontRecord
     */
    public static ChartVisualizationFontRecord fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ChartVisualizationFontRecord.class);
    }

    /**
     * Convert an instance of ChartVisualizationFontRecord to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
