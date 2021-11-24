# -*- coding: utf-8 -*-

"""
tspublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class ApiRestV2GroupCreateRequest(object):

    """Implementation of the 'Api Rest V2 Group Create Request' model.

    TODO: type model description here.

    Attributes:
        name (string): Name of the user group. The group name string must be
            unique.
        display_name (string): A unique display name string for the user
            group, for example, Developer group.
        visibility (Visibility3Enum): Visibility of the user. The visibility
            attribute is set to DEFAULT when creating a user. Setting this to
            DEFAULT makes a user visible to other users and user groups, and
            thus allows them to share objects
        description (string): Description text for the group
        privileges (list of PrivilegeEnum): A JSON array of privileges to be
            assigned to the group
        group_names (list of string): A JSON array of group names
        user_names (list of string): A JSON array of usernames to be added to
            the group
        mtype (Type3Enum): Type of user group. LOCAL_GROUP indicates that the
            group is created locally in the ThoughtSpot system.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "display_name": 'displayName',
        "visibility": 'visibility',
        "description": 'description',
        "privileges": 'privileges',
        "group_names": 'groupNames',
        "user_names": 'userNames',
        "mtype": 'type'
    }

    def __init__(self,
                 name=None,
                 display_name=None,
                 visibility='DEFAULT',
                 description=None,
                 privileges=None,
                 group_names=None,
                 user_names=None,
                 mtype='LOCAL_GROUP'):
        """Constructor for the ApiRestV2GroupCreateRequest class"""

        # Initialize members of the class
        self.name = name
        self.display_name = display_name
        self.visibility = visibility
        self.description = description
        self.privileges = privileges
        self.group_names = group_names
        self.user_names = user_names
        self.mtype = mtype

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
        display_name = dictionary.get('displayName')
        visibility = dictionary.get("visibility") if dictionary.get("visibility") else 'DEFAULT'
        description = dictionary.get('description')
        privileges = dictionary.get('privileges')
        group_names = dictionary.get('groupNames')
        user_names = dictionary.get('userNames')
        mtype = dictionary.get("type") if dictionary.get("type") else 'LOCAL_GROUP'

        # Return an object of this model
        return cls(name,
                   display_name,
                   visibility,
                   description,
                   privileges,
                   group_names,
                   user_names,
                   mtype)