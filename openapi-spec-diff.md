#### What's Changed
---

##### `GET` /api/rest/2.0/auth/session/token


##### `POST` /api/rest/2.0/connections/{connection_identifier}/update


##### `POST` /api/rest/2.0/metadata/tml/async/import


###### Return Type:

Changed response : **200 OK**
> Async TML Import Task submitted successfully.


* Changed content type : `application/json`

    * Added property `author_display_name` (string)
        > Display name of the user who initiated the task.


##### `POST` /api/rest/2.0/report/answer


##### `POST` /api/rest/2.0/schedules/{schedule_identifier}/update


###### Request:

Changed content type : `application/json`

* Added property `personalised_view_id` (string)
    > Personalised view id of the liveboard to be scheduled.


##### `GET` /api/rest/2.0/system/config-overrides


###### Return Type:

Changed response : **200 OK**
> Cluster configuration which can be overridden.


* Changed content type : `application/json`

    * Added property `config_override_info` (object)

##### `POST` /api/rest/2.0/vcs/git/config/delete


##### `GET` /api/rest/2.0/auth/session/user


##### `POST` /api/rest/2.0/metadata/tml/async/status


###### Return Type:

Changed response : **200 OK**
> Async TML Import Task statuses fetched successfully.


* Changed content type : `application/json`

    * Changed property `status_list` (array)
        > List of task statuses.


        Changed items (object):

        * Added property `author_display_name` (string)
            > Display name of the user who initiated the task.


##### `POST` /api/rest/2.0/metadata/search


###### Request:

Changed content type : `application/json`

* Added property `liveboard_response_version` (string)
    > Indicates the model version of Liveboard to be attached in metadata detail.


    Enum values:

    * `V1`
    * `V2`
* Changed property `metadata` (array)
    > Metadata objects such as Liveboards, Answers, and Worksheets.


    Changed items (object):

    * Added property `subtypes` (array)
        > List of subtype of metadata. Applies for LOGICAL_TABLE type with the following valid values.
        > 1. ONE_TO_ONE_LOGICAL
        > 2. WORKSHEET
        > 3. PRIVATE_WORKSHEET.
        > 4. USER_DEFINED.
        > 5. AGGR_WORKSHEET.
        > 6. SQL_VIEW <br/>  <span class="since-beta-tag">Version: 10.11.0.cl or later</span>


        Items (string):

        Enum values:

        * `ONE_TO_ONE_LOGICAL`
        * `WORKSHEET`
        * `PRIVATE_WORKSHEET`
        * `USER_DEFINED`
        * `AGGR_WORKSHEET`
        * `SQL_VIEW`
##### `POST` /api/rest/2.0/template/variables/create


###### Return Type:

Changed response : **200 OK**
> Create variable is successful.


* Changed content type : `application/json`

    * Changed property `values` (array)
        > Values of the variable


        Changed items (object):

        New optional properties:
        - `value`

        * Changed property `value` (string)
            > The value of the variable


##### `POST` /api/rest/2.0/template/variables/search


###### Return Type:

Changed response : **200 OK**
> List of variables is successful.


* Changed content type : `application/json`

    Changed items (object):
        > Variable object


    * Changed property `values` (array)
        > Values of the variable


        Changed items (object):

        New optional properties:
        - `value`

        * Changed property `value` (string)
            > The value of the variable


##### `POST` /api/rest/2.0/vcs/git/config/create


##### `POST` /api/rest/2.0/vcs/git/config/search


##### `POST` /api/rest/2.0/vcs/git/config/update


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


##### `POST` /api/rest/2.0/connection/search


