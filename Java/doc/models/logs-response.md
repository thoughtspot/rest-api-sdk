
# Logs Response

## Structure

`LogsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Date` | `String` | Optional | Date and time for the event in the log | String getDate() | setDate(String date) |
| `Log` | `String` | Optional | Logged event at the time specified in JSON format. This includes, Event ID, A unique description of the event, for example, User login failed, Timestamp, User ID of the person initiating the event and IP address of the ThoughtSpot instance. | String getLog() | setLog(String log) |

## Example (as JSON)

```json
{
  "date": null,
  "log": null
}
```

