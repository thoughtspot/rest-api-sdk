import { ImportUserType } from '../models/ImportUserType';
export declare class ImportUsersResponse {
    'usersAdded'?: Array<ImportUserType>;
    'usersUpdated'?: Array<ImportUserType>;
    'usersDeleted'?: Array<ImportUserType>;
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
