import { ConnectionInput } from '../models/ConnectionInput';
import { SortOptionInput } from '../models/SortOptionInput';
export declare class SearchConnectionRequest {
    'connections'?: Array<ConnectionInput>;
    'data_warehouse_types'?: Array<SearchConnectionRequestDataWarehouseTypesEnum>;
    'record_offset'?: number;
    'record_size'?: number;
    'tag_identifiers'?: Array<string>;
    'data_warehouse_object_type'?: SearchConnectionRequestDataWarehouseObjectTypeEnum;
    'sort_options'?: SortOptionInput;
    'include_details'?: boolean | null;
    'configuration'?: any;
    'authentication_type'?: SearchConnectionRequestAuthenticationTypeEnum;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
export type SearchConnectionRequestDataWarehouseTypesEnum = "SNOWFLAKE" | "AMAZON_REDSHIFT" | "GOOGLE_BIGQUERY" | "AZURE_SYNAPSE" | "TERADATA" | "SAP_HANA" | "STARBURST" | "ORACLE_ADW" | "DATABRICKS" | "DENODO" | "DREMIO" | "TRINO" | "PRESTO" | "POSTGRES" | "SQL_SERVER" | "MYSQL" | "GENERIC_JDBC" | "AMAZON_RDS_POSTGRESQL" | "AMAZON_AURORA_POSTGRESQL" | "AMAZON_RDS_MYSQL" | "AMAZON_AURORA_MYSQL" | "LOOKER" | "AMAZON_ATHENA" | "SINGLESTORE" | "GCP_SQLSERVER" | "GCP_ALLOYDB_POSTGRESQL" | "GCP_POSTGRESQL";
export type SearchConnectionRequestDataWarehouseObjectTypeEnum = "DATABASE" | "SCHEMA" | "TABLE" | "COLUMN";
export type SearchConnectionRequestAuthenticationTypeEnum = "SERVICE_ACCOUNT" | "OAUTH" | "IAM" | "EXTOAUTH";
