# API Changelog - 26.11.0.cl vs. 26.10.0.cl


## API Changes

### POST /api/rest/2.0/customization/links/search
-  endpoint added


### POST /api/rest/2.0/customization/links/update
-  endpoint added


### POST /api/rest/2.0/groups/import
-  added the new optional request property `groups/items/role_identifiers`


### POST /api/rest/2.0/input-tables/create
-  endpoint added


### POST /api/rest/2.0/input-tables/{input_table_identifier}/columns/create
-  endpoint added


### POST /api/rest/2.0/input-tables/{input_table_identifier}/columns/{column_identifier}/delete
-  endpoint added


### POST /api/rest/2.0/input-tables/{input_table_identifier}/delete
-  endpoint added


### POST /api/rest/2.0/input-tables/{input_table_identifier}/update
-  endpoint added


### POST /api/rest/2.0/metadata/headers/update
-  added the new `PERSONALISED_VIEW` enum value to the request property `headers_update/items/type`


### POST /api/rest/2.0/metadata/search
- :warning: added the new `TEMPLATE_VARIABLE` enum value to the `items/metadata_type` response property for the response status `200`
-  added the new optional request property `dependent_objects_record_offset`
-  added the new `TEMPLATE_VARIABLE` enum value to the request property `exclude_objects/items/type`
-  added the new `TEMPLATE_VARIABLE` enum value to the request property `metadata/items/type`
-  added the optional property `items/dependent_objects_is_last_batch` to the response with the `200` status


### POST /api/rest/2.0/metadata/update-obj-id
-  added the new `PERSONALISED_VIEW` enum value to the request property `metadata/items/type`


### GET /api/rest/2.0/system
-  added the optional property `maintenance_schedule` to the response with the `200` status


### POST /api/rest/2.0/webhooks/{webhook_identifier}/update
-  added the new optional request property `operation`






