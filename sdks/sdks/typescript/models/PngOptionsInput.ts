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

import { HttpFile } from '../http/http';

export class PngOptionsInput {
    /**
    * Indicates whether to include cover page with the Liveboard title.
    */
    'includeCoverPage'?: boolean;
    /**
    * Indicates whether to include a page with all applied filters.
    */
    'includeFilterPage'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "includeCoverPage",
            "baseName": "include_cover_page",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "includeFilterPage",
            "baseName": "include_filter_page",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return PngOptionsInput.attributeTypeMap;
    }

    public constructor() {
    }
}

