class GroupsSearchRequest():
	_names = {'default_liveboard_identifiers':'default_liveboard_identifiers','description':'description','display_name':'display_name','group_identifier':'group_identifier','org_identifiers':'org_identifiers','privileges':'privileges','sub_group_identifiers':'sub_group_identifiers','type':'type','user_identifiers':'user_identifiers','visibility':'visibility',}
	def __init__(self,default_liveboard_identifiers=None,description=None,display_name=None,group_identifier=None,org_identifiers=None,privileges=None,sub_group_identifiers=None,type=None,user_identifiers=None,visibility=None,):
		'''
		Args:
		default_liveboard_identifiers (array<string>): GUID of Liveboards which will be assigned as default Liveboards for the users in the specified group.
		description (string): Description of the group.
		display_name (string): Display name of the group.
		group_identifier (string): GUID or name of the group.
		org_identifiers (array<string>): ID or name of the Org to which the group belongs.
		privileges (array<string>): Privileges assigned to the group. The acceptable values are: ADMINISTRATION, AUTHORING, USERDATAUPLOADING, DATADOWNLOADING, USERMANAGEMENT, DATAMANAGEMENT, SHAREWITHALL, JOBSCHEDULING, A3ANALYSIS, EXPERIMENTALFEATUREPRIVILEGE, BYPASSRLS, RANALYSIS, DEVELOPER, USER_ADMINISTRATION, GROUP_ADMINISTRATION, SYNCMANAGEMENT
		sub_group_identifiers (array<string>): GUID or name of the sub groups. A subgroup is a group assigned to a parent group.
		type (string): Group type.
		user_identifiers (array<string>): GUID or name of the users assigned to the group.
		visibility (string): Visibility of the group. To make a group visible to other users and groups, set the visibility to SHAREABLE. .
		'''
		self.default_liveboard_identifiers = default_liveboard_identifiers
		self.description = description
		self.display_name = display_name
		self.group_identifier = group_identifier
		self.org_identifiers = org_identifiers
		self.privileges = privileges
		self.sub_group_identifiers = sub_group_identifiers
		self.type = type
		self.user_identifiers = user_identifiers
		self.visibility = visibility
