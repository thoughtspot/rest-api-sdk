import { AuthorType } from '../models/AuthorType';
import { CommiterType } from '../models/CommiterType';
export declare class CommitHistoryResponse {
    'committer': CommiterType;
    'author': AuthorType;
    'comment': string;
    'commitTime': string;
    'commitId': string;
    'branch': string;
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
