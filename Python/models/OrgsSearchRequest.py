class OrgsSearchRequest():
	_names = {'org_identifier':'org_identifier','description':'description','visibility':'visibility','status':'status','user_identifiers':'user_identifiers',}
	def __init__(self,org_identifier=None,description=None,visibility=None,status=None,user_identifiers=None,):
		'''
		Args:
		org_identifier (string): ID or name of the Org.
		description (string): Description of the Org.
		visibility (string): Visibility of the Org.
		status (string): Status of the Org.
		user_identifiers (array<string>): GUIDs or names of the users for which you want to retrieve the Orgs data.
		'''
		self.org_identifier = org_identifier
		self.description = description
		self.visibility = visibility
		self.status = status
		self.user_identifiers = user_identifiers
