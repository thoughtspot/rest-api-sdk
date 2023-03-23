class ReportAnswerRequest():
	_names = {'metadata_identifier':'metadata_identifier','file_format':'file_format','runtime_filter':'runtime_filter','runtime_sort':'runtime_sort',}
	def __init__(self,metadata_identifier,file_format=None,runtime_filter=None,runtime_sort=None,):
		'''
		Args:
		metadata_identifier (string): Unique ID or name of the metadata.
		file_format (string): Export file format.
		runtime_filter (object): JSON string representing runtime filter. { col1:region, op1: EQ, val1: northeast }.
		runtime_sort (object): JSON string representing runtime sort. { sortCol1: region, asc1 :true, sortCol2 : date }.
		'''
		self.metadata_identifier = metadata_identifier
		self.file_format = file_format
		self.runtime_filter = runtime_filter
		self.runtime_sort = runtime_sort
