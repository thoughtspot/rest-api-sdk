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

import { ShareMetadataTypeInput } from '../models/ShareMetadataTypeInput';
import { SharePermissionsInput } from '../models/SharePermissionsInput';
import { HttpFile } from '../http/http';

export class ShareMetadataRequest {
    /**
    * Type of metadata. Required if identifier in metadata_identifies is a name. 1. Liveboard 2. Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view.
    */
    'metadata_type'?: ShareMetadataRequestMetadataTypeEnum;
    /**
    * Unique ID or name of metadata objects. Note: All the names should belong to same metadata_type
    */
    'metadata_identifiers'?: Array<string>;
    /**
    * Metadata details for sharing objects.
    */
    'metadata'?: Array<ShareMetadataTypeInput>;
    /**
    * Permission details for sharing the objects.
    */
    'permissions': Array<SharePermissionsInput>;
    /**
    * Options to specify details of Liveboard. First Liveboard encountered in payload is considered to be the corresponding Liveboard.
    */
    'visualization_identifiers'?: Array<string>;
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
    'enable_custom_url'?: boolean | null;
    /**
    * Flag to notify user when any object is shared.
    */
    'notify_on_share'?: boolean | null;
    /**
    * Flag to make the object discoverable.
    */
    'has_lenient_discoverability'?: boolean | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "metadata_type",
            "baseName": "metadata_type",
            "type": "ShareMetadataRequestMetadataTypeEnum",
            "format": ""
        },
        {
            "name": "metadata_identifiers",
            "baseName": "metadata_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "Array<ShareMetadataTypeInput>",
            "format": ""
        },
        {
            "name": "permissions",
            "baseName": "permissions",
            "type": "Array<SharePermissionsInput>",
            "format": ""
        },
        {
            "name": "visualization_identifiers",
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
            "name": "enable_custom_url",
            "baseName": "enable_custom_url",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "notify_on_share",
            "baseName": "notify_on_share",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "has_lenient_discoverability",
            "baseName": "has_lenient_discoverability",
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

