/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, number, object, optional, Schema, string } from '../schema';
import { Type13Enum, type13EnumSchema } from './type13Enum';

export interface TspublicRestV2MetadataDependencyRequest {
  /** Type of the data object */
  type: Type13Enum;
  /** A JSON array of GUIDs of the objects */
  id: string[];
  /** The maximum number of batches to fetch in a query. If this attribute is not defined, the value specified in the cluster configuration is used. To get the list of all dependent objects in a single query, define the batch size attribute as -1 */
  batchSize?: number;
}

export const tspublicRestV2MetadataDependencyRequestSchema: Schema<TspublicRestV2MetadataDependencyRequest> = object(
  {
    type: ['type', type13EnumSchema],
    id: ['id', array(string())],
    batchSize: ['batchSize', optional(number())],
  }
);