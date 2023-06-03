from models import *
from utilities.api_helper import APIHelper
import requests
from controllers.base_controller import BaseController
class ConnectionController(BaseController):
	def __init__(self, config,):
		super(ConnectionController, self).__init__(config,)
	def searchConnection(self, body: ConnectionSearchRequest):
		end_point = '/api/rest/2.0/connection/search'
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
	def createConnection(self, body: ConnectionCreateRequest):
		end_point = '/api/rest/2.0/connection/create'
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
	def deleteConnection(self, body: ConnectionDeleteRequest):
		end_point = '/api/rest/2.0/connection/delete'
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
	def updateConnection(self, body: ConnectionUpdateRequest):
		end_point = '/api/rest/2.0/connection/update'
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
