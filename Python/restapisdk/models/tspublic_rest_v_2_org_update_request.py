# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.api_helper import APIHelper


class TspublicRestV2OrgUpdateRequest(object):

    """Implementation of the 'Tspublic Rest V2 Org Update Request' model.

    TODO: type model description here.

    Attributes:
        name (string): Name of the organization.
        id (string): The ID of the organization.
        description (string): Description text for the organization.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "id": 'id',
        "description": 'description'
    }

    _optionals = [
        'name',
        'id',
        'description',
    ]

    def __init__(self,
                 name=APIHelper.SKIP,
                 id=APIHelper.SKIP,
                 description=APIHelper.SKIP):
        """Constructor for the TspublicRestV2OrgUpdateRequest class"""

        # Initialize members of the class
        if name is not APIHelper.SKIP:
            self.name = name 
        if id is not APIHelper.SKIP:
            self.id = id 
        if description is not APIHelper.SKIP:
            self.description = description 

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

        name = dictionary.get("name") if dictionary.get("name") else APIHelper.SKIP
        id = dictionary.get("id") if dictionary.get("id") else APIHelper.SKIP
        description = dictionary.get("description") if dictionary.get("description") else APIHelper.SKIP
        # Return an object of this model
        return cls(name,
                   id,
                   description)