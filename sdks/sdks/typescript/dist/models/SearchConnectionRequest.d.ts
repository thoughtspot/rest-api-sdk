import { ConnectionInput } from '../models/ConnectionInput';
import { SortOptionInput } from '../models/SortOptionInput';
export declare class SearchConnectionRequest {
    'connections'?: Array<ConnectionInput>;
    'dataWarehouseTypes'?: Array<SearchConnectionRequestDataWarehouseTypesEnum>;
    'recordOffset'?: number;
    'recordSize'?: number;
    'tagIdentifiers'?: Array<string>;
    'dataWarehouseObjectType'?: SearchConnectionRequestDataWarehouseObjectTypeEnum;
    'sortOptions'?: SortOptionInput;
    'includeDetails'?: boolean | null;
    'configuration'?: any;
    'authenticationType'?: SearchConnectionRequestAuthenticationTypeEnum;
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
export type SearchConnectionRequestDataWarehouseTypesEnum = "SNOWFLAKE" | "AMAZON_REDSHIFT" | "GOOGLE_BIGQUERY" | "AZURE_SYNAPSE" | "TERADATA" | "SAP_HANA" | "STARBURST" | "ORACLE_ADW" | "DATABRICKS" | "DENODO" | "DREMIO" | "TRINO" | "PRESTO";
export type SearchConnectionRequestDataWarehouseObjectTypeEnum = "DATABASE" | "SCHEMA" | "TABLE" | "COLUMN";
export type SearchConnectionRequestAuthenticationTypeEnum = "SERVICE_ACCOUNT" | "OAUTH" | "IAM" | "EXTOAUTH";
