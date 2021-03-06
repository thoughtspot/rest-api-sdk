/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for ShareObjectTypeEnum
 */
export enum ShareObjectTypeEnum {
  LIVEBOARD = 'LIVEBOARD',
  ANSWER = 'ANSWER',
  DATAOBJECT = 'DATAOBJECT',
  COLUMN = 'COLUMN',
}

/**
 * Schema for ShareObjectTypeEnum
 */
export const shareObjectTypeEnumSchema: Schema<ShareObjectTypeEnum> = stringEnum(ShareObjectTypeEnum);
