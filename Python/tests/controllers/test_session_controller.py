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


class SessionControllerTests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(SessionControllerTests, cls).setUpClass()
        cls.controller = cls.client.session
        cls.response_catcher = cls.controller.http_call_back

    # To get session object information, use this endpoint
    def test_get_session_info(self):

        # Perform the API call through the SDK function
        result = self.controller.get_session_info()

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)

        # Test headers
        expected_headers = {}
        expected_headers['content-type'] = 'application/json'

        self.assertTrue(TestHelper.match_headers(expected_headers, self.response_catcher.response.headers))


    # To log a user out of the current session, use this endpoint
    def test_logout(self):

        # Perform the API call through the SDK function
        result = self.controller.logout()

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)

        # Test headers
        expected_headers = {}
        expected_headers['content-type'] = 'application/json'

        self.assertTrue(TestHelper.match_headers(expected_headers, self.response_catcher.response.headers))


    # To expire or revoke a token for a user, use this endpoint
    def test_revoke_token(self):

        # Perform the API call through the SDK function
        result = self.controller.revoke_token()

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)

        # Test headers
        expected_headers = {}
        expected_headers['content-type'] = 'application/json'

        self.assertTrue(TestHelper.match_headers(expected_headers, self.response_catcher.response.headers))


