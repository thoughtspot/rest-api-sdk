// <copyright file="Type9Enum.cs" company="APIMatic">
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
    /// Type9Enum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Type9Enum
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
        /// DATAOBJECTALL.
        /// </summary>
        [EnumMember(Value = "DATAOBJECT_ALL")]
        DATAOBJECTALL,

        /// <summary>
        /// DATAOBJECTWORKSHEET.
        /// </summary>
        [EnumMember(Value = "DATAOBJECT_WORKSHEET")]
        DATAOBJECTWORKSHEET,

        /// <summary>
        /// DATAOBJECTTABLE.
        /// </summary>
        [EnumMember(Value = "DATAOBJECT_TABLE")]
        DATAOBJECTTABLE,

        /// <summary>
        /// DATAOBJECTUSERDEFINED.
        /// </summary>
        [EnumMember(Value = "DATAOBJECT_USER_DEFINED")]
        DATAOBJECTUSERDEFINED,

        /// <summary>
        /// DATAOBJECTVIEW.
        /// </summary>
        [EnumMember(Value = "DATAOBJECT_VIEW")]
        DATAOBJECTVIEW,

        /// <summary>
        /// DATAOBJECTCALENDARTABLE.
        /// </summary>
        [EnumMember(Value = "DATAOBJECT_CALENDAR_TABLE")]
        DATAOBJECTCALENDARTABLE,

        /// <summary>
        /// COLUMNALL.
        /// </summary>
        [EnumMember(Value = "COLUMN_ALL")]
        COLUMNALL,

        /// <summary>
        /// COLUMNWORKSHEET.
        /// </summary>
        [EnumMember(Value = "COLUMN_WORKSHEET")]
        COLUMNWORKSHEET,

        /// <summary>
        /// COLUMNTABLE.
        /// </summary>
        [EnumMember(Value = "COLUMN_TABLE")]
        COLUMNTABLE,

        /// <summary>
        /// COLUMNUSERDEFINED.
        /// </summary>
        [EnumMember(Value = "COLUMN_USER_DEFINED")]
        COLUMNUSERDEFINED,

        /// <summary>
        /// COLUMNVIEW.
        /// </summary>
        [EnumMember(Value = "COLUMN_VIEW")]
        COLUMNVIEW,

        /// <summary>
        /// COLUMNCALENDARTABLE.
        /// </summary>
        [EnumMember(Value = "COLUMN_CALENDAR_TABLE")]
        COLUMNCALENDARTABLE,

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