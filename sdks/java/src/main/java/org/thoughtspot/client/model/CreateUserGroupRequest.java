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
import java.util.ArrayList;
import java.util.List;

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
 * CreateUserGroupRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T10:47:55.743445Z[Etc/UTC]")
public class CreateUserGroupRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DEFAULT_LIVEBOARD_IDENTIFIERS = "default_liveboard_identifiers";
  @SerializedName(SERIALIZED_NAME_DEFAULT_LIVEBOARD_IDENTIFIERS)
  private List<String> defaultLiveboardIdentifiers;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Gets or Sets privileges
   */
  @JsonAdapter(PrivilegesEnum.Adapter.class)
  public enum PrivilegesEnum {
    ADMINISTRATION("ADMINISTRATION"),
    
    AUTHORING("AUTHORING"),
    
    USERDATAUPLOADING("USERDATAUPLOADING"),
    
    DATADOWNLOADING("DATADOWNLOADING"),
    
    USERMANAGEMENT("USERMANAGEMENT"),
    
    DATAMANAGEMENT("DATAMANAGEMENT"),
    
    SHAREWITHALL("SHAREWITHALL"),
    
    JOBSCHEDULING("JOBSCHEDULING"),
    
    A3ANALYSIS("A3ANALYSIS"),
    
    EXPERIMENTALFEATUREPRIVILEGE("EXPERIMENTALFEATUREPRIVILEGE"),
    
    BYPASSRLS("BYPASSRLS"),
    
    RANALYSIS("RANALYSIS"),
    
    DEVELOPER("DEVELOPER"),
    
    USER_ADMINISTRATION("USER_ADMINISTRATION"),
    
    GROUP_ADMINISTRATION("GROUP_ADMINISTRATION"),
    
    SYNCMANAGEMENT("SYNCMANAGEMENT"),
    
    CAN_CREATE_CATALOG("CAN_CREATE_CATALOG"),
    
    DISABLE_PINBOARD_CREATION("DISABLE_PINBOARD_CREATION"),
    
    LIVEBOARD_VERIFIER("LIVEBOARD_VERIFIER"),
    
    PREVIEW_THOUGHTSPOT_SAGE("PREVIEW_THOUGHTSPOT_SAGE"),
    
    CAN_MANAGE_VERSION_CONTROL("CAN_MANAGE_VERSION_CONTROL"),
    
    THIRDPARTY_ANALYSIS("THIRDPARTY_ANALYSIS");

    private String value;

    PrivilegesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrivilegesEnum fromValue(String value) {
      for (PrivilegesEnum b : PrivilegesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PrivilegesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrivilegesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PrivilegesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PrivilegesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRIVILEGES = "privileges";
  @SerializedName(SERIALIZED_NAME_PRIVILEGES)
  private List<PrivilegesEnum> privileges;

  public static final String SERIALIZED_NAME_SUB_GROUP_IDENTIFIERS = "sub_group_identifiers";
  @SerializedName(SERIALIZED_NAME_SUB_GROUP_IDENTIFIERS)
  private List<String> subGroupIdentifiers;

  /**
   * Group type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    LOCAL_GROUP("LOCAL_GROUP"),
    
    LDAP_GROUP("LDAP_GROUP");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.LOCAL_GROUP;

  public static final String SERIALIZED_NAME_USER_IDENTIFIERS = "user_identifiers";
  @SerializedName(SERIALIZED_NAME_USER_IDENTIFIERS)
  private List<String> userIdentifiers;

  /**
   * Visibility of the group. To make a group visible to other users and groups, set the visibility to SHAREABLE.
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
  public enum VisibilityEnum {
    SHARABLE("SHARABLE"),
    
    NON_SHARABLE("NON_SHARABLE");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VisibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VisibilityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private VisibilityEnum visibility = VisibilityEnum.SHARABLE;

  public static final String SERIALIZED_NAME_ROLE_IDENTIFIERS = "role_identifiers";
  @SerializedName(SERIALIZED_NAME_ROLE_IDENTIFIERS)
  private List<String> roleIdentifiers;

  public CreateUserGroupRequest() {
  }

  public CreateUserGroupRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the group. The group name must be unique.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateUserGroupRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name for the group.
   * @return displayName
  **/
  @javax.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CreateUserGroupRequest defaultLiveboardIdentifiers(List<String> defaultLiveboardIdentifiers) {
    
    this.defaultLiveboardIdentifiers = defaultLiveboardIdentifiers;
    return this;
  }

  public CreateUserGroupRequest addDefaultLiveboardIdentifiersItem(String defaultLiveboardIdentifiersItem) {
    if (this.defaultLiveboardIdentifiers == null) {
      this.defaultLiveboardIdentifiers = new ArrayList<>();
    }
    this.defaultLiveboardIdentifiers.add(defaultLiveboardIdentifiersItem);
    return this;
  }

   /**
   * GUID of the Liveboards to assign as default Liveboards to the users in the group.
   * @return defaultLiveboardIdentifiers
  **/
  @javax.annotation.Nullable
  public List<String> getDefaultLiveboardIdentifiers() {
    return defaultLiveboardIdentifiers;
  }


  public void setDefaultLiveboardIdentifiers(List<String> defaultLiveboardIdentifiers) {
    this.defaultLiveboardIdentifiers = defaultLiveboardIdentifiers;
  }


  public CreateUserGroupRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the group
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateUserGroupRequest privileges(List<PrivilegesEnum> privileges) {
    
    this.privileges = privileges;
    return this;
  }

  public CreateUserGroupRequest addPrivilegesItem(PrivilegesEnum privilegesItem) {
    if (this.privileges == null) {
      this.privileges = new ArrayList<>();
    }
    this.privileges.add(privilegesItem);
    return this;
  }

   /**
   * Privileges to assign to the group
   * @return privileges
  **/
  @javax.annotation.Nullable
  public List<PrivilegesEnum> getPrivileges() {
    return privileges;
  }


  public void setPrivileges(List<PrivilegesEnum> privileges) {
    this.privileges = privileges;
  }


  public CreateUserGroupRequest subGroupIdentifiers(List<String> subGroupIdentifiers) {
    
    this.subGroupIdentifiers = subGroupIdentifiers;
    return this;
  }

  public CreateUserGroupRequest addSubGroupIdentifiersItem(String subGroupIdentifiersItem) {
    if (this.subGroupIdentifiers == null) {
      this.subGroupIdentifiers = new ArrayList<>();
    }
    this.subGroupIdentifiers.add(subGroupIdentifiersItem);
    return this;
  }

   /**
   * GUID or name of the sub groups. A subgroup is a group assigned to a parent group.
   * @return subGroupIdentifiers
  **/
  @javax.annotation.Nullable
  public List<String> getSubGroupIdentifiers() {
    return subGroupIdentifiers;
  }


  public void setSubGroupIdentifiers(List<String> subGroupIdentifiers) {
    this.subGroupIdentifiers = subGroupIdentifiers;
  }


  public CreateUserGroupRequest type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Group type.
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CreateUserGroupRequest userIdentifiers(List<String> userIdentifiers) {
    
    this.userIdentifiers = userIdentifiers;
    return this;
  }

  public CreateUserGroupRequest addUserIdentifiersItem(String userIdentifiersItem) {
    if (this.userIdentifiers == null) {
      this.userIdentifiers = new ArrayList<>();
    }
    this.userIdentifiers.add(userIdentifiersItem);
    return this;
  }

   /**
   * GUID or name of the users to assign to the group.
   * @return userIdentifiers
  **/
  @javax.annotation.Nullable
  public List<String> getUserIdentifiers() {
    return userIdentifiers;
  }


  public void setUserIdentifiers(List<String> userIdentifiers) {
    this.userIdentifiers = userIdentifiers;
  }


  public CreateUserGroupRequest visibility(VisibilityEnum visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Visibility of the group. To make a group visible to other users and groups, set the visibility to SHAREABLE.
   * @return visibility
  **/
  @javax.annotation.Nullable
  public VisibilityEnum getVisibility() {
    return visibility;
  }


  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }


  public CreateUserGroupRequest roleIdentifiers(List<String> roleIdentifiers) {
    
    this.roleIdentifiers = roleIdentifiers;
    return this;
  }

  public CreateUserGroupRequest addRoleIdentifiersItem(String roleIdentifiersItem) {
    if (this.roleIdentifiers == null) {
      this.roleIdentifiers = new ArrayList<>();
    }
    this.roleIdentifiers.add(roleIdentifiersItem);
    return this;
  }

   /**
   * Role identifiers of the roles that should be assigned to the group.
   * @return roleIdentifiers
  **/
  @javax.annotation.Nullable
  public List<String> getRoleIdentifiers() {
    return roleIdentifiers;
  }


  public void setRoleIdentifiers(List<String> roleIdentifiers) {
    this.roleIdentifiers = roleIdentifiers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserGroupRequest createUserGroupRequest = (CreateUserGroupRequest) o;
    return Objects.equals(this.name, createUserGroupRequest.name) &&
        Objects.equals(this.displayName, createUserGroupRequest.displayName) &&
        Objects.equals(this.defaultLiveboardIdentifiers, createUserGroupRequest.defaultLiveboardIdentifiers) &&
        Objects.equals(this.description, createUserGroupRequest.description) &&
        Objects.equals(this.privileges, createUserGroupRequest.privileges) &&
        Objects.equals(this.subGroupIdentifiers, createUserGroupRequest.subGroupIdentifiers) &&
        Objects.equals(this.type, createUserGroupRequest.type) &&
        Objects.equals(this.userIdentifiers, createUserGroupRequest.userIdentifiers) &&
        Objects.equals(this.visibility, createUserGroupRequest.visibility) &&
        Objects.equals(this.roleIdentifiers, createUserGroupRequest.roleIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, defaultLiveboardIdentifiers, description, privileges, subGroupIdentifiers, type, userIdentifiers, visibility, roleIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserGroupRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    defaultLiveboardIdentifiers: ").append(toIndentedString(defaultLiveboardIdentifiers)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
    sb.append("    subGroupIdentifiers: ").append(toIndentedString(subGroupIdentifiers)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userIdentifiers: ").append(toIndentedString(userIdentifiers)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    roleIdentifiers: ").append(toIndentedString(roleIdentifiers)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("display_name");
    openapiFields.add("default_liveboard_identifiers");
    openapiFields.add("description");
    openapiFields.add("privileges");
    openapiFields.add("sub_group_identifiers");
    openapiFields.add("type");
    openapiFields.add("user_identifiers");
    openapiFields.add("visibility");
    openapiFields.add("role_identifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("display_name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateUserGroupRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateUserGroupRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateUserGroupRequest is not found in the empty JSON string", CreateUserGroupRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateUserGroupRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateUserGroupRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateUserGroupRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("default_liveboard_identifiers") != null && !jsonObj.get("default_liveboard_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_liveboard_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("default_liveboard_identifiers").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("privileges") != null && !jsonObj.get("privileges").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `privileges` to be an array in the JSON string but got `%s`", jsonObj.get("privileges").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sub_group_identifiers") != null && !jsonObj.get("sub_group_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_group_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("sub_group_identifiers").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("user_identifiers") != null && !jsonObj.get("user_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("user_identifiers").toString()));
      }
      if ((jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) && !jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("role_identifiers") != null && !jsonObj.get("role_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("role_identifiers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateUserGroupRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateUserGroupRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateUserGroupRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateUserGroupRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateUserGroupRequest>() {
           @Override
           public void write(JsonWriter out, CreateUserGroupRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateUserGroupRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateUserGroupRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateUserGroupRequest
  * @throws IOException if the JSON string is invalid with respect to CreateUserGroupRequest
  */
  public static CreateUserGroupRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateUserGroupRequest.class);
  }

 /**
  * Convert an instance of CreateUserGroupRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

