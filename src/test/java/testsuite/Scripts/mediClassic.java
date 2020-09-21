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
 * date : 14/08/2020
@scenario : Customer is trying to buy the medicalssic product
*/
public class mediClassic extends HelperClass{
	
	@Test(dataProvider = "getTestData")
	 public void MediClassic(Hashtable<String, String> data) throws Throwable 
	 {
		 try {
	            TestEngine.testDescription
	                    .put(HtmlReportSupport.tc_name, " mediclassic test case for star app");
	            
	            Startingpage();
	            
	           // login in to app
	            
	            Login(data.get("useremail"),data.get("userpass") );
	           
	            MenuButtonclick();
	           
	            Products(data.get("Selecttheproduct"));
	            
	            GetQuote();
	            
	            GetquoteData(data.get("productname"),data.get("Age"),data.get("CoverageAmount"), data.get("Periodofpolicy"),data.get("Selecttheplan"),null,data.get("zipcode"),data.get("yearsormonths"),null,null,null,null,null,null,null,null,null,null,null,null);

	            mediClassicDetails(data.get("Address1"),data.get("Address2"),data.get("pincode"));
	            
	            //Payment(data.get("SelectCard"),data.get("Entercardnumber"),data.get("Nameincard"),data.get("month"),data.get("year"),data.get("Cvvnumber"));
		 }
		 catch (Exception e) {
	            Reporter.failureReport("Star ProductsEndtoEnd Scenario",
	                    "Failed with ");
	            e.printStackTrace();
	            flag = false;
	        }finally {
	            if (flag) {
	                Reporter.SuccessReport("Executed Star MediClassic  ProductsEndtoEnd Scenario",
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
        return CommonDataProvider.getData("mediclassic");
    }
}
