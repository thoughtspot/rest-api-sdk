import { FavoriteMetadataInput } from '../models/FavoriteMetadataInput';
import { SortOptions } from '../models/SortOptions';
export declare class SearchUsersRequest {
    'user_identifier'?: string;
    'display_name'?: string;
    'name_pattern'?: string;
    'visibility'?: SearchUsersRequestVisibilityEnum;
    'email'?: string;
    'group_identifiers'?: Array<string>;
    'privileges'?: Array<SearchUsersRequestPrivilegesEnum>;
    'account_type'?: SearchUsersRequestAccountTypeEnum;
    'account_status'?: SearchUsersRequestAccountStatusEnum;
    'notify_on_share'?: boolean | null;
    'show_onboarding_experience'?: boolean | null;
    'onboarding_experience_completed'?: boolean | null;
    'org_identifiers'?: Array<string>;
    'home_liveboard_identifier'?: string;
    'favorite_metadata'?: Array<FavoriteMetadataInput>;
    'record_offset'?: number;
    'record_size'?: number;
    'sort_options'?: SortOptions;
    'role_identifiers'?: Array<string>;
    'include_favorite_metadata'?: boolean | null;
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
export type SearchUsersRequestVisibilityEnum = "SHARABLE" | "NON_SHARABLE";
export type SearchUsersRequestPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "ENABLESPOTAPPCREATION" | "LIVEBOARD_VERIFIER" | "PREVIEW_THOUGHTSPOT_SAGE";
export type SearchUsersRequestAccountTypeEnum = "LOCAL_USER" | "LDAP_USER" | "SAML_USER" | "OIDC_USER" | "REMOTE_USER";
export type SearchUsersRequestAccountStatusEnum = "ACTIVE" | "INACTIVE" | "EXPIRED" | "LOCKED" | "PENDING";
