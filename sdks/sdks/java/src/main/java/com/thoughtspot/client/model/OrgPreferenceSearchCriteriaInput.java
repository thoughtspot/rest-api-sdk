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
 * OrgPreferenceSearchCriteriaInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class OrgPreferenceSearchCriteriaInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ORG_IDENTIFIER = "org_identifier";
  @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIER)
  @javax.annotation.Nonnull
  private String orgIdentifier;

  /**
   * Gets or Sets eventTypes
   */
  @JsonAdapter(EventTypesEnum.Adapter.class)
  public enum EventTypesEnum {
    LIVEBOARD_SCHEDULE("LIVEBOARD_SCHEDULE");

    private String value;

    EventTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventTypesEnum fromValue(String value) {
      for (EventTypesEnum b : EventTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventTypesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EventTypesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EVENT_TYPES = "event_types";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  @javax.annotation.Nullable
  private List<EventTypesEnum> eventTypes;

  public OrgPreferenceSearchCriteriaInput() {
  }

  public OrgPreferenceSearchCriteriaInput orgIdentifier(@javax.annotation.Nonnull String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
    return this;
  }

  /**
   * Unique identifier or name of the org
   * @return orgIdentifier
   */
  @javax.annotation.Nonnull
  public String getOrgIdentifier() {
    return orgIdentifier;
  }

  public void setOrgIdentifier(@javax.annotation.Nonnull String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
  }


  public OrgPreferenceSearchCriteriaInput eventTypes(@javax.annotation.Nullable List<EventTypesEnum> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public OrgPreferenceSearchCriteriaInput addEventTypesItem(EventTypesEnum eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

  /**
   * Event types to search for. If not provided, all event types for this org are returned.
   * @return eventTypes
   */
  @javax.annotation.Nullable
  public List<EventTypesEnum> getEventTypes() {
    return eventTypes;
  }

  public void setEventTypes(@javax.annotation.Nullable List<EventTypesEnum> eventTypes) {
    this.eventTypes = eventTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgPreferenceSearchCriteriaInput orgPreferenceSearchCriteriaInput = (OrgPreferenceSearchCriteriaInput) o;
    return Objects.equals(this.orgIdentifier, orgPreferenceSearchCriteriaInput.orgIdentifier) &&
        Objects.equals(this.eventTypes, orgPreferenceSearchCriteriaInput.eventTypes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgIdentifier, eventTypes);
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
    sb.append("class OrgPreferenceSearchCriteriaInput {\n");
    sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
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
    openapiFields.add("org_identifier");
    openapiFields.add("event_types");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("org_identifier");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrgPreferenceSearchCriteriaInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrgPreferenceSearchCriteriaInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrgPreferenceSearchCriteriaInput is not found in the empty JSON string", OrgPreferenceSearchCriteriaInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrgPreferenceSearchCriteriaInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrgPreferenceSearchCriteriaInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrgPreferenceSearchCriteriaInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("org_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_identifier").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("event_types") != null && !jsonObj.get("event_types").isJsonNull() && !jsonObj.get("event_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_types` to be an array in the JSON string but got `%s`", jsonObj.get("event_types").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrgPreferenceSearchCriteriaInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrgPreferenceSearchCriteriaInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrgPreferenceSearchCriteriaInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrgPreferenceSearchCriteriaInput.class));

       return (TypeAdapter<T>) new TypeAdapter<OrgPreferenceSearchCriteriaInput>() {
           @Override
           public void write(JsonWriter out, OrgPreferenceSearchCriteriaInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrgPreferenceSearchCriteriaInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrgPreferenceSearchCriteriaInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrgPreferenceSearchCriteriaInput
   * @throws IOException if the JSON string is invalid with respect to OrgPreferenceSearchCriteriaInput
   */
  public static OrgPreferenceSearchCriteriaInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrgPreferenceSearchCriteriaInput.class);
  }

  /**
   * Convert an instance of OrgPreferenceSearchCriteriaInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

