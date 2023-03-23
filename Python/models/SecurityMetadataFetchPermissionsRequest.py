class SecurityMetadataFetchPermissionsRequest():
	_names = {'metadata':'metadata','principals':'principals','include_dependent_objects':'include_dependent_objects',}
	def __init__(self,metadata,principals=None,include_dependent_objects=None,):
		'''
		Args:
		metadata (array<PermissionsMetadataTypeInput>): GUID or name of the metadata object.
		principals (array<PrincipalsInput>): Principal objects for which you want to fetch permissions.  If not specified, the API returns all users and groups that  can access the specified metadata objects.
		include_dependent_objects (boolean): Indicates whether to fetch permissions of depedent metadata objects.
		'''
		self.metadata = metadata
		self.principals = principals
		self.include_dependent_objects = include_dependent_objects
