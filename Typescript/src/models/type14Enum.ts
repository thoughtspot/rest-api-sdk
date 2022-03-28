/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for Type14Enum
 */
export enum Type14Enum {
  LIVEBOARD = 'LIVEBOARD',
  DATAOBJECT = 'DATAOBJECT',
  COLUMN = 'COLUMN',
  JOIN = 'JOIN',
}

/**
 * Schema for Type14Enum
 */
export const type14EnumSchema: Schema<Type14Enum> = stringEnum(Type14Enum);
