class VcsGitCommitsDeployRequest():
	_names = {'import_type':'import_type','commit_id':'commit_id',}
	def __init__(self,commit_id,import_type=None,):
		'''
		Args:
		import_type (string): Indicates if all files or only modified file at specified commit point should be considered.
		commit_id (string): Commit_id against which the files should be picked to deploy.
		'''
		self.import_type = import_type
		self.commit_id = commit_id
