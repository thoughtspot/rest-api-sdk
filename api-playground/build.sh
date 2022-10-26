#!/bin/bash

# cleanup generated portal, build archives and spec
rm -rf $PWD/build $PWD/spec
mkdir $PWD/build $PWD/spec

# prepare spec
cp ../api-spec/* spec/

# native zip and unzip unavailable
npx bestzip $PWD/build/portal-input.zip .

curl -X POST --url 'https://www.apimatic.io/api/portal' -H "Authorization:X-Auth-Key "$APIMATIC_API_KEY"" -F 'file=@./build/portal-input.zip' -o ./build/portal-output.zip

npx extract-zip $PWD/build/portal-output.zip $PWD/build/static-portal
ls -R $PWD/build/static-portal