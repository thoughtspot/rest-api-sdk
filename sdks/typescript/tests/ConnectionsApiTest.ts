import chai from "chai";
import chaiAsPromised from "chai-as-promised";
import { createBearerAuthenticationConfig } from "../utils/config";
import { PromiseConnectionsApi } from "../types/PromiseAPI";
import requestBodies from "./testDataUpdated.json";

chai.use(chaiAsPromised);
const expect = chai.expect;



const baseUrlFromCli = process.argv.filter(s => s.startsWith("--baseUrl="))?.[0]?.split("=")?.[1]
const BASE_URL = baseUrlFromCli || "http://127.0.0.1:4123"
const config = createBearerAuthenticationConfig(BASE_URL, {
    username: "tsadmin",
    password: "admin",
});


const instance = new PromiseConnectionsApi(config);

describe('ConnectionsApi', function() {


      describe('createConnection', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "createConnection"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.createConnection(
                    // createConnectionRequest CreateConnectionRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.createConnection(
                    // createConnectionRequest CreateConnectionRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('deleteConnection', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "deleteConnection"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.deleteConnection(
                    // deleteConnectionRequest DeleteConnectionRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.deleteConnection(
                    // deleteConnectionRequest DeleteConnectionRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('searchConnection', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "searchConnection"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.searchConnection(
                    // searchConnectionRequest SearchConnectionRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.searchConnection(
                    // searchConnectionRequest SearchConnectionRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('updateConnection', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "updateConnection"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.updateConnection(
                    // updateConnectionRequest UpdateConnectionRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.updateConnection(
                    // updateConnectionRequest UpdateConnectionRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });
});
