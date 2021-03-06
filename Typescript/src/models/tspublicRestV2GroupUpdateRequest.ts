/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, lazy, object, optional, Schema, string } from '../schema';
import {
  GroupNameAndIDInput,
  groupNameAndIDInputSchema,
} from './groupNameAndIDInput';
import {
  UpdateGroupPrivilegesEnum,
  updateGroupPrivilegesEnumSchema,
} from './updateGroupPrivilegesEnum';
import {
  UpdateGroupTypeEnum,
  updateGroupTypeEnumSchema,
} from './updateGroupTypeEnum';
import {
  UpdateGroupVisibilityEnum,
  updateGroupVisibilityEnumSchema,
} from './updateGroupVisibilityEnum';
import {
  UserNameAndIDInput,
  userNameAndIDInputSchema,
} from './userNameAndIDInput';

export interface TspublicRestV2GroupUpdateRequest {
  /** Name of the user group */
  name?: string;
  /** GUID of the group to update */
  id?: string;
  /** A unique display name string for the user group, for example, Developer group. */
  displayName?: string;
  /**
   * Visibility of the user group.
   *  The visibility attribute is set to DEFAULT. The DEFAULT attribute makes the user group visible for other user groups and allows them to share objects.
   */
  visibility?: UpdateGroupVisibilityEnum;
  /** Description text for the group. */
  description?: string;
  /** A JSON array of privileges assigned to the group */
  privileges?: UpdateGroupPrivilegesEnum[];
  /** A JSON array of group names or GUIDs or both. When both are given then id is considered */
  groups?: GroupNameAndIDInput[];
  /** A JSON array of name of users or GUIDs of users or both. When both are given then id is considered */
  users?: UserNameAndIDInput[];
  /** An array of liveboard ids to be assigned to the group. */
  assignedLiveboards?: string[];
  /** Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system. */
  type?: UpdateGroupTypeEnum;
}

export const tspublicRestV2GroupUpdateRequestSchema: Schema<TspublicRestV2GroupUpdateRequest> = object(
  {
    name: ['name', optional(string())],
    id: ['id', optional(string())],
    displayName: ['displayName', optional(string())],
    visibility: ['visibility', optional(updateGroupVisibilityEnumSchema)],
    description: ['description', optional(string())],
    privileges: [
      'privileges',
      optional(array(updateGroupPrivilegesEnumSchema)),
    ],
    groups: ['groups', optional(array(lazy(() => groupNameAndIDInputSchema)))],
    users: ['users', optional(array(lazy(() => userNameAndIDInputSchema)))],
    assignedLiveboards: ['assignedLiveboards', optional(array(string()))],
    type: ['type', optional(updateGroupTypeEnumSchema)],
  }
);
