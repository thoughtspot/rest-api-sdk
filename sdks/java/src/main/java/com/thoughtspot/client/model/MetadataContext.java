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
 * MetadataContext
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class MetadataContext implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA_SOURCE_IDENTIFIERS = "data_source_identifiers";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> dataSourceIdentifiers;

  public static final String SERIALIZED_NAME_ANSWER_IDENTIFIERS = "answer_identifiers";
  @SerializedName(SERIALIZED_NAME_ANSWER_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> answerIdentifiers;

  public static final String SERIALIZED_NAME_CONVERSATION_IDENTIFIER = "conversation_identifier";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_IDENTIFIER)
  @javax.annotation.Nullable
  private String conversationIdentifier;

  public static final String SERIALIZED_NAME_LIVEBOARD_IDENTIFIERS = "liveboard_identifiers";
  @SerializedName(SERIALIZED_NAME_LIVEBOARD_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> liveboardIdentifiers;

  public MetadataContext() {
  }

  public MetadataContext dataSourceIdentifiers(@javax.annotation.Nullable List<String> dataSourceIdentifiers) {
    this.dataSourceIdentifiers = dataSourceIdentifiers;
    return this;
  }

  public MetadataContext addDataSourceIdentifiersItem(String dataSourceIdentifiersItem) {
    if (this.dataSourceIdentifiers == null) {
      this.dataSourceIdentifiers = new ArrayList<>();
    }
    this.dataSourceIdentifiers.add(dataSourceIdentifiersItem);
    return this;
  }

  /**
   * List of data_source_identifiers to provide context for breaking down user query into analytical queries that can be run on them.
   * @return dataSourceIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getDataSourceIdentifiers() {
    return dataSourceIdentifiers;
  }

  public void setDataSourceIdentifiers(@javax.annotation.Nullable List<String> dataSourceIdentifiers) {
    this.dataSourceIdentifiers = dataSourceIdentifiers;
  }


  public MetadataContext answerIdentifiers(@javax.annotation.Nullable List<String> answerIdentifiers) {
    this.answerIdentifiers = answerIdentifiers;
    return this;
  }

  public MetadataContext addAnswerIdentifiersItem(String answerIdentifiersItem) {
    if (this.answerIdentifiers == null) {
      this.answerIdentifiers = new ArrayList<>();
    }
    this.answerIdentifiers.add(answerIdentifiersItem);
    return this;
  }

  /**
   * List of answer unique identifiers (GUIDs) whose data will be used to guide the response.
   * @return answerIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getAnswerIdentifiers() {
    return answerIdentifiers;
  }

  public void setAnswerIdentifiers(@javax.annotation.Nullable List<String> answerIdentifiers) {
    this.answerIdentifiers = answerIdentifiers;
  }


  public MetadataContext conversationIdentifier(@javax.annotation.Nullable String conversationIdentifier) {
    this.conversationIdentifier = conversationIdentifier;
    return this;
  }

  /**
   * Unique identifier to denote current conversation.
   * @return conversationIdentifier
   */
  @javax.annotation.Nullable
  public String getConversationIdentifier() {
    return conversationIdentifier;
  }

  public void setConversationIdentifier(@javax.annotation.Nullable String conversationIdentifier) {
    this.conversationIdentifier = conversationIdentifier;
  }


  public MetadataContext liveboardIdentifiers(@javax.annotation.Nullable List<String> liveboardIdentifiers) {
    this.liveboardIdentifiers = liveboardIdentifiers;
    return this;
  }

  public MetadataContext addLiveboardIdentifiersItem(String liveboardIdentifiersItem) {
    if (this.liveboardIdentifiers == null) {
      this.liveboardIdentifiers = new ArrayList<>();
    }
    this.liveboardIdentifiers.add(liveboardIdentifiersItem);
    return this;
  }

  /**
   * List of liveboard unique identifiers (GUIDs) whose data will be used to guide the response.
   * @return liveboardIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getLiveboardIdentifiers() {
    return liveboardIdentifiers;
  }

  public void setLiveboardIdentifiers(@javax.annotation.Nullable List<String> liveboardIdentifiers) {
    this.liveboardIdentifiers = liveboardIdentifiers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataContext metadataContext = (MetadataContext) o;
    return Objects.equals(this.dataSourceIdentifiers, metadataContext.dataSourceIdentifiers) &&
        Objects.equals(this.answerIdentifiers, metadataContext.answerIdentifiers) &&
        Objects.equals(this.conversationIdentifier, metadataContext.conversationIdentifier) &&
        Objects.equals(this.liveboardIdentifiers, metadataContext.liveboardIdentifiers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSourceIdentifiers, answerIdentifiers, conversationIdentifier, liveboardIdentifiers);
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
    sb.append("class MetadataContext {\n");
    sb.append("    dataSourceIdentifiers: ").append(toIndentedString(dataSourceIdentifiers)).append("\n");
    sb.append("    answerIdentifiers: ").append(toIndentedString(answerIdentifiers)).append("\n");
    sb.append("    conversationIdentifier: ").append(toIndentedString(conversationIdentifier)).append("\n");
    sb.append("    liveboardIdentifiers: ").append(toIndentedString(liveboardIdentifiers)).append("\n");
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
    openapiFields.add("data_source_identifiers");
    openapiFields.add("answer_identifiers");
    openapiFields.add("conversation_identifier");
    openapiFields.add("liveboard_identifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MetadataContext
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MetadataContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetadataContext is not found in the empty JSON string", MetadataContext.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MetadataContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MetadataContext` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("data_source_identifiers") != null && !jsonObj.get("data_source_identifiers").isJsonNull() && !jsonObj.get("data_source_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_source_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("data_source_identifiers").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("answer_identifiers") != null && !jsonObj.get("answer_identifiers").isJsonNull() && !jsonObj.get("answer_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `answer_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("answer_identifiers").toString()));
      }
      if ((jsonObj.get("conversation_identifier") != null && !jsonObj.get("conversation_identifier").isJsonNull()) && !jsonObj.get("conversation_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conversation_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conversation_identifier").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("liveboard_identifiers") != null && !jsonObj.get("liveboard_identifiers").isJsonNull() && !jsonObj.get("liveboard_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `liveboard_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("liveboard_identifiers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetadataContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetadataContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetadataContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetadataContext.class));

       return (TypeAdapter<T>) new TypeAdapter<MetadataContext>() {
           @Override
           public void write(JsonWriter out, MetadataContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MetadataContext read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MetadataContext given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MetadataContext
   * @throws IOException if the JSON string is invalid with respect to MetadataContext
   */
  public static MetadataContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetadataContext.class);
  }

  /**
   * Convert an instance of MetadataContext to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

