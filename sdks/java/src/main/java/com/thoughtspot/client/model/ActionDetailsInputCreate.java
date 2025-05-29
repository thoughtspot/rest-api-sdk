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
import com.thoughtspot.client.model.CALLBACKInputMandatory;
import com.thoughtspot.client.model.URLInputMandatory;
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
 * Action details includes Type and Configuration for Custom Actions, either Callback or URL is required. When both callback and url are provided, callback would be considered
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ActionDetailsInputCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_C_A_L_L_B_A_C_K = "CALLBACK";
  @SerializedName(SERIALIZED_NAME_C_A_L_L_B_A_C_K)
  @javax.annotation.Nullable
  private CALLBACKInputMandatory CALLBACK;

  public static final String SERIALIZED_NAME_U_R_L = "URL";
  @SerializedName(SERIALIZED_NAME_U_R_L)
  @javax.annotation.Nullable
  private URLInputMandatory URL;

  public ActionDetailsInputCreate() {
  }

  public ActionDetailsInputCreate CALLBACK(@javax.annotation.Nullable CALLBACKInputMandatory CALLBACK) {
    this.CALLBACK = CALLBACK;
    return this;
  }

  /**
   * Get CALLBACK
   * @return CALLBACK
   */
  @javax.annotation.Nullable
  public CALLBACKInputMandatory getCALLBACK() {
    return CALLBACK;
  }

  public void setCALLBACK(@javax.annotation.Nullable CALLBACKInputMandatory CALLBACK) {
    this.CALLBACK = CALLBACK;
  }


  public ActionDetailsInputCreate URL(@javax.annotation.Nullable URLInputMandatory URL) {
    this.URL = URL;
    return this;
  }

  /**
   * Get URL
   * @return URL
   */
  @javax.annotation.Nullable
  public URLInputMandatory getURL() {
    return URL;
  }

  public void setURL(@javax.annotation.Nullable URLInputMandatory URL) {
    this.URL = URL;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionDetailsInputCreate actionDetailsInputCreate = (ActionDetailsInputCreate) o;
    return Objects.equals(this.CALLBACK, actionDetailsInputCreate.CALLBACK) &&
        Objects.equals(this.URL, actionDetailsInputCreate.URL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CALLBACK, URL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionDetailsInputCreate {\n");
    sb.append("    CALLBACK: ").append(toIndentedString(CALLBACK)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
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
    openapiFields.add("CALLBACK");
    openapiFields.add("URL");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ActionDetailsInputCreate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ActionDetailsInputCreate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActionDetailsInputCreate is not found in the empty JSON string", ActionDetailsInputCreate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ActionDetailsInputCreate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActionDetailsInputCreate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CALLBACK`
      if (jsonObj.get("CALLBACK") != null && !jsonObj.get("CALLBACK").isJsonNull()) {
        CALLBACKInputMandatory.validateJsonElement(jsonObj.get("CALLBACK"));
      }
      // validate the optional field `URL`
      if (jsonObj.get("URL") != null && !jsonObj.get("URL").isJsonNull()) {
        URLInputMandatory.validateJsonElement(jsonObj.get("URL"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActionDetailsInputCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActionDetailsInputCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActionDetailsInputCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActionDetailsInputCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<ActionDetailsInputCreate>() {
           @Override
           public void write(JsonWriter out, ActionDetailsInputCreate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActionDetailsInputCreate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ActionDetailsInputCreate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ActionDetailsInputCreate
   * @throws IOException if the JSON string is invalid with respect to ActionDetailsInputCreate
   */
  public static ActionDetailsInputCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActionDetailsInputCreate.class);
  }

  /**
   * Convert an instance of ActionDetailsInputCreate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

