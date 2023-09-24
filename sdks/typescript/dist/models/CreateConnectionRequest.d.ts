export declare class CreateConnectionRequest {
    'name': string;
    'description'?: string;
    'data_warehouse_type': CreateConnectionRequestDataWarehouseTypeEnum;
    'data_warehouse_config': any;
    'validate'?: boolean | null;
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
export type CreateConnectionRequestDataWarehouseTypeEnum = "SNOWFLAKE" | "AMAZON_REDSHIFT" | "GOOGLE_BIGQUERY" | "AZURE_SYNAPSE" | "TERADATA" | "SAP_HANA" | "STARBURST" | "ORACLE_ADW" | "DATABRICKS" | "DENODO" | "DREMIO" | "TRINO" | "PRESTO" | "POSTGRES" | "SQL_SERVER" | "MYSQL" | "GENERIC_JDBC" | "AMAZON_RDS_POSTGRESQL" | "AMAZON_AURORA_POSTGRESQL" | "AMAZON_RDS_MYSQL" | "AMAZON_AURORA_MYSQL" | "LOOKER" | "AMAZON_ATHENA" | "SINGLESTORE" | "GCP_SQLSERVER" | "GCP_ALLOYDB_POSTGRESQL" | "GCP_POSTGRESQL";
