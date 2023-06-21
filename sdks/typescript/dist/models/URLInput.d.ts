import { AuthenticationInput } from '../models/AuthenticationInput';
import { ParametersListItemInput } from '../models/ParametersListItemInput';
export declare class URLInput {
    'authentication'?: AuthenticationInput;
    'parameters'?: Array<ParametersListItemInput>;
    'url': string;
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
