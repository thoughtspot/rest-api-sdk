/**
 * TS Public RestAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for NotifyOnShareEnum
 */
export enum NotifyOnShareEnum {
  True = 'true',
  False = 'false',
}

/**
 * Schema for NotifyOnShareEnum
 */
export const notifyOnShareEnumSchema: Schema<NotifyOnShareEnum> = stringEnum(NotifyOnShareEnum);