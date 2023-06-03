class TagsCreateRequest():
	_names = {'name':'name','color':'color',}
	def __init__(self,name,color,):
		'''
		Args:
		name (string): Name of the tag.
		color (string): Hex color code to be assigned to the tag. For example, #ff78a9.
		'''
		self.name = name
		self.color = color
