import {UsersApi, AuthenticationApi} from '../typescript-node/api'

const main = async () => {

  const BASE_URL = 'http://172.19.168.52:8088';

  const userApiClient = new UsersApi(BASE_URL);
  const authApiClient = new AuthenticationApi(BASE_URL)

  const authToken  = (await authApiClient.getFullAccessToken({
    username : "tsadmin",
    password : "admin"
  })).body.token;

  console.log(authToken)


  try {

  console.log( await userApiClient.searchUsers({}, {
    headers : { 'Authorization' : 'Bearer ' + authToken}
  }))} catch(e) {
    console.log(e.body)
  }
}

main()

