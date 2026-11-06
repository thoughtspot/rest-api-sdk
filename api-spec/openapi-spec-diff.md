# API Changelog - 26.12.0.cl vs. 26.11.0.cl


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


### POST /api/rest/2.0/auth/token/full
-  added the new optional request property `org_identifier`
-  request property `org_id` deprecated


### POST /api/rest/2.0/auth/token/object
-  added the new optional request property `org_identifier`
-  request property `org_id` deprecated


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






