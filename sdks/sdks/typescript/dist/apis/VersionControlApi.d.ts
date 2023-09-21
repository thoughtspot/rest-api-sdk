import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { CommitBranchRequest } from '../models/CommitBranchRequest';
import { CommitHistoryResponse } from '../models/CommitHistoryResponse';
import { CommitResponse } from '../models/CommitResponse';
import { CreateConfigRequest } from '../models/CreateConfigRequest';
import { DeleteConfigRequest } from '../models/DeleteConfigRequest';
import { DeployCommitRequest } from '../models/DeployCommitRequest';
import { DeployResponse } from '../models/DeployResponse';
import { RepoConfigObject } from '../models/RepoConfigObject';
import { RevertCommitRequest } from '../models/RevertCommitRequest';
import { RevertResponse } from '../models/RevertResponse';
import { SearchCommitsRequest } from '../models/SearchCommitsRequest';
import { SearchConfigRequest } from '../models/SearchConfigRequest';
import { UpdateConfigRequest } from '../models/UpdateConfigRequest';
import { ValidateMergeRequest } from '../models/ValidateMergeRequest';
export declare class VersionControlApiRequestFactory extends BaseAPIRequestFactory {
    commitBranch(commitBranchRequest: CommitBranchRequest, _options?: Configuration): Promise<RequestContext>;
    createConfig(createConfigRequest: CreateConfigRequest, _options?: Configuration): Promise<RequestContext>;
    deleteConfig(deleteConfigRequest?: DeleteConfigRequest, _options?: Configuration): Promise<RequestContext>;
    deployCommit(deployCommitRequest: DeployCommitRequest, _options?: Configuration): Promise<RequestContext>;
    revertCommit(commitId: string, revertCommitRequest?: RevertCommitRequest, _options?: Configuration): Promise<RequestContext>;
    searchCommits(searchCommitsRequest: SearchCommitsRequest, _options?: Configuration): Promise<RequestContext>;
    searchConfig(searchConfigRequest?: SearchConfigRequest, _options?: Configuration): Promise<RequestContext>;
    updateConfig(updateConfigRequest?: UpdateConfigRequest, _options?: Configuration): Promise<RequestContext>;
    validateMerge(validateMergeRequest: ValidateMergeRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class VersionControlApiResponseProcessor {
    commitBranch(response: ResponseContext): Promise<CommitResponse>;
    createConfig(response: ResponseContext): Promise<RepoConfigObject>;
    deleteConfig(response: ResponseContext): Promise<void>;
    deployCommit(response: ResponseContext): Promise<Array<DeployResponse>>;
    revertCommit(response: ResponseContext): Promise<RevertResponse>;
    searchCommits(response: ResponseContext): Promise<Array<CommitHistoryResponse>>;
    searchConfig(response: ResponseContext): Promise<Array<RepoConfigObject>>;
    updateConfig(response: ResponseContext): Promise<RepoConfigObject>;
    validateMerge(response: ResponseContext): Promise<Array<DeployResponse>>;
}
