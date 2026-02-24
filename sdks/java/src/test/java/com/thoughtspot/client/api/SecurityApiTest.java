/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.AssignChangeAuthorRequest;
import com.thoughtspot.client.model.ColumnSecurityRuleResponse;
import com.thoughtspot.client.model.ErrorResponse;
import com.thoughtspot.client.model.FetchColumnSecurityRulesRequest;
import com.thoughtspot.client.model.FetchObjectPrivilegesRequest;
import com.thoughtspot.client.model.FetchPermissionsOfPrincipalsRequest;
import com.thoughtspot.client.model.FetchPermissionsOnMetadataRequest;
import com.thoughtspot.client.model.ManageObjectPrivilegeRequest;
import com.thoughtspot.client.model.ObjectPrivilegesOfMetadataResponse;
import com.thoughtspot.client.model.PermissionOfMetadataResponse;
import com.thoughtspot.client.model.PermissionOfPrincipalsResponse;
import com.thoughtspot.client.model.PublishMetadataRequest;
import com.thoughtspot.client.model.ShareMetadataRequest;
import com.thoughtspot.client.model.UnpublishMetadataRequest;
import com.thoughtspot.client.model.UpdateColumnSecurityRulesRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecurityApi
 */
@Disabled
public class SecurityApiTest {

    private final SecurityApi api = new SecurityApi();

