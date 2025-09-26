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
 * AnswerContextInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class AnswerContextInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SESSION_IDENTIFIER = "session_identifier";
  @SerializedName(SERIALIZED_NAME_SESSION_IDENTIFIER)
  @javax.annotation.Nonnull
  private String sessionIdentifier;

  public static final String SERIALIZED_NAME_GENERATION_NUMBER = "generation_number";
  @SerializedName(SERIALIZED_NAME_GENERATION_NUMBER)
  @javax.annotation.Nonnull
  private Integer generationNumber;

  public AnswerContextInput() {
  }

  public AnswerContextInput sessionIdentifier(@javax.annotation.Nonnull String sessionIdentifier) {
    this.sessionIdentifier = sessionIdentifier;
    return this;
  }

  /**
   * Unique identifier of the answer session.
   * @return sessionIdentifier
   */
  @javax.annotation.Nonnull
  public String getSessionIdentifier() {
    return sessionIdentifier;
  }

  public void setSessionIdentifier(@javax.annotation.Nonnull String sessionIdentifier) {
    this.sessionIdentifier = sessionIdentifier;
  }


  public AnswerContextInput generationNumber(@javax.annotation.Nonnull Integer generationNumber) {
    this.generationNumber = generationNumber;
    return this;
  }

  /**
   * Generation number of the answer.
   * @return generationNumber
   */
  @javax.annotation.Nonnull
  public Integer getGenerationNumber() {
    return generationNumber;
  }

  public void setGenerationNumber(@javax.annotation.Nonnull Integer generationNumber) {
    this.generationNumber = generationNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnswerContextInput answerContextInput = (AnswerContextInput) o;
    return Objects.equals(this.sessionIdentifier, answerContextInput.sessionIdentifier) &&
        Objects.equals(this.generationNumber, answerContextInput.generationNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionIdentifier, generationNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnswerContextInput {\n");
    sb.append("    sessionIdentifier: ").append(toIndentedString(sessionIdentifier)).append("\n");
    sb.append("    generationNumber: ").append(toIndentedString(generationNumber)).append("\n");
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
    openapiFields.add("session_identifier");
    openapiFields.add("generation_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("session_identifier");
    openapiRequiredFields.add("generation_number");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AnswerContextInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AnswerContextInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnswerContextInput is not found in the empty JSON string", AnswerContextInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AnswerContextInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnswerContextInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AnswerContextInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("session_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session_identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnswerContextInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnswerContextInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnswerContextInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnswerContextInput.class));

       return (TypeAdapter<T>) new TypeAdapter<AnswerContextInput>() {
           @Override
           public void write(JsonWriter out, AnswerContextInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnswerContextInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AnswerContextInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AnswerContextInput
   * @throws IOException if the JSON string is invalid with respect to AnswerContextInput
   */
  public static AnswerContextInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnswerContextInput.class);
  }

  /**
   * Convert an instance of AnswerContextInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

