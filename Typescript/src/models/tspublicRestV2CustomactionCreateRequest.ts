/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, Schema, string } from '../schema';

export interface TspublicRestV2CustomactionCreateRequest {
  /**
   * A JSON object with the key-value pair of configuration attributes
   *  Example:
   *  {"id":"3f7eac93-cce1-4ffc-b7a8-429353edbc6b","name":"unpkg test","version":"v2","type":"URL","detail":{"link":"https://unpkg.com ","function":"unpkg-test","authSelect":"BEARER","authToken":"asdfasadf3q4534534","encodeUser":"","apiKey":"X-API-KEY","apiValue":"","additionalUrlHeaders":"{\\"url_header1\\":{\\"id\\":\\"6a82908c-9328-40ff-b347-65adeda12f57\\",\\"key\\":\\"key1\\",\\"value\\":\\"value1\\"}}"},"actionAssociationMap":{"ANSWER":{"e4079d3f-ae71-4b0a-a70a-f17ecaf157a5":{"enabled":"true","context":"MENU"}}},"context":"NONE","availability":["GLOBAL"],"userGroupList":["d0326b56-ef23-4c8a-8327-a30e99bcc72b"]}
   */
  configuration: string;
}

export const tspublicRestV2CustomactionCreateRequestSchema: Schema<TspublicRestV2CustomactionCreateRequest> = object(
  { configuration: ['configuration', string()] }
);