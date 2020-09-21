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

public class SFDIP extends HelperClass {
	
	@Test(dataProvider = "getTestData")
	 public void productSFDIP(Hashtable<String, String> data) throws Throwable 
	 {
		 try {
	            TestEngine.testDescription
	                    .put(HtmlReportSupport.tc_name, "star Family Delite Insurance policy  test case for star app");
	            
	              Startingpage();
	            
	          // login in to app
	            
	            Login(data.get("useremail"),data.get("userpass") );
	            
	            
	            MenuButtonclick();
	            
	            //dragStar();
	            
	           //selecting the product
	            Products(data.get("Selecttheproduct"));
	            
	            GetQuote();
	            
	            SelectingIwnattoInsure(data.get("selectwhomtoinsure"));
	            
	            GetquoteData(data.get("productname"),data.get("Age"),data.get("CoverageAmount"),null,null,null,null,null,null,null,null,null,null,null,null,null,data.get("selectwhomtoinsure"),null,data.get("numofkids"),null);
	            
	           shareQuote();
	            
	          
	            
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
        return CommonDataProvider.getData("SFDIP");
    }
} 
