/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
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

import com.thoughtspot.client.JSON;

/**
 * Pins a referenced model date column to a specific time dimension (grain) in the created input table.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ReferencedColumnTimeDimension implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COLUMN_IDENTIFIER = "column_identifier";
  @SerializedName(SERIALIZED_NAME_COLUMN_IDENTIFIER)
  @javax.annotation.Nonnull
  private String columnIdentifier;

  /**
   * Time dimension (grain) to lock the column to. Applies to DATE and DATE_TIME columns; a grain on a TIME (time-of-day) column has no meaning and is not supported. HOURLY needs a DATE_TIME column — on a plain DATE column it is ignored and the column stays detailed.
   */
  @JsonAdapter(TimeDimensionEnum.Adapter.class)
  public enum TimeDimensionEnum {
    HOURLY("HOURLY"),
    
    DAILY("DAILY"),
    
    WEEKLY("WEEKLY"),
    
    MONTHLY("MONTHLY"),
    
    QUARTERLY("QUARTERLY"),
    
    YEARLY("YEARLY");

    private String value;

    TimeDimensionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimeDimensionEnum fromValue(String value) {
      for (TimeDimensionEnum b : TimeDimensionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TimeDimensionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeDimensionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeDimensionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TimeDimensionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TimeDimensionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TIME_DIMENSION = "time_dimension";
  @SerializedName(SERIALIZED_NAME_TIME_DIMENSION)
  @javax.annotation.Nonnull
  private TimeDimensionEnum timeDimension;

  public ReferencedColumnTimeDimension() {
  }

  public ReferencedColumnTimeDimension columnIdentifier(@javax.annotation.Nonnull String columnIdentifier) {
    this.columnIdentifier = columnIdentifier;
    return this;
  }

  /**
   * The referenced model column to restrict, named exactly as it is in referenced_columns.
   * @return columnIdentifier
   */
  @javax.annotation.Nonnull
  public String getColumnIdentifier() {
    return columnIdentifier;
  }

  public void setColumnIdentifier(@javax.annotation.Nonnull String columnIdentifier) {
    this.columnIdentifier = columnIdentifier;
  }


  public ReferencedColumnTimeDimension timeDimension(@javax.annotation.Nonnull TimeDimensionEnum timeDimension) {
    this.timeDimension = timeDimension;
    return this;
  }

  /**
   * Time dimension (grain) to lock the column to. Applies to DATE and DATE_TIME columns; a grain on a TIME (time-of-day) column has no meaning and is not supported. HOURLY needs a DATE_TIME column — on a plain DATE column it is ignored and the column stays detailed.
   * @return timeDimension
   */
  @javax.annotation.Nonnull
  public TimeDimensionEnum getTimeDimension() {
    return timeDimension;
  }

  public void setTimeDimension(@javax.annotation.Nonnull TimeDimensionEnum timeDimension) {
    this.timeDimension = timeDimension;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ReferencedColumnTimeDimension instance itself
   */
  public ReferencedColumnTimeDimension putAdditionalProperty(String key, Object value) {
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
    ReferencedColumnTimeDimension referencedColumnTimeDimension = (ReferencedColumnTimeDimension) o;
    return Objects.equals(this.columnIdentifier, referencedColumnTimeDimension.columnIdentifier) &&
        Objects.equals(this.timeDimension, referencedColumnTimeDimension.timeDimension)&&
        Objects.equals(this.additionalProperties, referencedColumnTimeDimension.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnIdentifier, timeDimension, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferencedColumnTimeDimension {\n");
    sb.append("    columnIdentifier: ").append(toIndentedString(columnIdentifier)).append("\n");
    sb.append("    timeDimension: ").append(toIndentedString(timeDimension)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("column_identifier");
    openapiFields.add("time_dimension");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("column_identifier");
    openapiRequiredFields.add("time_dimension");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReferencedColumnTimeDimension
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReferencedColumnTimeDimension.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReferencedColumnTimeDimension is not found in the empty JSON string", ReferencedColumnTimeDimension.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReferencedColumnTimeDimension.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("column_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `column_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("column_identifier").toString()));
      }
      if (!jsonObj.get("time_dimension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_dimension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_dimension").toString()));
      }
      // validate the required field `time_dimension`
      TimeDimensionEnum.validateJsonElement(jsonObj.get("time_dimension"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReferencedColumnTimeDimension.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReferencedColumnTimeDimension' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReferencedColumnTimeDimension> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReferencedColumnTimeDimension.class));

       return (TypeAdapter<T>) new TypeAdapter<ReferencedColumnTimeDimension>() {
           @Override
           public void write(JsonWriter out, ReferencedColumnTimeDimension value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
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
           public ReferencedColumnTimeDimension read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ReferencedColumnTimeDimension instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReferencedColumnTimeDimension given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReferencedColumnTimeDimension
   * @throws IOException if the JSON string is invalid with respect to ReferencedColumnTimeDimension
   */
  public static ReferencedColumnTimeDimension fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReferencedColumnTimeDimension.class);
  }

  /**
   * Convert an instance of ReferencedColumnTimeDimension to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

