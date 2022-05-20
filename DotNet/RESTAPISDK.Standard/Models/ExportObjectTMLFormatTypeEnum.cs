// <copyright file="ExportObjectTMLFormatTypeEnum.cs" company="APIMatic">
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
    /// ExportObjectTMLFormatTypeEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ExportObjectTMLFormatTypeEnum
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