export declare class SystemInfo {
    'id'?: string;
    'name'?: string;
    'release_version'?: string;
    'time_zone'?: string;
    'locale'?: string;
    'date_format'?: string;
    'api_version'?: string;
    'type'?: string;
    'environment'?: string;
    'license'?: string;
    'date_time_format'?: string;
    'time_format'?: string;
    'system_user_id'?: string;
    'super_user_id'?: string;
    'hidden_object_id'?: string;
    'system_group_id'?: string;
    'tsadmin_user_id'?: string;
    'admin_group_id'?: string;
    'all_tables_connection_id'?: string;
    'all_user_group_id'?: string;
    'accept_language'?: string;
    'all_user_group_member_user_count'?: number;
    'logical_model_version'?: number;
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
