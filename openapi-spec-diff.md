#### What's New
---

##### `POST` /api/rest/2.0/metadata/parameterize


##### `POST` /api/rest/2.0/metadata/unparameterize


##### `POST` /api/rest/2.0/security/metadata/publish


##### `POST` /api/rest/2.0/security/metadata/unpublish


##### `POST` /api/rest/2.0/template/variables/create


##### `POST` /api/rest/2.0/template/variables/{identifier}/delete


##### `POST` /api/rest/2.0/template/variables/search


##### `POST` /api/rest/2.0/template/variables/{identifier}/update


##### `POST` /api/rest/2.0/template/variables/update


#### What's Changed
---

##### `POST` /api/rest/2.0/auth/session/login


##### `POST` /api/rest/2.0/report/liveboard


###### Request:

Changed content type : `application/json`

* Added property `tab_identifiers` (array)
    > GUID or name of the tab of the Liveboard object. <br/>  <span class="since-beta-tag">Version: 10.9.0.cl or later</span>


    Items (string):

* Added property `personalised_view_identifier` (string)
    > GUID or name of the personalised view of the Liveboard object. <br/>  <span class="since-beta-tag">Version: 10.9.0.cl or later</span>


* Changed property `png_options` (object)
    > Options for PNG export.


    * Added property `image_resolution` (integer)
        > Desired width of the Liveboard image in pixels. Ex. 1920 for Full HD image <br/> <span class="since-beta-tag">Beta</span> <span class="since-beta-tag">Version: 10.9.0.cl or later</span>


    * Added property `image_scale` (integer)
        > The scale of the image in percentage. Ex. 100 for 100% scale. <br/> <span class="since-beta-tag">Beta</span> <span class="since-beta-tag">Version: 10.9.0.cl or later</span>


    * Added property `include_header` (boolean)
        > Indicates whether to include the header of the liveboard. <br/> <span class="since-beta-tag">Beta</span> <span class="since-beta-tag">Version: 10.9.0.cl or later</span>


##### `POST` /api/rest/2.0/auth/token/custom


##### `POST` /api/rest/2.0/auth/token/full


##### `POST` /api/rest/2.0/auth/token/object


##### `POST` /api/rest/2.0/metadata/search


###### Request:

Changed content type : `application/json`

* Added property `show_resolved_parameters` (boolean)
    > <div><span class="since-beta-tag">Version: 10.9.0.cl or later</span></div>
    > 
    > Indicates whether to show resolved parameterised values.


* Changed property `include_discoverable_objects` (boolean)
    > <div><span class="since-beta-tag">Version: 10.7.0.cl or later</span></div>
    > 
    > Boolean to indicate whether to include discoverable metadata objects.


##### `POST` /api/rest/2.0/security/metadata/share


###### Request:

Changed content type : `application/json`

* Changed property `metadata_type` (string)
    > Type of metadata. Required if identifier in metadata_identifies is a name.
    > 1. Liveboard
    > 2. Answers
    > 3. LOGICAL_TABLE for any data object such as table, worksheet or view.
    > 4. LOGICAL_COLUMN
    > 5. Connection


##### `POST` /api/rest/2.0/connection/search


###### Request:

Changed content type : `application/json`

* Added property `show_resolved_parameters` (boolean)
    > <div><span class="since-beta-tag">Version: 10.9.0.cl or later</span></div>
    > 
    > Indicates whether to show resolved parameterised values.


