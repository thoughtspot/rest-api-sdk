/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for State1Enum
 */
export enum State1Enum {
  ACTIVE = 'ACTIVE',
  INACTIVE = 'INACTIVE',
  EXPIRED = 'EXPIRED',
  LOCKED = 'LOCKED',
  PENDING = 'PENDING',
}

/**
 * Schema for State1Enum
 */
export const state1EnumSchema: Schema<State1Enum> = stringEnum(State1Enum);