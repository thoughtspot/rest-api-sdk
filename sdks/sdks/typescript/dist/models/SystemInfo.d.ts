export declare class SystemInfo {
    'id'?: string;
    'name'?: string;
    'releaseVersion'?: string;
    'timeZone'?: string;
    'locale'?: string;
    'dateFormat'?: string;
    'apiVersion'?: string;
    'type'?: string;
    'environment'?: string;
    'license'?: string;
    'dateTimeFormat'?: string;
    'timeFormat'?: string;
    'systemUserId'?: string;
    'superUserId'?: string;
    'hiddenObjectId'?: string;
    'systemGroupId'?: string;
    'tsadminUserId'?: string;
    'adminGroupId'?: string;
    'allTablesConnectionId'?: string;
    'allUserGroupId'?: string;
    'acceptLanguage'?: string;
    'allUserGroupMemberUserCount'?: number;
    'logicalModelVersion'?: number;
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
