/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package org.thoughtspot.client.model;

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
import org.thoughtspot.client.model.ExcludeMetadataListItemInput;
import org.thoughtspot.client.model.FavoriteObjectOptionsInput;
import org.thoughtspot.client.model.MetadataListItemInput;
import org.thoughtspot.client.model.MetadataSearchSortOptions;
import org.thoughtspot.client.model.PermissionInput;
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

import org.thoughtspot.client.JSON;

/**
 * SearchMetadataRequest
 */

public class SearchMetadataRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @javax.annotation.Nullable
  private List<MetadataListItemInput> metadata;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  @javax.annotation.Nullable
  private List<PermissionInput> permissions;

  public static final String SERIALIZED_NAME_CREATED_BY_USER_IDENTIFIERS = "created_by_user_identifiers";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_USER_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> createdByUserIdentifiers;

  /**
   * Version of the dependent table of the metadata objects like Worksheets.
   */
  @JsonAdapter(DependentObjectVersionEnum.Adapter.class)
  public enum DependentObjectVersionEnum {
    V1("V1"),
    
    V2("V2");

    private String value;

    DependentObjectVersionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DependentObjectVersionEnum fromValue(String value) {
      for (DependentObjectVersionEnum b : DependentObjectVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DependentObjectVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DependentObjectVersionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DependentObjectVersionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DependentObjectVersionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DependentObjectVersionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DEPENDENT_OBJECT_VERSION = "dependent_object_version";
  @SerializedName(SERIALIZED_NAME_DEPENDENT_OBJECT_VERSION)
  @javax.annotation.Nullable
  private DependentObjectVersionEnum dependentObjectVersion = DependentObjectVersionEnum.V1;

  public static final String SERIALIZED_NAME_EXCLUDE_OBJECTS = "exclude_objects";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_OBJECTS)
  @javax.annotation.Nullable
  private List<ExcludeMetadataListItemInput> excludeObjects;

  public static final String SERIALIZED_NAME_FAVORITE_OBJECT_OPTIONS = "favorite_object_options";
  @SerializedName(SERIALIZED_NAME_FAVORITE_OBJECT_OPTIONS)
  @javax.annotation.Nullable
  private FavoriteObjectOptionsInput favoriteObjectOptions;

  public static final String SERIALIZED_NAME_INCLUDE_AUTO_CREATED_OBJECTS = "include_auto_created_objects";
  @SerializedName(SERIALIZED_NAME_INCLUDE_AUTO_CREATED_OBJECTS)
  @javax.annotation.Nullable
  private Boolean includeAutoCreatedObjects = false;

  public static final String SERIALIZED_NAME_INCLUDE_DEPENDENT_OBJECTS = "include_dependent_objects";
  @SerializedName(SERIALIZED_NAME_INCLUDE_DEPENDENT_OBJECTS)
  @javax.annotation.Nullable
  private Boolean includeDependentObjects = false;

  public static final String SERIALIZED_NAME_DEPENDENT_OBJECTS_RECORD_SIZE = "dependent_objects_record_size";
  @SerializedName(SERIALIZED_NAME_DEPENDENT_OBJECTS_RECORD_SIZE)
  @javax.annotation.Nullable
  private Integer dependentObjectsRecordSize = 50;

  public static final String SERIALIZED_NAME_INCLUDE_DETAILS = "include_details";
  @SerializedName(SERIALIZED_NAME_INCLUDE_DETAILS)
  @javax.annotation.Nullable
  private Boolean includeDetails = false;

  public static final String SERIALIZED_NAME_INCLUDE_HEADERS = "include_headers";
  @SerializedName(SERIALIZED_NAME_INCLUDE_HEADERS)
  @javax.annotation.Nullable
  private Boolean includeHeaders = true;

  public static final String SERIALIZED_NAME_INCLUDE_HIDDEN_OBJECTS = "include_hidden_objects";
  @SerializedName(SERIALIZED_NAME_INCLUDE_HIDDEN_OBJECTS)
  @javax.annotation.Nullable
  private Boolean includeHiddenObjects = false;

  public static final String SERIALIZED_NAME_INCLUDE_INCOMPLETE_OBJECTS = "include_incomplete_objects";
  @SerializedName(SERIALIZED_NAME_INCLUDE_INCOMPLETE_OBJECTS)
  @javax.annotation.Nullable
  private Boolean includeIncompleteObjects = false;

  public static final String SERIALIZED_NAME_INCLUDE_VISUALIZATION_HEADERS = "include_visualization_headers";
  @SerializedName(SERIALIZED_NAME_INCLUDE_VISUALIZATION_HEADERS)
  @javax.annotation.Nullable
  private Boolean includeVisualizationHeaders = false;

  public static final String SERIALIZED_NAME_INCLUDE_WORKSHEET_SEARCH_ASSIST_DATA = "include_worksheet_search_assist_data";
  @SerializedName(SERIALIZED_NAME_INCLUDE_WORKSHEET_SEARCH_ASSIST_DATA)
  @javax.annotation.Nullable
  private Boolean includeWorksheetSearchAssistData;

  public static final String SERIALIZED_NAME_MODIFIED_BY_USER_IDENTIFIERS = "modified_by_user_identifiers";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_USER_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> modifiedByUserIdentifiers;

  public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";
  @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
  @javax.annotation.Nullable
  private Integer recordOffset = 0;

  public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";
  @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
  @javax.annotation.Nullable
  private Integer recordSize = 10;

  public static final String SERIALIZED_NAME_SORT_OPTIONS = "sort_options";
  @SerializedName(SERIALIZED_NAME_SORT_OPTIONS)
  @javax.annotation.Nullable
  private MetadataSearchSortOptions sortOptions;

  public static final String SERIALIZED_NAME_TAG_IDENTIFIERS = "tag_identifiers";
  @SerializedName(SERIALIZED_NAME_TAG_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> tagIdentifiers;

  public static final String SERIALIZED_NAME_INCLUDE_STATS = "include_stats";
  @SerializedName(SERIALIZED_NAME_INCLUDE_STATS)
  @javax.annotation.Nullable
  private Boolean includeStats = false;

  public static final String SERIALIZED_NAME_INCLUDE_DISCOVERABLE_OBJECTS = "include_discoverable_objects";
  @SerializedName(SERIALIZED_NAME_INCLUDE_DISCOVERABLE_OBJECTS)
  @javax.annotation.Nullable
  private Boolean includeDiscoverableObjects = true;

  public SearchMetadataRequest() {
  }

  public SearchMetadataRequest metadata(@javax.annotation.Nullable List<MetadataListItemInput> metadata) {
    this.metadata = metadata;
    return this;
  }

  public SearchMetadataRequest addMetadataItem(MetadataListItemInput metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * Metadata objects such as Liveboards, Answers, and Worksheets.
   * @return metadata
   */
  @javax.annotation.Nullable
  public List<MetadataListItemInput> getMetadata() {
    return metadata;
  }

  public void setMetadata(@javax.annotation.Nullable List<MetadataListItemInput> metadata) {
    this.metadata = metadata;
  }


  public SearchMetadataRequest permissions(@javax.annotation.Nullable List<PermissionInput> permissions) {
    this.permissions = permissions;
    return this;
  }

  public SearchMetadataRequest addPermissionsItem(PermissionInput permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Object permission details to search by.
   * @return permissions
   */
  @javax.annotation.Nullable
  public List<PermissionInput> getPermissions() {
    return permissions;
  }

  public void setPermissions(@javax.annotation.Nullable List<PermissionInput> permissions) {
    this.permissions = permissions;
  }


  public SearchMetadataRequest createdByUserIdentifiers(@javax.annotation.Nullable List<String> createdByUserIdentifiers) {
    this.createdByUserIdentifiers = createdByUserIdentifiers;
    return this;
  }

  public SearchMetadataRequest addCreatedByUserIdentifiersItem(String createdByUserIdentifiersItem) {
    if (this.createdByUserIdentifiers == null) {
      this.createdByUserIdentifiers = new ArrayList<>();
    }
    this.createdByUserIdentifiers.add(createdByUserIdentifiersItem);
    return this;
  }

  /**
   * GUID or name of user who created the metadata object.
   * @return createdByUserIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getCreatedByUserIdentifiers() {
    return createdByUserIdentifiers;
  }

  public void setCreatedByUserIdentifiers(@javax.annotation.Nullable List<String> createdByUserIdentifiers) {
    this.createdByUserIdentifiers = createdByUserIdentifiers;
  }


  public SearchMetadataRequest dependentObjectVersion(@javax.annotation.Nullable DependentObjectVersionEnum dependentObjectVersion) {
    this.dependentObjectVersion = dependentObjectVersion;
    return this;
  }

  /**
   * Version of the dependent table of the metadata objects like Worksheets.
   * @return dependentObjectVersion
   */
  @javax.annotation.Nullable
  public DependentObjectVersionEnum getDependentObjectVersion() {
    return dependentObjectVersion;
  }

  public void setDependentObjectVersion(@javax.annotation.Nullable DependentObjectVersionEnum dependentObjectVersion) {
    this.dependentObjectVersion = dependentObjectVersion;
  }


  public SearchMetadataRequest excludeObjects(@javax.annotation.Nullable List<ExcludeMetadataListItemInput> excludeObjects) {
    this.excludeObjects = excludeObjects;
    return this;
  }

  public SearchMetadataRequest addExcludeObjectsItem(ExcludeMetadataListItemInput excludeObjectsItem) {
    if (this.excludeObjects == null) {
      this.excludeObjects = new ArrayList<>();
    }
    this.excludeObjects.add(excludeObjectsItem);
    return this;
  }

  /**
   * List of metadata objects to exclude from search.
   * @return excludeObjects
   */
  @javax.annotation.Nullable
  public List<ExcludeMetadataListItemInput> getExcludeObjects() {
    return excludeObjects;
  }

  public void setExcludeObjects(@javax.annotation.Nullable List<ExcludeMetadataListItemInput> excludeObjects) {
    this.excludeObjects = excludeObjects;
  }


  public SearchMetadataRequest favoriteObjectOptions(@javax.annotation.Nullable FavoriteObjectOptionsInput favoriteObjectOptions) {
    this.favoriteObjectOptions = favoriteObjectOptions;
    return this;
  }

  /**
   * Options to sort the API response by objects set as favorites for the logged-in user or the users specified in the API request.
   * @return favoriteObjectOptions
   */
  @javax.annotation.Nullable
  public FavoriteObjectOptionsInput getFavoriteObjectOptions() {
    return favoriteObjectOptions;
  }

  public void setFavoriteObjectOptions(@javax.annotation.Nullable FavoriteObjectOptionsInput favoriteObjectOptions) {
    this.favoriteObjectOptions = favoriteObjectOptions;
  }


  public SearchMetadataRequest includeAutoCreatedObjects(@javax.annotation.Nullable Boolean includeAutoCreatedObjects) {
    this.includeAutoCreatedObjects = includeAutoCreatedObjects;
    return this;
  }

  /**
   * Includes system-generated metadata objects.
   * @return includeAutoCreatedObjects
   */
  @javax.annotation.Nullable
  public Boolean getIncludeAutoCreatedObjects() {
    return includeAutoCreatedObjects;
  }

  public void setIncludeAutoCreatedObjects(@javax.annotation.Nullable Boolean includeAutoCreatedObjects) {
    this.includeAutoCreatedObjects = includeAutoCreatedObjects;
  }


  public SearchMetadataRequest includeDependentObjects(@javax.annotation.Nullable Boolean includeDependentObjects) {
    this.includeDependentObjects = includeDependentObjects;
    return this;
  }

  /**
   * Includes dependents of the metadata object specified in the API request. For example, a worksheet can consist of dependent objects such as Liveboards or Answers.
   * @return includeDependentObjects
   */
  @javax.annotation.Nullable
  public Boolean getIncludeDependentObjects() {
    return includeDependentObjects;
  }

  public void setIncludeDependentObjects(@javax.annotation.Nullable Boolean includeDependentObjects) {
    this.includeDependentObjects = includeDependentObjects;
  }


  public SearchMetadataRequest dependentObjectsRecordSize(@javax.annotation.Nullable Integer dependentObjectsRecordSize) {
    this.dependentObjectsRecordSize = dependentObjectsRecordSize;
    return this;
  }

  /**
   * The maximum number of dependents to include per metadata object.
   * @return dependentObjectsRecordSize
   */
  @javax.annotation.Nullable
  public Integer getDependentObjectsRecordSize() {
    return dependentObjectsRecordSize;
  }

  public void setDependentObjectsRecordSize(@javax.annotation.Nullable Integer dependentObjectsRecordSize) {
    this.dependentObjectsRecordSize = dependentObjectsRecordSize;
  }


  public SearchMetadataRequest includeDetails(@javax.annotation.Nullable Boolean includeDetails) {
    this.includeDetails = includeDetails;
    return this;
  }

  /**
   * Includes complete details of the metadata objects.
   * @return includeDetails
   */
  @javax.annotation.Nullable
  public Boolean getIncludeDetails() {
    return includeDetails;
  }

  public void setIncludeDetails(@javax.annotation.Nullable Boolean includeDetails) {
    this.includeDetails = includeDetails;
  }


  public SearchMetadataRequest includeHeaders(@javax.annotation.Nullable Boolean includeHeaders) {
    this.includeHeaders = includeHeaders;
    return this;
  }

  /**
   * Includes headers of the metadata objects.
   * @return includeHeaders
   */
  @javax.annotation.Nullable
  public Boolean getIncludeHeaders() {
    return includeHeaders;
  }

  public void setIncludeHeaders(@javax.annotation.Nullable Boolean includeHeaders) {
    this.includeHeaders = includeHeaders;
  }


  public SearchMetadataRequest includeHiddenObjects(@javax.annotation.Nullable Boolean includeHiddenObjects) {
    this.includeHiddenObjects = includeHiddenObjects;
    return this;
  }

  /**
   * Includes details of the hidden objects, such as a column in a worksheet or a table.
   * @return includeHiddenObjects
   */
  @javax.annotation.Nullable
  public Boolean getIncludeHiddenObjects() {
    return includeHiddenObjects;
  }

  public void setIncludeHiddenObjects(@javax.annotation.Nullable Boolean includeHiddenObjects) {
    this.includeHiddenObjects = includeHiddenObjects;
  }


  public SearchMetadataRequest includeIncompleteObjects(@javax.annotation.Nullable Boolean includeIncompleteObjects) {
    this.includeIncompleteObjects = includeIncompleteObjects;
    return this;
  }

  /**
   * Includes objects with incomplete metadata.
   * @return includeIncompleteObjects
   */
  @javax.annotation.Nullable
  public Boolean getIncludeIncompleteObjects() {
    return includeIncompleteObjects;
  }

  public void setIncludeIncompleteObjects(@javax.annotation.Nullable Boolean includeIncompleteObjects) {
    this.includeIncompleteObjects = includeIncompleteObjects;
  }


  public SearchMetadataRequest includeVisualizationHeaders(@javax.annotation.Nullable Boolean includeVisualizationHeaders) {
    this.includeVisualizationHeaders = includeVisualizationHeaders;
    return this;
  }

  /**
   * Includes visualization headers of the specified Liveboard object.
   * @return includeVisualizationHeaders
   */
  @javax.annotation.Nullable
  public Boolean getIncludeVisualizationHeaders() {
    return includeVisualizationHeaders;
  }

  public void setIncludeVisualizationHeaders(@javax.annotation.Nullable Boolean includeVisualizationHeaders) {
    this.includeVisualizationHeaders = includeVisualizationHeaders;
  }


  public SearchMetadataRequest includeWorksheetSearchAssistData(@javax.annotation.Nullable Boolean includeWorksheetSearchAssistData) {
    this.includeWorksheetSearchAssistData = includeWorksheetSearchAssistData;
    return this;
  }

  /**
   * If search assistance lessons are configured on a worksheet, the API returns the search assist data for Worksheet objects.
   * @return includeWorksheetSearchAssistData
   */
  @javax.annotation.Nullable
  public Boolean getIncludeWorksheetSearchAssistData() {
    return includeWorksheetSearchAssistData;
  }

  public void setIncludeWorksheetSearchAssistData(@javax.annotation.Nullable Boolean includeWorksheetSearchAssistData) {
    this.includeWorksheetSearchAssistData = includeWorksheetSearchAssistData;
  }


  public SearchMetadataRequest modifiedByUserIdentifiers(@javax.annotation.Nullable List<String> modifiedByUserIdentifiers) {
    this.modifiedByUserIdentifiers = modifiedByUserIdentifiers;
    return this;
  }

  public SearchMetadataRequest addModifiedByUserIdentifiersItem(String modifiedByUserIdentifiersItem) {
    if (this.modifiedByUserIdentifiers == null) {
      this.modifiedByUserIdentifiers = new ArrayList<>();
    }
    this.modifiedByUserIdentifiers.add(modifiedByUserIdentifiersItem);
    return this;
  }

  /**
   * Includes ID or names of the users who modified the metadata object.
   * @return modifiedByUserIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getModifiedByUserIdentifiers() {
    return modifiedByUserIdentifiers;
  }

  public void setModifiedByUserIdentifiers(@javax.annotation.Nullable List<String> modifiedByUserIdentifiers) {
    this.modifiedByUserIdentifiers = modifiedByUserIdentifiers;
  }


  public SearchMetadataRequest recordOffset(@javax.annotation.Nullable Integer recordOffset) {
    this.recordOffset = recordOffset;
    return this;
  }

  /**
   * The starting record number from where the records should be included.
   * @return recordOffset
   */
  @javax.annotation.Nullable
  public Integer getRecordOffset() {
    return recordOffset;
  }

  public void setRecordOffset(@javax.annotation.Nullable Integer recordOffset) {
    this.recordOffset = recordOffset;
  }


  public SearchMetadataRequest recordSize(@javax.annotation.Nullable Integer recordSize) {
    this.recordSize = recordSize;
    return this;
  }

  /**
   * The number of records that should be included. It is recommended to use a smaller &#x60;record_size&#x60; when fetching dependent objects or any of the additional metadata detail options.
   * @return recordSize
   */
  @javax.annotation.Nullable
  public Integer getRecordSize() {
    return recordSize;
  }

  public void setRecordSize(@javax.annotation.Nullable Integer recordSize) {
    this.recordSize = recordSize;
  }


  public SearchMetadataRequest sortOptions(@javax.annotation.Nullable MetadataSearchSortOptions sortOptions) {
    this.sortOptions = sortOptions;
    return this;
  }

  /**
   * Sort options to filter metadata details.
   * @return sortOptions
   */
  @javax.annotation.Nullable
  public MetadataSearchSortOptions getSortOptions() {
    return sortOptions;
  }

  public void setSortOptions(@javax.annotation.Nullable MetadataSearchSortOptions sortOptions) {
    this.sortOptions = sortOptions;
  }


  public SearchMetadataRequest tagIdentifiers(@javax.annotation.Nullable List<String> tagIdentifiers) {
    this.tagIdentifiers = tagIdentifiers;
    return this;
  }

  public SearchMetadataRequest addTagIdentifiersItem(String tagIdentifiersItem) {
    if (this.tagIdentifiers == null) {
      this.tagIdentifiers = new ArrayList<>();
    }
    this.tagIdentifiers.add(tagIdentifiersItem);
    return this;
  }

  /**
   * Tags to filter metadata objects by
   * @return tagIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getTagIdentifiers() {
    return tagIdentifiers;
  }

  public void setTagIdentifiers(@javax.annotation.Nullable List<String> tagIdentifiers) {
    this.tagIdentifiers = tagIdentifiers;
  }


  public SearchMetadataRequest includeStats(@javax.annotation.Nullable Boolean includeStats) {
    this.includeStats = includeStats;
    return this;
  }

  /**
   * Indicates whether to include stats of the metadata objects.
   * @return includeStats
   */
  @javax.annotation.Nullable
  public Boolean getIncludeStats() {
    return includeStats;
  }

  public void setIncludeStats(@javax.annotation.Nullable Boolean includeStats) {
    this.includeStats = includeStats;
  }


  public SearchMetadataRequest includeDiscoverableObjects(@javax.annotation.Nullable Boolean includeDiscoverableObjects) {
    this.includeDiscoverableObjects = includeDiscoverableObjects;
    return this;
  }

  /**
   * Indicates whether to include discoverable metadata objects. If lenient OSM is not enabled, then even though the includeDiscoverableObjects is set to True, we won&#39;t see discoverable objects.
   * @return includeDiscoverableObjects
   */
  @javax.annotation.Nullable
  public Boolean getIncludeDiscoverableObjects() {
    return includeDiscoverableObjects;
  }

  public void setIncludeDiscoverableObjects(@javax.annotation.Nullable Boolean includeDiscoverableObjects) {
    this.includeDiscoverableObjects = includeDiscoverableObjects;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchMetadataRequest searchMetadataRequest = (SearchMetadataRequest) o;
    return Objects.equals(this.metadata, searchMetadataRequest.metadata) &&
        Objects.equals(this.permissions, searchMetadataRequest.permissions) &&
        Objects.equals(this.createdByUserIdentifiers, searchMetadataRequest.createdByUserIdentifiers) &&
        Objects.equals(this.dependentObjectVersion, searchMetadataRequest.dependentObjectVersion) &&
        Objects.equals(this.excludeObjects, searchMetadataRequest.excludeObjects) &&
        Objects.equals(this.favoriteObjectOptions, searchMetadataRequest.favoriteObjectOptions) &&
        Objects.equals(this.includeAutoCreatedObjects, searchMetadataRequest.includeAutoCreatedObjects) &&
        Objects.equals(this.includeDependentObjects, searchMetadataRequest.includeDependentObjects) &&
        Objects.equals(this.dependentObjectsRecordSize, searchMetadataRequest.dependentObjectsRecordSize) &&
        Objects.equals(this.includeDetails, searchMetadataRequest.includeDetails) &&
        Objects.equals(this.includeHeaders, searchMetadataRequest.includeHeaders) &&
        Objects.equals(this.includeHiddenObjects, searchMetadataRequest.includeHiddenObjects) &&
        Objects.equals(this.includeIncompleteObjects, searchMetadataRequest.includeIncompleteObjects) &&
        Objects.equals(this.includeVisualizationHeaders, searchMetadataRequest.includeVisualizationHeaders) &&
        Objects.equals(this.includeWorksheetSearchAssistData, searchMetadataRequest.includeWorksheetSearchAssistData) &&
        Objects.equals(this.modifiedByUserIdentifiers, searchMetadataRequest.modifiedByUserIdentifiers) &&
        Objects.equals(this.recordOffset, searchMetadataRequest.recordOffset) &&
        Objects.equals(this.recordSize, searchMetadataRequest.recordSize) &&
        Objects.equals(this.sortOptions, searchMetadataRequest.sortOptions) &&
        Objects.equals(this.tagIdentifiers, searchMetadataRequest.tagIdentifiers) &&
        Objects.equals(this.includeStats, searchMetadataRequest.includeStats) &&
        Objects.equals(this.includeDiscoverableObjects, searchMetadataRequest.includeDiscoverableObjects);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, permissions, createdByUserIdentifiers, dependentObjectVersion, excludeObjects, favoriteObjectOptions, includeAutoCreatedObjects, includeDependentObjects, dependentObjectsRecordSize, includeDetails, includeHeaders, includeHiddenObjects, includeIncompleteObjects, includeVisualizationHeaders, includeWorksheetSearchAssistData, modifiedByUserIdentifiers, recordOffset, recordSize, sortOptions, tagIdentifiers, includeStats, includeDiscoverableObjects);
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
    sb.append("class SearchMetadataRequest {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    createdByUserIdentifiers: ").append(toIndentedString(createdByUserIdentifiers)).append("\n");
    sb.append("    dependentObjectVersion: ").append(toIndentedString(dependentObjectVersion)).append("\n");
    sb.append("    excludeObjects: ").append(toIndentedString(excludeObjects)).append("\n");
    sb.append("    favoriteObjectOptions: ").append(toIndentedString(favoriteObjectOptions)).append("\n");
    sb.append("    includeAutoCreatedObjects: ").append(toIndentedString(includeAutoCreatedObjects)).append("\n");
    sb.append("    includeDependentObjects: ").append(toIndentedString(includeDependentObjects)).append("\n");
    sb.append("    dependentObjectsRecordSize: ").append(toIndentedString(dependentObjectsRecordSize)).append("\n");
    sb.append("    includeDetails: ").append(toIndentedString(includeDetails)).append("\n");
    sb.append("    includeHeaders: ").append(toIndentedString(includeHeaders)).append("\n");
    sb.append("    includeHiddenObjects: ").append(toIndentedString(includeHiddenObjects)).append("\n");
    sb.append("    includeIncompleteObjects: ").append(toIndentedString(includeIncompleteObjects)).append("\n");
    sb.append("    includeVisualizationHeaders: ").append(toIndentedString(includeVisualizationHeaders)).append("\n");
    sb.append("    includeWorksheetSearchAssistData: ").append(toIndentedString(includeWorksheetSearchAssistData)).append("\n");
    sb.append("    modifiedByUserIdentifiers: ").append(toIndentedString(modifiedByUserIdentifiers)).append("\n");
    sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
    sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
    sb.append("    sortOptions: ").append(toIndentedString(sortOptions)).append("\n");
    sb.append("    tagIdentifiers: ").append(toIndentedString(tagIdentifiers)).append("\n");
    sb.append("    includeStats: ").append(toIndentedString(includeStats)).append("\n");
    sb.append("    includeDiscoverableObjects: ").append(toIndentedString(includeDiscoverableObjects)).append("\n");
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
    openapiFields.add("metadata");
    openapiFields.add("permissions");
    openapiFields.add("created_by_user_identifiers");
    openapiFields.add("dependent_object_version");
    openapiFields.add("exclude_objects");
    openapiFields.add("favorite_object_options");
    openapiFields.add("include_auto_created_objects");
    openapiFields.add("include_dependent_objects");
    openapiFields.add("dependent_objects_record_size");
    openapiFields.add("include_details");
    openapiFields.add("include_headers");
    openapiFields.add("include_hidden_objects");
    openapiFields.add("include_incomplete_objects");
    openapiFields.add("include_visualization_headers");
    openapiFields.add("include_worksheet_search_assist_data");
    openapiFields.add("modified_by_user_identifiers");
    openapiFields.add("record_offset");
    openapiFields.add("record_size");
    openapiFields.add("sort_options");
    openapiFields.add("tag_identifiers");
    openapiFields.add("include_stats");
    openapiFields.add("include_discoverable_objects");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchMetadataRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchMetadataRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchMetadataRequest is not found in the empty JSON string", SearchMetadataRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchMetadataRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchMetadataRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
        if (jsonArraymetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
          }

          // validate the optional field `metadata` (array)
          for (int i = 0; i < jsonArraymetadata.size(); i++) {
            MetadataListItemInput.validateJsonElement(jsonArraymetadata.get(i));
          };
        }
      }
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull()) {
        JsonArray jsonArraypermissions = jsonObj.getAsJsonArray("permissions");
        if (jsonArraypermissions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("permissions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
          }

          // validate the optional field `permissions` (array)
          for (int i = 0; i < jsonArraypermissions.size(); i++) {
            PermissionInput.validateJsonElement(jsonArraypermissions.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("created_by_user_identifiers") != null && !jsonObj.get("created_by_user_identifiers").isJsonNull() && !jsonObj.get("created_by_user_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_by_user_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("created_by_user_identifiers").toString()));
      }
      if ((jsonObj.get("dependent_object_version") != null && !jsonObj.get("dependent_object_version").isJsonNull()) && !jsonObj.get("dependent_object_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dependent_object_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dependent_object_version").toString()));
      }
      // validate the optional field `dependent_object_version`
      if (jsonObj.get("dependent_object_version") != null && !jsonObj.get("dependent_object_version").isJsonNull()) {
        DependentObjectVersionEnum.validateJsonElement(jsonObj.get("dependent_object_version"));
      }
      if (jsonObj.get("exclude_objects") != null && !jsonObj.get("exclude_objects").isJsonNull()) {
        JsonArray jsonArrayexcludeObjects = jsonObj.getAsJsonArray("exclude_objects");
        if (jsonArrayexcludeObjects != null) {
          // ensure the json data is an array
          if (!jsonObj.get("exclude_objects").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `exclude_objects` to be an array in the JSON string but got `%s`", jsonObj.get("exclude_objects").toString()));
          }

          // validate the optional field `exclude_objects` (array)
          for (int i = 0; i < jsonArrayexcludeObjects.size(); i++) {
            ExcludeMetadataListItemInput.validateJsonElement(jsonArrayexcludeObjects.get(i));
          };
        }
      }
      // validate the optional field `favorite_object_options`
      if (jsonObj.get("favorite_object_options") != null && !jsonObj.get("favorite_object_options").isJsonNull()) {
        FavoriteObjectOptionsInput.validateJsonElement(jsonObj.get("favorite_object_options"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("modified_by_user_identifiers") != null && !jsonObj.get("modified_by_user_identifiers").isJsonNull() && !jsonObj.get("modified_by_user_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `modified_by_user_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("modified_by_user_identifiers").toString()));
      }
      // validate the optional field `sort_options`
      if (jsonObj.get("sort_options") != null && !jsonObj.get("sort_options").isJsonNull()) {
        MetadataSearchSortOptions.validateJsonElement(jsonObj.get("sort_options"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tag_identifiers") != null && !jsonObj.get("tag_identifiers").isJsonNull() && !jsonObj.get("tag_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("tag_identifiers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchMetadataRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchMetadataRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchMetadataRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchMetadataRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchMetadataRequest>() {
           @Override
           public void write(JsonWriter out, SearchMetadataRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchMetadataRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchMetadataRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchMetadataRequest
   * @throws IOException if the JSON string is invalid with respect to SearchMetadataRequest
   */
  public static SearchMetadataRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchMetadataRequest.class);
  }

  /**
   * Convert an instance of SearchMetadataRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

