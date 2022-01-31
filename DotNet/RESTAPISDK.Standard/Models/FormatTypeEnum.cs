// <copyright file="FormatTypeEnum.cs" company="APIMatic">
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
    /// FormatTypeEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum FormatTypeEnum
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
        JSON,
    }
}