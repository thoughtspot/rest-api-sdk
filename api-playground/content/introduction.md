# Introduction
Welcome to the Thoughtspot REST API v2.0 playground!
Browse through the following details before you begin and learn how to interact with the ThoughtSpot system through APIs.

## Playground layout
The REST API Playground offers an interactive portal with comprehensive information about each API endpoint, request format, and responses.

- On the left pane, you can find a catalog of API endpoints, grouped based on the objects they operate on. You can also view the data structure of the request and response and enumerations.
- The middle section of the portal provides a detailed description of the endpoint, its input fields, and the allowed and default values for attributes.
- On the right side of Playground, you can find an interactive code explorer that shows the API request details and allows you to try out an API and view the response.

## Resources
All the resources that can be used are listed under the **API Endpoints** section on the left pane. On clicking an endpoint, you can view its resource URL, input fields, and request and response formats.

## Sample request and response
Based on the input provided for the fields, you can see the request generated in the API code explorer on the right side of the portal. You can click **Try it out** to explore an API and also copy the request using the copy icon in the code explorer.

On clicking the **Try it out** button, you can view the API response. If the request succeeds, the API returns the 200 response code. You can copy or download the API response using the buttons at the bottom of the code explorer. You can also copy the individual field values using the button next to the field. You can click the **Back** button to go back to the previous page and try out another API.

## Errors
The portal uses the standard HTTP response codes to indicate the success or failure of a request. The 200 response code indicates a successful request, whereas 500 and 4xx response codes indicate an error.

If the API response indicates an error, you can view the error details by navigating to `root` > `error` > `message` > `debug` in the error response body.

## Getting started
For information about setting up and using the REST API v2.0 endpoints, please refer to the **Setup and usage** guide, which describes the initial setup process and authentication options and examples to help you effectively use the APIs.

If you need further assistance, contact ThoughtSpot support team or connect with ThoughtSpot Developer Community on [Discord](https://discord.com/invite/JHPGwCkvjQ).
