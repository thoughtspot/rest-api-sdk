export * from './authenticationApi';
import { AuthenticationApi } from './authenticationApi';
export * from './class900ClApi';
import { Class900ClApi } from './class900ClApi';
export * from './class920ClApi';
import { Class920ClApi } from './class920ClApi';
export * from './class940ClApi';
import { Class940ClApi } from './class940ClApi';
export * from './class950ClApi';
import { Class950ClApi } from './class950ClApi';
export * from './connectionsApi';
import { ConnectionsApi } from './connectionsApi';
export * from './dataApi';
import { DataApi } from './dataApi';
export * from './groupsApi';
import { GroupsApi } from './groupsApi';
export * from './logApi';
import { LogApi } from './logApi';
export * from './metadataApi';
import { MetadataApi } from './metadataApi';
export * from './orgsApi';
import { OrgsApi } from './orgsApi';
export * from './reportsApi';
import { ReportsApi } from './reportsApi';
export * from './rolesApi';
import { RolesApi } from './rolesApi';
export * from './schedulesApi';
import { SchedulesApi } from './schedulesApi';
export * from './securityApi';
import { SecurityApi } from './securityApi';
export * from './systemApi';
import { SystemApi } from './systemApi';
export * from './tagsApi';
import { TagsApi } from './tagsApi';
export * from './usersApi';
import { UsersApi } from './usersApi';
export * from './versionControlApi';
import { VersionControlApi } from './versionControlApi';
import * as http from 'http';

export class HttpError extends Error {
    constructor (public response: http.IncomingMessage, public body: any, public statusCode?: number) {
        super('HTTP request failed');
        this.name = 'HttpError';
    }
}

export { RequestFile } from '../model/models';

export const APIS = [AuthenticationApi, Class900ClApi, Class920ClApi, Class940ClApi, Class950ClApi, ConnectionsApi, DataApi, GroupsApi, LogApi, MetadataApi, OrgsApi, ReportsApi, RolesApi, SchedulesApi, SecurityApi, SystemApi, TagsApi, UsersApi, VersionControlApi];
