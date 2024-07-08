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

import { HttpFile } from '../http/http';

export class CreateConnectionRequest {
    /**
    * Unique name for the connection.
    */
    'name': string;
    /**
    * Description of the connection.
    */
    'description'?: string;
    /**
    * Type of the data warehouse.
    */
    'data_warehouse_type': CreateConnectionRequestDataWarehouseTypeEnum;
    /**
    * Connection configuration attributes in JSON format. To create a connection with tables, include table attributes. See the documentation above for sample JSON.
    */
    'data_warehouse_config': any;
    /**
    * Validates the connection metadata if tables are included. If you are creating a connection without tables, specify `false`.
    */
    'validate'?: boolean | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "data_warehouse_type",
            "baseName": "data_warehouse_type",
            "type": "CreateConnectionRequestDataWarehouseTypeEnum",
            "format": ""
        },
        {
            "name": "data_warehouse_config",
            "baseName": "data_warehouse_config",
            "type": "any",
            "format": ""
        },
        {
            "name": "validate",
            "baseName": "validate",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CreateConnectionRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type CreateConnectionRequestDataWarehouseTypeEnum = "SNOWFLAKE" | "AMAZON_REDSHIFT" | "GOOGLE_BIGQUERY" | "AZURE_SYNAPSE" | "TERADATA" | "SAP_HANA" | "STARBURST" | "ORACLE_ADW" | "DATABRICKS" | "DENODO" | "DREMIO" | "TRINO" | "PRESTO" | "POSTGRES" | "SQLSERVER" | "MYSQL" | "GENERIC_JDBC" | "AMAZON_RDS_POSTGRESQL" | "AMAZON_AURORA_POSTGRESQL" | "AMAZON_RDS_MYSQL" | "AMAZON_AURORA_MYSQL" | "LOOKER" | "AMAZON_ATHENA" | "SINGLESTORE" | "GCP_SQLSERVER" | "GCP_ALLOYDB_POSTGRESQL" | "GCP_POSTGRESQL" | "GCP_MYSQL" | "MODE" | "GOOGLE_SHEETS" ;

