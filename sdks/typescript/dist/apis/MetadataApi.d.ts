import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { DeleteMetadataRequest } from '../models/DeleteMetadataRequest';
import { ExportMetadataTMLRequest } from '../models/ExportMetadataTMLRequest';
import { FetchAnswerSqlQueryRequest } from '../models/FetchAnswerSqlQueryRequest';
import { FetchLiveboardSqlQueryRequest } from '../models/FetchLiveboardSqlQueryRequest';
import { ImportMetadataTMLRequest } from '../models/ImportMetadataTMLRequest';
import { MetadataSearchResponse } from '../models/MetadataSearchResponse';
import { SearchMetadataRequest } from '../models/SearchMetadataRequest';
import { SqlQueryResponse } from '../models/SqlQueryResponse';
export declare class MetadataApiRequestFactory extends BaseAPIRequestFactory {
    deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Promise<RequestContext>;
    exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Promise<RequestContext>;
    fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Promise<RequestContext>;
    fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Promise<RequestContext>;
    importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Promise<RequestContext>;
    searchMetadata(searchMetadataRequest?: SearchMetadataRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class MetadataApiResponseProcessor {
    deleteMetadata(response: ResponseContext): Promise<void>;
    exportMetadataTML(response: ResponseContext): Promise<Array<any>>;
    fetchAnswerSqlQuery(response: ResponseContext): Promise<SqlQueryResponse>;
    fetchLiveboardSqlQuery(response: ResponseContext): Promise<SqlQueryResponse>;
    importMetadataTML(response: ResponseContext): Promise<Array<any>>;
    searchMetadata(response: ResponseContext): Promise<Array<MetadataSearchResponse>>;
}
