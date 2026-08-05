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

/** A visualization area assignment affected by a font deletion. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class StyleFontDeleteAffectedAssignment implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ORG = "org";

    @SerializedName(SERIALIZED_NAME_ORG)
    @javax.annotation.Nullable
    private StyleOrgInfo org;

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

        TABLE_VALUE_CELLS("TABLE_VALUE_CELLS"),

        ADVANCED_CHART_LABELS("ADVANCED_CHART_LABELS");

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

    public StyleFontDeleteAffectedAssignment() {}

    public StyleFontDeleteAffectedAssignment org(@javax.annotation.Nullable StyleOrgInfo org) {
        this.org = org;
        return this;
    }

    /**
     * Get org
     *
     * @return org
     */
    @javax.annotation.Nullable
    public StyleOrgInfo getOrg() {
        return org;
    }

    public void setOrg(@javax.annotation.Nullable StyleOrgInfo org) {
        this.org = org;
    }

    public StyleFontDeleteAffectedAssignment visualizationAreas(
            @javax.annotation.Nullable List<VisualizationAreasEnum> visualizationAreas) {
        this.visualizationAreas = visualizationAreas;
        return this;
    }

    public StyleFontDeleteAffectedAssignment addVisualizationAreasItem(
            VisualizationAreasEnum visualizationAreasItem) {
        if (this.visualizationAreas == null) {
            this.visualizationAreas = new ArrayList<>();
        }
        this.visualizationAreas.add(visualizationAreasItem);
        return this;
    }

    /**
     * Visualization areas that used the deleted font and were automatically reset to the system
     * default font.
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
     * @return the StyleFontDeleteAffectedAssignment instance itself
     */
    public StyleFontDeleteAffectedAssignment putAdditionalProperty(String key, Object value) {
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
        StyleFontDeleteAffectedAssignment styleFontDeleteAffectedAssignment =
                (StyleFontDeleteAffectedAssignment) o;
        return Objects.equals(this.org, styleFontDeleteAffectedAssignment.org)
                && Objects.equals(
                        this.visualizationAreas,
                        styleFontDeleteAffectedAssignment.visualizationAreas)
                && Objects.equals(
                        this.additionalProperties,
                        styleFontDeleteAffectedAssignment.additionalProperties);
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
        return Objects.hash(org, visualizationAreas, additionalProperties);
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
        sb.append("class StyleFontDeleteAffectedAssignment {\n");
        sb.append("    org: ").append(toIndentedString(org)).append("\n");
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
        openapiFields.add("org");
        openapiFields.add("visualization_areas");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     StyleFontDeleteAffectedAssignment
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!StyleFontDeleteAffectedAssignment.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in StyleFontDeleteAffectedAssignment is"
                                        + " not found in the empty JSON string",
                                StyleFontDeleteAffectedAssignment.openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the optional field `org`
        if (jsonObj.get("org") != null && !jsonObj.get("org").isJsonNull()) {
            StyleOrgInfo.validateJsonElement(jsonObj.get("org"));
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
            if (!StyleFontDeleteAffectedAssignment.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'StyleFontDeleteAffectedAssignment' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<StyleFontDeleteAffectedAssignment> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(StyleFontDeleteAffectedAssignment.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<StyleFontDeleteAffectedAssignment>() {
                        @Override
                        public void write(JsonWriter out, StyleFontDeleteAffectedAssignment value)
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
                        public StyleFontDeleteAffectedAssignment read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            StyleFontDeleteAffectedAssignment instance =
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
     * Create an instance of StyleFontDeleteAffectedAssignment given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of StyleFontDeleteAffectedAssignment
     * @throws IOException if the JSON string is invalid with respect to
     *     StyleFontDeleteAffectedAssignment
     */
    public static StyleFontDeleteAffectedAssignment fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, StyleFontDeleteAffectedAssignment.class);
    }

    /**
     * Convert an instance of StyleFontDeleteAffectedAssignment to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
