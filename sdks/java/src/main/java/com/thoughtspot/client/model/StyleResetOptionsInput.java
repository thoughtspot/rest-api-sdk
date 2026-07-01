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

/** Fields to revert to defaults when operation is RESET. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class StyleResetOptionsInput implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Gets or Sets style */
    @JsonAdapter(StyleEnum.Adapter.class)
    public enum StyleEnum {
        CHART_COLOR_PALETTE("CHART_COLOR_PALETTE"),

        EMBEDDED_FOOTER_TEXT("EMBEDDED_FOOTER_TEXT"),

        NAV_PANEL_COLOR("NAV_PANEL_COLOR"),

        DEFAULT_LOGO("DEFAULT_LOGO"),

        WIDE_LOGO("WIDE_LOGO");

        private String value;

        StyleEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StyleEnum fromValue(String value) {
            for (StyleEnum b : StyleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<StyleEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StyleEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StyleEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StyleEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            StyleEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_STYLE = "style";

    @SerializedName(SERIALIZED_NAME_STYLE)
    @javax.annotation.Nullable
    private List<StyleEnum> style;

    /** Gets or Sets visualizationAreas */
    @JsonAdapter(VisualizationAreasEnum.Adapter.class)
    public enum VisualizationAreasEnum {
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

        CHART_AREA_DATA_LABELS("CHART_AREA_DATA_LABELS"),

        TABLE_VALUE_CELLS("TABLE_VALUE_CELLS");

        private String value;

        VisualizationAreasEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static VisualizationAreasEnum fromValue(String value) {
            for (VisualizationAreasEnum b : VisualizationAreasEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<VisualizationAreasEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final VisualizationAreasEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public VisualizationAreasEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return VisualizationAreasEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            VisualizationAreasEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_VISUALIZATION_AREAS = "visualization_areas";

    @SerializedName(SERIALIZED_NAME_VISUALIZATION_AREAS)
    @javax.annotation.Nullable
    private List<VisualizationAreasEnum> visualizationAreas;

    public StyleResetOptionsInput() {}

    public StyleResetOptionsInput style(@javax.annotation.Nullable List<StyleEnum> style) {
        this.style = style;
        return this;
    }

    public StyleResetOptionsInput addStyleItem(StyleEnum styleItem) {
        if (this.style == null) {
            this.style = new ArrayList<>();
        }
        this.style.add(styleItem);
        return this;
    }

    /**
     * Style fields to reset. Supported values: CHART_COLOR_PALETTE, EMBEDDED_FOOTER_TEXT,
     * NAV_PANEL_COLOR, DEFAULT_LOGO, WIDE_LOGO.
     *
     * @return style
     */
    @javax.annotation.Nullable
    public List<StyleEnum> getStyle() {
        return style;
    }

    public void setStyle(@javax.annotation.Nullable List<StyleEnum> style) {
        this.style = style;
    }

    public StyleResetOptionsInput visualizationAreas(
            @javax.annotation.Nullable List<VisualizationAreasEnum> visualizationAreas) {
        this.visualizationAreas = visualizationAreas;
        return this;
    }

    public StyleResetOptionsInput addVisualizationAreasItem(
            VisualizationAreasEnum visualizationAreasItem) {
        if (this.visualizationAreas == null) {
            this.visualizationAreas = new ArrayList<>();
        }
        this.visualizationAreas.add(visualizationAreasItem);
        return this;
    }

    /**
     * Visualization areas whose font assignments should revert to the system default font.
     *
     * @return visualizationAreas
     */
    @javax.annotation.Nullable
    public List<VisualizationAreasEnum> getVisualizationAreas() {
        return visualizationAreas;
    }

    public void setVisualizationAreas(
            @javax.annotation.Nullable List<VisualizationAreasEnum> visualizationAreas) {
        this.visualizationAreas = visualizationAreas;
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
     * @return the StyleResetOptionsInput instance itself
     */
    public StyleResetOptionsInput putAdditionalProperty(String key, Object value) {
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
        StyleResetOptionsInput styleResetOptionsInput = (StyleResetOptionsInput) o;
        return Objects.equals(this.style, styleResetOptionsInput.style)
                && Objects.equals(
                        this.visualizationAreas, styleResetOptionsInput.visualizationAreas)
                && Objects.equals(
                        this.additionalProperties, styleResetOptionsInput.additionalProperties);
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
        return Objects.hash(style, visualizationAreas, additionalProperties);
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
        sb.append("class StyleResetOptionsInput {\n");
        sb.append("    style: ").append(toIndentedString(style)).append("\n");
        sb.append("    visualizationAreas: ")
                .append(toIndentedString(visualizationAreas))
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
        openapiFields.add("style");
        openapiFields.add("visualization_areas");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to StyleResetOptionsInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!StyleResetOptionsInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in StyleResetOptionsInput is not found"
                                        + " in the empty JSON string",
                                StyleResetOptionsInput.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("style") != null
                && !jsonObj.get("style").isJsonNull()
                && !jsonObj.get("style").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `style` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("style").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("visualization_areas") != null
                && !jsonObj.get("visualization_areas").isJsonNull()
                && !jsonObj.get("visualization_areas").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `visualization_areas` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("visualization_areas").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!StyleResetOptionsInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'StyleResetOptionsInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<StyleResetOptionsInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(StyleResetOptionsInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<StyleResetOptionsInput>() {
                        @Override
                        public void write(JsonWriter out, StyleResetOptionsInput value)
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
                        public StyleResetOptionsInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            StyleResetOptionsInput instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of StyleResetOptionsInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of StyleResetOptionsInput
     * @throws IOException if the JSON string is invalid with respect to StyleResetOptionsInput
     */
    public static StyleResetOptionsInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, StyleResetOptionsInput.class);
    }

    /**
     * Convert an instance of StyleResetOptionsInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
