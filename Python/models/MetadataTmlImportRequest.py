class MetadataTmlImportRequest():
	_names = {'metadata_tmls':'metadata_tmls','import_policy':'import_policy','create_new':'create_new',}
	def __init__(self,metadata_tmls,import_policy=None,create_new=None,):
		'''
		Args:
		metadata_tmls (array<string>): Details of TML objects.
		import_policy (string): Specifies the import policy for the TML import.
		create_new (boolean): If selected, creates TML objects with new GUIDs.
		'''
		self.metadata_tmls = metadata_tmls
		self.import_policy = import_policy
		self.create_new = create_new
