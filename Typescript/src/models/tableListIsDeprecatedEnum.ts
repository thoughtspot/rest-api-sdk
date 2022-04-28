/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for TableListIsDeprecatedEnum
 */
export enum TableListIsDeprecatedEnum {
  True = 'true',
  False = 'false',
}

/**
 * Schema for TableListIsDeprecatedEnum
 */
export const tableListIsDeprecatedEnumSchema: Schema<TableListIsDeprecatedEnum> = stringEnum(TableListIsDeprecatedEnum);
