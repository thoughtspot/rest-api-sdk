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

import { SharePermissionsInput } from '../models/SharePermissionsInput';
import { HttpFile } from '../http/http';

export class ShareMetadataRequest {
    /**
    * Type of metadata. 1. Liveboard 2. Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view.
    */
    'metadataType': ShareMetadataRequestMetadataTypeEnum;
    /**
    * Unique ID or name of metadata objects.
    */
    'metadataIdentifiers': Array<string>;
    /**
    * Permission details for sharing the objects.
    */
    'permissions': Array<SharePermissionsInput>;
    /**
    * Options to specify details of Liveboard.
    */
    'visualizationIdentifiers'?: Array<string>;
    /**
    * Email IDs to which notifications will be sent.
    */
    'emails': Array<string>;
    /**
    * Message to be included in notification.
    */
    'message': string;
    /**
    * Sends object URLs in the customized format in email notifications.
    */
    'enableCustomUrl'?: boolean | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "metadataType",
            "baseName": "metadata_type",
            "type": "ShareMetadataRequestMetadataTypeEnum",
            "format": ""
        },
        {
            "name": "metadataIdentifiers",
            "baseName": "metadata_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "permissions",
            "baseName": "permissions",
            "type": "Array<SharePermissionsInput>",
            "format": ""
        },
        {
            "name": "visualizationIdentifiers",
            "baseName": "visualization_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "emails",
            "baseName": "emails",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "message",
            "baseName": "message",
            "type": "string",
            "format": ""
        },
        {
            "name": "enableCustomUrl",
            "baseName": "enable_custom_url",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ShareMetadataRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export type ShareMetadataRequestMetadataTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" ;

