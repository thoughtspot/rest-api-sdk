class ConnectionUpdateRequest():
	_names = {'connection_identifier':'connection_identifier','name':'name','description':'description','data_warehouse_config':'data_warehouse_config','validate':'validate',}
	def __init__(self,connection_identifier,name=None,description=None,data_warehouse_config=None,validate=None,):
		'''
		Args:
		connection_identifier (string): Unique ID or name of the connection.
		name (string): Updated name of the connection.
		description (string): Updated description of the connection.
		data_warehouse_config (object): Configuration of the data warehouse in JSON.
		validate (boolean): Indicates whether to validate the connection details.
		'''
		self.connection_identifier = connection_identifier
		self.name = name
		self.description = description
		self.data_warehouse_config = data_warehouse_config
		self.validate = validate
