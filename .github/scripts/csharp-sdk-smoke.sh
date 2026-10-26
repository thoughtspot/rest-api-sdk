#!/usr/bin/env bash
# Installs a published C# SDK version from nuget.org into a brand-new console
# project and compiles + runs .github/csharp-sdk-smoke/ against it.
#
#   csharp-sdk-smoke.sh version              print the SDK version on this branch
#   csharp-sdk-smoke.sh registry [version]   probe nuget.org, then consume
#
# Exit 44 means the version is not on nuget.org. SMOKE_REGISTRY_WAIT=<s>
# keeps probing that long first, for a publish NuGet is still indexing.
set -euo pipefail

readonly NOT_FOUND=44
repo=$(cd "$(dirname "$0")/../.." && pwd)
mode=${1:?mode}
probe_url='https://api.nuget.org/v3-flatcontainer/thoughtspot.restapi.sdk/{v}/thoughtspot.restapi.sdk.{v}.nupkg'

export DOTNET_CLI_TELEMETRY_OPTOUT=1 DOTNET_NOLOGO=1

branch_version() {
  sed -n 's|.*<Version>\(.*\)</Version>.*|\1|p' \
    "$repo/sdks/csharp/src/ThoughtSpot.RestApi.Sdk/ThoughtSpot.RestApi.Sdk.csproj" | head -1
}

probe() {
  local v=$1 url=${probe_url//\{v\}/$1}
  local deadline=$((SECONDS + ${SMOKE_REGISTRY_WAIT:-0}))
  until curl -sfIL -o /dev/null "$url"; do
    if ((SECONDS >= deadline)); then
      echo "version $v not found on nuget.org ($url)" >&2
      return $NOT_FOUND
    fi
    sleep 30
  done
  echo "version $v found on nuget.org"
}

consume() {
  local v=$1 out got
  cp -R "$repo/.github/csharp-sdk-smoke" "$work/consumer"
  # A private package cache: otherwise a copy cached on the machine would
  # satisfy the restore without touching nuget.org.
  export NUGET_PACKAGES=$work/nuget-packages
  cat >"$work/consumer/nuget.config" <<EOF
<configuration>
  <packageSources><clear/>
    <add key="nuget.org" value="https://api.nuget.org/v3/index.json"/>
  </packageSources>
</configuration>
EOF
  out=$(dotnet run --project "$work/consumer" -c Release -p:SdkVersion="$v" | tee /dev/stderr)
  got=$(tail -n1 <<<"$out")
  if [[ $got != "$v" ]]; then
    echo "consumer loaded SDK version '$got', expected '$v'" >&2
    return 1
  fi
  echo "consumer built and ran against registry package $v"
}

case "$mode" in
  version)
    branch_version
    ;;
  registry)
    v=${2:-$(branch_version)}
    probe "$v" || exit
    work=$(cd "$(mktemp -d "${TMPDIR:-/tmp}/csharp-sdk-smoke.XXXXXX")" && pwd -P)
    trap 'rm -rf "$work"' EXIT
    consume "$v"
    ;;
  *) echo "unknown mode: $mode" >&2; exit 2 ;;
esac
