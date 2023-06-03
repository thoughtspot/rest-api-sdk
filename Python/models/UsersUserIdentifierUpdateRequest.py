class UsersUserIdentifierUpdateRequest():
	_names = {'name':'name','display_name':'display_name','visibility':'visibility','email':'email','account_status':'account_status','notify_on_share':'notify_on_share','show_onboarding_experience':'show_onboarding_experience','onboarding_experience_completed':'onboarding_experience_completed','account_type':'account_type','group_identifiers':'group_identifiers','home_liveboard_identifier':'home_liveboard_identifier','favorite_metadata':'favorite_metadata','org_identifiers':'org_identifiers',}
	def __init__(self,name=None,display_name=None,visibility=None,email=None,account_status=None,notify_on_share=None,show_onboarding_experience=None,onboarding_experience_completed=None,account_type=None,group_identifiers=None,home_liveboard_identifier=None,favorite_metadata=None,org_identifiers=None,):
		'''
		Args:
		name (string): Name of the user. The username string must be unique.
		display_name (string): A unique display name string for the user account, usually their first and last name.
		visibility (string): Visibility of the users. When set to SHARABLE, the user is visible to other users and groups when they try to share an object.
		email (string): Email of the user account.
		account_status (string): Current status of the user account.
		notify_on_share (boolean): User preference for receiving email notifications when another ThoughtSpot user  shares a metadata object such as Answer, Liveboard, or Worksheet. .
		show_onboarding_experience (boolean): The user preference for revisiting the onboarding experience.
		onboarding_experience_completed (boolean): Indicates if the user has completed the onboarding and allows turning off the onboarding walkthrough.
		account_type (string): Type of the account.
		group_identifiers (array<string>): GUIDs or names of the groups.
		home_liveboard_identifier (string): GUID of the Liveboard to set a default Liveboard for the user. ThoughtSpot displays this Liveboard on the Home page when the user logs in.
		favorite_metadata (array<FavoriteMetadataInput>): Metadata objects to add to the user's favorites list.
		org_identifiers (array<string>): IDs of the Orgs.
		'''
		self.name = name
		self.display_name = display_name
		self.visibility = visibility
		self.email = email
		self.account_status = account_status
		self.notify_on_share = notify_on_share
		self.show_onboarding_experience = show_onboarding_experience
		self.onboarding_experience_completed = onboarding_experience_completed
		self.account_type = account_type
		self.group_identifiers = group_identifiers
		self.home_liveboard_identifier = home_liveboard_identifier
		self.favorite_metadata = favorite_metadata
		self.org_identifiers = org_identifiers
