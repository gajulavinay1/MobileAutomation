package testsuite.Scripts;

import accelerators.TestEngine;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import support.CommonDataProvider;
import support.HtmlReportSupport;
import support.Reporter;
import testsuite.HelperClass;

import java.util.Hashtable;

public class ProductsEndtoEnd extends HelperClass {

    @Test(dataProvider = "getTestData")
    public void testEndtoEndCareScenario(Hashtable<String, String> data) throws Throwable {
        //@author :  Vinay Gajula
        //@scenario : Login->User Registration
        try {
            TestEngine.testDescription
                    .put(HtmlReportSupport.tc_name, " TC-02 Case 2 : Star ProductsEndtoEnd Scenario");

            Startingpage();

            Login(data.get("useremail"),data.get("userpass"));

            MenuButtonclick();
            //Here we need to select the product with the help of names

            Products(data.get("Selecttheproduct"));

            GetQuote();

            SelectingIwnattoInsure(data.get("selectwhomtoinsure"));

            GetquoteData(data.get("ProductName"),data.get("Age"),data.get("CoverageAmount"),data.get("Periodofpolicy"),data.get("Selecttheplan"),data.get("Deductamount"),data.get("zipcode"),null);

            Details(data.get("Address1"),data.get("Address2"),data.get("pincode"));

            Payment(data.get("SelectCard"),data.get("Entercardnumber"),data.get("Nameincard"),data.get("month"),data.get("year"),data.get("Cvvnumber"));

            flag = true;
        }
        catch (Exception e) {
            Reporter.failureReport("Star ProductsEndtoEnd Scenario",
                    "Failed with ");
            e.printStackTrace();
            flag = false;
        }finally {
            if (flag) {
                Reporter.SuccessReport("Executed Star ProductsEndtoEnd Scenario",
                        "ProductsEndtoEnd Successful");
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
        return CommonDataProvider.getData("StarProduct");
    }
}
