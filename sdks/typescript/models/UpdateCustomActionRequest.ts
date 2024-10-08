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

import { AssociateMetadataInput } from '../models/AssociateMetadataInput';
import { UpdateCustomActionRequestActionDetails } from '../models/UpdateCustomActionRequestActionDetails';
import { UpdateCustomActionRequestDefaultActionConfig } from '../models/UpdateCustomActionRequestDefaultActionConfig';
import { HttpFile } from '../http/http';

export class UpdateCustomActionRequest {
    'action_details'?: UpdateCustomActionRequestActionDetails;
    /**
    * Metadata objects to which the custom action needs to be associated.
    */
    'associate_metadata'?: Array<AssociateMetadataInput>;
    'default_action_config'?: UpdateCustomActionRequestDefaultActionConfig;
    /**
    * Unique ID or name of the groups that can view and access the custom action.
    */
    'group_identifiers'?: Array<string>;
    /**
    * Name of the custom action. The custom action name must be unique.
    */
    'name'?: string;
    /**
    * Type of update operation. Default operation type is ADD
    */
    'operation'?: UpdateCustomActionRequestOperationEnum;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "action_details",
            "baseName": "action_details",
            "type": "UpdateCustomActionRequestActionDetails",
            "format": ""
        },
        {
            "name": "associate_metadata",
            "baseName": "associate_metadata",
            "type": "Array<AssociateMetadataInput>",
            "format": ""
        },
        {
            "name": "default_action_config",
            "baseName": "default_action_config",
            "type": "UpdateCustomActionRequestDefaultActionConfig",
            "format": ""
        },
        {
            "name": "group_identifiers",
            "baseName": "group_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "operation",
            "baseName": "operation",
            "type": "UpdateCustomActionRequestOperationEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return UpdateCustomActionRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type UpdateCustomActionRequestOperationEnum = "ADD" | "REMOVE" ;

