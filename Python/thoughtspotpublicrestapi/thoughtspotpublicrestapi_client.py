# -*- coding: utf-8 -*-

"""
thoughtspotpublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

from apimatic_core.configurations.global_configuration import GlobalConfiguration
from apimatic_core.decorators.lazy_property import LazyProperty
from thoughtspotpublicrestapi.configuration import Configuration
from thoughtspotpublicrestapi.controllers.base_controller import BaseController
from thoughtspotpublicrestapi.configuration import Environment
from thoughtspotpublicrestapi.http.auth.o_auth_2 import OAuth2
from thoughtspotpublicrestapi.controllers.user_controller import UserController
from thoughtspotpublicrestapi.controllers.group_controller\
    import GroupController
from thoughtspotpublicrestapi.controllers.metadata_controller\
    import MetadataController
from thoughtspotpublicrestapi.controllers.database_controller\
    import DatabaseController
from thoughtspotpublicrestapi.controllers.connection_controller\
    import ConnectionController
from thoughtspotpublicrestapi.controllers.data_controller import DataController
from thoughtspotpublicrestapi.controllers.logs_controller import LogsController
from thoughtspotpublicrestapi.controllers.custom_actions_controller\
    import CustomActionsController
from thoughtspotpublicrestapi.controllers.security_controller\
    import SecurityController
from thoughtspotpublicrestapi.controllers.org_controller import OrgController
from thoughtspotpublicrestapi.controllers.session_controller\
    import SessionController
from thoughtspotpublicrestapi.controllers.admin_controller\
    import AdminController
from thoughtspotpublicrestapi.controllers.report_controller\
    import ReportController
from thoughtspotpublicrestapi.controllers.materialization_controller\
    import MaterializationController


class ThoughtspotpublicrestapiClient(object):

    @LazyProperty
    def user(self):
        return UserController(self.global_configuration)

    @LazyProperty
    def group(self):
        return GroupController(self.global_configuration)

    @LazyProperty
    def metadata(self):
        return MetadataController(self.global_configuration)

    @LazyProperty
    def database(self):
        return DatabaseController(self.global_configuration)

    @LazyProperty
    def connection(self):
        return ConnectionController(self.global_configuration)

    @LazyProperty
    def data(self):
        return DataController(self.global_configuration)

    @LazyProperty
    def logs(self):
        return LogsController(self.global_configuration)

    @LazyProperty
    def custom_actions(self):
        return CustomActionsController(self.global_configuration)

    @LazyProperty
    def security(self):
        return SecurityController(self.global_configuration)

    @LazyProperty
    def org(self):
        return OrgController(self.global_configuration)

    @LazyProperty
    def session(self):
        return SessionController(self.global_configuration)

    @LazyProperty
    def admin(self):
        return AdminController(self.global_configuration)

    @LazyProperty
    def report(self):
        return ReportController(self.global_configuration)

    @LazyProperty
    def materialization(self):
        return MaterializationController(self.global_configuration)

    def __init__(self, http_client_instance=None,
                 override_http_client_configuration=False, http_call_back=None,
                 timeout=60, max_retries=0, backoff_factor=2,
                 retry_statuses=[408, 413, 429, 500, 502, 503, 504, 521, 522, 524, 408, 413, 429, 500, 502, 503, 504, 521, 522, 524],
                 retry_methods=['GET', 'PUT', 'GET', 'PUT'],
                 environment=Environment.PRODUCTION,
                 base_url='https://localhost:443', access_token='',
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
                                         skip_ssl_cert_verification=skip_ssl_cert_verification)
        else:
            self.config = config

        self.global_configuration = GlobalConfiguration(self.config)\
            .global_errors(BaseController.global_errors())\
            .base_uri_executor(self.config.get_base_uri)\
            .user_agent(BaseController.user_agent(), BaseController.user_agent_parameters())
        self.initialize_auth_managers(self.global_configuration)

        self.global_configuration = self.global_configuration.auth_managers(self.auth_managers)

    def initialize_auth_managers(self, global_config):
        http_client_config = global_config.get_http_client_configuration()
        self.auth_managers = { key: None for key in ['global']}
        self.auth_managers['global'] = OAuth2(http_client_config.access_token)
        return self.auth_managers