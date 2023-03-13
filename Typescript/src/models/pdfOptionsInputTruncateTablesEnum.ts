/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for PdfOptionsInputTruncateTablesEnum
 */
export enum PdfOptionsInputTruncateTablesEnum {
  True = 'true',
  False = 'false',
}

/**
 * Schema for PdfOptionsInputTruncateTablesEnum
 */
export const pdfOptionsInputTruncateTablesEnumSchema: Schema<PdfOptionsInputTruncateTablesEnum> = stringEnum(PdfOptionsInputTruncateTablesEnum);