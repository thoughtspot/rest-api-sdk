class SecurityMetadataAssignRequest():
	_names = {'metadata':'metadata','user_identifier':'user_identifier','current_owner_identifier':'current_owner_identifier',}
	def __init__(self,metadata,user_identifier,current_owner_identifier=None,):
		'''
		Args:
		metadata (array<AuthorMetadataTypeInput>): GUID or name of the metadata object.
		user_identifier (string): GUID or name of the user who you want to assign as the author.
		current_owner_identifier (string): GUID or name of the current author.  When defined, the metadata objects  authored by the specified owner are filtered for the API operation.
		'''
		self.metadata = metadata
		self.user_identifier = user_identifier
		self.current_owner_identifier = current_owner_identifier
