class ConnectionSearchRequest():
	_names = {'connections':'connections','data_warehouse_types':'data_warehouse_types','record_offset':'record_offset','record_size':'record_size','tag_identifiers':'tag_identifiers','data_warehouse_object_type':'data_warehouse_object_type','sort_options':'sort_options','include_details':'include_details',}
	def __init__(self,connections=None,data_warehouse_types=None,record_offset=None,record_size=None,tag_identifiers=None,data_warehouse_object_type=None,sort_options=None,include_details=None,):
		'''
		Args:
		connections (array<ConnectionInput>): List of connections and name pattern.
		data_warehouse_types (array<string>): Array of types of data warehouse defined for the connection. The acceptable values are: SNOWFLAKE, AMAZON_REDSHIFT, GOOGLE_BIGQUERY, AZURE_SYNAPSE, TERADATA, SAP_HANA, STARBURST, ORACLE_ADW, DATABRICKS, DENODO, DREMIO, TRINO, PRESTO
		record_offset (integer): The starting record number from where the records should be included.
		record_size (integer): The number of records that should be included.
		tag_identifiers (array<string>): Unique ID or name of tags.
		data_warehouse_object_type (string): Data warehouse object type.
		sort_options (SortOptionInput): Sort options.
		include_details (boolean): Indicates whether to include complete details of the connection objects.
		'''
		self.connections = connections
		self.data_warehouse_types = data_warehouse_types
		self.record_offset = record_offset
		self.record_size = record_size
		self.tag_identifiers = tag_identifiers
		self.data_warehouse_object_type = data_warehouse_object_type
		self.sort_options = sort_options
		self.include_details = include_details
