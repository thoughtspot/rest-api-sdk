/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for UpdateUserStateEnum
 */
export enum UpdateUserStateEnum {
  ACTIVE = 'ACTIVE',
  INACTIVE = 'INACTIVE',
  EXPIRED = 'EXPIRED',
  LOCKED = 'LOCKED',
  PENDING = 'PENDING',
}

/**
 * Schema for UpdateUserStateEnum
 */
export const updateUserStateEnumSchema: Schema<UpdateUserStateEnum> = stringEnum(UpdateUserStateEnum);
