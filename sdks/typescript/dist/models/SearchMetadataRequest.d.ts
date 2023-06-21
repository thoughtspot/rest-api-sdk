import { ExcludeMetadataListItemInput } from '../models/ExcludeMetadataListItemInput';
import { FavoriteObjectOptionsInput } from '../models/FavoriteObjectOptionsInput';
import { MetadataListItemInput } from '../models/MetadataListItemInput';
import { MetadataSearchSortOptions } from '../models/MetadataSearchSortOptions';
import { PermissionInput } from '../models/PermissionInput';
export declare class SearchMetadataRequest {
    'metadata'?: Array<MetadataListItemInput>;
    'permissions'?: Array<PermissionInput>;
    'createdByUserIdentifiers'?: Array<string>;
    'dependentObjectVersion'?: SearchMetadataRequestDependentObjectVersionEnum;
    'excludeObjects'?: Array<ExcludeMetadataListItemInput>;
    'favoriteObjectOptions'?: FavoriteObjectOptionsInput;
    'includeAutoCreatedObjects'?: boolean | null;
    'includeDependentObjects'?: boolean | null;
    'includeDetails'?: boolean | null;
    'includeHeaders'?: boolean | null;
    'includeHiddenObjects'?: boolean | null;
    'includeIncompleteObjects'?: boolean | null;
    'includeVisualizationHeaders'?: boolean | null;
    'includeWorksheetSearchAssistData'?: boolean | null;
    'modifiedByUserIdentifiers'?: Array<string>;
    'recordOffset'?: number;
    'recordSize'?: number;
    'sortOptions'?: MetadataSearchSortOptions;
    'tagIdentifiers'?: Array<string>;
    'includeStats'?: boolean | null;
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
