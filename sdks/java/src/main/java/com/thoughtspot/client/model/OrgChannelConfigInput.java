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
import com.thoughtspot.client.model.EventChannelConfigInput;
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
 * OrgChannelConfigInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class OrgChannelConfigInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ORG_IDENTIFIER = "org_identifier";
  @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIER)
  @javax.annotation.Nonnull
  private String orgIdentifier;

  /**
   * Operation to perform. REPLACE: Update preferences (default). RESET: Remove org-specific configurations, causing fallback to cluster-level preferences.
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    REPLACE("REPLACE"),
    
    RESET("RESET");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperationEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OperationEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  @javax.annotation.Nullable
  private OperationEnum operation = OperationEnum.REPLACE;

  public static final String SERIALIZED_NAME_PREFERENCES = "preferences";
  @SerializedName(SERIALIZED_NAME_PREFERENCES)
  @javax.annotation.Nullable
  private List<EventChannelConfigInput> preferences;

  /**
   * Gets or Sets resetEvents
   */
  @JsonAdapter(ResetEventsEnum.Adapter.class)
  public enum ResetEventsEnum {
    LIVEBOARD_SCHEDULE("LIVEBOARD_SCHEDULE");

    private String value;

    ResetEventsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResetEventsEnum fromValue(String value) {
      for (ResetEventsEnum b : ResetEventsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResetEventsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResetEventsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResetEventsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResetEventsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ResetEventsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_RESET_EVENTS = "reset_events";
  @SerializedName(SERIALIZED_NAME_RESET_EVENTS)
  @javax.annotation.Nullable
  private List<ResetEventsEnum> resetEvents;

  public OrgChannelConfigInput() {
  }

  public OrgChannelConfigInput orgIdentifier(@javax.annotation.Nonnull String orgIdentifier) {
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


  public OrgChannelConfigInput operation(@javax.annotation.Nullable OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Operation to perform. REPLACE: Update preferences (default). RESET: Remove org-specific configurations, causing fallback to cluster-level preferences.
   * @return operation
   */
  @javax.annotation.Nullable
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(@javax.annotation.Nullable OperationEnum operation) {
    this.operation = operation;
  }


  public OrgChannelConfigInput preferences(@javax.annotation.Nullable List<EventChannelConfigInput> preferences) {
    this.preferences = preferences;
    return this;
  }

  public OrgChannelConfigInput addPreferencesItem(EventChannelConfigInput preferencesItem) {
    if (this.preferences == null) {
      this.preferences = new ArrayList<>();
    }
    this.preferences.add(preferencesItem);
    return this;
  }

  /**
   * Event-specific configurations. Required for REPLACE operation.
   * @return preferences
   */
  @javax.annotation.Nullable
  public List<EventChannelConfigInput> getPreferences() {
    return preferences;
  }

  public void setPreferences(@javax.annotation.Nullable List<EventChannelConfigInput> preferences) {
    this.preferences = preferences;
  }


  public OrgChannelConfigInput resetEvents(@javax.annotation.Nullable List<ResetEventsEnum> resetEvents) {
    this.resetEvents = resetEvents;
    return this;
  }

  public OrgChannelConfigInput addResetEventsItem(ResetEventsEnum resetEventsItem) {
    if (this.resetEvents == null) {
      this.resetEvents = new ArrayList<>();
    }
    this.resetEvents.add(resetEventsItem);
    return this;
  }

  /**
   * Event types to reset. Required for RESET operation. Org-specific configurations for these events will be removed, causing fallback to cluster-level preferences.
   * @return resetEvents
   */
  @javax.annotation.Nullable
  public List<ResetEventsEnum> getResetEvents() {
    return resetEvents;
  }

  public void setResetEvents(@javax.annotation.Nullable List<ResetEventsEnum> resetEvents) {
    this.resetEvents = resetEvents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgChannelConfigInput orgChannelConfigInput = (OrgChannelConfigInput) o;
    return Objects.equals(this.orgIdentifier, orgChannelConfigInput.orgIdentifier) &&
        Objects.equals(this.operation, orgChannelConfigInput.operation) &&
        Objects.equals(this.preferences, orgChannelConfigInput.preferences) &&
        Objects.equals(this.resetEvents, orgChannelConfigInput.resetEvents);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgIdentifier, operation, preferences, resetEvents);
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
    sb.append("class OrgChannelConfigInput {\n");
    sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    resetEvents: ").append(toIndentedString(resetEvents)).append("\n");
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
    openapiFields.add("operation");
    openapiFields.add("preferences");
    openapiFields.add("reset_events");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("org_identifier");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrgChannelConfigInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrgChannelConfigInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrgChannelConfigInput is not found in the empty JSON string", OrgChannelConfigInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrgChannelConfigInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrgChannelConfigInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrgChannelConfigInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("org_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_identifier").toString()));
      }
      if ((jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) && !jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      // validate the optional field `operation`
      if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) {
        OperationEnum.validateJsonElement(jsonObj.get("operation"));
      }
      if (jsonObj.get("preferences") != null && !jsonObj.get("preferences").isJsonNull()) {
        JsonArray jsonArraypreferences = jsonObj.getAsJsonArray("preferences");
        if (jsonArraypreferences != null) {
          // ensure the json data is an array
          if (!jsonObj.get("preferences").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `preferences` to be an array in the JSON string but got `%s`", jsonObj.get("preferences").toString()));
          }

          // validate the optional field `preferences` (array)
          for (int i = 0; i < jsonArraypreferences.size(); i++) {
            EventChannelConfigInput.validateJsonElement(jsonArraypreferences.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("reset_events") != null && !jsonObj.get("reset_events").isJsonNull() && !jsonObj.get("reset_events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `reset_events` to be an array in the JSON string but got `%s`", jsonObj.get("reset_events").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrgChannelConfigInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrgChannelConfigInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrgChannelConfigInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrgChannelConfigInput.class));

       return (TypeAdapter<T>) new TypeAdapter<OrgChannelConfigInput>() {
           @Override
           public void write(JsonWriter out, OrgChannelConfigInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrgChannelConfigInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrgChannelConfigInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrgChannelConfigInput
   * @throws IOException if the JSON string is invalid with respect to OrgChannelConfigInput
   */
  public static OrgChannelConfigInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrgChannelConfigInput.class);
  }

  /**
   * Convert an instance of OrgChannelConfigInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

