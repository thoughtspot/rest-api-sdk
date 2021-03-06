# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

from restapisdk.decorators import lazy_property
from restapisdk.configuration import Configuration
from restapisdk.configuration import Environment
from restapisdk.http.auth.o_auth_2 import OAuth2
from restapisdk.controllers.session_controller import SessionController
from restapisdk.controllers.user_controller import UserController
from restapisdk.controllers.group_controller import GroupController
from restapisdk.controllers.org_controller import OrgController
from restapisdk.controllers.metadata_controller import MetadataController
from restapisdk.controllers.database_controller import DatabaseController
from restapisdk.controllers.connection_controller import ConnectionController
from restapisdk.controllers.data_controller import DataController
from restapisdk.controllers.report_controller import ReportController
from restapisdk.controllers.admin_controller import AdminController
from restapisdk.controllers.security_controller import SecurityController
from restapisdk.controllers.logs_controller import LogsController
from restapisdk.controllers.materialization_controller\
    import MaterializationController
from restapisdk.controllers.custom_actions_controller\
    import CustomActionsController


class RestapisdkClient(object):

    @lazy_property
    def session(self):
        return SessionController(self.config, self.auth_managers)

    @lazy_property
    def user(self):
        return UserController(self.config, self.auth_managers)

    @lazy_property
    def group(self):
        return GroupController(self.config, self.auth_managers)

    @lazy_property
    def org(self):
        return OrgController(self.config, self.auth_managers)

    @lazy_property
    def metadata(self):
        return MetadataController(self.config, self.auth_managers)

    @lazy_property
    def database(self):
        return DatabaseController(self.config, self.auth_managers)

    @lazy_property
    def connection(self):
        return ConnectionController(self.config, self.auth_managers)

    @lazy_property
    def data(self):
        return DataController(self.config, self.auth_managers)

    @lazy_property
    def report(self):
        return ReportController(self.config, self.auth_managers)

    @lazy_property
    def admin(self):
        return AdminController(self.config, self.auth_managers)

    @lazy_property
    def security(self):
        return SecurityController(self.config, self.auth_managers)

    @lazy_property
    def logs(self):
        return LogsController(self.config, self.auth_managers)

    @lazy_property
    def materialization(self):
        return MaterializationController(self.config, self.auth_managers)

    @lazy_property
    def custom_actions(self):
        return CustomActionsController(self.config, self.auth_managers)

    def __init__(self, http_client_instance=None,
                 override_http_client_configuration=False, http_call_back=None,
                 timeout=60, max_retries=0, backoff_factor=2,
                 retry_statuses=[408, 413, 429, 500, 502, 503, 504, 521, 522, 524, 408, 413, 429, 500, 502, 503, 504, 521, 522, 524],
                 retry_methods=['GET', 'PUT', 'GET', 'PUT'],
                 environment=Environment.PRODUCTION,
                 base_url='https://localhost:443', access_token='',
                 accept_language='application/json',
                 content_type='application/json',
                 skip_ssl_cert_verification=False, config=None):
        if config is None:
            self.config = Configuration(
                                         http_client_instance=http_client_instance,
                                         override_http_client_configuration=override_http_client_configuration,
                                         http_call_back=http_call_back,
                                         timeout=timeout,
                                         max_retries=max_retries,
                                         backoff_factor=backoff_factor,
                                         retry_statuses=retry_statuses,
                                         retry_methods=retry_methods,
                                         environment=environment,
                                         base_url=base_url,
                                         access_token=access_token,
                                         accept_language=accept_language,
                                         content_type=content_type,
                                         skip_ssl_cert_verification=skip_ssl_cert_verification)
        else:
            self.config = config
        self.initialize_auth_managers(self.config)

    def initialize_auth_managers(self, config):
        self.auth_managers = { key: None for key in ['global']}
        self.auth_managers['global'] = OAuth2(config.access_token)
        return self.auth_managers
