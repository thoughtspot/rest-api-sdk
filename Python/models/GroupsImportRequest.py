class GroupsImportRequest():
	_names = {'groups':'groups','delete_unspecified_groups':'delete_unspecified_groups','dry_run':'dry_run',}
	def __init__(self,groups=None,delete_unspecified_groups=None,dry_run=None,):
		'''
		Args:
		groups (array<GroupsImportListInput>): Details of user groups which are to be imported.
		delete_unspecified_groups (boolean): If set to true, removes groups that are not specified in the API request.
		dry_run (boolean): If true, the API performs a test operation and returns user IDs whose  data will be edited after the import.
		'''
		self.groups = groups
		self.delete_unspecified_groups = delete_unspecified_groups
		self.dry_run = dry_run
