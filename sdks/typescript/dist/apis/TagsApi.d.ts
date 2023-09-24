import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { AssignTagRequest } from '../models/AssignTagRequest';
import { CreateTagRequest } from '../models/CreateTagRequest';
import { SearchTagsRequest } from '../models/SearchTagsRequest';
import { Tag } from '../models/Tag';
import { UpdateTagRequest } from '../models/UpdateTagRequest';
export declare class TagsApiRequestFactory extends BaseAPIRequestFactory {
    assignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<RequestContext>;
    createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Promise<RequestContext>;
    deleteTag(tagIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    searchTags(searchTagsRequest?: SearchTagsRequest, _options?: Configuration): Promise<RequestContext>;
    unassignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<RequestContext>;
    updateTag(tagIdentifier: string, updateTagRequest?: UpdateTagRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class TagsApiResponseProcessor {
    assignTag(response: ResponseContext): Promise<void>;
    createTag(response: ResponseContext): Promise<Tag>;
    deleteTag(response: ResponseContext): Promise<void>;
    searchTags(response: ResponseContext): Promise<Array<Tag>>;
    unassignTag(response: ResponseContext): Promise<void>;
    updateTag(response: ResponseContext): Promise<void>;
}
