# Admin

```python
admin_controller = client.admin
```

## Class Name

`AdminController`

## Methods

* [Restapi V2 Update Cluster Config](../../doc/controllers/admin.md#restapi-v2-update-cluster-config)
* [Restapi V2 Reset User Password](../../doc/controllers/admin.md#restapi-v2-reset-user-password)
* [Restapi V2 Sync Principal](../../doc/controllers/admin.md#restapi-v2-sync-principal)
* [Restapi V2 Change Author of Objects](../../doc/controllers/admin.md#restapi-v2-change-author-of-objects)
* [Restapi V2 Assign Author to Objects](../../doc/controllers/admin.md#restapi-v2-assign-author-to-objects)
* [Restapi V2 Force Logout Users](../../doc/controllers/admin.md#restapi-v2-force-logout-users)


# Restapi V2 Update Cluster Config

To update the Thoughtspot cluster configuration, use this endpoint.

```python
def restapi_v_2__update_cluster_config(self,
                                      body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2AdminConfigurationUpdateRequest`](../../doc/models/tspublic-rest-v2-admin-configuration-update-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2AdminConfigurationUpdateRequest()

result = admin_controller.restapi_v_2__update_cluster_config(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Reset User Password

To reset the password of a ThoughtSpot user account, use this endpoint.

It is mandatory to use Authorization header with token of a user with admin access to successfully run this endpoint.

At least one of User Id or username is mandatory. When both are given, then user id will be considered.

```python
def restapi_v_2__reset_user_password(self,
                                    body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2AdminResetpasswordRequest`](../../doc/models/tspublic-rest-v2-admin-resetpassword-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2AdminResetpasswordRequest()
body.new_password = 'newPassword0'

result = admin_controller.restapi_v_2__reset_user_password(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Sync Principal

To programmatically synchronize user accounts and user groups from external system with ThoughtSpot, use this endpoint.

The payload takes principals containing all users and groups present in the external system.

The users and user groups in Thoughtspot get updated for any matching inputs.

Any user and user group present in the input, but not present in the cluster, gets created in cluster.
n You can optionally choose to delete the user and groups from the cluster, that are not present in the input.

```python
def restapi_v_2__sync_principal(self,
                               body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2AdminSyncprincipalRequest`](../../doc/models/tspublic-rest-v2-admin-syncprincipal-request.md) | Body, Required | - |

## Response Type

[`AdminsyncPrincipalResponse`](../../doc/models/adminsync-principal-response.md)

## Example Usage

```python
body = TspublicRestV2AdminSyncprincipalRequest()
body.principal_object = [jsonpickle.decode('{"key1":"val1","key2":"val2"}')]

result = admin_controller.restapi_v_2__sync_principal(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Change Author of Objects

To programmatically change the owner of one or several objects from one user account to another, use this endpoint.

You might want to transfer ownership of objects owned by a user to another active user, when the account is removed from the ThoughtSpot application.

```python
def restapi_v_2__change_author_of_objects(self,
                                         body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2AdminChangeauthorRequest`](../../doc/models/tspublic-rest-v2-admin-changeauthor-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2AdminChangeauthorRequest()
body.ts_object_id = ['tsObjectId7']
body.from_user = FromUserNameAndIDInput()
body.to_user = ToUserNameAndIDInput()

result = admin_controller.restapi_v_2__change_author_of_objects(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Assign Author to Objects

To programmatically assign an author to one or several objects, use this endpoint.

Provide either user name or id as input. When both are given user id will be considered.

Requires administration privilege.

```python
def restapi_v_2__assign_author_to_objects(self,
                                         body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2AdminAssignauthorRequest`](../../doc/models/tspublic-rest-v2-admin-assignauthor-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2AdminAssignauthorRequest()
body.ts_object_id = ['tsObjectId7']

result = admin_controller.restapi_v_2__assign_author_to_objects(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Force Logout Users

To logout one or more users from logged in session, use this endpoint. If no input is provided then all logged in users are force logged out.

Requires administration privilege

```python
def restapi_v_2__force_logout_users(self,
                                   body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TspublicRestV2AdminForcelogoutRequest`](../../doc/models/tspublic-rest-v2-admin-forcelogout-request.md) | Body, Required | - |

## Response Type

`bool`

## Example Usage

```python
body = TspublicRestV2AdminForcelogoutRequest()

result = admin_controller.restapi_v_2__force_logout_users(body)
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

