class ConnectionDeleteRequest():
	_names = {'connection_identifier':'connection_identifier',}
	def __init__(self,connection_identifier,):
		'''
		Args:
		connection_identifier (string): Unique ID or name of the connection.
		'''
		self.connection_identifier = connection_identifier
