class MetadataLiveboardSqlRequest():
	_names = {'metadata_identifier':'metadata_identifier','visualization_identifiers':'visualization_identifiers',}
	def __init__(self,metadata_identifier,visualization_identifiers=None,):
		'''
		Args:
		metadata_identifier (string): ID or name of an Liveboard.
		visualization_identifiers (array<string>): Unique ID or name of visualizations.
		'''
		self.metadata_identifier = metadata_identifier
		self.visualization_identifiers = visualization_identifiers
