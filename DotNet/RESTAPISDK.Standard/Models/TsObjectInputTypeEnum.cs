// <copyright file="TsObjectInputTypeEnum.cs" company="APIMatic">
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
    /// TsObjectInputTypeEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum TsObjectInputTypeEnum
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
        /// CONNECTION.
        /// </summary>
        [EnumMember(Value = "CONNECTION")]
        CONNECTION
    }
}