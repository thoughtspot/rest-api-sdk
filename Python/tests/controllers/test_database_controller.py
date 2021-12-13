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
from tests.http_response_catcher import HttpResponseCatcher
from restapisdk.api_helper import APIHelper
from restapisdk.controllers.database_controller import DatabaseController


class DatabaseControllerTests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(DatabaseControllerTests, cls).setUpClass()
        cls.response_catcher = HttpResponseCatcher()
        cls.controller = DatabaseController(cls.config, cls.response_catcher)

    # To list all the databases in Falcon, use this endpoint.
    def test_get_databases(self):

        # Perform the API call through the SDK function
        result = self.controller.get_databases()

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)

        # Test headers
        expected_headers = {}
        expected_headers['content-type'] = 'application/json'

        self.assertTrue(TestHelper.match_headers(expected_headers, self.response_catcher.response.headers))

