from models import *
from utilities.api_helper import APIHelper
import requests
from controllers.base_controller import BaseController
class AuthController(BaseController):
	def __init__(self, config,):
		super(AuthController, self).__init__(config,)
	def getCurrentUserInfo(self,):
		end_point = '/api/rest/2.0/auth/session/user'
		url: str = self.config.base_url + end_point
		headers: dict = {'Accept': self.config.accept_language, 'Content-Type': self.config.content_type, 'Authorization': self.config.access_token}
		ssl_flag: bool = self.config.skip_ssl_cert_verification
		response: requests.Response = requests.post(url=url, headers=headers, verify=ssl_flag)
		response.raise_for_status()
		return response.json()
	def login(self, body: AuthSessionLoginRequest):
		end_point = '/api/rest/2.0/auth/session/login'
		url: str = self.config.base_url + end_point
		headers: dict = {'Accept': self.config.accept_language, 'Content-Type': self.config.content_type, 'Authorization': self.config.access_token}
		data: dict = APIHelper.to_dictionary(body)
		ssl_flag: bool = self.config.skip_ssl_cert_verification
		response: requests.Response = requests.post(url=url, headers=headers, json=data, verify=ssl_flag)
		if response.status_code == 200:
			return response.json()
		elif response.status_code == 204:
			return 'Success'
		else:
			response.raise_for_status()
			return
	def getObjectAccessToken(self, body: AuthTokenObjectRequest):
		end_point = '/api/rest/2.0/auth/token/object'
		url: str = self.config.base_url + end_point
		headers: dict = {'Accept': self.config.accept_language, 'Content-Type': self.config.content_type, 'Authorization': self.config.access_token}
		data: dict = APIHelper.to_dictionary(body)
		ssl_flag: bool = self.config.skip_ssl_cert_verification
		response: requests.Response = requests.post(url=url, headers=headers, json=data, verify=ssl_flag)
		if response.status_code == 200:
			return response.json()
		elif response.status_code == 204:
			return 'Success'
		else:
			response.raise_for_status()
			return
	def getFullAccessToken(self, body: AuthTokenFullRequest):
		end_point = '/api/rest/2.0/auth/token/full'
		url: str = self.config.base_url + end_point
		headers: dict = {'Accept': self.config.accept_language, 'Content-Type': self.config.content_type, 'Authorization': self.config.access_token}
		data: dict = APIHelper.to_dictionary(body)
		ssl_flag: bool = self.config.skip_ssl_cert_verification
		response: requests.Response = requests.post(url=url, headers=headers, json=data, verify=ssl_flag)
		if response.status_code == 200:
			return response.json()
		elif response.status_code == 204:
			return 'Success'
		else:
			response.raise_for_status()
			return
	def logout(self,):
		end_point = '/api/rest/2.0/auth/session/logout'
		url: str = self.config.base_url + end_point
		headers: dict = {'Accept': self.config.accept_language, 'Content-Type': self.config.content_type, 'Authorization': self.config.access_token}
		ssl_flag: bool = self.config.skip_ssl_cert_verification
		response: requests.Response = requests.post(url=url, headers=headers, verify=ssl_flag)
		if response.status_code == 200:
			return response.json()
		elif response.status_code == 204:
			return 'Success'
		else:
			response.raise_for_status()
			return
	def revokeToken(self, body: AuthTokenRevokeRequest):
		end_point = '/api/rest/2.0/auth/token/revoke'
		url: str = self.config.base_url + end_point
		headers: dict = {'Accept': self.config.accept_language, 'Content-Type': self.config.content_type, 'Authorization': self.config.access_token}
		data: dict = APIHelper.to_dictionary(body)
		ssl_flag: bool = self.config.skip_ssl_cert_verification
		response: requests.Response = requests.post(url=url, headers=headers, json=data, verify=ssl_flag)
		if response.status_code == 200:
			return response.json()
		elif response.status_code == 204:
			return 'Success'
		else:
			response.raise_for_status()
			return
