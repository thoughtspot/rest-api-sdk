/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';
import { SharePermissionsInput } from './sharePermissionsInput';

export class ShareMetadataRequest {
    /**
    * Type of metadata. 1. Liveboard 2. Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view.
    */
    'metadataType': ShareMetadataRequest.MetadataTypeEnum;
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
    'enableCustomUrl'?: boolean | null = false;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "metadataType",
            "baseName": "metadata_type",
            "type": "ShareMetadataRequest.MetadataTypeEnum"
        },
        {
            "name": "metadataIdentifiers",
            "baseName": "metadata_identifiers",
            "type": "Array<string>"
        },
        {
            "name": "permissions",
            "baseName": "permissions",
            "type": "Array<SharePermissionsInput>"
        },
        {
            "name": "visualizationIdentifiers",
            "baseName": "visualization_identifiers",
            "type": "Array<string>"
        },
        {
            "name": "emails",
            "baseName": "emails",
            "type": "Array<string>"
        },
        {
            "name": "message",
            "baseName": "message",
            "type": "string"
        },
        {
            "name": "enableCustomUrl",
            "baseName": "enable_custom_url",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return ShareMetadataRequest.attributeTypeMap;
    }
}

export namespace ShareMetadataRequest {
    export enum MetadataTypeEnum {
        Liveboard = <any> 'LIVEBOARD',
        Answer = <any> 'ANSWER',
        LogicalTable = <any> 'LOGICAL_TABLE'
    }
}
