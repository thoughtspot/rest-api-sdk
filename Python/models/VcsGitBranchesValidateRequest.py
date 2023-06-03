class VcsGitBranchesValidateRequest():
	_names = {'source_branch_name':'source_branch_name','target_branch_name':'target_branch_name',}
	def __init__(self,source_branch_name,target_branch_name,):
		'''
		Args:
		source_branch_name (string): Name of the branch from which changes need to be picked for validation.
		target_branch_name (string): Name of the branch where files will be merged.
		'''
		self.source_branch_name = source_branch_name
		self.target_branch_name = target_branch_name
