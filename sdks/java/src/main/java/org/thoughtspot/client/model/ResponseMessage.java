/*
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.thoughtspot.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.thoughtspot.client.JSON;

/**
 * ResponseMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T09:43:29.263117728Z[Etc/UTC]")
public class ResponseMessage {
  public static final String SERIALIZED_NAME_SESSION_IDENTIFIER = "session_identifier";
  @SerializedName(SERIALIZED_NAME_SESSION_IDENTIFIER)
  private String sessionIdentifier;

  public static final String SERIALIZED_NAME_GENERATION_NUMBER = "generation_number";
  @SerializedName(SERIALIZED_NAME_GENERATION_NUMBER)
  private Integer generationNumber;

  /**
   * Type of the generated response.
   */
  @JsonAdapter(MessageTypeEnum.Adapter.class)
  public enum MessageTypeEnum {
    TSANSWER("TSAnswer");

    private String value;

    MessageTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MessageTypeEnum fromValue(String value) {
      for (MessageTypeEnum b : MessageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MessageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MessageTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MessageTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MessageTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MESSAGE_TYPE = "message_type";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TYPE)
  private MessageTypeEnum messageType;

  /**
   * Generated visualization type.
   */
  @JsonAdapter(VisualizationTypeEnum.Adapter.class)
  public enum VisualizationTypeEnum {
    CHART("Chart"),
    
    TABLE("Table"),
    
    UNDEFINED("Undefined");

    private String value;

    VisualizationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisualizationTypeEnum fromValue(String value) {
      for (VisualizationTypeEnum b : VisualizationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VisualizationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisualizationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisualizationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VisualizationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VISUALIZATION_TYPE = "visualization_type";
  @SerializedName(SERIALIZED_NAME_VISUALIZATION_TYPE)
  private VisualizationTypeEnum visualizationType;

  public static final String SERIALIZED_NAME_TOKENS = "tokens";
  @SerializedName(SERIALIZED_NAME_TOKENS)
  private String tokens;

  public ResponseMessage() {
  }

  public ResponseMessage sessionIdentifier(String sessionIdentifier) {
    
    this.sessionIdentifier = sessionIdentifier;
    return this;
  }

   /**
   * Unique identifier of the generated response.
   * @return sessionIdentifier
  **/
  @javax.annotation.Nullable
  public String getSessionIdentifier() {
    return sessionIdentifier;
  }


  public void setSessionIdentifier(String sessionIdentifier) {
    this.sessionIdentifier = sessionIdentifier;
  }


  public ResponseMessage generationNumber(Integer generationNumber) {
    
    this.generationNumber = generationNumber;
    return this;
  }

   /**
   * Generate number of the response.
   * @return generationNumber
  **/
  @javax.annotation.Nullable
  public Integer getGenerationNumber() {
    return generationNumber;
  }


  public void setGenerationNumber(Integer generationNumber) {
    this.generationNumber = generationNumber;
  }


  public ResponseMessage messageType(MessageTypeEnum messageType) {
    
    this.messageType = messageType;
    return this;
  }

   /**
   * Type of the generated response.
   * @return messageType
  **/
  @javax.annotation.Nonnull
  public MessageTypeEnum getMessageType() {
    return messageType;
  }


  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }


  public ResponseMessage visualizationType(VisualizationTypeEnum visualizationType) {
    
    this.visualizationType = visualizationType;
    return this;
  }

   /**
   * Generated visualization type.
   * @return visualizationType
  **/
  @javax.annotation.Nullable
  public VisualizationTypeEnum getVisualizationType() {
    return visualizationType;
  }


  public void setVisualizationType(VisualizationTypeEnum visualizationType) {
    this.visualizationType = visualizationType;
  }


  public ResponseMessage tokens(String tokens) {
    
    this.tokens = tokens;
    return this;
  }

   /**
   * Tokens for the response.
   * @return tokens
  **/
  @javax.annotation.Nullable
  public String getTokens() {
    return tokens;
  }


  public void setTokens(String tokens) {
    this.tokens = tokens;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseMessage responseMessage = (ResponseMessage) o;
    return Objects.equals(this.sessionIdentifier, responseMessage.sessionIdentifier) &&
        Objects.equals(this.generationNumber, responseMessage.generationNumber) &&
        Objects.equals(this.messageType, responseMessage.messageType) &&
        Objects.equals(this.visualizationType, responseMessage.visualizationType) &&
        Objects.equals(this.tokens, responseMessage.tokens);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionIdentifier, generationNumber, messageType, visualizationType, tokens);
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
    sb.append("class ResponseMessage {\n");
    sb.append("    sessionIdentifier: ").append(toIndentedString(sessionIdentifier)).append("\n");
    sb.append("    generationNumber: ").append(toIndentedString(generationNumber)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    visualizationType: ").append(toIndentedString(visualizationType)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
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
    openapiFields.add("session_identifier");
    openapiFields.add("generation_number");
    openapiFields.add("message_type");
    openapiFields.add("visualization_type");
    openapiFields.add("tokens");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("message_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResponseMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResponseMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResponseMessage is not found in the empty JSON string", ResponseMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResponseMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResponseMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResponseMessage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("session_identifier") != null && !jsonObj.get("session_identifier").isJsonNull()) && !jsonObj.get("session_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session_identifier").toString()));
      }
      if (!jsonObj.get("message_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message_type").toString()));
      }
      if ((jsonObj.get("visualization_type") != null && !jsonObj.get("visualization_type").isJsonNull()) && !jsonObj.get("visualization_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visualization_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visualization_type").toString()));
      }
      if ((jsonObj.get("tokens") != null && !jsonObj.get("tokens").isJsonNull()) && !jsonObj.get("tokens").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokens` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokens").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResponseMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseMessage>() {
           @Override
           public void write(JsonWriter out, ResponseMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseMessage
  * @throws IOException if the JSON string is invalid with respect to ResponseMessage
  */
  public static ResponseMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseMessage.class);
  }

 /**
  * Convert an instance of ResponseMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

