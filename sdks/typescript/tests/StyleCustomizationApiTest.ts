import chai from "chai";
import chaiAsPromised from "chai-as-promised";
import { createBearerAuthenticationConfig } from "../utils/config";
import { PromiseStyleCustomizationApi } from "../types/PromiseAPI";
import requestBodies from "./testDataUpdated.json";

chai.use(chaiAsPromised);
const expect = chai.expect;



const baseUrlFromCli = process.argv.filter(s => s.startsWith("--baseUrl="))?.[0]?.split("=")?.[1]
const BASE_URL = baseUrlFromCli || "http://127.0.0.1:4123"
const config = createBearerAuthenticationConfig(BASE_URL, {
    username: "tsadmin",
    password: "admin",
});


const instance = new PromiseStyleCustomizationApi(config);

describe('StyleCustomizationApi', function() {


      describe('deleteStyleFonts', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "deleteStyleFonts"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.deleteStyleFonts(
                    // deleteStyleFontsRequest DeleteStyleFontsRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.deleteStyleFonts(
                    // deleteStyleFontsRequest DeleteStyleFontsRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('exportStyleLogos', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "exportStyleLogos"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.exportStyleLogos(
                    // exportStyleLogosRequest ExportStyleLogosRequest
                     test.Body    , 
                    // accept Accept
                       
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.exportStyleLogos(
                    // exportStyleLogosRequest ExportStyleLogosRequest
                     test.Body    , 
                    // accept Accept
                       
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('searchStyleCustomizations', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "searchStyleCustomizations"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.searchStyleCustomizations(
                    // searchStyleCustomizationsRequest SearchStyleCustomizationsRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.searchStyleCustomizations(
                    // searchStyleCustomizationsRequest SearchStyleCustomizationsRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('searchStyleFonts', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "searchStyleFonts"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.searchStyleFonts(
                    // searchStyleFontsRequest SearchStyleFontsRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.searchStyleFonts(
                    // searchStyleFontsRequest SearchStyleFontsRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('updateStyleCustomization', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "updateStyleCustomization"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.updateStyleCustomization(
                    // scope scope
                        , 
                    // operation operation
                        , 
                    // resetOptions reset_options
                        , 
                    // navigationPanel navigation_panel
                        , 
                    // chartColorPalette chart_color_palette
                        , 
                    // embeddedFooterText embedded_footer_text
                        , 
                    // visualizationFonts visualization_fonts
                        , 
                    // defaultLogo default_logo
                        , 
                    // wideLogo wide_logo
                       
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.updateStyleCustomization(
                    // scope scope
                        , 
                    // operation operation
                        , 
                    // resetOptions reset_options
                        , 
                    // navigationPanel navigation_panel
                        , 
                    // chartColorPalette chart_color_palette
                        , 
                    // embeddedFooterText embedded_footer_text
                        , 
                    // visualizationFonts visualization_fonts
                        , 
                    // defaultLogo default_logo
                        , 
                    // wideLogo wide_logo
                       
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('updateStyleFont', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "updateStyleFont"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.updateStyleFont(
                    // fontIdentifier font_identifier
                    test.Path_Variables.font_identifier     , 
                    // updateStyleFontRequest UpdateStyleFontRequest
                     test.Body   
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.updateStyleFont(
                    // fontIdentifier font_identifier
                    test.Path_Variables.font_identifier     , 
                    // updateStyleFontRequest UpdateStyleFontRequest
                     test.Body   
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });

      describe('uploadStyleFont', function() {

        const testReqBodies = requestBodies.filter(
          (body: any) => body.Metadata.operationId === "uploadStyleFont"
        );
        testReqBodies.forEach(async (test: any) => {
          it(`${test.Metadata.operationId} - ${test.Metadata.scenario} : Testid - ${test.Metadata.testId}`, async function () {
            
            if (test.Metadata.scenario === "positive") {         
              var data;
              try {
                data = await instance.uploadStyleFont(
                    // name name
                        , 
                    // fileContent file_content
                        , 
                    // scope scope
                        , 
                    // weight weight
                        , 
                    // style style
                        , 
                    // color color
                       
                )
              } catch (er) {
                console.error(er, "Response", data)
                expect(er).to.be.undefined
              }
            } else {
                await expect(
                  instance.uploadStyleFont(
                    // name name
                        , 
                    // fileContent file_content
                        , 
                    // scope scope
                        , 
                    // weight weight
                        , 
                    // style style
                        , 
                    // color color
                       
                  )
                ).to.be.rejectedWith(Error);
            }

          });
        });     
      });
});
