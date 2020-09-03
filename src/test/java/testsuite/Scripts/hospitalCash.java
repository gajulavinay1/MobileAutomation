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
 * date: 20/08/2020
@scenario : Customer is trying to buy the hospital cash product
*/

public class hospitalCash extends HelperClass {
	
	@Test(dataProvider = "getTestData")
	 public void productHospitalCash(Hashtable<String, String> data) throws Throwable 
	 {
		 try {
	            TestEngine.testDescription
	                    .put(HtmlReportSupport.tc_name, "Hospital cash test case for star app");
	            
	              Startingpage();
	            
	          // login in to app
	            
	            Login(data.get("useremail"),data.get("userpass") );
	            
	            
	            MenuButtonclick();
	            
	            //dragStar();
	            
	           //selecting the product
	            Products(data.get("Selecttheproduct"));
	            
	            GetQuote();
	            
	            SelectingIwnattoInsure(data.get("selectwhomtoinsure"));
	            
	            GetquoteData(data.get("productname"),data.get("Age"),data.get("CoverageAmount"),data.get("Periodofpolicy"),null,null,null,null,null,null,null,null,null,null,data.get("plantype"),data.get("coveragedays"),data.get("selectwhomtoinsure"),null,null,null);
	            
	            skipPolicyNumbers();
	            
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
        return CommonDataProvider.getData("hospitalcash");
    }
} 