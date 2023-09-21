export declare class UpdateDbtConnectionRequest {
    'connection_name'?: string;
    'database_name'?: string;
    'import_type'?: UpdateDbtConnectionRequestImportTypeEnum;
    'access_token'?: string;
    'dbt_url'?: string;
    'account_id'?: string;
    'project_id'?: string;
    'dbt_env_id'?: string;
    'project_name'?: string;
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
export type UpdateDbtConnectionRequestImportTypeEnum = "DBT_CLOUD";
