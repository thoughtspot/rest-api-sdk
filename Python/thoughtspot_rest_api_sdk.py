from utilities.decorators import lazy_property
from utilities.configuration import Configuration
from utilities.configuration import Environment
from typing import Dict, Any
import requests
from controllers.auth_controller import AuthController
from controllers.users_controller import UsersController
from controllers.system_controller import SystemController
from controllers.orgs_controller import OrgsController
from controllers.tags_controller import TagsController
from controllers.groups_controller import GroupsController
from controllers.metadata_controller import MetadataController
from controllers.report_controller import ReportController
from controllers.security_controller import SecurityController
from controllers.searchdata_controller import SearchdataController
from controllers.logs_controller import LogsController
from controllers.vcs_controller import VcsController
from controllers.connection_controller import ConnectionController
class ThoughtSpotRestApiSdk(object):
	@lazy_property
	def auth(self):
		return AuthController(self.config)
	@lazy_property
	def users(self):
		return UsersController(self.config)
	@lazy_property
	def system(self):
		return SystemController(self.config)
	@lazy_property
	def orgs(self):
		return OrgsController(self.config)
	@lazy_property
	def tags(self):
		return TagsController(self.config)
	@lazy_property
	def groups(self):
		return GroupsController(self.config)
	@lazy_property
	def metadata(self):
		return MetadataController(self.config)
	@lazy_property
	def report(self):
		return ReportController(self.config)
	@lazy_property
	def security(self):
		return SecurityController(self.config)
	@lazy_property
	def searchdata(self):
		return SearchdataController(self.config)
	@lazy_property
	def logs(self):
		return LogsController(self.config)
	@lazy_property
	def vcs(self):
		return VcsController(self.config)
	@lazy_property
	def connection(self):
		return ConnectionController(self.config)
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
			
	def login(self, user_name: str, password: str, validity_time: int = 14400) -> None:
		'''
		Logs in to the ThoughtSpot server and obtains an authentication token.
		'''
		end_point: str = '/api/rest/2.0/auth/token/full'
		url: str = self.config.base_url + end_point
		headers: Dict[str, str] = {'Accept': 'application/json', 'Content-Type': 'application/json'}
		data: Dict[str, Any] = {'username': user_name, 'password': password, 'validity_time_in_sec': validity_time}
		response: requests.Response = requests.post(url, headers=headers, json=data, verify=self.config.skip_ssl_cert_verification)
		response.raise_for_status()
		self.config.access_token: str = 'Bearer ' + response.json()['token']