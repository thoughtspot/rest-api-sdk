// <copyright file="AccessLevelInputAccessEnum.cs" company="APIMatic">
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
    /// AccessLevelInputAccessEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum AccessLevelInputAccessEnum
    {
        /// <summary>
        /// READONLY.
        /// </summary>
        [EnumMember(Value = "READ_ONLY")]
        READONLY,

        /// <summary>
        /// MODIFY.
        /// </summary>
        [EnumMember(Value = "MODIFY")]
        MODIFY
    }
}