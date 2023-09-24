import { Authentication } from '../models/Authentication';
import { ParametersListItem } from '../models/ParametersListItem';
export declare class URL {
    'authentication'?: Authentication;
    'parameters'?: Array<ParametersListItem>;
    'url': string;
    'reference'?: string;
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
