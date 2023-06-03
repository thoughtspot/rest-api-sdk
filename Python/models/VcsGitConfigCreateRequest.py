class VcsGitConfigCreateRequest():
	_names = {'repository_url':'repository_url','default_branch':'default_branch','username':'username','access_token':'access_token',}
	def __init__(self,repository_url,username,access_token,default_branch=None,):
		'''
		Args:
		repository_url (string): URL for connecting to remote repository.
		default_branch (string): Name of the default remote branch.
		username (string): Username to authenticate connection to remote repository.
		access_token (string): Access token corresponding to the user to authenticate connection to remote repository.
		'''
		self.repository_url = repository_url
		self.default_branch = default_branch
		self.username = username
		self.access_token = access_token
