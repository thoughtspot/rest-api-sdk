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

## Hiding "Set as NULL" on Request Fields

APIMatic shows a "Set as NULL" control for every `nullable` field. To remove it from request parameters and bodies in the playground, set this in `api-playground-config.json`:
```json
{
  "removeRequestNullable": true
}
```
This changes only the playground's copy of the spec. Response schemas and the SDKs keep `nullable`.

## Local development
Prepare the build folder

`APIMATIC_API_KEY=<KEY> sh build.sh`

Preview changes on a local http server

`npx http-server ./build/static-portal`
