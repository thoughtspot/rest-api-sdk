from models import *
from utilities.api_helper import APIHelper
import requests
from controllers.base_controller import BaseController
class TagsController(BaseController):
	def __init__(self, config,):
		super(TagsController, self).__init__(config,)
	def searchTags(self, body: TagsSearchRequest):
		end_point = '/api/rest/2.0/tags/search'
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
	def createTag(self, body: TagsCreateRequest):
		end_point = '/api/rest/2.0/tags/create'
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
	def updateTag(self, tag_identifier: str, body: TagsTagIdentifierUpdateRequest):
		end_point = f'/api/rest/2.0/tags/{tag_identifier}/update'
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
	def deleteTag(self, tag_identifier: str,):
		end_point = f'/api/rest/2.0/tags/{tag_identifier}/delete'
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
	def assignTag(self, body: TagsAssignRequest):
		end_point = '/api/rest/2.0/tags/assign'
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
	def unassignTag(self, body: TagsUnassignRequest):
		end_point = '/api/rest/2.0/tags/unassign'
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
