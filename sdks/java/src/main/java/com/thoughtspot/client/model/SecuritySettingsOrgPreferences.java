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
import com.thoughtspot.client.model.OrgNonEmbedAccess;
import com.thoughtspot.client.model.SecuritySettingsOrgDetails;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
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
 * Org-level security preferences.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class SecuritySettingsOrgPreferences implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ORG = "org";
  @SerializedName(SERIALIZED_NAME_ORG)
  @javax.annotation.Nullable
  private SecuritySettingsOrgDetails org;

  public static final String SERIALIZED_NAME_CORS_WHITELISTED_URLS = "cors_whitelisted_urls";
  @SerializedName(SERIALIZED_NAME_CORS_WHITELISTED_URLS)
  @javax.annotation.Nullable
  private List<String> corsWhitelistedUrls;

  public static final String SERIALIZED_NAME_NON_EMBED_ACCESS = "non_embed_access";
  @SerializedName(SERIALIZED_NAME_NON_EMBED_ACCESS)
  @javax.annotation.Nullable
  private OrgNonEmbedAccess nonEmbedAccess;

  public SecuritySettingsOrgPreferences() {
  }

  public SecuritySettingsOrgPreferences org(@javax.annotation.Nullable SecuritySettingsOrgDetails org) {
    this.org = org;
    return this;
  }

  /**
   * Get org
   * @return org
   */
  @javax.annotation.Nullable
  public SecuritySettingsOrgDetails getOrg() {
    return org;
  }

  public void setOrg(@javax.annotation.Nullable SecuritySettingsOrgDetails org) {
    this.org = org;
  }


  public SecuritySettingsOrgPreferences corsWhitelistedUrls(@javax.annotation.Nullable List<String> corsWhitelistedUrls) {
    this.corsWhitelistedUrls = corsWhitelistedUrls;
    return this;
  }

  public SecuritySettingsOrgPreferences addCorsWhitelistedUrlsItem(String corsWhitelistedUrlsItem) {
    if (this.corsWhitelistedUrls == null) {
      this.corsWhitelistedUrls = new ArrayList<>();
    }
    this.corsWhitelistedUrls.add(corsWhitelistedUrlsItem);
    return this;
  }

  /**
   * Allowed origins for CORS for this org.
   * @return corsWhitelistedUrls
   */
  @javax.annotation.Nullable
  public List<String> getCorsWhitelistedUrls() {
    return corsWhitelistedUrls;
  }

  public void setCorsWhitelistedUrls(@javax.annotation.Nullable List<String> corsWhitelistedUrls) {
    this.corsWhitelistedUrls = corsWhitelistedUrls;
  }


  public SecuritySettingsOrgPreferences nonEmbedAccess(@javax.annotation.Nullable OrgNonEmbedAccess nonEmbedAccess) {
    this.nonEmbedAccess = nonEmbedAccess;
    return this;
  }

  /**
   * Get nonEmbedAccess
   * @return nonEmbedAccess
   */
  @javax.annotation.Nullable
  public OrgNonEmbedAccess getNonEmbedAccess() {
    return nonEmbedAccess;
  }

  public void setNonEmbedAccess(@javax.annotation.Nullable OrgNonEmbedAccess nonEmbedAccess) {
    this.nonEmbedAccess = nonEmbedAccess;
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
   * @return the SecuritySettingsOrgPreferences instance itself
   */
  public SecuritySettingsOrgPreferences putAdditionalProperty(String key, Object value) {
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
    SecuritySettingsOrgPreferences securitySettingsOrgPreferences = (SecuritySettingsOrgPreferences) o;
    return Objects.equals(this.org, securitySettingsOrgPreferences.org) &&
        Objects.equals(this.corsWhitelistedUrls, securitySettingsOrgPreferences.corsWhitelistedUrls) &&
        Objects.equals(this.nonEmbedAccess, securitySettingsOrgPreferences.nonEmbedAccess)&&
        Objects.equals(this.additionalProperties, securitySettingsOrgPreferences.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(org, corsWhitelistedUrls, nonEmbedAccess, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritySettingsOrgPreferences {\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    corsWhitelistedUrls: ").append(toIndentedString(corsWhitelistedUrls)).append("\n");
    sb.append("    nonEmbedAccess: ").append(toIndentedString(nonEmbedAccess)).append("\n");
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
    openapiFields.add("org");
    openapiFields.add("cors_whitelisted_urls");
    openapiFields.add("non_embed_access");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SecuritySettingsOrgPreferences
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SecuritySettingsOrgPreferences.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SecuritySettingsOrgPreferences is not found in the empty JSON string", SecuritySettingsOrgPreferences.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `org`
      if (jsonObj.get("org") != null && !jsonObj.get("org").isJsonNull()) {
        SecuritySettingsOrgDetails.validateJsonElement(jsonObj.get("org"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cors_whitelisted_urls") != null && !jsonObj.get("cors_whitelisted_urls").isJsonNull() && !jsonObj.get("cors_whitelisted_urls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cors_whitelisted_urls` to be an array in the JSON string but got `%s`", jsonObj.get("cors_whitelisted_urls").toString()));
      }
      // validate the optional field `non_embed_access`
      if (jsonObj.get("non_embed_access") != null && !jsonObj.get("non_embed_access").isJsonNull()) {
        OrgNonEmbedAccess.validateJsonElement(jsonObj.get("non_embed_access"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecuritySettingsOrgPreferences.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecuritySettingsOrgPreferences' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecuritySettingsOrgPreferences> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecuritySettingsOrgPreferences.class));

       return (TypeAdapter<T>) new TypeAdapter<SecuritySettingsOrgPreferences>() {
           @Override
           public void write(JsonWriter out, SecuritySettingsOrgPreferences value) throws IOException {
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
           public SecuritySettingsOrgPreferences read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SecuritySettingsOrgPreferences instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of SecuritySettingsOrgPreferences given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SecuritySettingsOrgPreferences
   * @throws IOException if the JSON string is invalid with respect to SecuritySettingsOrgPreferences
   */
  public static SecuritySettingsOrgPreferences fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecuritySettingsOrgPreferences.class);
  }

  /**
   * Convert an instance of SecuritySettingsOrgPreferences to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

