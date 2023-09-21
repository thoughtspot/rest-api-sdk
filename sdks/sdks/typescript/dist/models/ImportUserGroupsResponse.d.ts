import { UserGroup } from '../models/UserGroup';
export declare class ImportUserGroupsResponse {
    'groups_added': Array<UserGroup>;
    'groups_deleted': Array<UserGroup>;
    'groups_updated': Array<UserGroup>;
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
