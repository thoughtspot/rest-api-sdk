// <copyright file="Type1Enum.cs" company="APIMatic">
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
    /// Type1Enum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Type1Enum
    {
        /// <summary>
        /// USER.
        /// </summary>
        [EnumMember(Value = "USER")]
        USER,

        /// <summary>
        /// USERGROUP.
        /// </summary>
        [EnumMember(Value = "USER_GROUP")]
        USERGROUP,
    }
}