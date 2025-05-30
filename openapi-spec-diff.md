#### What's New
---

##### `POST` /api/rest/2.0/metadata/worksheets/convert


##### `POST` /api/rest/2.0/metadata/headers/update


#### What's Changed
---

##### `POST` /api/rest/2.0/report/liveboard


###### Request:

Changed content type : `application/json`

* Added property `regional_settings` (object)
    > Options for specific region speciic overrides to support date/number/string/currency formatting.


    * Property `currency_format` (string)
        > ISO code to be appended with currency values.


        Enum values:

        * `ADP`
        * `AED`
        * `AFN`
        * `ALL`
        * `AMD`
        * `ANG`
        * `AOA`
        * `ARA`
        * `ARS`
        * `ATS`
        * `AUD`
        * `AWG`
        * `AZN`
        * `BAM`
        * `BBD`
        * `BDT`
        * `BEF`
        * `BGL`
        * `BGM`
        * `BGN`
        * `BHD`
        * `BIF`
        * `BMD`
        * `BND`
        * `BOB`
        * `BOP`
        * `BOV`
        * `BRL`
        * `BSD`
        * `BTN`
        * `BUK`
        * `BWP`
        * `BYN`
        * `BZD`
        * `CAD`
        * `CDF`
        * `CHE`
        * `CHF`
        * `CHW`
        * `CLE`
        * `CLP`
        * `CNX`
        * `CNY`
        * `COP`
        * `COU`
        * `CRC`
        * `CSK`
        * `CUC`
        * `CUP`
        * `CVE`
        * `CYP`
        * `CZK`
        * `DDM`
        * `DEM`
        * `DJF`
        * `DKK`
        * `DOP`
        * `DZD`
        * `ECS`
        * `ECV`
        * `EEK`
        * `EGP`
        * `ERN`
        * `ESP`
        * `ETB`
        * `EUR`
        * `FIM`
        * `FJD`
        * `FKP`
        * `FRF`
        * `GBP`
        * `GEK`
        * `GEL`
        * `GHS`
        * `GIP`
        * `GMD`
        * `GNF`
        * `GNS`
        * `GQE`
        * `GRD`
        * `GTQ`
        * `GWE`
        * `GWP`
        * `GYD`
        * `HKD`
        * `HNL`
        * `HRD`
        * `HRK`
        * `HTG`
        * `HUF`
        * `IDR`
        * `IEP`
        * `ILP`
        * `ILS`
        * `INR`
        * `IQD`
        * `IRR`
        * `ISK`
        * `ITL`
        * `JMD`
        * `JOD`
        * `JPY`
        * `KES`
        * `KGS`
        * `KHR`
        * `KMF`
        * `KPW`
        * `KRW`
        * `KWD`
        * `KYD`
        * `KZT`
        * `LAK`
        * `LBP`
        * `LKR`
        * `LRD`
        * `LSL`
        * `LTL`
        * `LTT`
        * `LUC`
        * `LUF`
        * `LUL`
        * `LVL`
        * `LVR`
        * `LYD`
        * `MAD`
        * `MAF`
        * `MCF`
        * `MDC`
        * `MDL`
        * `MGA`
        * `MGF`
        * `MKD`
        * `MLF`
        * `MMK`
        * `MNT`
        * `MOP`
        * `MRU`
        * `MTL`
        * `MTP`
        * `MUR`
        * `MVR`
        * `MWK`
        * `MXN`
        * `MXV`
        * `MYR`
        * `MZE`
        * `MZN`
        * `NAD`
        * `NGN`
        * `NIO`
        * `NLG`
        * `NOK`
        * `NPR`
        * `NZD`
        * `OMR`
        * `PAB`
        * `PEI`
        * `PEN`
        * `PGK`
        * `PHP`
        * `PKR`
        * `PLN`
        * `PTE`
        * `PYG`
        * `QAR`
        * `RHD`
        * `RON`
        * `RSD`
        * `RUB`
        * `RWF`
        * `SAR`
        * `SBD`
        * `SCR`
        * `SDG`
        * `SEK`
        * `SGD`
        * `SHP`
        * `SIT`
        * `SKK`
        * `SLL`
        * `SOS`
        * `SRD`
        * `SRG`
        * `SSP`
        * `STN`
        * `SUR`
        * `SVC`
        * `SYP`
        * `SZL`
        * `THB`
        * `TJR`
        * `TJS`
        * `TMT`
        * `TND`
        * `TOP`
        * `TPE`
        * `TRY`
        * `TTD`
        * `TWD`
        * `TZS`
        * `UAH`
        * `UAK`
        * `UGX`
        * `USD`
        * `UYU`
        * `UYW`
        * `UZS`
        * `VES`
        * `VND`
        * `VUV`
        * `WST`
        * `XAF`
        * `XAG`
        * `XAU`
        * `XBA`
        * `XBB`
        * `XCD`
        * `XDR`
        * `XEU`
        * `XFO`
        * `XFU`
        * `XOF`
        * `XPD`
        * `XPF`
        * `XPT`
        * `XRE`
        * `XSU`
        * `XTS`
        * `XUA`
        * `XXX`
        * `YDD`
        * `YER`
        * `ZAR`
        * `ZMW`
    * Property `user_locale` (string)
        > Indicates the locale to be used for all formattings.


        Enum values:

        * `en-CA`
        * `en-GB`
        * `en-US`
        * `de-DE`
        * `ja-JP`
        * `zh-CN`
        * `pt-BR`
        * `fr-FR`
        * `fr-CA`
        * `es-US`
        * `da-DK`
        * `es-ES`
        * `fi-FI`
        * `sv-SE`
        * `nb-NO`
        * `pt-PT`
        * `nl-NL`
        * `it-IT`
        * `ru-RU`
        * `en-IN`
    * Property `number_format_locale` (string)
        > Indicates the locale to be used for number formatting.


        Enum values:

        * `en-CA`
        * `en-GB`
        * `en-US`
        * `de-DE`
        * `ja-JP`
        * `zh-CN`
        * `pt-BR`
        * `fr-FR`
        * `fr-CA`
        * `es-US`
        * `da-DK`
        * `es-ES`
        * `fi-FI`
        * `sv-SE`
        * `nb-NO`
        * `pt-PT`
        * `nl-NL`
        * `it-IT`
        * `ru-RU`
        * `en-IN`
    * Property `date_format_locale` (string)
        > Indicates the locale to be used for date formatting.


        Enum values:

        * `en-CA`
        * `en-GB`
        * `en-US`
        * `de-DE`
        * `ja-JP`
        * `zh-CN`
        * `pt-BR`
        * `fr-FR`
        * `fr-CA`
        * `es-US`
        * `da-DK`
        * `es-ES`
        * `fi-FI`
        * `sv-SE`
        * `nb-NO`
        * `pt-PT`
        * `nl-NL`
        * `it-IT`
        * `ru-RU`
        * `en-IN`
