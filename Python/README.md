
# Getting Started with TS Public RestAPI

## Building

You must have Python `3 >=3.7, <= 3.9` installed on your system to install and run this SDK. This SDK package depends on other Python packages like nose, jsonpickle etc. These dependencies are defined in the `requirements.txt` file that comes with the SDK. To resolve these dependencies, you can use the PIP Dependency manager. Install it by following steps at [https://pip.pypa.io/en/stable/installing/](https://pip.pypa.io/en/stable/installing/).

Python and PIP executables should be defined in your PATH. Open command prompt and type `pip --version`. This should display the version of the PIP Dependency Manager installed if your installation was successful and the paths are properly defined.

* Using command line, navigate to the directory containing the generated files (including `requirements.txt`) for the SDK.
* Run the command `pip install -r requirements.txt`. This should install all the required dependencies.

![Building SDK - Step 1](https://apidocs.io/illustration/python?workspaceFolder=Tspublicrestapi-Python&step=installDependencies)

## Installation

The following section explains how to use the tspublicrestapi library in a new project.

### 1. Open Project in an IDE

Open up a Python IDE like PyCharm. The basic workflow presented here is also applicable if you prefer using a different editor or IDE.

![Open project in PyCharm - Step 1](https://apidocs.io/illustration/python?workspaceFolder=Tspublicrestapi-Python&step=pyCharm)

Click on `Open` in PyCharm to browse to your generated SDK directory and then click `OK`.

![Open project in PyCharm - Step 2](https://apidocs.io/illustration/python?workspaceFolder=Tspublicrestapi-Python&step=openProject0)

The project files will be displayed in the side bar as follows:

![Open project in PyCharm - Step 3](https://apidocs.io/illustration/python?workspaceFolder=Tspublicrestapi-Python&projectName=tspublicrestapi&step=openProject1)

### 2. Add a new Test Project

Create a new directory by right clicking on the solution name as shown below:

![Add a new project in PyCharm - Step 1](https://apidocs.io/illustration/python?workspaceFolder=Tspublicrestapi-Python&projectName=tspublicrestapi&step=createDirectory)

Name the directory as "test".

![Add a new project in PyCharm - Step 2](https://apidocs.io/illustration/python?workspaceFolder=Tspublicrestapi-Python&step=nameDirectory)

Add a python file to this project.

![Add a new project in PyCharm - Step 3](https://apidocs.io/illustration/python?workspaceFolder=Tspublicrestapi-Python&projectName=tspublicrestapi&step=createFile)

Name it "testSDK".

![Add a new project in PyCharm - Step 4](https://apidocs.io/illustration/python?workspaceFolder=Tspublicrestapi-Python&projectName=tspublicrestapi&step=nameFile)

In your python file you will be required to import the generated python library using the following code lines

```python
from tspublicrestapi.tspublicrestapi_client import TspublicrestapiClient
```

![Add a new project in PyCharm - Step 5](https://apidocs.io/illustration/python?workspaceFolder=Tspublicrestapi-Python&projectName=tspublicrestapi&libraryName=tspublicrestapi.tspublicrestapi_client&className=TspublicrestapiClient&step=projectFiles)

After this you can write code to instantiate an API client object, get a controller object and  make API calls. Sample code is given in the subsequent sections.

### 3. Run the Test Project

To run the file within your test project, right click on your Python file inside your Test project and click on `Run`

![Run Test Project - Step 1](https://apidocs.io/illustration/python?workspaceFolder=Tspublicrestapi-Python&projectName=tspublicrestapi&libraryName=tspublicrestapi.tspublicrestapi_client&className=TspublicrestapiClient&step=runProject)

## Test the SDK

You can test the generated SDK and the server with test cases. `unittest` is used as the testing framework and `nose` is used as the test runner. You can run the tests as follows:

Navigate to the root directory of the SDK and run the following commands

```
pip install -r test-requirements.txt
nosetests
```

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `content_type` | `string` | body content type for post request<br>*Default*: `'application/json'` |
| `accept_language` | `string` | response format<br>*Default*: `'application/json'` |
| `access_token` | `string` | The OAuth 2.0 Access Token to use for API requests. |
| `base_url` | `string` | *Default*: `'https://localhost:443'` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `http_client_instance` | `HttpClient` | The Http Client passed from the sdk user for making requests |
| `override_http_client_configuration` | `bool` | The value which determines to override properties of the passed Http Client from the sdk user |
| `timeout` | `float` | The value to use for connection timeout. <br> **Default: 60** |
| `max_retries` | `int` | The number of times to retry an endpoint call if it fails. <br> **Default: 0** |
| `backoff_factor` | `float` | A backoff factor to apply between attempts after the second try. <br> **Default: 2** |
| `retry_statuses` | `Array of int` | The http statuses on which retry is to be done. <br> **Default: [408, 413, 429, 500, 502, 503, 504, 521, 522, 524, 408, 413, 429, 500, 502, 503, 504, 521, 522, 524]** |
| `retry_methods` | `Array of string` | The http methods on which retry is to be done. <br> **Default: ['GET', 'PUT', 'GET', 'PUT']** |

The API client can be initialized as follows:

```python
from tspublicrestapi.tspublicrestapi_client import TspublicrestapiClient
from tspublicrestapi.configuration import Environment

client = TspublicrestapiClient(
    content_type='application/json',
    accept_language='application/json',
    access_token='AccessToken',
    environment=Environment.PRODUCTION,
    base_url = 'https://localhost:443',)
```

## Authorization

This API uses `OAuth 2 Bearer token`.

## List of APIs

* [Session](/doc/controllers/session.md)
* [User](/doc/controllers/user.md)
* [Group](/doc/controllers/group.md)

## Classes Documentation

* [Utility Classes](/doc/utility-classes.md)
* [HttpResponse](/doc/http-response.md)
* [HttpRequest](/doc/http-request.md)

