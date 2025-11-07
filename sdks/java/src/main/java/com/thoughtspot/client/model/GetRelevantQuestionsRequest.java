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
import com.thoughtspot.client.model.AIContext;
import com.thoughtspot.client.model.MetadataContext;
import java.io.IOException;
import java.util.Arrays;
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
 * GetRelevantQuestionsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class GetRelevantQuestionsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_METADATA_CONTEXT = "metadata_context";
  @SerializedName(SERIALIZED_NAME_METADATA_CONTEXT)
  @javax.annotation.Nonnull
  private MetadataContext metadataContext;

  public static final String SERIALIZED_NAME_LIMIT_RELEVANT_QUESTIONS = "limit_relevant_questions";
  @SerializedName(SERIALIZED_NAME_LIMIT_RELEVANT_QUESTIONS)
  @javax.annotation.Nullable
  private Integer limitRelevantQuestions;

  public static final String SERIALIZED_NAME_BYPASS_CACHE = "bypass_cache";
  @SerializedName(SERIALIZED_NAME_BYPASS_CACHE)
  @javax.annotation.Nullable
  private Boolean bypassCache;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  @javax.annotation.Nonnull
  private String query;

  public static final String SERIALIZED_NAME_AI_CONTEXT = "ai_context";
  @SerializedName(SERIALIZED_NAME_AI_CONTEXT)
  @javax.annotation.Nullable
  private AIContext aiContext;

  public GetRelevantQuestionsRequest() {
  }

  public GetRelevantQuestionsRequest metadataContext(@javax.annotation.Nonnull MetadataContext metadataContext) {
    this.metadataContext = metadataContext;
    return this;
  }

  /**
   * metadata for the query to enable generation of relevant sub-questions; at least one context identifier is required.
   * @return metadataContext
   */
  @javax.annotation.Nonnull
  public MetadataContext getMetadataContext() {
    return metadataContext;
  }

  public void setMetadataContext(@javax.annotation.Nonnull MetadataContext metadataContext) {
    this.metadataContext = metadataContext;
  }


  public GetRelevantQuestionsRequest limitRelevantQuestions(@javax.annotation.Nullable Integer limitRelevantQuestions) {
    this.limitRelevantQuestions = limitRelevantQuestions;
    return this;
  }

  /**
   * Maximum number of relevant questions that is allowed in the response, default &#x3D; 5.
   * @return limitRelevantQuestions
   */
  @javax.annotation.Nullable
  public Integer getLimitRelevantQuestions() {
    return limitRelevantQuestions;
  }

  public void setLimitRelevantQuestions(@javax.annotation.Nullable Integer limitRelevantQuestions) {
    this.limitRelevantQuestions = limitRelevantQuestions;
  }


  public GetRelevantQuestionsRequest bypassCache(@javax.annotation.Nullable Boolean bypassCache) {
    this.bypassCache = bypassCache;
    return this;
  }

  /**
   * If true, results are not returned from cache &amp; calculated every time.
   * @return bypassCache
   */
  @javax.annotation.Nullable
  public Boolean getBypassCache() {
    return bypassCache;
  }

  public void setBypassCache(@javax.annotation.Nullable Boolean bypassCache) {
    this.bypassCache = bypassCache;
  }


  public GetRelevantQuestionsRequest query(@javax.annotation.Nonnull String query) {
    this.query = query;
    return this;
  }

  /**
   * A user query that requires breaking down into smaller, more manageable analytical questions to facilitate better understanding and analysis.
   * @return query
   */
  @javax.annotation.Nonnull
  public String getQuery() {
    return query;
  }

  public void setQuery(@javax.annotation.Nonnull String query) {
    this.query = query;
  }


  public GetRelevantQuestionsRequest aiContext(@javax.annotation.Nullable AIContext aiContext) {
    this.aiContext = aiContext;
    return this;
  }

  /**
   * Additional context to guide the response.
   * @return aiContext
   */
  @javax.annotation.Nullable
  public AIContext getAiContext() {
    return aiContext;
  }

  public void setAiContext(@javax.annotation.Nullable AIContext aiContext) {
    this.aiContext = aiContext;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRelevantQuestionsRequest getRelevantQuestionsRequest = (GetRelevantQuestionsRequest) o;
    return Objects.equals(this.metadataContext, getRelevantQuestionsRequest.metadataContext) &&
        Objects.equals(this.limitRelevantQuestions, getRelevantQuestionsRequest.limitRelevantQuestions) &&
        Objects.equals(this.bypassCache, getRelevantQuestionsRequest.bypassCache) &&
        Objects.equals(this.query, getRelevantQuestionsRequest.query) &&
        Objects.equals(this.aiContext, getRelevantQuestionsRequest.aiContext);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataContext, limitRelevantQuestions, bypassCache, query, aiContext);
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
    sb.append("class GetRelevantQuestionsRequest {\n");
    sb.append("    metadataContext: ").append(toIndentedString(metadataContext)).append("\n");
    sb.append("    limitRelevantQuestions: ").append(toIndentedString(limitRelevantQuestions)).append("\n");
    sb.append("    bypassCache: ").append(toIndentedString(bypassCache)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    aiContext: ").append(toIndentedString(aiContext)).append("\n");
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
    openapiFields.add("metadata_context");
    openapiFields.add("limit_relevant_questions");
    openapiFields.add("bypass_cache");
    openapiFields.add("query");
    openapiFields.add("ai_context");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("metadata_context");
    openapiRequiredFields.add("query");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetRelevantQuestionsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetRelevantQuestionsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRelevantQuestionsRequest is not found in the empty JSON string", GetRelevantQuestionsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetRelevantQuestionsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRelevantQuestionsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetRelevantQuestionsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `metadata_context`
      MetadataContext.validateJsonElement(jsonObj.get("metadata_context"));
      if (!jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      // validate the optional field `ai_context`
      if (jsonObj.get("ai_context") != null && !jsonObj.get("ai_context").isJsonNull()) {
        AIContext.validateJsonElement(jsonObj.get("ai_context"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRelevantQuestionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRelevantQuestionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRelevantQuestionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRelevantQuestionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRelevantQuestionsRequest>() {
           @Override
           public void write(JsonWriter out, GetRelevantQuestionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRelevantQuestionsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetRelevantQuestionsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetRelevantQuestionsRequest
   * @throws IOException if the JSON string is invalid with respect to GetRelevantQuestionsRequest
   */
  public static GetRelevantQuestionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRelevantQuestionsRequest.class);
  }

  /**
   * Convert an instance of GetRelevantQuestionsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

