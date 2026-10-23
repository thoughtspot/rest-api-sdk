# API Changelog - app_ib_dev vs. 26.12.0.cl


## API Changes

### GET /api/rest/2.0/auth/session/user
-  added the optional property `last_active_time_in_millis` to the response with the `200` status


### POST /api/rest/2.0/localizations/manual-translation/export
-  removed the non-success response with the status `404`


### POST /api/rest/2.0/metadata/delete
-  added the new optional request property `delete_mode`
-  added the new optional request property `delete_reason`


### POST /api/rest/2.0/metadata/{logical_table_identifier}/build-index
-  endpoint added


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






