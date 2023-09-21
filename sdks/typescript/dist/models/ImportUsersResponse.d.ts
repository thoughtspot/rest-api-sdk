import { ImportUserType } from '../models/ImportUserType';
export declare class ImportUsersResponse {
    'users_added'?: Array<ImportUserType>;
    'users_updated'?: Array<ImportUserType>;
    'users_deleted'?: Array<ImportUserType>;
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
