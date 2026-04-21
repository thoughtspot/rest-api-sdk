// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { AssignChangeAuthorRequest } from '../models/AssignChangeAuthorRequest';
import { ColumnSecurityRuleResponse } from '../models/ColumnSecurityRuleResponse';
import { ErrorResponse } from '../models/ErrorResponse';
import { FetchColumnSecurityRulesRequest } from '../models/FetchColumnSecurityRulesRequest';
import { FetchObjectPrivilegesRequest } from '../models/FetchObjectPrivilegesRequest';
import { FetchPermissionsOfPrincipalsRequest } from '../models/FetchPermissionsOfPrincipalsRequest';
import { FetchPermissionsOnMetadataRequest } from '../models/FetchPermissionsOnMetadataRequest';
import { ManageObjectPrivilegeRequest } from '../models/ManageObjectPrivilegeRequest';
import { ObjectPrivilegesOfMetadataResponse } from '../models/ObjectPrivilegesOfMetadataResponse';
import { PermissionOfMetadataResponse } from '../models/PermissionOfMetadataResponse';
import { PermissionOfPrincipalsResponse } from '../models/PermissionOfPrincipalsResponse';
import { PublishMetadataRequest } from '../models/PublishMetadataRequest';
import { ShareMetadataRequest } from '../models/ShareMetadataRequest';
import { UnpublishMetadataRequest } from '../models/UnpublishMetadataRequest';
import { UpdateColumnSecurityRulesRequest } from '../models/UpdateColumnSecurityRulesRequest';

/**
 * no description
 */
export class SecurityApiRequestFactory extends BaseAPIRequestFactory {

