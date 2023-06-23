import { GroupsImportListInput } from '../models/GroupsImportListInput';
export declare class ImportUserGroupsRequest {
    'groups'?: Array<GroupsImportListInput>;
    'deleteUnspecifiedGroups'?: boolean | null;
    'dryRun'?: boolean | null;
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
