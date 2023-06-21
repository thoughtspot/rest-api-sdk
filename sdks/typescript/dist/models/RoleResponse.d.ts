import { GenericInfo } from '../models/GenericInfo';
export declare class RoleResponse {
    'id': string;
    'name': string;
    'description': string;
    'groupsAssignedCount'?: number;
    'orgs'?: Array<GenericInfo>;
    'groups'?: Array<GenericInfo>;
    'privileges': Array<RoleResponsePrivilegesEnum>;
    'permission'?: RoleResponsePermissionEnum;
    'authorId'?: string;
    'modifierId'?: string;
    'creationTimeInMillis'?: any;
    'modificationTimeInMillis'?: any;
    'deleted'?: boolean;
    'deprecated'?: boolean;
    'external'?: boolean;
    'hidden'?: boolean;
    'sharedViaConnection'?: boolean;
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
export type RoleResponsePrivilegesEnum = "USERDATAUPLOADING" | "DATADOWNLOADING" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "DISABLE_PINBOARD_CREATION" | "DEVELOPER" | "APPLICATION_ADMINISTRATION" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "SYNCMANAGEMENT" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION";
export type RoleResponsePermissionEnum = "READ_ONLY" | "MODIFY" | "NO_ACCESS";
