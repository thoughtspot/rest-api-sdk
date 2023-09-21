import chai from "chai";
import chaiAsPromised from "chai-as-promised";

import { createBearerAuthenticationConfig } from "../utils/config";
import { PromiseDBTApi } from "../types/PromiseAPI";

chai.use(chaiAsPromised);
const expect = chai.expect;


import requestBodies from "./testDataUpdated.json";

const BASE_URL = "http://127.0.0.1:4123"
const config = createBearerAuthenticationConfig(BASE_URL, {
    username: "tsadmin",
    password: "admin",
});


const instance = new PromiseDBTApi(config);

describe('DBTApi', function() {


      describe('dbtConnection', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "dbtConnection"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.dbtConnection(
                    // dbtConnectionRequest DbtConnectionRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.dbtConnection(
                    // dbtConnectionRequest DbtConnectionRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('dbtSearch', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "dbtSearch"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.dbtSearch(
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.dbtSearch(
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('generateSyncTml', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "generateSyncTml"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.generateSyncTml(
                    // generateSyncTmlRequest GenerateSyncTmlRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.generateSyncTml(
                    // generateSyncTmlRequest GenerateSyncTmlRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('generateTml', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "generateTml"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.generateTml(
                    // generateTmlRequest GenerateTmlRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.generateTml(
                    // generateTmlRequest GenerateTmlRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('updateDbtConnection', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "updateDbtConnection"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.updateDbtConnection(
                    // dbtConnectionIdentifier dbt_connection_identifier
                    test.Path_Variables.dbt_connection_identifier     , 
                    // updateDbtConnectionRequest UpdateDbtConnectionRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.updateDbtConnection(
                    // dbtConnectionIdentifier dbt_connection_identifier
                    test.Path_Variables.dbt_connection_identifier     , 
                    // updateDbtConnectionRequest UpdateDbtConnectionRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });
});
