export declare class DeployResponse {
    'file_name'?: string;
    'metadata_name'?: string;
    'metadata_type'?: string;
    'status_code'?: string;
    'status_message'?: string;
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
