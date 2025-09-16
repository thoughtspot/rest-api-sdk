import chai from "chai";
import chaiAsPromised from "chai-as-promised";
import { createBearerAuthenticationConfig } from "../utils/config";
import { PromiseDBTApi } from "../types/PromiseAPI";
import requestBodies from "./testDataUpdated.json";

chai.use(chaiAsPromised);
const expect = chai.expect;



const baseUrlFromCli = process.argv.filter(s => s.startsWith("--baseUrl="))?.[0]?.split("=")?.[1]
const BASE_URL = baseUrlFromCli || "http://127.0.0.1:4123"
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
                    // connectionName connection_name
                        , 
                    // databaseName database_name
                        , 
                    // importType import_type
                        , 
                    // accessToken access_token
                        , 
                    // dbtUrl dbt_url
                        , 
                    // accountId account_id
                        , 
                    // projectId project_id
                        , 
                    // dbtEnvId dbt_env_id
                        , 
                    // projectName project_name
                        , 
                    // fileContent file_content
                       
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.dbtConnection(
                    // connectionName connection_name
                        , 
                    // databaseName database_name
                        , 
                    // importType import_type
                        , 
                    // accessToken access_token
                        , 
                    // dbtUrl dbt_url
                        , 
                    // accountId account_id
                        , 
                    // projectId project_id
                        , 
                    // dbtEnvId dbt_env_id
                        , 
                    // projectName project_name
                        , 
                    // fileContent file_content
                       
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('dbtGenerateSyncTml', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "dbtGenerateSyncTml"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.dbtGenerateSyncTml(
                    // dbtConnectionIdentifier dbt_connection_identifier
                        , 
                    // fileContent file_content
                       
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.dbtGenerateSyncTml(
                    // dbtConnectionIdentifier dbt_connection_identifier
                        , 
                    // fileContent file_content
                       
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('dbtGenerateTml', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "dbtGenerateTml"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.dbtGenerateTml(
                    // dbtConnectionIdentifier dbt_connection_identifier
                        , 
                    // importWorksheets import_worksheets
                        , 
                    // modelTables model_tables
                        , 
                    // worksheets worksheets
                        , 
                    // fileContent file_content
                       
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.dbtGenerateTml(
                    // dbtConnectionIdentifier dbt_connection_identifier
                        , 
                    // importWorksheets import_worksheets
                        , 
                    // modelTables model_tables
                        , 
                    // worksheets worksheets
                        , 
                    // fileContent file_content
                       
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

      describe('deleteDbtConnection', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "deleteDbtConnection"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.deleteDbtConnection(
                    // dbtConnectionIdentifier dbt_connection_identifier
                    test.Path_Variables.dbt_connection_identifier    
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.deleteDbtConnection(
                    // dbtConnectionIdentifier dbt_connection_identifier
                    test.Path_Variables.dbt_connection_identifier    
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
                        , 
                    // connectionName connection_name
                        , 
                    // databaseName database_name
                        , 
                    // importType import_type
                        , 
                    // accessToken access_token
                        , 
                    // dbtUrl dbt_url
                        , 
                    // accountId account_id
                        , 
                    // projectId project_id
                        , 
                    // dbtEnvId dbt_env_id
                        , 
                    // projectName project_name
                        , 
                    // fileContent file_content
                       
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.updateDbtConnection(
                    // dbtConnectionIdentifier dbt_connection_identifier
                        , 
                    // connectionName connection_name
                        , 
                    // databaseName database_name
                        , 
                    // importType import_type
                        , 
                    // accessToken access_token
                        , 
                    // dbtUrl dbt_url
                        , 
                    // accountId account_id
                        , 
                    // projectId project_id
                        , 
                    // dbtEnvId dbt_env_id
                        , 
                    // projectName project_name
                        , 
                    // fileContent file_content
                       
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });
});
