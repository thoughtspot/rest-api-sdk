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

/**
* Options for PDF export.
*/
export class UpdateScheduleRequestPdfOptions {
    /**
    * Indicates whether to include complete Liveboard.
    */
    'complete_liveboard'?: boolean | null;
    /**
    * Indicates whether to include cover page with the Liveboard title.
    */
    'include_cover_page'?: boolean | null;
    /**
    * Indicates whether to include customized wide logo in the footer if available.
    */
    'include_custom_logo'?: boolean | null;
    /**
    * Indicates whether to include a page with all applied filters.
    */
    'include_filter_page'?: boolean | null;
    /**
    * Indicates whether to include page number in the footer of each page
    */
    'include_page_number'?: boolean | null;
    /**
    * Text to include in the footer of each page.
    */
    'page_footer_text'?: string | null;
    /**
    * Page orientation of the PDF.
    */
    'page_orientation'?: string | null;
    /**
    * Page size.
    */
    'page_size'?: UpdateScheduleRequestPdfOptionsPageSizeEnum | null;
    /**
    * Indicates whether to include only first page of the tables.
    */
    'truncate_table'?: boolean | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "complete_liveboard",
            "baseName": "complete_liveboard",
            "type": "boolean",
            "format": ""
        },
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
            "name": "page_footer_text",
            "baseName": "page_footer_text",
            "type": "string",
            "format": ""
        },
        {
            "name": "page_orientation",
            "baseName": "page_orientation",
            "type": "string",
            "format": ""
        },
        {
            "name": "page_size",
            "baseName": "page_size",
            "type": "UpdateScheduleRequestPdfOptionsPageSizeEnum",
            "format": ""
        },
        {
            "name": "truncate_table",
            "baseName": "truncate_table",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return UpdateScheduleRequestPdfOptions.attributeTypeMap;
    }

    public constructor() {
    }
}


export type UpdateScheduleRequestPdfOptionsPageSizeEnum = "A4" ;
