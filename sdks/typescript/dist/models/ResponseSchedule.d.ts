import { Author } from '../models/Author';
import { Frequency } from '../models/Frequency';
import { LiveboardOptions } from '../models/LiveboardOptions';
import { MetadataResponse } from '../models/MetadataResponse';
import { PdfOptions } from '../models/PdfOptions';
import { RecipientDetails } from '../models/RecipientDetails';
import { ResponseScheduleRun } from '../models/ResponseScheduleRun';
export declare class ResponseSchedule {
    'author': Author;
    'creation_time_in_millis': any;
    'description'?: string;
    'file_format': string;
    'frequency': Frequency;
    'id': string;
    'liveboard_options'?: LiveboardOptions;
    'metadata': MetadataResponse;
    'name': string;
    'pdf_options'?: PdfOptions;
    'recipient_details': RecipientDetails;
    'status'?: string;
    'time_zone': string;
    'history_runs'?: Array<ResponseScheduleRun>;
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
