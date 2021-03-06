
# From User Name and ID Input

A JSON object of name or GUIDs of the current owner of the objects. When both are given then id is considered.

If a list of object ids are provided as input for TsObjectId, then only for those ids that have owner as the value provided in fromUser, the owner will be changed.

Provide either name or id as input. When both are given user id will be considered.

## Structure

`FromUserNameAndIDInput`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Username of the user |
| `id` | `string \| undefined` | Optional | GUID of the user |

## Example (as JSON)

```json
{
  "name": null,
  "id": null
}
```

