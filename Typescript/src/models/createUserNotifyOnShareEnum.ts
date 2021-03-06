/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for CreateUserNotifyOnShareEnum
 */
export enum CreateUserNotifyOnShareEnum {
  True = 'true',
  False = 'false',
}

/**
 * Schema for CreateUserNotifyOnShareEnum
 */
export const createUserNotifyOnShareEnumSchema: Schema<CreateUserNotifyOnShareEnum> = stringEnum(CreateUserNotifyOnShareEnum);
