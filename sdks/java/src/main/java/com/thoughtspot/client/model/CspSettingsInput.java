/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** Input for CSP (Content Security Policy) settings. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CspSettingsInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONNECT_SRC_URLS = "connect_src_urls";

    @SerializedName(SERIALIZED_NAME_CONNECT_SRC_URLS)
    @javax.annotation.Nullable
    private List<String> connectSrcUrls;

    public static final String SERIALIZED_NAME_FONT_SRC_URLS = "font_src_urls";

    @SerializedName(SERIALIZED_NAME_FONT_SRC_URLS)
    @javax.annotation.Nullable
    private List<String> fontSrcUrls;

    public static final String SERIALIZED_NAME_VISUAL_EMBED_HOSTS = "visual_embed_hosts";

    @SerializedName(SERIALIZED_NAME_VISUAL_EMBED_HOSTS)
    @javax.annotation.Nullable
    private List<String> visualEmbedHosts;

    public static final String SERIALIZED_NAME_IFRAME_SRC_URLS = "iframe_src_urls";

    @SerializedName(SERIALIZED_NAME_IFRAME_SRC_URLS)
    @javax.annotation.Nullable
    private List<String> iframeSrcUrls;

    public static final String SERIALIZED_NAME_IMG_SRC_URLS = "img_src_urls";

    @SerializedName(SERIALIZED_NAME_IMG_SRC_URLS)
    @javax.annotation.Nullable
    private List<String> imgSrcUrls;

    public static final String SERIALIZED_NAME_SCRIPT_SRC_URLS = "script_src_urls";

    @SerializedName(SERIALIZED_NAME_SCRIPT_SRC_URLS)
    @javax.annotation.Nullable
    private ScriptSrcUrlsInput scriptSrcUrls;

    public static final String SERIALIZED_NAME_STYLE_SRC_URLS = "style_src_urls";

    @SerializedName(SERIALIZED_NAME_STYLE_SRC_URLS)
    @javax.annotation.Nullable
    private List<String> styleSrcUrls;

    public CspSettingsInput() {}

    public CspSettingsInput connectSrcUrls(@javax.annotation.Nullable List<String> connectSrcUrls) {
        this.connectSrcUrls = connectSrcUrls;
        return this;
    }

    public CspSettingsInput addConnectSrcUrlsItem(String connectSrcUrlsItem) {
        if (this.connectSrcUrls == null) {
            this.connectSrcUrls = new ArrayList<>();
        }
        this.connectSrcUrls.add(connectSrcUrlsItem);
        return this;
    }

    /**
     * Allowed URLs for connect-src directive.
     *
     * @return connectSrcUrls
     */
    @javax.annotation.Nullable
    public List<String> getConnectSrcUrls() {
        return connectSrcUrls;
    }

    public void setConnectSrcUrls(@javax.annotation.Nullable List<String> connectSrcUrls) {
        this.connectSrcUrls = connectSrcUrls;
    }

    public CspSettingsInput fontSrcUrls(@javax.annotation.Nullable List<String> fontSrcUrls) {
        this.fontSrcUrls = fontSrcUrls;
        return this;
    }

    public CspSettingsInput addFontSrcUrlsItem(String fontSrcUrlsItem) {
        if (this.fontSrcUrls == null) {
            this.fontSrcUrls = new ArrayList<>();
        }
        this.fontSrcUrls.add(fontSrcUrlsItem);
        return this;
    }

    /**
     * Allowed URLs for font-src directive.
     *
     * @return fontSrcUrls
     */
    @javax.annotation.Nullable
    public List<String> getFontSrcUrls() {
        return fontSrcUrls;
    }

    public void setFontSrcUrls(@javax.annotation.Nullable List<String> fontSrcUrls) {
        this.fontSrcUrls = fontSrcUrls;
    }

    public CspSettingsInput visualEmbedHosts(
            @javax.annotation.Nullable List<String> visualEmbedHosts) {
        this.visualEmbedHosts = visualEmbedHosts;
        return this;
    }

    public CspSettingsInput addVisualEmbedHostsItem(String visualEmbedHostsItem) {
        if (this.visualEmbedHosts == null) {
            this.visualEmbedHosts = new ArrayList<>();
        }
        this.visualEmbedHosts.add(visualEmbedHostsItem);
        return this;
    }

    /**
     * Allowed hosts for visual embed (frame-ancestors directive).
     *
     * @return visualEmbedHosts
     */
    @javax.annotation.Nullable
    public List<String> getVisualEmbedHosts() {
        return visualEmbedHosts;
    }

    public void setVisualEmbedHosts(@javax.annotation.Nullable List<String> visualEmbedHosts) {
        this.visualEmbedHosts = visualEmbedHosts;
    }

    public CspSettingsInput iframeSrcUrls(@javax.annotation.Nullable List<String> iframeSrcUrls) {
        this.iframeSrcUrls = iframeSrcUrls;
        return this;
    }

    public CspSettingsInput addIframeSrcUrlsItem(String iframeSrcUrlsItem) {
        if (this.iframeSrcUrls == null) {
            this.iframeSrcUrls = new ArrayList<>();
        }
        this.iframeSrcUrls.add(iframeSrcUrlsItem);
        return this;
    }

    /**
     * Allowed URLs for frame-src directive.
     *
     * @return iframeSrcUrls
     */
    @javax.annotation.Nullable
    public List<String> getIframeSrcUrls() {
        return iframeSrcUrls;
    }

    public void setIframeSrcUrls(@javax.annotation.Nullable List<String> iframeSrcUrls) {
        this.iframeSrcUrls = iframeSrcUrls;
    }

    public CspSettingsInput imgSrcUrls(@javax.annotation.Nullable List<String> imgSrcUrls) {
        this.imgSrcUrls = imgSrcUrls;
        return this;
    }

    public CspSettingsInput addImgSrcUrlsItem(String imgSrcUrlsItem) {
        if (this.imgSrcUrls == null) {
            this.imgSrcUrls = new ArrayList<>();
        }
        this.imgSrcUrls.add(imgSrcUrlsItem);
        return this;
    }

    /**
     * Allowed URLs for img-src directive.
     *
     * @return imgSrcUrls
     */
    @javax.annotation.Nullable
    public List<String> getImgSrcUrls() {
        return imgSrcUrls;
    }

    public void setImgSrcUrls(@javax.annotation.Nullable List<String> imgSrcUrls) {
        this.imgSrcUrls = imgSrcUrls;
    }

    public CspSettingsInput scriptSrcUrls(
            @javax.annotation.Nullable ScriptSrcUrlsInput scriptSrcUrls) {
        this.scriptSrcUrls = scriptSrcUrls;
        return this;
    }

    /**
     * Get scriptSrcUrls
     *
     * @return scriptSrcUrls
     */
    @javax.annotation.Nullable
    public ScriptSrcUrlsInput getScriptSrcUrls() {
        return scriptSrcUrls;
    }

    public void setScriptSrcUrls(@javax.annotation.Nullable ScriptSrcUrlsInput scriptSrcUrls) {
        this.scriptSrcUrls = scriptSrcUrls;
    }

    public CspSettingsInput styleSrcUrls(@javax.annotation.Nullable List<String> styleSrcUrls) {
        this.styleSrcUrls = styleSrcUrls;
        return this;
    }

    public CspSettingsInput addStyleSrcUrlsItem(String styleSrcUrlsItem) {
        if (this.styleSrcUrls == null) {
            this.styleSrcUrls = new ArrayList<>();
        }
        this.styleSrcUrls.add(styleSrcUrlsItem);
        return this;
    }

    /**
     * Allowed URLs for style-src directive.
     *
     * @return styleSrcUrls
     */
    @javax.annotation.Nullable
    public List<String> getStyleSrcUrls() {
        return styleSrcUrls;
    }

    public void setStyleSrcUrls(@javax.annotation.Nullable List<String> styleSrcUrls) {
        this.styleSrcUrls = styleSrcUrls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CspSettingsInput cspSettingsInput = (CspSettingsInput) o;
        return Objects.equals(this.connectSrcUrls, cspSettingsInput.connectSrcUrls)
                && Objects.equals(this.fontSrcUrls, cspSettingsInput.fontSrcUrls)
                && Objects.equals(this.visualEmbedHosts, cspSettingsInput.visualEmbedHosts)
                && Objects.equals(this.iframeSrcUrls, cspSettingsInput.iframeSrcUrls)
                && Objects.equals(this.imgSrcUrls, cspSettingsInput.imgSrcUrls)
                && Objects.equals(this.scriptSrcUrls, cspSettingsInput.scriptSrcUrls)
                && Objects.equals(this.styleSrcUrls, cspSettingsInput.styleSrcUrls);
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
                connectSrcUrls,
                fontSrcUrls,
                visualEmbedHosts,
                iframeSrcUrls,
                imgSrcUrls,
                scriptSrcUrls,
                styleSrcUrls);
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
        sb.append("class CspSettingsInput {\n");
        sb.append("    connectSrcUrls: ").append(toIndentedString(connectSrcUrls)).append("\n");
        sb.append("    fontSrcUrls: ").append(toIndentedString(fontSrcUrls)).append("\n");
        sb.append("    visualEmbedHosts: ").append(toIndentedString(visualEmbedHosts)).append("\n");
        sb.append("    iframeSrcUrls: ").append(toIndentedString(iframeSrcUrls)).append("\n");
        sb.append("    imgSrcUrls: ").append(toIndentedString(imgSrcUrls)).append("\n");
        sb.append("    scriptSrcUrls: ").append(toIndentedString(scriptSrcUrls)).append("\n");
        sb.append("    styleSrcUrls: ").append(toIndentedString(styleSrcUrls)).append("\n");
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
        openapiFields.add("connect_src_urls");
        openapiFields.add("font_src_urls");
        openapiFields.add("visual_embed_hosts");
        openapiFields.add("iframe_src_urls");
        openapiFields.add("img_src_urls");
        openapiFields.add("script_src_urls");
        openapiFields.add("style_src_urls");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CspSettingsInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CspSettingsInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CspSettingsInput is not found in the"
                                        + " empty JSON string",
                                CspSettingsInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CspSettingsInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CspSettingsInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("connect_src_urls") != null
                && !jsonObj.get("connect_src_urls").isJsonNull()
                && !jsonObj.get("connect_src_urls").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `connect_src_urls` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("connect_src_urls").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("font_src_urls") != null
                && !jsonObj.get("font_src_urls").isJsonNull()
                && !jsonObj.get("font_src_urls").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `font_src_urls` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("font_src_urls").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("visual_embed_hosts") != null
                && !jsonObj.get("visual_embed_hosts").isJsonNull()
                && !jsonObj.get("visual_embed_hosts").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `visual_embed_hosts` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("visual_embed_hosts").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("iframe_src_urls") != null
                && !jsonObj.get("iframe_src_urls").isJsonNull()
                && !jsonObj.get("iframe_src_urls").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `iframe_src_urls` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("iframe_src_urls").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("img_src_urls") != null
                && !jsonObj.get("img_src_urls").isJsonNull()
                && !jsonObj.get("img_src_urls").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `img_src_urls` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("img_src_urls").toString()));
        }
        // validate the optional field `script_src_urls`
        if (jsonObj.get("script_src_urls") != null
                && !jsonObj.get("script_src_urls").isJsonNull()) {
            ScriptSrcUrlsInput.validateJsonElement(jsonObj.get("script_src_urls"));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("style_src_urls") != null
                && !jsonObj.get("style_src_urls").isJsonNull()
                && !jsonObj.get("style_src_urls").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `style_src_urls` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("style_src_urls").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CspSettingsInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CspSettingsInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CspSettingsInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CspSettingsInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CspSettingsInput>() {
                        @Override
                        public void write(JsonWriter out, CspSettingsInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CspSettingsInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CspSettingsInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CspSettingsInput
     * @throws IOException if the JSON string is invalid with respect to CspSettingsInput
     */
    public static CspSettingsInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CspSettingsInput.class);
    }

    /**
     * Convert an instance of CspSettingsInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
