/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, lazy, object, optional, Schema, string } from '../schema';
import {
  ConnectionDatabaseType,
  connectionDatabaseTypeSchema,
} from './connectionDatabaseType';

export interface ConnectionTableResponse {
  /** Connection id */
  id?: string;
  /** List of databases */
  database?: ConnectionDatabaseType[];
}

export const connectionTableResponseSchema: Schema<ConnectionTableResponse> = object(
  {
    id: ['id', optional(string())],
    database: [
      'database',
      optional(array(lazy(() => connectionDatabaseTypeSchema))),
    ],
  }
);