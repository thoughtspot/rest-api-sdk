# TS API Playground

Please go [here](https://try-everywhere.thoughtspot.cloud/v2/#/everywhere/api/rest/playgroundV2_0) to use the API playground.

## Background
The Rest API playground is generated using APIMatic's [portal generation API](https://portal-api-docs.apimatic.io/#/http/getting-started/overview-apimatic-portal-generation) and deployed directly on Vercel

## Hiding Fields

To hide specific fields from the API playground UI:

Add configuration to `api-playground-config.json`:
```json
{
  "hideApiFields": [
    { "operationId": "APIOperantionId", "fields": ["field.refSchemaField"] }
  ]
}
```

## Local development
Prepare the build folder

`APIMATIC_API_KEY=<KEY> sh build.sh`

Preview changes on a local http server

`npx http-server ./build/static-portal`
