# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.api_helper import APIHelper


class GroupPermission(object):

    """Implementation of the 'GroupPermission' model.

    TODO: type model description here.

    Attributes:
        id (string): GUID of the user group
        name (string): Name of the user group
        permission (string): Indicates the permission which user group has on
            the object

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "name": 'name',
        "permission": 'permission'
    }

    _optionals = [
        'id',
        'name',
        'permission',
    ]

    def __init__(self,
                 id=APIHelper.SKIP,
                 name=APIHelper.SKIP,
                 permission=APIHelper.SKIP):
        """Constructor for the GroupPermission class"""

        # Initialize members of the class
        if id is not APIHelper.SKIP:
            self.id = id 
        if name is not APIHelper.SKIP:
            self.name = name 
        if permission is not APIHelper.SKIP:
            self.permission = permission 

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

        id = dictionary.get("id") if dictionary.get("id") else APIHelper.SKIP
        name = dictionary.get("name") if dictionary.get("name") else APIHelper.SKIP
        permission = dictionary.get("permission") if dictionary.get("permission") else APIHelper.SKIP
        # Return an object of this model
        return cls(id,
                   name,
                   permission)