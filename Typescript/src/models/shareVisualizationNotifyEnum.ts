/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for ShareVisualizationNotifyEnum
 */
export enum ShareVisualizationNotifyEnum {
  True = 'true',
  False = 'false',
}

/**
 * Schema for ShareVisualizationNotifyEnum
 */
export const shareVisualizationNotifyEnumSchema: Schema<ShareVisualizationNotifyEnum> = stringEnum(ShareVisualizationNotifyEnum);