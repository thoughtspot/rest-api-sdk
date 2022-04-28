# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class LogicalTableHeader(object):

    """Implementation of the 'LogicalTableHeader' model.

    TODO: type model description here.

    Attributes:
        id (string): TODO: type description here.
        name (string): TODO: type description here.
        author (string): TODO: type description here.
        author_name (string): TODO: type description here.
        author_display_name (string): TODO: type description here.
        created (float): TODO: type description here.
        modified (float): TODO: type description here.
        modified_by (string): TODO: type description here.
        generation_num (int): TODO: type description here.
        owner (string): TODO: type description here.
        deleted (LogicalTableHeaderDeletedEnum): TODO: type description here.
        hidden (LogicalTableHeaderHiddenEnum): TODO: type description here.
        database (string): TODO: type description here.
        schema (string): TODO: type description here.
        mtype (string): TODO: type description here.
        sub_type (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "name": 'name',
        "author": 'author',
        "author_name": 'authorName',
        "author_display_name": 'authorDisplayName',
        "created": 'created',
        "modified": 'modified',
        "modified_by": 'modifiedBy',
        "generation_num": 'generationNum',
        "owner": 'owner',
        "deleted": 'deleted',
        "hidden": 'hidden',
        "database": 'database',
        "schema": 'schema',
        "mtype": 'type',
        "sub_type": 'subType'
    }

    def __init__(self,
                 id=None,
                 name=None,
                 author=None,
                 author_name=None,
                 author_display_name=None,
                 created=None,
                 modified=None,
                 modified_by=None,
                 generation_num=None,
                 owner=None,
                 deleted=None,
                 hidden=None,
                 database=None,
                 schema=None,
                 mtype=None,
                 sub_type=None):
        """Constructor for the LogicalTableHeader class"""

        # Initialize members of the class
        self.id = id
        self.name = name
        self.author = author
        self.author_name = author_name
        self.author_display_name = author_display_name
        self.created = created
        self.modified = modified
        self.modified_by = modified_by
        self.generation_num = generation_num
        self.owner = owner
        self.deleted = deleted
        self.hidden = hidden
        self.database = database
        self.schema = schema
        self.mtype = mtype
        self.sub_type = sub_type

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
        name = dictionary.get('name')
        author = dictionary.get('author')
        author_name = dictionary.get('authorName')
        author_display_name = dictionary.get('authorDisplayName')
        created = dictionary.get('created')
        modified = dictionary.get('modified')
        modified_by = dictionary.get('modifiedBy')
        generation_num = dictionary.get('generationNum')
        owner = dictionary.get('owner')
        deleted = dictionary.get('deleted')
        hidden = dictionary.get('hidden')
        database = dictionary.get('database')
        schema = dictionary.get('schema')
        mtype = dictionary.get('type')
        sub_type = dictionary.get('subType')
        # Return an object of this model
        return cls(id,
                   name,
                   author,
                   author_name,
                   author_display_name,
                   created,
                   modified,
                   modified_by,
                   generation_num,
                   owner,
                   deleted,
                   hidden,
                   database,
                   schema,
                   mtype,
                   sub_type)
