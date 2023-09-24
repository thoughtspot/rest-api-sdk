import { SqlQuery } from '../models/SqlQuery';
export declare class SqlQueryResponse {
    'metadata_id': string;
    'metadata_name': string;
    'metadata_type': SqlQueryResponseMetadataTypeEnum;
    'sql_queries': Array<SqlQuery>;
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
export type SqlQueryResponseMetadataTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN" | "CONNECTION" | "TAG" | "USER" | "USER_GROUP" | "LOGICAL_RELATIONSHIP";
