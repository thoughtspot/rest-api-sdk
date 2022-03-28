# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class TspublicRestV2CustomactionCreateRequest(object):

    """Implementation of the 'Tspublic Rest V2 Customaction Create Request' model.

    TODO: type model description here.

    Attributes:
        configuration (string): A JSON object with the key-value pair of
            configuration attributes    Example:   
            {"id":"3f7eac93-cce1-4ffc-b7a8-429353edbc6b","name":"unpkg
            test","version":"v2","type":"URL","detail":{"link":"https://unpkg.c
            om
            ","function":"unpkg-test","authSelect":"BEARER","authToken":"asdfas
            adf3q4534534","encodeUser":"","apiKey":"X-API-KEY","apiValue":"","a
            dditionalUrlHeaders":"{\\"url_header1\\":{\\"id\\":\\"6a82908c-9328
            -40ff-b347-65adeda12f57\\",\\"key\\":\\"key1\\",\\"value\\":\\"valu
            e1\\"}}"},"actionAssociationMap":{"ANSWER":{"e4079d3f-ae71-4b0a-a70
            a-f17ecaf157a5":{"enabled":"true","context":"MENU"}}},"context":"NO
            NE","availability":["GLOBAL"],"userGroupList":["d0326b56-ef23-4c8a-
            8327-a30e99bcc72b"]}

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "configuration": 'configuration'
    }

    def __init__(self,
                 configuration=None):
        """Constructor for the TspublicRestV2CustomactionCreateRequest class"""

        # Initialize members of the class
        self.configuration = configuration

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
        configuration = dictionary.get('configuration')

        # Return an object of this model
        return cls(configuration)
