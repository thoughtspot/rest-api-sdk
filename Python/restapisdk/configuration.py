# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

from enum import Enum
from restapisdk.api_helper import APIHelper
from restapisdk.http.requests_client import RequestsClient


class Environment(Enum):
    """An enum for SDK environments"""
    PRODUCTION = 0


class Server(Enum):
    """An enum for API servers"""
    DEFAULT = 0


class Configuration(object):
    """A class used for configuring the SDK by a user.
    """

    @property
    def http_client(self):
        return self._http_client

    @property
    def http_client_instance(self):
        return self._http_client_instance

    @property
    def override_http_client_configuration(self):
        return self._override_http_client_configuration

    @property
    def http_call_back(self):
        return self._http_call_back

    @property
    def timeout(self):
        return self._timeout

    @property
    def max_retries(self):
        return self._max_retries

    @property
    def backoff_factor(self):
        return self._backoff_factor

    @property
    def retry_statuses(self):
        return self._retry_statuses

    @property
    def retry_methods(self):
        return self._retry_methods

    @property
    def environment(self):
        return self._environment

    @property
    def base_url(self):
        return self._base_url

    @property
    def access_token(self):
        return self._access_token

    @property
    def accept_language(self):
        return self._accept_language

    @property
    def content_type(self):
        return self._content_type

    @property
    def skip_ssl_cert_verification(self):
        return self._skip_ssl_cert_verification

    def __init__(
        self, http_client_instance=None, override_http_client_configuration=False, http_call_back=None,
        timeout=60, max_retries=0, backoff_factor=2,
        retry_statuses=[408, 413, 429, 500, 502, 503, 504, 521, 522, 524, 408, 413, 429, 500, 502, 503, 504, 521, 522, 524],
        retry_methods=['GET', 'PUT', 'GET', 'PUT'], environment=Environment.PRODUCTION, base_url='https://localhost:443',
        access_token='', accept_language='application/json', content_type='application/json',
        skip_ssl_cert_verification=False
    ):
        # The Http Client passed from the sdk user for making requests
        self._http_client_instance = http_client_instance

        # The value which determines to override properties of the passed Http Client from the sdk user
        self._override_http_client_configuration = override_http_client_configuration

        #  The callback value that is invoked before and after an HTTP call is made to an endpoint
        self._http_call_back = http_call_back

        # The value to use for connection timeout
        self._timeout = timeout

        # The number of times to retry an endpoint call if it fails
        self._max_retries = max_retries

        # A backoff factor to apply between attempts after the second try.
        # urllib3 will sleep for:
        # `{backoff factor} * (2 ** ({number of total retries} - 1))`
        self._backoff_factor = backoff_factor

        # The http statuses on which retry is to be done
        self._retry_statuses = retry_statuses

        # The http methods on which retry is to be done
        self._retry_methods = retry_methods

        # Current API environment
        self._environment = environment

        # base_url value
        self._base_url = base_url

        # The OAuth 2.0 Access Token to use for API requests.
        self._access_token = access_token

        # response format
        self._accept_language = accept_language

        # body content type for post request
        self._content_type = content_type

        # Set to true to allow skipping ssl certificate verification
        self._skip_ssl_cert_verification = skip_ssl_cert_verification

        # The Http Client to use for making requests.
        self._http_client = self.create_http_client()

    def clone_with(self, http_client_instance=None,
                   override_http_client_configuration=None, http_call_back=None,
                   timeout=None, max_retries=None, backoff_factor=None,
                   retry_statuses=None, retry_methods=None, environment=None,
                   base_url=None, access_token=None, accept_language=None,
                   content_type=None, skip_ssl_cert_verification=None):
        http_client_instance = http_client_instance or self.http_client_instance
        override_http_client_configuration = override_http_client_configuration or self.override_http_client_configuration
        http_call_back = http_call_back or self.http_call_back
        timeout = timeout or self.timeout
        max_retries = max_retries or self.max_retries
        backoff_factor = backoff_factor or self.backoff_factor
        retry_statuses = retry_statuses or self.retry_statuses
        retry_methods = retry_methods or self.retry_methods
        environment = environment or self.environment
        base_url = base_url or self.base_url
        access_token = access_token or self.access_token
        accept_language = accept_language or self.accept_language
        content_type = content_type or self.content_type
        skip_ssl_cert_verification = skip_ssl_cert_verification or self.skip_ssl_cert_verification

        return Configuration(
            http_client_instance=http_client_instance,
            override_http_client_configuration=override_http_client_configuration,
            http_call_back=http_call_back, timeout=timeout,
            max_retries=max_retries, backoff_factor=backoff_factor,
            retry_statuses=retry_statuses, retry_methods=retry_methods,
            environment=environment, base_url=base_url, access_token=access_token,
            accept_language=accept_language, content_type=content_type,
            skip_ssl_cert_verification=skip_ssl_cert_verification
        )

    def create_http_client(self):
        return RequestsClient(
            timeout=self.timeout, max_retries=self.max_retries,
            backoff_factor=self.backoff_factor, retry_statuses=self.retry_statuses,
            retry_methods=self.retry_methods,
            http_client_instance=self.http_client_instance,
            override_http_client_configuration=self.override_http_client_configuration,
            verify=not self.skip_ssl_cert_verification
        )

    # All the environments the SDK can run in
    environments = {
        Environment.PRODUCTION: {
            Server.DEFAULT: '{base-url}'
        }
    }

    def get_base_uri(self, server=Server.DEFAULT):
        """Generates the appropriate base URI for the environment and the
        server.

        Args:
            server (Configuration.Server): The server enum for which the base
            URI is required.

        Returns:
            String: The base URI.

        """
        parameters = {
            "base-url": {'value': self.base_url, 'encode': False},
        }

        return APIHelper.append_url_with_template_parameters(
            self.environments[self.environment][server], parameters
        )
