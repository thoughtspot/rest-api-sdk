import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { ExportAnswerReportRequest } from '../models/ExportAnswerReportRequest';
import { ExportLiveboardReportRequest } from '../models/ExportLiveboardReportRequest';
export declare class ReportsApiRequestFactory extends BaseAPIRequestFactory {
    exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Promise<RequestContext>;
    exportLiveboardReport(exportLiveboardReportRequest: ExportLiveboardReportRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class ReportsApiResponseProcessor {
    exportAnswerReport(response: ResponseContext): Promise<void>;
    exportLiveboardReport(response: ResponseContext): Promise<void>;
}
