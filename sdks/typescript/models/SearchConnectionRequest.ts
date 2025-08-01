/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { ConnectionInput } from '../models/ConnectionInput';
import { SearchConnectionRequestSortOptions } from '../models/SearchConnectionRequestSortOptions';
import { HttpFile } from '../http/http';

export class SearchConnectionRequest {
    /**
    * List of connections and name pattern
    */
    'connections'?: Array<ConnectionInput>;
    /**
    * Array of types of data warehouse defined for the connection.
    */
    'data_warehouse_types'?: Array<SearchConnectionRequestDataWarehouseTypesEnum>;
    /**
    * The starting record number from where the records should be included.
    */
    'record_offset'?: number;
    /**
    * The number of records that should be included.
    */
    'record_size'?: number;
    /**
    * Unique ID or name of tags.
    */
    'tag_identifiers'?: Array<string>;
    /**
    * Data warehouse object type.
    */
    'data_warehouse_object_type'?: SearchConnectionRequestDataWarehouseObjectTypeEnum;
    'sort_options'?: SearchConnectionRequestSortOptions;
    /**
    * Indicates whether to include complete details of the connection objects.
    */
    'include_details'?: boolean | null;
    /**
    * Configuration values. If empty we are fetching configuration from datasource based on given connection id. If required you can provide config details to fetch specific details. Example input: {}, {\"warehouse\":\"SMALL_WH\",\"database\":\"DEVELOPMENT\"}. This is only applicable when data_warehouse_object_type is selected.
    */
    'configuration'?: any;
    /**
    * List of authentication types to fetch data_ware_house_objects from external Data warehouse. This is only applicable when data_warehouse_object_type is selected.
    */
    'authentication_type'?: SearchConnectionRequestAuthenticationTypeEnum;
    /**
    * <div>Version: 10.9.0.cl or later </div>  Indicates whether to show resolved parameterised values.
    */
    'show_resolved_parameters'?: boolean | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "connections",
            "baseName": "connections",
            "type": "Array<ConnectionInput>",
            "format": ""
        },
        {
            "name": "data_warehouse_types",
            "baseName": "data_warehouse_types",
            "type": "Array<SearchConnectionRequestDataWarehouseTypesEnum>",
            "format": ""
        },
        {
            "name": "record_offset",
            "baseName": "record_offset",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "record_size",
            "baseName": "record_size",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "tag_identifiers",
            "baseName": "tag_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "data_warehouse_object_type",
            "baseName": "data_warehouse_object_type",
            "type": "SearchConnectionRequestDataWarehouseObjectTypeEnum",
            "format": ""
        },
        {
            "name": "sort_options",
            "baseName": "sort_options",
            "type": "SearchConnectionRequestSortOptions",
            "format": ""
        },
        {
            "name": "include_details",
            "baseName": "include_details",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "configuration",
            "baseName": "configuration",
            "type": "any",
            "format": ""
        },
        {
            "name": "authentication_type",
            "baseName": "authentication_type",
            "type": "SearchConnectionRequestAuthenticationTypeEnum",
            "format": ""
        },
        {
            "name": "show_resolved_parameters",
            "baseName": "show_resolved_parameters",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SearchConnectionRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type SearchConnectionRequestDataWarehouseTypesEnum = "SNOWFLAKE" | "AMAZON_REDSHIFT" | "GOOGLE_BIGQUERY" | "AZURE_SYNAPSE" | "TERADATA" | "SAP_HANA" | "STARBURST" | "ORACLE_ADW" | "DATABRICKS" | "DENODO" | "DREMIO" | "TRINO" | "PRESTO" | "POSTGRES" | "SQLSERVER" | "MYSQL" | "GENERIC_JDBC" | "AMAZON_RDS_POSTGRESQL" | "AMAZON_AURORA_POSTGRESQL" | "AMAZON_RDS_MYSQL" | "AMAZON_AURORA_MYSQL" | "LOOKER" | "AMAZON_ATHENA" | "SINGLESTORE" | "GCP_SQLSERVER" | "GCP_ALLOYDB_POSTGRESQL" | "GCP_POSTGRESQL" | "GCP_MYSQL" | "MODE" | "GOOGLE_SHEETS" | "FALCON" | "FALCON_ONPREM" | "CLICKHOUSE" ;
export type SearchConnectionRequestDataWarehouseObjectTypeEnum = "DATABASE" | "SCHEMA" | "TABLE" | "COLUMN" ;
export type SearchConnectionRequestAuthenticationTypeEnum = "SERVICE_ACCOUNT" | "OAUTH" | "IAM" | "EXTOAUTH" | "OAUTH_WITH_SERVICE_PRINCIPAL" | "PERSONAL_ACCESS_TOKEN" ;

