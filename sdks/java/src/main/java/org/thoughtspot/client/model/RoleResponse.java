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
import org.openapitools.jackson.nullable.JsonNullable;
import org.thoughtspot.client.model.GenericInfo;

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
 * RoleResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-12T09:37:12.899082-08:00[America/Los_Angeles]")
public class RoleResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GROUPS_ASSIGNED_COUNT = "groups_assigned_count";
  @SerializedName(SERIALIZED_NAME_GROUPS_ASSIGNED_COUNT)
  private Integer groupsAssignedCount;

  public static final String SERIALIZED_NAME_ORGS = "orgs";
  @SerializedName(SERIALIZED_NAME_ORGS)
  private List<GenericInfo> orgs;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<GenericInfo> groups;

  /**
   * Gets or Sets privileges
   */
  @JsonAdapter(PrivilegesEnum.Adapter.class)
  public enum PrivilegesEnum {
    USERDATAUPLOADING("USERDATAUPLOADING"),
    
    DATADOWNLOADING("DATADOWNLOADING"),
    
    DATAMANAGEMENT("DATAMANAGEMENT"),
    
    SHAREWITHALL("SHAREWITHALL"),
    
    JOBSCHEDULING("JOBSCHEDULING"),
    
    A3ANALYSIS("A3ANALYSIS"),
    
    EXPERIMENTALFEATUREPRIVILEGE("EXPERIMENTALFEATUREPRIVILEGE"),
    
    BYPASSRLS("BYPASSRLS"),
    
    DISABLE_PINBOARD_CREATION("DISABLE_PINBOARD_CREATION"),
    
    DEVELOPER("DEVELOPER"),
    
    APPLICATION_ADMINISTRATION("APPLICATION_ADMINISTRATION"),
    
    USER_ADMINISTRATION("USER_ADMINISTRATION"),
    
    GROUP_ADMINISTRATION("GROUP_ADMINISTRATION"),
    
    SYSTEM_INFO_ADMINISTRATION("SYSTEM_INFO_ADMINISTRATION"),
    
    SYNCMANAGEMENT("SYNCMANAGEMENT"),
    
    ORG_ADMINISTRATION("ORG_ADMINISTRATION"),
    
    ROLE_ADMINISTRATION("ROLE_ADMINISTRATION"),
    
    AUTHENTICATION_ADMINISTRATION("AUTHENTICATION_ADMINISTRATION"),
    
    BILLING_INFO_ADMINISTRATION("BILLING_INFO_ADMINISTRATION"),
    
    CONTROL_TRUSTED_AUTH("CONTROL_TRUSTED_AUTH"),
    
    TAGMANAGEMENT("TAGMANAGEMENT"),
    
    LIVEBOARD_VERIFIER("LIVEBOARD_VERIFIER"),
    
    CAN_MANAGE_CUSTOM_CALENDAR("CAN_MANAGE_CUSTOM_CALENDAR"),
    
    CAN_CREATE_OR_EDIT_CONNECTIONS("CAN_CREATE_OR_EDIT_CONNECTIONS"),
    
    CAN_MANAGE_WORKSHEET_VIEWS_TABLES("CAN_MANAGE_WORKSHEET_VIEWS_TABLES"),
    
    CAN_MANAGE_VERSION_CONTROL("CAN_MANAGE_VERSION_CONTROL"),
    
    THIRDPARTY_ANALYSIS("THIRDPARTY_ANALYSIS"),
    
    CAN_CREATE_CATALOG("CAN_CREATE_CATALOG"),
    
    ALLOW_NON_EMBED_FULL_APP_ACCESS("ALLOW_NON_EMBED_FULL_APP_ACCESS"),
    
    CAN_ACCESS_ANALYST_STUDIO("CAN_ACCESS_ANALYST_STUDIO"),
    
    CAN_MANAGE_ANALYST_STUDIO("CAN_MANAGE_ANALYST_STUDIO"),
    
    PREVIEW_DOCUMENT_SEARCH("PREVIEW_DOCUMENT_SEARCH");

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
  private List<PrivilegesEnum> privileges = new ArrayList<>();

  /**
   * Permission details of the Role
   */
  @JsonAdapter(PermissionEnum.Adapter.class)
  public enum PermissionEnum {
    READ_ONLY("READ_ONLY"),
    
    MODIFY("MODIFY"),
    
    NO_ACCESS("NO_ACCESS");

    private String value;

    PermissionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionEnum fromValue(String value) {
      for (PermissionEnum b : PermissionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PermissionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PermissionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PERMISSION = "permission";
  @SerializedName(SERIALIZED_NAME_PERMISSION)
  private PermissionEnum permission;

  public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private String authorId;

  public static final String SERIALIZED_NAME_MODIFIER_ID = "modifier_id";
  @SerializedName(SERIALIZED_NAME_MODIFIER_ID)
  private String modifierId;

  public static final String SERIALIZED_NAME_CREATION_TIME_IN_MILLIS = "creation_time_in_millis";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME_IN_MILLIS)
  private Object creationTimeInMillis;

  public static final String SERIALIZED_NAME_MODIFICATION_TIME_IN_MILLIS = "modification_time_in_millis";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_TIME_IN_MILLIS)
  private Object modificationTimeInMillis;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_DEPRECATED = "deprecated";
  @SerializedName(SERIALIZED_NAME_DEPRECATED)
  private Boolean deprecated;

  public static final String SERIALIZED_NAME_EXTERNAL = "external";
  @SerializedName(SERIALIZED_NAME_EXTERNAL)
  private Boolean external;

  public static final String SERIALIZED_NAME_HIDDEN = "hidden";
  @SerializedName(SERIALIZED_NAME_HIDDEN)
  private Boolean hidden;

  public static final String SERIALIZED_NAME_SHARED_VIA_CONNECTION = "shared_via_connection";
  @SerializedName(SERIALIZED_NAME_SHARED_VIA_CONNECTION)
  private Boolean sharedViaConnection;

  public RoleResponse() {
  }

  public RoleResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique Id of the role.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RoleResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the role
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RoleResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the role
   * @return description
  **/
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RoleResponse groupsAssignedCount(Integer groupsAssignedCount) {
    
    this.groupsAssignedCount = groupsAssignedCount;
    return this;
  }

   /**
   * number of groups assigned with this role
   * @return groupsAssignedCount
  **/
  @javax.annotation.Nullable
  public Integer getGroupsAssignedCount() {
    return groupsAssignedCount;
  }


  public void setGroupsAssignedCount(Integer groupsAssignedCount) {
    this.groupsAssignedCount = groupsAssignedCount;
  }


  public RoleResponse orgs(List<GenericInfo> orgs) {
    
    this.orgs = orgs;
    return this;
  }

  public RoleResponse addOrgsItem(GenericInfo orgsItem) {
    if (this.orgs == null) {
      this.orgs = new ArrayList<>();
    }
    this.orgs.add(orgsItem);
    return this;
  }

   /**
   * Orgs in which role exists.
   * @return orgs
  **/
  @javax.annotation.Nullable
  public List<GenericInfo> getOrgs() {
    return orgs;
  }


  public void setOrgs(List<GenericInfo> orgs) {
    this.orgs = orgs;
  }


  public RoleResponse groups(List<GenericInfo> groups) {
    
    this.groups = groups;
    return this;
  }

  public RoleResponse addGroupsItem(GenericInfo groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Details of groups assigned with this role
   * @return groups
  **/
  @javax.annotation.Nullable
  public List<GenericInfo> getGroups() {
    return groups;
  }


  public void setGroups(List<GenericInfo> groups) {
    this.groups = groups;
  }


  public RoleResponse privileges(List<PrivilegesEnum> privileges) {
    
    this.privileges = privileges;
    return this;
  }

  public RoleResponse addPrivilegesItem(PrivilegesEnum privilegesItem) {
    if (this.privileges == null) {
      this.privileges = new ArrayList<>();
    }
    this.privileges.add(privilegesItem);
    return this;
  }

   /**
   * Privileges granted to the role.
   * @return privileges
  **/
  @javax.annotation.Nonnull
  public List<PrivilegesEnum> getPrivileges() {
    return privileges;
  }


  public void setPrivileges(List<PrivilegesEnum> privileges) {
    this.privileges = privileges;
  }


  public RoleResponse permission(PermissionEnum permission) {
    
    this.permission = permission;
    return this;
  }

   /**
   * Permission details of the Role
   * @return permission
  **/
  @javax.annotation.Nullable
  public PermissionEnum getPermission() {
    return permission;
  }


  public void setPermission(PermissionEnum permission) {
    this.permission = permission;
  }


  public RoleResponse authorId(String authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * Unique identifier of author of the role.
   * @return authorId
  **/
  @javax.annotation.Nullable
  public String getAuthorId() {
    return authorId;
  }


  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }


  public RoleResponse modifierId(String modifierId) {
    
    this.modifierId = modifierId;
    return this;
  }

   /**
   * Unique identifier of modifier of the role.
   * @return modifierId
  **/
  @javax.annotation.Nullable
  public String getModifierId() {
    return modifierId;
  }


  public void setModifierId(String modifierId) {
    this.modifierId = modifierId;
  }


  public RoleResponse creationTimeInMillis(Object creationTimeInMillis) {
    
    this.creationTimeInMillis = creationTimeInMillis;
    return this;
  }

   /**
   * Creation time of the role in milliseconds.
   * @return creationTimeInMillis
  **/
  @javax.annotation.Nullable
  public Object getCreationTimeInMillis() {
    return creationTimeInMillis;
  }


  public void setCreationTimeInMillis(Object creationTimeInMillis) {
    this.creationTimeInMillis = creationTimeInMillis;
  }


  public RoleResponse modificationTimeInMillis(Object modificationTimeInMillis) {
    
    this.modificationTimeInMillis = modificationTimeInMillis;
    return this;
  }

   /**
   * Last modified time of the role in milliseconds.
   * @return modificationTimeInMillis
  **/
  @javax.annotation.Nullable
  public Object getModificationTimeInMillis() {
    return modificationTimeInMillis;
  }


  public void setModificationTimeInMillis(Object modificationTimeInMillis) {
    this.modificationTimeInMillis = modificationTimeInMillis;
  }


  public RoleResponse deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Indicates whether the role is deleted.
   * @return deleted
  **/
  @javax.annotation.Nullable
  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public RoleResponse deprecated(Boolean deprecated) {
    
    this.deprecated = deprecated;
    return this;
  }

   /**
   * Indicates whether the role is deprecated.
   * @return deprecated
  **/
  @javax.annotation.Nullable
  public Boolean getDeprecated() {
    return deprecated;
  }


  public void setDeprecated(Boolean deprecated) {
    this.deprecated = deprecated;
  }


  public RoleResponse external(Boolean external) {
    
    this.external = external;
    return this;
  }

   /**
   * Indicates whether the role is external.
   * @return external
  **/
  @javax.annotation.Nullable
  public Boolean getExternal() {
    return external;
  }


  public void setExternal(Boolean external) {
    this.external = external;
  }


  public RoleResponse hidden(Boolean hidden) {
    
    this.hidden = hidden;
    return this;
  }

   /**
   * Indicates whether the role is hidden.
   * @return hidden
  **/
  @javax.annotation.Nullable
  public Boolean getHidden() {
    return hidden;
  }


  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }


  public RoleResponse sharedViaConnection(Boolean sharedViaConnection) {
    
    this.sharedViaConnection = sharedViaConnection;
    return this;
  }

   /**
   * Indicates whether the role is shared via connection
   * @return sharedViaConnection
  **/
  @javax.annotation.Nullable
  public Boolean getSharedViaConnection() {
    return sharedViaConnection;
  }


  public void setSharedViaConnection(Boolean sharedViaConnection) {
    this.sharedViaConnection = sharedViaConnection;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleResponse roleResponse = (RoleResponse) o;
    return Objects.equals(this.id, roleResponse.id) &&
        Objects.equals(this.name, roleResponse.name) &&
        Objects.equals(this.description, roleResponse.description) &&
        Objects.equals(this.groupsAssignedCount, roleResponse.groupsAssignedCount) &&
        Objects.equals(this.orgs, roleResponse.orgs) &&
        Objects.equals(this.groups, roleResponse.groups) &&
        Objects.equals(this.privileges, roleResponse.privileges) &&
        Objects.equals(this.permission, roleResponse.permission) &&
        Objects.equals(this.authorId, roleResponse.authorId) &&
        Objects.equals(this.modifierId, roleResponse.modifierId) &&
        Objects.equals(this.creationTimeInMillis, roleResponse.creationTimeInMillis) &&
        Objects.equals(this.modificationTimeInMillis, roleResponse.modificationTimeInMillis) &&
        Objects.equals(this.deleted, roleResponse.deleted) &&
        Objects.equals(this.deprecated, roleResponse.deprecated) &&
        Objects.equals(this.external, roleResponse.external) &&
        Objects.equals(this.hidden, roleResponse.hidden) &&
        Objects.equals(this.sharedViaConnection, roleResponse.sharedViaConnection);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, groupsAssignedCount, orgs, groups, privileges, permission, authorId, modifierId, creationTimeInMillis, modificationTimeInMillis, deleted, deprecated, external, hidden, sharedViaConnection);
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
    sb.append("class RoleResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupsAssignedCount: ").append(toIndentedString(groupsAssignedCount)).append("\n");
    sb.append("    orgs: ").append(toIndentedString(orgs)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
    sb.append("    creationTimeInMillis: ").append(toIndentedString(creationTimeInMillis)).append("\n");
    sb.append("    modificationTimeInMillis: ").append(toIndentedString(modificationTimeInMillis)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    sharedViaConnection: ").append(toIndentedString(sharedViaConnection)).append("\n");
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
    openapiFields.add("groups_assigned_count");
    openapiFields.add("orgs");
    openapiFields.add("groups");
    openapiFields.add("privileges");
    openapiFields.add("permission");
    openapiFields.add("author_id");
    openapiFields.add("modifier_id");
    openapiFields.add("creation_time_in_millis");
    openapiFields.add("modification_time_in_millis");
    openapiFields.add("deleted");
    openapiFields.add("deprecated");
    openapiFields.add("external");
    openapiFields.add("hidden");
    openapiFields.add("shared_via_connection");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("privileges");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RoleResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RoleResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RoleResponse is not found in the empty JSON string", RoleResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RoleResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RoleResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RoleResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("orgs") != null && !jsonObj.get("orgs").isJsonNull()) {
        JsonArray jsonArrayorgs = jsonObj.getAsJsonArray("orgs");
        if (jsonArrayorgs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("orgs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `orgs` to be an array in the JSON string but got `%s`", jsonObj.get("orgs").toString()));
          }

          // validate the optional field `orgs` (array)
          for (int i = 0; i < jsonArrayorgs.size(); i++) {
            GenericInfo.validateJsonObject(jsonArrayorgs.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
        JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
        if (jsonArraygroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
          }

          // validate the optional field `groups` (array)
          for (int i = 0; i < jsonArraygroups.size(); i++) {
            GenericInfo.validateJsonObject(jsonArraygroups.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("privileges") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("privileges").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `privileges` to be an array in the JSON string but got `%s`", jsonObj.get("privileges").toString()));
      }
      if ((jsonObj.get("permission") != null && !jsonObj.get("permission").isJsonNull()) && !jsonObj.get("permission").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permission` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permission").toString()));
      }
      if ((jsonObj.get("author_id") != null && !jsonObj.get("author_id").isJsonNull()) && !jsonObj.get("author_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author_id").toString()));
      }
      if ((jsonObj.get("modifier_id") != null && !jsonObj.get("modifier_id").isJsonNull()) && !jsonObj.get("modifier_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifier_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifier_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RoleResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RoleResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RoleResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RoleResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<RoleResponse>() {
           @Override
           public void write(JsonWriter out, RoleResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RoleResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RoleResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RoleResponse
  * @throws IOException if the JSON string is invalid with respect to RoleResponse
  */
  public static RoleResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RoleResponse.class);
  }

 /**
  * Convert an instance of RoleResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

