// <copyright file="FormatTypeEnum.cs" company="APIMatic">
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
    /// FormatTypeEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum FormatTypeEnum
    {
        /// <summary>
        /// COMPACT.
        /// </summary>
        [EnumMember(Value = "COMPACT")]
        COMPACT,

        /// <summary>
        /// FULL.
        /// </summary>
        [EnumMember(Value = "FULL")]
        FULL
    }
}