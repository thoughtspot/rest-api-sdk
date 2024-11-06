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
 * Options for PNG export.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-06T15:42:43.362610+05:30[Asia/Kolkata]")
public class ExportLiveboardReportRequestPngOptions {
  public static final String SERIALIZED_NAME_INCLUDE_COVER_PAGE = "include_cover_page";
  @SerializedName(SERIALIZED_NAME_INCLUDE_COVER_PAGE)
  private Boolean includeCoverPage = false;

  public static final String SERIALIZED_NAME_INCLUDE_FILTER_PAGE = "include_filter_page";
  @SerializedName(SERIALIZED_NAME_INCLUDE_FILTER_PAGE)
  private Boolean includeFilterPage = false;

  public ExportLiveboardReportRequestPngOptions() {
  }

  public ExportLiveboardReportRequestPngOptions includeCoverPage(Boolean includeCoverPage) {
    
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


  public ExportLiveboardReportRequestPngOptions includeFilterPage(Boolean includeFilterPage) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportLiveboardReportRequestPngOptions exportLiveboardReportRequestPngOptions = (ExportLiveboardReportRequestPngOptions) o;
    return Objects.equals(this.includeCoverPage, exportLiveboardReportRequestPngOptions.includeCoverPage) &&
        Objects.equals(this.includeFilterPage, exportLiveboardReportRequestPngOptions.includeFilterPage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeCoverPage, includeFilterPage);
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
    sb.append("class ExportLiveboardReportRequestPngOptions {\n");
    sb.append("    includeCoverPage: ").append(toIndentedString(includeCoverPage)).append("\n");
    sb.append("    includeFilterPage: ").append(toIndentedString(includeFilterPage)).append("\n");
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
    openapiFields.add("include_filter_page");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExportLiveboardReportRequestPngOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExportLiveboardReportRequestPngOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportLiveboardReportRequestPngOptions is not found in the empty JSON string", ExportLiveboardReportRequestPngOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExportLiveboardReportRequestPngOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportLiveboardReportRequestPngOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportLiveboardReportRequestPngOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportLiveboardReportRequestPngOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportLiveboardReportRequestPngOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportLiveboardReportRequestPngOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportLiveboardReportRequestPngOptions>() {
           @Override
           public void write(JsonWriter out, ExportLiveboardReportRequestPngOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportLiveboardReportRequestPngOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExportLiveboardReportRequestPngOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExportLiveboardReportRequestPngOptions
  * @throws IOException if the JSON string is invalid with respect to ExportLiveboardReportRequestPngOptions
  */
  public static ExportLiveboardReportRequestPngOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportLiveboardReportRequestPngOptions.class);
  }

 /**
  * Convert an instance of ExportLiveboardReportRequestPngOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

