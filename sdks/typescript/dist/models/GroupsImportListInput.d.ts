export declare class GroupsImportListInput {
    'displayName': string;
    'groupIdentifier': string;
    'defaultLiveboardIdentifiers'?: Array<string>;
    'description'?: string;
    'privileges'?: Array<GroupsImportListInputPrivilegesEnum>;
    'subGroupIdentifiers'?: Array<string>;
    'type'?: GroupsImportListInputTypeEnum;
    'userIdentifiers'?: Array<string>;
    'visibility'?: GroupsImportListInputVisibilityEnum;
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
export type GroupsImportListInputPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "ENABLESPOTAPPCREATION" | "LIVEBOARD_VERIFIER" | "PREVIEW_THOUGHTSPOT_SAGE";
export type GroupsImportListInputTypeEnum = "LOCAL_GROUP" | "LDAP_GROUP";
export type GroupsImportListInputVisibilityEnum = "SHARABLE" | "NON_SHARABLE";
