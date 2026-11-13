# API Changelog - app_ib_dev vs. 26.12.0.cl


## API Changes

### POST /api/rest/2.0/ai/agent/analysts/create
- :warning: the `updated_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `updated_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `201`


### POST /api/rest/2.0/ai/agent/analysts/search
- :warning: the `analysts/items/last_accessed_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `analysts/items/last_accessed_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `201`
- :warning: the `analysts/items/updated_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `analysts/items/updated_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `201`


### POST /api/rest/2.0/ai/agent/analysts/{analyst_identifier}/update
- :warning: the `updated_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `updated_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `201`


### POST /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send
-  removed `#/components/schemas/AgentMessagesResponse, #/components/schemas/AgentTurnResponse` from the response body `oneOf` list for the response status `200`
-  the response's body `type` was narrowed from `any` to `object` for status `200`


### POST /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send/stream
- :warning: removed the optional property `oneOf[#/components/schemas/AgentStreamFrame]/tool_call/args/dataset_id` from the response with the `200` status
- :warning: removed the optional property `oneOf[#/components/schemas/AgentStreamFrame]/tool_call/args/english_query` from the response with the `200` status
- :warning: removed the optional property `oneOf[#/components/schemas/AgentStreamFrame]/tool_result/answer/gen_no` from the response with the `200` status
- :warning: removed the optional property `oneOf[#/components/schemas/AgentStreamFrame]/tool_result/answer/sage_query` from the response with the `200` status
- :warning: removed the optional property `oneOf[#/components/schemas/AgentStreamFrame]/tool_result/answer/session_id` from the response with the `200` status
- :warning: removed the optional property `oneOf[#/components/schemas/AgentStreamFrame]/tool_result/answer/table_data` from the response with the `200` status
- :warning: removed the optional property `oneOf[#/components/schemas/AgentStreamFrame]/tool_result/answer/title` from the response with the `200` status
- :warning: removed the optional property `oneOf[#/components/schemas/AgentStreamFrame]/tool_result/answer/transaction_id` from the response with the `200` status
- :warning: removed the optional property `oneOf[#/components/schemas/AgentStreamFrame]/tool_result/answer/visualization` from the response with the `200` status
- :warning: removed the optional property `oneOf[#/components/schemas/AgentStreamFrame]/tool_result/answer/worksheet_id` from the response with the `200` status


### GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/answers/{answer_identifier}/details
- :warning: removed the optional property `answer/sub_queries/items/formulas` from the response with the `200` status
- :warning: removed the optional property `answer/sub_queries/items/formulas` from the response with the `201` status
- :warning: removed the optional property `answer/sub_queries/items/tokens` from the response with the `200` status
- :warning: removed the optional property `answer/sub_queries/items/tokens` from the response with the `201` status
-  endpoint deprecated


### GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/get-share-info
-  endpoint deprecated


### GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/get-shared-content
- :warning: the `code_execution_files/items/created_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `code_execution_files/items/created_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `201`
- :warning: the `messages/items/timestamp_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `messages/items/timestamp_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `201`
-  endpoint deprecated
-  removed discriminator from `messages/items/response_items/items/` response property for the response status `200`
-  removed discriminator from `messages/items/response_items/items/` response property for the response status `201`
-  removed discriminator from `messages/items/user_prompt/attachments/items/` response property for the response status `200`
-  removed discriminator from `messages/items/user_prompt/attachments/items/` response property for the response status `201`
-  removed `#/components/schemas/FileResponseItem, #/components/schemas/ResourceResponseItem` from the `messages/items/user_prompt/attachments/items/` response property `oneOf` list for the response status `200`
-  removed `#/components/schemas/FileResponseItem, #/components/schemas/ResourceResponseItem` from the `messages/items/user_prompt/attachments/items/` response property `oneOf` list for the response status `201`
-  removed `#/components/schemas/TextResponseItem, #/components/schemas/ToolCallResponseItem, #/components/schemas/ToolResultResponseItem, #/components/schemas/AnswerResponseItem, #/components/schemas/FileResponseItem, #/components/schemas/ResourceResponseItem, #/components/schemas/SearchDatasetsResponseItem` from the `messages/items/response_items/items/` response property `oneOf` list for the response status `200`
-  removed `#/components/schemas/TextResponseItem, #/components/schemas/ToolCallResponseItem, #/components/schemas/ToolResultResponseItem, #/components/schemas/AnswerResponseItem, #/components/schemas/FileResponseItem, #/components/schemas/ResourceResponseItem, #/components/schemas/SearchDatasetsResponseItem` from the `messages/items/response_items/items/` response property `oneOf` list for the response status `201`
-  the `messages/items/response_items/items/` response's property `type` was narrowed from `any` to `object` for status `200`
-  the `messages/items/response_items/items/` response's property `type` was narrowed from `any` to `object` for status `201`
-  the `messages/items/user_prompt/attachments/items/` response's property `type` was narrowed from `any` to `object` for status `200`
-  the `messages/items/user_prompt/attachments/items/` response's property `type` was narrowed from `any` to `object` for status `201`


### GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/messages
- :warning: the `code_execution_files/items/created_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `code_execution_files/items/created_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `201`
- :warning: the `messages/items/timestamp_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `messages/items/timestamp_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `201`
-  endpoint deprecated
-  removed discriminator from `messages/items/response_items/items/` response property for the response status `200`
-  removed discriminator from `messages/items/response_items/items/` response property for the response status `201`
-  removed discriminator from `messages/items/user_prompt/attachments/items/` response property for the response status `200`
-  removed discriminator from `messages/items/user_prompt/attachments/items/` response property for the response status `201`
-  removed `#/components/schemas/FileResponseItem, #/components/schemas/ResourceResponseItem` from the `messages/items/user_prompt/attachments/items/` response property `oneOf` list for the response status `200`
-  removed `#/components/schemas/FileResponseItem, #/components/schemas/ResourceResponseItem` from the `messages/items/user_prompt/attachments/items/` response property `oneOf` list for the response status `201`
-  removed `#/components/schemas/TextResponseItem, #/components/schemas/ToolCallResponseItem, #/components/schemas/ToolResultResponseItem, #/components/schemas/AnswerResponseItem, #/components/schemas/FileResponseItem, #/components/schemas/ResourceResponseItem, #/components/schemas/SearchDatasetsResponseItem` from the `messages/items/response_items/items/` response property `oneOf` list for the response status `200`
-  removed `#/components/schemas/TextResponseItem, #/components/schemas/ToolCallResponseItem, #/components/schemas/ToolResultResponseItem, #/components/schemas/AnswerResponseItem, #/components/schemas/FileResponseItem, #/components/schemas/ResourceResponseItem, #/components/schemas/SearchDatasetsResponseItem` from the `messages/items/response_items/items/` response property `oneOf` list for the response status `201`
-  the `messages/items/response_items/items/` response's property `type` was narrowed from `any` to `object` for status `200`
-  the `messages/items/response_items/items/` response's property `type` was narrowed from `any` to `object` for status `201`
-  the `messages/items/user_prompt/attachments/items/` response's property `type` was narrowed from `any` to `object` for status `200`
-  the `messages/items/user_prompt/attachments/items/` response's property `type` was narrowed from `any` to `object` for status `201`


### POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update
-  endpoint deprecated


### POST /api/rest/2.0/ai/answer/create
-  endpoint deprecated


### POST /api/rest/2.0/ai/context/export
-  endpoint added


### POST /api/rest/2.0/ai/context/import
-  endpoint added


### POST /api/rest/2.0/ai/conversation/create
-  endpoint deprecated


### POST /api/rest/2.0/ai/conversation/{conversation_identifier}/converse
-  endpoint deprecated


### POST /api/rest/2.0/ai/data-source-suggestions
-  endpoint deprecated


