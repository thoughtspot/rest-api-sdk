# API Changelog - 26.10.0.cl vs. 26.9


## API Changes

### POST /api/rest/2.0/ai/agent/analysts/create
-  endpoint added


### POST /api/rest/2.0/ai/agent/analysts/search
-  endpoint added


### POST /api/rest/2.0/ai/agent/analysts/{analyst_identifier}/delete
-  endpoint added


### POST /api/rest/2.0/ai/agent/analysts/{analyst_identifier}/share
-  endpoint added


### POST /api/rest/2.0/ai/agent/analysts/{analyst_identifier}/update
-  endpoint added


### POST /api/rest/2.0/ai/agent/conversation/create
-  added the new optional request property `analyst_identifier`
-  the request property `metadata_context` became optional
-  added the optional property `analyst_id` to the response with the `200` status
-  added the optional property `analyst_id` to the response with the `201` status


### GET /api/rest/2.0/ai/agent/conversations
-  added the optional property `conversations/items/analyst_id` to the response with the `200` status
-  added the optional property `conversations/items/analyst_id` to the response with the `201` status
-  added the optional property `conversations/items/is_pinned` to the response with the `200` status
-  added the optional property `conversations/items/is_pinned` to the response with the `201` status


### GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/get-shared-content
-  added the optional property `creator_user_id` to the response with the `200` status
-  added the optional property `creator_user_id` to the response with the `201` status
-  added the required property `analyst_ids` to the response with the `200` status
-  added the required property `analyst_ids` to the response with the `201` status


### POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/share
-  added the new optional request property `notify_on_share`


### POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update
-  added the new optional request property `is_pinned`


### POST /api/rest/2.0/auth/token/custom
-  added the new optional request property `scope`
-  added the optional property `scope` to the response with the `200` status


### POST /api/rest/2.0/auth/token/full
-  added the new optional request property `scope`
-  added the optional property `scope/org_ids` to the response with the `200` status
-  added the optional property `scope/org_scope` to the response with the `200` status


### POST /api/rest/2.0/auth/token/object
-  added the new optional request property `scope`
-  added the optional property `scope/org_ids` to the response with the `200` status
-  added the optional property `scope/org_scope` to the response with the `200` status


### POST /api/rest/2.0/auth/token/validate
-  added the optional property `scope/org_ids` to the response with the `200` status
-  added the optional property `scope/org_scope` to the response with the `200` status


### POST /api/rest/2.0/configurations/features/assignments/update
-  endpoint added


### POST /api/rest/2.0/configurations/features/search
-  endpoint added


### POST /api/rest/2.0/configurations/features/values/update
-  endpoint added


### POST /api/rest/2.0/groups/create
- :warning: removed the enum value `CAN_CREATE_KPI_ALERTS` of the request property `privileges/items/`


### POST /api/rest/2.0/groups/import
- :warning: removed the enum value `CAN_CREATE_KPI_ALERTS` of the request property `groups/items/privileges/items/`


### POST /api/rest/2.0/groups/search
- :warning: removed the enum value `CAN_CREATE_KPI_ALERTS` of the request property `privileges/items/`


### POST /api/rest/2.0/groups/{group_identifier}/update
- :warning: removed the enum value `CAN_CREATE_KPI_ALERTS` of the request property `privileges/items/`


### POST /api/rest/2.0/metadata/headers/update
-  added the new `ROLE` enum value to the request property `headers_update/items/type`
-  added the new `TEMPLATE_VARIABLE` enum value to the request property `headers_update/items/type`


### POST /api/rest/2.0/metadata/tml/export
-  added the new `TEMPLATE_VARIABLE` enum value to the request property `metadata/items/type`


### POST /api/rest/2.0/metadata/update-obj-id
-  added the new `ROLE` enum value to the request property `metadata/items/type`
-  added the new `TEMPLATE_VARIABLE` enum value to the request property `metadata/items/type`


### POST /api/rest/2.0/roles/create
- :warning: removed the enum value `CAN_CREATE_KPI_ALERTS` of the request property `privileges/items/`
-  removed the `CAN_CREATE_KPI_ALERTS` enum value from the `privileges/items/` response property for the response status `200`


### POST /api/rest/2.0/roles/search
- :warning: removed the enum value `CAN_CREATE_KPI_ALERTS` of the request property `privileges/items/`
-  removed the `CAN_CREATE_KPI_ALERTS` enum value from the `items/privileges/items/` response property for the response status `200`


### POST /api/rest/2.0/roles/{role_identifier}/update
- :warning: removed the enum value `CAN_CREATE_KPI_ALERTS` of the request property `privileges/items/`
-  removed the `CAN_CREATE_KPI_ALERTS` enum value from the `privileges/items/` response property for the response status `200`


### POST /api/rest/2.0/semantic-integrations/create
-  added the new `RDBMS_DATABRICKS` enum value to the request property `type`


### POST /api/rest/2.0/semantic-integrations/search
- :warning: added the new `RDBMS_DATABRICKS` enum value to the `items/type` response property for the response status `200`


### POST /api/rest/2.0/template/variables/create
-  added the optional property `obj_id` to the response with the `200` status


### POST /api/rest/2.0/template/variables/search
-  added the optional property `items/obj_id` to the response with the `200` status


### POST /api/rest/2.0/users/search
- :warning: removed the enum value `CAN_CREATE_KPI_ALERTS` of the request property `privileges/items/`






