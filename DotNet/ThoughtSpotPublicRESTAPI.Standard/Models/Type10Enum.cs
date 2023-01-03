// <copyright file="Type10Enum.cs" company="APIMatic">
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
    /// Type10Enum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Type10Enum
    {
        /// <summary>
        /// LOCALGROUP.
        /// </summary>
        [EnumMember(Value = "LOCAL_GROUP")]
        LOCALGROUP,

        /// <summary>
        /// TENANTGROUP.
        /// </summary>
        [EnumMember(Value = "TENANT_GROUP")]
        TENANTGROUP
    }
}