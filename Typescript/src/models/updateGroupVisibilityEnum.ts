/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for UpdateGroupVisibilityEnum
 */
export enum UpdateGroupVisibilityEnum {
  DEFAULT = 'DEFAULT',
  NONSHARABLE = 'NON_SHARABLE',
  SHARABLE = 'SHARABLE',
}

/**
 * Schema for UpdateGroupVisibilityEnum
 */
export const updateGroupVisibilityEnumSchema: Schema<UpdateGroupVisibilityEnum> = stringEnum(UpdateGroupVisibilityEnum);
