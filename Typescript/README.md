
# Getting Started with TS Public RestAPI

## Building

### Requirements

The SDK relies on **Node.js** and **npm** (to resolve dependencies). You can download and install Node.js and [npm](https://www.npmjs.com/) from [the official Node.js website](https://nodejs.org/en/download/).

> **NOTE:** npm is installed by default when Node.js is installed.

### Verify Successful Installation

Run the following commands in the command prompt or shell of your choice to check if Node.js and npm are successfully installed:

* Node.js: `node --version`

* npm: `npm --version`

![Version Check](https://apidocs.io/illustration/typescript?workspaceFolder=TSPublicRestAPI&step=versionCheck)

### Install Dependencies

- To resolve all dependencies, go to the **SDK root directory** and run the following command with npm:

```bash
npm install
```

- This will install all dependencies in the **node_modules** folder.

![Resolve Dependencies](https://apidocs.io/illustration/typescript?workspaceFolder=TSPublicRestAPI&workspaceName=ts-public-restapilib&step=resolveDependency)

## Installation

The following section explains how to use the generated library in a new project.

### 1. Initialize the Node Project

- Open an IDE/text editor for JavaScript like Visual Studio Code. The basic workflow presented here is also applicable if you prefer using a different editor or IDE.

- Click on **File** and select **Open Folder**. Select an empty folder of your project, the folder will become visible in the sidebar on the left.

![Open Folder](https://apidocs.io/illustration/typescript?step=openProject)

- To initialize the Node project, click on **Terminal** and select **New Terminal**. Execute the following command in the terminal:

```bash
npm init --y
```

![Initialize the Node Project](https://apidocs.io/illustration/typescript?step=initializeProject)

### 2. Add Dependencies to the Client Library

- The created project manages its dependencies using its `package.json` file. In order to add a dependency on the *TS Public RestAPILib* client library, double click on the `package.json` file in the bar on the left and add the dependency to the package in it.

![Add TsPublicRestapilib Dependency](https://apidocs.io/illustration/typescript?workspaceFolder=TSPublicRestAPI&workspaceName=ts-public-restapilib&step=importDependency)

- To install the package in the project, run the following command in the terminal:

```bash
npm install
```

![Install TsPublicRestapilib Dependency](https://apidocs.io/illustration/typescript?step=installDependency)

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `contentType` | `string` | body content type for post request<br>*Default*: `'application/json'` |
| `acceptLanguage` | `string` | response format<br>*Default*: `'application/json'` |
| `baseUrl` | `string` | *Default*: `'https://localhost:443'` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.Production`** |
| `timeout` | `number` | Timeout for API calls.<br>*Default*: `0` |
| `accessToken` | `string` | The OAuth 2.0 Access Token to use for API requests. |

The API client can be initialized as follows:

```ts
const client = new Client({
  contentType: 'application/json',
  acceptLanguage: 'application/json',
  timeout: 0,
  environment: Environment.Production,
  accessToken: 'AccessToken',
})
```

## Authorization

This API uses `OAuth 2 Bearer token`.

## List of APIs

* [Session](/doc/controllers/session.md)
* [User](/doc/controllers/user.md)
* [Group](/doc/controllers/group.md)

## Classes Documentation

* [ApiResponse](/doc/api-response.md)
* [ApiError](/doc/api-error.md)

