import { UserGroup } from '../models/UserGroup';
export declare class ImportUserGroupsResponse {
    'groupsAdded': Array<UserGroup>;
    'groupsDeleted': Array<UserGroup>;
    'groupsUpdated': Array<UserGroup>;
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
