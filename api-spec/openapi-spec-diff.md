# API Changelog - 26.8.0.cl vs. 26.7.0.cl


## API Changes

### POST /api/rest/2.0/ai/memory/export
-  endpoint added


### POST /api/rest/2.0/ai/memory/import
-  endpoint added


### POST /api/rest/2.0/customization/styles/fonts/delete
- :warning: added the new `ADVANCED_CHART_LABELS` enum value to the `affected_assignments/items/visualization_areas/items/` response property for the response status `200`


### POST /api/rest/2.0/customization/styles/fonts/search
- :warning: added the new `ADVANCED_CHART_LABELS` enum value to the `items/assignments/items/visualization_areas/items/` response property for the response status `200`


### POST /api/rest/2.0/customization/styles/search
-  added the optional property `items/visualization_fonts/advanced_chart_visualization_fonts` to the response with the `200` status


### POST /api/rest/2.0/customization/styles/update
-  added the new optional request property `visualization_fonts/allOf[#/components/schemas/VisualizationFontsInput]/advanced_chart_visualization_fonts`
-  added the new `ADVANCED_CHART_LABELS` enum value to the request property `reset_options/allOf[#/components/schemas/StyleResetOptionsInput]/visualization_areas/items/`


### POST /api/rest/2.0/metadata/headers/update
-  added the new `COLLECTION` enum value to the request property `headers_update/items/type`


### POST /api/rest/2.0/metadata/search
- :warning: added the new `COLLECTION` enum value to the `items/metadata_type` response property for the response status `200`
-  added the new `COLLECTION` enum value to the request property `exclude_objects/items/type`
-  added the new `COLLECTION` enum value to the request property `metadata/items/type`


### POST /api/rest/2.0/metadata/tml/async/import
-  added the new optional request property `enable_personalized_view_upsert`


### POST /api/rest/2.0/metadata/tml/export
-  added the new `COLLECTION` enum value to the request property `metadata/items/type`


### POST /api/rest/2.0/metadata/tml/import
-  added the new optional request property `enable_personalized_view_upsert`


### POST /api/rest/2.0/metadata/update-obj-id
-  added the new `COLLECTION` enum value to the request property `metadata/items/type`


### POST /api/rest/2.0/webhooks/{webhook_identifier}/update
-  added the new optional request property `reset_options`






