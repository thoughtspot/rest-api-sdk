

# WebhookSignatureVerification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Signature verification method type. |  |
|**header** | **String** | HTTP header where the signature is sent. |  |
|**algorithm** | [**AlgorithmEnum**](#AlgorithmEnum) | Hash algorithm used for signature verification. |  |
|**secret** | **String** | Shared secret used for HMAC signature generation. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| HMAC_SHA256 | &quot;HMAC_SHA256&quot; |



## Enum: AlgorithmEnum

| Name | Value |
|---- | -----|
| SHA256 | &quot;SHA256&quot; |


## Implemented Interfaces

* Serializable