### POST /api/rest/2.0/ai/memory/import
- :warning: added the new `CHAR_BUDGET` enum value to the `validation_failures/items/reason` response property for the response status `200`
- :warning: added the new `CHAR_BUDGET` enum value to the `validation_failures/items/reason` response property for the response status `201`
- :warning: added the new `INVALID_RELATIONSHIP` enum value to the `validation_failures/items/reason` response property for the response status `200`
- :warning: added the new `INVALID_RELATIONSHIP` enum value to the `validation_failures/items/reason` response property for the response status `201`
- :warning: added the new `SCOPE` enum value to the `validation_failures/items/reason` response property for the response status `200`
- :warning: added the new `SCOPE` enum value to the `validation_failures/items/reason` response property for the response status `201`
- :warning: added the new `UNRESOLVED_COLUMN` enum value to the `validation_failures/items/reason` response property for the response status `200`
- :warning: added the new `UNRESOLVED_COLUMN` enum value to the `validation_failures/items/reason` response property for the response status `201`
- :warning: added the new `UNRESOLVED_REFERENCE` enum value to the `validation_failures/items/reason` response property for the response status `200`
- :warning: added the new `UNRESOLVED_REFERENCE` enum value to the `validation_failures/items/reason` response property for the response status `201`
-  added the optional property `validation_failures/items/entity_key` to the response with the `200` status
-  added the optional property `validation_failures/items/entity_key` to the response with the `201` status


### POST /api/rest/2.0/ai/relevant-questions/
-  endpoint deprecated


### POST /api/rest/2.0/ai/usage-data/search
- :warning: the `usage_data/items/limit` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `usage_data/items/limit` response's property `type/format` changed from `integer/int64` to `object` for status `201`
- :warning: the `usage_data/items/updated_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `usage_data/items/updated_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `201`
- :warning: the `usage_data/items/usage` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `usage_data/items/usage` response's property `type/format` changed from `integer/int64` to `object` for status `201`
- :warning: the `usage_data/items/warning_limit` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `usage_data/items/warning_limit` response's property `type/format` changed from `integer/int64` to `object` for status `201`


### POST /api/rest/2.0/ai/usage-data/update
- :warning: the `updates/items/limit` request property `type/format` changed from `integer/int64` to `object`
- :warning: the `updates/items/usage` request property `type/format` changed from `integer/int64` to `object`
- :warning: the `updates/items/warning_limit` request property `type/format` changed from `integer/int64` to `object`
- :warning: the `usage_data/items/limit` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `usage_data/items/limit` response's property `type/format` changed from `integer/int64` to `object` for status `201`
- :warning: the `usage_data/items/updated_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `usage_data/items/updated_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `201`
- :warning: the `usage_data/items/usage` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `usage_data/items/usage` response's property `type/format` changed from `integer/int64` to `object` for status `201`
- :warning: the `usage_data/items/warning_limit` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `usage_data/items/warning_limit` response's property `type/format` changed from `integer/int64` to `object` for status `201`


### GET /api/rest/2.0/ai/usage-data/user
- :warning: the `summary/pools/items/limit` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `summary/pools/items/limit` response's property `type/format` changed from `integer/int64` to `object` for status `201`
- :warning: the `summary/pools/items/updated_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `summary/pools/items/updated_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `201`
- :warning: the `summary/pools/items/usage` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `summary/pools/items/usage` response's property `type/format` changed from `integer/int64` to `object` for status `201`
- :warning: the `summary/pools/items/warning_limit` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `summary/pools/items/warning_limit` response's property `type/format` changed from `integer/int64` to `object` for status `201`
- :warning: the `summary/total_limit` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `summary/total_limit` response's property `type/format` changed from `integer/int64` to `object` for status `201`
- :warning: the `summary/total_remaining` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `summary/total_remaining` response's property `type/format` changed from `integer/int64` to `object` for status `201`
- :warning: the `summary/total_usage` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `summary/total_usage` response's property `type/format` changed from `integer/int64` to `object` for status `201`
- :warning: the `summary/total_warning_limit` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `summary/total_warning_limit` response's property `type/format` changed from `integer/int64` to `object` for status `201`


### GET /api/rest/2.0/auth/session/user
- :warning: the `incomplete_details` response's property `type` changed from `array<string>` to `object` for status `200`
- :warning: removed the optional property `extended_properties/displayNameLastUpdatedBy` from the response with the `200` status
-  added the optional property `last_active_time_in_millis` to the response with the `200` status


