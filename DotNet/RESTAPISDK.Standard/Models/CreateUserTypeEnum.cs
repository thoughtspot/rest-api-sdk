// <copyright file="CreateUserTypeEnum.cs" company="APIMatic">
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
    /// CreateUserTypeEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum CreateUserTypeEnum
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
        LOCALUSER
    }
}