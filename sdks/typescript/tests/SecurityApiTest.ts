import chai from "chai";
import chaiAsPromised from "chai-as-promised";
import { createBearerAuthenticationConfig } from "../utils/config";
import { PromiseSecurityApi } from "../types/PromiseAPI";
import requestBodies from "./testDataUpdated.json";

chai.use(chaiAsPromised);
const expect = chai.expect;



const baseUrlFromCli = process.argv.filter(s => s.startsWith("--baseUrl="))?.[0]?.split("=")?.[1]
const BASE_URL = baseUrlFromCli || "http://127.0.0.1:4123"
const config = createBearerAuthenticationConfig(BASE_URL, {
    username: "tsadmin",
    password: "admin",
});


const instance = new PromiseSecurityApi(config);

describe('SecurityApi', function() {


      describe('assignChangeAuthor', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "assignChangeAuthor"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.assignChangeAuthor(
                    // assignChangeAuthorRequest AssignChangeAuthorRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.assignChangeAuthor(
                    // assignChangeAuthorRequest AssignChangeAuthorRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('fetchPermissionsOfPrincipals', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "fetchPermissionsOfPrincipals"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.fetchPermissionsOfPrincipals(
                    // fetchPermissionsOfPrincipalsRequest FetchPermissionsOfPrincipalsRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.fetchPermissionsOfPrincipals(
                    // fetchPermissionsOfPrincipalsRequest FetchPermissionsOfPrincipalsRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('fetchPermissionsOnMetadata', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "fetchPermissionsOnMetadata"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.fetchPermissionsOnMetadata(
                    // fetchPermissionsOnMetadataRequest FetchPermissionsOnMetadataRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.fetchPermissionsOnMetadata(
                    // fetchPermissionsOnMetadataRequest FetchPermissionsOnMetadataRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('shareMetadata', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "shareMetadata"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.shareMetadata(
                    // shareMetadataRequest ShareMetadataRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.shareMetadata(
                    // shareMetadataRequest ShareMetadataRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });
});
