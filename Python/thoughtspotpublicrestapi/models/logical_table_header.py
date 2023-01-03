# -*- coding: utf-8 -*-

"""
thoughtspotpublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from thoughtspotpublicrestapi.api_helper import APIHelper


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
        deleted (bool): TODO: type description here.
        hidden (bool): TODO: type description here.
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

    _optionals = [
        'id',
        'name',
        'author',
        'author_name',
        'author_display_name',
        'created',
        'modified',
        'modified_by',
        'generation_num',
        'owner',
        'deleted',
        'hidden',
        'database',
        'schema',
        'mtype',
        'sub_type',
    ]

    def __init__(self,
                 id=APIHelper.SKIP,
                 name=APIHelper.SKIP,
                 author=APIHelper.SKIP,
                 author_name=APIHelper.SKIP,
                 author_display_name=APIHelper.SKIP,
                 created=APIHelper.SKIP,
                 modified=APIHelper.SKIP,
                 modified_by=APIHelper.SKIP,
                 generation_num=APIHelper.SKIP,
                 owner=APIHelper.SKIP,
                 deleted=APIHelper.SKIP,
                 hidden=APIHelper.SKIP,
                 database=APIHelper.SKIP,
                 schema=APIHelper.SKIP,
                 mtype=APIHelper.SKIP,
                 sub_type=APIHelper.SKIP):
        """Constructor for the LogicalTableHeader class"""

        # Initialize members of the class
        if id is not APIHelper.SKIP:
            self.id = id 
        if name is not APIHelper.SKIP:
            self.name = name 
        if author is not APIHelper.SKIP:
            self.author = author 
        if author_name is not APIHelper.SKIP:
            self.author_name = author_name 
        if author_display_name is not APIHelper.SKIP:
            self.author_display_name = author_display_name 
        if created is not APIHelper.SKIP:
            self.created = created 
        if modified is not APIHelper.SKIP:
            self.modified = modified 
        if modified_by is not APIHelper.SKIP:
            self.modified_by = modified_by 
        if generation_num is not APIHelper.SKIP:
            self.generation_num = generation_num 
        if owner is not APIHelper.SKIP:
            self.owner = owner 
        if deleted is not APIHelper.SKIP:
            self.deleted = deleted 
        if hidden is not APIHelper.SKIP:
            self.hidden = hidden 
        if database is not APIHelper.SKIP:
            self.database = database 
        if schema is not APIHelper.SKIP:
            self.schema = schema 
        if mtype is not APIHelper.SKIP:
            self.mtype = mtype 
        if sub_type is not APIHelper.SKIP:
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

        id = dictionary.get("id") if dictionary.get("id") else APIHelper.SKIP
        name = dictionary.get("name") if dictionary.get("name") else APIHelper.SKIP
        author = dictionary.get("author") if dictionary.get("author") else APIHelper.SKIP
        author_name = dictionary.get("authorName") if dictionary.get("authorName") else APIHelper.SKIP
        author_display_name = dictionary.get("authorDisplayName") if dictionary.get("authorDisplayName") else APIHelper.SKIP
        created = dictionary.get("created") if dictionary.get("created") else APIHelper.SKIP
        modified = dictionary.get("modified") if dictionary.get("modified") else APIHelper.SKIP
        modified_by = dictionary.get("modifiedBy") if dictionary.get("modifiedBy") else APIHelper.SKIP
        generation_num = dictionary.get("generationNum") if dictionary.get("generationNum") else APIHelper.SKIP
        owner = dictionary.get("owner") if dictionary.get("owner") else APIHelper.SKIP
        deleted = dictionary.get("deleted") if "deleted" in dictionary.keys() else APIHelper.SKIP
        hidden = dictionary.get("hidden") if "hidden" in dictionary.keys() else APIHelper.SKIP
        database = dictionary.get("database") if dictionary.get("database") else APIHelper.SKIP
        schema = dictionary.get("schema") if dictionary.get("schema") else APIHelper.SKIP
        mtype = dictionary.get("type") if dictionary.get("type") else APIHelper.SKIP
        sub_type = dictionary.get("subType") if dictionary.get("subType") else APIHelper.SKIP
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
