## Background
The Rest API playground is generated using APIMatic's [portal generation API](https://portal-api-docs.apimatic.io/#/http/getting-started/overview-apimatic-portal-generation) and deployed directly on Vercel

## Local development
Prepare the build folder

`APIMATIC_API_KEY=<KEY> sh build.sh`

Preview changes on a local http server

`npx http-server ./build/static-portal`