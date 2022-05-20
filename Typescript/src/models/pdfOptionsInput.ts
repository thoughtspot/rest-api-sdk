/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';
import {
  PdfOptionsInputIncludeCoverPageEnum,
  pdfOptionsInputIncludeCoverPageEnumSchema,
} from './pdfOptionsInputIncludeCoverPageEnum';
import {
  PdfOptionsInputIncludeFilterPageEnum,
  pdfOptionsInputIncludeFilterPageEnumSchema,
} from './pdfOptionsInputIncludeFilterPageEnum';
import {
  PdfOptionsInputIncludeLogoEnum,
  pdfOptionsInputIncludeLogoEnumSchema,
} from './pdfOptionsInputIncludeLogoEnum';
import {
  PdfOptionsInputIncludePageNumberEnum,
  pdfOptionsInputIncludePageNumberEnumSchema,
} from './pdfOptionsInputIncludePageNumberEnum';
import {
  PdfOptionsInputOrientationEnum,
  pdfOptionsInputOrientationEnumSchema,
} from './pdfOptionsInputOrientationEnum';
import {
  PdfOptionsInputTruncateTablesEnum,
  pdfOptionsInputTruncateTablesEnumSchema,
} from './pdfOptionsInputTruncateTablesEnum';

export interface PdfOptionsInput {
  /** Page orientation for the PDF. Default: PORTRAIT */
  orientation?: PdfOptionsInputOrientationEnum;
  /**
   * When set to true, only the first page of the tables is displayed in the file.
   * This setting is applicable only when generating report for specific visualization ids. Default: false
   */
  truncateTables?: PdfOptionsInputTruncateTablesEnum;
  /** Include customized wide logo if available in the footer. Default: true */
  includeLogo?: PdfOptionsInputIncludeLogoEnum;
  /** Footer text to include in the footer of each page of the PDF. */
  footerText?: string;
  /** When set to true, the page number is included in the footer of each page. Default: true */
  includePageNumber?: PdfOptionsInputIncludePageNumberEnum;
  /** When set to true, a cover page with the Liveboard title is added in the PDF. Default: true */
  includeCoverPage?: PdfOptionsInputIncludeCoverPageEnum;
  /** When set to true, a second page with a list of all applied filters is added in the PDF. Default: true */
  includeFilterPage?: PdfOptionsInputIncludeFilterPageEnum;
}

export const pdfOptionsInputSchema: Schema<PdfOptionsInput> = object({
  orientation: ['orientation', optional(pdfOptionsInputOrientationEnumSchema)],
  truncateTables: [
    'truncateTables',
    optional(pdfOptionsInputTruncateTablesEnumSchema),
  ],
  includeLogo: ['includeLogo', optional(pdfOptionsInputIncludeLogoEnumSchema)],
  footerText: ['footerText', optional(string())],
  includePageNumber: [
    'includePageNumber',
    optional(pdfOptionsInputIncludePageNumberEnumSchema),
  ],
  includeCoverPage: [
    'includeCoverPage',
    optional(pdfOptionsInputIncludeCoverPageEnumSchema),
  ],
  includeFilterPage: [
    'includeFilterPage',
    optional(pdfOptionsInputIncludeFilterPageEnumSchema),
  ],
});