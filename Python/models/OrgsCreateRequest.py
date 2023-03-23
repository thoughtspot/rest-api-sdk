class OrgsCreateRequest():
	_names = {'name':'name','description':'description',}
	def __init__(self,name,description=None,):
		'''
		Args:
		name (string): Name of the Org.
		description (string): Description of the Org.
		'''
		self.name = name
		self.description = description
