import chai from "chai";
import chaiAsPromised from "chai-as-promised";
import { createBearerAuthenticationConfig } from "../utils/config";
import { PromiseSemanticIntegrationsApi } from "../types/PromiseAPI";
import requestBodies from "./testDataUpdated.json";

chai.use(chaiAsPromised);
const expect = chai.expect;



const baseUrlFromCli = process.argv.filter(s => s.startsWith("--baseUrl="))?.[0]?.split("=")?.[1]
const BASE_URL = baseUrlFromCli || "http://127.0.0.1:4123"
const config = createBearerAuthenticationConfig(BASE_URL, {
    username: "tsadmin",
    password: "admin",
});


const instance = new PromiseSemanticIntegrationsApi(config);

describe('SemanticIntegrationsApi', function() {


      describe('createSemanticIntegration', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "createSemanticIntegration"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.createSemanticIntegration(
                    // createSemanticIntegrationRequest CreateSemanticIntegrationRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.createSemanticIntegration(
                    // createSemanticIntegrationRequest CreateSemanticIntegrationRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('deleteSemanticIntegration', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "deleteSemanticIntegration"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.deleteSemanticIntegration(
                    // semanticIntegrationIdentifier semantic_integration_identifier
                    test.Path_Variables.semantic_integration_identifier    
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.deleteSemanticIntegration(
                    // semanticIntegrationIdentifier semantic_integration_identifier
                    test.Path_Variables.semantic_integration_identifier    
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('importSemanticIntegration', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "importSemanticIntegration"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.importSemanticIntegration(
                    // semanticIntegrationIdentifier semantic_integration_identifier
                    test.Path_Variables.semantic_integration_identifier    
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.importSemanticIntegration(
                    // semanticIntegrationIdentifier semantic_integration_identifier
                    test.Path_Variables.semantic_integration_identifier    
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('searchSemanticIntegrations', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "searchSemanticIntegrations"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.searchSemanticIntegrations(
                    // searchSemanticIntegrationsRequest SearchSemanticIntegrationsRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.searchSemanticIntegrations(
                    // searchSemanticIntegrationsRequest SearchSemanticIntegrationsRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });
});
