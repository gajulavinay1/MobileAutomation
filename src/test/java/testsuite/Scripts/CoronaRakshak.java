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
 * date: 21/09/2020
@scenario : Customer is trying to buy the Corona rakshak  product
*/

public class CoronaRakshak extends HelperClass

{
	
	@Test(dataProvider = "getTestData")
	 public void productCoronaRakshak(Hashtable<String, String> data) throws Throwable 
	 {
		 try {
	            TestEngine.testDescription
	                    .put(HtmlReportSupport.tc_name, "corona rakshak test case for star app");
	            
	              Startingpage();
	            
	          // login in to app
	            
	            Login(data.get("useremail"),data.get("userpass") );
	            
	            
	            MenuButtonclick();
	            
	            //dragStar();
	            
	           //selecting the product
	            Products(data.get("Selecttheproduct"));
	            
	            GetQuote();
	            
	            SelectingIwnattoInsure(data.get("selectwhomtoinsure"));
	            
	            getCoronaRakshakQuoteData(data.get("Age"),data.get("CoverageAmount"),data.get("yearsormonths"),data.get("policyperiod"),data.get("pincode"));
	            
	            detailsinCV(data.get("income"),data.get("GSTidnumber"),data.get("aadhar"),null,data.get("addressone"),data.get("addresstwo"),data.get("pin"),data.get("nomineename"),data.get("nomineeage"),data.get("perofclaim"),data.get("height"),data.get("weight"));
	           
	            insuredDetails(data.get("height"),data.get("weight"),null,"SELF",null);
	            
	            clicknext();
	            
	            submitProposal_Fileupload();
	           
	            medicalDeclaration();
		 }

	            catch (Exception e) {
		            Reporter.failureReport("Star cororna rakshak ProductEndtoEnd Scenario",
		                    "Failed with ");
		            e.printStackTrace();
		            flag = false;
		        }finally {
		            if (flag) {
		                Reporter.SuccessReport("Executed Star corona rakshak Product EndtoEnd Scenario",
		                        "Successful");
		            } else {

		                Reporter.failureReport("Star corona rakshak  Product EndtoEnd Scenario",
		                        "Failed to Execute Star ProductsEndtoEnd Scenario");
		                Assert.assertTrue(flag == true,
		                        "Failed to Execute Star corona rakshak Product EndtoEnd Scenario");
		            }
		        }
	 }
	
	@DataProvider
    public static Object[][] getTestData() {
        return CommonDataProvider.getData("coronarakshak");
    }
}

