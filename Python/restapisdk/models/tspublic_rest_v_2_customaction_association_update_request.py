# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class TspublicRestV2CustomactionAssociationUpdateRequest(object):

    """Implementation of the 'Tspublic Rest V2 Customaction Association Update Request' model.

    TODO: type model description here.

    Attributes:
        id (string): GUID of the custom action
        association (string): A JSON map of the attributes for associating the
            action to a ThoughtSpot object ID    Example:   
            {"id":"0dbd5b3a-84c1-4407-9803-cf07d67e6fcf","name":"My worksheet
            action","version":"v2","type":"URL","detail":{"link":"https://unpkg
            .com
            ","function":"my-worksheet-action","authSelect":"NONE","authToken":
            "","encodeUser":"","apiKey":"X-API-KEY","apiValue":"","additionalUr
            lHeaders":"{}"},"actionAssociationMap":{"WORKSHEET":{"2b9d083a-275c
            -4984-9cfe-90b036affa17":{"enabled":"true","context":"PRIMARY"}}},"
            context":"NONE","availability":[
            ],"userGroupList":["d0326b56-ef23-4c8a-8327-a30e99bcc72b"]}

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "association": 'association'
    }

    def __init__(self,
                 id=None,
                 association=None):
        """Constructor for the TspublicRestV2CustomactionAssociationUpdateRequest class"""

        # Initialize members of the class
        self.id = id
        self.association = association

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
        association = dictionary.get('association')

        # Return an object of this model
        return cls(id,
                   association)
