# API Changelog - 26.9 vs. 26.8.0.cl


## API Changes

### GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/get-share-info
-  endpoint added


### GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/get-shared-content
-  endpoint added


### POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/share
-  endpoint added


### POST /api/rest/2.0/auth/token/custom
-  added the non-success response with the status `409`


### POST /api/rest/2.0/collections/create
-  added the optional property `obj_id` to the response with the `200` status


### POST /api/rest/2.0/collections/search
-  added the optional property `collections/items/obj_id` to the response with the `200` status


### POST /api/rest/2.0/connection-configurations/create
- :warning: added the new `SCHEDULED_LIVEBOARDS` enum value to the `policy_processes/items/` response property for the response status `200`
-  added the new `OAUTH_CLIENT_CREDENTIALS_WITH_X509` enum value to the request property `authentication_type`
-  added the new `SCHEDULED_LIVEBOARDS` enum value to the request property `policy_processes/items/`


### POST /api/rest/2.0/connection-configurations/search
- :warning: added the new `SCHEDULED_LIVEBOARDS` enum value to the `items/policy_processes/items/` response property for the response status `200`


### POST /api/rest/2.0/connection-configurations/{configuration_identifier}/update
-  added the new `OAUTH_CLIENT_CREDENTIALS_WITH_X509` enum value to the request property `authentication_type`
-  added the new `SCHEDULED_LIVEBOARDS` enum value to the request property `policy_processes/items/`


### POST /api/rest/2.0/connection/search
-  added the new `OAUTH_CLIENT_CREDENTIALS_WITH_X509` enum value to the request property `authentication_type`
-  added the optional property `items/obj_id` to the response with the `200` status


### POST /api/rest/2.0/customization/custom-actions
-  added the optional property `obj_id` to the response with the `200` status


### POST /api/rest/2.0/customization/custom-actions/search
-  added the optional property `items/obj_id` to the response with the `200` status


### POST /api/rest/2.0/groups/create
-  added the new `CAN_ADMINISTER_SCHEDULES` enum value to the request property `privileges/items/`
-  added the new `CAN_ANALYZE_DATA` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_ANSWERS` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_KPI_ALERTS` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_LIVEBOARD` enum value to the request property `privileges/items/`
-  added the optional property `obj_id` to the response with the `200` status


### POST /api/rest/2.0/groups/import
-  added the new `CAN_ADMINISTER_SCHEDULES` enum value to the request property `groups/items/privileges/items/`
-  added the new `CAN_ANALYZE_DATA` enum value to the request property `groups/items/privileges/items/`
-  added the new `CAN_CREATE_ANSWERS` enum value to the request property `groups/items/privileges/items/`
-  added the new `CAN_CREATE_KPI_ALERTS` enum value to the request property `groups/items/privileges/items/`
-  added the new `CAN_CREATE_LIVEBOARD` enum value to the request property `groups/items/privileges/items/`


### POST /api/rest/2.0/groups/search
-  added the new `CAN_ADMINISTER_SCHEDULES` enum value to the request property `privileges/items/`
-  added the new `CAN_ANALYZE_DATA` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_ANSWERS` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_KPI_ALERTS` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_LIVEBOARD` enum value to the request property `privileges/items/`
-  added the optional property `items/obj_id` to the response with the `200` status


### POST /api/rest/2.0/groups/{group_identifier}/update
-  added the new `CAN_ADMINISTER_SCHEDULES` enum value to the request property `privileges/items/`
-  added the new `CAN_ANALYZE_DATA` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_ANSWERS` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_KPI_ALERTS` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_LIVEBOARD` enum value to the request property `privileges/items/`


### POST /api/rest/2.0/roles/create
- :warning: added the new `CAN_ADMINISTER_SCHEDULES` enum value to the `privileges/items/` response property for the response status `200`
- :warning: added the new `CAN_ANALYZE_DATA` enum value to the `privileges/items/` response property for the response status `200`
- :warning: added the new `CAN_CREATE_ANSWERS` enum value to the `privileges/items/` response property for the response status `200`
- :warning: added the new `CAN_CREATE_KPI_ALERTS` enum value to the `privileges/items/` response property for the response status `200`
- :warning: added the new `CAN_CREATE_LIVEBOARD` enum value to the `privileges/items/` response property for the response status `200`
-  added the new `CAN_ADMINISTER_SCHEDULES` enum value to the request property `privileges/items/`
-  added the new `CAN_ANALYZE_DATA` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_ANSWERS` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_KPI_ALERTS` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_LIVEBOARD` enum value to the request property `privileges/items/`


### POST /api/rest/2.0/roles/search
- :warning: added the new `CAN_ADMINISTER_SCHEDULES` enum value to the `items/privileges/items/` response property for the response status `200`
- :warning: added the new `CAN_ANALYZE_DATA` enum value to the `items/privileges/items/` response property for the response status `200`
- :warning: added the new `CAN_CREATE_ANSWERS` enum value to the `items/privileges/items/` response property for the response status `200`
- :warning: added the new `CAN_CREATE_KPI_ALERTS` enum value to the `items/privileges/items/` response property for the response status `200`
- :warning: added the new `CAN_CREATE_LIVEBOARD` enum value to the `items/privileges/items/` response property for the response status `200`
-  added the new `CAN_ADMINISTER_SCHEDULES` enum value to the request property `privileges/items/`
-  added the new `CAN_ANALYZE_DATA` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_ANSWERS` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_KPI_ALERTS` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_LIVEBOARD` enum value to the request property `privileges/items/`
-  added the optional property `items/obj_id` to the response with the `200` status


### POST /api/rest/2.0/roles/{role_identifier}/update
- :warning: added the new `CAN_ADMINISTER_SCHEDULES` enum value to the `privileges/items/` response property for the response status `200`
- :warning: added the new `CAN_ANALYZE_DATA` enum value to the `privileges/items/` response property for the response status `200`
- :warning: added the new `CAN_CREATE_ANSWERS` enum value to the `privileges/items/` response property for the response status `200`
- :warning: added the new `CAN_CREATE_KPI_ALERTS` enum value to the `privileges/items/` response property for the response status `200`
- :warning: added the new `CAN_CREATE_LIVEBOARD` enum value to the `privileges/items/` response property for the response status `200`
-  added the new `CAN_ADMINISTER_SCHEDULES` enum value to the request property `privileges/items/`
-  added the new `CAN_ANALYZE_DATA` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_ANSWERS` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_KPI_ALERTS` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_LIVEBOARD` enum value to the request property `privileges/items/`


### POST /api/rest/2.0/semantic-integrations/create
-  endpoint added


### POST /api/rest/2.0/semantic-integrations/search
-  endpoint added


### POST /api/rest/2.0/semantic-integrations/{semantic_integration_identifier}/delete
-  endpoint added


### POST /api/rest/2.0/semantic-integrations/{semantic_integration_identifier}/import
-  endpoint added


### POST /api/rest/2.0/users/search
-  added the new `CAN_ADMINISTER_SCHEDULES` enum value to the request property `privileges/items/`
-  added the new `CAN_ANALYZE_DATA` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_ANSWERS` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_KPI_ALERTS` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_LIVEBOARD` enum value to the request property `privileges/items/`






