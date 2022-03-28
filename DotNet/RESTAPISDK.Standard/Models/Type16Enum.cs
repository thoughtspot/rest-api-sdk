// <copyright file="Type16Enum.cs" company="APIMatic">
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
    /// Type16Enum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Type16Enum
    {
        /// <summary>
        /// SNOWFLAKE.
        /// </summary>
        [EnumMember(Value = "SNOWFLAKE")]
        SNOWFLAKE,

        /// <summary>
        /// AMAZONREDSHIFT.
        /// </summary>
        [EnumMember(Value = "AMAZON_REDSHIFT")]
        AMAZONREDSHIFT,

        /// <summary>
        /// GOOGLEBIGQUERY.
        /// </summary>
        [EnumMember(Value = "GOOGLE_BIGQUERY")]
        GOOGLEBIGQUERY,

        /// <summary>
        /// AZURESYNAPSE.
        /// </summary>
        [EnumMember(Value = "AZURE_SYNAPSE")]
        AZURESYNAPSE,

        /// <summary>
        /// TERADATA.
        /// </summary>
        [EnumMember(Value = "TERADATA")]
        TERADATA,

        /// <summary>
        /// STARBURST.
        /// </summary>
        [EnumMember(Value = "STARBURST")]
        STARBURST,

        /// <summary>
        /// SAPHANA.
        /// </summary>
        [EnumMember(Value = "SAP_HANA")]
        SAPHANA,

        /// <summary>
        /// ORACLEADW.
        /// </summary>
        [EnumMember(Value = "ORACLE_ADW")]
        ORACLEADW,

        /// <summary>
        /// DATABRICKS.
        /// </summary>
        [EnumMember(Value = "DATABRICKS")]
        DATABRICKS,

        /// <summary>
        /// DENODO.
        /// </summary>
        [EnumMember(Value = "DENODO")]
        DENODO
    }
}