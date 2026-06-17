# ThoughtSpot.Client

Official .NET SDK for interacting with the ThoughtSpot REST API.

## Requirements

* .NET 8.0 or later

---

# Installation

Install the package from NuGet:

```bash
dotnet add package ThoughtSpot.Client
```

Or using the NuGet Package Manager:

```powershell
Install-Package ThoughtSpot.Client
```

---

# Configuration

Create an `ApiClientConfiguration` and initialize the required API clients.

```csharp
var config = new ApiClientConfiguration
{
    Host            = "https://your-thoughtspot-instance",
    Username        = "your_username",
    Password        = "your_password",
    IgnoreSslErrors = true,
};

var authApi = await AuthenticationApi.CreateAsync(config);
var systemApi = await SystemApi.CreateAsync(config);

Console.WriteLine("AuthenticationApi initialized.");
Console.WriteLine("SystemApi initialized.");
```

> **Note:** Set `IgnoreSslErrors` to `true` only for development or testing environments using self-signed certificates. For production deployments, it should typically be `false`.

---

# Authentication Examples

## Get a Full Access Token

```csharp
var response = await authApi.GetFullAccessTokenAsync(
    new GetFullAccessTokenRequest(
        username: config.Username,
        password: config.Password,
        validityTimeInSec: 300));

Console.WriteLine($"Token Length: {response.VarToken?.Length ?? 0}");
```

---

## Get Current User Information

```csharp
var currentUser = await authApi.GetCurrentUserInfoAsync();

Console.WriteLine($"User: {currentUser.Name}");
Console.WriteLine($"ID: {currentUser.Id}");
```

---

# System API Examples

## Get System Configuration

```csharp
var systemConfig = await systemApi.GetSystemConfigAsync();

Console.WriteLine(systemConfig.GetType().Name);
```

---

## Get System Information

```csharp
var systemInfo = await systemApi.GetSystemInformationAsync();

Console.WriteLine($"Release Version: {systemInfo.ReleaseVersion}");
```

---

## Get System Override Information

```csharp
var overrideInfo = await systemApi.GetSystemOverrideInfoAsync();

Console.WriteLine(overrideInfo.GetType().Name);
```

---

# Quick Connectivity Test

The following example verifies that the SDK is correctly configured and can communicate with your ThoughtSpot instance.

```csharp
var config = new ApiClientConfiguration
{
    Host            = "https://your-thoughtspot-instance",
    Username        = "your_username",
    Password        = "your_password",
    IgnoreSslErrors = true,
};

var authApi = await AuthenticationApi.CreateAsync(config);
var systemApi = await SystemApi.CreateAsync(config);

// Verify authentication
var token = await authApi.GetFullAccessTokenAsync(
    new GetFullAccessTokenRequest(
        username: config.Username,
        password: config.Password,
        validityTimeInSec: 300));

Console.WriteLine($"Successfully obtained access token ({token.VarToken?.Length ?? 0} characters).");

// Verify current user endpoint
var currentUser = await authApi.GetCurrentUserInfoAsync();
Console.WriteLine($"Connected as: {currentUser.Name} ({currentUser.Id})");

// Verify system endpoint
var systemInfo = await systemApi.GetSystemInformationAsync();
Console.WriteLine($"ThoughtSpot Release Version: {systemInfo.ReleaseVersion}");
```

If all of the above calls complete successfully without throwing an exception, the SDK has been configured correctly and is communicating with your ThoughtSpot cluster.

---

# Package Information

* **Package ID:** `ThoughtSpot.Client`
* **Target Framework:** `.NET 8.0`
* **Version:** `0.1.0-beta`
* **Authors:** ThoughtSpot

Refer to the generated XML documentation and API reference for the complete set of supported endpoints.