    /**
     *   Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege and edit access to the objects are required.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignChangeAuthorTest() throws ApiException {
        AssignChangeAuthorRequest assignChangeAuthorRequest = null;
        api.assignChangeAuthor(assignChangeAuthorRequest);
        // TODO: test validations
    }

    /**
     *  Version: 10.12.0.cl or later   Fetches column security rules for specified tables.  This API endpoint retrieves column-level security rules configured for tables. It returns information about which columns are secured and which groups have access to those columns.  #### Usage guidelines  - Provide an array of table identifiers using either &#x60;identifier&#x60; (GUID or name) or &#x60;obj_identifier&#x60; (object ID) - At least one of &#x60;identifier&#x60; or &#x60;obj_identifier&#x60; must be provided for each table - The API returns column security rules for all specified tables - Users must have appropriate permissions to access security rules for the specified tables  #### Required permissions  - &#x60;ADMINISTRATION&#x60; - Can administer ThoughtSpot - &#x60;DATAMANAGEMENT&#x60; - Can manage data - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; - Can manage worksheet views and tables  #### Example request  &#x60;&#x60;&#x60;json {   \&quot;tables\&quot;: [     {       \&quot;identifier\&quot;: \&quot;table-guid\&quot;,       \&quot;obj_identifier\&quot;: \&quot;table-object-id\&quot;     }   ] } &#x60;&#x60;&#x60;  #### Response format  The API returns an array of &#x60;ColumnSecurityRuleResponse&#x60; objects wrapped in a &#x60;data&#x60; field. Each &#x60;ColumnSecurityRuleResponse&#x60; object contains: - Table information (GUID and object ID)   - Array of column security rules with column details, group access, and source table information  #### Example response  &#x60;&#x60;&#x60;json {   \&quot;data\&quot;: [     {       \&quot;guid\&quot;: \&quot;table-guid\&quot;,       \&quot;objId\&quot;: \&quot;table-object-id\&quot;,       \&quot;columnSecurityRules\&quot;: [         {           \&quot;column\&quot;: {             \&quot;id\&quot;: \&quot;col_123\&quot;,             \&quot;name\&quot;: \&quot;Salary\&quot;           },           \&quot;groups\&quot;: [             {               \&quot;id\&quot;: \&quot;group_1\&quot;,               \&quot;name\&quot;: \&quot;HR Department\&quot;             }           ],           \&quot;sourceTableDetails\&quot;: {             \&quot;id\&quot;: \&quot;source-table-guid\&quot;,             \&quot;name\&quot;: \&quot;Employee_Data\&quot;           }         }       ]     }   ] } &#x60;&#x60;&#x60;     
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchColumnSecurityRulesTest() throws ApiException {
        FetchColumnSecurityRulesRequest fetchColumnSecurityRulesRequest = null;
        List<ColumnSecurityRuleResponse> response = api.fetchColumnSecurityRules(fetchColumnSecurityRulesRequest);
        // TODO: test validations
    }

    /**
     *   Version: 26.3.0.cl or later   This API fetches the object privileges present for the given list of principals (user or group), on the given set of objects. It supports pagination, which can be enabled and configured using the request parameters. It provides users access to certain features based on privilege based access control.  #### Usage guidelines  - Specify the &#x60;type&#x60; (&#x60;USER&#x60; or &#x60;USER_GROUP&#x60;) and &#x60;identifier&#x60; (either GUID or name) of the principals for which you want to retrieve object privilege information in the &#x60;principals&#x60; array. - Specify the &#x60;type&#x60;  (&#x60;LOGICAL_TABLE&#x60;)  and &#x60;identifier&#x60; (either GUID or name) of the metadata objects for which you want to retrieve object privilege information in the &#x60;metadata&#x60; array. Only &#x60;LOGICAL_TABLE&#x60; metadata type is supported for now. It may be extended for other metadata types in future. - To control the offset from where principals have to be fetched, use &#x60;record_offset&#x60;. When &#x60;record_offset&#x60; is 0, information is fetched from the beginning. - To control the number of principals to be fetched, use &#x60;record_size&#x60;. Default &#x60;record_size&#x60; is 20. - Ensure &#x60;record_offset&#x60; for a subsequent request is one more than the value of &#x60;record_size&#x60; of the previous request. - Ensure using correct Authorization Bearer Token corresponding to specific user &amp; org.   #### Example request  &#x60;&#x60;&#x60;json {   \&quot;principals\&quot;: [     {       \&quot;type\&quot;: \&quot;type-1\&quot;,       \&quot;identifier\&quot;: \&quot;principal-guid-or-name-1\&quot;     },     {       \&quot;type\&quot;: \&quot;type-2\&quot;,       \&quot;identifier\&quot;: \&quot;principal-guid-or-name-2\&quot;     }   ],   \&quot;metadata\&quot;: [     {       \&quot;type\&quot;: \&quot;metadata-type-1\&quot;,       \&quot;identifier\&quot;: \&quot;metadata-guid-or-name-1\&quot;     },     {       \&quot;type\&quot;: \&quot;metadata-type-2\&quot;,       \&quot;identifier\&quot;: \&quot;metadata-guid-or-name-2\&quot;     }   ],   \&quot;record_offset\&quot;: 0,   \&quot;record_size\&quot;: 20 } &#x60;&#x60;&#x60;   #### Response format  The API returns an array of &#x60;metadata_object_privileges&#x60; objects wrapped in JSON. Each &#x60;metadata_object_privileges&#x60; object contains: - Metadata information (GUID, name and type) - Array of &#x60;principal_object_privilege_info&#x60;. - Each &#x60;principal_object_privilege_info&#x60; contains:   - Principal type. All principals of this type are listed as described below.   - Array of &#x60;principal_object_privileges&#x60;.   - Each &#x60;principal_object_privileges&#x60; contains:     - Principal information (GUID, name, subtype)     - List of applied object level privileges.  #### Example response  &#x60;&#x60;&#x60;json {     \&quot;metadata_object_privileges\&quot;: [       {         \&quot;metadata_id\&quot;: \&quot;metadata-guid-1\&quot;,         \&quot;metadata_name\&quot;: \&quot;metadata-name-1\&quot;,         \&quot;metadata_type\&quot;: \&quot;metadata-type-1\&quot;,         \&quot;principal_object_privilege_info\&quot;: [           {             \&quot;principal_type\&quot;: \&quot;principal-type-1\&quot;,             \&quot;principal_object_privileges\&quot;: [               {                 \&quot;principal_id\&quot;: \&quot;principal-guid-1\&quot;,                 \&quot;principal_name\&quot;: \&quot;principal-name-1\&quot;,                 \&quot;principal_sub_type\&quot;: \&quot;principal-sub-type-1\&quot;,                 \&quot;object_privileges\&quot;: \&quot;[object-privilege-1, object-privilege-2]\&quot;               },               {                 \&quot;principal_id\&quot;: \&quot;principal-guid-2\&quot;,                 \&quot;principal_name\&quot;: \&quot;principal-name-2\&quot;,                 \&quot;principal_sub_type\&quot;: \&quot;principal-sub-type-2\&quot;,                 \&quot;object_privileges\&quot;: \&quot;[object-privilege-1, object-privilege-2]\&quot;               }             ]           },           {             \&quot;principal_type\&quot;: \&quot;principal-type-2\&quot;,             \&quot;principal_object_privileges\&quot;: [               {                 \&quot;principal_id\&quot;: \&quot;principal-guid-3\&quot;,                 \&quot;principal_name\&quot;: \&quot;principal-guid-4\&quot;,                 \&quot;principal_sub_type\&quot;: \&quot;principal-sub-type-4\&quot;,                 \&quot;object_privileges\&quot;: \&quot;[object-privilege-1]\&quot;               }             ]           }         ]       },       {         \&quot;metadata_id\&quot;: \&quot;metadata-guid-2\&quot;,         \&quot;metadata_name\&quot;: \&quot;metadata-name-2\&quot;,         \&quot;metadata_type\&quot;: \&quot;metadata-type-2\&quot;,         \&quot;principal_object_privilege_info\&quot;: [           {             \&quot;principal_type\&quot;: \&quot;principal-type-1\&quot;,             \&quot;principal_object_privileges\&quot;: [               {                 \&quot;principal_id\&quot;: \&quot;principal-guid-1\&quot;,                 \&quot;principal_name\&quot;: \&quot;principal-name-1\&quot;,                 \&quot;principal_sub_type\&quot;: \&quot;principal-sub-type-1\&quot;,                 \&quot;object_privileges\&quot;: \&quot;[object-privilege-3, object-privilege-4]\&quot;               },               {                 \&quot;principal_id\&quot;: \&quot;principal-guid-2\&quot;,                 \&quot;principal_name\&quot;: \&quot;principal-name-2\&quot;,                 \&quot;principal_sub_type\&quot;: \&quot;principal-sub-type-2\&quot;,                 \&quot;object_privileges\&quot;: \&quot;[object-privilege-4]\&quot;               }             ]           }         ]       }     ] } &#x60;&#x60;&#x60;     
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchObjectPrivilegesTest() throws ApiException {
        FetchObjectPrivilegesRequest fetchObjectPrivilegesRequest = null;
        ObjectPrivilegesOfMetadataResponse response = api.fetchObjectPrivileges(fetchObjectPrivilegesRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.   #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the &#x60;type&#x60; and GUID or name of the principal. * To get permission details for a specific object, add the &#x60;type&#x60; and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.        
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchPermissionsOfPrincipalsTest() throws ApiException {
        FetchPermissionsOfPrincipalsRequest fetchPermissionsOfPrincipalsRequest = null;
        PermissionOfPrincipalsResponse response = api.fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify &#x60;type&#x60; and GUID or name of the metadata object. * To get permission details for a specific user or group, add &#x60;type&#x60; and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchPermissionsOnMetadataTest() throws ApiException {
        FetchPermissionsOnMetadataRequest fetchPermissionsOnMetadataRequest = null;
        PermissionOfMetadataResponse response = api.fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest);
        // TODO: test validations
    }

    /**
     *   Version: 26.3.0.cl or later   This API allows the addition or deletion of object level privileges for a set of users and groups, on a set of metadata objects. It provides users to access certain features based on privilege based access control.  #### Usage guidelines  - Specify the &#x60;operation&#x60;. The supported operations are: &#x60;ADD&#x60;, &#x60;REMOVE&#x60;. - Specify the type of the objects on which the object privileges are being provided in &#x60;metadata_type&#x60;. Only &#x60;LOGICAL_TABLE&#x60; metadata type is supported for now. It may be extended for other metadata types in future. - Specify the list of object privilege types in the &#x60;object_privilege_types&#x60; array. The supported object privilege types are: &#x60;SPOTTER_COACHING_PRIVILEGE&#x60;. - Specify the identifiers (either GUID or name) for the metadata objects in the &#x60;metadata_identifiers&#x60; array. - Specify the &#x60;type&#x60; (&#x60;USER&#x60; or &#x60;USER_GROUP&#x60;) and &#x60;identifier&#x60; (either GUID or name) of the principals to which you want to apply the given operation and given object privileges in the &#x60;principals&#x60; array. - Ensure using correct Authorization Bearer Token corresponding to specific user &amp; org.  #### Example request  &#x60;&#x60;&#x60;json {   \&quot;operation\&quot;: \&quot;operation-type\&quot;,   \&quot;metadata_type\&quot;: \&quot;metadata-type\&quot;,   \&quot;object_privilege_types\&quot;: [\&quot;privilege-type-1\&quot;, \&quot;privilege-type-2\&quot;],   \&quot;metadata_identifiers\&quot;: [\&quot;metadata-guid-or-name-1\&quot;, \&quot;metadata-guid-or-name-1\&quot;],   \&quot;principals\&quot;: [     {       \&quot;type\&quot;: \&quot;type-1\&quot;,        \&quot;identifier\&quot;: \&quot;principal-guid-or-name-1\&quot;     },     {       \&quot;type\&quot;: \&quot;type-2\&quot;,       \&quot;identifier\&quot;: \&quot;principal-guid-or-name-2\&quot;     }   ] } &#x60;&#x60;&#x60;  &gt; ###### Note: &gt; * Only admin users, users with edit access and users with coaching privilege on a given data-model can add or remove principals related to SPOTTER_COACHING_PRIVILEGE       
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void manageObjectPrivilegeTest() throws ApiException {
        ManageObjectPrivilegeRequest manageObjectPrivilegeRequest = null;
        api.manageObjectPrivilege(manageObjectPrivilegeRequest);
        // TODO: test validations
    }

    /**
     *  Version: 10.9.0.cl or later   Allows publishing metadata objects across organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows publishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  This API will essentially share the objects along with it&#39;s dependencies to the org admins of the orgs to which it is being published.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void publishMetadataTest() throws ApiException {
        PublishMetadataRequest publishMetadataRequest = null;
        api.publishMetadata(publishMetadataRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.0.0.cl or later   Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  #### Supported metadata objects: * Liveboards * Visualizations * Answers * Models * Views * Connections  #### Object permissions  You can provide &#x60;READ_ONLY&#x60; or &#x60;MODIFY&#x60; access when sharing an object with another user or group. The &#x60;READ_ONLY&#x60; permission grants view access to the shared object, whereas &#x60;MODIFY&#x60; provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set &#x60;shareMode&#x60; to &#x60;NO_ACCESS&#x60;.  #### Sharing a visualization  * Sharing a visualization implicitly shares the entire Liveboard with the recipient.   * Object permissions set for a shared visualization also apply to the Liveboard unless overridden by another API request or via UI. * If email notifications for object sharing are enabled, a notification with a link to the shared visualization will be sent to the recipient’s email address. Although this link opens the shared visualization, recipients can also access other visualizations in the Liveboard.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void shareMetadataTest() throws ApiException {
        ShareMetadataRequest shareMetadataRequest = null;
        api.shareMetadata(shareMetadataRequest);
        // TODO: test validations
    }

    /**
     *  Version: 10.9.0.cl or later   Allows unpublishing metadata objects from organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows unpublishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  When unpublishing objects, you can: * Include dependencies by setting &#x60;include_dependencies&#x60; to true - this will unpublish all dependent objects if no other published object is using them * Force unpublish by setting &#x60;force&#x60; to true - this will break all dependent objects in the unpublished organizations      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unpublishMetadataTest() throws ApiException {
        UnpublishMetadataRequest unpublishMetadataRequest = null;
        api.unpublishMetadata(unpublishMetadataRequest);
        // TODO: test validations
    }

    /**
     *  Version: 10.12.0.cl or later   Creates, updates, or deletes column security rules for specified tables.  This API endpoint allows you to create, update, or delete column-level security rules on columns of a table. The operation follows an \&quot;all or none\&quot; policy: if defining security rules for any of the provided columns fails, the entire operation will be rolled back, and no rules will be created.  #### Usage guidelines  - Provide table identifier using either &#x60;identifier&#x60; (GUID or name) or &#x60;obj_identifier&#x60; (object ID) - Use &#x60;clear_csr: true&#x60; to remove all column security rules from the table - For each column, specify the security rule using &#x60;column_security_rules&#x60; array - Use &#x60;is_unsecured: true&#x60; to mark a specific column as unprotected - Use &#x60;group_access&#x60; operations to manage group associations:   - &#x60;ADD&#x60;: Add groups to the column&#39;s access list   - &#x60;REMOVE&#x60;: Remove groups from the column&#39;s access list   - &#x60;REPLACE&#x60;: Replace all existing groups with the specified groups  #### Required permissions  - &#x60;ADMINISTRATION&#x60; - Can administer ThoughtSpot - &#x60;DATAMANAGEMENT&#x60; - Can manage data (if RBAC is disabled) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; - Can manage worksheet views and tables (if RBAC is enabled)  #### Example request  &#x60;&#x60;&#x60;json {   \&quot;identifier\&quot;: \&quot;table-guid\&quot;,   \&quot;obj_identifier\&quot;: \&quot;table-object-id\&quot;,   \&quot;clear_csr\&quot;: false,   \&quot;column_security_rules\&quot;: [     {       \&quot;column_identifier\&quot;: \&quot;col id or col name\&quot;,       \&quot;is_unsecured\&quot;: false,       \&quot;group_access\&quot;: [         {           \&quot;operation\&quot;: \&quot;ADD\&quot;,           \&quot;group_identifiers\&quot;: [\&quot;hr_group_id\&quot;, \&quot;hr_group_name\&quot;, \&quot;finance_group_id\&quot;]         }       ]     },     {       \&quot;column_identifier\&quot;: \&quot;col id or col name\&quot;,       \&quot;is_unsecured\&quot;: true     },     {       \&quot;column_identifier\&quot;: \&quot;col id or col name\&quot;,       \&quot;is_unsecured\&quot;: false,       \&quot;group_access\&quot;: [         {           \&quot;operation\&quot;: \&quot;REPLACE\&quot;,           \&quot;group_identifiers\&quot;: [\&quot;management_group_id\&quot;, \&quot;management_group_name\&quot;]         }       ]     }   ] } &#x60;&#x60;&#x60;  #### Request Body Schema  - &#x60;identifier&#x60; (string, optional): GUID or name of the table for which we want to create column security rules - &#x60;obj_identifier&#x60; (string, optional): The object ID of the table - &#x60;clear_csr&#x60; (boolean, optional): If true, then all the secured columns will be marked as unprotected, and all the group associations will be removed - &#x60;column_security_rules&#x60; (array of objects, required): An array where each object defines the security rule for a specific column  Each column security rule object contains: - &#x60;column_identifier&#x60; (string, required): Column identifier (col_id or name) - &#x60;is_unsecured&#x60; (boolean, optional): If true, the column will be marked as unprotected and all groups associated with it will be removed - &#x60;group_access&#x60; (array of objects, optional): Array of group operation objects  Each group operation object contains: - &#x60;operation&#x60; (string, required): Operation type - ADD, REMOVE, or REPLACE - &#x60;group_identifiers&#x60; (array of strings, required): Array of group identifiers (name or GUID) on which the operation will be performed  #### Response  This API does not return any response body. A successful operation returns HTTP 200 status code.  #### Operation Types  - **ADD**: Adds the specified groups to the column&#39;s access list - **REMOVE**: Removes the specified groups from the column&#39;s access list   - **REPLACE**: Replaces all existing groups with the specified groups      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateColumnSecurityRulesTest() throws ApiException {
        UpdateColumnSecurityRulesRequest updateColumnSecurityRulesRequest = null;
        api.updateColumnSecurityRules(updateColumnSecurityRulesRequest);
        // TODO: test validations
    }

}
