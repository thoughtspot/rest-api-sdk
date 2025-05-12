

# RecipientDetails

Recipient configuration which includes email address, ID or name of the users and groups.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emails** | **List&lt;String&gt;** | Emails of the recipients. Specify email address if the recipient is not a ThoughtSpot user. |  [optional] |
|**principals** | [**List&lt;PrincipalsListItem&gt;**](PrincipalsListItem.md) | List of user or groups to subscribe for the scheduled job notifications. |  [optional] |


## Implemented Interfaces

* Serializable


