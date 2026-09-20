# API Changelog - app_ib_dev vs. 26.11.0.cl


## API Changes

### POST /api/rest/2.0/customization/links/update
-  api operation id `updateLinkCustomization` removed and replaced with `updateLinkCustomizations`


### POST /api/rest/2.0/customization/styles/search
-  added the optional property `items/app_color_theme` to the response with the `200` status


### POST /api/rest/2.0/customization/styles/update
-  added the new optional request property `app_color_theme`
-  added the new `APP_COLOR_THEME` enum value to the request property `reset_options/allOf[#/components/schemas/StyleResetOptionsInput]/style/items/`




## Components
-  removed the schema `UpdateLinkCustomizationRequest`




