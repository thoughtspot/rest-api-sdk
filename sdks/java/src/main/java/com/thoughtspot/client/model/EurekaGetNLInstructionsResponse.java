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
import com.thoughtspot.client.model.NLInstructionsInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * EurekaGetNLInstructionsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class EurekaGetNLInstructionsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NL_INSTRUCTIONS_INFO = "nl_instructions_info";
  @SerializedName(SERIALIZED_NAME_NL_INSTRUCTIONS_INFO)
  @javax.annotation.Nonnull
  private List<NLInstructionsInfo> nlInstructionsInfo;

  public EurekaGetNLInstructionsResponse() {
  }

  public EurekaGetNLInstructionsResponse nlInstructionsInfo(@javax.annotation.Nonnull List<NLInstructionsInfo> nlInstructionsInfo) {
    this.nlInstructionsInfo = nlInstructionsInfo;
    return this;
  }

  public EurekaGetNLInstructionsResponse addNlInstructionsInfoItem(NLInstructionsInfo nlInstructionsInfoItem) {
    if (this.nlInstructionsInfo == null) {
      this.nlInstructionsInfo = new ArrayList<>();
    }
    this.nlInstructionsInfo.add(nlInstructionsInfoItem);
    return this;
  }

  /**
   * List of NL instructions with their scopes.
   * @return nlInstructionsInfo
   */
  @javax.annotation.Nonnull
  public List<NLInstructionsInfo> getNlInstructionsInfo() {
    return nlInstructionsInfo;
  }

  public void setNlInstructionsInfo(@javax.annotation.Nonnull List<NLInstructionsInfo> nlInstructionsInfo) {
    this.nlInstructionsInfo = nlInstructionsInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EurekaGetNLInstructionsResponse eurekaGetNLInstructionsResponse = (EurekaGetNLInstructionsResponse) o;
    return Objects.equals(this.nlInstructionsInfo, eurekaGetNLInstructionsResponse.nlInstructionsInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nlInstructionsInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EurekaGetNLInstructionsResponse {\n");
    sb.append("    nlInstructionsInfo: ").append(toIndentedString(nlInstructionsInfo)).append("\n");
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
    openapiFields.add("nl_instructions_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("nl_instructions_info");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EurekaGetNLInstructionsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EurekaGetNLInstructionsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EurekaGetNLInstructionsResponse is not found in the empty JSON string", EurekaGetNLInstructionsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EurekaGetNLInstructionsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EurekaGetNLInstructionsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EurekaGetNLInstructionsResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("nl_instructions_info").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nl_instructions_info` to be an array in the JSON string but got `%s`", jsonObj.get("nl_instructions_info").toString()));
      }

      JsonArray jsonArraynlInstructionsInfo = jsonObj.getAsJsonArray("nl_instructions_info");
      // validate the required field `nl_instructions_info` (array)
      for (int i = 0; i < jsonArraynlInstructionsInfo.size(); i++) {
        NLInstructionsInfo.validateJsonElement(jsonArraynlInstructionsInfo.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EurekaGetNLInstructionsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EurekaGetNLInstructionsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EurekaGetNLInstructionsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EurekaGetNLInstructionsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EurekaGetNLInstructionsResponse>() {
           @Override
           public void write(JsonWriter out, EurekaGetNLInstructionsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EurekaGetNLInstructionsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EurekaGetNLInstructionsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EurekaGetNLInstructionsResponse
   * @throws IOException if the JSON string is invalid with respect to EurekaGetNLInstructionsResponse
   */
  public static EurekaGetNLInstructionsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EurekaGetNLInstructionsResponse.class);
  }

  /**
   * Convert an instance of EurekaGetNLInstructionsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

