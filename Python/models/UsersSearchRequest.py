class UsersSearchRequest():
	_names = {'user_identifier':'user_identifier','display_name':'display_name','visibility':'visibility','email':'email','group_identifiers':'group_identifiers','privileges':'privileges','account_type':'account_type','account_status':'account_status','notify_on_share':'notify_on_share','show_onboarding_experience':'show_onboarding_experience','onboarding_experience_completed':'onboarding_experience_completed','org_identifiers':'org_identifiers','home_liveboard_identifier':'home_liveboard_identifier','favorite_metadata':'favorite_metadata',}
	def __init__(self,user_identifier=None,display_name=None,visibility=None,email=None,group_identifiers=None,privileges=None,account_type=None,account_status=None,notify_on_share=None,show_onboarding_experience=None,onboarding_experience_completed=None,org_identifiers=None,home_liveboard_identifier=None,favorite_metadata=None,):
		'''
		Args:
		user_identifier (string): GUID / name of the user to search.
		display_name (string): A unique display name string for the user account, usually their first and last name.
		visibility (string): Visibility of the user.
		email (string): Email of the user account.
		group_identifiers (array<string>): GUID or name of the group to which the user belongs.
		privileges (array<string>): Privileges assigned to the user. The acceptable values are: ADMINISTRATION, AUTHORING, USERDATAUPLOADING, DATADOWNLOADING, USERMANAGEMENT, DATAMANAGEMENT, SHAREWITHALL, JOBSCHEDULING, A3ANALYSIS, EXPERIMENTALFEATUREPRIVILEGE, BYPASSRLS, RANALYSIS, DEVELOPER, USER_ADMINISTRATION, GROUP_ADMINISTRATION, SYNCMANAGEMENT
		account_type (string): Type of the account.
		account_status (string): Current status of the user account.
		notify_on_share (boolean): User preference for receiving email notifications when another ThoughtSpot user shares a metadata object such as Answer, Liveboard, or Worksheet.
		show_onboarding_experience (boolean): The user preference for revisiting the onboarding experience.
		onboarding_experience_completed (boolean): Indicates if the user has completed the onboarding walkthrough.
		org_identifiers (array<string>): IDs or names of the Orgs to which the user belongs.
		home_liveboard_identifier (string): Unique ID or name of the users home liveboard.
		favorite_metadata (array<FavoriteMetadataInput>): Metadata objects which are assigned as favorites of the user.
		'''
		self.user_identifier = user_identifier
		self.display_name = display_name
		self.visibility = visibility
		self.email = email
		self.group_identifiers = group_identifiers
		self.privileges = privileges
		self.account_type = account_type
		self.account_status = account_status
		self.notify_on_share = notify_on_share
		self.show_onboarding_experience = show_onboarding_experience
		self.onboarding_experience_completed = onboarding_experience_completed
		self.org_identifiers = org_identifiers
		self.home_liveboard_identifier = home_liveboard_identifier
		self.favorite_metadata = favorite_metadata
