import { FavoriteMetadataInput } from '../models/FavoriteMetadataInput';
export declare class ImportUser {
    'userIdentifier': string;
    'displayName': string;
    'password'?: string;
    'accountType'?: ImportUserAccountTypeEnum;
    'accountStatus'?: ImportUserAccountStatusEnum;
    'email'?: string;
    'orgIdentifiers'?: Array<string>;
    'groupIdentifiers'?: Array<string>;
    'visibility'?: ImportUserVisibilityEnum;
    'notifyOnShare'?: boolean;
    'showOnboardingExperience'?: boolean;
    'onboardingExperienceCompleted'?: boolean;
    'homeLiveboardIdentifier'?: string;
    'favoriteMetadata'?: Array<FavoriteMetadataInput>;
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
export type ImportUserAccountTypeEnum = "LOCAL_USER" | "LDAP_USER" | "SAML_USER" | "OIDC_USER" | "REMOTE_USER";
export type ImportUserAccountStatusEnum = "ACTIVE" | "INACTIVE" | "EXPIRED" | "LOCKED" | "PENDING";
export type ImportUserVisibilityEnum = "SHARABLE" | "NON_SHARABLE";
