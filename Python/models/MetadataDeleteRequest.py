class MetadataDeleteRequest():
	_names = {'metadata':'metadata','delete_disabled_objects':'delete_disabled_objects',}
	def __init__(self,metadata,delete_disabled_objects=None,):
		'''
		Args:
		metadata (array<DeleteMetadataTypeInput>): Metadata objects.
		delete_disabled_objects (boolean): Indicates whether to delete disabled metadata objects.
		'''
		self.metadata = metadata
		self.delete_disabled_objects = delete_disabled_objects
