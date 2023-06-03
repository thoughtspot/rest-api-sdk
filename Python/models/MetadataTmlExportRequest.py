class MetadataTmlExportRequest():
	_names = {'metadata':'metadata','export_associated':'export_associated','export_fqn':'export_fqn',}
	def __init__(self,metadata,export_associated=None,export_fqn=None,):
		'''
		Args:
		metadata (array<ExportMetadataTypeInput>): Metadata objects.
		export_associated (boolean): Indicates whether to export associated metadata objects of specified metadata objects.
		export_fqn (boolean): Adds FQNs of the referenced objects. For example, if you are exporting a Liveboard and its associated objects,  the API returns the Liveboard TML data with the FQNs of the referenced worksheet. If the exported TML data includes FQNs, you don't need to manually add FQNs of the referenced objects during TML import.
		'''
		self.metadata = metadata
		self.export_associated = export_associated
		self.export_fqn = export_fqn
