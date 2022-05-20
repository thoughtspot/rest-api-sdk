
# Import Object TML Force Create Enum

Specifies if you are updating or creating objects. To create new objects, specify true.

By default, ThoughtSpot updates existing objects that have the same GUID as the objects you are importing. When set to true, the GUID property in the imported TML is replaced on the server, and the response headers will include the id_guid property with the GUID of the new object. The new object will be assigned a new GUID, even if the imported TML file included a guid value. Thus, there is no need to include the guid in the TML file if you are using forceCreate=true.

## Enumeration

`ImportObjectTMLForceCreateEnum`

## Fields

| Name |
|  --- |
| `TRUE` |
| `FALSE` |

