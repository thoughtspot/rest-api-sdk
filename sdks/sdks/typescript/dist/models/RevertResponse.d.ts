import { AuthorType } from '../models/AuthorType';
import { CommitFileType } from '../models/CommitFileType';
import { CommiterType } from '../models/CommiterType';
import { RevertedMetadata } from '../models/RevertedMetadata';
export declare class RevertResponse {
    'committer'?: CommiterType;
    'author'?: AuthorType;
    'comment'?: string;
    'commit_time'?: string;
    'commit_id'?: string;
    'branch'?: string;
    'committed_files'?: Array<CommitFileType>;
    'reverted_metadata'?: Array<RevertedMetadata>;
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
