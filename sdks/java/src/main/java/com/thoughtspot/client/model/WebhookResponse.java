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
import com.thoughtspot.client.model.WebhookAuthentication;
import com.thoughtspot.client.model.WebhookOrg;
import com.thoughtspot.client.model.WebhookSignatureVerification;
import com.thoughtspot.client.model.WebhookUser;
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
 * WebhookResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class WebhookResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_ORG = "org";
  @SerializedName(SERIALIZED_NAME_ORG)
  @javax.annotation.Nullable
  private WebhookOrg org;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nonnull
  private String url;

  public static final String SERIALIZED_NAME_URL_PARAMS = "url_params";
  @SerializedName(SERIALIZED_NAME_URL_PARAMS)
  @javax.annotation.Nullable
  private Object urlParams;

  /**
   * Gets or Sets events
   */
  @JsonAdapter(EventsEnum.Adapter.class)
  public enum EventsEnum {
    LIVEBOARD_SCHEDULE("LIVEBOARD_SCHEDULE");

    private String value;

    EventsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventsEnum fromValue(String value) {
      for (EventsEnum b : EventsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EventsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  @javax.annotation.Nonnull
  private List<EventsEnum> events;

  public static final String SERIALIZED_NAME_AUTHENTICATION = "authentication";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION)
  @javax.annotation.Nullable
  private WebhookAuthentication authentication;

  public static final String SERIALIZED_NAME_SIGNATURE_VERIFICATION = "signature_verification";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_VERIFICATION)
  @javax.annotation.Nullable
  private WebhookSignatureVerification signatureVerification;

  public static final String SERIALIZED_NAME_CREATION_TIME_IN_MILLIS = "creation_time_in_millis";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME_IN_MILLIS)
  @javax.annotation.Nonnull
  private Float creationTimeInMillis;

  public static final String SERIALIZED_NAME_MODIFICATION_TIME_IN_MILLIS = "modification_time_in_millis";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_TIME_IN_MILLIS)
  @javax.annotation.Nonnull
  private Float modificationTimeInMillis;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  @javax.annotation.Nullable
  private WebhookUser createdBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "last_modified_by";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  @javax.annotation.Nullable
  private WebhookUser lastModifiedBy;

  public WebhookResponse() {
  }

  public WebhookResponse id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the webhook configuration.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public WebhookResponse name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the webhook configuration.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public WebhookResponse description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the webhook configuration.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public WebhookResponse org(@javax.annotation.Nullable WebhookOrg org) {
    this.org = org;
    return this;
  }

  /**
   * Get org
   * @return org
   */
  @javax.annotation.Nullable
  public WebhookOrg getOrg() {
    return org;
  }

  public void setOrg(@javax.annotation.Nullable WebhookOrg org) {
    this.org = org;
  }


  public WebhookResponse url(@javax.annotation.Nonnull String url) {
    this.url = url;
    return this;
  }

  /**
   * The webhook endpoint URL.
   * @return url
   */
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nonnull String url) {
    this.url = url;
  }


  public WebhookResponse urlParams(@javax.annotation.Nullable Object urlParams) {
    this.urlParams = urlParams;
    return this;
  }

  /**
   * Additional URL parameters as key-value pairs.
   * @return urlParams
   */
  @javax.annotation.Nullable
  public Object getUrlParams() {
    return urlParams;
  }

  public void setUrlParams(@javax.annotation.Nullable Object urlParams) {
    this.urlParams = urlParams;
  }


  public WebhookResponse events(@javax.annotation.Nonnull List<EventsEnum> events) {
    this.events = events;
    return this;
  }

  public WebhookResponse addEventsItem(EventsEnum eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * List of events this webhook subscribes to.
   * @return events
   */
  @javax.annotation.Nonnull
  public List<EventsEnum> getEvents() {
    return events;
  }

  public void setEvents(@javax.annotation.Nonnull List<EventsEnum> events) {
    this.events = events;
  }


  public WebhookResponse authentication(@javax.annotation.Nullable WebhookAuthentication authentication) {
    this.authentication = authentication;
    return this;
  }

  /**
   * Get authentication
   * @return authentication
   */
  @javax.annotation.Nullable
  public WebhookAuthentication getAuthentication() {
    return authentication;
  }

  public void setAuthentication(@javax.annotation.Nullable WebhookAuthentication authentication) {
    this.authentication = authentication;
  }


  public WebhookResponse signatureVerification(@javax.annotation.Nullable WebhookSignatureVerification signatureVerification) {
    this.signatureVerification = signatureVerification;
    return this;
  }

  /**
   * Get signatureVerification
   * @return signatureVerification
   */
  @javax.annotation.Nullable
  public WebhookSignatureVerification getSignatureVerification() {
    return signatureVerification;
  }

  public void setSignatureVerification(@javax.annotation.Nullable WebhookSignatureVerification signatureVerification) {
    this.signatureVerification = signatureVerification;
  }


  public WebhookResponse creationTimeInMillis(@javax.annotation.Nonnull Float creationTimeInMillis) {
    this.creationTimeInMillis = creationTimeInMillis;
    return this;
  }

  /**
   * Creation time of the webhook configuration in milliseconds.
   * @return creationTimeInMillis
   */
  @javax.annotation.Nonnull
  public Float getCreationTimeInMillis() {
    return creationTimeInMillis;
  }

  public void setCreationTimeInMillis(@javax.annotation.Nonnull Float creationTimeInMillis) {
    this.creationTimeInMillis = creationTimeInMillis;
  }


  public WebhookResponse modificationTimeInMillis(@javax.annotation.Nonnull Float modificationTimeInMillis) {
    this.modificationTimeInMillis = modificationTimeInMillis;
    return this;
  }

  /**
   * Last modified time of the webhook configuration in milliseconds.
   * @return modificationTimeInMillis
   */
  @javax.annotation.Nonnull
  public Float getModificationTimeInMillis() {
    return modificationTimeInMillis;
  }

  public void setModificationTimeInMillis(@javax.annotation.Nonnull Float modificationTimeInMillis) {
    this.modificationTimeInMillis = modificationTimeInMillis;
  }


  public WebhookResponse createdBy(@javax.annotation.Nullable WebhookUser createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   */
  @javax.annotation.Nullable
  public WebhookUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(@javax.annotation.Nullable WebhookUser createdBy) {
    this.createdBy = createdBy;
  }


  public WebhookResponse lastModifiedBy(@javax.annotation.Nullable WebhookUser lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * Get lastModifiedBy
   * @return lastModifiedBy
   */
  @javax.annotation.Nullable
  public WebhookUser getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(@javax.annotation.Nullable WebhookUser lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookResponse webhookResponse = (WebhookResponse) o;
    return Objects.equals(this.id, webhookResponse.id) &&
        Objects.equals(this.name, webhookResponse.name) &&
        Objects.equals(this.description, webhookResponse.description) &&
        Objects.equals(this.org, webhookResponse.org) &&
        Objects.equals(this.url, webhookResponse.url) &&
        Objects.equals(this.urlParams, webhookResponse.urlParams) &&
        Objects.equals(this.events, webhookResponse.events) &&
        Objects.equals(this.authentication, webhookResponse.authentication) &&
        Objects.equals(this.signatureVerification, webhookResponse.signatureVerification) &&
        Objects.equals(this.creationTimeInMillis, webhookResponse.creationTimeInMillis) &&
        Objects.equals(this.modificationTimeInMillis, webhookResponse.modificationTimeInMillis) &&
        Objects.equals(this.createdBy, webhookResponse.createdBy) &&
        Objects.equals(this.lastModifiedBy, webhookResponse.lastModifiedBy);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, org, url, urlParams, events, authentication, signatureVerification, creationTimeInMillis, modificationTimeInMillis, createdBy, lastModifiedBy);
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
    sb.append("class WebhookResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlParams: ").append(toIndentedString(urlParams)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    signatureVerification: ").append(toIndentedString(signatureVerification)).append("\n");
    sb.append("    creationTimeInMillis: ").append(toIndentedString(creationTimeInMillis)).append("\n");
    sb.append("    modificationTimeInMillis: ").append(toIndentedString(modificationTimeInMillis)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("org");
    openapiFields.add("url");
    openapiFields.add("url_params");
    openapiFields.add("events");
    openapiFields.add("authentication");
    openapiFields.add("signature_verification");
    openapiFields.add("creation_time_in_millis");
    openapiFields.add("modification_time_in_millis");
    openapiFields.add("created_by");
    openapiFields.add("last_modified_by");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("events");
    openapiRequiredFields.add("creation_time_in_millis");
    openapiRequiredFields.add("modification_time_in_millis");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WebhookResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebhookResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookResponse is not found in the empty JSON string", WebhookResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebhookResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `org`
      if (jsonObj.get("org") != null && !jsonObj.get("org").isJsonNull()) {
        WebhookOrg.validateJsonElement(jsonObj.get("org"));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("events") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
      }
      // validate the optional field `authentication`
      if (jsonObj.get("authentication") != null && !jsonObj.get("authentication").isJsonNull()) {
        WebhookAuthentication.validateJsonElement(jsonObj.get("authentication"));
      }
      // validate the optional field `signature_verification`
      if (jsonObj.get("signature_verification") != null && !jsonObj.get("signature_verification").isJsonNull()) {
        WebhookSignatureVerification.validateJsonElement(jsonObj.get("signature_verification"));
      }
      // validate the optional field `created_by`
      if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) {
        WebhookUser.validateJsonElement(jsonObj.get("created_by"));
      }
      // validate the optional field `last_modified_by`
      if (jsonObj.get("last_modified_by") != null && !jsonObj.get("last_modified_by").isJsonNull()) {
        WebhookUser.validateJsonElement(jsonObj.get("last_modified_by"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookResponse>() {
           @Override
           public void write(JsonWriter out, WebhookResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WebhookResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WebhookResponse
   * @throws IOException if the JSON string is invalid with respect to WebhookResponse
   */
  public static WebhookResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookResponse.class);
  }

  /**
   * Convert an instance of WebhookResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

