/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';
import {
  SearchOrgsShowDeletedEnum,
  searchOrgsShowDeletedEnumSchema,
} from './searchOrgsShowDeletedEnum';

export interface TspublicRestV2OrgSearchRequest {
  /** Name of the organization. */
  name?: string;
  /** The ID of the organization. */
  id?: string;
  /** When set to true, the response will include the details of deleted organization also. */
  showDeleted?: SearchOrgsShowDeletedEnum;
}

export const tspublicRestV2OrgSearchRequestSchema: Schema<TspublicRestV2OrgSearchRequest> = object(
  {
    name: ['name', optional(string())],
    id: ['id', optional(string())],
    showDeleted: ['showDeleted', optional(searchOrgsShowDeletedEnumSchema)],
  }
);
