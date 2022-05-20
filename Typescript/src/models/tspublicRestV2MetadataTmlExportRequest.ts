/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, object, optional, Schema, string } from '../schema';
import {
  ExportObjectTMLExportAssociatedEnum,
  exportObjectTMLExportAssociatedEnumSchema,
} from './exportObjectTMLExportAssociatedEnum';
import {
  ExportObjectTMLFormatTypeEnum,
  exportObjectTMLFormatTypeEnumSchema,
} from './exportObjectTMLFormatTypeEnum';

export interface TspublicRestV2MetadataTmlExportRequest {
  /** A JSON array of GUIDs of the objects. */
  id: string[];
  /** The format in which to export the objects */
  formatType?: ExportObjectTMLFormatTypeEnum;
  /**
   * Specifies if you would like to export the associated objects. To export the objects associated with the objects specified in id, set the value to true. When set to true, the API exports any underlying worksheets, tables, or views for a given object.
   *  By default, the API does not export these underlying objects
   */
  exportAssociated?: ExportObjectTMLExportAssociatedEnum;
}

export const tspublicRestV2MetadataTmlExportRequestSchema: Schema<TspublicRestV2MetadataTmlExportRequest> = object(
  {
    id: ['id', array(string())],
    formatType: ['formatType', optional(exportObjectTMLFormatTypeEnumSchema)],
    exportAssociated: [
      'exportAssociated',
      optional(exportObjectTMLExportAssociatedEnumSchema),
    ],
  }
);