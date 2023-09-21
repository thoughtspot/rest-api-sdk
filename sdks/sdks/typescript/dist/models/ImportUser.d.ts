import { FavoriteMetadataInput } from '../models/FavoriteMetadataInput';
export declare class ImportUser {
    'user_identifier': string;
    'display_name': string;
    'password'?: string;
    'account_type'?: ImportUserAccountTypeEnum;
    'account_status'?: ImportUserAccountStatusEnum;
    'email'?: string;
    'org_identifiers'?: Array<string>;
    'group_identifiers'?: Array<string>;
    'visibility'?: ImportUserVisibilityEnum;
    'notify_on_share'?: boolean;
    'show_onboarding_experience'?: boolean;
    'onboarding_experience_completed'?: boolean;
    'home_liveboard_identifier'?: string;
    'favorite_metadata'?: Array<FavoriteMetadataInput>;
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
