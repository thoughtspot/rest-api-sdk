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
 * App color theme configuration for a specific scope -- the same stored color StyleNavigationPanel expresses, as a brand color plus how it is applied. Returned alongside navigation_panel when the app color theme is enabled on the cluster; omitted otherwise.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class StyleAppColorTheme implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BRAND_COLOR = "brand_color";
  @SerializedName(SERIALIZED_NAME_BRAND_COLOR)
  @javax.annotation.Nullable
  private String brandColor;

  public static final String SERIALIZED_NAME_APPLY_AS_TOP_NAV_COLOR = "apply_as_top_nav_color";
  @SerializedName(SERIALIZED_NAME_APPLY_AS_TOP_NAV_COLOR)
  @javax.annotation.Nullable
  private Boolean applyAsTopNavColor;

  public static final String SERIALIZED_NAME_IS_OVERRIDDEN = "is_overridden";
  @SerializedName(SERIALIZED_NAME_IS_OVERRIDDEN)
  @javax.annotation.Nullable
  private Boolean isOverridden;

  public StyleAppColorTheme() {
  }

  public StyleAppColorTheme brandColor(@javax.annotation.Nullable String brandColor) {
    this.brandColor = brandColor;
    return this;
  }

  /**
   * Brand color as a 6-digit hex string. Null when no brand color is set at this scope.
   * @return brandColor
   */
  @javax.annotation.Nullable
  public String getBrandColor() {
    return brandColor;
  }

  public void setBrandColor(@javax.annotation.Nullable String brandColor) {
    this.brandColor = brandColor;
  }


  public StyleAppColorTheme applyAsTopNavColor(@javax.annotation.Nullable Boolean applyAsTopNavColor) {
    this.applyAsTopNavColor = applyAsTopNavColor;
    return this;
  }

  /**
   * The effective setting: whether the brand color is painted on the top navigation bar literally, instead of the surface shade derived from it. Always the resolved value -- true iff a brand color is set, unless explicitly overridden.
   * @return applyAsTopNavColor
   */
  @javax.annotation.Nullable
  public Boolean getApplyAsTopNavColor() {
    return applyAsTopNavColor;
  }

  public void setApplyAsTopNavColor(@javax.annotation.Nullable Boolean applyAsTopNavColor) {
    this.applyAsTopNavColor = applyAsTopNavColor;
  }


  public StyleAppColorTheme isOverridden(@javax.annotation.Nullable Boolean isOverridden) {
    this.isOverridden = isOverridden;
    return this;
  }

  /**
   * True if explicitly set at this scope (either the brand color or the apply_as_top_nav_color choice), overriding any inherited value.
   * @return isOverridden
   */
  @javax.annotation.Nullable
  public Boolean getIsOverridden() {
    return isOverridden;
  }

  public void setIsOverridden(@javax.annotation.Nullable Boolean isOverridden) {
    this.isOverridden = isOverridden;
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
   * @return the StyleAppColorTheme instance itself
   */
  public StyleAppColorTheme putAdditionalProperty(String key, Object value) {
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
    StyleAppColorTheme styleAppColorTheme = (StyleAppColorTheme) o;
    return Objects.equals(this.brandColor, styleAppColorTheme.brandColor) &&
        Objects.equals(this.applyAsTopNavColor, styleAppColorTheme.applyAsTopNavColor) &&
        Objects.equals(this.isOverridden, styleAppColorTheme.isOverridden)&&
        Objects.equals(this.additionalProperties, styleAppColorTheme.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandColor, applyAsTopNavColor, isOverridden, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StyleAppColorTheme {\n");
    sb.append("    brandColor: ").append(toIndentedString(brandColor)).append("\n");
    sb.append("    applyAsTopNavColor: ").append(toIndentedString(applyAsTopNavColor)).append("\n");
    sb.append("    isOverridden: ").append(toIndentedString(isOverridden)).append("\n");
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
    openapiFields.add("is_overridden");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StyleAppColorTheme
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StyleAppColorTheme.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StyleAppColorTheme is not found in the empty JSON string", StyleAppColorTheme.openapiRequiredFields.toString()));
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
       if (!StyleAppColorTheme.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StyleAppColorTheme' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StyleAppColorTheme> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StyleAppColorTheme.class));

       return (TypeAdapter<T>) new TypeAdapter<StyleAppColorTheme>() {
           @Override
           public void write(JsonWriter out, StyleAppColorTheme value) throws IOException {
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
           public StyleAppColorTheme read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             StyleAppColorTheme instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of StyleAppColorTheme given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StyleAppColorTheme
   * @throws IOException if the JSON string is invalid with respect to StyleAppColorTheme
   */
  public static StyleAppColorTheme fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StyleAppColorTheme.class);
  }

  /**
   * Convert an instance of StyleAppColorTheme to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

