
# Create Connection Response

## Structure

`CreateConnectionResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Optional | Name of the connection |
| `Description` | `string` | Optional | Description associated with the connection |
| `Type` | `string` | Optional | Type of the connection. The database associated with this type can be obtained from the response returned by the /tspublic/rest/v2/connection/types API endpoint. |
| `Id` | `string` | Optional | GUID of the connection |
| `Scheduled` | `bool?` | Optional | Indicates if the data sync is scheduled for this connection |
| `ConnectionType` | `string` | Optional | - |
| `Configuration` | `string` | Optional | Configuration properties of the connection |
| `IsExternal` | `bool?` | Optional | - |
| `IsDeprecated` | `bool?` | Optional | Indicates if the connection is deprecated |
| `IsDeleted` | `bool?` | Optional | Indicates if the connection is deleted |
| `IsHidden` | `bool?` | Optional | Indicates if the connection is hideen |
| `Complete` | `bool?` | Optional | Indicates if the all the properties of connection is provided |
| `IndexVersion` | `double?` | Optional | - |
| `GenerationNum` | `double?` | Optional | - |
| `Created` | `string` | Optional | Date and time when user account was created |
| `Modified` | `string` | Optional | Date and time of last modification of user account |
| `Author` | [`Models.UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - |
| `ModifiedBy` | [`Models.UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - |
| `Owner` | [`Models.UserNameAndID`](../../doc/models/user-name-and-id.md) | Optional | - |
| `Tags` | `List<string>` | Optional | List of tags assigned to the connection |
| `Tables` | `List<string>` | Optional | List of tables linked to this connection and details of the columns in the table |

## Example (as JSON)

```json
{
  "name": null,
  "description": null,
  "type": null,
  "id": null,
  "scheduled": null,
  "connectionType": null,
  "configuration": null,
  "isExternal": null,
  "isDeprecated": null,
  "isDeleted": null,
  "isHidden": null,
  "complete": null,
  "indexVersion": null,
  "generationNum": null,
  "created": null,
  "modified": null,
  "author": null,
  "modifiedBy": null,
  "owner": null,
  "tags": null,
  "tables": null
}
```

