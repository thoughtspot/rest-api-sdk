/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, boolean, object, optional, Schema, string } from '../schema';
import { Type6Enum, type6EnumSchema } from './type6Enum';

export interface TspublicRestV2MetadataDetailSearchRequest {
  /** Type of the metadata object being searched. */
  type: Type6Enum;
  /** A JSON array of GUIDs of the objects. */
  id: string[];
  /** When set to true, returns details of the hidden objects, such as a column in a worksheet or a table. */
  showHidden?: boolean;
  /** When set to true, the search assist data associated with a worksheet is not included in the API response. This attribute is applicable only for DATAOBJECT data type. */
  dropQuestionDetails?: boolean;
  /** Specify the version to retrieve the objects from. By default, the API returns metadata for all versions of the object. */
  version?: string;
}

export const tspublicRestV2MetadataDetailSearchRequestSchema: Schema<TspublicRestV2MetadataDetailSearchRequest> = object(
  {
    type: ['type', type6EnumSchema],
    id: ['id', array(string())],
    showHidden: ['showHidden', optional(boolean())],
    dropQuestionDetails: ['dropQuestionDetails', optional(boolean())],
    version: ['version', optional(string())],
  }
);