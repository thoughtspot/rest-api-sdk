export declare class UpdateUserGroupRequest {
    'name'?: string;
    'defaultLiveboardIdentifiers'?: Array<string>;
    'description'?: string;
    'displayName'?: string;
    'privileges'?: Array<UpdateUserGroupRequestPrivilegesEnum>;
    'subGroupIdentifiers'?: Array<string>;
    'type'?: UpdateUserGroupRequestTypeEnum;
    'userIdentifiers'?: Array<string>;
    'visibility'?: UpdateUserGroupRequestVisibilityEnum;
    'roleIdentifiers'?: Array<string>;
    'operation'?: UpdateUserGroupRequestOperationEnum;
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
export type UpdateUserGroupRequestPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "ENABLESPOTAPPCREATION" | "LIVEBOARD_VERIFIER" | "PREVIEW_THOUGHTSPOT_SAGE";
export type UpdateUserGroupRequestTypeEnum = "LOCAL_GROUP" | "LDAP_GROUP";
export type UpdateUserGroupRequestVisibilityEnum = "SHARABLE" | "NON_SHARABLE";
export type UpdateUserGroupRequestOperationEnum = "ADD" | "REMOVE" | "REPLACE";
