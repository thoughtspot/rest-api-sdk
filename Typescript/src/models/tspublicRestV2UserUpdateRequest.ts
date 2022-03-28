/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, lazy, object, optional, Schema, string } from '../schema';
import {
  AnalystOnboardingCompleteEnum,
  analystOnboardingCompleteEnumSchema,
} from './analystOnboardingCompleteEnum';
import {
  GroupNameAndIDInput,
  groupNameAndIDInputSchema,
} from './groupNameAndIDInput';
import {
  NotifyOnShareEnum,
  notifyOnShareEnumSchema,
} from './notifyOnShareEnum';
import { ShowWalkMeEnum, showWalkMeEnumSchema } from './showWalkMeEnum';
import { StateEnum, stateEnumSchema } from './stateEnum';
import { Type4Enum, type4EnumSchema } from './type4Enum';
import { Visibility1Enum, visibility1EnumSchema } from './visibility1Enum';

export interface TspublicRestV2UserUpdateRequest {
  /** Name of the user account. The username string must be unique. */
  name?: string;
  /** The GUID of the user account */
  id?: string;
  /** A display name string for the user, usually their first and last name. */
  displayName?: string;
  /**
   * Visibility of the user account.
   *  The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and thus allows them to share objects.
   */
  visibility?: Visibility1Enum;
  /** Email id associated with the user account */
  mail?: string;
  /** Status of user account. acitve or inactive. */
  state?: StateEnum;
  /** User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards. */
  notifyOnShare?: NotifyOnShareEnum;
  /** The user preference for revisiting the onboarding experience. */
  showWalkMe?: ShowWalkMeEnum;
  /**
   * ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly.
   *  The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI.
   */
  analystOnboardingComplete?: AnalystOnboardingCompleteEnum;
  /** Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system. */
  type?: Type4Enum;
  /** A JSON array of group names or GUIDs or both. When both are given then id is considered */
  groups?: GroupNameAndIDInput[];
}

export const tspublicRestV2UserUpdateRequestSchema: Schema<TspublicRestV2UserUpdateRequest> = object(
  {
    name: ['name', optional(string())],
    id: ['id', optional(string())],
    displayName: ['displayName', optional(string())],
    visibility: ['visibility', optional(visibility1EnumSchema)],
    mail: ['mail', optional(string())],
    state: ['state', optional(stateEnumSchema)],
    notifyOnShare: ['notifyOnShare', optional(notifyOnShareEnumSchema)],
    showWalkMe: ['showWalkMe', optional(showWalkMeEnumSchema)],
    analystOnboardingComplete: [
      'analystOnboardingComplete',
      optional(analystOnboardingCompleteEnumSchema),
    ],
    type: ['type', optional(type4EnumSchema)],
    groups: ['groups', optional(array(lazy(() => groupNameAndIDInputSchema)))],
  }
);
