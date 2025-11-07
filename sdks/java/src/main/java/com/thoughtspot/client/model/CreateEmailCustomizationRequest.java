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
import com.thoughtspot.client.model.TemplatePropertiesInputCreate;
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
 * CreateEmailCustomizationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class CreateEmailCustomizationRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TEMPLATE_PROPERTIES = "template_properties";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_PROPERTIES)
  @javax.annotation.Nonnull
  private TemplatePropertiesInputCreate templateProperties;

  public static final String SERIALIZED_NAME_ORG_IDENTIFIER = "org_identifier";
  @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIER)
  @javax.annotation.Nullable
  private String orgIdentifier;

  public CreateEmailCustomizationRequest() {
  }

  public CreateEmailCustomizationRequest templateProperties(@javax.annotation.Nonnull TemplatePropertiesInputCreate templateProperties) {
    this.templateProperties = templateProperties;
    return this;
  }

  /**
   * Email customization configuration as key value pair
   * @return templateProperties
   */
  @javax.annotation.Nonnull
  public TemplatePropertiesInputCreate getTemplateProperties() {
    return templateProperties;
  }

  public void setTemplateProperties(@javax.annotation.Nonnull TemplatePropertiesInputCreate templateProperties) {
    this.templateProperties = templateProperties;
  }


  public CreateEmailCustomizationRequest orgIdentifier(@javax.annotation.Nullable String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
    return this;
  }

  /**
   * Unique ID or name of org    Version: 10.12.0.cl or later 
   * @return orgIdentifier
   */
  @javax.annotation.Nullable
  public String getOrgIdentifier() {
    return orgIdentifier;
  }

  public void setOrgIdentifier(@javax.annotation.Nullable String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEmailCustomizationRequest createEmailCustomizationRequest = (CreateEmailCustomizationRequest) o;
    return Objects.equals(this.templateProperties, createEmailCustomizationRequest.templateProperties) &&
        Objects.equals(this.orgIdentifier, createEmailCustomizationRequest.orgIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateProperties, orgIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmailCustomizationRequest {\n");
    sb.append("    templateProperties: ").append(toIndentedString(templateProperties)).append("\n");
    sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
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
    openapiFields.add("template_properties");
    openapiFields.add("org_identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("template_properties");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateEmailCustomizationRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateEmailCustomizationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEmailCustomizationRequest is not found in the empty JSON string", CreateEmailCustomizationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateEmailCustomizationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEmailCustomizationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateEmailCustomizationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `template_properties`
      TemplatePropertiesInputCreate.validateJsonElement(jsonObj.get("template_properties"));
      if ((jsonObj.get("org_identifier") != null && !jsonObj.get("org_identifier").isJsonNull()) && !jsonObj.get("org_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateEmailCustomizationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEmailCustomizationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEmailCustomizationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEmailCustomizationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEmailCustomizationRequest>() {
           @Override
           public void write(JsonWriter out, CreateEmailCustomizationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEmailCustomizationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateEmailCustomizationRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateEmailCustomizationRequest
   * @throws IOException if the JSON string is invalid with respect to CreateEmailCustomizationRequest
   */
  public static CreateEmailCustomizationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEmailCustomizationRequest.class);
  }

  /**
   * Convert an instance of CreateEmailCustomizationRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

