import { FrequencyInput } from '../models/FrequencyInput';
import { LiveboardOptionsInput } from '../models/LiveboardOptionsInput';
import { RecipientDetailsInput } from '../models/RecipientDetailsInput';
import { SchedulesPdfOptionsInput } from '../models/SchedulesPdfOptionsInput';
export declare class UpdateScheduleRequest {
    'name'?: string;
    'description'?: string;
    'metadataType'?: UpdateScheduleRequestMetadataTypeEnum;
    'metadataIdentifier'?: string;
    'fileFormat'?: UpdateScheduleRequestFileFormatEnum;
    'liveboardOptions'?: LiveboardOptionsInput;
    'pdfOptions'?: SchedulesPdfOptionsInput;
    'timeZone'?: string;
    'frequency'?: FrequencyInput;
    'recipientDetails'?: RecipientDetailsInput;
    'status'?: UpdateScheduleRequestStatusEnum;
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
export type UpdateScheduleRequestMetadataTypeEnum = "LIVEBOARD";
export type UpdateScheduleRequestFileFormatEnum = "CSV" | "PDF";
export type UpdateScheduleRequestStatusEnum = "ACTIVE" | "PAUSE";
