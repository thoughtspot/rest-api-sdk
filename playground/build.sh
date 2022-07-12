#!/bin/bash

# cleanup generated portal and build archives
rm -rf build
mkdir build

npx bestzip $PWD/build/portal-input.zip .

curl -X POST --url 'https://www.apimatic.io/api/portal' -H "Authorization:X-Auth-Key "$APIMATIC_API_KEY"" -F 'file=@./build/portal-input.zip' -o ./build/portal-output.zip

npx extract-zip $PWD/build/portal-output.zip $PWD/build/static-portal