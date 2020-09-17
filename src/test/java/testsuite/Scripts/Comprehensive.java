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
 * date: /08/2020
 Customer is trying to buy the Comprehensive product
*/

public class Comprehensive extends HelperClass{
	
	@Test(dataProvider = "getTestData")
	 public void productComprehensive(Hashtable<String, String> data) throws Throwable 
	 {
		 try {
	            TestEngine.testDescription
	                    .put(HtmlReportSupport.tc_name, "comprehensive test case for star app");
	            
	            Startingpage();
	            
	           // login in to app
	            
	            Login(data.get("useremail"),data.get("userpass") );
	           
	            MenuButtonclick();
	           
	            Products(data.get("Selecttheproduct"));
	            
	            GetQuote();
	            
	            SelectingIwnattoInsure(data.get("selectwhomtoinsure"));
	            
	            GetquoteDatacom(data.get("Age"), data.get("CoverageAmount"),data.get("Periodofpolicy"));

	            Details(data.get("Address1"),data.get("Address2"),data.get("pincode"));
	            
	           // Payment(data.get("SelectCard"),data.get("Entercardnumber"),data.get("Nameincard"),data.get("month"),data.get("year"),data.get("Cvvnumber"));
		 }
		 catch (Exception e) {
	            Reporter.failureReport("Star ProductsEndtoEnd Scenario",
	                    "Failed with ");
	            e.printStackTrace();
	            flag = false;
	        }finally {
	            if (flag) {
	                Reporter.SuccessReport("Executed Star ProductsEndtoEnd Scenario",
	                        "Successful");
	            } else {

	                Reporter.failureReport("Star ProductsEndtoEnd Scenario",
	                        "Failed to Execute Star ProductsEndtoEnd Scenario");
	                Assert.assertTrue(flag == true,
	                        "Failed to Execute Star ProductsEndtoEnd Scenario");
	            }
	        }

}
	
	@DataProvider
    public static Object[][] getTestData() {
        return CommonDataProvider.getData("comprehensive");
    }
}


