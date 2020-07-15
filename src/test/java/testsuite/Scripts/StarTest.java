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

public class StarTest extends HelperClass {

    @Test(dataProvider = "getTestData")
    public void testEndtoEndCareScenario(Hashtable<String, String> data) throws Throwable {
        //@author :  Vinay Gajula
        //@scenario : Login->User Registration
        try {
            TestEngine.testDescription
                    .put(HtmlReportSupport.tc_name, " TC-01 Case 1 : Star Registration Scenario");

            Startingpage();

            LoginRegistration(data.get("firstName"),data.get("lastName"));

            Registration(data.get("MobileNumber"),data.get("email"),data.get("password"),data.get("confpassword"));

            flag = true;
        }
        catch (Exception e) {
            Reporter.failureReport("Star Registration Scenario",
                    "Failed");
            e.printStackTrace();
            flag = false;
        }finally {
            if (flag) {
                Reporter.SuccessReport("Executed Star Registration Scenario",
                        "Successful");
            } else {

                Reporter.failureReport("Star Registration Scenario",
                        "Failed to Execute Star Registration Scenario");
                Assert.assertTrue(flag == true,
                        "Failed to Execute Star Registration Scenario");
            }
        }
    }

    @DataProvider
    public static Object[][] getTestData() {
        return CommonDataProvider.getData("Registration");
    }
}
