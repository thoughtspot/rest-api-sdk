/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for CreateGroupPrivilegesEnum
 */
export enum CreateGroupPrivilegesEnum {
  ADMINISTRATION = 'ADMINISTRATION',
  AUTHORING = 'AUTHORING',
  DEVELOPER = 'DEVELOPER',
  USERDATAUPLOADING = 'USERDATAUPLOADING',
  DATADOWNLOADING = 'DATADOWNLOADING',
  DATAMANAGEMENT = 'DATAMANAGEMENT',
  SHAREWITHALL = 'SHAREWITHALL',
  EXPERIMENTALFEATUREPRIVILEGE = 'EXPERIMENTALFEATUREPRIVILEGE',
  JOBSCHEDULING = 'JOBSCHEDULING',
  RANALYSIS = 'RANALYSIS',
  A3ANALYSIS = 'A3ANALYSIS',
  BYPASSRLS = 'BYPASSRLS',
}

/**
 * Schema for CreateGroupPrivilegesEnum
 */
export const createGroupPrivilegesEnumSchema: Schema<CreateGroupPrivilegesEnum> = stringEnum(CreateGroupPrivilegesEnum);
