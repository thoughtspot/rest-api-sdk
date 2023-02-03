/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { boolean, number, object, optional, Schema, string } from '../schema';

export interface OrgsResponse {
  /** ID of the organization searched for */
  orgId?: number;
  /** Name of the organization searched for */
  orgName?: string;
  /** Description associated with the organization */
  description?: string;
  /** GUID of the ALL group in the organization */
  allGroupUserId?: string;
  /** GUID of the admin group in the organization */
  defaultAdminUserGroupId?: string;
  /** Indicates if the organization is active or not */
  active?: boolean;
}

export const orgsResponseSchema: Schema<OrgsResponse> = object({
  orgId: ['orgId', optional(number())],
  orgName: ['orgName', optional(string())],
  description: ['description', optional(string())],
  allGroupUserId: ['allGroupUserId', optional(string())],
  defaultAdminUserGroupId: ['defaultAdminUserGroupId', optional(string())],
  active: ['active', optional(boolean())],
});