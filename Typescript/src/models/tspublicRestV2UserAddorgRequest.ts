/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, lazy, number, object, optional, Schema } from '../schema';
import {
  UserNameAndIDInput,
  userNameAndIDInputSchema,
} from './userNameAndIDInput';

export interface TspublicRestV2UserAddorgRequest {
  /** The ID of the organization. */
  orgId?: number;
  /** Array of objects. A JSON array of name of users or GUIDs of users or both. When both are given then id is considered */
  users: UserNameAndIDInput[];
}

export const tspublicRestV2UserAddorgRequestSchema: Schema<TspublicRestV2UserAddorgRequest> = object(
  {
    orgId: ['orgId', optional(number())],
    users: ['users', array(lazy(() => userNameAndIDInputSchema))],
  }
);