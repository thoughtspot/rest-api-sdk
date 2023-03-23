class MetadataSearchRequest():
	_names = {'metadata':'metadata','permissions':'permissions','created_by_user_identifiers':'created_by_user_identifiers','dependent_object_version':'dependent_object_version','exclude_objects':'exclude_objects','favorite_object_options':'favorite_object_options','include_auto_created_objects':'include_auto_created_objects','include_dependent_objects':'include_dependent_objects','include_details':'include_details','include_headers':'include_headers','include_hidden_objects':'include_hidden_objects','include_incomplete_objects':'include_incomplete_objects','include_visualization_headers':'include_visualization_headers','include_worksheet_search_assist_data':'include_worksheet_search_assist_data','modified_by_user_identifiers':'modified_by_user_identifiers','record_offset':'record_offset','record_size':'record_size','sort_options':'sort_options','tag_identifiers':'tag_identifiers',}
	def __init__(self,metadata=None,permissions=None,created_by_user_identifiers=None,dependent_object_version=None,exclude_objects=None,favorite_object_options=None,include_auto_created_objects=None,include_dependent_objects=None,include_details=None,include_headers=None,include_hidden_objects=None,include_incomplete_objects=None,include_visualization_headers=None,include_worksheet_search_assist_data=None,modified_by_user_identifiers=None,record_offset=None,record_size=None,sort_options=None,tag_identifiers=None,):
		'''
		Args:
		metadata (array<MetadataListItemInput>): Metadata objects such as Liveboards, Answers, and Worksheets.
		permissions (array<PermissionInput>): Object permission details to search by.
		created_by_user_identifiers (array<string>): GUID or name of user who created the metadata object.
		dependent_object_version (string): Version of the dependent table of the metadata like worksheets.
		exclude_objects (array<ExcludeMetadataListItemInput>): List of metadata objects to exclude from search.
		favorite_object_options (FavoriteObjectOptionsInput): Options to sort the API response by objects set as favorites  for the logged-in user or the users specified in the API request.
		include_auto_created_objects (boolean): Includes system-generated metadata objects.
		include_dependent_objects (boolean): Includes dependents of the metadata object specified in the API request. For example, a worksheet can consist of dependent objects such as Liveboards or Answers.
		include_details (boolean): Includes complete details of the metadata objects.
		include_headers (boolean): Includes headers of the metadata objects.
		include_hidden_objects (boolean): Includes details of the hidden objects, such as a column in a worksheet or a table.
		include_incomplete_objects (boolean): Includes objects with incomplete metadata.
		include_visualization_headers (boolean): Includes visualization headers of the specified Liveboard object.
		include_worksheet_search_assist_data (boolean): If search assistance lessons are configured on a worksheet,  the API returns the search assist data for Worksheet objects.
		modified_by_user_identifiers (array<string>): Includes ID or names of the users who have modified the metadata object.
		record_offset (integer): The starting record number from where the records should be included.
		record_size (integer): The number of records that should be included.
		sort_options (SortOptions): Sort options to filter metadata details.
		tag_identifiers (array<string>): Tags to filter metadata objects by.
		'''
		self.metadata = metadata
		self.permissions = permissions
		self.created_by_user_identifiers = created_by_user_identifiers
		self.dependent_object_version = dependent_object_version
		self.exclude_objects = exclude_objects
		self.favorite_object_options = favorite_object_options
		self.include_auto_created_objects = include_auto_created_objects
		self.include_dependent_objects = include_dependent_objects
		self.include_details = include_details
		self.include_headers = include_headers
		self.include_hidden_objects = include_hidden_objects
		self.include_incomplete_objects = include_incomplete_objects
		self.include_visualization_headers = include_visualization_headers
		self.include_worksheet_search_assist_data = include_worksheet_search_assist_data
		self.modified_by_user_identifiers = modified_by_user_identifiers
		self.record_offset = record_offset
		self.record_size = record_size
		self.sort_options = sort_options
		self.tag_identifiers = tag_identifiers
