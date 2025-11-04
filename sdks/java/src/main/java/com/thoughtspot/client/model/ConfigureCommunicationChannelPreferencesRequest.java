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
import com.thoughtspot.client.model.EventChannelConfigInput;
import com.thoughtspot.client.model.OrgChannelConfigInput;
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
 * ConfigureCommunicationChannelPreferencesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ConfigureCommunicationChannelPreferencesRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CLUSTER_PREFERENCES = "cluster_preferences";
  @SerializedName(SERIALIZED_NAME_CLUSTER_PREFERENCES)
  @javax.annotation.Nullable
  private List<EventChannelConfigInput> clusterPreferences;

  public static final String SERIALIZED_NAME_ORG_PREFERENCES = "org_preferences";
  @SerializedName(SERIALIZED_NAME_ORG_PREFERENCES)
  @javax.annotation.Nullable
  private List<OrgChannelConfigInput> orgPreferences;

  public ConfigureCommunicationChannelPreferencesRequest() {
  }

  public ConfigureCommunicationChannelPreferencesRequest clusterPreferences(@javax.annotation.Nullable List<EventChannelConfigInput> clusterPreferences) {
    this.clusterPreferences = clusterPreferences;
    return this;
  }

  public ConfigureCommunicationChannelPreferencesRequest addClusterPreferencesItem(EventChannelConfigInput clusterPreferencesItem) {
    if (this.clusterPreferences == null) {
      this.clusterPreferences = new ArrayList<>();
    }
    this.clusterPreferences.add(clusterPreferencesItem);
    return this;
  }

  /**
   * Cluster-level default configurations.
   * @return clusterPreferences
   */
  @javax.annotation.Nullable
  public List<EventChannelConfigInput> getClusterPreferences() {
    return clusterPreferences;
  }

  public void setClusterPreferences(@javax.annotation.Nullable List<EventChannelConfigInput> clusterPreferences) {
    this.clusterPreferences = clusterPreferences;
  }


  public ConfigureCommunicationChannelPreferencesRequest orgPreferences(@javax.annotation.Nullable List<OrgChannelConfigInput> orgPreferences) {
    this.orgPreferences = orgPreferences;
    return this;
  }

  public ConfigureCommunicationChannelPreferencesRequest addOrgPreferencesItem(OrgChannelConfigInput orgPreferencesItem) {
    if (this.orgPreferences == null) {
      this.orgPreferences = new ArrayList<>();
    }
    this.orgPreferences.add(orgPreferencesItem);
    return this;
  }

  /**
   * Org-specific configurations.
   * @return orgPreferences
   */
  @javax.annotation.Nullable
  public List<OrgChannelConfigInput> getOrgPreferences() {
    return orgPreferences;
  }

  public void setOrgPreferences(@javax.annotation.Nullable List<OrgChannelConfigInput> orgPreferences) {
    this.orgPreferences = orgPreferences;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigureCommunicationChannelPreferencesRequest configureCommunicationChannelPreferencesRequest = (ConfigureCommunicationChannelPreferencesRequest) o;
    return Objects.equals(this.clusterPreferences, configureCommunicationChannelPreferencesRequest.clusterPreferences) &&
        Objects.equals(this.orgPreferences, configureCommunicationChannelPreferencesRequest.orgPreferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterPreferences, orgPreferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigureCommunicationChannelPreferencesRequest {\n");
    sb.append("    clusterPreferences: ").append(toIndentedString(clusterPreferences)).append("\n");
    sb.append("    orgPreferences: ").append(toIndentedString(orgPreferences)).append("\n");
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
    openapiFields.add("cluster_preferences");
    openapiFields.add("org_preferences");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConfigureCommunicationChannelPreferencesRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConfigureCommunicationChannelPreferencesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigureCommunicationChannelPreferencesRequest is not found in the empty JSON string", ConfigureCommunicationChannelPreferencesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConfigureCommunicationChannelPreferencesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigureCommunicationChannelPreferencesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("cluster_preferences") != null && !jsonObj.get("cluster_preferences").isJsonNull()) {
        JsonArray jsonArrayclusterPreferences = jsonObj.getAsJsonArray("cluster_preferences");
        if (jsonArrayclusterPreferences != null) {
          // ensure the json data is an array
          if (!jsonObj.get("cluster_preferences").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `cluster_preferences` to be an array in the JSON string but got `%s`", jsonObj.get("cluster_preferences").toString()));
          }

          // validate the optional field `cluster_preferences` (array)
          for (int i = 0; i < jsonArrayclusterPreferences.size(); i++) {
            EventChannelConfigInput.validateJsonElement(jsonArrayclusterPreferences.get(i));
          };
        }
      }
      if (jsonObj.get("org_preferences") != null && !jsonObj.get("org_preferences").isJsonNull()) {
        JsonArray jsonArrayorgPreferences = jsonObj.getAsJsonArray("org_preferences");
        if (jsonArrayorgPreferences != null) {
          // ensure the json data is an array
          if (!jsonObj.get("org_preferences").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `org_preferences` to be an array in the JSON string but got `%s`", jsonObj.get("org_preferences").toString()));
          }

          // validate the optional field `org_preferences` (array)
          for (int i = 0; i < jsonArrayorgPreferences.size(); i++) {
            OrgChannelConfigInput.validateJsonElement(jsonArrayorgPreferences.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigureCommunicationChannelPreferencesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigureCommunicationChannelPreferencesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigureCommunicationChannelPreferencesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigureCommunicationChannelPreferencesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigureCommunicationChannelPreferencesRequest>() {
           @Override
           public void write(JsonWriter out, ConfigureCommunicationChannelPreferencesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigureCommunicationChannelPreferencesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConfigureCommunicationChannelPreferencesRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConfigureCommunicationChannelPreferencesRequest
   * @throws IOException if the JSON string is invalid with respect to ConfigureCommunicationChannelPreferencesRequest
   */
  public static ConfigureCommunicationChannelPreferencesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigureCommunicationChannelPreferencesRequest.class);
  }

  /**
   * Convert an instance of ConfigureCommunicationChannelPreferencesRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

