# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

import json
import dateutil.parser

from tests.controllers.controller_test_base import ControllerTestBase
from tests.test_helper import TestHelper
from restapisdk.api_helper import APIHelper


class AdminControllerTests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(AdminControllerTests, cls).setUpClass()
        cls.controller = cls.client.admin
        cls.response_catcher = cls.controller.http_call_back

    # To get details of the current configuration of a Thoughtspot cluster, use this endpoint. 
    #
    # Permission: Requires administration privilege
    def test_get_cluster_config(self):

        # Perform the API call through the SDK function
        result = self.controller.get_cluster_config()

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)

        # Test headers
        expected_headers = {}
        expected_headers['content-type'] = 'application/json'

        self.assertTrue(TestHelper.match_headers(expected_headers, self.response_catcher.response.headers))


    # To get the details of overrides to the Thoughtspot cluster configuration, use this endpoint. 
    #
    # Permission: Requires administration privilege
    def test_get_cluster_config_overrides(self):

        # Perform the API call through the SDK function
        result = self.controller.get_cluster_config_overrides()

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)

        # Test headers
        expected_headers = {}
        expected_headers['content-type'] = 'application/json'

        self.assertTrue(TestHelper.match_headers(expected_headers, self.response_catcher.response.headers))


