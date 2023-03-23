class VcsGitConfigUpdateRequest():
	_names = {'username':'username','access_token':'access_token','default_branch':'default_branch',}
	def __init__(self,username=None,access_token=None,default_branch=None,):
		'''
		Args:
		username (string): Username to authenticate connection to vcs.
		access_token (string): Access token corresponding to the user to authenticate connection to vcs.
		default_branch (string): Name of the default remote branch.
		'''
		self.username = username
		self.access_token = access_token
		self.default_branch = default_branch
