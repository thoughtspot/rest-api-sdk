/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for SearchUsersVisibilityEnum
 */
export enum SearchUsersVisibilityEnum {
  DEFAULT = 'DEFAULT',
  NONSHARABLE = 'NON_SHARABLE',
  SHARABLE = 'SHARABLE',
}

/**
 * Schema for SearchUsersVisibilityEnum
 */
export const searchUsersVisibilityEnumSchema: Schema<SearchUsersVisibilityEnum> = stringEnum(SearchUsersVisibilityEnum);
