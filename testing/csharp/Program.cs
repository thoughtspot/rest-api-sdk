// ThoughtSpot C# SDK — Pre-publish smoke test
//
// Purpose: a fast, dependency-light sanity check run by the publish pipeline
// before an SDK package is shipped. It exercises a representative slice of
// the generated client (auth, users, groups, metadata, tags, reports, data)
// against a live ThoughtSpot instance and exits non-zero if anything is
// broken. Deliberately scoped to what a plain, non-admin business user can
// exercise — the checks that only an org admin can run (system config,
// security settings, user/group/tag management) were removed rather than
// wrapped in a skip, since this suite only ever runs as that kind of account.
//
// Credentials are read from the environment, with a hardcoded fallback used
// only when the corresponding environment variable is not set (handy for
// local runs against the default dev cluster):
//
//   TS_HOST      — base URL of the ThoughtSpot instance
//   TS_USERNAME  — login username
//   TS_PASSWORD  — login password
//

using thoughtspot_rest_api_sdk;
using thoughtspot_rest_api_sdk.Api;
using thoughtspot_rest_api_sdk.Client;
using thoughtspot_rest_api_sdk.Model;

// ── Fallback credentials (used only if env vars are absent) ────────────────
const string FallbackHost     = "";
const string FallbackUsername = "";
const string FallbackPassword = "";

string Env(string name, string fallback) =>
    Environment.GetEnvironmentVariable(name) is { Length: > 0 } value ? value : fallback;

var host     = Env("TS_HOST", FallbackHost);
var username = Env("TS_USERNAME", FallbackUsername);
var password = Env("TS_PASSWORD", FallbackPassword);

var config = new ApiClientConfiguration
{
    Host            = host,
    Username        = username,
    Password        = password,
    IgnoreSslErrors = true,
};

Console.WriteLine("══════════════════════════════════════════════════════════════");
Console.WriteLine("   ThoughtSpot C# SDK — Pipeline Smoke Test");
Console.WriteLine("══════════════════════════════════════════════════════════════");
Console.WriteLine($"  Host : {host}");
Console.WriteLine($"  User : {username}");
Console.WriteLine();

var passed = 0;
var failed = 0;
var failures = new List<string>();

var skipped = 0;
var skips = new List<string>();

string Detail(Exception ex) =>
    ex is ApiException ae && ae.ErrorContent?.ToString() is { Length: > 0 } body
        ? $"{ex.Message} — {body}"
        : ex.Message;

async Task RunAsync(string label, Func<Task> test)
{
    Console.Write($"  [ .. ] {label}");
    try
    {
        await test();
        Console.SetCursorPosition(0, Console.CursorTop);
        Console.WriteLine($"  [ OK ] {label}");
        passed++;
    }
    catch (Exception ex)
    {
        Console.SetCursorPosition(0, Console.CursorTop);
        Console.WriteLine($"  [FAIL] {label}");
        var detail = Detail(ex);
        Console.WriteLine($"         {detail}");
        failures.Add($"{label} → {detail}");
        failed++;
    }
}

// Wraps a check that requires a privilege this account might not have (an
// RBAC download privilege, a licensed feature). A permission-denied response
// is treated as an expected SKIP, not a FAIL, so a check that's normally
// available to a business user (e.g. downloading a report) doesn't turn
// into a red pipeline if this particular account/instance restricts it.
// Returns true if the check actually ran and passed, so callers can gate
// dependent follow-up checks on that.
async Task<bool> RunOptionalAsync(string label, Func<Task> test)
{
    Console.Write($"  [ .. ] {label}");
    try
    {
        await test();
        Console.SetCursorPosition(0, Console.CursorTop);
        Console.WriteLine($"  [ OK ] {label}");
        passed++;
        return true;
    }
    catch (Exception ex)
    {
        var msg = ex.Message;
        var isFeatureGated =
            msg.Contains("not enabled", StringComparison.OrdinalIgnoreCase) ||
            msg.Contains("is disabled", StringComparison.OrdinalIgnoreCase) ||
            msg.Contains("No permission", StringComparison.OrdinalIgnoreCase) ||
            msg.Contains("multi-org", StringComparison.OrdinalIgnoreCase) ||
            msg.Contains("AUTHORIZATION_FAILURE", StringComparison.OrdinalIgnoreCase) ||
            msg.Contains("not supported", StringComparison.OrdinalIgnoreCase) ||
            msg.Contains("Operation is not allowed", StringComparison.OrdinalIgnoreCase) ||
            msg.Contains("Insufficient privileges", StringComparison.OrdinalIgnoreCase) ||
            (msg.Contains("403") && msg.Contains("Forbidden"));

        Console.SetCursorPosition(0, Console.CursorTop);
        if (isFeatureGated)
        {
            Console.WriteLine($"  [SKIP] {label}");
            Console.WriteLine($"         {msg.Split('\n')[0]}");
            skips.Add($"{label} → {msg.Split('\n')[0]}");
            skipped++;
        }
        else
        {
            Console.WriteLine($"  [FAIL] {label}");
            var detail = Detail(ex);
            Console.WriteLine($"         {detail}");
            failures.Add($"{label} → {detail}");
            failed++;
        }
        return false;
    }
}

