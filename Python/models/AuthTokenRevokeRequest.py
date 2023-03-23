class AuthTokenRevokeRequest():
	_names = {'user_identifier':'user_identifier','token':'token',}
	def __init__(self,user_identifier=None,token=None,):
		'''
		Args:
		user_identifier (string): .
		token (string): .
		'''
		self.user_identifier = user_identifier
		self.token = token
