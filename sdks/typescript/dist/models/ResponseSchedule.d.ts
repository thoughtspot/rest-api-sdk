import { Author } from '../models/Author';
import { Frequency } from '../models/Frequency';
import { LiveboardOptions } from '../models/LiveboardOptions';
import { MetadataResponse } from '../models/MetadataResponse';
import { PdfOptions } from '../models/PdfOptions';
import { RecipientDetails } from '../models/RecipientDetails';
import { ResponseScheduleRun } from '../models/ResponseScheduleRun';
export declare class ResponseSchedule {
    'author': Author;
    'creationTimeInMillis': any;
    'description'?: string;
    'fileFormat': string;
    'frequency': Frequency;
    'id': string;
    'liveboardOptions'?: LiveboardOptions;
    'metadata': MetadataResponse;
    'name': string;
    'pdfOptions'?: PdfOptions;
    'recipientDetails'?: RecipientDetails;
    'status'?: string;
    'timeZone': string;
    'historyRuns'?: Array<ResponseScheduleRun>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