### POST /api/rest/2.0/configurations/features/search
- :warning: removed the optional property `items/features/items/element_config/label` from the response with the `200` status
-  added the optional property `items/docs_new_window` to the response with the `200` status
-  added the optional property `items/features/items/docs_new_window` to the response with the `200` status


### POST /api/rest/2.0/connection-configurations/create
- :warning: removed the optional property `configuration/password` from the response with the `200` status
- :warning: removed the optional property `configuration/role` from the response with the `200` status
- :warning: removed the optional property `configuration/user` from the response with the `200` status
- :warning: removed the optional property `configuration/warehouse` from the response with the `200` status


### POST /api/rest/2.0/connection-configurations/search
- :warning: removed the optional property `items/configuration/password` from the response with the `200` status
- :warning: removed the optional property `items/configuration/role` from the response with the `200` status
- :warning: removed the optional property `items/configuration/user` from the response with the `200` status
- :warning: removed the optional property `items/configuration/warehouse` from the response with the `200` status


### POST /api/rest/2.0/connection/create
- :warning: removed the optional property `details/author` from the response with the `200` status
- :warning: removed the optional property `details/complete` from the response with the `200` status
- :warning: removed the optional property `details/configuration` from the response with the `200` status
- :warning: removed the optional property `details/connectionType` from the response with the `200` status
- :warning: removed the optional property `details/created` from the response with the `200` status
- :warning: removed the optional property `details/description` from the response with the `200` status
- :warning: removed the optional property `details/generationNum` from the response with the `200` status
- :warning: removed the optional property `details/id` from the response with the `200` status
- :warning: removed the optional property `details/indexVersion` from the response with the `200` status
- :warning: removed the optional property `details/isDeleted` from the response with the `200` status
- :warning: removed the optional property `details/isDeprecated` from the response with the `200` status
- :warning: removed the optional property `details/isExternal` from the response with the `200` status
- :warning: removed the optional property `details/isHidden` from the response with the `200` status
- :warning: removed the optional property `details/modified` from the response with the `200` status
- :warning: removed the optional property `details/modifiedBy` from the response with the `200` status
- :warning: removed the optional property `details/name` from the response with the `200` status
- :warning: removed the optional property `details/owner` from the response with the `200` status
- :warning: removed the optional property `details/scheduled` from the response with the `200` status
- :warning: removed the optional property `details/tables` from the response with the `200` status
- :warning: removed the optional property `details/tags` from the response with the `200` status
- :warning: removed the optional property `details/type` from the response with the `200` status


### POST /api/rest/2.0/connection/search
- :warning: removed the optional property `items/data_warehouse_objects/databases/items/schemas/items/tables/items/relationships/items/destDatabase` from the response with the `200` status
- :warning: removed the optional property `items/data_warehouse_objects/databases/items/schemas/items/tables/items/relationships/items/destSchema` from the response with the `200` status
- :warning: removed the optional property `items/data_warehouse_objects/databases/items/schemas/items/tables/items/relationships/items/destTable` from the response with the `200` status
- :warning: removed the optional property `items/data_warehouse_objects/databases/items/schemas/items/tables/items/relationships/items/name` from the response with the `200` status
- :warning: removed the optional property `items/data_warehouse_objects/databases/items/schemas/items/tables/items/relationships/items/relationshipKeys` from the response with the `200` status
- :warning: removed the optional property `items/details/author` from the response with the `200` status
- :warning: removed the optional property `items/details/complete` from the response with the `200` status
- :warning: removed the optional property `items/details/configuration` from the response with the `200` status
- :warning: removed the optional property `items/details/connectionType` from the response with the `200` status
- :warning: removed the optional property `items/details/created` from the response with the `200` status
- :warning: removed the optional property `items/details/description` from the response with the `200` status
- :warning: removed the optional property `items/details/generationNum` from the response with the `200` status
- :warning: removed the optional property `items/details/id` from the response with the `200` status
- :warning: removed the optional property `items/details/indexVersion` from the response with the `200` status
- :warning: removed the optional property `items/details/isDeleted` from the response with the `200` status
- :warning: removed the optional property `items/details/isDeprecated` from the response with the `200` status
- :warning: removed the optional property `items/details/isExternal` from the response with the `200` status
- :warning: removed the optional property `items/details/isHidden` from the response with the `200` status
- :warning: removed the optional property `items/details/modified` from the response with the `200` status
- :warning: removed the optional property `items/details/modifiedBy` from the response with the `200` status
- :warning: removed the optional property `items/details/name` from the response with the `200` status
- :warning: removed the optional property `items/details/owner` from the response with the `200` status
- :warning: removed the optional property `items/details/scheduled` from the response with the `200` status
- :warning: removed the optional property `items/details/tables` from the response with the `200` status
- :warning: removed the optional property `items/details/tags` from the response with the `200` status
- :warning: removed the optional property `items/details/type` from the response with the `200` status


