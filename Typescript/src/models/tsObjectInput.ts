/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, Schema, string } from '../schema';
import {
  TsObjectInputTypeEnum,
  tsObjectInputTypeEnumSchema,
} from './tsObjectInputTypeEnum';

export interface TsObjectInput {
  /** GUID of the metadata object */
  id: string;
  /** Type of the metadata object */
  type: TsObjectInputTypeEnum;
}

export const tsObjectInputSchema: Schema<TsObjectInput> = object({
  id: ['id', string()],
  type: ['type', tsObjectInputTypeEnumSchema],
});
