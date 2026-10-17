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
 * App color theme configuration -- the same stored color navigation_panel writes, expressed as a brand color plus how it is applied.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class AppColorThemeInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BRAND_COLOR = "brand_color";
  @SerializedName(SERIALIZED_NAME_BRAND_COLOR)
  @javax.annotation.Nullable
  private String brandColor;

  public static final String SERIALIZED_NAME_APPLY_AS_TOP_NAV_COLOR = "apply_as_top_nav_color";
  @SerializedName(SERIALIZED_NAME_APPLY_AS_TOP_NAV_COLOR)
  @javax.annotation.Nullable
  private Boolean applyAsTopNavColor;

  public AppColorThemeInput() {
  }

  public AppColorThemeInput brandColor(@javax.annotation.Nullable String brandColor) {
    this.brandColor = brandColor;
    return this;
  }

  /**
   * Brand color as a 6-digit hex string (e.g. \&quot;#2359B6\&quot;). Omit to leave the stored color unchanged. To clear it, use operation RESET with reset_options.style: [\&quot;APP_COLOR_THEME\&quot;].    Version: 26.10.0.cl or later 
   * @return brandColor
   */
  @javax.annotation.Nullable
  public String getBrandColor() {
    return brandColor;
  }

  public void setBrandColor(@javax.annotation.Nullable String brandColor) {
    this.brandColor = brandColor;
  }


  public AppColorThemeInput applyAsTopNavColor(@javax.annotation.Nullable Boolean applyAsTopNavColor) {
    this.applyAsTopNavColor = applyAsTopNavColor;
    return this;
  }

  /**
   * Whether the brand color is painted on the top navigation bar literally, instead of the surface shade derived from it. Omit to leave the stored choice unchanged.    Version: 26.10.0.cl or later 
   * @return applyAsTopNavColor
   */
  @javax.annotation.Nullable
  public Boolean getApplyAsTopNavColor() {
    return applyAsTopNavColor;
  }

  public void setApplyAsTopNavColor(@javax.annotation.Nullable Boolean applyAsTopNavColor) {
    this.applyAsTopNavColor = applyAsTopNavColor;
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
   * @return the AppColorThemeInput instance itself
   */
  public AppColorThemeInput putAdditionalProperty(String key, Object value) {
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
    AppColorThemeInput appColorThemeInput = (AppColorThemeInput) o;
    return Objects.equals(this.brandColor, appColorThemeInput.brandColor) &&
        Objects.equals(this.applyAsTopNavColor, appColorThemeInput.applyAsTopNavColor)&&
        Objects.equals(this.additionalProperties, appColorThemeInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandColor, applyAsTopNavColor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppColorThemeInput {\n");
    sb.append("    brandColor: ").append(toIndentedString(brandColor)).append("\n");
    sb.append("    applyAsTopNavColor: ").append(toIndentedString(applyAsTopNavColor)).append("\n");
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
    openapiFields.add("brand_color");
    openapiFields.add("apply_as_top_nav_color");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppColorThemeInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppColorThemeInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppColorThemeInput is not found in the empty JSON string", AppColorThemeInput.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("brand_color") != null && !jsonObj.get("brand_color").isJsonNull()) && !jsonObj.get("brand_color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_color").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppColorThemeInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppColorThemeInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppColorThemeInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppColorThemeInput.class));

       return (TypeAdapter<T>) new TypeAdapter<AppColorThemeInput>() {
           @Override
           public void write(JsonWriter out, AppColorThemeInput value) throws IOException {
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
           public AppColorThemeInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppColorThemeInput instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AppColorThemeInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AppColorThemeInput
   * @throws IOException if the JSON string is invalid with respect to AppColorThemeInput
   */
  public static AppColorThemeInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppColorThemeInput.class);
  }

  /**
   * Convert an instance of AppColorThemeInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