### POST /api/rest/2.0/customization/email
- :warning: removed the optional property `template_properties/company_privacy_policy_url` from the response with the `200` status
- :warning: removed the optional property `template_properties/company_website_url` from the response with the `200` status
- :warning: removed the optional property `template_properties/contact_support_url` from the response with the `200` status
- :warning: removed the optional property `template_properties/cta_button_bg_color` from the response with the `200` status
- :warning: removed the optional property `template_properties/cta_text_font_color` from the response with the `200` status
- :warning: removed the optional property `template_properties/font_family` from the response with the `200` status
- :warning: removed the optional property `template_properties/footer_address` from the response with the `200` status
- :warning: removed the optional property `template_properties/footer_phone` from the response with the `200` status
- :warning: removed the optional property `template_properties/hide_contact_support_url` from the response with the `200` status
- :warning: removed the optional property `template_properties/hide_error_message` from the response with the `200` status
- :warning: removed the optional property `template_properties/hide_footer_address` from the response with the `200` status
- :warning: removed the optional property `template_properties/hide_footer_phone` from the response with the `200` status
- :warning: removed the optional property `template_properties/hide_logo_url` from the response with the `200` status
- :warning: removed the optional property `template_properties/hide_manage_notification` from the response with the `200` status
- :warning: removed the optional property `template_properties/hide_mobile_app_nudge` from the response with the `200` status
- :warning: removed the optional property `template_properties/hide_modify_alert` from the response with the `200` status
- :warning: removed the optional property `template_properties/hide_notification_status` from the response with the `200` status
- :warning: removed the optional property `template_properties/hide_privacy_policy` from the response with the `200` status
- :warning: removed the optional property `template_properties/hide_product_name` from the response with the `200` status
- :warning: removed the optional property `template_properties/hide_ts_vocabulary_definitions` from the response with the `200` status
- :warning: removed the optional property `template_properties/hide_unsubscribe_link` from the response with the `200` status
- :warning: removed the optional property `template_properties/home_url` from the response with the `200` status
- :warning: removed the optional property `template_properties/logo_url` from the response with the `200` status
- :warning: removed the optional property `template_properties/primary_bg_color` from the response with the `200` status
- :warning: removed the optional property `template_properties/product_name` from the response with the `200` status
- :warning: removed the optional property `template_properties/replacement_value_for_answer` from the response with the `200` status
- :warning: removed the optional property `template_properties/replacement_value_for_liveboard` from the response with the `200` status
- :warning: removed the optional property `template_properties/replacement_value_for_spot_iq` from the response with the `200` status


### POST /api/rest/2.0/customization/email/search
- :warning: removed the optional property `items/template_properties/company_privacy_policy_url` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/company_website_url` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/contact_support_url` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/cta_button_bg_color` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/cta_text_font_color` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/font_family` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/footer_address` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/footer_phone` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/hide_contact_support_url` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/hide_error_message` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/hide_footer_address` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/hide_footer_phone` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/hide_logo_url` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/hide_manage_notification` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/hide_mobile_app_nudge` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/hide_modify_alert` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/hide_notification_status` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/hide_privacy_policy` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/hide_product_name` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/hide_ts_vocabulary_definitions` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/hide_unsubscribe_link` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/home_url` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/logo_url` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/primary_bg_color` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/product_name` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/replacement_value_for_answer` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/replacement_value_for_liveboard` from the response with the `200` status
- :warning: removed the optional property `items/template_properties/replacement_value_for_spot_iq` from the response with the `200` status


