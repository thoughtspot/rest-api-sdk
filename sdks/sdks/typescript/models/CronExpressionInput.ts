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
* Schedule selected cron expression.
*/
export class CronExpressionInput {
    /**
    * Day of month of the object.
    */
    'day_of_month': string;
    /**
    * Day of Week of the object.
    */
    'day_of_week': string;
    /**
    * Hour of the object.
    */
    'hour': string;
    /**
    * Minute of the object.
    */
    'minute': string;
    /**
    * Month of the object.
    */
    'month': string;
    /**
    * Second of the object.
    */
    'second': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "day_of_month",
            "baseName": "day_of_month",
            "type": "string",
            "format": ""
        },
        {
            "name": "day_of_week",
            "baseName": "day_of_week",
            "type": "string",
            "format": ""
        },
        {
            "name": "hour",
            "baseName": "hour",
            "type": "string",
            "format": ""
        },
        {
            "name": "minute",
            "baseName": "minute",
            "type": "string",
            "format": ""
        },
        {
            "name": "month",
            "baseName": "month",
            "type": "string",
            "format": ""
        },
        {
            "name": "second",
            "baseName": "second",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CronExpressionInput.attributeTypeMap;
    }

    public constructor() {
    }
}

