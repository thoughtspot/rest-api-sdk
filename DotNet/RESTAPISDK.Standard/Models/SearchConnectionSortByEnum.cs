// <copyright file="SearchConnectionSortByEnum.cs" company="APIMatic">
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
    /// SearchConnectionSortByEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum SearchConnectionSortByEnum
    {
        /// <summary>
        /// DEFAULT.
        /// </summary>
        [EnumMember(Value = "DEFAULT")]
        DEFAULT,

        /// <summary>
        /// NAME.
        /// </summary>
        [EnumMember(Value = "NAME")]
        NAME,

        /// <summary>
        /// DISPLAYNAME.
        /// </summary>
        [EnumMember(Value = "DISPLAY_NAME")]
        DISPLAYNAME,

        /// <summary>
        /// AUTHOR.
        /// </summary>
        [EnumMember(Value = "AUTHOR")]
        AUTHOR,

        /// <summary>
        /// CREATED.
        /// </summary>
        [EnumMember(Value = "CREATED")]
        CREATED,

        /// <summary>
        /// MODIFIED.
        /// </summary>
        [EnumMember(Value = "MODIFIED")]
        MODIFIED,

        /// <summary>
        /// LASTACCESSED.
        /// </summary>
        [EnumMember(Value = "LAST_ACCESSED")]
        LASTACCESSED,

        /// <summary>
        /// SYNCED.
        /// </summary>
        [EnumMember(Value = "SYNCED")]
        SYNCED,

        /// <summary>
        /// VIEWS.
        /// </summary>
        [EnumMember(Value = "VIEWS")]
        VIEWS,

        /// <summary>
        /// NONE.
        /// </summary>
        [EnumMember(Value = "NONE")]
        NONE,

        /// <summary>
        /// USERSTATE.
        /// </summary>
        [EnumMember(Value = "USER_STATE")]
        USERSTATE,

        /// <summary>
        /// ROWCOUNT.
        /// </summary>
        [EnumMember(Value = "ROW_COUNT")]
        ROWCOUNT
    }
}