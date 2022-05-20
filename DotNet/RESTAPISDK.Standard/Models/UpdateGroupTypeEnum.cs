// <copyright file="UpdateGroupTypeEnum.cs" company="APIMatic">
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
    /// UpdateGroupTypeEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum UpdateGroupTypeEnum
    {
        /// <summary>
        /// LOCALGROUP.
        /// </summary>
        [EnumMember(Value = "LOCAL_GROUP")]
        LOCALGROUP,

        /// <summary>
        /// TENANTGROUP.
        /// </summary>
        [EnumMember(Value = "TENANT_GROUP")]
        TENANTGROUP
    }
}