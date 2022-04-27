// <copyright file="SearchObjectDetailTypeEnum.cs" company="APIMatic">
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
    /// SearchObjectDetailTypeEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum SearchObjectDetailTypeEnum
    {
        /// <summary>
        /// ANSWER.
        /// </summary>
        [EnumMember(Value = "ANSWER")]
        ANSWER,

        /// <summary>
        /// LIVEBOARD.
        /// </summary>
        [EnumMember(Value = "LIVEBOARD")]
        LIVEBOARD,

        /// <summary>
        /// DATAOBJECT.
        /// </summary>
        [EnumMember(Value = "DATAOBJECT")]
        DATAOBJECT,

        /// <summary>
        /// COLUMN.
        /// </summary>
        [EnumMember(Value = "COLUMN")]
        COLUMN,

        /// <summary>
        /// JOIN.
        /// </summary>
        [EnumMember(Value = "JOIN")]
        JOIN,

        /// <summary>
        /// CONNECTION.
        /// </summary>
        [EnumMember(Value = "CONNECTION")]
        CONNECTION,

        /// <summary>
        /// TAG.
        /// </summary>
        [EnumMember(Value = "TAG")]
        TAG,

        /// <summary>
        /// USER.
        /// </summary>
        [EnumMember(Value = "USER")]
        USER,

        /// <summary>
        /// USERGROUP.
        /// </summary>
        [EnumMember(Value = "USER_GROUP")]
        USERGROUP
    }
}