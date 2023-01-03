// <copyright file="AccessLevelEnum.cs" company="APIMatic">
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
    /// AccessLevelEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum AccessLevelEnum
    {
        /// <summary>
        /// FULL.
        /// </summary>
        [EnumMember(Value = "FULL")]
        FULL,

        /// <summary>
        /// REPORTBOOKVIEW.
        /// </summary>
        [EnumMember(Value = "REPORT_BOOK_VIEW")]
        REPORTBOOKVIEW
    }
}