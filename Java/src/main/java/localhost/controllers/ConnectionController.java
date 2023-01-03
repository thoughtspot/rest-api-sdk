/*
 * ThoughtSpotPublicRESTAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import localhost.ApiHelper;
import localhost.Server;
import localhost.exceptions.ApiException;
import localhost.exceptions.ErrorResponseException;
import localhost.http.request.HttpMethod;
import localhost.models.ConnectionResponse;
import localhost.models.ConnectionTableColumnsResponse;
import localhost.models.ConnectionTableResponse;
import localhost.models.CreateConnectionResponse;
import localhost.models.TspublicRestV2ConnectionAddtableRequest;
import localhost.models.TspublicRestV2ConnectionCreateRequest;
import localhost.models.TspublicRestV2ConnectionRemovetableRequest;
import localhost.models.TspublicRestV2ConnectionSearchRequest;
import localhost.models.TspublicRestV2ConnectionTableRequest;
import localhost.models.TspublicRestV2ConnectionTablecoloumnRequest;
import localhost.models.TspublicRestV2ConnectionUpdateRequest;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ConnectionController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ConnectionController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * To get the details of a specific connection use this endpoint.
     * @param  id  Required parameter: The GUID of the connection to query
     * @return    Returns the ConnectionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ConnectionResponse restapiV2GetConnection(
            final String id) throws ApiException, IOException {
        return prepareRestapiV2GetConnectionRequest(id).execute();
    }

    /**
     * To get the details of a specific connection use this endpoint.
     * @param  id  Required parameter: The GUID of the connection to query
     * @return    Returns the ConnectionResponse response from the API call
     */
    public CompletableFuture<ConnectionResponse> restapiV2GetConnectionAsync(
            final String id) {
        try { 
            return prepareRestapiV2GetConnectionRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2GetConnection.
     */
    private ApiCall<ConnectionResponse, ApiException> prepareRestapiV2GetConnectionRequest(
            final String id) throws IOException {
        return new ApiCall.Builder<ConnectionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/connection")
                        .queryParam(param -> param.key("id")
                                .value(id))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ConnectionResponse.class))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
    }

    /**
     * To get the list of databases for a connection, use this endpoint. The response will include
     * databases from the data platform corresponding to the connection id provided.
     * @param  id  Required parameter: The GUID of the connection
     * @return    Returns the List of String response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<String> restapiV2GetConnectionDatabase(
            final String id) throws ApiException, IOException {
        return prepareRestapiV2GetConnectionDatabaseRequest(id).execute();
    }

    /**
     * To get the list of databases for a connection, use this endpoint. The response will include
     * databases from the data platform corresponding to the connection id provided.
     * @param  id  Required parameter: The GUID of the connection
     * @return    Returns the List of String response from the API call
     */
    public CompletableFuture<List<String>> restapiV2GetConnectionDatabaseAsync(
            final String id) {
        try { 
            return prepareRestapiV2GetConnectionDatabaseRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2GetConnectionDatabase.
     */
    private ApiCall<List<String>, ApiException> prepareRestapiV2GetConnectionDatabaseRequest(
            final String id) throws IOException {
        return new ApiCall.Builder<List<String>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/connection/database")
                        .queryParam(param -> param.key("id")
                                .value(id))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        String[].class))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
    }

    /**
     * To programmatically create a connection in the ThoughtSpot system use this API endpoint.
     * Using this API, you can create a connection and assign groups. To create a connection, you
     * require admin connection privileges. All connections created in the ThoughtSpot system are
     * added to ALL_GROUP.
     * @param  body  Required parameter: Example:
     * @return    Returns the CreateConnectionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CreateConnectionResponse restapiV2CreateConnection(
            final TspublicRestV2ConnectionCreateRequest body) throws ApiException, IOException {
        return prepareRestapiV2CreateConnectionRequest(body).execute();
    }

    /**
     * To programmatically create a connection in the ThoughtSpot system use this API endpoint.
     * Using this API, you can create a connection and assign groups. To create a connection, you
     * require admin connection privileges. All connections created in the ThoughtSpot system are
     * added to ALL_GROUP.
     * @param  body  Required parameter: Example:
     * @return    Returns the CreateConnectionResponse response from the API call
     */
    public CompletableFuture<CreateConnectionResponse> restapiV2CreateConnectionAsync(
            final TspublicRestV2ConnectionCreateRequest body) {
        try { 
            return prepareRestapiV2CreateConnectionRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2CreateConnection.
     */
    private ApiCall<CreateConnectionResponse, ApiException> prepareRestapiV2CreateConnectionRequest(
            final TspublicRestV2ConnectionCreateRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<CreateConnectionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/connection/create")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CreateConnectionResponse.class))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
    }

    /**
     * You can use this endpoint to programmatically modify an existing connection To modify a
     * connection, you require admin connection privileges. At least one of Connection Id or
     * connectionname is mandatory. When both are given, then connection id will be considered and
     * connectionname will be updated.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean restapiV2UpdateConnection(
            final TspublicRestV2ConnectionUpdateRequest body) throws ApiException, IOException {
        return prepareRestapiV2UpdateConnectionRequest(body).execute();
    }

    /**
     * You can use this endpoint to programmatically modify an existing connection To modify a
     * connection, you require admin connection privileges. At least one of Connection Id or
     * connectionname is mandatory. When both are given, then connection id will be considered and
     * connectionname will be updated.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> restapiV2UpdateConnectionAsync(
            final TspublicRestV2ConnectionUpdateRequest body) {
        try { 
            return prepareRestapiV2UpdateConnectionRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2UpdateConnection.
     */
    private ApiCall<Boolean, ApiException> prepareRestapiV2UpdateConnectionRequest(
            final TspublicRestV2ConnectionUpdateRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Boolean, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/connection/update")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> Boolean.parseBoolean(response))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
    }

    /**
     * To remove a connection from the ThoughtSpot system, use this endpoint.
     * @param  id  Required parameter: A JSON array of GUIDs of the connection
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean restapiV2DeleteConnection(
            final List<String> id) throws ApiException, IOException {
        return prepareRestapiV2DeleteConnectionRequest(id).execute();
    }

    /**
     * To remove a connection from the ThoughtSpot system, use this endpoint.
     * @param  id  Required parameter: A JSON array of GUIDs of the connection
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> restapiV2DeleteConnectionAsync(
            final List<String> id) {
        try { 
            return prepareRestapiV2DeleteConnectionRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2DeleteConnection.
     */
    private ApiCall<Boolean, ApiException> prepareRestapiV2DeleteConnectionRequest(
            final List<String> id) throws IOException {
        return new ApiCall.Builder<Boolean, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/connection/delete")
                        .queryParam(param -> param.key("id")
                                .value(id))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> Boolean.parseBoolean(response))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
    }

    /**
     * To programmatically add table to an existing connection use this endpoint. When you assign
     * groups to a connection, the connection inherits the privileges assigned to those groups. At
     * least one of Connection Id or connectionname is mandatory. When both are given, then
     * connection id will be considered.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean restapiV2AddTableToConnection(
            final TspublicRestV2ConnectionAddtableRequest body) throws ApiException, IOException {
        return prepareRestapiV2AddTableToConnectionRequest(body).execute();
    }

    /**
     * To programmatically add table to an existing connection use this endpoint. When you assign
     * groups to a connection, the connection inherits the privileges assigned to those groups. At
     * least one of Connection Id or connectionname is mandatory. When both are given, then
     * connection id will be considered.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> restapiV2AddTableToConnectionAsync(
            final TspublicRestV2ConnectionAddtableRequest body) {
        try { 
            return prepareRestapiV2AddTableToConnectionRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2AddTableToConnection.
     */
    private ApiCall<Boolean, ApiException> prepareRestapiV2AddTableToConnectionRequest(
            final TspublicRestV2ConnectionAddtableRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Boolean, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/connection/addtable")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> Boolean.parseBoolean(response))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
    }

    /**
     * To programmatically remove a table from a connection use API endpoint. The API removes only
     * the connection association. It does not delete the connection or group from the Thoughtspot
     * system. At least one of id or name of connection is required. When both are given connection
     * id will be considered.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean restapiV2RemoveTableFromConnection(
            final TspublicRestV2ConnectionRemovetableRequest body) throws ApiException, IOException {
        return prepareRestapiV2RemoveTableFromConnectionRequest(body).execute();
    }

    /**
     * To programmatically remove a table from a connection use API endpoint. The API removes only
     * the connection association. It does not delete the connection or group from the Thoughtspot
     * system. At least one of id or name of connection is required. When both are given connection
     * id will be considered.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> restapiV2RemoveTableFromConnectionAsync(
            final TspublicRestV2ConnectionRemovetableRequest body) {
        try { 
            return prepareRestapiV2RemoveTableFromConnectionRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2RemoveTableFromConnection.
     */
    private ApiCall<Boolean, ApiException> prepareRestapiV2RemoveTableFromConnectionRequest(
            final TspublicRestV2ConnectionRemovetableRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Boolean, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/connection/removetable")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> Boolean.parseBoolean(response))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
    }

    /**
     * To get the details of a specific connection or all connections in the ThoughtSpot system use
     * this end point.
     * @param  body  Required parameter: Example:
     * @return    Returns the List of ConnectionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<ConnectionResponse> restapiV2SearchConnection(
            final TspublicRestV2ConnectionSearchRequest body) throws ApiException, IOException {
        return prepareRestapiV2SearchConnectionRequest(body).execute();
    }

    /**
     * To get the details of a specific connection or all connections in the ThoughtSpot system use
     * this end point.
     * @param  body  Required parameter: Example:
     * @return    Returns the List of ConnectionResponse response from the API call
     */
    public CompletableFuture<List<ConnectionResponse>> restapiV2SearchConnectionAsync(
            final TspublicRestV2ConnectionSearchRequest body) {
        try { 
            return prepareRestapiV2SearchConnectionRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2SearchConnection.
     */
    private ApiCall<List<ConnectionResponse>, ApiException> prepareRestapiV2SearchConnectionRequest(
            final TspublicRestV2ConnectionSearchRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<List<ConnectionResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/connection/search")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        ConnectionResponse[].class))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
    }

    /**
     * To get the details of tables from a connection, use this endpoint. You can get the details of
     * tables in the data platform for the connection id provided.
     * @param  body  Required parameter: Example:
     * @return    Returns the ConnectionTableResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ConnectionTableResponse restapiV2GetConnectionTables(
            final TspublicRestV2ConnectionTableRequest body) throws ApiException, IOException {
        return prepareRestapiV2GetConnectionTablesRequest(body).execute();
    }

    /**
     * To get the details of tables from a connection, use this endpoint. You can get the details of
     * tables in the data platform for the connection id provided.
     * @param  body  Required parameter: Example:
     * @return    Returns the ConnectionTableResponse response from the API call
     */
    public CompletableFuture<ConnectionTableResponse> restapiV2GetConnectionTablesAsync(
            final TspublicRestV2ConnectionTableRequest body) {
        try { 
            return prepareRestapiV2GetConnectionTablesRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2GetConnectionTables.
     */
    private ApiCall<ConnectionTableResponse, ApiException> prepareRestapiV2GetConnectionTablesRequest(
            final TspublicRestV2ConnectionTableRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ConnectionTableResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/connection/table")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ConnectionTableResponse.class))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
    }

    /**
     * To get the details of columns in a table associated to a connection, use this endpoint. You
     * can get the columns of any table available in the data platform for the connection id
     * provided.
     * @param  body  Required parameter: Example:
     * @return    Returns the ConnectionTableColumnsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ConnectionTableColumnsResponse restapiV2GetConnectionTableColumns(
            final TspublicRestV2ConnectionTablecoloumnRequest body) throws ApiException, IOException {
        return prepareRestapiV2GetConnectionTableColumnsRequest(body).execute();
    }

    /**
     * To get the details of columns in a table associated to a connection, use this endpoint. You
     * can get the columns of any table available in the data platform for the connection id
     * provided.
     * @param  body  Required parameter: Example:
     * @return    Returns the ConnectionTableColumnsResponse response from the API call
     */
    public CompletableFuture<ConnectionTableColumnsResponse> restapiV2GetConnectionTableColumnsAsync(
            final TspublicRestV2ConnectionTablecoloumnRequest body) {
        try { 
            return prepareRestapiV2GetConnectionTableColumnsRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2GetConnectionTableColumns.
     */
    private ApiCall<ConnectionTableColumnsResponse, ApiException> prepareRestapiV2GetConnectionTableColumnsRequest(
            final TspublicRestV2ConnectionTablecoloumnRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ConnectionTableColumnsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/connection/tablecoloumn")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ConnectionTableColumnsResponse.class))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
    }
}