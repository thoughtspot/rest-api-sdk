/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, lazy, object, optional, Schema, string } from '../schema';
import {
  GroupNameAndIDInput,
  groupNameAndIDInputSchema,
} from './groupNameAndIDInput';
import { PrivilegeEnum, privilegeEnumSchema } from './privilegeEnum';
import {
  UserNameAndIDInput,
  userNameAndIDInputSchema,
} from './userNameAndIDInput';

export interface TspublicRestV2GroupSearchRequest {
  /** Array of field names that need to be included in the response */
  outputFields?: string[];
  /** Name of the user group */
  name?: string;
  /** GUID of the group to update */
  id?: string;
  /** A unique display name string for the user group, for example, Developer group. */
  displayName?: string;
  /** Visibility of the user group. The visibility attribute is set to DEFAULT. The DEFAULT attribute makes the user group visible for other user groups and allows them to share objects. */
  visibility?: string;
  /** Description text for the group. */
  description?: string;
  /** A JSON array of privileges assigned to the group */
  privileges?: PrivilegeEnum[];
  /** Array of objects of groups that the user belong to. */
  groups?: GroupNameAndIDInput[];
  /** Array of user name that associated with group. */
  users?: UserNameAndIDInput[];
  /** Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system. */
  type?: string;
}

export const tspublicRestV2GroupSearchRequestSchema: Schema<TspublicRestV2GroupSearchRequest> = object(
  {
    outputFields: ['outputFields', optional(array(string()))],
    name: ['name', optional(string())],
    id: ['id', optional(string())],
    displayName: ['displayName', optional(string())],
    visibility: ['visibility', optional(string())],
    description: ['description', optional(string())],
    privileges: ['privileges', optional(array(privilegeEnumSchema))],
    groups: ['groups', optional(array(lazy(() => groupNameAndIDInputSchema)))],
    users: ['users', optional(array(lazy(() => userNameAndIDInputSchema)))],
    type: ['type', optional(string())],
  }
);