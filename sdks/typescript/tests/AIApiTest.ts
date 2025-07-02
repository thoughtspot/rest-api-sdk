import chai from "chai";
import chaiAsPromised from "chai-as-promised";
import { createBearerAuthenticationConfig } from "../utils/config";
import { PromiseAIApi } from "../types/PromiseAPI";
import requestBodies from "./testDataUpdated.json";

chai.use(chaiAsPromised);
const expect = chai.expect;



const baseUrlFromCli = process.argv.filter(s => s.startsWith("--baseUrl="))?.[0]?.split("=")?.[1]
const BASE_URL = baseUrlFromCli || "http://127.0.0.1:4123"
const config = createBearerAuthenticationConfig(BASE_URL, {
    username: "tsadmin",
    password: "admin",
});


const instance = new PromiseAIApi(config);

describe('AIApi', function() {


      describe('createConversation', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "createConversation"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.createConversation(
                    // createConversationRequest CreateConversationRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.createConversation(
                    // createConversationRequest CreateConversationRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('queryGetDecomposedQuery', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "queryGetDecomposedQuery"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.queryGetDecomposedQuery(
                    // queryGetDecomposedQueryRequest QueryGetDecomposedQueryRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.queryGetDecomposedQuery(
                    // queryGetDecomposedQueryRequest QueryGetDecomposedQueryRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('sendMessage', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "sendMessage"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.sendMessage(
                    // conversationIdentifier conversation_identifier
                    test.Path_Variables.conversation_identifier     , 
                    // sendMessageRequest SendMessageRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.sendMessage(
                    // conversationIdentifier conversation_identifier
                    test.Path_Variables.conversation_identifier     , 
                    // sendMessageRequest SendMessageRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('singleAnswer', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "singleAnswer"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.singleAnswer(
                    // singleAnswerRequest SingleAnswerRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.singleAnswer(
                    // singleAnswerRequest SingleAnswerRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });
});
