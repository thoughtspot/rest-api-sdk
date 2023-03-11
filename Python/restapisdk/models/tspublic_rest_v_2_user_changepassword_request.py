# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.api_helper import APIHelper


class TspublicRestV2UserChangepasswordRequest(object):

    """Implementation of the 'Tspublic Rest V2 User Changepassword Request' model.

    TODO: type model description here.

    Attributes:
        name (string): User name of the user account
        id (string): The GUID of the user account to query
        current_password (string): The current password of the user.
        new_password (string): A new password for the user.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "current_password": 'currentPassword',
        "new_password": 'newPassword',
        "name": 'name',
        "id": 'id'
    }

    _optionals = [
        'name',
        'id',
    ]

    def __init__(self,
                 current_password=None,
                 new_password=None,
                 name=APIHelper.SKIP,
                 id=APIHelper.SKIP):
        """Constructor for the TspublicRestV2UserChangepasswordRequest class"""

        # Initialize members of the class
        if name is not APIHelper.SKIP:
            self.name = name 
        if id is not APIHelper.SKIP:
            self.id = id 
        self.current_password = current_password 
        self.new_password = new_password 

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

        current_password = dictionary.get("currentPassword") if dictionary.get("currentPassword") else None
        new_password = dictionary.get("newPassword") if dictionary.get("newPassword") else None
        name = dictionary.get("name") if dictionary.get("name") else APIHelper.SKIP
        id = dictionary.get("id") if dictionary.get("id") else APIHelper.SKIP
        # Return an object of this model
        return cls(current_password,
                   new_password,
                   name,
                   id)