### POST /api/rest/2.0/dbt/dbt-connection
- :warning: removed the optional property `data` from the response with the `200` status


### POST /api/rest/2.0/dbt/generate-sync-tml
- :warning: removed the optional property `failed_table_tmls` from the response with the `200` status
- :warning: removed the optional property `semantic_report` from the response with the `200` status
- :warning: removed the optional property `table_tmls` from the response with the `200` status
- :warning: removed the optional property `worksheet_tmls` from the response with the `200` status


### POST /api/rest/2.0/dbt/generate-tml
- :warning: removed the optional property `failed_table_tmls` from the response with the `200` status
- :warning: removed the optional property `semantic_report` from the response with the `200` status
- :warning: removed the optional property `table_tmls` from the response with the `200` status
- :warning: removed the optional property `worksheet_tmls` from the response with the `200` status


### POST /api/rest/2.0/groups/create
- :warning: removed the optional property `content/schemaVersion` from the response with the `200` status


### POST /api/rest/2.0/groups/search
- :warning: removed the optional property `items/content/schemaVersion` from the response with the `200` status


### POST /api/rest/2.0/localizations/manual-translation/export
-  removed the non-success response with the status `404`


### POST /api/rest/2.0/localizations/manual-translation/locales/{locale}/export
- :warning: removed the optional property `translations` from the response with the `200` status


### POST /api/rest/2.0/localizations/manual-translation/template/export
-  endpoint added


### POST /api/rest/2.0/metadata/answer/data
-  response property `contents/items/data_rows/items/` list-of-types was narrowed by removing types `array` from media type `application/json` of response `200`


### POST /api/rest/2.0/metadata/delete
-  added the new optional request property `delete_mode`
-  added the new optional request property `delete_reason`


### POST /api/rest/2.0/metadata/liveboard/data
-  response property `contents/items/data_rows/items/` list-of-types was narrowed by removing types `array` from media type `application/json` of response `200`


