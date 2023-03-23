class MetadataAnswerDataRequest():
	_names = {'metadata_identifier':'metadata_identifier','data_format':'data_format','record_offset':'record_offset','record_size':'record_size',}
	def __init__(self,metadata_identifier,data_format=None,record_offset=None,record_size=None,):
		'''
		Args:
		metadata_identifier (string): GUID or name of the Answer.
		data_format (string): JSON output format. By default, the API returns full data in the JSON.
		record_offset (integer): The starting record number from where the records should be included.
		record_size (integer): The number of records to include in a batch.
		'''
		self.metadata_identifier = metadata_identifier
		self.data_format = data_format
		self.record_offset = record_offset
		self.record_size = record_size
