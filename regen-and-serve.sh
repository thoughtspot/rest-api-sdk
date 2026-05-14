#!/usr/bin/env bash
set -euo pipefail

PRISM_DIR="/Users/ravi.shah/ts-fe/prism"
SRC_SPEC="${PRISM_DIR}/openapiSpecv3-2_0.json"
DEST_SPEC="/Users/ravi.shah/rest-api-sdk/api-spec/openapiSpecv3-2_0.json"
PLAYGROUND_DIR="/Users/ravi.shah/rest-api-sdk/api-playground"

echo ">>> [1/4] Generating OpenAPI spec in ${PRISM_DIR}"
cd "${PRISM_DIR}"
npm run generate-restapi-v2-spec -- --updateDocAndExamples

echo ">>> [2/4] Copying spec to ${DEST_SPEC}"
[[ -f "${SRC_SPEC}" ]] || { echo "ERROR: ${SRC_SPEC} not found"; exit 1; }
cp "${SRC_SPEC}" "${DEST_SPEC}"

echo ">>> [3/4] Building static portal"
cd "${PLAYGROUND_DIR}"
APIMATIC_API_KEY="PnkAFwzbk6A_hfXBE1GxCFkmwFjQGz3_vkd9FdJ7QAsig80CBRtw6Vc9z7NBkLIx" sh build.sh

echo ">>> [4/4] Serving build/static-portal (Ctrl+C to stop)"
npx http-server ./build/static-portal
