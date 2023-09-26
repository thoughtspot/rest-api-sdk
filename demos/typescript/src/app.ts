import {
  ThoughtSpotRestApi,
  createBearerAuthenticationConfig
} from "@thoughtspot/rest-api-sdk";

const BASE_URL = "http://172.19.213.202:8088";

const main = async () => {
  // getting the token
  const config = createBearerAuthenticationConfig(BASE_URL, {
    username: "tsadmin",
    password: "admin",
  });

  const tsRestApiClient = new ThoughtSpotRestApi(config);

  try {
    const users = await tsRestApiClient.deleteUser("tsadmin");
    console.log("Users on the cluster : ");
    console.log(users)
  } catch (e) {
    console.log(e);
  }
};

main();

