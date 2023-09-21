import { ModelTableList } from '../models/ModelTableList';
export declare class GenerateTmlRequest {
    'dbt_connection_identifier': string;
    'model_tables': Array<ModelTableList>;
    'import_worksheets': GenerateTmlRequestImportWorksheetsEnum;
    'worksheets'?: Array<string>;
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
export type GenerateTmlRequestImportWorksheetsEnum = "ALL" | "NONE" | "SELECTED";
