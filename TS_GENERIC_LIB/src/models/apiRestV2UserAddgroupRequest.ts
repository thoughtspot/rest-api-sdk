/**
 * TS Public RestAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, object, optional, Schema, string } from '../schema';

export interface ApiRestV2UserAddgroupRequest {
  /** User name of the user account */
  name?: string;
  /** The GUID of the user account */
  id?: string;
  /** A JSON array of group names */
  groupNames?: string[];
}

export const apiRestV2UserAddgroupRequestSchema: Schema<ApiRestV2UserAddgroupRequest> = object(
  {
    name: ['name', optional(string())],
    id: ['id', optional(string())],
    groupNames: ['groupNames', optional(array(string()))],
  }
);
