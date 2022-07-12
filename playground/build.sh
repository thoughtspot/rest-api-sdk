#!/bin/bash

# cleanup generated portal
rm -rf static-portal

zip -qq -r portal-input.zip .

curl -X POST --url 'https://www.apimatic.io/api/portal' -H "Authorization:X-Auth-Key "$APIMATIC_API_KEY"" -F 'file=@portal-input.zip' -o portal-output.zip

unzip -qq portal-output.zip -d static-portal