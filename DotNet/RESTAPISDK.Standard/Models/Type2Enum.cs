// <copyright file="Type2Enum.cs" company="APIMatic">
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
    /// Type2Enum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Type2Enum
    {
        /// <summary>
        /// LIVEBOARD.
        /// </summary>
        [EnumMember(Value = "LIVEBOARD")]
        LIVEBOARD,

        /// <summary>
        /// ANSWER.
        /// </summary>
        [EnumMember(Value = "ANSWER")]
        ANSWER,

        /// <summary>
        /// DATAOBJECT.
        /// </summary>
        [EnumMember(Value = "DATAOBJECT")]
        DATAOBJECT,

        /// <summary>
        /// COLUMN.
        /// </summary>
        [EnumMember(Value = "COLUMN")]
        COLUMN
    }
}