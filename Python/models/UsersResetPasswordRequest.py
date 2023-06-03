class UsersResetPasswordRequest():
	_names = {'new_password':'new_password','user_identifier':'user_identifier',}
	def __init__(self,new_password,user_identifier,):
		'''
		Args:
		new_password (string): New password for the user.
		user_identifier (string): GUID or name of the user.
		'''
		self.new_password = new_password
		self.user_identifier = user_identifier
