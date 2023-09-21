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

export class PdfOptionsInput {
    /**
    * Indicates whether to include the cover page with the Liveboard title.
    */
    'include_cover_page'?: boolean;
    /**
    * Indicates whether to include customized wide logo in the footer if available.
    */
    'include_custom_logo'?: boolean;
    /**
    * Indicates whether to include a page with all applied filters.
    */
    'include_filter_page'?: boolean;
    /**
    * Indicates whether to include page number in the footer of each page.
    */
    'include_page_number'?: boolean;
    /**
    * Page orientation of the PDF.
    */
    'page_orientation'?: PdfOptionsInputPageOrientationEnum;
    /**
    * Indicates whether to include only the first page of the tables.
    */
    'truncate_table'?: boolean;
    /**
    * Text to include in the footer of each page.
    */
    'page_footer_text'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "include_cover_page",
            "baseName": "include_cover_page",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_custom_logo",
            "baseName": "include_custom_logo",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_filter_page",
            "baseName": "include_filter_page",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_page_number",
            "baseName": "include_page_number",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "page_orientation",
            "baseName": "page_orientation",
            "type": "PdfOptionsInputPageOrientationEnum",
            "format": ""
        },
        {
            "name": "truncate_table",
            "baseName": "truncate_table",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "page_footer_text",
            "baseName": "page_footer_text",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return PdfOptionsInput.attributeTypeMap;
    }

    public constructor() {
    }
}


export type PdfOptionsInputPageOrientationEnum = "PORTRAIT" | "LANDSCAPE" ;

