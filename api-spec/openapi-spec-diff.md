# API Changelog - app_ib_dev vs. 26.10.0.cl


## API Changes

### POST /api/rest/2.0/groups/create
-  added the new `CAN_CREATE_KPI_ALERTS` enum value to the request property `privileges/items/`


### POST /api/rest/2.0/groups/import
-  added the new `CAN_CREATE_KPI_ALERTS` enum value to the request property `groups/items/privileges/items/`


### POST /api/rest/2.0/groups/search
-  added the new `CAN_CREATE_KPI_ALERTS` enum value to the request property `privileges/items/`


### POST /api/rest/2.0/groups/{group_identifier}/update
-  added the new `CAN_CREATE_KPI_ALERTS` enum value to the request property `privileges/items/`


### POST /api/rest/2.0/input-tables/create
-  endpoint added


### POST /api/rest/2.0/input-tables/{input_table_identifier}/delete
-  endpoint added


### POST /api/rest/2.0/input-tables/{input_table_identifier}/update
-  endpoint added


### POST /api/rest/2.0/roles/create
- :warning: added the new `CAN_CREATE_KPI_ALERTS` enum value to the `privileges/items/` response property for the response status `200`
-  added the new `CAN_CREATE_KPI_ALERTS` enum value to the request property `privileges/items/`


### POST /api/rest/2.0/roles/search
- :warning: added the new `CAN_CREATE_KPI_ALERTS` enum value to the `items/privileges/items/` response property for the response status `200`
-  added the new `CAN_CREATE_KPI_ALERTS` enum value to the request property `privileges/items/`


### POST /api/rest/2.0/roles/{role_identifier}/update
- :warning: added the new `CAN_CREATE_KPI_ALERTS` enum value to the `privileges/items/` response property for the response status `200`
-  added the new `CAN_CREATE_KPI_ALERTS` enum value to the request property `privileges/items/`


### POST /api/rest/2.0/users/search
-  added the new `CAN_CREATE_KPI_ALERTS` enum value to the request property `privileges/items/`






