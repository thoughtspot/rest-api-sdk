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
import org.thoughtspot.client.model.CALLBACK;
import org.thoughtspot.client.model.URL;
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
 * Type and Configuration for Custom Actions
 */

public class ActionDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_C_A_L_L_B_A_C_K = "CALLBACK";
  @SerializedName(SERIALIZED_NAME_C_A_L_L_B_A_C_K)
  @javax.annotation.Nullable
  private CALLBACK callback;

  public static final String SERIALIZED_NAME_U_R_L = "URL";
  @SerializedName(SERIALIZED_NAME_U_R_L)
  @javax.annotation.Nullable
  private URL url;

  public ActionDetails() {
  }

  public ActionDetails callback(@javax.annotation.Nullable CALLBACK callback) {
    this.callback = callback;
    return this;
  }

  /**
   * Get callback
   * @return callback
   */
  @javax.annotation.Nullable
  public CALLBACK getCALLBACK() {
    return callback;
  }

  public void setCALLBACK(@javax.annotation.Nullable CALLBACK callback) {
    this.callback = callback;
  }


  public ActionDetails url(@javax.annotation.Nullable URL url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nullable
  public URL getURL() {
    return url;
  }

  public void setURL(@javax.annotation.Nullable URL url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionDetails actionDetails = (ActionDetails) o;
    return Objects.equals(this.callback, actionDetails.callback) &&
        Objects.equals(this.url, actionDetails.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callback, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionDetails {\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
   * @throws IOException if the JSON Element is invalid with respect to ActionDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ActionDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActionDetails is not found in the empty JSON string", ActionDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ActionDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActionDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CALLBACK`
      if (jsonObj.get("CALLBACK") != null && !jsonObj.get("CALLBACK").isJsonNull()) {
        CALLBACK.validateJsonElement(jsonObj.get("CALLBACK"));
      }
      // validate the optional field `URL`
      if (jsonObj.get("URL") != null && !jsonObj.get("URL").isJsonNull()) {
        URL.validateJsonElement(jsonObj.get("URL"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActionDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActionDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActionDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActionDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ActionDetails>() {
           @Override
           public void write(JsonWriter out, ActionDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActionDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ActionDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ActionDetails
   * @throws IOException if the JSON string is invalid with respect to ActionDetails
   */
  public static ActionDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActionDetails.class);
  }

  /**
   * Convert an instance of ActionDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

