class SecurityPrincipalsFetchPermissionsRequest():
	_names = {'principals':'principals','metadata':'metadata',}
	def __init__(self,principals,metadata=None,):
		'''
		Args:
		principals (array<PrincipalsInput>): GUID or name of the principal.
		metadata (array<PermissionsMetadataTypeInput>): Metadata objects for which you want to fetch permission details.  If not specified, the API returns permission details for all  metadata objects that the specified users and groups can access.
		'''
		self.principals = principals
		self.metadata = metadata
