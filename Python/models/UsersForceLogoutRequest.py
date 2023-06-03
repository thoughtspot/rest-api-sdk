class UsersForceLogoutRequest():
	_names = {'user_identifiers':'user_identifiers',}
	def __init__(self,user_identifiers=None,):
		'''
		Args:
		user_identifiers (array<string>): GUID or name of the users for force logging out their sessions.
		'''
		self.user_identifiers = user_identifiers
