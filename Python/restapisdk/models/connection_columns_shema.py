# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.models.table_columns import TableColumns


class ConnectionColumnsShema(object):

    """Implementation of the 'ConnectionColumnsShema' model.

    TODO: type model description here.

    Attributes:
        name (string): Name of the table
        db_name (string): Name of the database
        schema_name (string): Name of the schema
        columns (list of TableColumns): List of columns in the table

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "db_name": 'dbName',
        "schema_name": 'schemaName',
        "columns": 'columns'
    }

    def __init__(self,
                 name=None,
                 db_name=None,
                 schema_name=None,
                 columns=None):
        """Constructor for the ConnectionColumnsShema class"""

        # Initialize members of the class
        self.name = name
        self.db_name = db_name
        self.schema_name = schema_name
        self.columns = columns

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
        columns = None
        if dictionary.get('columns') is not None:
            columns = [TableColumns.from_dictionary(x) for x in dictionary.get('columns')]
        # Return an object of this model
        return cls(name,
                   db_name,
                   schema_name,
                   columns)