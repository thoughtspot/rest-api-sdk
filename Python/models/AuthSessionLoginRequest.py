class AuthSessionLoginRequest():
	_names = {'username':'username','password':'password','org_identifier':'org_identifier','remember_me':'remember_me',}
	def __init__(self,username=None,password=None,org_identifier=None,remember_me=None,):
		'''
		Args:
		username (string): Username of the user account.
		password (string): The password of the user account.
		org_identifier (string): Id of the Org to be associated with the user login. If no input is provided then last logged in Org will be considered.
		remember_me (boolean): A flag to remember the user session. When set to true, sets a session cookie that persists in subsequent API calls.
		'''
		self.username = username
		self.password = password
		self.org_identifier = org_identifier
		self.remember_me = remember_me
