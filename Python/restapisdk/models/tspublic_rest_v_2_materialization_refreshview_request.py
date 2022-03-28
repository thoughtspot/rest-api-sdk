# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class TspublicRestV2MaterializationRefreshviewRequest(object):

    """Implementation of the 'Tspublic Rest V2 Materialization Refreshview Request' model.

    TODO: type model description here.

    Attributes:
        id (string): GUID of metadata object

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id'
    }

    def __init__(self,
                 id=None):
        """Constructor for the TspublicRestV2MaterializationRefreshviewRequest class"""

        # Initialize members of the class
        self.id = id

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
        id = dictionary.get('id')

        # Return an object of this model
        return cls(id)
