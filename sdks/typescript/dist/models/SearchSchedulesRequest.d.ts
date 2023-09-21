import { MetadataInput } from '../models/MetadataInput';
import { ScheduleHistoryRunsOptionsInput } from '../models/ScheduleHistoryRunsOptionsInput';
import { SortingOptions } from '../models/SortingOptions';
export declare class SearchSchedulesRequest {
    'metadata'?: Array<MetadataInput>;
    'record_offset'?: number;
    'record_size'?: number;
    'sort_options'?: SortingOptions;
    'history_runs_options'?: ScheduleHistoryRunsOptionsInput;
    'schedule_identifiers'?: Array<string>;
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
