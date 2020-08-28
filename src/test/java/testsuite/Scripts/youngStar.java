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

public class youngStar extends HelperClass {
	
	@Test(dataProvider = "getTestData")
	 public void productYoungStar(Hashtable<String, String> data) throws Throwable 
	 {
		 try {
	            TestEngine.testDescription
	                    .put(HtmlReportSupport.tc_name, "Young star test case for star app");
	            
	              Startingpage();
	            
	          // login in to app
	            
	            Login(data.get("useremail"),data.get("userpass") );
	            
	            
	            MenuButtonclick();
	            
	            //dragStar();
	            
	           //selecting the product
	            Products(data.get("Selecttheproduct"));
	            
	            GetQuote();
	            
	            SelectingIwnattoInsure(data.get("selectwhomtoinsure"));
	            
	            GetquoteData(data.get("productname"),data.get("Age"),data.get("CoverageAmount"),data.get("Periodofpolicy"),data.get("Selecttheplan"),null,null,null,null,null,null,null,null,null,null,null,data.get("selectwhomtoinsure"),data.get("numofmembers"),null);
	            
	           
	            
	            detailsinAS(data.get("income"),data.get("GSTidnumber"),data.get("aadhar"),null,data.get("addressone"),data.get("addresstwo"),data.get("pin"),data.get("nomineename"),data.get("nomineeage"),data.get("perofclaim"),data.get("height"),data.get("weight"));
	            
	            submitProposal();
	           
	            fileUpload();
	            
	            
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
        return CommonDataProvider.getData("youngstar");
    }
}  

