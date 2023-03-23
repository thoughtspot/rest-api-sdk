class UsersCreateRequest():
	_names = {'name':'name','display_name':'display_name','password':'password','email':'email','account_type':'account_type','account_status':'account_status','org_identifiers':'org_identifiers','group_identifiers':'group_identifiers','visibility':'visibility','notify_on_share':'notify_on_share','show_onboarding_experience':'show_onboarding_experience','onboarding_experience_completed':'onboarding_experience_completed','home_liveboard_identifier':'home_liveboard_identifier','favorite_metadata':'favorite_metadata',}
	def __init__(self,name,display_name,password,email,account_type=None,account_status=None,org_identifiers=None,group_identifiers=None,visibility=None,notify_on_share=None,show_onboarding_experience=None,onboarding_experience_completed=None,home_liveboard_identifier=None,favorite_metadata=None,):
		'''
		Args:
		name (string): Name of the user. The username string must be unique.
		display_name (string): A unique display name string for the user account, usually their first and last name.
		password (string): Password for the user account.
		email (string): Email of the user account.
		account_type (string): Type of the account.
		account_status (string): Current status of the user account.
		org_identifiers (array<string>): List of Org IDs to which the user belongs.
		group_identifiers (array<string>): GUIDs or names of the groups to which the newly created user belongs.
		visibility (string): Visibility of the users. When set to SHARABLE, the user is visible to other users and groups when they try to share an object.
		notify_on_share (boolean): User preference for receiving email notifications when another ThoughtSpot user shares a metadata object such as Answer, Liveboard, or Worksheet.
		show_onboarding_experience (boolean): The user preference for revisiting the onboarding experience.
		onboarding_experience_completed (boolean): flag to get the on-boarding experience is completed or not.
		home_liveboard_identifier (string): GUID of the Liveboard to set a default Liveboard for the user.  ThoughtSpot displays this Liveboard on the Home page when the user logs in.
		favorite_metadata (array<FavoriteMetadataInput>): Metadata objects to add to the user's favorites list.
		'''
		self.name = name
		self.display_name = display_name
		self.password = password
		self.email = email
		self.account_type = account_type
		self.account_status = account_status
		self.org_identifiers = org_identifiers
		self.group_identifiers = group_identifiers
		self.visibility = visibility
		self.notify_on_share = notify_on_share
		self.show_onboarding_experience = show_onboarding_experience
		self.onboarding_experience_completed = onboarding_experience_completed
		self.home_liveboard_identifier = home_liveboard_identifier
		self.favorite_metadata = favorite_metadata
