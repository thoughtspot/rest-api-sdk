# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class ImportObjectTMLForceCreateEnum(object):

    """Implementation of the 'importObjectTML-forceCreate' enum.

    Specifies if you are updating or creating objects. To create new objects,
    specify true. 
     By default, ThoughtSpot updates existing objects that have the same GUID
     as the objects you are importing. When set to true, the GUID property in
     the imported TML is replaced on the server, and the response headers will
     include the id_guid property with the GUID of the new object. The new
     object will be assigned a new GUID, even if the imported TML file
     included a guid value. Thus, there is no need to include the guid in the
     TML file if you are using forceCreate=true.

    Attributes:
        TRUE: TODO: type description here.
        FALSE: TODO: type description here.

    """

    TRUE = 'true'

    FALSE = 'false'
