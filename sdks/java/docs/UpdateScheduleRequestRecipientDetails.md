

# UpdateScheduleRequestRecipientDetails

Recipients of the scheduled job notifications. You can add the ID or name of the ThoughtSpot users or groups as recipients in the `principals` array. If a recipient is not a ThoughtSpot user, specify email address.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emails** | **List&lt;String&gt;** | Emails of the recipients. |  [optional] |
|**principals** | [**List&lt;PrincipalsListItemInput&gt;**](PrincipalsListItemInput.md) | User or groups to be set as recipients of the schedule notifications. |  [optional] |



