import { GenericInfo } from '../models/GenericInfo';
export declare class SearchRoleResponse {
    'id': string;
    'name': string;
    'description': string;
    'groups_assigned_count'?: number;
    'orgs'?: Array<GenericInfo>;
    'groups'?: Array<GenericInfo>;
    'privileges': Array<SearchRoleResponsePrivilegesEnum>;
    'permission'?: SearchRoleResponsePermissionEnum;
    'author_id'?: string;
    'modifier_id'?: string;
    'creation_time_in_millis'?: any;
    'modification_time_in_millis'?: any;
    'deleted'?: boolean;
    'deprecated'?: boolean;
    'external'?: boolean;
    'hidden'?: boolean;
    'shared_via_connection'?: boolean;
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
export type SearchRoleResponsePrivilegesEnum = "UNKNOWN" | "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "SECURITYMANAGEMENT" | "LOGICALMODELING" | "DATAMANAGEMENT" | "TAGMANAGEMENT" | "SHAREWITHALL" | "SYSTEMMANAGEMENT" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DISABLE_PINBOARD_CREATION" | "DEVELOPER" | "APPLICATION_ADMINISTRATION" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "BACKUP_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "ENABLESPOTAPPCREATION" | "SYNCMANAGEMENT" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "PREVIEW_THOUGHTSPOT_SAGE";
export type SearchRoleResponsePermissionEnum = "READ_ONLY" | "MODIFY" | "NO_ACCESS";
