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

import { PrincipalsListItemInput } from '../models/PrincipalsListItemInput';
import { HttpFile } from '../http/http';

/**
* Recipients of the scheduled job notifications. Add the GUID or name of the ThoughtSpot users or groups as recipients in the `principals` array. If a recipient is not a ThoughtSpot user, specify email address.
*/
export class CreateScheduleRequestRecipientDetails {
    /**
    * Emails of the recipients.
    */
    'emails'?: Array<string> | null;
    /**
    * User or groups to be set as recipients of the schedule notifications.
    */
    'principals'?: Array<PrincipalsListItemInput> | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "emails",
            "baseName": "emails",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "principals",
            "baseName": "principals",
            "type": "Array<PrincipalsListItemInput>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CreateScheduleRequestRecipientDetails.attributeTypeMap;
    }

    public constructor() {
    }
}
