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


      describe('createAgentConversation', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "createAgentConversation"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.createAgentConversation(
                    // createAgentConversationRequest CreateAgentConversationRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.createAgentConversation(
                    // createAgentConversationRequest CreateAgentConversationRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

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

      describe('deleteConversation', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "deleteConversation"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.deleteConversation(
                    // conversationIdentifier conversation_identifier
                    test.Path_Variables.conversation_identifier    
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.deleteConversation(
                    // conversationIdentifier conversation_identifier
                    test.Path_Variables.conversation_identifier    
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('getAgentInstructions', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "getAgentInstructions"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.getAgentInstructions(
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.getAgentInstructions(
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('getConversation', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "getConversation"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.getConversation(
                    // conversationIdentifier conversation_identifier
                    test.Path_Variables.conversation_identifier    
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.getConversation(
                    // conversationIdentifier conversation_identifier
                    test.Path_Variables.conversation_identifier    
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('getConversationList', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "getConversationList"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.getConversationList(
                    // limit limit
                        , 
                    // offset offset
                        , 
                    // skipEmpty skip_empty
                       
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.getConversationList(
                    // limit limit
                        , 
                    // offset offset
                        , 
                    // skipEmpty skip_empty
                       
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('getDataSourceSuggestions', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "getDataSourceSuggestions"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.getDataSourceSuggestions(
                    // getDataSourceSuggestionsRequest GetDataSourceSuggestionsRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.getDataSourceSuggestions(
                    // getDataSourceSuggestionsRequest GetDataSourceSuggestionsRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('getNLInstructions', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "getNLInstructions"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.getNLInstructions(
                    // getNLInstructionsRequest GetNLInstructionsRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.getNLInstructions(
                    // getNLInstructionsRequest GetNLInstructionsRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('getRelevantQuestions', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "getRelevantQuestions"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.getRelevantQuestions(
                    // getRelevantQuestionsRequest GetRelevantQuestionsRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.getRelevantQuestions(
                    // getRelevantQuestionsRequest GetRelevantQuestionsRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('loadAnswer', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "loadAnswer"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.loadAnswer(
                    // conversationIdentifier conversation_identifier
                    test.Path_Variables.conversation_identifier     , 
                    // answerIdentifier answer_identifier
                    test.Path_Variables.answer_identifier    
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.loadAnswer(
                    // conversationIdentifier conversation_identifier
                    test.Path_Variables.conversation_identifier     , 
                    // answerIdentifier answer_identifier
                    test.Path_Variables.answer_identifier    
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

      describe('sendAgentConversationMessage', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "sendAgentConversationMessage"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.sendAgentConversationMessage(
                    // conversationIdentifier conversation_identifier
                    test.Path_Variables.conversation_identifier     , 
                    // sendAgentConversationMessageRequest SendAgentConversationMessageRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.sendAgentConversationMessage(
                    // conversationIdentifier conversation_identifier
                    test.Path_Variables.conversation_identifier     , 
                    // sendAgentConversationMessageRequest SendAgentConversationMessageRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('sendAgentConversationMessageStreaming', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "sendAgentConversationMessageStreaming"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.sendAgentConversationMessageStreaming(
                    // conversationIdentifier conversation_identifier
                    test.Path_Variables.conversation_identifier     , 
                    // sendAgentConversationMessageStreamingRequest SendAgentConversationMessageStreamingRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.sendAgentConversationMessageStreaming(
                    // conversationIdentifier conversation_identifier
                    test.Path_Variables.conversation_identifier     , 
                    // sendAgentConversationMessageStreamingRequest SendAgentConversationMessageStreamingRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('sendAgentMessage', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "sendAgentMessage"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.sendAgentMessage(
                    // conversationIdentifier conversation_identifier
                    test.Path_Variables.conversation_identifier     , 
                    // sendAgentMessageRequest SendAgentMessageRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.sendAgentMessage(
                    // conversationIdentifier conversation_identifier
                    test.Path_Variables.conversation_identifier     , 
                    // sendAgentMessageRequest SendAgentMessageRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('sendAgentMessageStreaming', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "sendAgentMessageStreaming"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.sendAgentMessageStreaming(
                    // sendAgentMessageStreamingRequest SendAgentMessageStreamingRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.sendAgentMessageStreaming(
                    // sendAgentMessageStreamingRequest SendAgentMessageStreamingRequest
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

      describe('setAgentInstructions', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "setAgentInstructions"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.setAgentInstructions(
                    // setAgentInstructionsRequest SetAgentInstructionsRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.setAgentInstructions(
                    // setAgentInstructionsRequest SetAgentInstructionsRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('setNLInstructions', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "setNLInstructions"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.setNLInstructions(
                    // setNLInstructionsRequest SetNLInstructionsRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.setNLInstructions(
                    // setNLInstructionsRequest SetNLInstructionsRequest
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

      describe('stopConversation', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "stopConversation"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.stopConversation(
                    // conversationIdentifier conversation_identifier
                    test.Path_Variables.conversation_identifier    
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.stopConversation(
                    // conversationIdentifier conversation_identifier
                    test.Path_Variables.conversation_identifier    
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('updateConversation', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "updateConversation"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.updateConversation(
                    // conversationIdentifier conversation_identifier
                    test.Path_Variables.conversation_identifier     , 
                    // updateConversationRequest UpdateConversationRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.updateConversation(
                    // conversationIdentifier conversation_identifier
                    test.Path_Variables.conversation_identifier     , 
                    // updateConversationRequest UpdateConversationRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });
});
