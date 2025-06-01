/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thoughtspot.client.JSON;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** SearchConnectionRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SearchConnectionRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONNECTIONS = "connections";

    @SerializedName(SERIALIZED_NAME_CONNECTIONS)
    @javax.annotation.Nullable
    private List<ConnectionInput> connections;

    /** Gets or Sets dataWarehouseTypes */
    @JsonAdapter(DataWarehouseTypesEnum.Adapter.class)
    public enum DataWarehouseTypesEnum {
        SNOWFLAKE("SNOWFLAKE"),

        AMAZON_REDSHIFT("AMAZON_REDSHIFT"),

        GOOGLE_BIGQUERY("GOOGLE_BIGQUERY"),

        AZURE_SYNAPSE("AZURE_SYNAPSE"),

        TERADATA("TERADATA"),

        SAP_HANA("SAP_HANA"),

        STARBURST("STARBURST"),

        ORACLE_ADW("ORACLE_ADW"),

        DATABRICKS("DATABRICKS"),

        DENODO("DENODO"),

        DREMIO("DREMIO"),

        TRINO("TRINO"),

        PRESTO("PRESTO"),

        POSTGRES("POSTGRES"),

        SQLSERVER("SQLSERVER"),

        MYSQL("MYSQL"),

        GENERIC_JDBC("GENERIC_JDBC"),

        AMAZON_RDS_POSTGRESQL("AMAZON_RDS_POSTGRESQL"),

        AMAZON_AURORA_POSTGRESQL("AMAZON_AURORA_POSTGRESQL"),

        AMAZON_RDS_MYSQL("AMAZON_RDS_MYSQL"),

        AMAZON_AURORA_MYSQL("AMAZON_AURORA_MYSQL"),

        LOOKER("LOOKER"),

        AMAZON_ATHENA("AMAZON_ATHENA"),

        SINGLESTORE("SINGLESTORE"),

        GCP_SQLSERVER("GCP_SQLSERVER"),

        GCP_ALLOYDB_POSTGRESQL("GCP_ALLOYDB_POSTGRESQL"),

        GCP_POSTGRESQL("GCP_POSTGRESQL"),

        GCP_MYSQL("GCP_MYSQL"),

        MODE("MODE"),

        GOOGLE_SHEETS("GOOGLE_SHEETS"),

        FALCON("FALCON"),

        FALCON_ONPREM("FALCON_ONPREM"),

        CLICKHOUSE("CLICKHOUSE");

        private String value;

        DataWarehouseTypesEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DataWarehouseTypesEnum fromValue(String value) {
            for (DataWarehouseTypesEnum b : DataWarehouseTypesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<DataWarehouseTypesEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final DataWarehouseTypesEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DataWarehouseTypesEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DataWarehouseTypesEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            DataWarehouseTypesEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_DATA_WAREHOUSE_TYPES = "data_warehouse_types";

    @SerializedName(SERIALIZED_NAME_DATA_WAREHOUSE_TYPES)
    @javax.annotation.Nullable
    private List<DataWarehouseTypesEnum> dataWarehouseTypes;

    public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";

    @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
    @javax.annotation.Nullable
    private Integer recordOffset = 0;

    public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";

    @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
    @javax.annotation.Nullable
    private Integer recordSize = 10;

    public static final String SERIALIZED_NAME_TAG_IDENTIFIERS = "tag_identifiers";

    @SerializedName(SERIALIZED_NAME_TAG_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> tagIdentifiers;

    /** Data warehouse object type. */
    @JsonAdapter(DataWarehouseObjectTypeEnum.Adapter.class)
    public enum DataWarehouseObjectTypeEnum {
        DATABASE("DATABASE"),

        SCHEMA("SCHEMA"),

        TABLE("TABLE"),

        COLUMN("COLUMN");

        private String value;

        DataWarehouseObjectTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DataWarehouseObjectTypeEnum fromValue(String value) {
            for (DataWarehouseObjectTypeEnum b : DataWarehouseObjectTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<DataWarehouseObjectTypeEnum> {
            @Override
            public void write(
                    final JsonWriter jsonWriter, final DataWarehouseObjectTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DataWarehouseObjectTypeEnum read(final JsonReader jsonReader)
                    throws IOException {
                String value = jsonReader.nextString();
                return DataWarehouseObjectTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            DataWarehouseObjectTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_DATA_WAREHOUSE_OBJECT_TYPE =
            "data_warehouse_object_type";

    @SerializedName(SERIALIZED_NAME_DATA_WAREHOUSE_OBJECT_TYPE)
    @javax.annotation.Nullable
    private DataWarehouseObjectTypeEnum dataWarehouseObjectType;

    public static final String SERIALIZED_NAME_SORT_OPTIONS = "sort_options";

    @SerializedName(SERIALIZED_NAME_SORT_OPTIONS)
    @javax.annotation.Nullable
    private SortOptionInput sortOptions;

    public static final String SERIALIZED_NAME_INCLUDE_DETAILS = "include_details";

    @SerializedName(SERIALIZED_NAME_INCLUDE_DETAILS)
    @javax.annotation.Nullable
    private Boolean includeDetails;

    public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";

    @SerializedName(SERIALIZED_NAME_CONFIGURATION)
    @javax.annotation.Nullable
    private Object _configuration;

    /**
     * List of authentication types to fetch data_ware_house_objects from external Data warehouse.
     * This is only applicable when data_warehouse_object_type is selected.
     */
    @JsonAdapter(AuthenticationTypeEnum.Adapter.class)
    public enum AuthenticationTypeEnum {
        SERVICE_ACCOUNT("SERVICE_ACCOUNT"),

        OAUTH("OAUTH"),

        IAM("IAM"),

        EXTOAUTH("EXTOAUTH"),

        OAUTH_WITH_SERVICE_PRINCIPAL("OAUTH_WITH_SERVICE_PRINCIPAL"),

        PERSONAL_ACCESS_TOKEN("PERSONAL_ACCESS_TOKEN");

        private String value;

        AuthenticationTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static AuthenticationTypeEnum fromValue(String value) {
            for (AuthenticationTypeEnum b : AuthenticationTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<AuthenticationTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final AuthenticationTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AuthenticationTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return AuthenticationTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            AuthenticationTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_AUTHENTICATION_TYPE = "authentication_type";

    @SerializedName(SERIALIZED_NAME_AUTHENTICATION_TYPE)
    @javax.annotation.Nullable
    private AuthenticationTypeEnum authenticationType = AuthenticationTypeEnum.SERVICE_ACCOUNT;

    public static final String SERIALIZED_NAME_SHOW_RESOLVED_PARAMETERS =
            "show_resolved_parameters";

    @SerializedName(SERIALIZED_NAME_SHOW_RESOLVED_PARAMETERS)
    @javax.annotation.Nullable
    private Boolean showResolvedParameters = false;

    public SearchConnectionRequest() {}

    public SearchConnectionRequest connections(
            @javax.annotation.Nullable List<ConnectionInput> connections) {
        this.connections = connections;
        return this;
    }

    public SearchConnectionRequest addConnectionsItem(ConnectionInput connectionsItem) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        this.connections.add(connectionsItem);
        return this;
    }

    /**
     * List of connections and name pattern
     *
     * @return connections
     */
    @javax.annotation.Nullable
    public List<ConnectionInput> getConnections() {
        return connections;
    }

    public void setConnections(@javax.annotation.Nullable List<ConnectionInput> connections) {
        this.connections = connections;
    }

    public SearchConnectionRequest dataWarehouseTypes(
            @javax.annotation.Nullable List<DataWarehouseTypesEnum> dataWarehouseTypes) {
        this.dataWarehouseTypes = dataWarehouseTypes;
        return this;
    }

    public SearchConnectionRequest addDataWarehouseTypesItem(
            DataWarehouseTypesEnum dataWarehouseTypesItem) {
        if (this.dataWarehouseTypes == null) {
            this.dataWarehouseTypes = new ArrayList<>();
        }
        this.dataWarehouseTypes.add(dataWarehouseTypesItem);
        return this;
    }

    /**
     * Array of types of data warehouse defined for the connection.
     *
     * @return dataWarehouseTypes
     */
    @javax.annotation.Nullable
    public List<DataWarehouseTypesEnum> getDataWarehouseTypes() {
        return dataWarehouseTypes;
    }

    public void setDataWarehouseTypes(
            @javax.annotation.Nullable List<DataWarehouseTypesEnum> dataWarehouseTypes) {
        this.dataWarehouseTypes = dataWarehouseTypes;
    }

    public SearchConnectionRequest recordOffset(@javax.annotation.Nullable Integer recordOffset) {
        this.recordOffset = recordOffset;
        return this;
    }

    /**
     * The starting record number from where the records should be included.
     *
     * @return recordOffset
     */
    @javax.annotation.Nullable
    public Integer getRecordOffset() {
        return recordOffset;
    }

    public void setRecordOffset(@javax.annotation.Nullable Integer recordOffset) {
        this.recordOffset = recordOffset;
    }

    public SearchConnectionRequest recordSize(@javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
        return this;
    }

    /**
     * The number of records that should be included.
     *
     * @return recordSize
     */
    @javax.annotation.Nullable
    public Integer getRecordSize() {
        return recordSize;
    }

    public void setRecordSize(@javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
    }

    public SearchConnectionRequest tagIdentifiers(
            @javax.annotation.Nullable List<String> tagIdentifiers) {
        this.tagIdentifiers = tagIdentifiers;
        return this;
    }

    public SearchConnectionRequest addTagIdentifiersItem(String tagIdentifiersItem) {
        if (this.tagIdentifiers == null) {
            this.tagIdentifiers = new ArrayList<>();
        }
        this.tagIdentifiers.add(tagIdentifiersItem);
        return this;
    }

    /**
     * Unique ID or name of tags.
     *
     * @return tagIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getTagIdentifiers() {
        return tagIdentifiers;
    }

    public void setTagIdentifiers(@javax.annotation.Nullable List<String> tagIdentifiers) {
        this.tagIdentifiers = tagIdentifiers;
    }

    public SearchConnectionRequest dataWarehouseObjectType(
            @javax.annotation.Nullable DataWarehouseObjectTypeEnum dataWarehouseObjectType) {
        this.dataWarehouseObjectType = dataWarehouseObjectType;
        return this;
    }

    /**
     * Data warehouse object type.
     *
     * @return dataWarehouseObjectType
     */
    @javax.annotation.Nullable
    public DataWarehouseObjectTypeEnum getDataWarehouseObjectType() {
        return dataWarehouseObjectType;
    }

    public void setDataWarehouseObjectType(
            @javax.annotation.Nullable DataWarehouseObjectTypeEnum dataWarehouseObjectType) {
        this.dataWarehouseObjectType = dataWarehouseObjectType;
    }

    public SearchConnectionRequest sortOptions(
            @javax.annotation.Nullable SortOptionInput sortOptions) {
        this.sortOptions = sortOptions;
        return this;
    }

    /**
     * Sort options.
     *
     * @return sortOptions
     */
    @javax.annotation.Nullable
    public SortOptionInput getSortOptions() {
        return sortOptions;
    }

    public void setSortOptions(@javax.annotation.Nullable SortOptionInput sortOptions) {
        this.sortOptions = sortOptions;
    }

    public SearchConnectionRequest includeDetails(
            @javax.annotation.Nullable Boolean includeDetails) {
        this.includeDetails = includeDetails;
        return this;
    }

    /**
     * Indicates whether to include complete details of the connection objects.
     *
     * @return includeDetails
     */
    @javax.annotation.Nullable
    public Boolean getIncludeDetails() {
        return includeDetails;
    }

    public void setIncludeDetails(@javax.annotation.Nullable Boolean includeDetails) {
        this.includeDetails = includeDetails;
    }

    public SearchConnectionRequest _configuration(
            @javax.annotation.Nullable Object _configuration) {
        this._configuration = _configuration;
        return this;
    }

    /**
     * Configuration values. If empty we are fetching configuration from datasource based on given
     * connection id. If required you can provide config details to fetch specific details. Example
     * input: {},
     * {\&quot;warehouse\&quot;:\&quot;SMALL_WH\&quot;,\&quot;database\&quot;:\&quot;DEVELOPMENT\&quot;}.
     * This is only applicable when data_warehouse_object_type is selected.
     *
     * @return _configuration
     */
    @javax.annotation.Nullable
    public Object getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(@javax.annotation.Nullable Object _configuration) {
        this._configuration = _configuration;
    }

    public SearchConnectionRequest authenticationType(
            @javax.annotation.Nullable AuthenticationTypeEnum authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * List of authentication types to fetch data_ware_house_objects from external Data warehouse.
     * This is only applicable when data_warehouse_object_type is selected.
     *
     * @return authenticationType
     */
    @javax.annotation.Nullable
    public AuthenticationTypeEnum getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(
            @javax.annotation.Nullable AuthenticationTypeEnum authenticationType) {
        this.authenticationType = authenticationType;
    }

    public SearchConnectionRequest showResolvedParameters(
            @javax.annotation.Nullable Boolean showResolvedParameters) {
        this.showResolvedParameters = showResolvedParameters;
        return this;
    }

    /**
     * &lt;div&gt;Version: 10.9.0.cl or later &lt;/div&gt; Indicates whether to show resolved
     * parameterised values.
     *
     * @return showResolvedParameters
     */
    @javax.annotation.Nullable
    public Boolean getShowResolvedParameters() {
        return showResolvedParameters;
    }

    public void setShowResolvedParameters(
            @javax.annotation.Nullable Boolean showResolvedParameters) {
        this.showResolvedParameters = showResolvedParameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchConnectionRequest searchConnectionRequest = (SearchConnectionRequest) o;
        return Objects.equals(this.connections, searchConnectionRequest.connections)
                && Objects.equals(
                        this.dataWarehouseTypes, searchConnectionRequest.dataWarehouseTypes)
                && Objects.equals(this.recordOffset, searchConnectionRequest.recordOffset)
                && Objects.equals(this.recordSize, searchConnectionRequest.recordSize)
                && Objects.equals(this.tagIdentifiers, searchConnectionRequest.tagIdentifiers)
                && Objects.equals(
                        this.dataWarehouseObjectType,
                        searchConnectionRequest.dataWarehouseObjectType)
                && Objects.equals(this.sortOptions, searchConnectionRequest.sortOptions)
                && Objects.equals(this.includeDetails, searchConnectionRequest.includeDetails)
                && Objects.equals(this._configuration, searchConnectionRequest._configuration)
                && Objects.equals(
                        this.authenticationType, searchConnectionRequest.authenticationType)
                && Objects.equals(
                        this.showResolvedParameters,
                        searchConnectionRequest.showResolvedParameters);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                connections,
                dataWarehouseTypes,
                recordOffset,
                recordSize,
                tagIdentifiers,
                dataWarehouseObjectType,
                sortOptions,
                includeDetails,
                _configuration,
                authenticationType,
                showResolvedParameters);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchConnectionRequest {\n");
        sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
        sb.append("    dataWarehouseTypes: ")
                .append(toIndentedString(dataWarehouseTypes))
                .append("\n");
        sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
        sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
        sb.append("    tagIdentifiers: ").append(toIndentedString(tagIdentifiers)).append("\n");
        sb.append("    dataWarehouseObjectType: ")
                .append(toIndentedString(dataWarehouseObjectType))
                .append("\n");
        sb.append("    sortOptions: ").append(toIndentedString(sortOptions)).append("\n");
        sb.append("    includeDetails: ").append(toIndentedString(includeDetails)).append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
        sb.append("    authenticationType: ")
                .append(toIndentedString(authenticationType))
                .append("\n");
        sb.append("    showResolvedParameters: ")
                .append(toIndentedString(showResolvedParameters))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
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
        openapiFields.add("connections");
        openapiFields.add("data_warehouse_types");
        openapiFields.add("record_offset");
        openapiFields.add("record_size");
        openapiFields.add("tag_identifiers");
        openapiFields.add("data_warehouse_object_type");
        openapiFields.add("sort_options");
        openapiFields.add("include_details");
        openapiFields.add("configuration");
        openapiFields.add("authentication_type");
        openapiFields.add("show_resolved_parameters");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SearchConnectionRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SearchConnectionRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SearchConnectionRequest is not found"
                                        + " in the empty JSON string",
                                SearchConnectionRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SearchConnectionRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SearchConnectionRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (jsonObj.get("connections") != null && !jsonObj.get("connections").isJsonNull()) {
            JsonArray jsonArrayconnections = jsonObj.getAsJsonArray("connections");
            if (jsonArrayconnections != null) {
                // ensure the json data is an array
                if (!jsonObj.get("connections").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `connections` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("connections").toString()));
                }

                // validate the optional field `connections` (array)
                for (int i = 0; i < jsonArrayconnections.size(); i++) {
                    ConnectionInput.validateJsonElement(jsonArrayconnections.get(i));
                }
                ;
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("data_warehouse_types") != null
                && !jsonObj.get("data_warehouse_types").isJsonNull()
                && !jsonObj.get("data_warehouse_types").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `data_warehouse_types` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("data_warehouse_types").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("tag_identifiers") != null
                && !jsonObj.get("tag_identifiers").isJsonNull()
                && !jsonObj.get("tag_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `tag_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("tag_identifiers").toString()));
        }
        if ((jsonObj.get("data_warehouse_object_type") != null
                        && !jsonObj.get("data_warehouse_object_type").isJsonNull())
                && !jsonObj.get("data_warehouse_object_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `data_warehouse_object_type` to be a primitive"
                                    + " type in the JSON string but got `%s`",
                            jsonObj.get("data_warehouse_object_type").toString()));
        }
        // validate the optional field `data_warehouse_object_type`
        if (jsonObj.get("data_warehouse_object_type") != null
                && !jsonObj.get("data_warehouse_object_type").isJsonNull()) {
            DataWarehouseObjectTypeEnum.validateJsonElement(
                    jsonObj.get("data_warehouse_object_type"));
        }
        // validate the optional field `sort_options`
        if (jsonObj.get("sort_options") != null && !jsonObj.get("sort_options").isJsonNull()) {
            SortOptionInput.validateJsonElement(jsonObj.get("sort_options"));
        }
        if ((jsonObj.get("authentication_type") != null
                        && !jsonObj.get("authentication_type").isJsonNull())
                && !jsonObj.get("authentication_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `authentication_type` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("authentication_type").toString()));
        }
        // validate the optional field `authentication_type`
        if (jsonObj.get("authentication_type") != null
                && !jsonObj.get("authentication_type").isJsonNull()) {
            AuthenticationTypeEnum.validateJsonElement(jsonObj.get("authentication_type"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SearchConnectionRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SearchConnectionRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SearchConnectionRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SearchConnectionRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SearchConnectionRequest>() {
                        @Override
                        public void write(JsonWriter out, SearchConnectionRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SearchConnectionRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SearchConnectionRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SearchConnectionRequest
     * @throws IOException if the JSON string is invalid with respect to SearchConnectionRequest
     */
    public static SearchConnectionRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SearchConnectionRequest.class);
    }

    /**
     * Convert an instance of SearchConnectionRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
