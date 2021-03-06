/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

/**
 * This is applicable only if organization feature is enabled in the cluster.
 * A JSON object of organization name, id or both, in which the object should be created. When both are given then id is considered. If no value is provided then object will be created in the organization associated with the login session.
 */
export interface OrgInput {
  /** Name of the organization */
  name?: string;
  /** Id of the organization */
  id?: string;
}

export const orgInputSchema: Schema<OrgInput> = object({
  name: ['name', optional(string())],
  id: ['id', optional(string())],
});
