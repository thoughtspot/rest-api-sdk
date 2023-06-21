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

export class SystemConfig {
    'onboardingContentUrl'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "onboardingContentUrl",
            "baseName": "onboarding_content_url",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SystemConfig.attributeTypeMap;
    }

    public constructor() {
    }
}

