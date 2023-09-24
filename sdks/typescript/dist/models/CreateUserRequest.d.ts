import { FavoriteMetadataInput } from '../models/FavoriteMetadataInput';
export declare class CreateUserRequest {
    'name': string;
    'display_name': string;
    'password': string;
    'email': string;
    'account_type'?: CreateUserRequestAccountTypeEnum;
    'account_status'?: CreateUserRequestAccountStatusEnum;
    'org_identifiers'?: Array<string>;
    'group_identifiers'?: Array<string>;
    'visibility'?: CreateUserRequestVisibilityEnum;
    'notify_on_share'?: boolean | null;
    'show_onboarding_experience'?: boolean | null;
    'onboarding_experience_completed'?: boolean | null;
    'home_liveboard_identifier'?: string;
    'favorite_metadata'?: Array<FavoriteMetadataInput>;
    'preferred_locale'?: CreateUserRequestPreferredLocaleEnum;
    'extended_properties'?: any;
    'extended_preferences'?: any;
    'trigger_welcome_email'?: boolean | null;
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
export type CreateUserRequestPreferredLocaleEnum = "en-CA" | "en-GB" | "en-US" | "de-DE" | "ja-JP" | "zh-CN" | "pt-BR" | "fr-FR" | "fr-CA" | "es-US" | "da-DK" | "es-ES" | "fi-FI" | "sv-SE" | "nb-NO" | "pt-PT" | "nl-NL" | "it-IT" | "ru-RU" | "en-IN";
