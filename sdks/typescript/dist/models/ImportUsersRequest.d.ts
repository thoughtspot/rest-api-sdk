import { ImportUser } from '../models/ImportUser';
export declare class ImportUsersRequest {
    'users': Array<ImportUser>;
    'default_password'?: string;
    'dry_run'?: boolean | null;
    'delete_unspecified_users'?: boolean | null;
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
