class AuthTokenObjectRequest():
	_names = {'username':'username','object_id':'object_id','password':'password','secret_key':'secret_key','validity_time_in_sec':'validity_time_in_sec','org_id':'org_id','email':'email','display_name':'display_name','auto_create':'auto_create','group_identifiers':'group_identifiers',}
	def __init__(self,username,object_id,password=None,secret_key=None,validity_time_in_sec=None,org_id=None,email=None,display_name=None,auto_create=None,group_identifiers=None,):
		'''
		Args:
		username (string): Username of the user account.
		object_id (string): GUID of the ThoughtSpot object. If set, the bearer will only have access to the specified Liveboard or another object.
		password (string): The password of the user account.
		secret_key (string): The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates this secret key when you enable trusted authentication.
		validity_time_in_sec (integer): Duration in seconds after which the token expires.
		org_id (integer): Id of the Org to be associated with the user login. If no input is provided then last logged in Org will be considered.
		email (string): Indicates email id of the user. Use this parameter to provision a user just-in-time (JIT).
		display_name (string): Indicates display name of the user. Use this parameter to provision a user just-in-time (JIT).
		auto_create (boolean): “Creates a new user if the specified username does not already exist in ThoughtSpot. Use this parameter to provision a user just-in-time (JIT).
		group_identifiers (array<string>): Unique ID or name of the User Groups to which newly created user to be added. Use this parameter to provision a user just-in-time (JIT).
		'''
		self.username = username
		self.object_id = object_id
		self.password = password
		self.secret_key = secret_key
		self.validity_time_in_sec = validity_time_in_sec
		self.org_id = org_id
		self.email = email
		self.display_name = display_name
		self.auto_create = auto_create
		self.group_identifiers = group_identifiers
