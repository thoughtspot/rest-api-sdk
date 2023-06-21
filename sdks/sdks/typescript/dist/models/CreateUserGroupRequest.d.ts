export declare class CreateUserGroupRequest {
    'name': string;
    'displayName': string;
    'defaultLiveboardIdentifiers'?: Array<string>;
    'description'?: string;
    'privileges'?: Array<CreateUserGroupRequestPrivilegesEnum>;
    'subGroupIdentifiers'?: Array<string>;
    'type'?: CreateUserGroupRequestTypeEnum;
    'userIdentifiers'?: Array<string>;
    'visibility'?: CreateUserGroupRequestVisibilityEnum;
    'roleIdentifiers'?: Array<string>;
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
export type CreateUserGroupRequestPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "ENABLESPOTAPPCREATION" | "LIVEBOARD_VERIFIER" | "PREVIEW_THOUGHTSPOT_SAGE";
export type CreateUserGroupRequestTypeEnum = "LOCAL_GROUP" | "LDAP_GROUP";
export type CreateUserGroupRequestVisibilityEnum = "SHARABLE" | "NON_SHARABLE";
