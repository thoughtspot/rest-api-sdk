class VcsGitCommitsCommitIdRevertRequest():
	_names = {'metadata':'metadata','branch_name':'branch_name',}
	def __init__(self,metadata,branch_name=None,):
		'''
		Args:
		metadata (array<MetadataObject>): Metadata objects.
		branch_name (string): Name of the branch where the reverted version should be comitted.
		'''
		self.metadata = metadata
		self.branch_name = branch_name
