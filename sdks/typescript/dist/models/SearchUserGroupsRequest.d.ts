import { SortOptions } from '../models/SortOptions';
export declare class SearchUserGroupsRequest {
    'defaultLiveboardIdentifiers'?: Array<string>;
    'description'?: string;
    'displayName'?: string;
    'groupIdentifier'?: string;
    'orgIdentifiers'?: Array<string>;
    'privileges'?: Array<SearchUserGroupsRequestPrivilegesEnum>;
    'subGroupIdentifiers'?: Array<string>;
    'type'?: SearchUserGroupsRequestTypeEnum;
    'userIdentifiers'?: Array<string>;
    'visibility'?: SearchUserGroupsRequestVisibilityEnum;
    'roleIdentifiers'?: Array<string>;
    'recordOffset'?: number;
    'recordSize'?: number;
    'sortOptions'?: SortOptions;
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
export type SearchUserGroupsRequestPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "ENABLESPOTAPPCREATION" | "LIVEBOARD_VERIFIER" | "PREVIEW_THOUGHTSPOT_SAGE";
export type SearchUserGroupsRequestTypeEnum = "LOCAL_GROUP" | "LDAP_GROUP";
export type SearchUserGroupsRequestVisibilityEnum = "SHARABLE" | "NON_SHARABLE";
