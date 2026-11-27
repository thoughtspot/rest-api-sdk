using ThoughtSpot.RestApi.Sdk;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Model;

var config = new ApiClientConfiguration { Host = "https://smoke.invalid", TokenProvider = _ => Task.FromResult("smoke") };
var users = await UsersApi.CreateAsync(config);
var request = new SearchUsersRequest(recordOffset: 0, recordSize: 1);
Console.WriteLine($"{users.GetType().Name} {request.RecordSize}");
Console.WriteLine(ThoughtSpot.RestApi.Sdk.Client.Configuration.Version);
