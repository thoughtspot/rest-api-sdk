class UsersImportRequest():
	_names = {'users':'users','default_password':'default_password','dry_run':'dry_run','delete_unspecified_users':'delete_unspecified_users',}
	def __init__(self,users,default_password=None,dry_run=None,delete_unspecified_users=None,):
		'''
		Args:
		users (array<ImportUser>): List of users needs to be imported.
		default_password (string): The default password to assign to users if they do not have a password assigned in ThoughtSpot. .
		dry_run (boolean): If true, the API performs a test operation and returns user IDs whose data will be edited after the import.
		delete_unspecified_users (boolean): If set to true, removes the users that are not specified in the API request.
		'''
		self.users = users
		self.default_password = default_password
		self.dry_run = dry_run
		self.delete_unspecified_users = delete_unspecified_users