### POST /api/rest/2.0/metadata/search
- :warning: removed the optional property `items/incomplete_objects/items/code` from the response with the `200` status
- :warning: removed the optional property `items/incomplete_objects/items/codeNumber` from the response with the `200` status
- :warning: removed the optional property `items/incomplete_objects/items/header` from the response with the `200` status
- :warning: removed the optional property `items/incomplete_objects/items/message` from the response with the `200` status
- :warning: removed the optional property `items/incomplete_objects/items/type` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/assignedEntities` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/assignedGroups` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/assignedPinboards` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/assignedRoles` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/authenticationType` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/columns` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/complete` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/content` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/customActionTags` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/customOrder` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/dataPanelColumnGroups` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/dataRecency` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/dataSourceContent` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/dataSourceId` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/dataSourceTypeEnum` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/dataType` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/defaultAggrType` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/defaultDateBucket` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/derivationExpr` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/destinationRelationships` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/destinationTable` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/disabled` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/displayName` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/entityCategory` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/folderContent` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/generationType` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/granularPrivileges` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/groupIdx` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/header` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/incompleteDetail` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/indexPriority` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/indexType` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/indicateOneToManyOnUI` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/inheritedFolders` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/inheritedGroups` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/injectedInlineValues` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/isAdditive` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/isAttributionDimension` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/isCached` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/isCyclic` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/isDerived` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/isOneToOneJoin` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/isParameterized` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/isPrimaryKey` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/isStrictDateColumn` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/isSuperUser` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/isSystemPrincipal` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/isTimeBucketRestricted` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/joinType` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/logicalTableContent` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/logicalTableList` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/metadataVersion` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/ownerName` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/ownerType` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/parameters` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/parenttype` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/personalised_views` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/physicalTableGUID` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/physicalTableVersion` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/position` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/precision` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/privileges` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/publishAcrossOrgs` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/relationships` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/relationshipsWithin` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/reportContent` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/scale` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/sourceColumns` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/sourceTable` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/sources` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/spotiqPreference` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/state` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/synonymType` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/synonyms` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/tableFilters` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/targetColumns` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/tenantId` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/type` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/userContent` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/userGroupContent` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/valueCasing` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/visibility` from the response with the `200` status
- :warning: removed the optional property `items/metadata_detail/worksheetLevelJoins` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/aiAnswerGenerationDisabled` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/author` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/authorDisplayName` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/authorName` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/belongToAllOrgs` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/cachedDataAsOf` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/chartType` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/clientState` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/configs` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/connectionDisabled` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/contentUpgradeId` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/created` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/csrProtected` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/dataSourceName` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/dataSourceType` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/dataUploadEnabled` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/databaseStripe` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/datasetId` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/description` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/descriptionAutoGenerated` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/displayName` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/generationNum` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/hasLenientDiscoverability` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/hasMandatoryFilter` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/hasTabs` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/headerUpgradeId` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/id` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/indexVersion` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/isAutoCreated` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/isAutoDelete` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/isConnectionConfigurationDisabled` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/isDeleted` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/isDeprecated` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/isExternal` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/isHidden` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/isMandatoryFilterValueSelected` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/isMaterialized` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/isParameterized` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/isPublished` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/isSharedViaConnection` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/isTimeSeriesKPI` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/isVerified` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/isVersioningEnabled` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/modelVersion` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/modified` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/modifiedBy` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/name` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/numDefaultPinboards` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/numInheritedAssignedRoles` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/numMemberUsers` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/objId` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/orgIds` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/owner` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/ownerOrgId` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/parameterizedConnection` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/referencedVizType` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/relationWithUser` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/reportId` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/resolvedObjects` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/rowCount` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/schemaStripe` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/statistics` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/subType` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/syncWithSource` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/tags` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/totalContainerCount` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/type` from the response with the `200` status
- :warning: removed the optional property `items/metadata_header/viewId` from the response with the `200` status
- :warning: removed the optional property `items/stats/favorites` from the response with the `200` status
- :warning: removed the optional property `items/stats/last_accessed` from the response with the `200` status
- :warning: removed the optional property `items/stats/views` from the response with the `200` status
- :warning: removed the optional property `items/visualization_headers/items/author` from the response with the `200` status
- :warning: removed the optional property `items/visualization_headers/items/created` from the response with the `200` status
- :warning: removed the optional property `items/visualization_headers/items/id` from the response with the `200` status
- :warning: removed the optional property `items/visualization_headers/items/modified` from the response with the `200` status
- :warning: removed the optional property `items/visualization_headers/items/modifiedBy` from the response with the `200` status
- :warning: removed the optional property `items/visualization_headers/items/name` from the response with the `200` status
- :warning: removed the optional property `items/visualization_headers/items/owner` from the response with the `200` status
- :warning: removed the optional property `items/visualization_headers/items/size` from the response with the `200` status
- :warning: removed the optional property `items/visualization_headers/items/title` from the response with the `200` status
- :warning: removed the optional property `items/visualization_headers/items/vizType` from the response with the `200` status
-  removed `subschema #1: Dependent Objects Variant 1, subschema #2` from the `items/dependent_objects` response property `oneOf` list for the response status `200`
-  the `items/dependent_objects` response's property `type` was narrowed from `any` to `object` for status `200`


### POST /api/rest/2.0/metadata/tml/async/import
- :warning: removed the optional property `import_response/object` from the response with the `200` status
- :warning: removed the optional property `import_response/status` from the response with the `200` status


### POST /api/rest/2.0/metadata/tml/async/status
- :warning: removed the optional property `status_list/items/import_response/object` from the response with the `200` status
- :warning: removed the optional property `status_list/items/import_response/status` from the response with the `200` status


### POST /api/rest/2.0/metadata/tml/export
- :warning: removed the optional property `items/edoc` from the response with the `200` status
- :warning: removed the optional property `items/info` from the response with the `200` status


### POST /api/rest/2.0/metadata/tml/export/batch
- :warning: removed the optional property `batch_offset` from the response with the `200` status
- :warning: removed the optional property `batch_size` from the response with the `200` status
- :warning: removed the optional property `isLastBatch` from the response with the `200` status
- :warning: removed the optional property `result` from the response with the `200` status


### POST /api/rest/2.0/metadata/tml/import
- :warning: removed the optional property `items/guid` from the response with the `200` status
- :warning: removed the optional property `items/name` from the response with the `200` status
- :warning: removed the optional property `items/request_index` from the response with the `200` status
- :warning: removed the optional property `items/response` from the response with the `200` status


