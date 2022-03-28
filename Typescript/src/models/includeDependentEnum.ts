/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for IncludeDependentEnum
 */
export enum IncludeDependentEnum {
  True = 'true',
  False = 'false',
}

/**
 * Schema for IncludeDependentEnum
 */
export const includeDependentEnumSchema: Schema<IncludeDependentEnum> = stringEnum(IncludeDependentEnum);
