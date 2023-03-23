class ReportLiveboardRequest():
	_names = {'metadata_identifier':'metadata_identifier','visualization_identifiers':'visualization_identifiers','transient_content':'transient_content','file_format':'file_format','runtime_filter':'runtime_filter','runtime_sort':'runtime_sort','pdf_options':'pdf_options',}
	def __init__(self,metadata_identifier,visualization_identifiers=None,transient_content=None,file_format=None,runtime_filter=None,runtime_sort=None,pdf_options=None,):
		'''
		Args:
		metadata_identifier (string): GUID or name of the Liveboard object.
		visualization_identifiers (array<string>): GUID or name of visualizations on the Liveboard. If this parameter is  not defined, the API returns a report with all visualizations saved on a Liveboard.
		transient_content (string): Transient content of the Liveboard.
		file_format (string): Export file format.
		runtime_filter (object): JSON string representing runtime filter. { col1:'region', op1: 'EQ', val1: 'northeast' }.
		runtime_sort (object): JSON string representing runtime sort. { sortCol1: 'region', asc1 : true, sortCol2 : 'date' }.
		pdf_options (PdfOptionsInput): Options for PDF export.
		'''
		self.metadata_identifier = metadata_identifier
		self.visualization_identifiers = visualization_identifiers
		self.transient_content = transient_content
		self.file_format = file_format
		self.runtime_filter = runtime_filter
		self.runtime_sort = runtime_sort
		self.pdf_options = pdf_options
