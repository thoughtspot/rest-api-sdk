import { CALLBACK } from '../models/CALLBACK';
import { URL } from '../models/URL';
export declare class ActionDetails {
    'CALLBACK'?: CALLBACK;
    'URL'?: URL;
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
