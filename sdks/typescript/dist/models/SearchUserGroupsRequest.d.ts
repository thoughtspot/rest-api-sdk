import { SortOptions } from '../models/SortOptions';
export declare class SearchUserGroupsRequest {
    'default_liveboard_identifiers'?: Array<string>;
    'description'?: string;
    'display_name'?: string;
    'name_pattern'?: string;
    'group_identifier'?: string;
    'org_identifiers'?: Array<string>;
    'privileges'?: Array<SearchUserGroupsRequestPrivilegesEnum>;
    'sub_group_identifiers'?: Array<string>;
    'type'?: SearchUserGroupsRequestTypeEnum;
    'user_identifiers'?: Array<string>;
    'visibility'?: SearchUserGroupsRequestVisibilityEnum;
    'role_identifiers'?: Array<string>;
    'record_offset'?: number;
    'record_size'?: number;
    'sort_options'?: SortOptions;
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
export type SearchUserGroupsRequestPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "LIVEBOARD_VERIFIER" | "ENABLESPOTAPPCREATION" | "PREVIEW_THOUGHTSPOT_SAGE" | "APPLICATION_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "CAN_MANAGE_CUSTOM_CALENDAR" | "CAN_CREATE_OR_EDIT_CONNECTIONS" | "CAN_CONFIGURE_CONNECTIONS" | "CAN_MANAGE_WORKSHEET_VIEWS_TABLES";
export type SearchUserGroupsRequestTypeEnum = "LOCAL_GROUP" | "LDAP_GROUP";
export type SearchUserGroupsRequestVisibilityEnum = "SHARABLE" | "NON_SHARABLE";
