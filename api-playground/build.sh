#!/bin/bash

# cleanup generated portal, build archives and spec
rm -rf build spec
mkdir build spec

# prepare spec
cp ../api-spec/* spec/

# native zip and unzip unavailable
npx bestzip $PWD/build/portal-input.zip .

curl -X POST --url 'https://www.apimatic.io/api/portal' -H "Authorization:X-Auth-Key "$APIMATIC_API_KEY"" -F 'file=@./build/portal-input.zip' -o ./build/portal-output.zip

npx extract-zip $PWD/build/portal-output.zip $PWD/build/static-portal

# copy the service worker to the root dir
cp $PWD/build/static-portal/static/js/embedded-worker.js $PWD/build/static-portal/