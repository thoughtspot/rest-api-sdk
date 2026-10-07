# API Changelog - app_ib_dev vs. 26.11.0.cl


## API Changes

### POST /api/rest/2.0/ai/usage-data/delete
-  endpoint added


### POST /api/rest/2.0/ai/usage-data/search
-  endpoint added


### POST /api/rest/2.0/ai/usage-data/update
-  endpoint added


### GET /api/rest/2.0/ai/usage-data/user
-  endpoint added


### POST /api/rest/2.0/auth/session/login
-  added the new optional request property `no_url_redirection`
-  added the new optional request property `redirect_url`
-  the response header `location` was added for the status `204`
-  added the non-success response with the status `302`


### POST /api/rest/2.0/auth/token/full
-  added the new optional request property `org_identifier`
-  request property `org_id` deprecated


### POST /api/rest/2.0/auth/token/object
-  added the new optional request property `org_identifier`
-  request property `org_id` deprecated


### POST /api/rest/2.0/calendars/generate-csv
-  the response header `content-disposition` was added for the status `200`


### POST /api/rest/2.0/customization/links/update
-  api operation id `updateLinkCustomization` removed and replaced with `updateLinkCustomizations`


### POST /api/rest/2.0/customization/styles/search
-  added the optional property `items/app_color_theme` to the response with the `200` status


### POST /api/rest/2.0/customization/styles/update
-  added the new optional request property `app_color_theme`
-  added the new `APP_COLOR_THEME` enum value to the request property `reset_options/allOf[#/components/schemas/StyleResetOptionsInput]/style/items/`


### POST /api/rest/2.0/localizations/manual-translation/export
-  the response header `content-disposition` was added for the status `200`




## Components
-  removed the schema `UpdateLinkCustomizationRequest`




