
# Tspublic Rest V2 Security Share Visualization Request

## Structure

`TspublicRestV2SecurityShareVisualizationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The GUID of the Liveboard to be shared | String getId() | setId(String id) |
| `VizId` | `String` | Required | The GUID of visualization | String getVizId() | setVizId(String vizId) |
| `PrincipalId` | `List<String>` | Required | The GUID of the users and user groups with which you want to share the visualization | List<String> getPrincipalId() | setPrincipalId(List<String> principalId) |
| `EmailId` | `List<String>` | Optional | The email addresses that should ne notified when the objects are shared. | List<String> getEmailId() | setEmailId(List<String> emailId) |
| `Notify` | [`ShareVisualizationNotifyEnum`](../../doc/models/share-visualization-notify-enum.md) | Optional | When set to true, a notification is sent to the users after an object is shared.<br>**Default**: `ShareVisualizationNotifyEnum.ENUM_TRUE` | ShareVisualizationNotifyEnum getNotify() | setNotify(ShareVisualizationNotifyEnum notify) |
| `Message` | `String` | Optional | The message text to send in the notification email | String getMessage() | setMessage(String message) |
| `IncludeCustomEmbedUrl` | [`ShareVisualizationIncludeCustomEmbedUrlEnum`](../../doc/models/share-visualization-include-custom-embed-url-enum.md) | Optional | When set to true, ThoughtSpot sends a link with the host application context to allow users to access the shared object from their ThoughtSpot embedded instance.<br>**Default**: `ShareVisualizationIncludeCustomEmbedUrlEnum.ENUM_FALSE` | ShareVisualizationIncludeCustomEmbedUrlEnum getIncludeCustomEmbedUrl() | setIncludeCustomEmbedUrl(ShareVisualizationIncludeCustomEmbedUrlEnum includeCustomEmbedUrl) |

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

