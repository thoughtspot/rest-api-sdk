import { FavoriteMetadataInput } from '../models/FavoriteMetadataInput';
export declare class CreateUserRequest {
    'name': string;
    'displayName': string;
    'password': string;
    'email': string;
    'accountType'?: CreateUserRequestAccountTypeEnum;
    'accountStatus'?: CreateUserRequestAccountStatusEnum;
    'orgIdentifiers'?: Array<string>;
    'groupIdentifiers'?: Array<string>;
    'visibility'?: CreateUserRequestVisibilityEnum;
    'notifyOnShare'?: boolean | null;
    'showOnboardingExperience'?: boolean | null;
    'onboardingExperienceCompleted'?: boolean | null;
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
export type CreateUserRequestAccountTypeEnum = "LOCAL_USER" | "LDAP_USER" | "SAML_USER" | "OIDC_USER" | "REMOTE_USER";
export type CreateUserRequestAccountStatusEnum = "ACTIVE" | "INACTIVE" | "EXPIRED" | "LOCKED" | "PENDING";
export type CreateUserRequestVisibilityEnum = "SHARABLE" | "NON_SHARABLE";
