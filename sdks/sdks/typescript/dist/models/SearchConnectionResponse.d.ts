import { DataWarehouseObjects } from '../models/DataWarehouseObjects';
export declare class SearchConnectionResponse {
    'id': string;
    'name': string;
    'description'?: string;
    'data_warehouse_type': SearchConnectionResponseDataWarehouseTypeEnum;
    'data_warehouse_objects'?: DataWarehouseObjects;
    'details'?: any;
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
export type SearchConnectionResponseDataWarehouseTypeEnum = "SNOWFLAKE" | "AMAZON_REDSHIFT" | "GOOGLE_BIGQUERY" | "AZURE_SYNAPSE" | "TERADATA" | "SAP_HANA" | "STARBURST" | "ORACLE_ADW" | "DATABRICKS" | "DENODO" | "DREMIO" | "TRINO" | "PRESTO" | "POSTGRES" | "SQL_SERVER" | "MYSQL" | "GENERIC_JDBC" | "AMAZON_RDS_POSTGRESQL" | "AMAZON_AURORA_POSTGRESQL" | "AMAZON_RDS_MYSQL" | "AMAZON_AURORA_MYSQL" | "LOOKER" | "AMAZON_ATHENA" | "SINGLESTORE" | "GCP_SQLSERVER" | "GCP_ALLOYDB_POSTGRESQL" | "GCP_POSTGRESQL";
