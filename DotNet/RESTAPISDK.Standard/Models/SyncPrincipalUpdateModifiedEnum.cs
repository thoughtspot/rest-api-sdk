// <copyright file="SyncPrincipalUpdateModifiedEnum.cs" company="APIMatic">
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
    /// SyncPrincipalUpdateModifiedEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum SyncPrincipalUpdateModifiedEnum
    {
        /// <summary>
        /// True.
        /// </summary>
        [EnumMember(Value = "true")]
        True,

        /// <summary>
        /// False.
        /// </summary>
        [EnumMember(Value = "false")]
        False
    }
}