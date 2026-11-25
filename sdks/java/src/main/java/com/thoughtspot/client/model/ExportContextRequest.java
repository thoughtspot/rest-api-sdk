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
 * ExportContextRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ExportContextRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MODEL_IDENTIFIERS = "model_identifiers";
  @SerializedName(SERIALIZED_NAME_MODEL_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> modelIdentifiers = new ArrayList<>();

  public static final String SERIALIZED_NAME_ANALYST_IDENTIFIERS = "analyst_identifiers";
  @SerializedName(SERIALIZED_NAME_ANALYST_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> analystIdentifiers = new ArrayList<>();

  public static final String SERIALIZED_NAME_INCLUDE_ANALYST_MODELS = "include_analyst_models";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ANALYST_MODELS)
  @javax.annotation.Nullable
  private Boolean includeAnalystModels = false;

  public static final String SERIALIZED_NAME_INCLUDE_ORG_LEVEL_CONTEXT = "include_org_level_context";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ORG_LEVEL_CONTEXT)
  @javax.annotation.Nullable
  private Boolean includeOrgLevelContext = false;

  public static final String SERIALIZED_NAME_EXPORT_ALL_ORG_CONTEXT = "export_all_org_context";
  @SerializedName(SERIALIZED_NAME_EXPORT_ALL_ORG_CONTEXT)
  @javax.annotation.Nullable
  private Boolean exportAllOrgContext = false;

  public ExportContextRequest() {
  }

  public ExportContextRequest modelIdentifiers(@javax.annotation.Nullable List<String> modelIdentifiers) {
    this.modelIdentifiers = modelIdentifiers;
    return this;
  }

  public ExportContextRequest addModelIdentifiersItem(String modelIdentifiersItem) {
    if (this.modelIdentifiers == null) {
      this.modelIdentifiers = new ArrayList<>();
    }
    this.modelIdentifiers.add(modelIdentifiersItem);
    return this;
  }

  /**
   * GUIDs or obj_ids of the models whose context to export. Exports the context each model owns: entities scoped to that model, or to several models that are all selected.
   * @return modelIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getModelIdentifiers() {
    return modelIdentifiers;
  }

  public void setModelIdentifiers(@javax.annotation.Nullable List<String> modelIdentifiers) {
    this.modelIdentifiers = modelIdentifiers;
  }


  public ExportContextRequest analystIdentifiers(@javax.annotation.Nullable List<String> analystIdentifiers) {
    this.analystIdentifiers = analystIdentifiers;
    return this;
  }

  public ExportContextRequest addAnalystIdentifiersItem(String analystIdentifiersItem) {
    if (this.analystIdentifiers == null) {
      this.analystIdentifiers = new ArrayList<>();
    }
    this.analystIdentifiers.add(analystIdentifiersItem);
    return this;
  }

  /**
   * IDs of the Spotter analysts whose context to export. Exports every entity that names only selected analysts, whichever models it also names.
   * @return analystIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getAnalystIdentifiers() {
    return analystIdentifiers;
  }

  public void setAnalystIdentifiers(@javax.annotation.Nullable List<String> analystIdentifiers) {
    this.analystIdentifiers = analystIdentifiers;
  }


  public ExportContextRequest includeAnalystModels(@javax.annotation.Nullable Boolean includeAnalystModels) {
    this.includeAnalystModels = includeAnalystModels;
    return this;
  }

  /**
   * When &#x60;true&#x60;, also selects every model the selected analysts use. The file lists those models, so importing it replaces exactly them.
   * @return includeAnalystModels
   */
  @javax.annotation.Nullable
  public Boolean getIncludeAnalystModels() {
    return includeAnalystModels;
  }

  public void setIncludeAnalystModels(@javax.annotation.Nullable Boolean includeAnalystModels) {
    this.includeAnalystModels = includeAnalystModels;
  }


  public ExportContextRequest includeOrgLevelContext(@javax.annotation.Nullable Boolean includeOrgLevelContext) {
    this.includeOrgLevelContext = includeOrgLevelContext;
    return this;
  }

  /**
   * When &#x60;true&#x60;, also selects the org-level context: entities that name no model and no analyst and apply to every question in the Org. Requires the &#x60;ADMINISTRATION&#x60; privilege.
   * @return includeOrgLevelContext
   */
  @javax.annotation.Nullable
  public Boolean getIncludeOrgLevelContext() {
    return includeOrgLevelContext;
  }

  public void setIncludeOrgLevelContext(@javax.annotation.Nullable Boolean includeOrgLevelContext) {
    this.includeOrgLevelContext = includeOrgLevelContext;
  }


  public ExportContextRequest exportAllOrgContext(@javax.annotation.Nullable Boolean exportAllOrgContext) {
    this.exportAllOrgContext = exportAllOrgContext;
    return this;
  }

  /**
   * When &#x60;true&#x60;, selects everything in the Org: every model, every analyst and the org-level context. Must be used on its own. Importing the resulting file replaces all of the target Org&#39;s context. Requires the &#x60;ADMINISTRATION&#x60; privilege.
   * @return exportAllOrgContext
   */
  @javax.annotation.Nullable
  public Boolean getExportAllOrgContext() {
    return exportAllOrgContext;
  }

  public void setExportAllOrgContext(@javax.annotation.Nullable Boolean exportAllOrgContext) {
    this.exportAllOrgContext = exportAllOrgContext;
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
   * @return the ExportContextRequest instance itself
   */
  public ExportContextRequest putAdditionalProperty(String key, Object value) {
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
    ExportContextRequest exportContextRequest = (ExportContextRequest) o;
    return Objects.equals(this.modelIdentifiers, exportContextRequest.modelIdentifiers) &&
        Objects.equals(this.analystIdentifiers, exportContextRequest.analystIdentifiers) &&
        Objects.equals(this.includeAnalystModels, exportContextRequest.includeAnalystModels) &&
        Objects.equals(this.includeOrgLevelContext, exportContextRequest.includeOrgLevelContext) &&
        Objects.equals(this.exportAllOrgContext, exportContextRequest.exportAllOrgContext)&&
        Objects.equals(this.additionalProperties, exportContextRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelIdentifiers, analystIdentifiers, includeAnalystModels, includeOrgLevelContext, exportAllOrgContext, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportContextRequest {\n");
    sb.append("    modelIdentifiers: ").append(toIndentedString(modelIdentifiers)).append("\n");
    sb.append("    analystIdentifiers: ").append(toIndentedString(analystIdentifiers)).append("\n");
    sb.append("    includeAnalystModels: ").append(toIndentedString(includeAnalystModels)).append("\n");
    sb.append("    includeOrgLevelContext: ").append(toIndentedString(includeOrgLevelContext)).append("\n");
    sb.append("    exportAllOrgContext: ").append(toIndentedString(exportAllOrgContext)).append("\n");
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
    openapiFields.add("model_identifiers");
    openapiFields.add("analyst_identifiers");
    openapiFields.add("include_analyst_models");
    openapiFields.add("include_org_level_context");
    openapiFields.add("export_all_org_context");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ExportContextRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportContextRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportContextRequest is not found in the empty JSON string", ExportContextRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("model_identifiers") != null && !jsonObj.get("model_identifiers").isJsonNull() && !jsonObj.get("model_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `model_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("model_identifiers").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("analyst_identifiers") != null && !jsonObj.get("analyst_identifiers").isJsonNull() && !jsonObj.get("analyst_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `analyst_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("analyst_identifiers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportContextRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportContextRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportContextRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportContextRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportContextRequest>() {
           @Override
           public void write(JsonWriter out, ExportContextRequest value) throws IOException {
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
           public ExportContextRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ExportContextRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of ExportContextRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExportContextRequest
   * @throws IOException if the JSON string is invalid with respect to ExportContextRequest
   */
  public static ExportContextRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportContextRequest.class);
  }

  /**
   * Convert an instance of ExportContextRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

