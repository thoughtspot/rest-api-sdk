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
 * Parts of a Liveboard&#39;s metadata_detail to return in a metadata search.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class LiveboardDetailsInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LIVEBOARD_FILTERS = "liveboard_filters";
  @SerializedName(SERIALIZED_NAME_LIVEBOARD_FILTERS)
  @javax.annotation.Nullable
  private Boolean liveboardFilters = true;

  public static final String SERIALIZED_NAME_LIVEBOARD_TABS = "liveboard_tabs";
  @SerializedName(SERIALIZED_NAME_LIVEBOARD_TABS)
  @javax.annotation.Nullable
  private Boolean liveboardTabs = true;

  public static final String SERIALIZED_NAME_CONTAINER_LAYOUTS = "container_layouts";
  @SerializedName(SERIALIZED_NAME_CONTAINER_LAYOUTS)
  @javax.annotation.Nullable
  private Boolean containerLayouts = true;

  public static final String SERIALIZED_NAME_VISUALIZATIONS = "visualizations";
  @SerializedName(SERIALIZED_NAME_VISUALIZATIONS)
  @javax.annotation.Nullable
  private Boolean visualizations = true;

  public static final String SERIALIZED_NAME_PARAMETER_OVERRIDES = "parameter_overrides";
  @SerializedName(SERIALIZED_NAME_PARAMETER_OVERRIDES)
  @javax.annotation.Nullable
  private Boolean parameterOverrides = true;

  public static final String SERIALIZED_NAME_PERSONALIZED_VIEWS = "personalized_views";
  @SerializedName(SERIALIZED_NAME_PERSONALIZED_VIEWS)
  @javax.annotation.Nullable
  private Boolean personalizedViews = false;

  public LiveboardDetailsInput() {
  }

  public LiveboardDetailsInput liveboardFilters(@javax.annotation.Nullable Boolean liveboardFilters) {
    this.liveboardFilters = liveboardFilters;
    return this;
  }

  /**
   * Includes Liveboard filters.
   * @return liveboardFilters
   */
  @javax.annotation.Nullable
  public Boolean getLiveboardFilters() {
    return liveboardFilters;
  }

  public void setLiveboardFilters(@javax.annotation.Nullable Boolean liveboardFilters) {
    this.liveboardFilters = liveboardFilters;
  }


  public LiveboardDetailsInput liveboardTabs(@javax.annotation.Nullable Boolean liveboardTabs) {
    this.liveboardTabs = liveboardTabs;
    return this;
  }

  /**
   * Includes Liveboard tabs.
   * @return liveboardTabs
   */
  @javax.annotation.Nullable
  public Boolean getLiveboardTabs() {
    return liveboardTabs;
  }

  public void setLiveboardTabs(@javax.annotation.Nullable Boolean liveboardTabs) {
    this.liveboardTabs = liveboardTabs;
  }


  public LiveboardDetailsInput containerLayouts(@javax.annotation.Nullable Boolean containerLayouts) {
    this.containerLayouts = containerLayouts;
    return this;
  }

  /**
   * Includes the layout of Liveboard visualizations.
   * @return containerLayouts
   */
  @javax.annotation.Nullable
  public Boolean getContainerLayouts() {
    return containerLayouts;
  }

  public void setContainerLayouts(@javax.annotation.Nullable Boolean containerLayouts) {
    this.containerLayouts = containerLayouts;
  }


  public LiveboardDetailsInput visualizations(@javax.annotation.Nullable Boolean visualizations) {
    this.visualizations = visualizations;
    return this;
  }

  /**
   * Includes Liveboard visualizations.
   * @return visualizations
   */
  @javax.annotation.Nullable
  public Boolean getVisualizations() {
    return visualizations;
  }

  public void setVisualizations(@javax.annotation.Nullable Boolean visualizations) {
    this.visualizations = visualizations;
  }


  public LiveboardDetailsInput parameterOverrides(@javax.annotation.Nullable Boolean parameterOverrides) {
    this.parameterOverrides = parameterOverrides;
    return this;
  }

  /**
   * Includes parameter overrides.
   * @return parameterOverrides
   */
  @javax.annotation.Nullable
  public Boolean getParameterOverrides() {
    return parameterOverrides;
  }

  public void setParameterOverrides(@javax.annotation.Nullable Boolean parameterOverrides) {
    this.parameterOverrides = parameterOverrides;
  }


  public LiveboardDetailsInput personalizedViews(@javax.annotation.Nullable Boolean personalizedViews) {
    this.personalizedViews = personalizedViews;
    return this;
  }

  /**
   * Includes personalised views. Personalised views are also included when include_personalised_views is true.
   * @return personalizedViews
   */
  @javax.annotation.Nullable
  public Boolean getPersonalizedViews() {
    return personalizedViews;
  }

  public void setPersonalizedViews(@javax.annotation.Nullable Boolean personalizedViews) {
    this.personalizedViews = personalizedViews;
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
   * @return the LiveboardDetailsInput instance itself
   */
  public LiveboardDetailsInput putAdditionalProperty(String key, Object value) {
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
    LiveboardDetailsInput liveboardDetailsInput = (LiveboardDetailsInput) o;
    return Objects.equals(this.liveboardFilters, liveboardDetailsInput.liveboardFilters) &&
        Objects.equals(this.liveboardTabs, liveboardDetailsInput.liveboardTabs) &&
        Objects.equals(this.containerLayouts, liveboardDetailsInput.containerLayouts) &&
        Objects.equals(this.visualizations, liveboardDetailsInput.visualizations) &&
        Objects.equals(this.parameterOverrides, liveboardDetailsInput.parameterOverrides) &&
        Objects.equals(this.personalizedViews, liveboardDetailsInput.personalizedViews)&&
        Objects.equals(this.additionalProperties, liveboardDetailsInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(liveboardFilters, liveboardTabs, containerLayouts, visualizations, parameterOverrides, personalizedViews, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveboardDetailsInput {\n");
    sb.append("    liveboardFilters: ").append(toIndentedString(liveboardFilters)).append("\n");
    sb.append("    liveboardTabs: ").append(toIndentedString(liveboardTabs)).append("\n");
    sb.append("    containerLayouts: ").append(toIndentedString(containerLayouts)).append("\n");
    sb.append("    visualizations: ").append(toIndentedString(visualizations)).append("\n");
    sb.append("    parameterOverrides: ").append(toIndentedString(parameterOverrides)).append("\n");
    sb.append("    personalizedViews: ").append(toIndentedString(personalizedViews)).append("\n");
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
    openapiFields.add("liveboard_filters");
    openapiFields.add("liveboard_tabs");
    openapiFields.add("container_layouts");
    openapiFields.add("visualizations");
    openapiFields.add("parameter_overrides");
    openapiFields.add("personalized_views");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LiveboardDetailsInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LiveboardDetailsInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LiveboardDetailsInput is not found in the empty JSON string", LiveboardDetailsInput.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LiveboardDetailsInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LiveboardDetailsInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LiveboardDetailsInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LiveboardDetailsInput.class));

       return (TypeAdapter<T>) new TypeAdapter<LiveboardDetailsInput>() {
           @Override
           public void write(JsonWriter out, LiveboardDetailsInput value) throws IOException {
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
           public LiveboardDetailsInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             LiveboardDetailsInput instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of LiveboardDetailsInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LiveboardDetailsInput
   * @throws IOException if the JSON string is invalid with respect to LiveboardDetailsInput
   */
  public static LiveboardDetailsInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LiveboardDetailsInput.class);
  }

  /**
   * Convert an instance of LiveboardDetailsInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

