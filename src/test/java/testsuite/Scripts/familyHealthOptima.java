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

public class familyHealthOptima extends HelperClass{
	
	@Test(dataProvider = "getTestData")
	 public void FHO(Hashtable<String, String> data) throws Throwable 
	 {
		 try {
	            TestEngine.testDescription
	                    .put(HtmlReportSupport.tc_name, "FHO test case for star app");
	            
	            Startingpage();
	            
	           // login in to app
	            
	            Login(data.get("useremail"),data.get("userpass") );
	           
	            MenuButtonclick();
	           
	            Products(data.get("Selecttheproduct"));
	            
	            GetQuote();
	            
	            SelectingIwnattoInsure(data.get("selectwhomtoinsure"));
	            
	            GetquoteDatafho(data.get("Age"), data.get("CoverageAmount"),data.get("livein"));

	            Details(data.get("Address1"),data.get("Address2"),data.get("pincode"));
	            
	            //Payment(data.get("SelectCard"),data.get("Entercardnumber"),data.get("Nameincard"),data.get("month"),data.get("year"),data.get("Cvvnumber"));
		 }
		 catch (Exception e) {
	            Reporter.failureReport("Star ProductsEndtoEnd Scenario",
	                    "Failed with ");
	            e.printStackTrace();
	            flag = false;
	        }finally {
	            if (flag) {
	                Reporter.SuccessReport("Executed Star Family Health optima ProductsEndtoEnd Scenario",
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
        return CommonDataProvider.getData("fho");
    }
}