### GET /api/rest/2.0/metadata/{guid}/search-readiness
-  endpoint added


### POST /api/rest/2.0/metadata/{logical_table_identifier}/build-index
-  endpoint added


### POST /api/rest/2.0/orgs/search
-  added the new optional request property `record_offset`
-  added the new optional request property `record_size`


### POST /api/rest/2.0/roles/create
- :warning: the `creation_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `modification_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`


### POST /api/rest/2.0/roles/search
- :warning: the `items/creation_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `items/modification_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`
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


### POST /api/rest/2.0/roles/{role_identifier}/update
- :warning: the `creation_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`
- :warning: the `modification_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`


### POST /api/rest/2.0/schedules/create
- :warning: the `creation_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`


### POST /api/rest/2.0/schedules/search
- :warning: the `items/creation_time_in_millis` response's property `type/format` changed from `integer/int64` to `object` for status `200`


### POST /api/rest/2.0/searchdata
-  response property `contents/items/data_rows/items/` list-of-types was narrowed by removing types `array` from media type `application/json` of response `200`


### POST /api/rest/2.0/security/metadata/assign
-  added the new `COLLECTION` enum value to the request property `metadata/items/type`


### POST /api/rest/2.0/security/metadata/fetch-object-privileges
- :warning: the `metadata_object_privileges` response's property `type` changed from `array<object>` to `object` for status `200`


### POST /api/rest/2.0/security/metadata/fetch-permissions
- :warning: the `metadata_permission_details` response's property `type` changed from `array<object>` to `object` for status `200`
-  added the new `PERSONALISED_VIEW` enum value to the request property `metadata/items/type`


### POST /api/rest/2.0/security/metadata/share
-  added the new `PERSONALISED_VIEW` enum value to the request property `metadata/items/type`
-  added the new `PERSONALISED_VIEW` enum value to the request property `metadata_type`


### POST /api/rest/2.0/security/principals/fetch-permissions
- :warning: the `principal_permission_details` response's property `type` changed from `array<object>` to `object` for status `200`
-  added the new `PERSONALISED_VIEW` enum value to the request property `default_metadata_type`
-  added the new `PERSONALISED_VIEW` enum value to the request property `metadata/items/type`


### POST /api/rest/2.0/template/variables/create
-  added the non-success response with the status `409`


### POST /api/rest/2.0/template/variables/{identifier}/update
-  added the non-success response with the status `409`


### POST /api/rest/2.0/users/activate
- :warning: the `incomplete_details` response's property `type` changed from `array<string>` to `object` for status `200`
- :warning: removed the optional property `extended_properties/displayNameLastUpdatedBy` from the response with the `200` status
-  added the optional property `last_active_time_in_millis` to the response with the `200` status


### POST /api/rest/2.0/users/create
- :warning: the `incomplete_details` response's property `type` changed from `array<string>` to `object` for status `200`
- :warning: removed the optional property `extended_properties/displayNameLastUpdatedBy` from the response with the `200` status
-  added the optional property `last_active_time_in_millis` to the response with the `200` status


### POST /api/rest/2.0/users/search
- :warning: the `items/incomplete_details` response's property `type` changed from `array<string>` to `object` for status `200`
- :warning: removed the optional property `items/extended_properties/displayNameLastUpdatedBy` from the response with the `200` status
-  added the optional property `items/last_active_time_in_millis` to the response with the `200` status


### GET /api/rest/2.0/webhooks/storage-config
- :warning: removed the optional property `items/config/trust_policy_template/Statement` from the response with the `200` status
- :warning: removed the optional property `items/config/trust_policy_template/Version` from the response with the `200` status




## Components
-  removed the schema `DbtConnectionResponse`
-  removed the schema `DbtGenerateSyncTmlResponse`
-  removed the schema `DbtGenerateTmlResponse`
-  removed the schema `ExportMetadataTMLBatchedResponse`
-  removed the schema `ExportMetadataTMLResponse`
-  removed the schema `GetManualTranslationBundleResponse`
-  removed the schema `ImportMetadataTMLResponse`




