
# Org Input

This is applicable only if organization feature is enabled in the cluster.

A JSON object of organization name, id or both, in which the object should be created. When both are given then id is considered. If no value is provided then object will be created in the organization associated with the login session.

## Structure

`OrgInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the organization | String getName() | setName(String name) |
| `Id` | `String` | Optional | Id of the organization | String getId() | setId(String id) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null
}
```

