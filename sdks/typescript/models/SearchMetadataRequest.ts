/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { ExcludeMetadataListItemInput } from '../models/ExcludeMetadataListItemInput';
import { FavoriteObjectOptionsInput } from '../models/FavoriteObjectOptionsInput';
import { MetadataListItemInput } from '../models/MetadataListItemInput';
import { MetadataSearchSortOptions } from '../models/MetadataSearchSortOptions';
import { PermissionInput } from '../models/PermissionInput';
import { HttpFile } from '../http/http';

export class SearchMetadataRequest {
    /**
    * Metadata objects such as Liveboards, Answers, and Worksheets.
    */
    'metadata'?: Array<MetadataListItemInput>;
    /**
    * Object permission details to search by.
    */
    'permissions'?: Array<PermissionInput>;
    /**
    * GUID or name of user who created the metadata object.
    */
    'created_by_user_identifiers'?: Array<string>;
    /**
    * Version of the dependent table of the metadata objects like Worksheets.
    */
    'dependent_object_version'?: SearchMetadataRequestDependentObjectVersionEnum;
    /**
    * List of metadata objects to exclude from search.
    */
    'exclude_objects'?: Array<ExcludeMetadataListItemInput>;
    'favorite_object_options'?: FavoriteObjectOptionsInput;
    /**
    * Includes system-generated metadata objects.
    */
    'include_auto_created_objects'?: boolean | null;
    /**
    * Includes dependents of the metadata object specified in the API request. For example, a worksheet can consist of dependent objects such as Liveboards or Answers.
    */
    'include_dependent_objects'?: boolean | null;
    /**
    * The maximum number of dependents to include per metadata object.
    */
    'dependent_objects_record_size'?: number;
    /**
    * Includes complete details of the metadata objects.
    */
    'include_details'?: boolean | null;
    /**
    * Includes headers of the metadata objects.
    */
    'include_headers'?: boolean | null;
    /**
    * Includes details of the hidden objects, such as a column in a worksheet or a table.
    */
    'include_hidden_objects'?: boolean | null;
    /**
    * Includes objects with incomplete metadata.
    */
    'include_incomplete_objects'?: boolean | null;
    /**
    * Includes visualization headers of the specified Liveboard object.
    */
    'include_visualization_headers'?: boolean | null;
    /**
    * If search assistance lessons are configured on a worksheet, the API returns the search assist data for Worksheet objects.
    */
    'include_worksheet_search_assist_data'?: boolean | null;
    /**
    * Includes ID or names of the users who modified the metadata object.
    */
    'modified_by_user_identifiers'?: Array<string>;
    /**
    * The starting record number from where the records should be included.
    */
    'record_offset'?: number;
    /**
    * The number of records that should be included.
    */
    'record_size'?: number;
    'sort_options'?: MetadataSearchSortOptions;
    /**
    * Tags to filter metadata objects by
    */
    'tag_identifiers'?: Array<string>;
    /**
    * Indicates whether to include stats of the metadata objects.
    */
    'include_stats'?: boolean | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "Array<MetadataListItemInput>",
            "format": ""
        },
        {
            "name": "permissions",
            "baseName": "permissions",
            "type": "Array<PermissionInput>",
            "format": ""
        },
        {
            "name": "created_by_user_identifiers",
            "baseName": "created_by_user_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "dependent_object_version",
            "baseName": "dependent_object_version",
            "type": "SearchMetadataRequestDependentObjectVersionEnum",
            "format": ""
        },
        {
            "name": "exclude_objects",
            "baseName": "exclude_objects",
            "type": "Array<ExcludeMetadataListItemInput>",
            "format": ""
        },
        {
            "name": "favorite_object_options",
            "baseName": "favorite_object_options",
            "type": "FavoriteObjectOptionsInput",
            "format": ""
        },
        {
            "name": "include_auto_created_objects",
            "baseName": "include_auto_created_objects",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_dependent_objects",
            "baseName": "include_dependent_objects",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "dependent_objects_record_size",
            "baseName": "dependent_objects_record_size",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "include_details",
            "baseName": "include_details",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_headers",
            "baseName": "include_headers",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_hidden_objects",
            "baseName": "include_hidden_objects",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_incomplete_objects",
            "baseName": "include_incomplete_objects",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_visualization_headers",
            "baseName": "include_visualization_headers",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_worksheet_search_assist_data",
            "baseName": "include_worksheet_search_assist_data",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "modified_by_user_identifiers",
            "baseName": "modified_by_user_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "record_offset",
            "baseName": "record_offset",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "record_size",
            "baseName": "record_size",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "sort_options",
            "baseName": "sort_options",
            "type": "MetadataSearchSortOptions",
            "format": ""
        },
        {
            "name": "tag_identifiers",
            "baseName": "tag_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "include_stats",
            "baseName": "include_stats",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SearchMetadataRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type SearchMetadataRequestDependentObjectVersionEnum = "V1" | "V2" ;

