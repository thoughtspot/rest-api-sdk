
# Tspublic Rest V2 Security Share Visualization Request

## Structure

`TspublicRestV2SecurityShareVisualizationRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Required | A JSON array of the GUIDs of the objects to be shared |
| `vizId` | `string` | Required | The GUID of visualization |
| `principalId` | `string[]` | Required | The GUID of the users and user groups with which you want to share the visualization |
| `emailId` | `string[] \| undefined` | Optional | The email addresses that should ne notified when the objects are shared |
| `notify` | `boolean \| undefined` | Optional | When set to true, a notification is sent to the users after an object is shared.<br>**Default**: `true` |
| `message` | `string \| undefined` | Optional | The message text to send in the notification email. |
| `includeCustomEmbedUrl` | `boolean \| undefined` | Optional | When set to true, ThoughtSpot sends a link with the host application context to allow users to access the shared object from their ThoughtSpot embedded instance.<br>**Default**: `false` |

## Example (as JSON)

```json
{
  "id": "id0",
  "vizId": "vizId2",
  "principalId": [
    "principalId8",
    "principalId9",
    "principalId0"
  ],
  "emailId": null,
  "notify": null,
  "message": null,
  "includeCustomEmbedUrl": null
}
```

