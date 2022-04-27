
# To User Name and ID Input

A JSON object of name or GUIDs of the new owner for the objects. When both are given then id is considered.

## Structure

`ToUserNameAndIDInput`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `string` | Optional | Username of the user |
| `Id` | `string` | Optional | GUID of the user |

## Example (as JSON)

```json
{
  "name": null,
  "id": null
}
```

