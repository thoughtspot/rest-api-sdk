class VcsGitCommitsSearchRequest():
	_names = {'metadata_identifier':'metadata_identifier','metadata_type':'metadata_type','branch_name':'branch_name','record_offset':'record_offset','record_size':'record_size',}
	def __init__(self,metadata_identifier,metadata_type,branch_name=None,record_offset=None,record_size=None,):
		'''
		Args:
		metadata_identifier (string): Unique ID or name of the metadata.
		metadata_type (string): Type of metadata.
		branch_name (string): Name of the branch from which commit history needs to be displayed.
		record_offset (integer): Record offset point in the commit history to display the response.
		record_size (integer): Number of history records from record offset point to be displayed in the response.
		'''
		self.metadata_identifier = metadata_identifier
		self.metadata_type = metadata_type
		self.branch_name = branch_name
		self.record_offset = record_offset
		self.record_size = record_size
