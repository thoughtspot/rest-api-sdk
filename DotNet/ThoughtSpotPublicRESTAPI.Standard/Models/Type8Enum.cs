// <copyright file="Type8Enum.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace ThoughtSpotPublicRESTAPI.Standard.Models
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Runtime.Serialization;
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using ThoughtSpotPublicRESTAPI.Standard;
    using ThoughtSpotPublicRESTAPI.Standard.Utilities;

    /// <summary>
    /// Type8Enum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Type8Enum
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