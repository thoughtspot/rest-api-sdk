import { ExcludeMetadataListItemInput } from '../models/ExcludeMetadataListItemInput';
import { FavoriteObjectOptionsInput } from '../models/FavoriteObjectOptionsInput';
import { MetadataListItemInput } from '../models/MetadataListItemInput';
import { MetadataSearchSortOptions } from '../models/MetadataSearchSortOptions';
import { PermissionInput } from '../models/PermissionInput';
export declare class SearchMetadataRequest {
    'metadata'?: Array<MetadataListItemInput>;
    'permissions'?: Array<PermissionInput>;
    'created_by_user_identifiers'?: Array<string>;
    'dependent_object_version'?: SearchMetadataRequestDependentObjectVersionEnum;
    'exclude_objects'?: Array<ExcludeMetadataListItemInput>;
    'favorite_object_options'?: FavoriteObjectOptionsInput;
    'include_auto_created_objects'?: boolean | null;
    'include_dependent_objects'?: boolean | null;
    'include_details'?: boolean | null;
    'include_headers'?: boolean | null;
    'include_hidden_objects'?: boolean | null;
    'include_incomplete_objects'?: boolean | null;
    'include_visualization_headers'?: boolean | null;
    'include_worksheet_search_assist_data'?: boolean | null;
    'modified_by_user_identifiers'?: Array<string>;
    'record_offset'?: number;
    'record_size'?: number;
    'sort_options'?: MetadataSearchSortOptions;
    'tag_identifiers'?: Array<string>;
    'include_stats'?: boolean | null;
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
export type SearchMetadataRequestDependentObjectVersionEnum = "V1" | "V2";
