/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for CreateConnectionTypeEnum
 */
export enum CreateConnectionTypeEnum {
  SNOWFLAKE = 'SNOWFLAKE',
  AMAZONREDSHIFT = 'AMAZON_REDSHIFT',
  GOOGLEBIGQUERY = 'GOOGLE_BIGQUERY',
  AZURESYNAPSE = 'AZURE_SYNAPSE',
  TERADATA = 'TERADATA',
  STARBURST = 'STARBURST',
  SAPHANA = 'SAP_HANA',
  ORACLEADW = 'ORACLE_ADW',
  DATABRICKS = 'DATABRICKS',
  DENODO = 'DENODO',
  DREMIO = 'DREMIO',
}

/**
 * Schema for CreateConnectionTypeEnum
 */
export const createConnectionTypeEnumSchema: Schema<CreateConnectionTypeEnum> = stringEnum(CreateConnectionTypeEnum);
