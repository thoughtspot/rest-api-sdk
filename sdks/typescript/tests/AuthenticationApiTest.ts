import chai from "chai";
import chaiAsPromised from "chai-as-promised";
import { createBearerAuthenticationConfig } from "../utils/config";
import { PromiseAuthenticationApi } from "../types/PromiseAPI";
import requestBodies from "./testDataUpdated.json";

chai.use(chaiAsPromised);
const expect = chai.expect;



const baseUrlFromCli = process.argv.filter(s => s.startsWith("--baseUrl="))?.[0]?.split("=")?.[1]
const BASE_URL = baseUrlFromCli || "http://127.0.0.1:4123"
const config = createBearerAuthenticationConfig(BASE_URL, {
    username: "tsadmin",
    password: "admin",
});


const instance = new PromiseAuthenticationApi(config);

describe('AuthenticationApi', function() {


      describe('getCurrentUserInfo', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "getCurrentUserInfo"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.getCurrentUserInfo(
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.getCurrentUserInfo(
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('getCurrentUserToken', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "getCurrentUserToken"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.getCurrentUserToken(
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.getCurrentUserToken(
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('getCustomAccessToken', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "getCustomAccessToken"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.getCustomAccessToken(
                    // getCustomAccessTokenRequest GetCustomAccessTokenRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.getCustomAccessToken(
                    // getCustomAccessTokenRequest GetCustomAccessTokenRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('getFullAccessToken', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "getFullAccessToken"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.getFullAccessToken(
                    // getFullAccessTokenRequest GetFullAccessTokenRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.getFullAccessToken(
                    // getFullAccessTokenRequest GetFullAccessTokenRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('getObjectAccessToken', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "getObjectAccessToken"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.getObjectAccessToken(
                    // getObjectAccessTokenRequest GetObjectAccessTokenRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.getObjectAccessToken(
                    // getObjectAccessTokenRequest GetObjectAccessTokenRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('login', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "login"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.login(
                    // loginRequest LoginRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.login(
                    // loginRequest LoginRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('logout', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "logout"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.logout(
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.logout(
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('revokeToken', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "revokeToken"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.revokeToken(
                    // revokeTokenRequest RevokeTokenRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.revokeToken(
                    // revokeTokenRequest RevokeTokenRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('validateToken', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "validateToken"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.validateToken(
                    // validateTokenRequest ValidateTokenRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.validateToken(
                    // validateTokenRequest ValidateTokenRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });
});
