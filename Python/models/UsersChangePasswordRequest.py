class UsersChangePasswordRequest():
	_names = {'current_password':'current_password','new_password':'new_password','user_identifier':'user_identifier',}
	def __init__(self,current_password,new_password,user_identifier,):
		'''
		Args:
		current_password (string): Current password of the user.
		new_password (string): New password for the user.
		user_identifier (string): GUID or name of the user.
		'''
		self.current_password = current_password
		self.new_password = new_password
		self.user_identifier = user_identifier
