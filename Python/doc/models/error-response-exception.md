
# Error Response Exception

## Structure

`ErrorResponseException`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `error` | `object` | Optional | - |

## Example (as JSON)

```json
{
  "error": {
    "errors": {
      "message": "Request failed with status code 500",
      "locations": {
        "line": 2,
        "column": 3
      },
      "path": [
        "restapiV2__login"
      ],
      "extension": {
        "service": "CALLOSUM",
        "code": "UPSTREAM_FAILURE",
        "exception": {
          "service": "CALLOSUM",
          "upstreamResponse": {
            "data": {
              "code": 10002,
              "incident_id_guid": "deb0bc49-8414-4690-bc03-d7e0251d65b4",
              "trace_id_guid": "deb0bc49-8414-4690-bc03-d7e0251d65b4",
              "debug": "Invalid parameter values userName"
            },
            "status": 400
          },
          "stacktrace": [
            "Request failed with status code 400"
          ]
        }
      }
    }
  }
}
```