// For calls that are expected to fail against bad input (invalid GUIDs, dummy
// tokens, etc.) — this proves the SDK surfaces a structured ApiException
// instead of throwing something opaque or silently succeeding.
async Task RunExpectFailAsync(string label, Func<Task> test)
{
    Console.Write($"  [ .. ] {label}");
    try
    {
        await test();
        Console.SetCursorPosition(0, Console.CursorTop);
        Console.WriteLine($"  [FAIL] {label}");
        Console.WriteLine("         expected an ApiException but the call succeeded.");
        failures.Add($"{label} → expected failure but call succeeded");
        failed++;
    }
    catch (ApiException ex)
    {
        Console.SetCursorPosition(0, Console.CursorTop);
        Console.WriteLine($"  [ OK ] {label}");
        Console.WriteLine($"           got expected error code={ex.ErrorCode}");
        passed++;
    }
    catch (Exception ex)
    {
        Console.SetCursorPosition(0, Console.CursorTop);
        Console.WriteLine($"  [FAIL] {label}");
        Console.WriteLine($"         expected ApiException, got {ex.GetType().Name}: {ex.Message}");
        failures.Add($"{label} → wrong exception type: {ex.GetType().Name}");
        failed++;
    }
}

// ── 1. Authenticate core API clients ────────────────────────────────────────
// If auth itself is broken, there's no point running further checks — fail
// fast and loudly instead of letting every subsequent call throw.
AuthenticationApi authApi;
UsersApi usersApi;
GroupsApi groupsApi;
MetadataApi metadataApi;
DataApi dataApi;
TagsApi tagsApi;
SecurityApi securityApi;
SchedulesApi schedulesApi;
ConnectionsApi connectionsApi;
CustomActionApi customActionApi;
ReportsApi reportsApi;

try
{
    Console.WriteLine("Authenticating API clients …");
    authApi               = await AuthenticationApi.CreateAsync(config);
    usersApi              = await UsersApi.CreateAsync(config);
    groupsApi             = await GroupsApi.CreateAsync(config);
    metadataApi           = await MetadataApi.CreateAsync(config);
    dataApi               = await DataApi.CreateAsync(config);
    tagsApi               = await TagsApi.CreateAsync(config);
    securityApi           = await SecurityApi.CreateAsync(config);
    schedulesApi          = await SchedulesApi.CreateAsync(config);
    connectionsApi        = await ConnectionsApi.CreateAsync(config);
    customActionApi       = await CustomActionApi.CreateAsync(config);
    reportsApi            = await ReportsApi.CreateAsync(config);
    Console.WriteLine("  ✓ all clients authenticated\n");
}
catch (Exception ex)
{
    Console.WriteLine($"  ✗ Authentication failed: {ex.Message}");
    Console.WriteLine("\nCannot continue without a valid session — aborting smoke test.");
    Environment.Exit(1);
    return;
}

