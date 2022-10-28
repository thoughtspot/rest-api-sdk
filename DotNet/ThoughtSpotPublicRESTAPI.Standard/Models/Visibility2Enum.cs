// <copyright file="Visibility2Enum.cs" company="APIMatic">
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
    /// Visibility2Enum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Visibility2Enum
    {
        /// <summary>
        /// DEFAULT.
        /// </summary>
        [EnumMember(Value = "DEFAULT")]
        DEFAULT,

        /// <summary>
        /// NONSHARABLE.
        /// </summary>
        [EnumMember(Value = "NON_SHARABLE")]
        NONSHARABLE,

        /// <summary>
        /// SHARABLE.
        /// </summary>
        [EnumMember(Value = "SHARABLE")]
        SHARABLE
    }
}