// <copyright file="CreateUserStateEnum.cs" company="APIMatic">
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
    /// CreateUserStateEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum CreateUserStateEnum
    {
        /// <summary>
        /// ACTIVE.
        /// </summary>
        [EnumMember(Value = "ACTIVE")]
        ACTIVE,

        /// <summary>
        /// INACTIVE.
        /// </summary>
        [EnumMember(Value = "INACTIVE")]
        INACTIVE,

        /// <summary>
        /// EXPIRED.
        /// </summary>
        [EnumMember(Value = "EXPIRED")]
        EXPIRED,

        /// <summary>
        /// LOCKED.
        /// </summary>
        [EnumMember(Value = "LOCKED")]
        LOCKED,

        /// <summary>
        /// PENDING.
        /// </summary>
        [EnumMember(Value = "PENDING")]
        PENDING
    }
}