* Changed property `file_format` (string)
    > Export file format.


    Removed enum values:

    * `CSV`
    * `XLSX`
* Changed property `png_options` (object)
    > Options for PNG export.


    * Added property `personalised_view_id` (string)
        > Indicates personalised view of the Liveboard in case of png


##### `POST` /api/rest/2.0/report/answer


###### Request:

Changed content type : `application/json`

* Added property `regional_settings` (object)
    > Options for specific region speciic overrides to support date/number/string/currency formatting.


##### `POST` /api/rest/2.0/metadata/tml/import


###### Request:

Changed content type : `application/json`

* Added property `skip_diff_check` (boolean)
    > <div><span class="since-beta-tag">Version: 10.6.0.cl or later</span></div>
    > 
    > Boolean Flag to skip TML diff check before processing object TMLs.


* Deleted property `skip_cdw_validation_for_tables` (boolean)
    > Boolean to indicate if the CDW validation for table imports should be skipped.


* Changed property `enable_large_metadata_validation` (boolean)
    > <div><span class="since-beta-tag">Version: 10.5.0.cl or later</span></div>
    > 
    > Boolean to indicate if the large metadata validation should be enabled. Set to `true` if the database contains multiple thousands of tables.


##### `POST` /api/rest/2.0/metadata/tml/async/import


###### Request:

Changed content type : `application/json`

* Added property `skip_diff_check` (boolean)
    > <div><span class="since-beta-tag">Version: 10.6.0.cl or later</span></div>
    > 
    > Boolean Flag to skip TML diff check before processing object TMLs.


* Deleted property `skip_cdw_validation_for_tables` (boolean)
    > Boolean to indicate if the CDW validation for table imports should be skipped.


* Changed property `enable_large_metadata_validation` (boolean)
    > <div><span class="since-beta-tag">Version: 10.5.0.cl or later</span></div>
    > 
    > Boolean to indicate if the large metadata validation should be enabled. Set to `true` if the database contains multiple thousands of tables.


