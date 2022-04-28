# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class TspublicRestV2MetadataDependencyRequest(object):

    """Implementation of the 'Tspublic Rest V2 Metadata Dependency Request' model.

    TODO: type model description here.

    Attributes:
        mtype (GetObjectDependencyTypeEnum): Type of the data object
        id (list of string): A JSON array of GUIDs of the objects
        batch_size (int): The maximum number of batches to fetch in a query.  
            If this attribute is not defined, then the list of all dependent
            objects is included in the response

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "mtype": 'type',
        "id": 'id',
        "batch_size": 'batchSize'
    }

    def __init__(self,
                 mtype=None,
                 id=None,
                 batch_size=None):
        """Constructor for the TspublicRestV2MetadataDependencyRequest class"""

        # Initialize members of the class
        self.mtype = mtype
        self.id = id
        self.batch_size = batch_size

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

        mtype = dictionary.get('type')
        id = dictionary.get('id')
        batch_size = dictionary.get('batchSize')
        # Return an object of this model
        return cls(mtype,
                   id,
                   batch_size)
