import chai from "chai";
import chaiAsPromised from "chai-as-promised";
import { createBearerAuthenticationConfig } from "../utils/config";
import { PromiseOrgsApi } from "../types/PromiseAPI";
import requestBodies from "./testDataUpdated.json";

chai.use(chaiAsPromised);
const expect = chai.expect;



const baseUrlFromCli = process.argv.filter(s => s.startsWith("--baseUrl="))?.[0]?.split("=")?.[1]
const BASE_URL = baseUrlFromCli || "http://127.0.0.1:4123"
const config = createBearerAuthenticationConfig(BASE_URL, {
    username: "tsadmin",
    password: "admin",
});


const instance = new PromiseOrgsApi(config);

describe('OrgsApi', function() {


      describe('createOrg', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "createOrg"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.createOrg(
                    // createOrgRequest CreateOrgRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.createOrg(
                    // createOrgRequest CreateOrgRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('deleteOrg', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "deleteOrg"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.deleteOrg(
                    // orgIdentifier org_identifier
                    test.Path_Variables.org_identifier    
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.deleteOrg(
                    // orgIdentifier org_identifier
                    test.Path_Variables.org_identifier    
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('searchOrgs', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "searchOrgs"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.searchOrgs(
                    // searchOrgsRequest SearchOrgsRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.searchOrgs(
                    // searchOrgsRequest SearchOrgsRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('updateOrg', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "updateOrg"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.updateOrg(
                    // orgIdentifier org_identifier
                    test.Path_Variables.org_identifier     , 
                    // updateOrgRequest UpdateOrgRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.updateOrg(
                    // orgIdentifier org_identifier
                    test.Path_Variables.org_identifier     , 
                    // updateOrgRequest UpdateOrgRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });
});
