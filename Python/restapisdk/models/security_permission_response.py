# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.api_helper import APIHelper
from restapisdk.models.secuirity_dependents import SecuirityDependents
from restapisdk.models.security_permission import SecurityPermission
from restapisdk.models.user_name_and_id import UserNameAndID


class SecurityPermissionResponse(object):

    """Implementation of the 'SecurityPermissionResponse' model.

    TODO: type model description here.

    Attributes:
        id (string): GUID of the object
        name (string): Name of the object
        mtype (string): Indicates the type of the object
        owner (string): GUID of the owner of the object
        author (UserNameAndID): TODO: type description here.
        permissions (list of SecurityPermission): An array of object with
            details of permission on users and user groups
        dependents (list of SecuirityDependents): The objects on which the
            primary object is dependent on

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "name": 'name',
        "mtype": 'type',
        "owner": 'owner',
        "author": 'author',
        "permissions": 'permissions',
        "dependents": 'dependents'
    }

    _optionals = [
        'id',
        'name',
        'mtype',
        'owner',
        'author',
        'permissions',
        'dependents',
    ]

    def __init__(self,
                 id=APIHelper.SKIP,
                 name=APIHelper.SKIP,
                 mtype=APIHelper.SKIP,
                 owner=APIHelper.SKIP,
                 author=APIHelper.SKIP,
                 permissions=APIHelper.SKIP,
                 dependents=APIHelper.SKIP):
        """Constructor for the SecurityPermissionResponse class"""

        # Initialize members of the class
        if id is not APIHelper.SKIP:
            self.id = id 
        if name is not APIHelper.SKIP:
            self.name = name 
        if mtype is not APIHelper.SKIP:
            self.mtype = mtype 
        if owner is not APIHelper.SKIP:
            self.owner = owner 
        if author is not APIHelper.SKIP:
            self.author = author 
        if permissions is not APIHelper.SKIP:
            self.permissions = permissions 
        if dependents is not APIHelper.SKIP:
            self.dependents = dependents 

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
        mtype = dictionary.get("type") if dictionary.get("type") else APIHelper.SKIP
        owner = dictionary.get("owner") if dictionary.get("owner") else APIHelper.SKIP
        author = UserNameAndID.from_dictionary(dictionary.get('author')) if 'author' in dictionary.keys() else APIHelper.SKIP 
        permissions = None
        if dictionary.get('permissions') is not None:
            permissions = [SecurityPermission.from_dictionary(x) for x in dictionary.get('permissions')]
        else:
            permissions = APIHelper.SKIP
        dependents = None
        if dictionary.get('dependents') is not None:
            dependents = [SecuirityDependents.from_dictionary(x) for x in dictionary.get('dependents')]
        else:
            dependents = APIHelper.SKIP
        # Return an object of this model
        return cls(id,
                   name,
                   mtype,
                   owner,
                   author,
                   permissions,
                   dependents)