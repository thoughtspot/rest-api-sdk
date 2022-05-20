/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for UpdateUserTypeEnum
 */
export enum UpdateUserTypeEnum {
  UNKNOWN = 'UNKNOWN',
  LDAPUSER = 'LDAP_USER',
  SAMLUSER = 'SAML_USER',
  OIDCUSER = 'OIDC_USER',
  LOCALUSER = 'LOCAL_USER',
  LDAPGROUP = 'LDAP_GROUP',
  LOCALGROUP = 'LOCAL_GROUP',
  TENANTGROUP = 'TENANT_GROUP',
}

/**
 * Schema for UpdateUserTypeEnum
 */
export const updateUserTypeEnumSchema: Schema<UpdateUserTypeEnum> = stringEnum(UpdateUserTypeEnum);