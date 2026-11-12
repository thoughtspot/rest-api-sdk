

# VersionControlCredentialInput

Credential ThoughtSpot uses to reach an Org's repository.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | How the credential is held. |  |
|**username** | **String** | Username presented with the token over HTTPS, for example svc-version-control. |  [optional] |
|**accessToken** | **String** | Access token granting repository contents read and write, and metadata read. Add the provider&#39;s repository-rules read permission for rule-aware validation. Required when type is ACCESS_TOKEN. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ACCESS_TOKEN | &quot;ACCESS_TOKEN&quot; |


## Implemented Interfaces

* Serializable


