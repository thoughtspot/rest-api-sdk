class OrgsOrgIdentifierUpdateRequest():
	_names = {'name':'name','description':'description','user_identifiers':'user_identifiers',}
	def __init__(self,name=None,description=None,user_identifiers=None,):
		'''
		Args:
		name (string): Name of the Org.
		description (string): Description of the Org.
		user_identifiers (array<string>): Add Users to an Org.
		'''
		self.name = name
		self.description = description
		self.user_identifiers = user_identifiers
