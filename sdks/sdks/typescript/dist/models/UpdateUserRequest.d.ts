import { FavoriteMetadataInput } from '../models/FavoriteMetadataInput';
export declare class UpdateUserRequest {
    'name'?: string;
    'display_name'?: string;
    'visibility'?: UpdateUserRequestVisibilityEnum;
    'email'?: string;
    'account_status'?: UpdateUserRequestAccountStatusEnum;
    'notify_on_share'?: boolean | null;
    'show_onboarding_experience'?: boolean | null;
    'onboarding_experience_completed'?: boolean | null;
    'account_type'?: UpdateUserRequestAccountTypeEnum;
    'group_identifiers'?: Array<string>;
    'home_liveboard_identifier'?: string;
    'favorite_metadata'?: Array<FavoriteMetadataInput>;
    'org_identifiers'?: Array<string>;
    'operation'?: UpdateUserRequestOperationEnum;
    'preferred_locale'?: UpdateUserRequestPreferredLocaleEnum;
    'extended_properties'?: any;
    'extended_preferences'?: any;
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
export type UpdateUserRequestPreferredLocaleEnum = "en-CA" | "en-GB" | "en-US" | "de-DE" | "ja-JP" | "zh-CN" | "pt-BR" | "fr-FR" | "fr-CA" | "es-US" | "da-DK" | "es-ES" | "fi-FI" | "sv-SE" | "nb-NO" | "pt-PT" | "nl-NL" | "it-IT" | "ru-RU" | "en-IN";
