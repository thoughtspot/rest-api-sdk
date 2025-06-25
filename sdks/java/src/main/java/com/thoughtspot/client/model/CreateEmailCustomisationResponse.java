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
import com.thoughtspot.client.model.OrgType;
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
 * CreateEmailCustomisationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class CreateEmailCustomisationResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  @javax.annotation.Nonnull
  private String tenantId;

  public static final String SERIALIZED_NAME_ORG = "org";
  @SerializedName(SERIALIZED_NAME_ORG)
  @javax.annotation.Nonnull
  private OrgType org;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_TEMPLATE_PROPERTIES = "template_properties";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_PROPERTIES)
  @javax.annotation.Nonnull
  private Object templateProperties;

  public CreateEmailCustomisationResponse() {
  }

  public CreateEmailCustomisationResponse tenantId(@javax.annotation.Nonnull String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Tenant ID
   * @return tenantId
   */
  @javax.annotation.Nonnull
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(@javax.annotation.Nonnull String tenantId) {
    this.tenantId = tenantId;
  }


  public CreateEmailCustomisationResponse org(@javax.annotation.Nonnull OrgType org) {
    this.org = org;
    return this;
  }

  /**
   * Get org
   * @return org
   */
  @javax.annotation.Nonnull
  public OrgType getOrg() {
    return org;
  }

  public void setOrg(@javax.annotation.Nonnull OrgType org) {
    this.org = org;
  }


  public CreateEmailCustomisationResponse name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Email customization name.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public CreateEmailCustomisationResponse templateProperties(@javax.annotation.Nonnull Object templateProperties) {
    this.templateProperties = templateProperties;
    return this;
  }

  /**
   * Customization configuration for the email
   * @return templateProperties
   */
  @javax.annotation.Nonnull
  public Object getTemplateProperties() {
    return templateProperties;
  }

  public void setTemplateProperties(@javax.annotation.Nonnull Object templateProperties) {
    this.templateProperties = templateProperties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEmailCustomisationResponse createEmailCustomisationResponse = (CreateEmailCustomisationResponse) o;
    return Objects.equals(this.tenantId, createEmailCustomisationResponse.tenantId) &&
        Objects.equals(this.org, createEmailCustomisationResponse.org) &&
        Objects.equals(this.name, createEmailCustomisationResponse.name) &&
        Objects.equals(this.templateProperties, createEmailCustomisationResponse.templateProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, org, name, templateProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmailCustomisationResponse {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    templateProperties: ").append(toIndentedString(templateProperties)).append("\n");
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
    openapiFields.add("tenant_id");
    openapiFields.add("org");
    openapiFields.add("name");
    openapiFields.add("template_properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tenant_id");
    openapiRequiredFields.add("org");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("template_properties");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateEmailCustomisationResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateEmailCustomisationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEmailCustomisationResponse is not found in the empty JSON string", CreateEmailCustomisationResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateEmailCustomisationResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEmailCustomisationResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateEmailCustomisationResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tenant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant_id").toString()));
      }
      // validate the required field `org`
      OrgType.validateJsonElement(jsonObj.get("org"));
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateEmailCustomisationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEmailCustomisationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEmailCustomisationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEmailCustomisationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEmailCustomisationResponse>() {
           @Override
           public void write(JsonWriter out, CreateEmailCustomisationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEmailCustomisationResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateEmailCustomisationResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateEmailCustomisationResponse
   * @throws IOException if the JSON string is invalid with respect to CreateEmailCustomisationResponse
   */
  public static CreateEmailCustomisationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEmailCustomisationResponse.class);
  }

  /**
   * Convert an instance of CreateEmailCustomisationResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

