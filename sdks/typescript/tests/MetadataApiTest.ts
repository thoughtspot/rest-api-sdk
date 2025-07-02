import chai from "chai";
import chaiAsPromised from "chai-as-promised";
import { createBearerAuthenticationConfig } from "../utils/config";
import { PromiseMetadataApi } from "../types/PromiseAPI";
import requestBodies from "./testDataUpdated.json";

chai.use(chaiAsPromised);
const expect = chai.expect;



const baseUrlFromCli = process.argv.filter(s => s.startsWith("--baseUrl="))?.[0]?.split("=")?.[1]
const BASE_URL = baseUrlFromCli || "http://127.0.0.1:4123"
const config = createBearerAuthenticationConfig(BASE_URL, {
    username: "tsadmin",
    password: "admin",
});


const instance = new PromiseMetadataApi(config);

describe('MetadataApi', function() {


      describe('convertWorksheetToModel', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "convertWorksheetToModel"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.convertWorksheetToModel(
                    // convertWorksheetToModelRequest ConvertWorksheetToModelRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.convertWorksheetToModel(
                    // convertWorksheetToModelRequest ConvertWorksheetToModelRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('copyObject', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "copyObject"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.copyObject(
                    // copyObjectRequest CopyObjectRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.copyObject(
                    // copyObjectRequest CopyObjectRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('deleteMetadata', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "deleteMetadata"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.deleteMetadata(
                    // deleteMetadataRequest DeleteMetadataRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.deleteMetadata(
                    // deleteMetadataRequest DeleteMetadataRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('exportMetadataTML', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "exportMetadataTML"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.exportMetadataTML(
                    // exportMetadataTMLRequest ExportMetadataTMLRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.exportMetadataTML(
                    // exportMetadataTMLRequest ExportMetadataTMLRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('exportMetadataTMLBatched', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "exportMetadataTMLBatched"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.exportMetadataTMLBatched(
                    // exportMetadataTMLBatchedRequest ExportMetadataTMLBatchedRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.exportMetadataTMLBatched(
                    // exportMetadataTMLBatchedRequest ExportMetadataTMLBatchedRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('fetchAnswerSqlQuery', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "fetchAnswerSqlQuery"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.fetchAnswerSqlQuery(
                    // fetchAnswerSqlQueryRequest FetchAnswerSqlQueryRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.fetchAnswerSqlQuery(
                    // fetchAnswerSqlQueryRequest FetchAnswerSqlQueryRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('fetchAsyncImportTaskStatus', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "fetchAsyncImportTaskStatus"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.fetchAsyncImportTaskStatus(
                    // fetchAsyncImportTaskStatusRequest FetchAsyncImportTaskStatusRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.fetchAsyncImportTaskStatus(
                    // fetchAsyncImportTaskStatusRequest FetchAsyncImportTaskStatusRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('fetchLiveboardSqlQuery', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "fetchLiveboardSqlQuery"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.fetchLiveboardSqlQuery(
                    // fetchLiveboardSqlQueryRequest FetchLiveboardSqlQueryRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.fetchLiveboardSqlQuery(
                    // fetchLiveboardSqlQueryRequest FetchLiveboardSqlQueryRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('importMetadataTML', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "importMetadataTML"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.importMetadataTML(
                    // importMetadataTMLRequest ImportMetadataTMLRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.importMetadataTML(
                    // importMetadataTMLRequest ImportMetadataTMLRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('importMetadataTMLAsync', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "importMetadataTMLAsync"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.importMetadataTMLAsync(
                    // importMetadataTMLAsyncRequest ImportMetadataTMLAsyncRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.importMetadataTMLAsync(
                    // importMetadataTMLAsyncRequest ImportMetadataTMLAsyncRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('parameterizeMetadata', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "parameterizeMetadata"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.parameterizeMetadata(
                    // parameterizeMetadataRequest ParameterizeMetadataRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.parameterizeMetadata(
                    // parameterizeMetadataRequest ParameterizeMetadataRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('searchMetadata', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "searchMetadata"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.searchMetadata(
                    // searchMetadataRequest SearchMetadataRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.searchMetadata(
                    // searchMetadataRequest SearchMetadataRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('unparameterizeMetadata', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "unparameterizeMetadata"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.unparameterizeMetadata(
                    // unparameterizeMetadataRequest UnparameterizeMetadataRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.unparameterizeMetadata(
                    // unparameterizeMetadataRequest UnparameterizeMetadataRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('updateMetadataHeader', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "updateMetadataHeader"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.updateMetadataHeader(
                    // updateMetadataHeaderRequest UpdateMetadataHeaderRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.updateMetadataHeader(
                    // updateMetadataHeaderRequest UpdateMetadataHeaderRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('updateMetadataObjId', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "updateMetadataObjId"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.updateMetadataObjId(
                    // updateMetadataObjIdRequest UpdateMetadataObjIdRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.updateMetadataObjId(
                    // updateMetadataObjIdRequest UpdateMetadataObjIdRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });
});
