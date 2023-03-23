class GroupsGroupIdentifierUpdateRequest():
	_names = {'name':'name','default_liveboard_identifiers':'default_liveboard_identifiers','description':'description','display_name':'display_name','privileges':'privileges','sub_group_identifiers':'sub_group_identifiers','type':'type','user_identifiers':'user_identifiers','visibility':'visibility',}
	def __init__(self,name=None,default_liveboard_identifiers=None,description=None,display_name=None,privileges=None,sub_group_identifiers=None,type=None,user_identifiers=None,visibility=None,):
		'''
		Args:
		name (string): Name of the group to modify.
		default_liveboard_identifiers (array<string>): Unique ID of Liveboards to assign as default liveboards to the users in the group.
		description (string): Description for the group.
		display_name (string): Display name of the group.
		privileges (array<string>): Privileges to assign to the group. The acceptable values are: ADMINISTRATION, AUTHORING, USERDATAUPLOADING, DATADOWNLOADING, USERMANAGEMENT, DATAMANAGEMENT, SHAREWITHALL, JOBSCHEDULING, A3ANALYSIS, EXPERIMENTALFEATUREPRIVILEGE, BYPASSRLS, RANALYSIS, DEVELOPER, USER_ADMINISTRATION, GROUP_ADMINISTRATION, SYNCMANAGEMENT
		sub_group_identifiers (array<string>): GUID or name of the sub groups. A subgroup is a group assigned to a parent group.
		type (string): Type of the user group.
		user_identifiers (array<string>): GUID or name of the users to assign to the group.
		visibility (string): Visibility of the group. To make a group visible to other users and  groups, set the visibility to SHAREABLE. .
		'''
		self.name = name
		self.default_liveboard_identifiers = default_liveboard_identifiers
		self.description = description
		self.display_name = display_name
		self.privileges = privileges
		self.sub_group_identifiers = sub_group_identifiers
		self.type = type
		self.user_identifiers = user_identifiers
		self.visibility = visibility
