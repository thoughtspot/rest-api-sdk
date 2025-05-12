/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package org.thoughtspot.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.thoughtspot.client.model.RegionalSettingsInput;
import java.io.Serializable;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.thoughtspot.client.JSON;

/**
 * ExportAnswerReportRequest
 */

public class ExportAnswerReportRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_METADATA_IDENTIFIER = "metadata_identifier";
  @SerializedName(SERIALIZED_NAME_METADATA_IDENTIFIER)
  @javax.annotation.Nullable
  private String metadataIdentifier;

  public static final String SERIALIZED_NAME_SESSION_IDENTIFIER = "session_identifier";
  @SerializedName(SERIALIZED_NAME_SESSION_IDENTIFIER)
  @javax.annotation.Nullable
  private String sessionIdentifier;

  public static final String SERIALIZED_NAME_GENERATION_NUMBER = "generation_number";
  @SerializedName(SERIALIZED_NAME_GENERATION_NUMBER)
  @javax.annotation.Nullable
  private Integer generationNumber;

  /**
   * Export file format.
   */
  @JsonAdapter(FileFormatEnum.Adapter.class)
  public enum FileFormatEnum {
    CSV("CSV"),
    
    PDF("PDF"),
    
    XLSX("XLSX"),
    
    PNG("PNG");

    private String value;

    FileFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FileFormatEnum fromValue(String value) {
      for (FileFormatEnum b : FileFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FileFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FileFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FileFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FileFormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FileFormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FILE_FORMAT = "file_format";
  @SerializedName(SERIALIZED_NAME_FILE_FORMAT)
  @javax.annotation.Nullable
  private FileFormatEnum fileFormat = FileFormatEnum.CSV;

  public static final String SERIALIZED_NAME_RUNTIME_FILTER = "runtime_filter";
  @SerializedName(SERIALIZED_NAME_RUNTIME_FILTER)
  @javax.annotation.Nullable
  private Object runtimeFilter;

  public static final String SERIALIZED_NAME_RUNTIME_SORT = "runtime_sort";
  @SerializedName(SERIALIZED_NAME_RUNTIME_SORT)
  @javax.annotation.Nullable
  private Object runtimeSort;

  public static final String SERIALIZED_NAME_RUNTIME_PARAM_OVERRIDE = "runtime_param_override";
  @SerializedName(SERIALIZED_NAME_RUNTIME_PARAM_OVERRIDE)
  @javax.annotation.Nullable
  private Object runtimeParamOverride;

  public static final String SERIALIZED_NAME_REGIONAL_SETTINGS = "regional_settings";
  @SerializedName(SERIALIZED_NAME_REGIONAL_SETTINGS)
  @javax.annotation.Nullable
  private RegionalSettingsInput regionalSettings;

  public ExportAnswerReportRequest() {
  }

  public ExportAnswerReportRequest metadataIdentifier(@javax.annotation.Nullable String metadataIdentifier) {
    this.metadataIdentifier = metadataIdentifier;
    return this;
  }

  /**
   * Unique ID or name of the metadata object.
   * @return metadataIdentifier
   */
  @javax.annotation.Nullable
  public String getMetadataIdentifier() {
    return metadataIdentifier;
  }

  public void setMetadataIdentifier(@javax.annotation.Nullable String metadataIdentifier) {
    this.metadataIdentifier = metadataIdentifier;
  }


  public ExportAnswerReportRequest sessionIdentifier(@javax.annotation.Nullable String sessionIdentifier) {
    this.sessionIdentifier = sessionIdentifier;
    return this;
  }

  /**
   * Unique ID of the answer session.
   * @return sessionIdentifier
   */
  @javax.annotation.Nullable
  public String getSessionIdentifier() {
    return sessionIdentifier;
  }

  public void setSessionIdentifier(@javax.annotation.Nullable String sessionIdentifier) {
    this.sessionIdentifier = sessionIdentifier;
  }


  public ExportAnswerReportRequest generationNumber(@javax.annotation.Nullable Integer generationNumber) {
    this.generationNumber = generationNumber;
    return this;
  }

  /**
   * Generation number of the answer session.
   * @return generationNumber
   */
  @javax.annotation.Nullable
  public Integer getGenerationNumber() {
    return generationNumber;
  }

  public void setGenerationNumber(@javax.annotation.Nullable Integer generationNumber) {
    this.generationNumber = generationNumber;
  }


  public ExportAnswerReportRequest fileFormat(@javax.annotation.Nullable FileFormatEnum fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

  /**
   * Export file format.
   * @return fileFormat
   */
  @javax.annotation.Nullable
  public FileFormatEnum getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(@javax.annotation.Nullable FileFormatEnum fileFormat) {
    this.fileFormat = fileFormat;
  }


  public ExportAnswerReportRequest runtimeFilter(@javax.annotation.Nullable Object runtimeFilter) {
    this.runtimeFilter = runtimeFilter;
    return this;
  }

  /**
   * JSON string representing runtime filter. { col1:region, op1: EQ, val1: northeast }
   * @return runtimeFilter
   */
  @javax.annotation.Nullable
  public Object getRuntimeFilter() {
    return runtimeFilter;
  }

  public void setRuntimeFilter(@javax.annotation.Nullable Object runtimeFilter) {
    this.runtimeFilter = runtimeFilter;
  }


  public ExportAnswerReportRequest runtimeSort(@javax.annotation.Nullable Object runtimeSort) {
    this.runtimeSort = runtimeSort;
    return this;
  }

  /**
   * JSON string representing runtime sort. { sortCol1: region, asc1 :true, sortCol2 : date }
   * @return runtimeSort
   */
  @javax.annotation.Nullable
  public Object getRuntimeSort() {
    return runtimeSort;
  }

  public void setRuntimeSort(@javax.annotation.Nullable Object runtimeSort) {
    this.runtimeSort = runtimeSort;
  }


  public ExportAnswerReportRequest runtimeParamOverride(@javax.annotation.Nullable Object runtimeParamOverride) {
    this.runtimeParamOverride = runtimeParamOverride;
    return this;
  }

  /**
   * JSON object for setting values of parameters in runtime.
   * @return runtimeParamOverride
   */
  @javax.annotation.Nullable
  public Object getRuntimeParamOverride() {
    return runtimeParamOverride;
  }

  public void setRuntimeParamOverride(@javax.annotation.Nullable Object runtimeParamOverride) {
    this.runtimeParamOverride = runtimeParamOverride;
  }


  public ExportAnswerReportRequest regionalSettings(@javax.annotation.Nullable RegionalSettingsInput regionalSettings) {
    this.regionalSettings = regionalSettings;
    return this;
  }

  /**
   * Options for specific region specific overrides to support date/number/string/currency formatting.
   * @return regionalSettings
   */
  @javax.annotation.Nullable
  public RegionalSettingsInput getRegionalSettings() {
    return regionalSettings;
  }

  public void setRegionalSettings(@javax.annotation.Nullable RegionalSettingsInput regionalSettings) {
    this.regionalSettings = regionalSettings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportAnswerReportRequest exportAnswerReportRequest = (ExportAnswerReportRequest) o;
    return Objects.equals(this.metadataIdentifier, exportAnswerReportRequest.metadataIdentifier) &&
        Objects.equals(this.sessionIdentifier, exportAnswerReportRequest.sessionIdentifier) &&
        Objects.equals(this.generationNumber, exportAnswerReportRequest.generationNumber) &&
        Objects.equals(this.fileFormat, exportAnswerReportRequest.fileFormat) &&
        Objects.equals(this.runtimeFilter, exportAnswerReportRequest.runtimeFilter) &&
        Objects.equals(this.runtimeSort, exportAnswerReportRequest.runtimeSort) &&
        Objects.equals(this.runtimeParamOverride, exportAnswerReportRequest.runtimeParamOverride) &&
        Objects.equals(this.regionalSettings, exportAnswerReportRequest.regionalSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataIdentifier, sessionIdentifier, generationNumber, fileFormat, runtimeFilter, runtimeSort, runtimeParamOverride, regionalSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportAnswerReportRequest {\n");
    sb.append("    metadataIdentifier: ").append(toIndentedString(metadataIdentifier)).append("\n");
    sb.append("    sessionIdentifier: ").append(toIndentedString(sessionIdentifier)).append("\n");
    sb.append("    generationNumber: ").append(toIndentedString(generationNumber)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    runtimeFilter: ").append(toIndentedString(runtimeFilter)).append("\n");
    sb.append("    runtimeSort: ").append(toIndentedString(runtimeSort)).append("\n");
    sb.append("    runtimeParamOverride: ").append(toIndentedString(runtimeParamOverride)).append("\n");
    sb.append("    regionalSettings: ").append(toIndentedString(regionalSettings)).append("\n");
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
    openapiFields.add("metadata_identifier");
    openapiFields.add("session_identifier");
    openapiFields.add("generation_number");
    openapiFields.add("file_format");
    openapiFields.add("runtime_filter");
    openapiFields.add("runtime_sort");
    openapiFields.add("runtime_param_override");
    openapiFields.add("regional_settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ExportAnswerReportRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportAnswerReportRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportAnswerReportRequest is not found in the empty JSON string", ExportAnswerReportRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExportAnswerReportRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportAnswerReportRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("metadata_identifier") != null && !jsonObj.get("metadata_identifier").isJsonNull()) && !jsonObj.get("metadata_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata_identifier").toString()));
      }
      if ((jsonObj.get("session_identifier") != null && !jsonObj.get("session_identifier").isJsonNull()) && !jsonObj.get("session_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session_identifier").toString()));
      }
      if ((jsonObj.get("file_format") != null && !jsonObj.get("file_format").isJsonNull()) && !jsonObj.get("file_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_format").toString()));
      }
      // validate the optional field `file_format`
      if (jsonObj.get("file_format") != null && !jsonObj.get("file_format").isJsonNull()) {
        FileFormatEnum.validateJsonElement(jsonObj.get("file_format"));
      }
      // validate the optional field `regional_settings`
      if (jsonObj.get("regional_settings") != null && !jsonObj.get("regional_settings").isJsonNull()) {
        RegionalSettingsInput.validateJsonElement(jsonObj.get("regional_settings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportAnswerReportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportAnswerReportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportAnswerReportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportAnswerReportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportAnswerReportRequest>() {
           @Override
           public void write(JsonWriter out, ExportAnswerReportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportAnswerReportRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ExportAnswerReportRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExportAnswerReportRequest
   * @throws IOException if the JSON string is invalid with respect to ExportAnswerReportRequest
   */
  public static ExportAnswerReportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportAnswerReportRequest.class);
  }

  /**
   * Convert an instance of ExportAnswerReportRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

