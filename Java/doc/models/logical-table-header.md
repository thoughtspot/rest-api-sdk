
# Logical Table Header

## Structure

`LogicalTableHeader`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Author` | `String` | Optional | - | String getAuthor() | setAuthor(String author) |
| `AuthorName` | `String` | Optional | - | String getAuthorName() | setAuthorName(String authorName) |
| `AuthorDisplayName` | `String` | Optional | - | String getAuthorDisplayName() | setAuthorDisplayName(String authorDisplayName) |
| `Created` | `Double` | Optional | - | Double getCreated() | setCreated(Double created) |
| `Modified` | `Double` | Optional | - | Double getModified() | setModified(Double modified) |
| `ModifiedBy` | `String` | Optional | - | String getModifiedBy() | setModifiedBy(String modifiedBy) |
| `GenerationNum` | `Integer` | Optional | - | Integer getGenerationNum() | setGenerationNum(Integer generationNum) |
| `Owner` | `String` | Optional | - | String getOwner() | setOwner(String owner) |
| `Deleted` | [`LogicalTableHeaderDeletedEnum`](../../doc/models/logical-table-header-deleted-enum.md) | Optional | - | LogicalTableHeaderDeletedEnum getDeleted() | setDeleted(LogicalTableHeaderDeletedEnum deleted) |
| `Hidden` | [`LogicalTableHeaderHiddenEnum`](../../doc/models/logical-table-header-hidden-enum.md) | Optional | - | LogicalTableHeaderHiddenEnum getHidden() | setHidden(LogicalTableHeaderHiddenEnum hidden) |
| `Database` | `String` | Optional | - | String getDatabase() | setDatabase(String database) |
| `Schema` | `String` | Optional | - | String getSchema() | setSchema(String schema) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `SubType` | `String` | Optional | - | String getSubType() | setSubType(String subType) |

## Example (as JSON)

```json
{
  "id": null,
  "name": null,
  "author": null,
  "authorName": null,
  "authorDisplayName": null,
  "created": null,
  "modified": null,
  "modifiedBy": null,
  "generationNum": null,
  "owner": null,
  "deleted": null,
  "hidden": null,
  "database": null,
  "schema": null,
  "type": null,
  "subType": null
}
```

