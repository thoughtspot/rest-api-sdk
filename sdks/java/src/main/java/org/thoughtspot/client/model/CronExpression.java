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
 * Schedule selected cron expression.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T10:47:55.743445Z[Etc/UTC]")
public class CronExpression {
  public static final String SERIALIZED_NAME_DAY_OF_MONTH = "day_of_month";
  @SerializedName(SERIALIZED_NAME_DAY_OF_MONTH)
  private String dayOfMonth;

  public static final String SERIALIZED_NAME_DAY_OF_WEEK = "day_of_week";
  @SerializedName(SERIALIZED_NAME_DAY_OF_WEEK)
  private String dayOfWeek;

  public static final String SERIALIZED_NAME_HOUR = "hour";
  @SerializedName(SERIALIZED_NAME_HOUR)
  private String hour;

  public static final String SERIALIZED_NAME_MINUTE = "minute";
  @SerializedName(SERIALIZED_NAME_MINUTE)
  private String minute;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private String month;

  public static final String SERIALIZED_NAME_SECOND = "second";
  @SerializedName(SERIALIZED_NAME_SECOND)
  private String second;

  public CronExpression() {
  }

  public CronExpression dayOfMonth(String dayOfMonth) {
    
    this.dayOfMonth = dayOfMonth;
    return this;
  }

   /**
   * Day of month of the object.
   * @return dayOfMonth
  **/
  @javax.annotation.Nonnull
  public String getDayOfMonth() {
    return dayOfMonth;
  }


  public void setDayOfMonth(String dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }


  public CronExpression dayOfWeek(String dayOfWeek) {
    
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Day of Week of the object.
   * @return dayOfWeek
  **/
  @javax.annotation.Nonnull
  public String getDayOfWeek() {
    return dayOfWeek;
  }


  public void setDayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  public CronExpression hour(String hour) {
    
    this.hour = hour;
    return this;
  }

   /**
   * Hour of the object.
   * @return hour
  **/
  @javax.annotation.Nonnull
  public String getHour() {
    return hour;
  }


  public void setHour(String hour) {
    this.hour = hour;
  }


  public CronExpression minute(String minute) {
    
    this.minute = minute;
    return this;
  }

   /**
   * Minute of the object.
   * @return minute
  **/
  @javax.annotation.Nonnull
  public String getMinute() {
    return minute;
  }


  public void setMinute(String minute) {
    this.minute = minute;
  }


  public CronExpression month(String month) {
    
    this.month = month;
    return this;
  }

   /**
   * Month of the object.
   * @return month
  **/
  @javax.annotation.Nonnull
  public String getMonth() {
    return month;
  }


  public void setMonth(String month) {
    this.month = month;
  }


  public CronExpression second(String second) {
    
    this.second = second;
    return this;
  }

   /**
   * Second of the object.
   * @return second
  **/
  @javax.annotation.Nonnull
  public String getSecond() {
    return second;
  }


  public void setSecond(String second) {
    this.second = second;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CronExpression cronExpression = (CronExpression) o;
    return Objects.equals(this.dayOfMonth, cronExpression.dayOfMonth) &&
        Objects.equals(this.dayOfWeek, cronExpression.dayOfWeek) &&
        Objects.equals(this.hour, cronExpression.hour) &&
        Objects.equals(this.minute, cronExpression.minute) &&
        Objects.equals(this.month, cronExpression.month) &&
        Objects.equals(this.second, cronExpression.second);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfMonth, dayOfWeek, hour, minute, month, second);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CronExpression {\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
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
    openapiFields.add("day_of_month");
    openapiFields.add("day_of_week");
    openapiFields.add("hour");
    openapiFields.add("minute");
    openapiFields.add("month");
    openapiFields.add("second");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("day_of_month");
    openapiRequiredFields.add("day_of_week");
    openapiRequiredFields.add("hour");
    openapiRequiredFields.add("minute");
    openapiRequiredFields.add("month");
    openapiRequiredFields.add("second");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CronExpression
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CronExpression.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CronExpression is not found in the empty JSON string", CronExpression.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CronExpression.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CronExpression` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CronExpression.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("day_of_month").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `day_of_month` to be a primitive type in the JSON string but got `%s`", jsonObj.get("day_of_month").toString()));
      }
      if (!jsonObj.get("day_of_week").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `day_of_week` to be a primitive type in the JSON string but got `%s`", jsonObj.get("day_of_week").toString()));
      }
      if (!jsonObj.get("hour").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hour` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hour").toString()));
      }
      if (!jsonObj.get("minute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minute").toString()));
      }
      if (!jsonObj.get("month").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `month` to be a primitive type in the JSON string but got `%s`", jsonObj.get("month").toString()));
      }
      if (!jsonObj.get("second").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `second` to be a primitive type in the JSON string but got `%s`", jsonObj.get("second").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CronExpression.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CronExpression' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CronExpression> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CronExpression.class));

       return (TypeAdapter<T>) new TypeAdapter<CronExpression>() {
           @Override
           public void write(JsonWriter out, CronExpression value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CronExpression read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CronExpression given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CronExpression
  * @throws IOException if the JSON string is invalid with respect to CronExpression
  */
  public static CronExpression fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CronExpression.class);
  }

 /**
  * Convert an instance of CronExpression to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

