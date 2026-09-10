# API Changelog - app_ib_dev vs. 26.10.0.cl


## API Changes

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


### POST /api/rest/2.0/metadata/search
-  added the new optional request property `dependent_objects_record_offset`
-  added the optional property `items/dependent_objects_is_last_batch` to the response with the `200` status


### POST /api/rest/2.0/webhooks/{webhook_identifier}/update
-  added the new optional request property `operation`






