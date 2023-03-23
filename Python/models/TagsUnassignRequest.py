class TagsUnassignRequest():
	_names = {'metadata':'metadata','tag_identifiers':'tag_identifiers',}
	def __init__(self,metadata,tag_identifiers,):
		'''
		Args:
		metadata (array<TagMetadataTypeInput>): Metadata objects.
		tag_identifiers (array<string>): GUID or name of the tag.
		'''
		self.metadata = metadata
		self.tag_identifiers = tag_identifiers
