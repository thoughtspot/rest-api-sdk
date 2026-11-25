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
import com.thoughtspot.client.model.ContextImportSummary;
import com.thoughtspot.client.model.ImportDiagnostic;
import com.thoughtspot.client.model.ImportFailure;
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
 * Response from importContext. &#x60;status&#x60; says how the import ended; the other fields say what it changed, or would change in a dry run, and why it failed.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ImportContextResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Terminal status of the import. &#x60;SUCCESS&#x60; means it completed, or in a dry run that the preview is complete. &#x60;VALIDATION_FAILED&#x60; means the file has problems, all listed in &#x60;validation_failures&#x60;, and nothing was written. &#x60;FAILED&#x60; means a valid file hit a server error; see &#x60;diagnostics&#x60;.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCESS("SUCCESS"),
    
    VALIDATION_FAILED("VALIDATION_FAILED"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private StatusEnum status;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  @javax.annotation.Nullable
  private List<ContextImportSummary> summary;

  public static final String SERIALIZED_NAME_VALIDATION_FAILURES = "validation_failures";
  @SerializedName(SERIALIZED_NAME_VALIDATION_FAILURES)
  @javax.annotation.Nullable
  private List<ImportFailure> validationFailures;

  public static final String SERIALIZED_NAME_DIAGNOSTICS = "diagnostics";
  @SerializedName(SERIALIZED_NAME_DIAGNOSTICS)
  @javax.annotation.Nullable
  private List<ImportDiagnostic> diagnostics;

  public static final String SERIALIZED_NAME_OPERATION_ID = "operation_id";
  @SerializedName(SERIALIZED_NAME_OPERATION_ID)
  @javax.annotation.Nullable
  private String operationId;

  public ImportContextResponse() {
  }

  public ImportContextResponse status(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Terminal status of the import. &#x60;SUCCESS&#x60; means it completed, or in a dry run that the preview is complete. &#x60;VALIDATION_FAILED&#x60; means the file has problems, all listed in &#x60;validation_failures&#x60;, and nothing was written. &#x60;FAILED&#x60; means a valid file hit a server error; see &#x60;diagnostics&#x60;.
   * @return status
   */
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
  }


  public ImportContextResponse summary(@javax.annotation.Nullable List<ContextImportSummary> summary) {
    this.summary = summary;
    return this;
  }

  public ImportContextResponse addSummaryItem(ContextImportSummary summaryItem) {
    if (this.summary == null) {
      this.summary = new ArrayList<>();
    }
    this.summary.add(summaryItem);
    return this;
  }

  /**
   * What the import changes, one entry per owner: entities before the import, deleted and inserted. Previews in a dry run. Every selected model and analyst has an entry, and so does the Org when the file selects org-level context. When the file selects the whole Org, only the owners with context in this environment or in the file have an entry.
   * @return summary
   */
  @javax.annotation.Nullable
  public List<ContextImportSummary> getSummary() {
    return summary;
  }

  public void setSummary(@javax.annotation.Nullable List<ContextImportSummary> summary) {
    this.summary = summary;
  }


  public ImportContextResponse validationFailures(@javax.annotation.Nullable List<ImportFailure> validationFailures) {
    this.validationFailures = validationFailures;
    return this;
  }

  public ImportContextResponse addValidationFailuresItem(ImportFailure validationFailuresItem) {
    if (this.validationFailures == null) {
      this.validationFailures = new ArrayList<>();
    }
    this.validationFailures.add(validationFailuresItem);
    return this;
  }

  /**
   * Every problem found in the file, each with its line, entity key, field, reason and message. Nothing is written when any are present.
   * @return validationFailures
   */
  @javax.annotation.Nullable
  public List<ImportFailure> getValidationFailures() {
    return validationFailures;
  }

  public void setValidationFailures(@javax.annotation.Nullable List<ImportFailure> validationFailures) {
    this.validationFailures = validationFailures;
  }


  public ImportContextResponse diagnostics(@javax.annotation.Nullable List<ImportDiagnostic> diagnostics) {
    this.diagnostics = diagnostics;
    return this;
  }

  public ImportContextResponse addDiagnosticsItem(ImportDiagnostic diagnosticsItem) {
    if (this.diagnostics == null) {
      this.diagnostics = new ArrayList<>();
    }
    this.diagnostics.add(diagnosticsItem);
    return this;
  }

  /**
   * Warnings and failure causes, grouped by &#x60;sub_status&#x60;. Warnings include a selected model or analyst left with no context, an analyst&#39;s context deleted on a model the file doesn&#39;t name, analysts outside the selection whose answers change through a replaced model&#39;s context, and references into the replaced context that break because their targets get new IDs.
   * @return diagnostics
   */
  @javax.annotation.Nullable
  public List<ImportDiagnostic> getDiagnostics() {
    return diagnostics;
  }

  public void setDiagnostics(@javax.annotation.Nullable List<ImportDiagnostic> diagnostics) {
    this.diagnostics = diagnostics;
  }


  public ImportContextResponse operationId(@javax.annotation.Nullable String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * Server-generated identifier for this import. Include it when contacting support to help correlate server-side logs.
   * @return operationId
   */
  @javax.annotation.Nullable
  public String getOperationId() {
    return operationId;
  }

  public void setOperationId(@javax.annotation.Nullable String operationId) {
    this.operationId = operationId;
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
   * @return the ImportContextResponse instance itself
   */
  public ImportContextResponse putAdditionalProperty(String key, Object value) {
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
    ImportContextResponse importContextResponse = (ImportContextResponse) o;
    return Objects.equals(this.status, importContextResponse.status) &&
        Objects.equals(this.summary, importContextResponse.summary) &&
        Objects.equals(this.validationFailures, importContextResponse.validationFailures) &&
        Objects.equals(this.diagnostics, importContextResponse.diagnostics) &&
        Objects.equals(this.operationId, importContextResponse.operationId)&&
        Objects.equals(this.additionalProperties, importContextResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, summary, validationFailures, diagnostics, operationId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportContextResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    validationFailures: ").append(toIndentedString(validationFailures)).append("\n");
    sb.append("    diagnostics: ").append(toIndentedString(diagnostics)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("summary");
    openapiFields.add("validation_failures");
    openapiFields.add("diagnostics");
    openapiFields.add("operation_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ImportContextResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ImportContextResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportContextResponse is not found in the empty JSON string", ImportContextResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImportContextResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) {
        JsonArray jsonArraysummary = jsonObj.getAsJsonArray("summary");
        if (jsonArraysummary != null) {
          // ensure the json data is an array
          if (!jsonObj.get("summary").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `summary` to be an array in the JSON string but got `%s`", jsonObj.get("summary").toString()));
          }

          // validate the optional field `summary` (array)
          for (int i = 0; i < jsonArraysummary.size(); i++) {
            ContextImportSummary.validateJsonElement(jsonArraysummary.get(i));
          };
        }
      }
      if (jsonObj.get("validation_failures") != null && !jsonObj.get("validation_failures").isJsonNull()) {
        JsonArray jsonArrayvalidationFailures = jsonObj.getAsJsonArray("validation_failures");
        if (jsonArrayvalidationFailures != null) {
          // ensure the json data is an array
          if (!jsonObj.get("validation_failures").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `validation_failures` to be an array in the JSON string but got `%s`", jsonObj.get("validation_failures").toString()));
          }

          // validate the optional field `validation_failures` (array)
          for (int i = 0; i < jsonArrayvalidationFailures.size(); i++) {
            ImportFailure.validateJsonElement(jsonArrayvalidationFailures.get(i));
          };
        }
      }
      if (jsonObj.get("diagnostics") != null && !jsonObj.get("diagnostics").isJsonNull()) {
        JsonArray jsonArraydiagnostics = jsonObj.getAsJsonArray("diagnostics");
        if (jsonArraydiagnostics != null) {
          // ensure the json data is an array
          if (!jsonObj.get("diagnostics").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `diagnostics` to be an array in the JSON string but got `%s`", jsonObj.get("diagnostics").toString()));
          }

          // validate the optional field `diagnostics` (array)
          for (int i = 0; i < jsonArraydiagnostics.size(); i++) {
            ImportDiagnostic.validateJsonElement(jsonArraydiagnostics.get(i));
          };
        }
      }
      if ((jsonObj.get("operation_id") != null && !jsonObj.get("operation_id").isJsonNull()) && !jsonObj.get("operation_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportContextResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportContextResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportContextResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportContextResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportContextResponse>() {
           @Override
           public void write(JsonWriter out, ImportContextResponse value) throws IOException {
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
           public ImportContextResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ImportContextResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of ImportContextResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ImportContextResponse
   * @throws IOException if the JSON string is invalid with respect to ImportContextResponse
   */
  public static ImportContextResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportContextResponse.class);
  }

  /**
   * Convert an instance of ImportContextResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

