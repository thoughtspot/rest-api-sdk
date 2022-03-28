# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.models.client_state import ClientState
from restapisdk.models.tag_name_and_id import TagNameAndID


class MetadataTagResponse(object):

    """Implementation of the 'MetadataTagResponse' model.

    TODO: type model description here.

    Attributes:
        name (string): Name of the tag
        id (string): GUID of the tag
        client_state (ClientState): TODO: type description here.
        index_version (float): TODO: type description here.
        generation_num (float): TODO: type description here.
        is_deleted (bool): Indicates if the tag is deleted
        is_hidden (bool): Indicates if the tag is hidden
        is_external (bool): Indicates if the tag is from external system
        is_deprecated (bool): TODO: type description here.
        created (float): Date and time when group was created
        modified (float): Date and time of last modification of the group
        modified_by (TagNameAndID): TODO: type description here.
        author (TagNameAndID): TODO: type description here.
        owner (TagNameAndID): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "id": 'id',
        "client_state": 'clientState',
        "index_version": 'indexVersion',
        "generation_num": 'generationNum',
        "is_deleted": 'isDeleted',
        "is_hidden": 'isHidden',
        "is_external": 'isExternal',
        "is_deprecated": 'isDeprecated',
        "created": 'created',
        "modified": 'modified',
        "modified_by": 'modifiedBy',
        "author": 'author',
        "owner": 'owner'
    }

    def __init__(self,
                 name=None,
                 id=None,
                 client_state=None,
                 index_version=None,
                 generation_num=None,
                 is_deleted=None,
                 is_hidden=None,
                 is_external=None,
                 is_deprecated=None,
                 created=None,
                 modified=None,
                 modified_by=None,
                 author=None,
                 owner=None):
        """Constructor for the MetadataTagResponse class"""

        # Initialize members of the class
        self.name = name
        self.id = id
        self.client_state = client_state
        self.index_version = index_version
        self.generation_num = generation_num
        self.is_deleted = is_deleted
        self.is_hidden = is_hidden
        self.is_external = is_external
        self.is_deprecated = is_deprecated
        self.created = created
        self.modified = modified
        self.modified_by = modified_by
        self.author = author
        self.owner = owner

    @classmethod
    def from_dictionary(cls,
                        dictionary):
        """Creates an instance of this model from a dictionary

        Args:
            dictionary (dictionary): A dictionary representation of the object
            as obtained from the deserialization of the server's response. The
            keys MUST match property names in the API description.

        Returns:
            object: An instance of this structure class.

        """
        if dictionary is None:
            return None

        # Extract variables from the dictionary
        name = dictionary.get('name')
        id = dictionary.get('id')
        client_state = ClientState.from_dictionary(dictionary.get('clientState')) if dictionary.get('clientState') else None
        index_version = dictionary.get('indexVersion')
        generation_num = dictionary.get('generationNum')
        is_deleted = dictionary.get('isDeleted')
        is_hidden = dictionary.get('isHidden')
        is_external = dictionary.get('isExternal')
        is_deprecated = dictionary.get('isDeprecated')
        created = dictionary.get('created')
        modified = dictionary.get('modified')
        modified_by = TagNameAndID.from_dictionary(dictionary.get('modifiedBy')) if dictionary.get('modifiedBy') else None
        author = TagNameAndID.from_dictionary(dictionary.get('author')) if dictionary.get('author') else None
        owner = TagNameAndID.from_dictionary(dictionary.get('owner')) if dictionary.get('owner') else None

        # Return an object of this model
        return cls(name,
                   id,
                   client_state,
                   index_version,
                   generation_num,
                   is_deleted,
                   is_hidden,
                   is_external,
                   is_deprecated,
                   created,
                   modified,
                   modified_by,
                   author,
                   owner)
