/*
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.thoughtspot.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.thoughtspot.client.JSON;

/**
 * PdfOptionsInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-11T22:39:20.023683-08:00[America/Los_Angeles]")
public class PdfOptionsInput {
  public static final String SERIALIZED_NAME_INCLUDE_COVER_PAGE = "include_cover_page";
  @SerializedName(SERIALIZED_NAME_INCLUDE_COVER_PAGE)
  private Boolean includeCoverPage = true;

  public static final String SERIALIZED_NAME_INCLUDE_CUSTOM_LOGO = "include_custom_logo";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CUSTOM_LOGO)
  private Boolean includeCustomLogo = true;

  public static final String SERIALIZED_NAME_INCLUDE_FILTER_PAGE = "include_filter_page";
  @SerializedName(SERIALIZED_NAME_INCLUDE_FILTER_PAGE)
  private Boolean includeFilterPage = true;

  public static final String SERIALIZED_NAME_INCLUDE_PAGE_NUMBER = "include_page_number";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PAGE_NUMBER)
  private Boolean includePageNumber = true;

  /**
   * Page orientation of the PDF.
   */
  @JsonAdapter(PageOrientationEnum.Adapter.class)
  public enum PageOrientationEnum {
    PORTRAIT("PORTRAIT"),
    
    LANDSCAPE("LANDSCAPE");

    private String value;

    PageOrientationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PageOrientationEnum fromValue(String value) {
      for (PageOrientationEnum b : PageOrientationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PageOrientationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PageOrientationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PageOrientationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PageOrientationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAGE_ORIENTATION = "page_orientation";
  @SerializedName(SERIALIZED_NAME_PAGE_ORIENTATION)
  private PageOrientationEnum pageOrientation = PageOrientationEnum.PORTRAIT;

  public static final String SERIALIZED_NAME_TRUNCATE_TABLE = "truncate_table";
  @SerializedName(SERIALIZED_NAME_TRUNCATE_TABLE)
  private Boolean truncateTable = false;

  public static final String SERIALIZED_NAME_PAGE_FOOTER_TEXT = "page_footer_text";
  @SerializedName(SERIALIZED_NAME_PAGE_FOOTER_TEXT)
  private String pageFooterText;

  public PdfOptionsInput() {
  }

  public PdfOptionsInput includeCoverPage(Boolean includeCoverPage) {
    
    this.includeCoverPage = includeCoverPage;
    return this;
  }

   /**
   * Indicates whether to include the cover page with the Liveboard title.
   * @return includeCoverPage
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeCoverPage() {
    return includeCoverPage;
  }


  public void setIncludeCoverPage(Boolean includeCoverPage) {
    this.includeCoverPage = includeCoverPage;
  }


  public PdfOptionsInput includeCustomLogo(Boolean includeCustomLogo) {
    
    this.includeCustomLogo = includeCustomLogo;
    return this;
  }

   /**
   * Indicates whether to include customized wide logo in the footer if available.
   * @return includeCustomLogo
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeCustomLogo() {
    return includeCustomLogo;
  }


  public void setIncludeCustomLogo(Boolean includeCustomLogo) {
    this.includeCustomLogo = includeCustomLogo;
  }


  public PdfOptionsInput includeFilterPage(Boolean includeFilterPage) {
    
    this.includeFilterPage = includeFilterPage;
    return this;
  }

   /**
   * Indicates whether to include a page with all applied filters.
   * @return includeFilterPage
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeFilterPage() {
    return includeFilterPage;
  }


  public void setIncludeFilterPage(Boolean includeFilterPage) {
    this.includeFilterPage = includeFilterPage;
  }


  public PdfOptionsInput includePageNumber(Boolean includePageNumber) {
    
    this.includePageNumber = includePageNumber;
    return this;
  }

   /**
   * Indicates whether to include page number in the footer of each page.
   * @return includePageNumber
  **/
  @javax.annotation.Nullable
  public Boolean getIncludePageNumber() {
    return includePageNumber;
  }


  public void setIncludePageNumber(Boolean includePageNumber) {
    this.includePageNumber = includePageNumber;
  }


  public PdfOptionsInput pageOrientation(PageOrientationEnum pageOrientation) {
    
    this.pageOrientation = pageOrientation;
    return this;
  }

   /**
   * Page orientation of the PDF.
   * @return pageOrientation
  **/
  @javax.annotation.Nullable
  public PageOrientationEnum getPageOrientation() {
    return pageOrientation;
  }


  public void setPageOrientation(PageOrientationEnum pageOrientation) {
    this.pageOrientation = pageOrientation;
  }


  public PdfOptionsInput truncateTable(Boolean truncateTable) {
    
    this.truncateTable = truncateTable;
    return this;
  }

   /**
   * Indicates whether to include only the first page of the tables.
   * @return truncateTable
  **/
  @javax.annotation.Nullable
  public Boolean getTruncateTable() {
    return truncateTable;
  }


  public void setTruncateTable(Boolean truncateTable) {
    this.truncateTable = truncateTable;
  }


  public PdfOptionsInput pageFooterText(String pageFooterText) {
    
    this.pageFooterText = pageFooterText;
    return this;
  }

   /**
   * Text to include in the footer of each page.
   * @return pageFooterText
  **/
  @javax.annotation.Nullable
  public String getPageFooterText() {
    return pageFooterText;
  }


  public void setPageFooterText(String pageFooterText) {
    this.pageFooterText = pageFooterText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfOptionsInput pdfOptionsInput = (PdfOptionsInput) o;
    return Objects.equals(this.includeCoverPage, pdfOptionsInput.includeCoverPage) &&
        Objects.equals(this.includeCustomLogo, pdfOptionsInput.includeCustomLogo) &&
        Objects.equals(this.includeFilterPage, pdfOptionsInput.includeFilterPage) &&
        Objects.equals(this.includePageNumber, pdfOptionsInput.includePageNumber) &&
        Objects.equals(this.pageOrientation, pdfOptionsInput.pageOrientation) &&
        Objects.equals(this.truncateTable, pdfOptionsInput.truncateTable) &&
        Objects.equals(this.pageFooterText, pdfOptionsInput.pageFooterText);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeCoverPage, includeCustomLogo, includeFilterPage, includePageNumber, pageOrientation, truncateTable, pageFooterText);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfOptionsInput {\n");
    sb.append("    includeCoverPage: ").append(toIndentedString(includeCoverPage)).append("\n");
    sb.append("    includeCustomLogo: ").append(toIndentedString(includeCustomLogo)).append("\n");
    sb.append("    includeFilterPage: ").append(toIndentedString(includeFilterPage)).append("\n");
    sb.append("    includePageNumber: ").append(toIndentedString(includePageNumber)).append("\n");
    sb.append("    pageOrientation: ").append(toIndentedString(pageOrientation)).append("\n");
    sb.append("    truncateTable: ").append(toIndentedString(truncateTable)).append("\n");
    sb.append("    pageFooterText: ").append(toIndentedString(pageFooterText)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
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
    openapiFields.add("include_custom_logo");
    openapiFields.add("include_filter_page");
    openapiFields.add("include_page_number");
    openapiFields.add("page_orientation");
    openapiFields.add("truncate_table");
    openapiFields.add("page_footer_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PdfOptionsInput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PdfOptionsInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PdfOptionsInput is not found in the empty JSON string", PdfOptionsInput.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PdfOptionsInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PdfOptionsInput` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("page_orientation") != null && !jsonObj.get("page_orientation").isJsonNull()) && !jsonObj.get("page_orientation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_orientation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_orientation").toString()));
      }
      if ((jsonObj.get("page_footer_text") != null && !jsonObj.get("page_footer_text").isJsonNull()) && !jsonObj.get("page_footer_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_footer_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_footer_text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PdfOptionsInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PdfOptionsInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PdfOptionsInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PdfOptionsInput.class));

       return (TypeAdapter<T>) new TypeAdapter<PdfOptionsInput>() {
           @Override
           public void write(JsonWriter out, PdfOptionsInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PdfOptionsInput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PdfOptionsInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PdfOptionsInput
  * @throws IOException if the JSON string is invalid with respect to PdfOptionsInput
  */
  public static PdfOptionsInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PdfOptionsInput.class);
  }

 /**
  * Convert an instance of PdfOptionsInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

