// <copyright file="AnswerDataFormatTypeEnum.cs" company="APIMatic">
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
    /// AnswerDataFormatTypeEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum AnswerDataFormatTypeEnum
    {
        /// <summary>
        /// COMPACT.
        /// </summary>
        [EnumMember(Value = "COMPACT")]
        COMPACT,

        /// <summary>
        /// FULL.
        /// </summary>
        [EnumMember(Value = "FULL")]
        FULL
    }
}