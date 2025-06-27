#### What's New
---

##### `POST` /api/rest/2.0/customization/email


##### `POST` /api/rest/2.0/customization/email/{template_identifier}/delete


##### `POST` /api/rest/2.0/customization/email/search


##### `POST` /api/rest/2.0/customization/email/validate


#### What's Changed
---

##### `POST` /api/rest/2.0/groups/{group_identifier}/update


###### Request:

Changed content type : `application/json`

* Changed property `privileges` (array)
    > Privileges to assign to the group.


    Changed items (string):

    Added enum value:

    * `EXPERIMENTALFEATUREPRIVILEGE`
##### `POST` /api/rest/2.0/schedules/{schedule_identifier}/update


###### Request:

Changed content type : `application/json`

* Added property `personalised_view_id` (string)
    > Personalised view id of the liveboard to be scheduled.


##### `POST` /api/rest/2.0/groups/create


###### Request:

Changed content type : `application/json`

* Changed property `privileges` (array)
    > Privileges to assign to the group


    Changed items (string):

    Added enum value:

    * `EXPERIMENTALFEATUREPRIVILEGE`
##### `POST` /api/rest/2.0/groups/import


###### Request:

Changed content type : `application/json`

* Changed property `groups` (array)
    > Details of groups which are to be imported


    Changed items (object):

    * Changed property `privileges` (array)
        > Privileges that will be assigned to the group.


        Changed items (string):

        Added enum value:

        * `EXPERIMENTALFEATUREPRIVILEGE`
##### `POST` /api/rest/2.0/groups/search


###### Request:

Changed content type : `application/json`

* Added property `include_users` (boolean)
    > <div><span class="since-beta-tag">Version: 10.10.0.cl or later</span></div>
    > 
    > Define Parameter to consider if the users should be included in group search response.


* Added property `include_sub_groups` (boolean)
    > <div><span class="since-beta-tag">Version: 10.10.0.cl or later</span></div>
    > 
    > Define Parameter to consider if the sub groups should be included in group search response.


##### `POST` /api/rest/2.0/metadata/search


##### `POST` /api/rest/2.0/roles/{role_identifier}/update


###### Request:

Changed content type : `application/json`

* Changed property `privileges` (array)
    > Privileges granted to the role. See [Documentation](https://developers.thoughtspot.com/docs/rbac#_role_categories_and_privileges)for supported roles privileges.


    Changed items (string):

    Added enum value:

    * `PREVIEW_THOUGHTSPOT_SAGE`
##### `POST` /api/rest/2.0/schedules/create


###### Request:

Changed content type : `application/json`

* Added property `personalised_view_id` (string)
    > Personalised view id of the liveboard to be scheduled.


###### Return Type:

Changed response : **200 OK**
> Schedule successfully created.


* Changed content type : `application/json`

    * Added property `personalised_view_id` (string)
        > Personalised view id of the liveboard to be scheduled.


##### `POST` /api/rest/2.0/schedules/search


###### Return Type:

Changed response : **200 OK**
> Schedule search result.


* Changed content type : `application/json`

    Changed items (object):

    * Added property `personalised_view_id` (string)
        > Personalised view id of the liveboard to be scheduled.


