# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class TspublicRestV2ConnectionUpdateRequest(object):

    """Implementation of the 'Tspublic Rest V2 Connection Update Request' model.

    TODO: type model description here.

    Attributes:
        id (string): GUID of the connection
        name (string): The text to update the name of the connection.
        description (string): The text to update the description of the
            connection.
        configuration (string): A JSON object of the connection metadata. The
            metadata must include configuration attributes required to create
            the connection.    Example:    Snowflake:
            {"accountName":"testaccount","user":"test_user","password":"test_pw
            d","role":"test_role","warehouse":"test_wh","database":"test_db"} 
            Redshift:
            {"host":"test_host","port":"1234","user":"test_user","password":"te
            st_pwd","database":"test_db"}    Google BigQuery:
            {"project_id":"test_project","oauth_pvt_key":"test_key"}    Azure
            Synapse:
            {"host":"test_host","port":"1234","user":"test_user","password":"te
            st_pwd","database":"test_db"}    Teradata:
            {"host":"test_host","user":"test_user","password":"test_pwd","datab
            ase":"test_db"}    Oracle ADW:
            {"user":"test_user","password":"test_pwd","net_service_name":"test_
            srvc_name","tns_admin":"test_tns","schema":"test_schema"}   
            Starburst:
            {"host":"test_host","user":"test_user","password":"test_pwd","datab
            ase":"test_db"}    Databricks:
            {"host":"test_host","http_path":"https://test
            ","user":"test_user","password":"test_pwd"}    SAP HANA:
            {"host":"test_host","user":"test_user","password":"test_pwd","datab
            ase":"test_db"}    Denodo:
            {"host":"test_host","port":"1234","user":"test_user","password":"te
            st_pwd"}

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "configuration": 'configuration',
        "name": 'name',
        "description": 'description'
    }

    def __init__(self,
                 id=None,
                 configuration=None,
                 name=None,
                 description=None):
        """Constructor for the TspublicRestV2ConnectionUpdateRequest class"""

        # Initialize members of the class
        self.id = id
        self.name = name
        self.description = description
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

        id = dictionary.get('id')
        configuration = dictionary.get('configuration')
        name = dictionary.get('name')
        description = dictionary.get('description')
        # Return an object of this model
        return cls(id,
                   configuration,
                   name,
                   description)