class TagsSearchRequest():
	_names = {'tag_identifier':'tag_identifier','color':'color',}
	def __init__(self,tag_identifier=None,color=None,):
		'''
		Args:
		tag_identifier (string): Name or Id of the tag.
		color (string): Color of the tag.
		'''
		self.tag_identifier = tag_identifier
		self.color = color
