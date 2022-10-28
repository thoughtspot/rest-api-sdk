// <copyright file="Type16Enum.cs" company="APIMatic">
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
    /// Type16Enum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Type16Enum
    {
        /// <summary>
        /// CSV.
        /// </summary>
        [EnumMember(Value = "CSV")]
        CSV,

        /// <summary>
        /// XLSX.
        /// </summary>
        [EnumMember(Value = "XLSX")]
        XLSX,

        /// <summary>
        /// PDF.
        /// </summary>
        [EnumMember(Value = "PDF")]
        PDF,

        /// <summary>
        /// PNG.
        /// </summary>
        [EnumMember(Value = "PNG")]
        PNG
    }
}