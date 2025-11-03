#!/bin/bash

# cleanup generated portal, build archives and spec
rm -rf $PWD/build $PWD/spec
mkdir $PWD/build $PWD/spec

# prepare spec
cp ../api-spec/* spec/

if [ -f $PWD/processSpec.js ]; then
  npx node processSpec.js
fi

# native zip and unzip unavailable
npx bestzip $PWD/build/portal-input.zip .

curl -X POST --url 'https://api.apimatic.io/portal' -H "Authorization:X-Auth-Key "$APIMATIC_API_KEY"" -F 'file=@./build/portal-input.zip' -o ./build/portal-output.zip

npx extract-zip $PWD/build/portal-output.zip $PWD/build/static-portal
ls -Rlh $PWD/build/static-portal