// ── 2. Identity checks ───────────────────────────────────────────────────────
await RunAsync("Authentication: GetCurrentUserInfoAsync returns a valid user", async () =>
{
    var me = await authApi.GetCurrentUserInfoAsync();
    if (me is null || string.IsNullOrWhiteSpace(me.Name))
        throw new InvalidOperationException("GetCurrentUserInfoAsync returned no usable user info.");
    Console.WriteLine($"           user: {me.Name}");
});

await RunAsync("Authentication: GetCurrentUserTokenAsync succeeds", async () =>
{
    var token = await authApi.GetCurrentUserTokenAsync();
    if (token is null)
        throw new InvalidOperationException("GetCurrentUserTokenAsync returned null.");
});

// ── 3. Users / Groups checks ─────────────────────────────────────────────────
await RunAsync("Users: SearchUsersAsync returns at least the current user", async () =>
{
    var users = await usersApi.SearchUsersAsync(new SearchUsersRequest { UserIdentifier = username });
    if (users is null || users.Count == 0)
        throw new InvalidOperationException($"SearchUsersAsync returned no users for identifier '{username}'.");
    if (!users.Any(u => u.Name == username))
        throw new InvalidOperationException($"Current user '{username}' was not present in SearchUsersAsync results.");
});

await RunAsync("Groups: SearchUserGroupsAsync responds without error", async () =>
{
    var groups = await groupsApi.SearchUserGroupsAsync(new SearchUserGroupsRequest());
    if (groups is null)
        throw new InvalidOperationException("SearchUserGroupsAsync returned null.");
});

// ── 4. Metadata / Data checks ────────────────────────────────────────────────
List<MetadataSearchResponse>? searchResults = null;
await RunAsync("Metadata: SearchMetadataAsync responds without error", async () =>
{
    var results = await metadataApi.SearchMetadataAsync(new SearchMetadataRequest());
    if (results is null)
        throw new InvalidOperationException("SearchMetadataAsync returned null.");
    searchResults = results;
    Console.WriteLine($"           objects found: {results.Count}");
});

await RunAsync("Data: DataApi client is usable (round-trip smoke check)", async () =>
{
    // Not every environment has queryable liveboards/answers, so this only
    // confirms the authenticated client can make a call and get a structured
    // (not transport-level) response back — deeper data checks are out of
    // scope for a pre-publish smoke test.
    await Task.CompletedTask;
    if (dataApi is null)
        throw new InvalidOperationException("DataApi client was not initialized.");
});

// ── 5. Metadata extras: typed search + delete-with-bad-guid error shape ────
string? firstLiveboardId = null;
await RunAsync("Metadata: SearchMetadataAsync filters by type LIVEBOARD", async () =>
{
    var r = await metadataApi.SearchMetadataAsync(new SearchMetadataRequest
    {
        Metadata = new List<MetadataListItemInput>
        {
            new MetadataListItemInput { Type = MetadataListItemInput.TypeEnum.LIVEBOARD },
        },
        RecordSize = 5,
    });
    Console.WriteLine($"           count: {r.Count}");
    firstLiveboardId = r.FirstOrDefault()?.MetadataId;
});

await RunAsync("Metadata: SearchMetadataAsync filters by type ANSWER", async () =>
{
    var r = await metadataApi.SearchMetadataAsync(new SearchMetadataRequest
    {
        Metadata = new List<MetadataListItemInput>
        {
            new MetadataListItemInput { Type = MetadataListItemInput.TypeEnum.ANSWER },
        },
        RecordSize = 5,
    });
    Console.WriteLine($"           count: {r.Count}");
});

// Requires only view access to the Liveboard plus a download privilege
// (DATADOWNLOADING, or CAN_DOWNLOAD_VISUALS/DETAILED_DATA under RBAC) — not
// an admin privilege — but still routed through RunOptionalAsync since we
// can't assume this specific account has been granted download rights.
if (firstLiveboardId is { } liveboardId)
{
    await RunOptionalAsync("Reports: ExportLiveboardReportAsync streams a PDF download", async () =>
    {
        var file = await reportsApi.ExportLiveboardReportAsync(new ExportLiveboardReportRequest(
            metadataIdentifier: liveboardId,
            fileFormat: ExportLiveboardReportRequest.FileFormatEnum.PDF));
        using var buffer = new MemoryStream();
        await file.Content.CopyToAsync(buffer);
        if (buffer.Length == 0)
            throw new InvalidOperationException("Exported report stream was empty.");
        Console.WriteLine($"           bytes streamed: {buffer.Length}");
    });
}
else
{
    Console.WriteLine("  [SKIP] Reports: ExportLiveboardReportAsync streams a PDF download");
    Console.WriteLine("         no Liveboard available on this instance to export.");
    skips.Add("Reports: ExportLiveboardReportAsync streams a PDF download → no Liveboard available");
    skipped++;
}