    /**
     *   Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege and edit access to the objects are required.      
     * @param assignChangeAuthorRequest 
     */
    public async assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'assignChangeAuthorRequest' is not null or undefined
        if (assignChangeAuthorRequest === null || assignChangeAuthorRequest === undefined) {
            throw new RequiredError("SecurityApi", "assignChangeAuthor", "assignChangeAuthorRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/security/metadata/assign';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assignChangeAuthorRequest, "AssignChangeAuthorRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Version: 10.12.0.cl or later   Fetches column security rules for specified tables.  This API endpoint retrieves column-level security rules configured for tables. It returns information about which columns are secured and which groups have access to those columns.  #### Usage guidelines  - Provide an array of table identifiers using either `identifier` (GUID or name) or `obj_identifier` (object ID) - At least one of `identifier` or `obj_identifier` must be provided for each table - The API returns column security rules for all specified tables - Users must have appropriate permissions to access security rules for the specified tables  #### Required permissions  - `ADMINISTRATION` - Can administer ThoughtSpot - `DATAMANAGEMENT` - Can manage data - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` - Can manage worksheet views and tables  #### Example request  ```json {   \"tables\": [     {       \"identifier\": \"table-guid\",       \"obj_identifier\": \"table-object-id\"     }   ] } ```  #### Response format  The API returns an array of `ColumnSecurityRuleResponse` objects wrapped in a `data` field. Each `ColumnSecurityRuleResponse` object contains: - Table information (GUID and object ID)   - Array of column security rules with column details, group access, and source table information  #### Example response  ```json {   \"data\": [     {       \"guid\": \"table-guid\",       \"objId\": \"table-object-id\",       \"columnSecurityRules\": [         {           \"column\": {             \"id\": \"col_123\",             \"name\": \"Salary\"           },           \"groups\": [             {               \"id\": \"group_1\",               \"name\": \"HR Department\"             }           ],           \"sourceTableDetails\": {             \"id\": \"source-table-guid\",             \"name\": \"Employee_Data\"           }         }       ]     }   ] } ```     
     * @param fetchColumnSecurityRulesRequest 
     */
    public async fetchColumnSecurityRules(fetchColumnSecurityRulesRequest: FetchColumnSecurityRulesRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'fetchColumnSecurityRulesRequest' is not null or undefined
        if (fetchColumnSecurityRulesRequest === null || fetchColumnSecurityRulesRequest === undefined) {
            throw new RequiredError("SecurityApi", "fetchColumnSecurityRules", "fetchColumnSecurityRulesRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/security/column/rules/fetch';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(fetchColumnSecurityRulesRequest, "FetchColumnSecurityRulesRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 26.3.0.cl or later   This API fetches the object privileges present for the given list of principals (user or group), on the given set of objects. It supports pagination, which can be enabled and configured using the request parameters. It provides users access to certain features based on privilege based access control.  #### Usage guidelines  - Specify the `type` (`USER` or `USER_GROUP`) and `identifier` (either GUID or name) of the principals for which you want to retrieve object privilege information in the `principals` array. - Specify the `type`  (`LOGICAL_TABLE`)  and `identifier` (either GUID or name) of the metadata objects for which you want to retrieve object privilege information in the `metadata` array. Only `LOGICAL_TABLE` metadata type is supported for now. It may be extended for other metadata types in future. - To control the offset from where principals have to be fetched, use `record_offset`. When `record_offset` is 0, information is fetched from the beginning. - To control the number of principals to be fetched, use `record_size`. Default `record_size` is 20. - Ensure `record_offset` for a subsequent request is one more than the value of `record_size` of the previous request. - Ensure using correct Authorization Bearer Token corresponding to specific user & org.   #### Example request  ```json {   \"principals\": [     {       \"type\": \"type-1\",       \"identifier\": \"principal-guid-or-name-1\"     },     {       \"type\": \"type-2\",       \"identifier\": \"principal-guid-or-name-2\"     }   ],   \"metadata\": [     {       \"type\": \"metadata-type-1\",       \"identifier\": \"metadata-guid-or-name-1\"     },     {       \"type\": \"metadata-type-2\",       \"identifier\": \"metadata-guid-or-name-2\"     }   ],   \"record_offset\": 0,   \"record_size\": 20 } ```   #### Response format  The API returns an array of `metadata_object_privileges` objects wrapped in JSON. Each `metadata_object_privileges` object contains: - Metadata information (GUID, name and type) - Array of `principal_object_privilege_info`. - Each `principal_object_privilege_info` contains:   - Principal type. All principals of this type are listed as described below.   - Array of `principal_object_privileges`.   - Each `principal_object_privileges` contains:     - Principal information (GUID, name, subtype)     - List of applied object level privileges.  #### Example response  ```json {     \"metadata_object_privileges\": [       {         \"metadata_id\": \"metadata-guid-1\",         \"metadata_name\": \"metadata-name-1\",         \"metadata_type\": \"metadata-type-1\",         \"principal_object_privilege_info\": [           {             \"principal_type\": \"principal-type-1\",             \"principal_object_privileges\": [               {                 \"principal_id\": \"principal-guid-1\",                 \"principal_name\": \"principal-name-1\",                 \"principal_sub_type\": \"principal-sub-type-1\",                 \"object_privileges\": \"[object-privilege-1, object-privilege-2]\"               },               {                 \"principal_id\": \"principal-guid-2\",                 \"principal_name\": \"principal-name-2\",                 \"principal_sub_type\": \"principal-sub-type-2\",                 \"object_privileges\": \"[object-privilege-1, object-privilege-2]\"               }             ]           },           {             \"principal_type\": \"principal-type-2\",             \"principal_object_privileges\": [               {                 \"principal_id\": \"principal-guid-3\",                 \"principal_name\": \"principal-guid-4\",                 \"principal_sub_type\": \"principal-sub-type-4\",                 \"object_privileges\": \"[object-privilege-1]\"               }             ]           }         ]       },       {         \"metadata_id\": \"metadata-guid-2\",         \"metadata_name\": \"metadata-name-2\",         \"metadata_type\": \"metadata-type-2\",         \"principal_object_privilege_info\": [           {             \"principal_type\": \"principal-type-1\",             \"principal_object_privileges\": [               {                 \"principal_id\": \"principal-guid-1\",                 \"principal_name\": \"principal-name-1\",                 \"principal_sub_type\": \"principal-sub-type-1\",                 \"object_privileges\": \"[object-privilege-3, object-privilege-4]\"               },               {                 \"principal_id\": \"principal-guid-2\",                 \"principal_name\": \"principal-name-2\",                 \"principal_sub_type\": \"principal-sub-type-2\",                 \"object_privileges\": \"[object-privilege-4]\"               }             ]           }         ]       }     ] } ```     
     * @param fetchObjectPrivilegesRequest 
     */
    public async fetchObjectPrivileges(fetchObjectPrivilegesRequest: FetchObjectPrivilegesRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'fetchObjectPrivilegesRequest' is not null or undefined
        if (fetchObjectPrivilegesRequest === null || fetchObjectPrivilegesRequest === undefined) {
            throw new RequiredError("SecurityApi", "fetchObjectPrivileges", "fetchObjectPrivilegesRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/security/metadata/fetch-object-privileges';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(fetchObjectPrivilegesRequest, "FetchObjectPrivilegesRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.   #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.        
     * @param fetchPermissionsOfPrincipalsRequest 
     */
    public async fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'fetchPermissionsOfPrincipalsRequest' is not null or undefined
        if (fetchPermissionsOfPrincipalsRequest === null || fetchPermissionsOfPrincipalsRequest === undefined) {
            throw new RequiredError("SecurityApi", "fetchPermissionsOfPrincipals", "fetchPermissionsOfPrincipalsRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/security/principals/fetch-permissions';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(fetchPermissionsOfPrincipalsRequest, "FetchPermissionsOfPrincipalsRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify `type` and GUID or name of the metadata object. * To get permission details for a specific user or group, add `type` and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.      
     * @param fetchPermissionsOnMetadataRequest 
     */
    public async fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'fetchPermissionsOnMetadataRequest' is not null or undefined
        if (fetchPermissionsOnMetadataRequest === null || fetchPermissionsOnMetadataRequest === undefined) {
            throw new RequiredError("SecurityApi", "fetchPermissionsOnMetadata", "fetchPermissionsOnMetadataRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/security/metadata/fetch-permissions';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(fetchPermissionsOnMetadataRequest, "FetchPermissionsOnMetadataRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 26.3.0.cl or later   This API allows the addition or deletion of object level privileges for a set of users and groups, on a set of metadata objects. It provides users to access certain features based on privilege based access control.  #### Usage guidelines  - Specify the `operation`. The supported operations are: `ADD`, `REMOVE`. - Specify the type of the objects on which the object privileges are being provided in `metadata_type`. Only `LOGICAL_TABLE` metadata type is supported for now. It may be extended for other metadata types in future. - Specify the list of object privilege types in the `object_privilege_types` array. The supported object privilege types are: `SPOTTER_COACHING_PRIVILEGE`. - Specify the identifiers (either GUID or name) for the metadata objects in the `metadata_identifiers` array. - Specify the `type` (`USER` or `USER_GROUP`) and `identifier` (either GUID or name) of the principals to which you want to apply the given operation and given object privileges in the `principals` array. - Ensure using correct Authorization Bearer Token corresponding to specific user & org.  #### Example request  ```json {   \"operation\": \"operation-type\",   \"metadata_type\": \"metadata-type\",   \"object_privilege_types\": [\"privilege-type-1\", \"privilege-type-2\"],   \"metadata_identifiers\": [\"metadata-guid-or-name-1\", \"metadata-guid-or-name-1\"],   \"principals\": [     {       \"type\": \"type-1\",        \"identifier\": \"principal-guid-or-name-1\"     },     {       \"type\": \"type-2\",       \"identifier\": \"principal-guid-or-name-2\"     }   ] } ```  > ###### Note: > * Only admin users, users with edit access and users with coaching privilege on a given data-model can add or remove principals related to SPOTTER_COACHING_PRIVILEGE       
     * @param manageObjectPrivilegeRequest 
     */
    public async manageObjectPrivilege(manageObjectPrivilegeRequest: ManageObjectPrivilegeRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'manageObjectPrivilegeRequest' is not null or undefined
        if (manageObjectPrivilegeRequest === null || manageObjectPrivilegeRequest === undefined) {
            throw new RequiredError("SecurityApi", "manageObjectPrivilege", "manageObjectPrivilegeRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/security/metadata/manage-object-privilege';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(manageObjectPrivilegeRequest, "ManageObjectPrivilegeRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Version: 10.9.0.cl or later   Allows publishing metadata objects across organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows publishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  This API will essentially share the objects along with it\'s dependencies to the org admins of the orgs to which it is being published.      
     * @param publishMetadataRequest 
     */
    public async publishMetadata(publishMetadataRequest: PublishMetadataRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'publishMetadataRequest' is not null or undefined
        if (publishMetadataRequest === null || publishMetadataRequest === undefined) {
            throw new RequiredError("SecurityApi", "publishMetadata", "publishMetadataRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/security/metadata/publish';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(publishMetadataRequest, "PublishMetadataRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *   Version: 9.0.0.cl or later   Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  #### Supported metadata objects: * Liveboards * Visualizations * Answers * Models * Views * Connections * Collections  #### Object permissions  You can provide `READ_ONLY` or `MODIFY` access when sharing an object with another user or group. The `READ_ONLY` permission grants view access to the shared object, whereas `MODIFY` provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set `shareMode` to `NO_ACCESS`.  #### Sharing a visualization  * Sharing a visualization implicitly shares the entire Liveboard with the recipient. * Object permissions set for a shared visualization also apply to the Liveboard unless overridden by another API request or via UI. * If email notifications for object sharing are enabled, a notification with a link to the shared visualization will be sent to the recipient’s email address. Although this link opens the shared visualization, recipients can also access other visualizations in the Liveboard.  #### Sharing a collection  Collections support **dual permissions** that provide fine-grained control:  * **Collection permissions** (`share_mode`) - controls access to the collection itself (view, edit, delete the collection) * **Content permissions** (`content_share_mode`) - controls access to objects within the collection (view, edit objects inside)  **Default Behavior:** - If only `share_mode` is specified, the content permissions default to `READ_ONLY` (except when `share_mode` is `NO_ACCESS`, then content also gets `NO_ACCESS`) - To give users edit access to collection contents, explicitly set `content_share_mode: \"MODIFY\"`  ## Examples  The following JSON examples can be copy-pasted as request bodies for the REST v2 API endpoint:  ```bash POST /callosum/v1/v2/security/metadata/share Content-Type: application/x-www-form-urlencoded ```  ### Basic collection sharing Share a collection with read-only access:  ```json {   \"metadata_type\": \"COLLECTION\",   \"metadata_identifiers\": [\"Sales Reports Collection\"],   \"permissions\": [{     \"principal\": {       \"type\": \"USER\",       \"identifier\": \"alice@company.com\"     },     \"share_mode\": \"READ_ONLY\"   }],   \"notification\": {     \"message\": \"I\'ve shared the Sales Reports collection with you\",     \"notify_on_share\": true   } } ```  ### Collection sharing with dual permissions Share a collection with different permissions for the collection vs. its contents:  ```json {   \"metadata_type\": \"COLLECTION\",   \"metadata_identifiers\": [\"Marketing Analytics\"],   \"permissions\": [{     \"principal\": {       \"type\": \"USER\",       \"identifier\": \"bob@company.com\"     },     \"share_mode\": \"MODIFY\",     \"content_share_mode\": \"READ_ONLY\"   }, {     \"principal\": {       \"type\": \"USER_GROUP\",       \"identifier\": \"Marketing Team\"     },     \"share_mode\": \"READ_ONLY\",     \"content_share_mode\": \"READ_ONLY\"   }],   \"notification\": {     \"emails\": [\"bob@company.com\"],     \"message\": \"You can edit the collection but content is read-only\",     \"enable_custom_url\": false,     \"notify_on_share\": true   },   \"has_lenient_discoverability\": false } ```  ### Multiple collections sharing Share multiple collections with different users:  ```json {   \"metadata\": [     {       \"type\": \"COLLECTION\",       \"identifier\": \"Q4 Reports\"     },     {       \"type\": \"COLLECTION\",       \"identifier\": \"Executive Dashboard Collection\"     }   ],   \"permissions\": [{     \"principal\": {       \"type\": \"USER_GROUP\",       \"identifier\": \"Executives\"     },     \"share_mode\": \"MODIFY\"   }, {     \"principal\": {       \"type\": \"USER\",       \"identifier\": \"manager@company.com\"     },     \"share_mode\": \"READ_ONLY\",     \"content_share_mode\": \"MODIFY\"   }],   \"notification\": {     \"message\": \"Sharing quarterly collections with leadership team\",     \"notify_on_share\": true   } } ```  ### Remove collection access Remove access to a collection by setting share_mode to NO_ACCESS:  ```json {   \"metadata_type\": \"COLLECTION\",   \"metadata_identifiers\": [\"Confidential Reports\"],   \"permissions\": [{     \"principal\": {       \"type\": \"USER\",       \"identifier\": \"former-employee@company.com\"     },     \"share_mode\": \"NO_ACCESS\"   }],   \"notification\": {     \"notify_on_share\": false   } } ```  ### Collection Permission Scenarios  **Scenario 1: Collection Admin** - `share_mode: MODIFY` + `content_share_mode: MODIFY` = Full control over collection and its contents  **Scenario 2: Collection Curator** - `share_mode: MODIFY` + `content_share_mode: READ_ONLY` = Can manage collection structure but not edit contents  **Scenario 3: Content Editor** - `share_mode: READ_ONLY` + `content_share_mode: MODIFY` = Can edit objects within collection but can\'t change collection itself  **Scenario 4: Viewer** - `share_mode: READ_ONLY` + `content_share_mode: READ_ONLY` = View-only access to collection and contents      
     * @param shareMetadataRequest 
     */
    public async shareMetadata(shareMetadataRequest: ShareMetadataRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'shareMetadataRequest' is not null or undefined
        if (shareMetadataRequest === null || shareMetadataRequest === undefined) {
            throw new RequiredError("SecurityApi", "shareMetadata", "shareMetadataRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/security/metadata/share';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(shareMetadataRequest, "ShareMetadataRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Version: 10.9.0.cl or later   Allows unpublishing metadata objects from organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows unpublishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  When unpublishing objects, you can: * Include dependencies by setting `include_dependencies` to true - this will unpublish all dependent objects if no other published object is using them * Force unpublish by setting `force` to true - this will break all dependent objects in the unpublished organizations      
     * @param unpublishMetadataRequest 
     */
    public async unpublishMetadata(unpublishMetadataRequest: UnpublishMetadataRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'unpublishMetadataRequest' is not null or undefined
        if (unpublishMetadataRequest === null || unpublishMetadataRequest === undefined) {
            throw new RequiredError("SecurityApi", "unpublishMetadata", "unpublishMetadataRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/security/metadata/unpublish';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(unpublishMetadataRequest, "UnpublishMetadataRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     *  Version: 10.12.0.cl or later   Creates, updates, or deletes column security rules for specified tables.  This API endpoint allows you to create, update, or delete column-level security rules on columns of a table. The operation follows an \"all or none\" policy: if defining security rules for any of the provided columns fails, the entire operation will be rolled back, and no rules will be created.  #### Usage guidelines  - Provide table identifier using either `identifier` (GUID or name) or `obj_identifier` (object ID) - Use `clear_csr: true` to remove all column security rules from the table - For each column, specify the security rule using `column_security_rules` array - Use `is_unsecured: true` to mark a specific column as unprotected - Use `group_access` operations to manage group associations:   - `ADD`: Add groups to the column\'s access list   - `REMOVE`: Remove groups from the column\'s access list   - `REPLACE`: Replace all existing groups with the specified groups  #### Required permissions  - `ADMINISTRATION` - Can administer ThoughtSpot - `DATAMANAGEMENT` - Can manage data (if RBAC is disabled) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` - Can manage worksheet views and tables (if RBAC is enabled)  #### Example request  ```json {   \"identifier\": \"table-guid\",   \"obj_identifier\": \"table-object-id\",   \"clear_csr\": false,   \"column_security_rules\": [     {       \"column_identifier\": \"col id or col name\",       \"is_unsecured\": false,       \"group_access\": [         {           \"operation\": \"ADD\",           \"group_identifiers\": [\"hr_group_id\", \"hr_group_name\", \"finance_group_id\"]         }       ]     },     {       \"column_identifier\": \"col id or col name\",       \"is_unsecured\": true     },     {       \"column_identifier\": \"col id or col name\",       \"is_unsecured\": false,       \"group_access\": [         {           \"operation\": \"REPLACE\",           \"group_identifiers\": [\"management_group_id\", \"management_group_name\"]         }       ]     }   ] } ```  #### Request Body Schema  - `identifier` (string, optional): GUID or name of the table for which we want to create column security rules - `obj_identifier` (string, optional): The object ID of the table - `clear_csr` (boolean, optional): If true, then all the secured columns will be marked as unprotected, and all the group associations will be removed - `column_security_rules` (array of objects, required): An array where each object defines the security rule for a specific column  Each column security rule object contains: - `column_identifier` (string, required): Column identifier (col_id or name) - `is_unsecured` (boolean, optional): If true, the column will be marked as unprotected and all groups associated with it will be removed - `group_access` (array of objects, optional): Array of group operation objects  Each group operation object contains: - `operation` (string, required): Operation type - ADD, REMOVE, or REPLACE - `group_identifiers` (array of strings, required): Array of group identifiers (name or GUID) on which the operation will be performed  #### Response  This API does not return any response body. A successful operation returns HTTP 200 status code.  #### Operation Types  - **ADD**: Adds the specified groups to the column\'s access list - **REMOVE**: Removes the specified groups from the column\'s access list   - **REPLACE**: Replaces all existing groups with the specified groups      
     * @param updateColumnSecurityRulesRequest 
     */
    public async updateColumnSecurityRules(updateColumnSecurityRulesRequest: UpdateColumnSecurityRulesRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'updateColumnSecurityRulesRequest' is not null or undefined
        if (updateColumnSecurityRulesRequest === null || updateColumnSecurityRulesRequest === undefined) {
            throw new RequiredError("SecurityApi", "updateColumnSecurityRules", "updateColumnSecurityRulesRequest");
        }


        // Path Params
        const localVarPath = '/api/rest/2.0/security/column/rules/update';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST); 
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")
        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-Client/typescript/2.23.0")
        requestContext.setHeaderParam("X-ThoughtSpot-Client", "ThoughtSpot-ts-client/2.23.0")
      



        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateColumnSecurityRulesRequest, "UpdateColumnSecurityRulesRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["bearerAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class SecurityApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assignChangeAuthor
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assignChangeAuthor(response: ResponseContext): Promise<void > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("204", response.httpStatusCode)) {
            return;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchColumnSecurityRules
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async fetchColumnSecurityRules(response: ResponseContext): Promise<Array<ColumnSecurityRuleResponse> > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<ColumnSecurityRuleResponse> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<ColumnSecurityRuleResponse>", ""
            ) as Array<ColumnSecurityRuleResponse>;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Bad request - Table not found or invalid parameters", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden - User doesn\&#39;t have permission to access security rules for this table", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Internal server error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Array<ColumnSecurityRuleResponse> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<ColumnSecurityRuleResponse>", ""
            ) as Array<ColumnSecurityRuleResponse>;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchObjectPrivileges
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async fetchObjectPrivileges(response: ResponseContext): Promise<ObjectPrivilegesOfMetadataResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: ObjectPrivilegesOfMetadataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ObjectPrivilegesOfMetadataResponse", ""
            ) as ObjectPrivilegesOfMetadataResponse;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: ObjectPrivilegesOfMetadataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ObjectPrivilegesOfMetadataResponse", ""
            ) as ObjectPrivilegesOfMetadataResponse;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchPermissionsOfPrincipals
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async fetchPermissionsOfPrincipals(response: ResponseContext): Promise<PermissionOfPrincipalsResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: PermissionOfPrincipalsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PermissionOfPrincipalsResponse", ""
            ) as PermissionOfPrincipalsResponse;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: PermissionOfPrincipalsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PermissionOfPrincipalsResponse", ""
            ) as PermissionOfPrincipalsResponse;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchPermissionsOnMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async fetchPermissionsOnMetadata(response: ResponseContext): Promise<PermissionOfMetadataResponse > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: PermissionOfMetadataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PermissionOfMetadataResponse", ""
            ) as PermissionOfMetadataResponse;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: PermissionOfMetadataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PermissionOfMetadataResponse", ""
            ) as PermissionOfMetadataResponse;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to manageObjectPrivilege
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async manageObjectPrivilege(response: ResponseContext): Promise<void > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("204", response.httpStatusCode)) {
            return;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to publishMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async publishMetadata(response: ResponseContext): Promise<void > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("204", response.httpStatusCode)) {
            return;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to shareMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async shareMetadata(response: ResponseContext): Promise<void > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("204", response.httpStatusCode)) {
            return;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to unpublishMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async unpublishMetadata(response: ResponseContext): Promise<void > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("204", response.httpStatusCode)) {
            return;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Invalid request.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden access.", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateColumnSecurityRules
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateColumnSecurityRules(response: ResponseContext): Promise<void > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("204", response.httpStatusCode)) {
            return;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Bad request - Invalid parameters or table not found", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Unauthorized access.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Forbidden - User doesn\&#39;t have permission to modify security rules for this table", body, response.headers);
        }
        if (isCodeInRange("500", response.httpStatusCode)) {
            const body: ErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ErrorResponse", ""
            ) as ErrorResponse;
            throw new ApiException<ErrorResponse>(response.httpStatusCode, "Internal server error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
