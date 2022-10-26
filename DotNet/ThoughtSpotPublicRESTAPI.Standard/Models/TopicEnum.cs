// <copyright file="TopicEnum.cs" company="APIMatic">
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
    /// TopicEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum TopicEnum
    {
        /// <summary>
        /// SecurityLogs.
        /// </summary>
        [EnumMember(Value = "security_logs")]
        SecurityLogs
    }
}