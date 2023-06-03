class SecurityMetadataShareRequest():
	_names = {'metadata_type':'metadata_type','metadata_identifiers':'metadata_identifiers','permissions':'permissions','visualization_identifiers':'visualization_identifiers','emails':'emails','message':'message','enable_custom_url':'enable_custom_url',}
	def __init__(self,metadata_type,metadata_identifiers,permissions,emails,message,visualization_identifiers=None,enable_custom_url=None,):
		'''
		Args:
		metadata_type (string): Type of metadata. 1. Liveboard 2. Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view.
		metadata_identifiers (array<string>): Unique ID or name of metadata objects.
		permissions (array<SharePermissionsInput>): Permission details for sharing the objects.
		visualization_identifiers (array<string>): Options to specify details of Liveboard.
		emails (array<string>): Email IDs to which notifications will be sent.
		message (string): Message to be included in notification.
		enable_custom_url (boolean): Sends object URLs in the customized format in email notifications. .
		'''
		self.metadata_type = metadata_type
		self.metadata_identifiers = metadata_identifiers
		self.permissions = permissions
		self.visualization_identifiers = visualization_identifiers
		self.emails = emails
		self.message = message
		self.enable_custom_url = enable_custom_url
