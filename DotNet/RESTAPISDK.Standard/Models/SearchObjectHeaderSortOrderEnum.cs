// <copyright file="SearchObjectHeaderSortOrderEnum.cs" company="APIMatic">
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
    /// SearchObjectHeaderSortOrderEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum SearchObjectHeaderSortOrderEnum
    {
        /// <summary>
        /// DEFAULT.
        /// </summary>
        [EnumMember(Value = "DEFAULT")]
        DEFAULT,

        /// <summary>
        /// ASC.
        /// </summary>
        [EnumMember(Value = "ASC")]
        ASC,

        /// <summary>
        /// DESC.
        /// </summary>
        [EnumMember(Value = "DESC")]
        DESC
    }
}