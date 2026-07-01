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

/** Style preferences for a single scope entry. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class StylePreference implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Scope at which these style preferences apply. */
    @JsonAdapter(ScopeEnum.Adapter.class)
    public enum ScopeEnum {
        CLUSTER("CLUSTER"),

        ORG("ORG");

        private String value;

        ScopeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ScopeEnum fromValue(String value) {
            for (ScopeEnum b : ScopeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ScopeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ScopeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ScopeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ScopeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_SCOPE = "scope";

    @SerializedName(SERIALIZED_NAME_SCOPE)
    @javax.annotation.Nullable
    private ScopeEnum scope;

    public static final String SERIALIZED_NAME_ORG = "org";

    @SerializedName(SERIALIZED_NAME_ORG)
    @javax.annotation.Nullable
    private StyleOrgInfo org;

    public static final String SERIALIZED_NAME_NAVIGATION_PANEL = "navigation_panel";

    @SerializedName(SERIALIZED_NAME_NAVIGATION_PANEL)
    @javax.annotation.Nullable
    private StyleNavigationPanel navigationPanel;

    public static final String SERIALIZED_NAME_CHART_COLOR_PALETTE = "chart_color_palette";

    @SerializedName(SERIALIZED_NAME_CHART_COLOR_PALETTE)
    @javax.annotation.Nullable
    private StyleChartColorPalette chartColorPalette;

    public static final String SERIALIZED_NAME_EMBEDDED_FOOTER_TEXT = "embedded_footer_text";

    @SerializedName(SERIALIZED_NAME_EMBEDDED_FOOTER_TEXT)
    @javax.annotation.Nullable
    private StyleEmbeddedFooterText embeddedFooterText;

    public static final String SERIALIZED_NAME_LOGO = "logo";

    @SerializedName(SERIALIZED_NAME_LOGO)
    @javax.annotation.Nullable
    private StyleLogoStatus logo;

    public static final String SERIALIZED_NAME_VISUALIZATION_FONTS = "visualization_fonts";

    @SerializedName(SERIALIZED_NAME_VISUALIZATION_FONTS)
    @javax.annotation.Nullable
    private StyleVisualizationFonts visualizationFonts;

    public StylePreference() {}

    public StylePreference scope(@javax.annotation.Nullable ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Scope at which these style preferences apply.
     *
     * @return scope
     */
    @javax.annotation.Nullable
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(@javax.annotation.Nullable ScopeEnum scope) {
        this.scope = scope;
    }

    public StylePreference org(@javax.annotation.Nullable StyleOrgInfo org) {
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

    public StylePreference navigationPanel(
            @javax.annotation.Nullable StyleNavigationPanel navigationPanel) {
        this.navigationPanel = navigationPanel;
        return this;
    }

    /**
     * Get navigationPanel
     *
     * @return navigationPanel
     */
    @javax.annotation.Nullable
    public StyleNavigationPanel getNavigationPanel() {
        return navigationPanel;
    }

    public void setNavigationPanel(
            @javax.annotation.Nullable StyleNavigationPanel navigationPanel) {
        this.navigationPanel = navigationPanel;
    }

    public StylePreference chartColorPalette(
            @javax.annotation.Nullable StyleChartColorPalette chartColorPalette) {
        this.chartColorPalette = chartColorPalette;
        return this;
    }

    /**
     * Get chartColorPalette
     *
     * @return chartColorPalette
     */
    @javax.annotation.Nullable
    public StyleChartColorPalette getChartColorPalette() {
        return chartColorPalette;
    }

    public void setChartColorPalette(
            @javax.annotation.Nullable StyleChartColorPalette chartColorPalette) {
        this.chartColorPalette = chartColorPalette;
    }

    public StylePreference embeddedFooterText(
            @javax.annotation.Nullable StyleEmbeddedFooterText embeddedFooterText) {
        this.embeddedFooterText = embeddedFooterText;
        return this;
    }

    /**
     * Get embeddedFooterText
     *
     * @return embeddedFooterText
     */
    @javax.annotation.Nullable
    public StyleEmbeddedFooterText getEmbeddedFooterText() {
        return embeddedFooterText;
    }

    public void setEmbeddedFooterText(
            @javax.annotation.Nullable StyleEmbeddedFooterText embeddedFooterText) {
        this.embeddedFooterText = embeddedFooterText;
    }

    public StylePreference logo(@javax.annotation.Nullable StyleLogoStatus logo) {
        this.logo = logo;
        return this;
    }

    /**
     * Get logo
     *
     * @return logo
     */
    @javax.annotation.Nullable
    public StyleLogoStatus getLogo() {
        return logo;
    }

    public void setLogo(@javax.annotation.Nullable StyleLogoStatus logo) {
        this.logo = logo;
    }

    public StylePreference visualizationFonts(
            @javax.annotation.Nullable StyleVisualizationFonts visualizationFonts) {
        this.visualizationFonts = visualizationFonts;
        return this;
    }

    /**
     * Get visualizationFonts
     *
     * @return visualizationFonts
     */
    @javax.annotation.Nullable
    public StyleVisualizationFonts getVisualizationFonts() {
        return visualizationFonts;
    }

    public void setVisualizationFonts(
            @javax.annotation.Nullable StyleVisualizationFonts visualizationFonts) {
        this.visualizationFonts = visualizationFonts;
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
     * @return the StylePreference instance itself
     */
    public StylePreference putAdditionalProperty(String key, Object value) {
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
        StylePreference stylePreference = (StylePreference) o;
        return Objects.equals(this.scope, stylePreference.scope)
                && Objects.equals(this.org, stylePreference.org)
                && Objects.equals(this.navigationPanel, stylePreference.navigationPanel)
                && Objects.equals(this.chartColorPalette, stylePreference.chartColorPalette)
                && Objects.equals(this.embeddedFooterText, stylePreference.embeddedFooterText)
                && Objects.equals(this.logo, stylePreference.logo)
                && Objects.equals(this.visualizationFonts, stylePreference.visualizationFonts)
                && Objects.equals(this.additionalProperties, stylePreference.additionalProperties);
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
                scope,
                org,
                navigationPanel,
                chartColorPalette,
                embeddedFooterText,
                logo,
                visualizationFonts,
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
        sb.append("class StylePreference {\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    org: ").append(toIndentedString(org)).append("\n");
        sb.append("    navigationPanel: ").append(toIndentedString(navigationPanel)).append("\n");
        sb.append("    chartColorPalette: ")
                .append(toIndentedString(chartColorPalette))
                .append("\n");
        sb.append("    embeddedFooterText: ")
                .append(toIndentedString(embeddedFooterText))
                .append("\n");
        sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
        sb.append("    visualizationFonts: ")
                .append(toIndentedString(visualizationFonts))
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
        openapiFields.add("scope");
        openapiFields.add("org");
        openapiFields.add("navigation_panel");
        openapiFields.add("chart_color_palette");
        openapiFields.add("embedded_footer_text");
        openapiFields.add("logo");
        openapiFields.add("visualization_fonts");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to StylePreference
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!StylePreference.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in StylePreference is not found in the"
                                        + " empty JSON string",
                                StylePreference.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull())
                && !jsonObj.get("scope").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `scope` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("scope").toString()));
        }
        // validate the optional field `scope`
        if (jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) {
            ScopeEnum.validateJsonElement(jsonObj.get("scope"));
        }
        // validate the optional field `org`
        if (jsonObj.get("org") != null && !jsonObj.get("org").isJsonNull()) {
            StyleOrgInfo.validateJsonElement(jsonObj.get("org"));
        }
        // validate the optional field `navigation_panel`
        if (jsonObj.get("navigation_panel") != null
                && !jsonObj.get("navigation_panel").isJsonNull()) {
            StyleNavigationPanel.validateJsonElement(jsonObj.get("navigation_panel"));
        }
        // validate the optional field `chart_color_palette`
        if (jsonObj.get("chart_color_palette") != null
                && !jsonObj.get("chart_color_palette").isJsonNull()) {
            StyleChartColorPalette.validateJsonElement(jsonObj.get("chart_color_palette"));
        }
        // validate the optional field `embedded_footer_text`
        if (jsonObj.get("embedded_footer_text") != null
                && !jsonObj.get("embedded_footer_text").isJsonNull()) {
            StyleEmbeddedFooterText.validateJsonElement(jsonObj.get("embedded_footer_text"));
        }
        // validate the optional field `logo`
        if (jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonNull()) {
            StyleLogoStatus.validateJsonElement(jsonObj.get("logo"));
        }
        // validate the optional field `visualization_fonts`
        if (jsonObj.get("visualization_fonts") != null
                && !jsonObj.get("visualization_fonts").isJsonNull()) {
            StyleVisualizationFonts.validateJsonElement(jsonObj.get("visualization_fonts"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!StylePreference.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'StylePreference' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<StylePreference> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(StylePreference.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<StylePreference>() {
                        @Override
                        public void write(JsonWriter out, StylePreference value)
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
                        public StylePreference read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            StylePreference instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of StylePreference given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of StylePreference
     * @throws IOException if the JSON string is invalid with respect to StylePreference
     */
    public static StylePreference fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, StylePreference.class);
    }

    /**
     * Convert an instance of StylePreference to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
