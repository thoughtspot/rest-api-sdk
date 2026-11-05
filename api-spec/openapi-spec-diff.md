# API Changelog - app_ib_dev vs. 26.12.0.cl


## API Changes

### POST /api/rest/2.0/ai/agent/conversation/create
-  added the new optional request property `additional_instructions`
-  added the new optional request property `spotter_experience_version`
-  the request property `conversation_settings` became optional


### POST /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send
-  added the new optional request property `spotter_experience_version`


### POST /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send/stream
- :warning: the response body was restructured into a oneOf, so a field that was previously guaranteed may no longer be present
- :warning: removed the required property `success` from the response with the `201` status
- :warning: removed the optional property `message` from the response with the `201` status
-  added the new optional request property `spotter_experience_version`


### POST /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/stop-response
-  added optional request body


### GET /api/rest/2.0/ai/agent/conversations
-  added the new optional `query` request parameter `spotter_experience_version`


### DELETE /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/delete
-  added the new optional `query` request parameter `spotter_experience_version`


### POST /api/rest/2.0/auth/session/login
-  added the new optional request property `no_url_redirection`
-  added the new optional request property `redirect_url`
-  the response header `location` was added for the status `204`
-  added the non-success response with the status `302`


### GET /api/rest/2.0/auth/session/user
-  added the optional property `last_active_time_in_millis` to the response with the `200` status


### POST /api/rest/2.0/auth/token/full
-  added the new optional request property `org_identifier`
-  request property `org_id` deprecated


### POST /api/rest/2.0/auth/token/object
-  added the new optional request property `org_identifier`
-  request property `org_id` deprecated


### POST /api/rest/2.0/configurations/features/search
-  added the optional property `items/docs_new_window` to the response with the `200` status
-  added the optional property `items/features/items/docs_new_window` to the response with the `200` status


### POST /api/rest/2.0/customization/custom-actions
-  endpoint deprecated


### POST /api/rest/2.0/customization/custom-actions/search
-  endpoint deprecated


### POST /api/rest/2.0/customization/custom-actions/{custom_action_identifier}/delete
-  endpoint deprecated


### POST /api/rest/2.0/customization/custom-actions/{custom_action_identifier}/update
-  endpoint deprecated


### POST /api/rest/2.0/customization/styles/search
-  added the optional property `items/app_color_theme` to the response with the `200` status


### POST /api/rest/2.0/customization/styles/update
-  added the new optional request property `app_color_theme`
-  added the new `APP_COLOR_THEME` enum value to the request property `reset_options/allOf[#/components/schemas/StyleResetOptionsInput]/style/items/`


### POST /api/rest/2.0/localizations/manual-translation/export
-  removed the non-success response with the status `404`


### POST /api/rest/2.0/localizations/manual-translation/template/export
-  endpoint added


### POST /api/rest/2.0/metadata/delete
-  added the new optional request property `delete_mode`
-  added the new optional request property `delete_reason`


### POST /api/rest/2.0/metadata/{logical_table_identifier}/build-index
-  endpoint added


### POST /api/rest/2.0/orgs/search
-  added the new optional request property `record_offset`
-  added the new optional request property `record_size`


### POST /api/rest/2.0/roles/search
- :warning: added the new `CAN_CREATE_DATA_APP` enum value to the `items/privileges/items/` response property for the response status `200`
- :warning: added the new `CAN_CREATE_MUZE_STUDIO_TEMPLATES` enum value to the `items/privileges/items/` response property for the response status `200`
- :warning: added the new `CAN_EDIT_INPUT_TABLES` enum value to the `items/privileges/items/` response property for the response status `200`
- :warning: added the new `CAN_MANAGE_INPUT_TABLES` enum value to the `items/privileges/items/` response property for the response status `200`
- :warning: added the new `CAN_MODIFY_FOLDERS` enum value to the `items/privileges/items/` response property for the response status `200`
-  added the new `CAN_CREATE_DATA_APP` enum value to the request property `privileges/items/`
-  added the new `CAN_CREATE_MUZE_STUDIO_TEMPLATES` enum value to the request property `privileges/items/`
-  added the new `CAN_EDIT_INPUT_TABLES` enum value to the request property `privileges/items/`
-  added the new `CAN_MANAGE_INPUT_TABLES` enum value to the request property `privileges/items/`
-  added the new `CAN_MODIFY_FOLDERS` enum value to the request property `privileges/items/`


### POST /api/rest/2.0/users/activate
-  added the optional property `last_active_time_in_millis` to the response with the `200` status


### POST /api/rest/2.0/users/create
-  added the optional property `last_active_time_in_millis` to the response with the `200` status


### POST /api/rest/2.0/users/search
-  added the optional property `items/last_active_time_in_millis` to the response with the `200` status


### POST /api/rest/2.0/version-control/branch/promote
-  endpoint added


### POST /api/rest/2.0/version-control/commit
-  endpoint added


### POST /api/rest/2.0/version-control/commit/restore
-  endpoint added


### POST /api/rest/2.0/version-control/config/create
-  endpoint added


### POST /api/rest/2.0/version-control/config/delete
-  endpoint added


### POST /api/rest/2.0/version-control/config/search
-  endpoint added


### POST /api/rest/2.0/version-control/config/update
-  endpoint added


### POST /api/rest/2.0/version-control/deploy
-  endpoint added


### POST /api/rest/2.0/version-control/runs/search
-  endpoint added






