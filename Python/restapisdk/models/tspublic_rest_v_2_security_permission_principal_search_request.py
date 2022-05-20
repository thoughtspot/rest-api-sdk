# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.models.ts_object_search_input import TsObjectSearchInput
from restapisdk.models.user_name_and_id_input import UserNameAndIDInput


class TspublicRestV2SecurityPermissionPrincipalSearchRequest(object):

    """Implementation of the 'Tspublic Rest V2 Security Permission Principal Search Request' model.

    TODO: type model description here.

    Attributes:
        principal (list of UserNameAndIDInput): A JSON array of principal
            names or GUIDs to be included in the request. When both are given
            then id is considered.
        ts_object (list of TsObjectSearchInput): A JSON Array of GUIDs and
            type of metadata object.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "principal": 'principal',
        "ts_object": 'tsObject'
    }

    def __init__(self,
                 principal=None,
                 ts_object=None):
        """Constructor for the TspublicRestV2SecurityPermissionPrincipalSearchRequest class"""

        # Initialize members of the class
        self.principal = principal
        self.ts_object = ts_object

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

        principal = None
        if dictionary.get('principal') is not None:
            principal = [UserNameAndIDInput.from_dictionary(x) for x in dictionary.get('principal')]
        ts_object = None
        if dictionary.get('tsObject') is not None:
            ts_object = [TsObjectSearchInput.from_dictionary(x) for x in dictionary.get('tsObject')]
        # Return an object of this model
        return cls(principal,
                   ts_object)