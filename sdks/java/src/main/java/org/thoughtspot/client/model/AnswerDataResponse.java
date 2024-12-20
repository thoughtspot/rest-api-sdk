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
import org.thoughtspot.client.model.AnswerContent;

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
 * Response format associated with fetch data api
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T04:47:40.356396673Z[Etc/UTC]")
public class AnswerDataResponse {
  public static final String SERIALIZED_NAME_METADATA_ID = "metadata_id";
  @SerializedName(SERIALIZED_NAME_METADATA_ID)
  private String metadataId;

  public static final String SERIALIZED_NAME_METADATA_NAME = "metadata_name";
  @SerializedName(SERIALIZED_NAME_METADATA_NAME)
  private String metadataName;

  public static final String SERIALIZED_NAME_CONTENTS = "contents";
  @SerializedName(SERIALIZED_NAME_CONTENTS)
  private List<AnswerContent> contents = new ArrayList<>();

  public AnswerDataResponse() {
  }

  public AnswerDataResponse metadataId(String metadataId) {
    
    this.metadataId = metadataId;
    return this;
  }

   /**
   * The unique identifier of the object
   * @return metadataId
  **/
  @javax.annotation.Nonnull
  public String getMetadataId() {
    return metadataId;
  }


  public void setMetadataId(String metadataId) {
    this.metadataId = metadataId;
  }


  public AnswerDataResponse metadataName(String metadataName) {
    
    this.metadataName = metadataName;
    return this;
  }

   /**
   * Name of the metadata object
   * @return metadataName
  **/
  @javax.annotation.Nonnull
  public String getMetadataName() {
    return metadataName;
  }


  public void setMetadataName(String metadataName) {
    this.metadataName = metadataName;
  }


  public AnswerDataResponse contents(List<AnswerContent> contents) {
    
    this.contents = contents;
    return this;
  }

  public AnswerDataResponse addContentsItem(AnswerContent contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<>();
    }
    this.contents.add(contentsItem);
    return this;
  }

   /**
   * Data content of metadata objects
   * @return contents
  **/
  @javax.annotation.Nonnull
  public List<AnswerContent> getContents() {
    return contents;
  }


  public void setContents(List<AnswerContent> contents) {
    this.contents = contents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnswerDataResponse answerDataResponse = (AnswerDataResponse) o;
    return Objects.equals(this.metadataId, answerDataResponse.metadataId) &&
        Objects.equals(this.metadataName, answerDataResponse.metadataName) &&
        Objects.equals(this.contents, answerDataResponse.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataId, metadataName, contents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnswerDataResponse {\n");
    sb.append("    metadataId: ").append(toIndentedString(metadataId)).append("\n");
    sb.append("    metadataName: ").append(toIndentedString(metadataName)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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
    openapiFields.add("metadata_id");
    openapiFields.add("metadata_name");
    openapiFields.add("contents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("metadata_id");
    openapiRequiredFields.add("metadata_name");
    openapiRequiredFields.add("contents");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnswerDataResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AnswerDataResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnswerDataResponse is not found in the empty JSON string", AnswerDataResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AnswerDataResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnswerDataResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AnswerDataResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("metadata_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata_id").toString()));
      }
      if (!jsonObj.get("metadata_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata_name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("contents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `contents` to be an array in the JSON string but got `%s`", jsonObj.get("contents").toString()));
      }

      JsonArray jsonArraycontents = jsonObj.getAsJsonArray("contents");
      // validate the required field `contents` (array)
      for (int i = 0; i < jsonArraycontents.size(); i++) {
        AnswerContent.validateJsonObject(jsonArraycontents.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnswerDataResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnswerDataResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnswerDataResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnswerDataResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AnswerDataResponse>() {
           @Override
           public void write(JsonWriter out, AnswerDataResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnswerDataResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnswerDataResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnswerDataResponse
  * @throws IOException if the JSON string is invalid with respect to AnswerDataResponse
  */
  public static AnswerDataResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnswerDataResponse.class);
  }

 /**
  * Convert an instance of AnswerDataResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

