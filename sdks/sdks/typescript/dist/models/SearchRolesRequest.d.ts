export declare class SearchRolesRequest {
    'role_identifiers'?: Array<string>;
    'org_identifiers'?: Array<string>;
    'group_identifiers'?: Array<string>;
    'privileges'?: Array<SearchRolesRequestPrivilegesEnum>;
    'deprecated'?: boolean | null;
    'external'?: boolean | null;
    'shared_via_connection'?: boolean | null;
    'permissions'?: Array<SearchRolesRequestPermissionsEnum>;
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
export type SearchRolesRequestPrivilegesEnum = "UNKNOWN" | "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "SECURITYMANAGEMENT" | "LOGICALMODELING" | "DATAMANAGEMENT" | "TAGMANAGEMENT" | "SHAREWITHALL" | "SYSTEMMANAGEMENT" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DISABLE_PINBOARD_CREATION" | "DEVELOPER" | "APPLICATION_ADMINISTRATION" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "BACKUP_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "ENABLESPOTAPPCREATION" | "SYNCMANAGEMENT" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "PREVIEW_THOUGHTSPOT_SAGE";
export type SearchRolesRequestPermissionsEnum = "READ_ONLY" | "MODIFY" | "NO_ACCESS";