##### `POST` /api/rest/2.0/metadata/tml/export


###### Request:

Changed content type : `application/json`

* Changed property `export_options` (object)
    > Flags to specify additional options for export. This will only be active when UserDefinedId in TML is enabled.


    * Added property `include_obj_id_ref` (boolean)
        > Boolean Flag to whether to export user_defined_id of referenced object. This will only be respected when UserDefinedId in TML is enabled.


    * Added property `include_obj_id` (boolean)
        > Boolean flag to whether to export user_defined_id of the object. This will only be respected when UserDefinedId in TML is enabled.


    * Deleted property `export_with_reference_object_id` (boolean)
        > Boolean Flag to whether to export user_defined_id of referenced object. This will only be respected when UserDefinedId in TML is enabled.


    * Deleted property `include_object_id` (boolean)
        > Boolean flag to whether to export user_defined_id of the object. This will only be respected when UserDefinedId in TML is enabled.


##### `POST` /api/rest/2.0/security/metadata/assign


###### Request:

Changed content type : `application/json`

* Changed property `metadata` (array)
    > GUID or name of the metadata object.


    Changed items (object):
        > MetadataType InputType used in Author API's


    * Changed property `type` (string)
        > Type of metadata.
        >   
        > 
        > Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.


        Added enum value:

        * `CONNECTION`
##### `POST` /api/rest/2.0/connection/create


###### Request:

Changed content type : `application/json`

* Changed property `data_warehouse_type` (string)
    > Type of the data warehouse.


    Added enum value:

    * `CLICKHOUSE`
###### Return Type:

Changed response : **200 OK**
> Connection to the datasource successfully created.


* Changed content type : `application/json`

    * Changed property `data_warehouse_type` (string)
        > Type of data warehouse.


        Added enum value:

        * `CLICKHOUSE`
##### `POST` /api/rest/2.0/roles/{role_identifier}/delete


###### Parameters:

Changed: `role_identifier` in `path`
> Unique ID or name of the Role. ReadOnly roles cannot be deleted.


##### `POST` /api/rest/2.0/ai/conversation/create


###### Request:

Changed content type : `application/json`

* Changed property `metadata_identifier` (string)
    > ID of the metadata object, such as a Worksheet or Model, to use as a data source for the conversation.


* Changed property `tokens` (string)
    > Token string to set the context for the conversation. For example,`[sales],[item type],[state]`.


##### `POST` /api/rest/2.0/ai/conversation/{conversation_identifier}/converse


###### Request:

Changed content type : `application/json`

* Changed property `metadata_identifier` (string)
    > ID of the metadata object, such as a Worksheet or Model, to use as a data source for the conversation.


* Changed property `message` (string)
    > A message string with the follow-up question to continue the conversation.


###### Return Type:

Changed response : **200 OK**
> Common successful response


* Changed content type : `application/json`

    Changed items (object):

    * Added property `display_tokens` (string)
        > User friendly tokens for the response.


Changed response : **201 Created**
> Common error response


* Changed content type : `application/json`

    Changed items (object):

    * Added property `display_tokens` (string)
        > User friendly tokens for the response.


##### `POST` /api/rest/2.0/ai/answer/create


###### Request:

Changed content type : `application/json`

* Changed property `query` (string)
    > A natural language query string to generate the Answer.


* Changed property `metadata_identifier` (string)
    > ID of the metadata object, such as a Worksheet or Model, to use as a data source for the query.


###### Return Type:

Changed response : **200 OK**
> Common successful response


* Changed content type : `application/json`

    * Added property `display_tokens` (string)
        > User friendly tokens for the response.


Changed response : **201 Created**
> Common error response


* Changed content type : `application/json`

    * Added property `display_tokens` (string)
        > User friendly tokens for the response.


##### `POST` /api/rest/2.0/metadata/search


###### Request:

Changed content type : `application/json`

* Changed property `metadata` (array)
    > Metadata objects such as Liveboards, Answers, and Worksheets.


    Changed items (object):

    * Added property `obj_identifier` (string)
        > CustomObjectId of the metadata.


    * Deleted property `custom_identifier` (string)
        > CustomObjectId of the metadata.


##### `POST` /api/rest/2.0/roles/search


##### `POST` /api/rest/2.0/auth/token/object


###### Request:

Changed content type : `application/json`

