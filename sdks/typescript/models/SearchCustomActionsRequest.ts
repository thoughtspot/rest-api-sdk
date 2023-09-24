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

import { CustomActionMetadataTypeInput } from '../models/CustomActionMetadataTypeInput';
import { DefaultActionConfigSearchInput } from '../models/DefaultActionConfigSearchInput';
import { HttpFile } from '../http/http';

export class SearchCustomActionsRequest {
    /**
    * Name or ID of the custom action.
    */
    'custom_action_identifier'?: string;
    /**
    * A pattern to match case-insensitive name of the custom-action object.
    */
    'name_pattern'?: string;
    'default_action_config'?: DefaultActionConfigSearchInput;
    /**
    * When set to true, returns the associated groups for a custom action.
    */
    'include_group_associations'?: boolean | null;
    /**
    * When set to true, returns the associated metadata for a custom action.
    */
    'include_metadata_associations'?: boolean | null;
    /**
    * Search with a given metadata identifier.
    */
    'metadata'?: Array<CustomActionMetadataTypeInput>;
    /**
    * Filter the action objects based on type
    */
    'type'?: SearchCustomActionsRequestTypeEnum;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "custom_action_identifier",
            "baseName": "custom_action_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "name_pattern",
            "baseName": "name_pattern",
            "type": "string",
            "format": ""
        },
        {
            "name": "default_action_config",
            "baseName": "default_action_config",
            "type": "DefaultActionConfigSearchInput",
            "format": ""
        },
        {
            "name": "include_group_associations",
            "baseName": "include_group_associations",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_metadata_associations",
            "baseName": "include_metadata_associations",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "Array<CustomActionMetadataTypeInput>",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "SearchCustomActionsRequestTypeEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SearchCustomActionsRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type SearchCustomActionsRequestTypeEnum = "CALLBACK" | "URL" ;

