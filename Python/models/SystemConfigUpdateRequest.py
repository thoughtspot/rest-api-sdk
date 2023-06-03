class SystemConfigUpdateRequest():
	_names = {'configuration':'configuration',}
	def __init__(self,configuration,):
		'''
		Args:
		configuration (object): Configuration JSON with the key-value pair of configuration attributes to be updated.
		'''
		self.configuration = configuration
