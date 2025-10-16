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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** PngOptionsInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class PngOptionsInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_INCLUDE_COVER_PAGE = "include_cover_page";

    @SerializedName(SERIALIZED_NAME_INCLUDE_COVER_PAGE)
    @javax.annotation.Nullable
    private Boolean includeCoverPage = false;

    public static final String SERIALIZED_NAME_INCLUDE_FILTER_PAGE = "include_filter_page";

    @SerializedName(SERIALIZED_NAME_INCLUDE_FILTER_PAGE)
    @javax.annotation.Nullable
    private Boolean includeFilterPage = false;

    public static final String SERIALIZED_NAME_PERSONALISED_VIEW_ID = "personalised_view_id";

    @SerializedName(SERIALIZED_NAME_PERSONALISED_VIEW_ID)
    @javax.annotation.Nullable
    private String personalisedViewId;

    public static final String SERIALIZED_NAME_IMAGE_RESOLUTION = "image_resolution";

    @SerializedName(SERIALIZED_NAME_IMAGE_RESOLUTION)
    @javax.annotation.Nullable
    private Integer imageResolution;

    public static final String SERIALIZED_NAME_IMAGE_SCALE = "image_scale";

    @SerializedName(SERIALIZED_NAME_IMAGE_SCALE)
    @javax.annotation.Nullable
    private Integer imageScale;

    public static final String SERIALIZED_NAME_INCLUDE_HEADER = "include_header";

    @SerializedName(SERIALIZED_NAME_INCLUDE_HEADER)
    @javax.annotation.Nullable
    private Boolean includeHeader = false;

    public PngOptionsInput() {}

    public PngOptionsInput includeCoverPage(@javax.annotation.Nullable Boolean includeCoverPage) {
        this.includeCoverPage = includeCoverPage;
        return this;
    }

    /**
     * Indicates whether to include the cover page with the Liveboard title.
     *
     * @return includeCoverPage
     */
    @javax.annotation.Nullable
    public Boolean getIncludeCoverPage() {
        return includeCoverPage;
    }

    public void setIncludeCoverPage(@javax.annotation.Nullable Boolean includeCoverPage) {
        this.includeCoverPage = includeCoverPage;
    }

    public PngOptionsInput includeFilterPage(@javax.annotation.Nullable Boolean includeFilterPage) {
        this.includeFilterPage = includeFilterPage;
        return this;
    }

    /**
     * Indicates whether to include a page with all applied filters.
     *
     * @return includeFilterPage
     */
    @javax.annotation.Nullable
    public Boolean getIncludeFilterPage() {
        return includeFilterPage;
    }

    public void setIncludeFilterPage(@javax.annotation.Nullable Boolean includeFilterPage) {
        this.includeFilterPage = includeFilterPage;
    }

    public PngOptionsInput personalisedViewId(
            @javax.annotation.Nullable String personalisedViewId) {
        this.personalisedViewId = personalisedViewId;
        return this;
    }

    /**
     * Indicates personalised view of the Liveboard in case of png
     *
     * @return personalisedViewId
     */
    @javax.annotation.Nullable
    public String getPersonalisedViewId() {
        return personalisedViewId;
    }

    public void setPersonalisedViewId(@javax.annotation.Nullable String personalisedViewId) {
        this.personalisedViewId = personalisedViewId;
    }

    public PngOptionsInput imageResolution(@javax.annotation.Nullable Integer imageResolution) {
        this.imageResolution = imageResolution;
        return this;
    }

    /**
     * Desired width of the Liveboard image in pixels. Ex. 1920 for Full HD image Version: 10.9.0.cl
     * or later
     *
     * @return imageResolution
     */
    @javax.annotation.Nullable
    public Integer getImageResolution() {
        return imageResolution;
    }

    public void setImageResolution(@javax.annotation.Nullable Integer imageResolution) {
        this.imageResolution = imageResolution;
    }

    public PngOptionsInput imageScale(@javax.annotation.Nullable Integer imageScale) {
        this.imageScale = imageScale;
        return this;
    }

    /**
     * The scale of the image in percentage. Ex. 100 for 100% scale. Version: 10.9.0.cl or later
     *
     * @return imageScale
     */
    @javax.annotation.Nullable
    public Integer getImageScale() {
        return imageScale;
    }

    public void setImageScale(@javax.annotation.Nullable Integer imageScale) {
        this.imageScale = imageScale;
    }

    public PngOptionsInput includeHeader(@javax.annotation.Nullable Boolean includeHeader) {
        this.includeHeader = includeHeader;
        return this;
    }

    /**
     * Indicates whether to include the header of the liveboard. Version: 10.9.0.cl or later
     *
     * @return includeHeader
     */
    @javax.annotation.Nullable
    public Boolean getIncludeHeader() {
        return includeHeader;
    }

    public void setIncludeHeader(@javax.annotation.Nullable Boolean includeHeader) {
        this.includeHeader = includeHeader;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PngOptionsInput pngOptionsInput = (PngOptionsInput) o;
        return Objects.equals(this.includeCoverPage, pngOptionsInput.includeCoverPage)
                && Objects.equals(this.includeFilterPage, pngOptionsInput.includeFilterPage)
                && Objects.equals(this.personalisedViewId, pngOptionsInput.personalisedViewId)
                && Objects.equals(this.imageResolution, pngOptionsInput.imageResolution)
                && Objects.equals(this.imageScale, pngOptionsInput.imageScale)
                && Objects.equals(this.includeHeader, pngOptionsInput.includeHeader);
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
                includeCoverPage,
                includeFilterPage,
                personalisedViewId,
                imageResolution,
                imageScale,
                includeHeader);
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
        sb.append("class PngOptionsInput {\n");
        sb.append("    includeCoverPage: ").append(toIndentedString(includeCoverPage)).append("\n");
        sb.append("    includeFilterPage: ")
                .append(toIndentedString(includeFilterPage))
                .append("\n");
        sb.append("    personalisedViewId: ")
                .append(toIndentedString(personalisedViewId))
                .append("\n");
        sb.append("    imageResolution: ").append(toIndentedString(imageResolution)).append("\n");
        sb.append("    imageScale: ").append(toIndentedString(imageScale)).append("\n");
        sb.append("    includeHeader: ").append(toIndentedString(includeHeader)).append("\n");
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
        openapiFields.add("include_cover_page");
        openapiFields.add("include_filter_page");
        openapiFields.add("personalised_view_id");
        openapiFields.add("image_resolution");
        openapiFields.add("image_scale");
        openapiFields.add("include_header");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to PngOptionsInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PngOptionsInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in PngOptionsInput is not found in the"
                                        + " empty JSON string",
                                PngOptionsInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!PngOptionsInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `PngOptionsInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("personalised_view_id") != null
                        && !jsonObj.get("personalised_view_id").isJsonNull())
                && !jsonObj.get("personalised_view_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `personalised_view_id` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("personalised_view_id").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PngOptionsInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PngOptionsInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PngOptionsInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(PngOptionsInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<PngOptionsInput>() {
                        @Override
                        public void write(JsonWriter out, PngOptionsInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public PngOptionsInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of PngOptionsInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PngOptionsInput
     * @throws IOException if the JSON string is invalid with respect to PngOptionsInput
     */
    public static PngOptionsInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PngOptionsInput.class);
    }

    /**
     * Convert an instance of PngOptionsInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
