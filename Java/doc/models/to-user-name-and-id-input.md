
# To User Name and ID Input

A JSON object of name or GUIDs of the new owner for the objects. When both are given then id is considered.

## Structure

`ToUserNameAndIDInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Username of the user | String getName() | setName(String name) |
| `Id` | `String` | Optional | GUID of the user | String getId() | setId(String id) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null
}
```

