// <copyright file="GetTokenAccessLevelEnum.cs" company="APIMatic">
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
    /// GetTokenAccessLevelEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum GetTokenAccessLevelEnum
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