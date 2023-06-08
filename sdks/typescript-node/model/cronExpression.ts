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

/**
* Schedule selected cron expression.
*/
export class CronExpression {
    /**
    * Day of month of the object.
    */
    'dayOfMonth': string;
    /**
    * Day of Week of the object.
    */
    'dayOfWeek': string;
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

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "dayOfMonth",
            "baseName": "day_of_month",
            "type": "string"
        },
        {
            "name": "dayOfWeek",
            "baseName": "day_of_week",
            "type": "string"
        },
        {
            "name": "hour",
            "baseName": "hour",
            "type": "string"
        },
        {
            "name": "minute",
            "baseName": "minute",
            "type": "string"
        },
        {
            "name": "month",
            "baseName": "month",
            "type": "string"
        },
        {
            "name": "second",
            "baseName": "second",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CronExpression.attributeTypeMap;
    }
}

