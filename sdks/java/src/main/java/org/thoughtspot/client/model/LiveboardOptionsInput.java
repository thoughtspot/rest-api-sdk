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

import org.thoughtspot.client.JSON;

/**
 * Options to specify details of Liveboard.
 */

public class LiveboardOptionsInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VISUALIZATION_IDENTIFIERS = "visualization_identifiers";
  @SerializedName(SERIALIZED_NAME_VISUALIZATION_IDENTIFIERS)
  @javax.annotation.Nonnull
  private List<String> visualizationIdentifiers;

  public LiveboardOptionsInput() {
  }

  public LiveboardOptionsInput visualizationIdentifiers(@javax.annotation.Nonnull List<String> visualizationIdentifiers) {
    this.visualizationIdentifiers = visualizationIdentifiers;
    return this;
  }

  public LiveboardOptionsInput addVisualizationIdentifiersItem(String visualizationIdentifiersItem) {
    if (this.visualizationIdentifiers == null) {
      this.visualizationIdentifiers = new ArrayList<>();
    }
    this.visualizationIdentifiers.add(visualizationIdentifiersItem);
    return this;
  }

  /**
   * Unique ID or name of visualizations.
   * @return visualizationIdentifiers
   */
  @javax.annotation.Nonnull
  public List<String> getVisualizationIdentifiers() {
    return visualizationIdentifiers;
  }

  public void setVisualizationIdentifiers(@javax.annotation.Nonnull List<String> visualizationIdentifiers) {
    this.visualizationIdentifiers = visualizationIdentifiers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveboardOptionsInput liveboardOptionsInput = (LiveboardOptionsInput) o;
    return Objects.equals(this.visualizationIdentifiers, liveboardOptionsInput.visualizationIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visualizationIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveboardOptionsInput {\n");
    sb.append("    visualizationIdentifiers: ").append(toIndentedString(visualizationIdentifiers)).append("\n");
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
    openapiFields.add("visualization_identifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("visualization_identifiers");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LiveboardOptionsInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LiveboardOptionsInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LiveboardOptionsInput is not found in the empty JSON string", LiveboardOptionsInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LiveboardOptionsInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LiveboardOptionsInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LiveboardOptionsInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("visualization_identifiers") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("visualization_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `visualization_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("visualization_identifiers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LiveboardOptionsInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LiveboardOptionsInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LiveboardOptionsInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LiveboardOptionsInput.class));

       return (TypeAdapter<T>) new TypeAdapter<LiveboardOptionsInput>() {
           @Override
           public void write(JsonWriter out, LiveboardOptionsInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LiveboardOptionsInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LiveboardOptionsInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LiveboardOptionsInput
   * @throws IOException if the JSON string is invalid with respect to LiveboardOptionsInput
   */
  public static LiveboardOptionsInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LiveboardOptionsInput.class);
  }

  /**
   * Convert an instance of LiveboardOptionsInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

