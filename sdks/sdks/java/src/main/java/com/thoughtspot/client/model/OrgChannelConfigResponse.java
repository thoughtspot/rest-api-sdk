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
import com.thoughtspot.client.model.EventChannelConfig;
import com.thoughtspot.client.model.OrgDetails;
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
 * OrgChannelConfigResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class OrgChannelConfigResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ORG = "org";
  @SerializedName(SERIALIZED_NAME_ORG)
  @javax.annotation.Nonnull
  private OrgDetails org;

  public static final String SERIALIZED_NAME_PREFERENCES = "preferences";
  @SerializedName(SERIALIZED_NAME_PREFERENCES)
  @javax.annotation.Nonnull
  private List<EventChannelConfig> preferences;

  public OrgChannelConfigResponse() {
  }

  public OrgChannelConfigResponse org(@javax.annotation.Nonnull OrgDetails org) {
    this.org = org;
    return this;
  }

  /**
   * Get org
   * @return org
   */
  @javax.annotation.Nonnull
  public OrgDetails getOrg() {
    return org;
  }

  public void setOrg(@javax.annotation.Nonnull OrgDetails org) {
    this.org = org;
  }


  public OrgChannelConfigResponse preferences(@javax.annotation.Nonnull List<EventChannelConfig> preferences) {
    this.preferences = preferences;
    return this;
  }

  public OrgChannelConfigResponse addPreferencesItem(EventChannelConfig preferencesItem) {
    if (this.preferences == null) {
      this.preferences = new ArrayList<>();
    }
    this.preferences.add(preferencesItem);
    return this;
  }

  /**
   * Event-specific communication channel configurations for this org
   * @return preferences
   */
  @javax.annotation.Nonnull
  public List<EventChannelConfig> getPreferences() {
    return preferences;
  }

  public void setPreferences(@javax.annotation.Nonnull List<EventChannelConfig> preferences) {
    this.preferences = preferences;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgChannelConfigResponse orgChannelConfigResponse = (OrgChannelConfigResponse) o;
    return Objects.equals(this.org, orgChannelConfigResponse.org) &&
        Objects.equals(this.preferences, orgChannelConfigResponse.preferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(org, preferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgChannelConfigResponse {\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
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
    openapiFields.add("org");
    openapiFields.add("preferences");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("org");
    openapiRequiredFields.add("preferences");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrgChannelConfigResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrgChannelConfigResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrgChannelConfigResponse is not found in the empty JSON string", OrgChannelConfigResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrgChannelConfigResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrgChannelConfigResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrgChannelConfigResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `org`
      OrgDetails.validateJsonElement(jsonObj.get("org"));
      // ensure the json data is an array
      if (!jsonObj.get("preferences").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `preferences` to be an array in the JSON string but got `%s`", jsonObj.get("preferences").toString()));
      }

      JsonArray jsonArraypreferences = jsonObj.getAsJsonArray("preferences");
      // validate the required field `preferences` (array)
      for (int i = 0; i < jsonArraypreferences.size(); i++) {
        EventChannelConfig.validateJsonElement(jsonArraypreferences.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrgChannelConfigResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrgChannelConfigResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrgChannelConfigResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrgChannelConfigResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OrgChannelConfigResponse>() {
           @Override
           public void write(JsonWriter out, OrgChannelConfigResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrgChannelConfigResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrgChannelConfigResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrgChannelConfigResponse
   * @throws IOException if the JSON string is invalid with respect to OrgChannelConfigResponse
   */
  public static OrgChannelConfigResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrgChannelConfigResponse.class);
  }

  /**
   * Convert an instance of OrgChannelConfigResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

