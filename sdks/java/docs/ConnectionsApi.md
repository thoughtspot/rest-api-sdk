# ConnectionsApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConnection**](ConnectionsApi.md#createConnection) | **POST** /api/rest/2.0/connection/create |  |
| [**deleteConnection**](ConnectionsApi.md#deleteConnection) | **POST** /api/rest/2.0/connection/delete |  |
| [**downloadConnectionMetadataChanges**](ConnectionsApi.md#downloadConnectionMetadataChanges) | **POST** /api/rest/2.0/connections/download-connection-metadata-changes/{connection_identifier} |  |
| [**fetchConnectionDiffStatus**](ConnectionsApi.md#fetchConnectionDiffStatus) | **POST** /api/rest/2.0/connections/fetch-connection-diff-status/{connection_identifier} |  |
| [**searchConnection**](ConnectionsApi.md#searchConnection) | **POST** /api/rest/2.0/connection/search |  |
| [**updateConnection**](ConnectionsApi.md#updateConnection) | **POST** /api/rest/2.0/connection/update |  |


<a id="createConnection"></a>
# **createConnection**
> CreateConnectionResponse createConnection(createConnectionRequest)



  Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.    Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in &#x60;data_warehouse_config&#x60;. The following example shows the configuration attributes for a SnowFlake connection:   &#x60;&#x60;&#x60;   {      \&quot;configuration\&quot;:{         \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,         \&quot;user\&quot;:\&quot;tsadmin\&quot;,         \&quot;password\&quot;:\&quot;TestConn123\&quot;,         \&quot;role\&quot;:\&quot;sysadmin\&quot;,         \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot;      },      \&quot;externalDatabases\&quot;:[       ]   }   &#x60;&#x60;&#x60; 2. Set &#x60;validate&#x60; to &#x60;false&#x60;.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in &#x60;data_warehouse_config&#x60; as shown in the following example:   &#x60;&#x60;&#x60;   {      \&quot;configuration\&quot;:{         \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,         \&quot;user\&quot;:\&quot;tsadmin\&quot;,         \&quot;password\&quot;:\&quot;TestConn123\&quot;,         \&quot;role\&quot;:\&quot;sysadmin\&quot;,         \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot;      },      \&quot;externalDatabases\&quot;:[         {            \&quot;name\&quot;:\&quot;AllDatatypes\&quot;,            \&quot;isAutoCreated\&quot;:false,            \&quot;schemas\&quot;:[               {                  \&quot;name\&quot;:\&quot;alldatatypes\&quot;,                  \&quot;tables\&quot;:[                     {                        \&quot;name\&quot;:\&quot;allDatatypes\&quot;,                        \&quot;type\&quot;:\&quot;TABLE\&quot;,                        \&quot;description\&quot;:\&quot;\&quot;,                        \&quot;selected\&quot;:true,                        \&quot;linked\&quot;:true,                        \&quot;columns\&quot;:[                           {                              \&quot;name\&quot;:\&quot;CNUMBER\&quot;,                              \&quot;type\&quot;:\&quot;INT64\&quot;,                              \&quot;canImport\&quot;:true,                              \&quot;selected\&quot;:true,                              \&quot;isLinkedActive\&quot;:true,                              \&quot;isImported\&quot;:false,                              \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,                              \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,                              \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot;                           },                           {                              \&quot;name\&quot;:\&quot;CDECIMAL\&quot;,                              \&quot;type\&quot;:\&quot;INT64\&quot;,                              \&quot;canImport\&quot;:true,                              \&quot;selected\&quot;:true,                              \&quot;isLinkedActive\&quot;:true,                              \&quot;isImported\&quot;:false,                              \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,                              \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,                              \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot;                           }                        ]                     }                  ]               }            ]         }      ]   }   &#x60;&#x60;&#x60; 2. Set &#x60;validate&#x60; to &#x60;true&#x60;.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    CreateConnectionRequest createConnectionRequest = new CreateConnectionRequest(); // CreateConnectionRequest | 
    try {
      CreateConnectionResponse result = apiInstance.createConnection(createConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#createConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createConnectionRequest** | [**CreateConnectionRequest**](CreateConnectionRequest.md)|  | |

### Return type

[**CreateConnectionResponse**](CreateConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Connection to the datasource successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="deleteConnection"></a>
# **deleteConnection**
> deleteConnection(deleteConnectionRequest)



  Version: 9.2.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    DeleteConnectionRequest deleteConnectionRequest = new DeleteConnectionRequest(); // DeleteConnectionRequest | 
    try {
      apiInstance.deleteConnection(deleteConnectionRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#deleteConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteConnectionRequest** | [**DeleteConnectionRequest**](DeleteConnectionRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Connection successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="downloadConnectionMetadataChanges"></a>
# **downloadConnectionMetadataChanges**
> Object downloadConnectionMetadataChanges(connectionIdentifier)



  Version: 9.9.0.cl or later   Exports the difference in connection metadata between CDW and ThoughtSpot  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege  To download the connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as &#x60;connection_identifier&#x60; in the API request.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    String connectionIdentifier = "connectionIdentifier_example"; // String | GUID of the connection
    try {
      Object result = apiInstance.downloadConnectionMetadataChanges(connectionIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#downloadConnectionMetadataChanges");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionIdentifier** | **String**| GUID of the connection | |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Export metadata changes. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="fetchConnectionDiffStatus"></a>
# **fetchConnectionDiffStatus**
> FetchConnectionDiffStatusResponse fetchConnectionDiffStatus(connectionIdentifier)



  Version: 9.9.0.cl or later   Validates the difference in connection metadata between CDW and ThoughtSpot  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege  Returns a boolean indicating whether there is any difference between the connection metadata at ThoughtSpot and CDW.  To get the connection metadata difference status, pass the connection GUID as &#x60;connection_identifier&#x60; in the API request.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    String connectionIdentifier = "connectionIdentifier_example"; // String | GUID of the connection
    try {
      FetchConnectionDiffStatusResponse result = apiInstance.fetchConnectionDiffStatus(connectionIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#fetchConnectionDiffStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionIdentifier** | **String**| GUID of the connection | |

### Return type

[**FetchConnectionDiffStatusResponse**](FetchConnectionDiffStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | true/false |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="searchConnection"></a>
# **searchConnection**
> List&lt;SearchConnectionResponse&gt; searchConnection(searchConnectionRequest)



  Version: 9.2.0.cl or later   Gets connection objects. Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in &#x60;data_warehouse_types&#x60;. - To fetch details of a connection object, specify the connection object GUID or name. The &#x60;name_pattern&#x60; attribute allows passing partial text with &#x60;%&#x60; for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify &#x60;data_warehouse_object_type&#x60;. - To get a specific database, schema, table, or column from a connection object, define the object type in &#x60;data_warehouse_object_type&#x60; and object properties in the &#x60;data_warehouse_objects&#x60; array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (&#x60;database&#x60; &gt; &#x60;schema&#x60; &gt; &#x60;table&#x60; &gt; &#x60;column&#x60;).  &#x60;&#x60;&#x60; {   \&quot;connections\&quot;: [     {       \&quot;identifier\&quot;: \&quot;b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\&quot;,       \&quot;data_warehouse_objects\&quot;: [         {           \&quot;database\&quot;: \&quot;NEBULADEV\&quot;,           \&quot;schema\&quot;: \&quot;INFORMATION_SCHEMA\&quot;,           \&quot;table\&quot;: \&quot;APPLICABLE_ROLES\&quot;,           \&quot;column\&quot;: \&quot;ROLE_NAME\&quot;         }       ]     }   ],   \&quot;data_warehouse_object_type\&quot;: \&quot;COLUMN\&quot; } &#x60;&#x60;&#x60;  - To fetch data by &#x60;configuration&#x60;, specify &#x60;data_warehouse_object_type&#x60;. For example, to fetch columns from the &#x60;DEVELOPMENT&#x60; database, specify the &#x60;data_warehouse_object_type&#x60; as &#x60;DATABASE&#x60; and define the &#x60;configuration&#x60; string as &#x60;{\&quot;database\&quot;:\&quot;DEVELOPMENT\&quot;}&#x60;. To get column data for a specific table, specify the table, for example,&#x60;{\&quot;database\&quot;:\&quot;RETAILAPPAREL\&quot;,\&quot;table\&quot;:\&quot;PIPES\&quot;}&#x60;. - To query connections by &#x60;authentication_type&#x60;, specify &#x60;data_warehouse_object_type&#x60;. Supported values for &#x60;authentication_type&#x60; are:   - &#x60;SERVICE_ACCOUNT&#x60;: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - &#x60;OAUTH&#x60;: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - &#x60;IAM&#x60;: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - &#x60;EXTOAUTH&#x60;: For connections that have external OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). - To include more details about connection objects in the API response, set &#x60;include_details&#x60; to &#x60;true&#x60;. - You can also sort the output by field names and filter connections by tags.  **NOTE**: When filtering connection records by parameters other than &#x60;data_warehouse_types&#x60; or &#x60;tag_identifiers&#x60;, ensure that you set &#x60;record_size&#x60; to &#x60;-1&#x60; and &#x60;record_offset&#x60; to &#x60;0&#x60; for precise results.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    SearchConnectionRequest searchConnectionRequest = new SearchConnectionRequest(); // SearchConnectionRequest | 
    try {
      List<SearchConnectionResponse> result = apiInstance.searchConnection(searchConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#searchConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **searchConnectionRequest** | [**SearchConnectionRequest**](SearchConnectionRequest.md)|  | |

### Return type

[**List&lt;SearchConnectionResponse&gt;**](SearchConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of connections to the datasource. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

<a id="updateConnection"></a>
# **updateConnection**
> updateConnection(updateConnectionRequest)



  Version: 9.2.0.cl or later   Updates a connection object.    Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in &#x60;data_warehouse_config&#x60;.    b. Set &#x60;validate&#x60; to &#x60;true&#x60;. 3. If you are updating a configuration attribute, connection name, or description, you can set &#x60;validate&#x60; to &#x60;false&#x60;.      

### Example
```java
// Import classes:
import org.thoughtspot.client.ApiClient;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Configuration;
import org.thoughtspot.client.auth.*;
import org.thoughtspot.client.models.*;
import org.thoughtspot.client.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:443");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    UpdateConnectionRequest updateConnectionRequest = new UpdateConnectionRequest(); // UpdateConnectionRequest | 
    try {
      apiInstance.updateConnection(updateConnectionRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#updateConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateConnectionRequest** | [**UpdateConnectionRequest**](UpdateConnectionRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Connection successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

