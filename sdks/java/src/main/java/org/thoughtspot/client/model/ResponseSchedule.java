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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.thoughtspot.client.model.Author;
import org.thoughtspot.client.model.Frequency;
import org.thoughtspot.client.model.LiveboardOptions;
import org.thoughtspot.client.model.MetadataResponse;
import org.thoughtspot.client.model.PdfOptions;
import org.thoughtspot.client.model.RecipientDetails;
import org.thoughtspot.client.model.ResponseScheduleRun;

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
 * ResponseSchedule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T04:47:40.356396673Z[Etc/UTC]")
public class ResponseSchedule {
  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private Author author;

  public static final String SERIALIZED_NAME_CREATION_TIME_IN_MILLIS = "creation_time_in_millis";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME_IN_MILLIS)
  private Object creationTimeInMillis;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FILE_FORMAT = "file_format";
  @SerializedName(SERIALIZED_NAME_FILE_FORMAT)
  private String fileFormat;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private Frequency frequency;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LIVEBOARD_OPTIONS = "liveboard_options";
  @SerializedName(SERIALIZED_NAME_LIVEBOARD_OPTIONS)
  private LiveboardOptions liveboardOptions;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private MetadataResponse metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PDF_OPTIONS = "pdf_options";
  @SerializedName(SERIALIZED_NAME_PDF_OPTIONS)
  private PdfOptions pdfOptions;

  public static final String SERIALIZED_NAME_RECIPIENT_DETAILS = "recipient_details";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_DETAILS)
  private RecipientDetails recipientDetails;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TIME_ZONE = "time_zone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public static final String SERIALIZED_NAME_HISTORY_RUNS = "history_runs";
  @SerializedName(SERIALIZED_NAME_HISTORY_RUNS)
  private List<ResponseScheduleRun> historyRuns;

  public ResponseSchedule() {
  }

  public ResponseSchedule author(Author author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nonnull
  public Author getAuthor() {
    return author;
  }


  public void setAuthor(Author author) {
    this.author = author;
  }


  public ResponseSchedule creationTimeInMillis(Object creationTimeInMillis) {
    
    this.creationTimeInMillis = creationTimeInMillis;
    return this;
  }

   /**
   * Schedule creation time in milliseconds.
   * @return creationTimeInMillis
  **/
  @javax.annotation.Nonnull
  public Object getCreationTimeInMillis() {
    return creationTimeInMillis;
  }


  public void setCreationTimeInMillis(Object creationTimeInMillis) {
    this.creationTimeInMillis = creationTimeInMillis;
  }


  public ResponseSchedule description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the job.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ResponseSchedule fileFormat(String fileFormat) {
    
    this.fileFormat = fileFormat;
    return this;
  }

   /**
   * Export file format.
   * @return fileFormat
  **/
  @javax.annotation.Nonnull
  public String getFileFormat() {
    return fileFormat;
  }


  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }


  public ResponseSchedule frequency(Frequency frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nonnull
  public Frequency getFrequency() {
    return frequency;
  }


  public void setFrequency(Frequency frequency) {
    this.frequency = frequency;
  }


  public ResponseSchedule id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * GUID of the scheduled job.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ResponseSchedule liveboardOptions(LiveboardOptions liveboardOptions) {
    
    this.liveboardOptions = liveboardOptions;
    return this;
  }

   /**
   * Get liveboardOptions
   * @return liveboardOptions
  **/
  @javax.annotation.Nullable
  public LiveboardOptions getLiveboardOptions() {
    return liveboardOptions;
  }


  public void setLiveboardOptions(LiveboardOptions liveboardOptions) {
    this.liveboardOptions = liveboardOptions;
  }


  public ResponseSchedule metadata(MetadataResponse metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  public MetadataResponse getMetadata() {
    return metadata;
  }


  public void setMetadata(MetadataResponse metadata) {
    this.metadata = metadata;
  }


  public ResponseSchedule name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the scheduled job.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ResponseSchedule pdfOptions(PdfOptions pdfOptions) {
    
    this.pdfOptions = pdfOptions;
    return this;
  }

   /**
   * Get pdfOptions
   * @return pdfOptions
  **/
  @javax.annotation.Nullable
  public PdfOptions getPdfOptions() {
    return pdfOptions;
  }


  public void setPdfOptions(PdfOptions pdfOptions) {
    this.pdfOptions = pdfOptions;
  }


  public ResponseSchedule recipientDetails(RecipientDetails recipientDetails) {
    
    this.recipientDetails = recipientDetails;
    return this;
  }

   /**
   * Get recipientDetails
   * @return recipientDetails
  **/
  @javax.annotation.Nonnull
  public RecipientDetails getRecipientDetails() {
    return recipientDetails;
  }


  public void setRecipientDetails(RecipientDetails recipientDetails) {
    this.recipientDetails = recipientDetails;
  }


  public ResponseSchedule status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the job
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ResponseSchedule timeZone(String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Time zone
   * @return timeZone
  **/
  @javax.annotation.Nonnull
  public String getTimeZone() {
    return timeZone;
  }


  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  public ResponseSchedule historyRuns(List<ResponseScheduleRun> historyRuns) {
    
    this.historyRuns = historyRuns;
    return this;
  }

  public ResponseSchedule addHistoryRunsItem(ResponseScheduleRun historyRunsItem) {
    if (this.historyRuns == null) {
      this.historyRuns = new ArrayList<>();
    }
    this.historyRuns.add(historyRunsItem);
    return this;
  }

   /**
   * Schedule runs history records.
   * @return historyRuns
  **/
  @javax.annotation.Nullable
  public List<ResponseScheduleRun> getHistoryRuns() {
    return historyRuns;
  }


  public void setHistoryRuns(List<ResponseScheduleRun> historyRuns) {
    this.historyRuns = historyRuns;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseSchedule responseSchedule = (ResponseSchedule) o;
    return Objects.equals(this.author, responseSchedule.author) &&
        Objects.equals(this.creationTimeInMillis, responseSchedule.creationTimeInMillis) &&
        Objects.equals(this.description, responseSchedule.description) &&
        Objects.equals(this.fileFormat, responseSchedule.fileFormat) &&
        Objects.equals(this.frequency, responseSchedule.frequency) &&
        Objects.equals(this.id, responseSchedule.id) &&
        Objects.equals(this.liveboardOptions, responseSchedule.liveboardOptions) &&
        Objects.equals(this.metadata, responseSchedule.metadata) &&
        Objects.equals(this.name, responseSchedule.name) &&
        Objects.equals(this.pdfOptions, responseSchedule.pdfOptions) &&
        Objects.equals(this.recipientDetails, responseSchedule.recipientDetails) &&
        Objects.equals(this.status, responseSchedule.status) &&
        Objects.equals(this.timeZone, responseSchedule.timeZone) &&
        Objects.equals(this.historyRuns, responseSchedule.historyRuns);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, creationTimeInMillis, description, fileFormat, frequency, id, liveboardOptions, metadata, name, pdfOptions, recipientDetails, status, timeZone, historyRuns);
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
    sb.append("class ResponseSchedule {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    creationTimeInMillis: ").append(toIndentedString(creationTimeInMillis)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    liveboardOptions: ").append(toIndentedString(liveboardOptions)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pdfOptions: ").append(toIndentedString(pdfOptions)).append("\n");
    sb.append("    recipientDetails: ").append(toIndentedString(recipientDetails)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    historyRuns: ").append(toIndentedString(historyRuns)).append("\n");
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
    openapiFields.add("author");
    openapiFields.add("creation_time_in_millis");
    openapiFields.add("description");
    openapiFields.add("file_format");
    openapiFields.add("frequency");
    openapiFields.add("id");
    openapiFields.add("liveboard_options");
    openapiFields.add("metadata");
    openapiFields.add("name");
    openapiFields.add("pdf_options");
    openapiFields.add("recipient_details");
    openapiFields.add("status");
    openapiFields.add("time_zone");
    openapiFields.add("history_runs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("author");
    openapiRequiredFields.add("creation_time_in_millis");
    openapiRequiredFields.add("file_format");
    openapiRequiredFields.add("frequency");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("recipient_details");
    openapiRequiredFields.add("time_zone");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResponseSchedule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResponseSchedule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResponseSchedule is not found in the empty JSON string", ResponseSchedule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResponseSchedule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResponseSchedule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResponseSchedule.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `author`
      Author.validateJsonObject(jsonObj.getAsJsonObject("author"));
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("file_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_format").toString()));
      }
      // validate the required field `frequency`
      Frequency.validateJsonObject(jsonObj.getAsJsonObject("frequency"));
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `liveboard_options`
      if (jsonObj.get("liveboard_options") != null && !jsonObj.get("liveboard_options").isJsonNull()) {
        LiveboardOptions.validateJsonObject(jsonObj.getAsJsonObject("liveboard_options"));
      }
      // validate the required field `metadata`
      MetadataResponse.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `pdf_options`
      if (jsonObj.get("pdf_options") != null && !jsonObj.get("pdf_options").isJsonNull()) {
        PdfOptions.validateJsonObject(jsonObj.getAsJsonObject("pdf_options"));
      }
      // validate the required field `recipient_details`
      RecipientDetails.validateJsonObject(jsonObj.getAsJsonObject("recipient_details"));
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("time_zone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_zone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_zone").toString()));
      }
      if (jsonObj.get("history_runs") != null && !jsonObj.get("history_runs").isJsonNull()) {
        JsonArray jsonArrayhistoryRuns = jsonObj.getAsJsonArray("history_runs");
        if (jsonArrayhistoryRuns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("history_runs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `history_runs` to be an array in the JSON string but got `%s`", jsonObj.get("history_runs").toString()));
          }

          // validate the optional field `history_runs` (array)
          for (int i = 0; i < jsonArrayhistoryRuns.size(); i++) {
            ResponseScheduleRun.validateJsonObject(jsonArrayhistoryRuns.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResponseSchedule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseSchedule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseSchedule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseSchedule.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseSchedule>() {
           @Override
           public void write(JsonWriter out, ResponseSchedule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseSchedule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseSchedule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseSchedule
  * @throws IOException if the JSON string is invalid with respect to ResponseSchedule
  */
  public static ResponseSchedule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseSchedule.class);
  }

 /**
  * Convert an instance of ResponseSchedule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
