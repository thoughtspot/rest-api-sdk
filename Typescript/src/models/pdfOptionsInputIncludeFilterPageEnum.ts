/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for PdfOptionsInputIncludeFilterPageEnum
 */
export enum PdfOptionsInputIncludeFilterPageEnum {
  True = 'true',
  False = 'false',
}

/**
 * Schema for PdfOptionsInputIncludeFilterPageEnum
 */
export const pdfOptionsInputIncludeFilterPageEnumSchema: Schema<PdfOptionsInputIncludeFilterPageEnum> = stringEnum(PdfOptionsInputIncludeFilterPageEnum);
