import { AuthorType } from '../models/AuthorType';
import { CommitFileType } from '../models/CommitFileType';
import { CommiterType } from '../models/CommiterType';
export declare class CommitResponse {
    'committer'?: CommiterType;
    'author'?: AuthorType;
    'comment'?: string;
    'commitTime'?: string;
    'commitId'?: string;
    'branch'?: string;
    'committedFiles'?: Array<CommitFileType>;
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
