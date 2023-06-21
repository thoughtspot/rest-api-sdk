import { FavoriteMetadataInput } from '../models/FavoriteMetadataInput';
export declare class UpdateUserRequest {
    'name'?: string;
    'displayName'?: string;
    'visibility'?: UpdateUserRequestVisibilityEnum;
    'email'?: string;
    'accountStatus'?: UpdateUserRequestAccountStatusEnum;
    'notifyOnShare'?: boolean | null;
    'showOnboardingExperience'?: boolean | null;
    'onboardingExperienceCompleted'?: boolean | null;
    'accountType'?: UpdateUserRequestAccountTypeEnum;
    'groupIdentifiers'?: Array<string>;
    'homeLiveboardIdentifier'?: string;
    'favoriteMetadata'?: Array<FavoriteMetadataInput>;
    'orgIdentifiers'?: Array<string>;
    'operation'?: UpdateUserRequestOperationEnum;
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
export type UpdateUserRequestVisibilityEnum = "SHARABLE" | "NON_SHARABLE";
export type UpdateUserRequestAccountStatusEnum = "ACTIVE" | "INACTIVE" | "EXPIRED" | "LOCKED" | "PENDING";
export type UpdateUserRequestAccountTypeEnum = "LOCAL_USER" | "LDAP_USER" | "SAML_USER" | "OIDC_USER" | "REMOTE_USER";
export type UpdateUserRequestOperationEnum = "ADD" | "REMOVE" | "REPLACE";
