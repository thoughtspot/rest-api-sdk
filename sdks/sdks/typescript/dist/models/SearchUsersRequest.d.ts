import { FavoriteMetadataInput } from '../models/FavoriteMetadataInput';
import { SortOptions } from '../models/SortOptions';
export declare class SearchUsersRequest {
    'userIdentifier'?: string;
    'displayName'?: string;
    'visibility'?: SearchUsersRequestVisibilityEnum;
    'email'?: string;
    'groupIdentifiers'?: Array<string>;
    'privileges'?: Array<SearchUsersRequestPrivilegesEnum>;
    'accountType'?: SearchUsersRequestAccountTypeEnum;
    'accountStatus'?: SearchUsersRequestAccountStatusEnum;
    'notifyOnShare'?: boolean | null;
    'showOnboardingExperience'?: boolean | null;
    'onboardingExperienceCompleted'?: boolean | null;
    'orgIdentifiers'?: Array<string>;
    'homeLiveboardIdentifier'?: string;
    'favoriteMetadata'?: Array<FavoriteMetadataInput>;
    'recordOffset'?: number;
    'recordSize'?: number;
    'sortOptions'?: SortOptions;
    'roleIdentifiers'?: Array<string>;
    'includeFavoriteMetadata'?: boolean | null;
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
