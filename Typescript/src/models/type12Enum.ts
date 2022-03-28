/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for Type12Enum
 */
export enum Type12Enum {
  ANSWER = 'ANSWER',
  LIVEBOARD = 'LIVEBOARD',
  DATAOBJECT = 'DATAOBJECT',
  COLUMN = 'COLUMN',
  JOIN = 'JOIN',
  CONNECTION = 'CONNECTION',
  TAG = 'TAG',
  USER = 'USER',
  USERGROUP = 'USER_GROUP',
}

/**
 * Schema for Type12Enum
 */
export const type12EnumSchema: Schema<Type12Enum> = stringEnum(Type12Enum);