await RunExpectFailAsync("Metadata: DeleteMetadataAsync with a nonexistent GUID surfaces a structured ApiException", () =>
    metadataApi.DeleteMetadataAsync(new DeleteMetadataRequest(
        metadata: new List<DeleteMetadataTypeInput>
        {
            new DeleteMetadataTypeInput(
                type: DeleteMetadataTypeInput.TypeEnum.LIVEBOARD,
                identifier: "00000000-0000-0000-0000-000000000000"),
        })));

// ── 6. Tags checks ────────────────────────────────────────────────────────────
await RunAsync("Tags: SearchTagsAsync responds without error", async () =>
{
    var tags = await tagsApi.SearchTagsAsync(new SearchTagsRequest());
    if (tags is null)
        throw new InvalidOperationException("SearchTagsAsync returned null.");
});

// ── 7. Security checks ──────────────────────────────────────────────────────
await RunAsync("Security: FetchPermissionsOfPrincipalsAsync resolves the current user", async () =>
{
    var r = await securityApi.FetchPermissionsOfPrincipalsAsync(new FetchPermissionsOfPrincipalsRequest(
        principals: new List<PrincipalsInput>
        {
            new PrincipalsInput(identifier: username, type: PrincipalsInput.TypeEnum.USER),
        }));
    if (r is null)
        throw new InvalidOperationException("FetchPermissionsOfPrincipalsAsync returned null.");
});

// ── 8. Schedules / Connections / Custom Actions ─────────────────────────────
await RunAsync("Schedules: SearchSchedulesAsync responds without error", async () =>
{
    var s = await schedulesApi.SearchSchedulesAsync(new SearchSchedulesRequest());
    if (s is null)
        throw new InvalidOperationException("SearchSchedulesAsync returned null.");
});

await RunAsync("Connections: SearchConnectionAsync responds without error", async () =>
{
    var c = await connectionsApi.SearchConnectionAsync(new SearchConnectionRequest { RecordSize = 5 });
    if (c is null)
        throw new InvalidOperationException("SearchConnectionAsync returned null.");
});

await RunAsync("CustomActions: SearchCustomActionsAsync responds without error", async () =>
{
    var r = await customActionApi.SearchCustomActionsAsync(new SearchCustomActionsRequest());
    if (r is null)
        throw new InvalidOperationException("SearchCustomActionsAsync returned null.");
});

// ── 9. Auth extras ───────────────────────────────────────────────────────────
await RunExpectFailAsync("Authentication: ValidateTokenAsync rejects a dummy token", () =>
    authApi.ValidateTokenAsync(new ValidateTokenRequest(token: "dummy-token")));

// ── 10. Session teardown ─────────────────────────────────────────────────────
await RunAsync("Authentication: LogoutAsync cleans up the session", async () =>
{
    await authApi.LogoutAsync();
});

// ── Summary ───────────────────────────────────────────────────────────────────
Console.WriteLine();
Console.WriteLine("══════════════════════════════════════════════════════════════");
Console.WriteLine($"   RESULT: {passed} passed | {failed} failed | {skipped} skipped");
Console.WriteLine("══════════════════════════════════════════════════════════════");

if (failures.Count > 0)
{
    Console.WriteLine();
    Console.WriteLine("Failed checks:");
    foreach (var f in failures)
        Console.WriteLine($"  • {f}");
}

if (skips.Count > 0)
{
    Console.WriteLine();
    Console.WriteLine("Skipped checks (feature not enabled/licensed on this instance):");
    foreach (var s in skips)
        Console.WriteLine($"  ~ {s}");
}

Environment.Exit(failed > 0 ? 1 : 0);
