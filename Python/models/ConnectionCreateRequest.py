class ConnectionCreateRequest():
	_names = {'name':'name','description':'description','data_warehouse_type':'data_warehouse_type','data_warehouse_config':'data_warehouse_config','validate':'validate',}
	def __init__(self,name,data_warehouse_type,data_warehouse_config,description=None,validate=None,):
		'''
		Args:
		name (string): Unique name for the connection.
		description (string): Description of the connection.
		data_warehouse_type (string): Type of the data warehouse.
		data_warehouse_config (object): Configuration of the data warehouse in JSON.
		validate (boolean): Indicates whether to validate the connection details.
		'''
		self.name = name
		self.description = description
		self.data_warehouse_type = data_warehouse_type
		self.data_warehouse_config = data_warehouse_config
		self.validate = validate
