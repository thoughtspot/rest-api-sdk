class SearchdataRequest():
	_names = {'query_string':'query_string','logical_table_identifier':'logical_table_identifier','data_format':'data_format','record_offset':'record_offset','record_size':'record_size',}
	def __init__(self,query_string,logical_table_identifier,data_format=None,record_offset=None,record_size=None,):
		'''
		Args:
		query_string (string): Data search query string token.
		logical_table_identifier (string): GUID of the data source object, such as a worksheet, view, or table.
		data_format (string): JSON output format. By default, the API returns full data in the JSON.
		record_offset (integer): The starting record number from where the records should be included.
		record_size (integer): The number of records to include in a batch.
		'''
		self.query_string = query_string
		self.logical_table_identifier = logical_table_identifier
		self.data_format = data_format
		self.record_offset = record_offset
		self.record_size = record_size
