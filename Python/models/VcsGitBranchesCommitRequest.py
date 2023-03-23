class VcsGitBranchesCommitRequest():
	_names = {'metadata':'metadata','branch_name':'branch_name','comment':'comment',}
	def __init__(self,metadata,comment,branch_name=None,):
		'''
		Args:
		metadata (array<MetadataObject>): Metadata objects.
		branch_name (string): Name of the remote branch where object tml should be pushed.
		comment (string): Comment to be added to the commit.
		'''
		self.metadata = metadata
		self.branch_name = branch_name
		self.comment = comment
