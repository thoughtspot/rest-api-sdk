/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for SearchObjectHeaderSortOrderEnum
 */
export enum SearchObjectHeaderSortOrderEnum {
  DEFAULT = 'DEFAULT',
  ASC = 'ASC',
  DESC = 'DESC',
}

/**
 * Schema for SearchObjectHeaderSortOrderEnum
 */
export const searchObjectHeaderSortOrderEnumSchema: Schema<SearchObjectHeaderSortOrderEnum> = stringEnum(SearchObjectHeaderSortOrderEnum);
