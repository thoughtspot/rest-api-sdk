
# Tspublic Rest V2 Security Share Tsobject Request

## Structure

`TspublicRestV2SecurityShareTsobjectRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Type` | [`Models.ShareObjectTypeEnum`](../../doc/models/share-object-type-enum.md) | Required | Type of metadata object |
| `Id` | `List<string>` | Required | A JSON array of the GUIDs of the objects to be shared |
| `Permission` | `string` | Required | A JSON object with GUIDs of user and user group, and the type of access privilge.<br><br>You can provide READ_ONLY or MODIFY access to the objects. With READ_ONLY access, the user or user group can view the shared object, whereas MODIFY access enables users to modify the object.<br><br>To remove access to a shared object, you can set the shareMode in the permission string to NO_ACCESS. Example:<br><br>{"permissions": {"e7040a64-7ff1-4ab9-a1b0-f1acac596866": {"shareMode": "READ_ONLY"}, "f7b8f511-317c-485d-8131-26cf084ef47b": {"shareMode": "MODIFY"}, "7a9a6715-e154-431b-baaf-7b58246c13dd":{"shareMode":"NO_ACCESS"}}} |
| `EmailId` | `List<string>` | Optional | The email addresses that should ne notified when the objects are shared. |
| `Notify` | [`Models.ShareObjectNotifyEnum?`](../../doc/models/share-object-notify-enum.md) | Optional | When set to true, a notification is sent to the users after an object is shared.<br>**Default**: `ShareObjectNotifyEnum.true` |
| `Message` | `string` | Optional | The message text to send in the notification email |
| `IncludeCustomEmbedUrl` | [`Models.ShareObjectIncludeCustomEmbedUrlEnum?`](../../doc/models/share-object-include-custom-embed-url-enum.md) | Optional | When set to true, ThoughtSpot sends a link with the host application context to allow users to access the shared object from their ThoughtSpot embedded instance.<br>**Default**: `ShareObjectIncludeCustomEmbedUrlEnum.false` |

## Example (as JSON)

```json
{
  "type": "DATAOBJECT",
  "id": [
    "id0"
  ],
  "permission": "permission2",
  "emailId": null,
  "notify": null,
  "message": null,
  "includeCustomEmbedUrl": null
}
```