* Changed property `user_parameters` (object)
    > Define attributes such as Runtime filters and Runtime parameters to send security entitlements to a user session. For more information, see [Documentation](https://developers.thoughtspot.com/docs/abac-user-parameters).


    * Changed property `objects` (array)

        Changed items (object):
            > Objects to apply the User_Object.


        * Changed property `type` (string)
            > Type of object.
            >   
            > 
            > Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.


            Removed enum values:

            * `LIVEBOARD`
            * `ANSWER`
##### `POST` /api/rest/2.0/auth/token/full


###### Request:

Changed content type : `application/json`

* Changed property `user_parameters` (object)
    > Define attributes such as Runtime filters and Runtime parameters to send security entitlements to a user session. For more information, see [Documentation](https://developers.thoughtspot.com/docs/abac-user-parameters).


    * Changed property `objects` (array)

        Changed items (object):
            > Objects to apply the User_Object.


        * Changed property `type` (string)
            > Type of object.
            >   
            > 
            > Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.


            Removed enum values:

            * `LIVEBOARD`
            * `ANSWER`
##### `POST` /api/rest/2.0/auth/token/custom


###### Request:

Changed content type : `application/json`

* Changed property `filter_rules` (array)
    > Filter rules.


    Changed items (object):
        > Filter Rules to be applied on Objects.


    * Changed property `values` (array)
        > The values to filter on. To get all records, use TS_WILDCARD_ALL as values.


        Changed items (string -> number):

* Changed property `parameter_values` (array)
    > Parameter values.


    Changed items (object):
        > Filter Rules to be applied on Objects.


    * Changed property `values` (array)
        > The values to filter on. Only single value is supported currently.


        Changed items (string -> number):

* Changed property `objects` (array)
    > Objects on which the filter rules and parameters values should be applied to


    Changed items (object):
        > Objects on which the filter rules and parameters values should be applied to


    * Changed property `type` (string)
        > Type of object.
        >   
        > 
        > Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.


        Removed enum values:

        * `LIVEBOARD`
        * `ANSWER`
##### `POST` /api/rest/2.0/users/activate


###### Request:

Changed content type : `application/json`

* Added property `properties` (string)
    > Properties of the user.


##### `POST` /api/rest/2.0/security/metadata/share


###### Request:

Changed content type : `application/json`

* Changed property `metadata_type` (string)
    > Type of metadata. Required if identifier in metadata_identifies is a name.
    > 1. Liveboard
    > 2. Answers
    > 3. LOGICAL_TABLE for any data object such as table, worksheet or view.
    > 4. LOGICAL_COLUMN


    Added enum value:

    * `CONNECTION`
* Changed property `metadata` (array)
    > Metadata details for sharing objects.


    Changed items (object):

    * Changed property `type` (string)
        > Type of metadata.
        >   
        > 
        > Type of metadata. Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.


        Added enum value:

        * `CONNECTION`
##### `POST` /api/rest/2.0/roles/create


###### Request:

Changed content type : `application/json`

* Added property `read_only` (boolean)
    > <div><span class="since-beta-tag">Version: 10.5.0.cl or later</span></div>
    > 
    > Indicates whether the role is read only. A readonly role can neither be updated nor deleted.


* Changed property `privileges` (array)
    > Privileges granted to the Role. See [Documentation](https://developers.thoughtspot.com/docs/rbac#_role_categories_and_privileges)for supported roles privileges.


    Changed items (string):

    Added enum value:

    * `PREVIEW_THOUGHTSPOT_SAGE`
###### Return Type:

Changed response : **200 OK**
> Role successfully created.


* Changed content type : `application/json`

    * Changed property `privileges` (array)
        > Privileges granted to the role.


        Changed items (string):

        Added enum value:

        * `PREVIEW_THOUGHTSPOT_SAGE`
##### `POST` /api/rest/2.0/roles/{role_identifier}/update


###### Return Type:

Changed response : **200 OK**
> Role successfully updated.


* Changed content type : `application/json`

    * Changed property `privileges` (array)
        > Privileges granted to the role.


        Changed items (string):

        Added enum value:

        * `PREVIEW_THOUGHTSPOT_SAGE`
##### `POST` /api/rest/2.0/connection/search


###### Request:

Changed content type : `application/json`

* Changed property `data_warehouse_types` (array)
    > Array of types of data warehouse defined for the connection.


    Changed items (string):

    Added enum value:

    * `CLICKHOUSE`
###### Return Type:

Changed response : **200 OK**
> List of connections to the datasource.


* Changed content type : `application/json`

    Changed items (object):

    * Changed property `data_warehouse_type` (string)
        > Type of data warehouse.


        Added enum value:

        * `CLICKHOUSE`
