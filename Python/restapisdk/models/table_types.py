# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class TableTypes(object):

    """Implementation of the 'TableTypes' model.

    TODO: type model description here.

    Attributes:
        name (string): TODO: type description here.
        db_name (string): TODO: type description here.
        schema_name (string): TODO: type description here.
        column (list of object): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "db_name": 'dbName',
        "schema_name": 'schemaName',
        "column": 'column'
    }

    def __init__(self,
                 name=None,
                 db_name=None,
                 schema_name=None,
                 column=None):
        """Constructor for the TableTypes class"""

        # Initialize members of the class
        self.name = name
        self.db_name = db_name
        self.schema_name = schema_name
        self.column = column

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
        db_name = dictionary.get('dbName')
        schema_name = dictionary.get('schemaName')
        column = dictionary.get('column')

        # Return an object of this model
        return cls(name,
                   db_name,
                   schema_name,
                   column)

    @classmethod
    def validate(cls, val):
        """Validates value against class schema

        Args:
            val: the value to be validated

        Returns:
            boolean : if value is valid against schema.

        """
        return SchemaValidatorWrapper.getValidator(APIHelper.get_schema_path(os.path.abspath(__file__))).is_valid(val)