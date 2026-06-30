import chai from "chai";
import chaiAsPromised from "chai-as-promised";
import { createBearerAuthenticationConfig } from "../utils/config";
import { PromiseManualTranslationApi } from "../types/PromiseAPI";
import requestBodies from "./testDataUpdated.json";

chai.use(chaiAsPromised);
const expect = chai.expect;



const baseUrlFromCli = process.argv.filter(s => s.startsWith("--baseUrl="))?.[0]?.split("=")?.[1]
const BASE_URL = baseUrlFromCli || "http://127.0.0.1:4123"
const config = createBearerAuthenticationConfig(BASE_URL, {
    username: "tsadmin",
    password: "admin",
});


const instance = new PromiseManualTranslationApi(config);

describe('ManualTranslationApi', function() {


      describe('deleteManualTranslations', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "deleteManualTranslations"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.deleteManualTranslations(
                    // deleteManualTranslationsRequest DeleteManualTranslationsRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.deleteManualTranslations(
                    // deleteManualTranslationsRequest DeleteManualTranslationsRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('exportManualTranslations', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "exportManualTranslations"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.exportManualTranslations(
                    // exportManualTranslationsRequest ExportManualTranslationsRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.exportManualTranslations(
                    // exportManualTranslationsRequest ExportManualTranslationsRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('getManualTranslationBundle', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "getManualTranslationBundle"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.getManualTranslationBundle(
                    // locale locale
                    test.Path_Variables.locale    
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.getManualTranslationBundle(
                    // locale locale
                    test.Path_Variables.locale    
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('importManualTranslations', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "importManualTranslations"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.importManualTranslations(
                    // translationsFile translations_file
                        , 
                    // scope scope
                       
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.importManualTranslations(
                    // translationsFile translations_file
                        , 
                    // scope scope
                       
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });
});
