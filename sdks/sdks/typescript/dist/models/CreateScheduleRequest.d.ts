import { FrequencyInput } from '../models/FrequencyInput';
import { LiveboardOptionsInput } from '../models/LiveboardOptionsInput';
import { RecipientDetailsInput } from '../models/RecipientDetailsInput';
import { SchedulesPdfOptionsInput } from '../models/SchedulesPdfOptionsInput';
export declare class CreateScheduleRequest {
    'name': string;
    'description': string;
    'metadataType': CreateScheduleRequestMetadataTypeEnum;
    'metadataIdentifier': string;
    'fileFormat'?: CreateScheduleRequestFileFormatEnum;
    'liveboardOptions'?: LiveboardOptionsInput;
    'pdfOptions'?: SchedulesPdfOptionsInput;
    'timeZone': string;
    'frequency'?: FrequencyInput;
    'recipientDetails': RecipientDetailsInput;
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
export type CreateScheduleRequestMetadataTypeEnum = "LIVEBOARD";
export type CreateScheduleRequestFileFormatEnum = "CSV" | "PDF";
