// <copyright file="LiveboardReportTypeEnum.cs" company="APIMatic">
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
    /// LiveboardReportTypeEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum LiveboardReportTypeEnum
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