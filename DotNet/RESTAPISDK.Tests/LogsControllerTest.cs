// <copyright file="LogsControllerTest.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace RESTAPISDK.Tests
{
    using System;
    using System.Collections.Generic;
    using System.Globalization;
    using System.IO;
    using System.Threading.Tasks;
    using Newtonsoft.Json.Converters;
    using NUnit.Framework;
    using RESTAPISDK.Standard;
    using RESTAPISDK.Standard.Controllers;
    using RESTAPISDK.Standard.Exceptions;
    using RESTAPISDK.Standard.Http.Client;
    using RESTAPISDK.Standard.Http.Response;
    using RESTAPISDK.Standard.Utilities;
    using RESTAPISDK.Tests.Helpers;

    /// <summary>
    /// LogsControllerTest.
    /// </summary>
    [TestFixture]
    public class LogsControllerTest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests).
        /// </summary>
        private LogsController controller;

        /// <summary>
        /// Setup test class.
        /// </summary>
        [OneTimeSetUp]
        public void SetUpDerived()
        {
            this.controller = this.Client.LogsController;
        }

        /// <summary>
        /// Note: This endpoint is applicable only for SAAS deployments. 
        ///
        /// The ThoughtSpot log streaming service API allows you to programmatically get a security audit event log from the ThoughtSpot system. 
        ///
        /// To use this API, make sure you have admin user privileges. 
        ///
        /// ThoughtSpot cloud deployments allow you to collect security audit events and send them to your Security information and event management (SIEM) application in real-time. 
        ///
        /// These events can help your security operations personnel to detect potential security threats or compromised user accounts in your organization. 
        ///
        /// Permission: Requires administration privilege.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestTestGetLogEvents()
        {
            // Parameters for the API call
            Standard.Models.TopicEnum topic = ApiHelper.JsonDeserialize<Standard.Models.TopicEnum>("\"security_logs\"");
            string fromEpoch = null;
            string toEpoch = null;

            // Perform API call
            Standard.Models.LogsResponse result = null;
            try
            {
                result = await this.controller.GetLogEventsAsync(topic, fromEpoch, toEpoch);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, this.HttpCallBackHandler.Response.StatusCode, "Status should be 200");

            // Test headers
            Dictionary<string, string> headers = new Dictionary<string, string>();
            headers.Add("Content-Type", "application/json");

            Assert.IsTrue(
                    TestHelper.AreHeadersProperSubsetOf (
                    headers,
                    this.HttpCallBackHandler.Response.Headers),
                    "Headers should match");
        }
    }
}