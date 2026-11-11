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
import com.thoughtspot.client.model.ContextExportSummary;
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
 * Response from exportContext: the exported file, and what it holds per owner.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ExportContextResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  @javax.annotation.Nullable
  private String content;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  @javax.annotation.Nullable
  private List<ContextExportSummary> summary;

  public static final String SERIALIZED_NAME_ADDITIONAL_MODEL_IDENTIFIERS = "additional_model_identifiers";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_MODEL_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> additionalModelIdentifiers;

  public static final String SERIALIZED_NAME_ADDITIONAL_ANALYST_IDENTIFIERS = "additional_analyst_identifiers";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ANALYST_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> additionalAnalystIdentifiers;

  public ExportContextResponse() {
  }

  public ExportContextResponse content(@javax.annotation.Nullable String content) {
    this.content = content;
    return this;
  }

  /**
   * The exported context as a YAML file. Pass it to importContext in the target environment, as is or after editing.
   * @return content
   */
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(@javax.annotation.Nullable String content) {
    this.content = content;
  }


  public ExportContextResponse summary(@javax.annotation.Nullable List<ContextExportSummary> summary) {
    this.summary = summary;
    return this;
  }

  public ExportContextResponse addSummaryItem(ContextExportSummary summaryItem) {
    if (this.summary == null) {
      this.summary = new ArrayList<>();
    }
    this.summary.add(summaryItem);
    return this;
  }

  /**
   * What the file holds, one entry per owner. Every selected model and analyst has an entry, even with a count of 0, and so does the Org when org-level context is selected. With &#x60;export_all_org_context&#x60;, only the owners that have context have an entry.
   * @return summary
   */
  @javax.annotation.Nullable
  public List<ContextExportSummary> getSummary() {
    return summary;
  }

  public void setSummary(@javax.annotation.Nullable List<ContextExportSummary> summary) {
    this.summary = summary;
  }


  public ExportContextResponse additionalModelIdentifiers(@javax.annotation.Nullable List<String> additionalModelIdentifiers) {
    this.additionalModelIdentifiers = additionalModelIdentifiers;
    return this;
  }

  public ExportContextResponse addAdditionalModelIdentifiersItem(String additionalModelIdentifiersItem) {
    if (this.additionalModelIdentifiers == null) {
      this.additionalModelIdentifiers = new ArrayList<>();
    }
    this.additionalModelIdentifiers.add(additionalModelIdentifiersItem);
    return this;
  }

  /**
   * Context that a selected model shares with models outside the selection is left out of the file, because importing this selection wouldn&#39;t replace it. These are the GUIDs of those other models: add them to &#x60;model_identifiers&#x60; and export again to include that context. For example, a metric scoped to models M1 and M2 is left out when only M1 is selected, and M2 is listed here. Empty when nothing was left out.
   * @return additionalModelIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getAdditionalModelIdentifiers() {
    return additionalModelIdentifiers;
  }

  public void setAdditionalModelIdentifiers(@javax.annotation.Nullable List<String> additionalModelIdentifiers) {
    this.additionalModelIdentifiers = additionalModelIdentifiers;
  }


  public ExportContextResponse additionalAnalystIdentifiers(@javax.annotation.Nullable List<String> additionalAnalystIdentifiers) {
    this.additionalAnalystIdentifiers = additionalAnalystIdentifiers;
    return this;
  }

  public ExportContextResponse addAdditionalAnalystIdentifiersItem(String additionalAnalystIdentifiersItem) {
    if (this.additionalAnalystIdentifiers == null) {
      this.additionalAnalystIdentifiers = new ArrayList<>();
    }
    this.additionalAnalystIdentifiers.add(additionalAnalystIdentifiersItem);
    return this;
  }

  /**
   * Context that a selected Spotter analyst shares with analysts outside the selection is left out of the file, because importing this selection wouldn&#39;t replace it. These are the IDs of those other analysts: add them to &#x60;analyst_identifiers&#x60; and export again to include that context. For example, an instruction scoped to analysts A and B is left out when only A is selected, and B is listed here. Empty when nothing was left out.
   * @return additionalAnalystIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getAdditionalAnalystIdentifiers() {
    return additionalAnalystIdentifiers;
  }

  public void setAdditionalAnalystIdentifiers(@javax.annotation.Nullable List<String> additionalAnalystIdentifiers) {
    this.additionalAnalystIdentifiers = additionalAnalystIdentifiers;
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
   * @return the ExportContextResponse instance itself
   */
  public ExportContextResponse putAdditionalProperty(String key, Object value) {
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
    ExportContextResponse exportContextResponse = (ExportContextResponse) o;
    return Objects.equals(this.content, exportContextResponse.content) &&
        Objects.equals(this.summary, exportContextResponse.summary) &&
        Objects.equals(this.additionalModelIdentifiers, exportContextResponse.additionalModelIdentifiers) &&
        Objects.equals(this.additionalAnalystIdentifiers, exportContextResponse.additionalAnalystIdentifiers)&&
        Objects.equals(this.additionalProperties, exportContextResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, summary, additionalModelIdentifiers, additionalAnalystIdentifiers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportContextResponse {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    additionalModelIdentifiers: ").append(toIndentedString(additionalModelIdentifiers)).append("\n");
    sb.append("    additionalAnalystIdentifiers: ").append(toIndentedString(additionalAnalystIdentifiers)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("summary");
    openapiFields.add("additional_model_identifiers");
    openapiFields.add("additional_analyst_identifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ExportContextResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportContextResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportContextResponse is not found in the empty JSON string", ExportContextResponse.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) {
        JsonArray jsonArraysummary = jsonObj.getAsJsonArray("summary");
        if (jsonArraysummary != null) {
          // ensure the json data is an array
          if (!jsonObj.get("summary").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `summary` to be an array in the JSON string but got `%s`", jsonObj.get("summary").toString()));
          }

          // validate the optional field `summary` (array)
          for (int i = 0; i < jsonArraysummary.size(); i++) {
            ContextExportSummary.validateJsonElement(jsonArraysummary.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("additional_model_identifiers") != null && !jsonObj.get("additional_model_identifiers").isJsonNull() && !jsonObj.get("additional_model_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_model_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("additional_model_identifiers").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("additional_analyst_identifiers") != null && !jsonObj.get("additional_analyst_identifiers").isJsonNull() && !jsonObj.get("additional_analyst_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_analyst_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("additional_analyst_identifiers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportContextResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportContextResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportContextResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportContextResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportContextResponse>() {
           @Override
           public void write(JsonWriter out, ExportContextResponse value) throws IOException {
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
           public ExportContextResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ExportContextResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of ExportContextResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExportContextResponse
   * @throws IOException if the JSON string is invalid with respect to ExportContextResponse
   */
  public static ExportContextResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportContextResponse.class);
  }

  /**
   * Convert an instance of ExportContextResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

