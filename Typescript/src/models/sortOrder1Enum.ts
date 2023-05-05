/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for SortOrder1Enum
 */
export enum SortOrder1Enum {
  DEFAULT = 'DEFAULT',
  ASC = 'ASC',
  DESC = 'DESC',
}

/**
 * Schema for SortOrder1Enum
 */
export const sortOrder1EnumSchema: Schema<SortOrder1Enum> = stringEnum(SortOrder1Enum);