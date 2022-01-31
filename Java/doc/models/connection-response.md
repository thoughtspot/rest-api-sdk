
# Connection Response

## Structure

`ConnectionResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the connection | String getName() | setName(String name) |
| `Description` | `String` | Optional | Description associated with the connection | String getDescription() | setDescription(String description) |
| `Type` | `String` | Optional | Type of the connection. The database associated with this type can be obtained from the response returned by the /api/rest/v2/connection/types API endpoint. | String getType() | setType(String type) |
| `Id` | `String` | Optional | GUID of the connection | String getId() | setId(String id) |
| `Scheduled` | `Boolean` | Optional | Indicates if the data sync is scheduled for this connection | Boolean getScheduled() | setScheduled(Boolean scheduled) |
| `ConnectionType` | `String` | Optional | - | String getConnectionType() | setConnectionType(String connectionType) |
| `Configuration` | `String` | Optional | Configuration properties of the connection | String getConfiguration() | setConfiguration(String configuration) |
| `IsExternal` | `Boolean` | Optional | - | Boolean getIsExternal() | setIsExternal(Boolean isExternal) |
| `IsDeprecated` | `Boolean` | Optional | Indicates if the connection is deprecated | Boolean getIsDeprecated() | setIsDeprecated(Boolean isDeprecated) |
| `IsDeleted` | `Boolean` | Optional | Indicates if the connection is deleted | Boolean getIsDeleted() | setIsDeleted(Boolean isDeleted) |
| `IsHidden` | `Boolean` | Optional | Indicates if the connection is hideen | Boolean getIsHidden() | setIsHidden(Boolean isHidden) |
| `Complete` | `Boolean` | Optional | Indicates if the all the properties of connection is provided | Boolean getComplete() | setComplete(Boolean complete) |
| `IndexVersion` | `Integer` | Optional | - | Integer getIndexVersion() | setIndexVersion(Integer indexVersion) |
| `GenerationNum` | `Integer` | Optional | - | Integer getGenerationNum() | setGenerationNum(Integer generationNum) |
| `Created` | `String` | Optional | Date and time when the connection was created | String getCreated() | setCreated(String created) |
| `Modified` | `String` | Optional | Date and time of last modification of the connection | String getModified() | setModified(String modified) |
| `Author` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - | UserNameAndID getAuthor() | setAuthor(UserNameAndID author) |
| `ModifiedBy` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - | UserNameAndID getModifiedBy() | setModifiedBy(UserNameAndID modifiedBy) |
| `Owner` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - | UserNameAndID getOwner() | setOwner(UserNameAndID owner) |
| `Tags` | `List<String>` | Optional | List of tags assigned to the connection | List<String> getTags() | setTags(List<String> tags) |
| `Tables` | [`List<TableList>`](/doc/models/table-list.md) | Optional | List of tables linked to this connection | List<TableList> getTables() | setTables(List<TableList> tables) |

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

