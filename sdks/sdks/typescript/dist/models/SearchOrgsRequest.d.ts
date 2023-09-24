export declare class SearchOrgsRequest {
    'org_identifier'?: string;
    'description'?: string;
    'visibility'?: SearchOrgsRequestVisibilityEnum;
    'status'?: SearchOrgsRequestStatusEnum;
    'user_identifiers'?: Array<string>;
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
export type SearchOrgsRequestVisibilityEnum = "SHOW" | "HIDDEN";
export type SearchOrgsRequestStatusEnum = "ACTIVE" | "IN_ACTIVE";
