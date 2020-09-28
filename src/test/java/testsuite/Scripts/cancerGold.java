package testsuite.Scripts;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import accelerators.TestEngine;
import support.CommonDataProvider;
import support.HtmlReportSupport;
import support.Reporter;
import testsuite.HelperClass;


/*@author : sangeetha 
 * date: 10/08/2020
@scenario : Customer is trying to buy the Cancer Gold product
*/

public class cancerGold extends HelperClass {
	
		@Test(dataProvider = "getTestData")
		 public void productCancerGold(Hashtable<String, String> data) throws Throwable 
		 {
			 try {
		            TestEngine.testDescription
		                    .put(HtmlReportSupport.tc_name, "cancergold test case for star app");
		            
		              Startingpage();
		            
		            //login in to app
		            Login(data.get("useremail"),data.get("userpass") );
		            
		            
		            //selecting products from the menu
		            MenuButtonclick();
		            
		            
		            
		           //selecting the cancer gold product
		            Products(data.get("Selecttheproduct"));
		            
		            //clicking get quote
		            GetQuote();
		            
		            getCancerGoldQuoteData(data.get("Age"),data.get("yearsormonths"),data.get("coverageamount"));
		            
		            detailsinCG(data.get("income"),data.get("GSTidnumber"),data.get("aadhar"),null);
		            
		            commuicationDetails(data.get("addressone"),data.get("addresstwo"),data.get("pin"));
		            
		            nomineeDetails(data.get("nomineename"),data.get("nomineeage"),data.get("perofclaim"));
		            
		            cancerGoldInsuredDetails(data.get("height"),data.get("weight"),data.get("datenstage"),data.get("chemodate"),data.get("tobaccoyears"));
		             
		            cancergoldSubmitproposal();
		           
		           // medicalDeclaration();
		            
		            
			 }

		            catch (Exception e) {
			            Reporter.failureReport("Star  cancer gold ProductsEndtoEnd Scenario",
			                    "Failed with ");
			            e.printStackTrace();
			            flag = false;
			        }finally {
			            if (flag) {
			                Reporter.SuccessReport("Executed Star cancer gold ProductsEndtoEnd Scenario",
			                        "Successful");
			            } else {

			                Reporter.failureReport("Star cancer gold ProductsEndtoEnd Scenario",
			                        "Failed to Execute Star ProductsEndtoEnd Scenario");
			                Assert.assertTrue(flag == true,
			                        "Failed to Execute Star cancer gold ProductsEndtoEnd Scenario");
			            }
			        }
		 }
		
		@DataProvider
	    public static Object[][] getTestData() {
	        return CommonDataProvider.getData("cancergold");
	    }
	}



