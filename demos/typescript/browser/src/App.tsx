import React from "react";

import "./App.css";
import {
  ServerConfiguration,
  ThoughtSpotRestApi,
  createConfiguration,
  User,
} from "@thoughtspot/rest-api-sdk";

const BASE_URL = "https://172.19.209.85:8443";
const USERNAME = "tsadmin";
const PASSWORD = "admin";

const config = createConfiguration({
  baseServer: new ServerConfiguration(BASE_URL, {}),
});
const tsRestApiClient = new ThoughtSpotRestApi(config);

function App() {
  const [loggedIn, setLoggedIn] = React.useState(false);
  const [users, setUsers] = React.useState<User[]>([]);
  const handleLogin = () => {
    if (loggedIn) {
      tsRestApiClient.logout().then(() => {
        setLoggedIn(false);
      });
    } else {
      tsRestApiClient
        .login({
          username: USERNAME,
          password: PASSWORD,
        })
        .then(() => {
          setLoggedIn(true);
        });
    }
  };

  const handleGetUsers = () => {
    tsRestApiClient.searchUsers().then(setUsers);
  };

  return (
    <div className="App">
      <button onClick={handleLogin}>{loggedIn ? "Logout" : "Login"}</button>
      <button onClick={handleGetUsers}>Get users</button>
      {users.map((user) => user.name)}
    </div>
  );
}

export default App;
