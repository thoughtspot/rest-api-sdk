class MetadataLiveboardDataRequest():
	_names = {'metadata_identifier':'metadata_identifier','visualization_identifiers':'visualization_identifiers','transient_content':'transient_content','data_format':'data_format','record_offset':'record_offset','record_size':'record_size',}
	def __init__(self,metadata_identifier,visualization_identifiers=None,transient_content=None,data_format=None,record_offset=None,record_size=None,):
		'''
		Args:
		metadata_identifier (string): GUID or name of the Liveboard.
		visualization_identifiers (array<string>): GUIDs or names of the visualizations on the Liveboard.
		transient_content (string): Transient content of the Liveboard.
		data_format (string): JSON output format. By default, the API returns full data in the JSON.
		record_offset (integer): The starting record number from where the records should be included.
		record_size (integer): The number of records to include in a batch.
		'''
		self.metadata_identifier = metadata_identifier
		self.visualization_identifiers = visualization_identifiers
		self.transient_content = transient_content
		self.data_format = data_format
		self.record_offset = record_offset
		self.record_size = record_size
