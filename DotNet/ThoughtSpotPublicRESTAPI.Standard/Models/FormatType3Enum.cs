// <copyright file="FormatType3Enum.cs" company="APIMatic">
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
    /// FormatType3Enum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum FormatType3Enum
    {
        /// <summary>
        /// YAML.
        /// </summary>
        [EnumMember(Value = "YAML")]
        YAML,

        /// <summary>
        /// JSON.
        /// </summary>
        [EnumMember(Value = "JSON")]
        JSON
    }
}