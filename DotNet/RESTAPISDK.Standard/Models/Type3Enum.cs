// <copyright file="Type3Enum.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace RESTAPISDK.Standard.Models
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Runtime.Serialization;
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using RESTAPISDK.Standard;
    using RESTAPISDK.Standard.Utilities;

    /// <summary>
    /// Type3Enum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Type3Enum
    {
        /// <summary>
        /// UNKNOWN.
        /// </summary>
        [EnumMember(Value = "UNKNOWN")]
        UNKNOWN,

        /// <summary>
        /// LDAPUSER.
        /// </summary>
        [EnumMember(Value = "LDAP_USER")]
        LDAPUSER,

        /// <summary>
        /// SAMLUSER.
        /// </summary>
        [EnumMember(Value = "SAML_USER")]
        SAMLUSER,

        /// <summary>
        /// OIDCUSER.
        /// </summary>
        [EnumMember(Value = "OIDC_USER")]
        OIDCUSER,

        /// <summary>
        /// LOCALUSER.
        /// </summary>
        [EnumMember(Value = "LOCAL_USER")]
        LOCALUSER,

        /// <summary>
        /// LDAPGROUP.
        /// </summary>
        [EnumMember(Value = "LDAP_GROUP")]
        LDAPGROUP,

        /// <summary>
        /// LOCALGROUP.
        /// </summary>
        [EnumMember(Value = "LOCAL_GROUP")]
        LOCALGROUP,

        /// <summary>
        /// TENANTGROUP.
        /// </summary>
        [EnumMember(Value = "TENANT_GROUP")]
        TENANTGROUP,
    }
}