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
 * Options for PDF export.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-08T19:10:59.327084+05:30[Asia/Kolkata]")
public class SchedulesPdfOptionsInput {
  public static final String SERIALIZED_NAME_COMPLETE_LIVEBOARD = "complete_liveboard";
  @SerializedName(SERIALIZED_NAME_COMPLETE_LIVEBOARD)
  private Boolean completeLiveboard;

  public static final String SERIALIZED_NAME_INCLUDE_COVER_PAGE = "include_cover_page";
  @SerializedName(SERIALIZED_NAME_INCLUDE_COVER_PAGE)
  private Boolean includeCoverPage;

  public static final String SERIALIZED_NAME_INCLUDE_CUSTOM_LOGO = "include_custom_logo";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CUSTOM_LOGO)
  private Boolean includeCustomLogo;

  public static final String SERIALIZED_NAME_INCLUDE_FILTER_PAGE = "include_filter_page";
  @SerializedName(SERIALIZED_NAME_INCLUDE_FILTER_PAGE)
  private Boolean includeFilterPage;

  public static final String SERIALIZED_NAME_INCLUDE_PAGE_NUMBER = "include_page_number";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PAGE_NUMBER)
  private Boolean includePageNumber;

  public static final String SERIALIZED_NAME_PAGE_FOOTER_TEXT = "page_footer_text";
  @SerializedName(SERIALIZED_NAME_PAGE_FOOTER_TEXT)
  private String pageFooterText;

  public static final String SERIALIZED_NAME_PAGE_ORIENTATION = "page_orientation";
  @SerializedName(SERIALIZED_NAME_PAGE_ORIENTATION)
  private String pageOrientation;

  /**
   * Page size.
   */
  @JsonAdapter(PageSizeEnum.Adapter.class)
  public enum PageSizeEnum {
    A4("A4");

    private String value;

    PageSizeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PageSizeEnum fromValue(String value) {
      for (PageSizeEnum b : PageSizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PageSizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PageSizeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PageSizeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PageSizeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private PageSizeEnum pageSize;

  public static final String SERIALIZED_NAME_TRUNCATE_TABLE = "truncate_table";
  @SerializedName(SERIALIZED_NAME_TRUNCATE_TABLE)
  private Boolean truncateTable;

  public SchedulesPdfOptionsInput() {
  }

  public SchedulesPdfOptionsInput completeLiveboard(Boolean completeLiveboard) {
    
    this.completeLiveboard = completeLiveboard;
    return this;
  }

   /**
   * Indicates whether to include complete Liveboard.
   * @return completeLiveboard
  **/
  @javax.annotation.Nullable
  public Boolean getCompleteLiveboard() {
    return completeLiveboard;
  }


  public void setCompleteLiveboard(Boolean completeLiveboard) {
    this.completeLiveboard = completeLiveboard;
  }


  public SchedulesPdfOptionsInput includeCoverPage(Boolean includeCoverPage) {
    
    this.includeCoverPage = includeCoverPage;
    return this;
  }

   /**
   * Indicates whether to include cover page with the Liveboard title.
   * @return includeCoverPage
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeCoverPage() {
    return includeCoverPage;
  }


  public void setIncludeCoverPage(Boolean includeCoverPage) {
    this.includeCoverPage = includeCoverPage;
  }


  public SchedulesPdfOptionsInput includeCustomLogo(Boolean includeCustomLogo) {
    
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


  public SchedulesPdfOptionsInput includeFilterPage(Boolean includeFilterPage) {
    
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


  public SchedulesPdfOptionsInput includePageNumber(Boolean includePageNumber) {
    
    this.includePageNumber = includePageNumber;
    return this;
  }

   /**
   * Indicates whether to include page number in the footer of each page
   * @return includePageNumber
  **/
  @javax.annotation.Nullable
  public Boolean getIncludePageNumber() {
    return includePageNumber;
  }


  public void setIncludePageNumber(Boolean includePageNumber) {
    this.includePageNumber = includePageNumber;
  }


  public SchedulesPdfOptionsInput pageFooterText(String pageFooterText) {
    
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


  public SchedulesPdfOptionsInput pageOrientation(String pageOrientation) {
    
    this.pageOrientation = pageOrientation;
    return this;
  }

   /**
   * Page orientation of the PDF.
   * @return pageOrientation
  **/
  @javax.annotation.Nullable
  public String getPageOrientation() {
    return pageOrientation;
  }


  public void setPageOrientation(String pageOrientation) {
    this.pageOrientation = pageOrientation;
  }


  public SchedulesPdfOptionsInput pageSize(PageSizeEnum pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Page size.
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public PageSizeEnum getPageSize() {
    return pageSize;
  }


  public void setPageSize(PageSizeEnum pageSize) {
    this.pageSize = pageSize;
  }


  public SchedulesPdfOptionsInput truncateTable(Boolean truncateTable) {
    
    this.truncateTable = truncateTable;
    return this;
  }

   /**
   * Indicates whether to include only first page of the tables.
   * @return truncateTable
  **/
  @javax.annotation.Nullable
  public Boolean getTruncateTable() {
    return truncateTable;
  }


  public void setTruncateTable(Boolean truncateTable) {
    this.truncateTable = truncateTable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulesPdfOptionsInput schedulesPdfOptionsInput = (SchedulesPdfOptionsInput) o;
    return Objects.equals(this.completeLiveboard, schedulesPdfOptionsInput.completeLiveboard) &&
        Objects.equals(this.includeCoverPage, schedulesPdfOptionsInput.includeCoverPage) &&
        Objects.equals(this.includeCustomLogo, schedulesPdfOptionsInput.includeCustomLogo) &&
        Objects.equals(this.includeFilterPage, schedulesPdfOptionsInput.includeFilterPage) &&
        Objects.equals(this.includePageNumber, schedulesPdfOptionsInput.includePageNumber) &&
        Objects.equals(this.pageFooterText, schedulesPdfOptionsInput.pageFooterText) &&
        Objects.equals(this.pageOrientation, schedulesPdfOptionsInput.pageOrientation) &&
        Objects.equals(this.pageSize, schedulesPdfOptionsInput.pageSize) &&
        Objects.equals(this.truncateTable, schedulesPdfOptionsInput.truncateTable);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(completeLiveboard, includeCoverPage, includeCustomLogo, includeFilterPage, includePageNumber, pageFooterText, pageOrientation, pageSize, truncateTable);
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
    sb.append("class SchedulesPdfOptionsInput {\n");
    sb.append("    completeLiveboard: ").append(toIndentedString(completeLiveboard)).append("\n");
    sb.append("    includeCoverPage: ").append(toIndentedString(includeCoverPage)).append("\n");
    sb.append("    includeCustomLogo: ").append(toIndentedString(includeCustomLogo)).append("\n");
    sb.append("    includeFilterPage: ").append(toIndentedString(includeFilterPage)).append("\n");
    sb.append("    includePageNumber: ").append(toIndentedString(includePageNumber)).append("\n");
    sb.append("    pageFooterText: ").append(toIndentedString(pageFooterText)).append("\n");
    sb.append("    pageOrientation: ").append(toIndentedString(pageOrientation)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    truncateTable: ").append(toIndentedString(truncateTable)).append("\n");
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
    openapiFields.add("complete_liveboard");
    openapiFields.add("include_cover_page");
    openapiFields.add("include_custom_logo");
    openapiFields.add("include_filter_page");
    openapiFields.add("include_page_number");
    openapiFields.add("page_footer_text");
    openapiFields.add("page_orientation");
    openapiFields.add("page_size");
    openapiFields.add("truncate_table");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SchedulesPdfOptionsInput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SchedulesPdfOptionsInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SchedulesPdfOptionsInput is not found in the empty JSON string", SchedulesPdfOptionsInput.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SchedulesPdfOptionsInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SchedulesPdfOptionsInput` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("page_footer_text") != null && !jsonObj.get("page_footer_text").isJsonNull()) && !jsonObj.get("page_footer_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_footer_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_footer_text").toString()));
      }
      if ((jsonObj.get("page_orientation") != null && !jsonObj.get("page_orientation").isJsonNull()) && !jsonObj.get("page_orientation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_orientation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_orientation").toString()));
      }
      if ((jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonNull()) && !jsonObj.get("page_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_size").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SchedulesPdfOptionsInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SchedulesPdfOptionsInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SchedulesPdfOptionsInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SchedulesPdfOptionsInput.class));

       return (TypeAdapter<T>) new TypeAdapter<SchedulesPdfOptionsInput>() {
           @Override
           public void write(JsonWriter out, SchedulesPdfOptionsInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SchedulesPdfOptionsInput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SchedulesPdfOptionsInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SchedulesPdfOptionsInput
  * @throws IOException if the JSON string is invalid with respect to SchedulesPdfOptionsInput
  */
  public static SchedulesPdfOptionsInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SchedulesPdfOptionsInput.class);
  }

 /**
  * Convert an instance of SchedulesPdfOptionsInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

