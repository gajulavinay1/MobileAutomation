package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import accelerators.ActionEngine;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;

import java.util.List;

public class PageLocator extends ActionEngine {

	//StarHealth APK Testing  Home to Rigister Loactors
	public static By LoginButton = By.xpath("//*[contains(@text,'LOGIN')]");
	public static By next1 = By.xpath("(//*[contains(@text,'Next')])[3]");
	public static By next2 = By.xpath("(//*[contains(@text,'Next')])[3]");
	public static By next3 = By.xpath("(//*[contains(@text,'Next')])[3]");
	public static By next4 = By.xpath("(//*[contains(@text,'Next')])[3]");
	public static By next5 = By.xpath("(//*[contains(@text,'Next')])[3]");
	public static By next6 = By.xpath("(//*[contains(@text,'Next')])[3]");
	public static By Done = By.xpath("(//*[contains(@text,'Done')])[3]");
	public static By Register = By.xpath("//*[contains(@text,'Register Now')]");
	public static By FirstName = By.xpath("(//* [@class='android.widget.EditText'])[1]");
	public static By LastName = By.xpath("(//* [@class='android.widget.EditText'])[2]");
	//public static By Random = By.xpath("//*[contains(@text,'May I know your name?')]");
	public static By LetsStartButton = By.className("android.widget.Button");
	//public static By LetsStartButton = By.xpath("//*[contains(@text,'LET'S START')]");
	public static By MobileNumber = By.xpath("(//* [@class='android.widget.EditText'])[1]");
	public static By Email = By.xpath("(//* [@class='android.widget.EditText'])[2]");
	public static By Password = By.xpath("(//* [@class='android.widget.EditText'])[3]");
	public static By ConfPassword = By.xpath("(//* [@class='android.widget.EditText'])[4]");
	public static By ContinueButton = By.xpath("//*[contains(@text,'CONTINUE')]");
	//Enter OTP Here
	public static By Selectotpfield = By.xpath("(//* [@class='android.widget.EditText'])[1]");
	public static By Verify = By.xpath("(//* [@class='android.widget.Button'])[1]");
	public static By regsuccess = By.xpath("(//* [@class='android.widget.Button'])[2]");
	//public static By UpdateName = By.xpath("(//* [@class='android.widget.EditText'])[1]");
	//public static By UpdateButton = By.xpath("(//* [@class='android.widget.Button'])[2]");
	public static By PersonalizationSkip = By.xpath("(//* [@class='android.widget.Button'])[3]");
	public static By LinkPolicySkip = By.xpath("(//* [@class='android.widget.Button'])[1]");
	//Rigistration Flow ends here


	//Login Flow
	public static By staremail = By.xpath("(//*[@class='android.widget.EditText'])[1]");
	public static By starpassword = By.xpath("(//*[@class='android.widget.EditText'])[2]");
	public static By continuebutton = By.xpath("//*[contains(@text,'CONTINUE')]");
	public static By opendrawer = By.xpath("//*[contains(@text,'open drawer')]");
	public static By products = By.xpath("(//*[@class='android.widget.Button'])[3]");

	//Products Selection
	public static String Products="//*[contains(@text,'#')]";

	public static By Comprehensive = By.xpath("//*[contains(@text,'Comprehensive Your family deserves the best care. Health Insurance up to 1 Crore.')]");
	public static By SuperSurplus = By.xpath("//*[contains(@text,'Super Surplus – Top up Cover More for less – Get more value for a nominal extra price. Ensure peace of mind.')]");
	public static By FamilyHealthOptima = By.xpath("//*[contains(@text,'Family Health Optima – FHO Optimum cover for your loved ones at an affordable cost.')]");

	public static By Mediclassic = By.xpath("//*[contains(@text,'Mediclassic - MCI Feature packed must have minimum health insurance. Look for nothing else.')]");
	public static By CoronaVirusPolicy = By.xpath("//*[contains(@text,'Corona Virus Policy - COVID An affordable care policy for you and your loved ones in the event of COVID-19 (novel coronavirus).')]");
	public static By HealthGain = By.xpath("//*[contains(@text,'Health Gain The Best of In-Patient and Out-Patient cover. Gain all the way and plan your taxes better.')]");

	public static By DiabetesSafe = By.xpath("//*[contains(@text,'Diabetes Safe A complete health plan for known diabetics.')]");
	public static By Cardiaccare = By.xpath("//*[contains(@text,'Cardiac care Hearty welcome to those who underwent a CABG or PTCA. You can still stay insured.')]");
	public static By CancerGold  = By.xpath("//*[contains(@text,'Cancer Gold Cancer survivors need not worry any more. This one is just for you.')]");

	public static By ArogyaSanjeev = By.xpath("//*[contains(@text,'Arogya Sanjeev A simple policy loaded with essential benefits.')]");
	public static By StarCareMicro = By.xpath("//*[contains(@text,'Star Care Micro Insurance Policy A complete care policy for you and your family.')]");
	public static By StarCriticarePlus = By.xpath("//*[contains(@text,'Star Criticare Plus Insurance Policy Protection policy with critical benefits and special advantages.')]");

	public static By StarFamilyDelite = By.xpath("//*[contains(@text,'Star Family Delite Insurance Policy A health insurance plan meant for families with multiple benefits.')]");
	public static By Specialcare = By.xpath("//*[contains(@text,'Special care We understand your needs, best. Autism is an inclusion under this specially curated policy.')]");
	public static By MicroRuralSimple = By.xpath("//*[contains(@text,'Micro Rural Simple. Affordable. Empowering. You are no longer dependent for any Hospitalisation.')]");

	public static By HospitalCash = By.xpath("//*[contains(@text,'Hospital Cash No worries about your Incidental expenses during hospitalisation.')]");
	public static By OutpatientCare = By.xpath("//*[contains(@text,'Outpatient Care')]");
	public static By YoungStarBuy = By.xpath("//*[contains(@text,'Young Star Buy Young Star when you are young. Get ceaseless protection and cheer lifelong.')]");

	// After selecting the product click on get quote
	public static By Clickongetquote = By.xpath("//*[contains(@text,'GET QUOTE')]");
	//After get quote need to enter details
	public static By clickonchoose = By.xpath("//*[contains(@text,'Choose')]");
	public static String IwnattoInsure = "//*[contains(@text,'#')]";

	//Select the option
	//public static By Myself = By.xpath("//*[contains(@text,'Myself')]");
	//public static By MyselfandSpouse = By.xpath("//*[contains(@text,'Myself and My Spouse')]");
	//public static By MyselfandKids= By.xpath("//*[contains(@text,'Myself and My Kids')]");
	//public static By MyselfSpouseandKids = By.xpath("//*[contains(@text,'Myself, Spouse and My Kids')]");

	//Myself and Myspouse Locators
	//public static By Ageclick=By.id("age");
	public static By Ageclick = By.xpath("(//*[@class='android.widget.EditText'])");
	public static By Kidageclick = By.xpath("//*[contains(@resource-id,'kids')]");
	public static String Years = "//*[contains(@text,'#')]";

	//public static By Year1 = By.xpath("//*[contains(@text,'1')]");
	//public static By Year2 = By.xpath("//*[contains(@text,'2')]");
	//public static By Year3 = By.xpath("//*[contains(@text,'3')]");

	public static By PolicyCoverclick=By.xpath("//*[contains(@resource-id,'policy_cover')]");
	public static String CoverageAMount = "//*[contains(@text,'#')]";
	//public static By CoverateAMount1 = By.xpath("//*[contains(@text,'5 Lakhs')]");
	//public static By CoverateAMount2 = By.xpath("//*[contains(@text,'7.5 Lakhs')]");
	//public static By CoverateAMount3 = By.xpath("//*[contains(@text,'10 Lakhs')]");
	//public static By CoverateAMount4 = By.xpath("//*[contains(@text,'15 Lakhs')]");
	//public static By CoverateAMount5 = By.xpath("//*[contains(@text,'20 Lakhs')]");
	//public static By CoverateAMount6 = By.xpath("//*[contains(@text,'25 Lakhs')]");
	//public static By CoverateAMount7 = By.xpath("//*[contains(@text,'50 Lakhs')]");
	//public static By CoverateAMount8 = By.xpath("//*[contains(@text,'75 Lakhs')]");
	//public static By CoverateAMount9 = By.xpath("//*[contains(@text,'1 Crore')]");


	public static By Policyperiodclick = By.xpath("//*[contains(@text,'Choose')]");
	public static String PolicyPeriod = "//*[contains(@text,'#')]";
	//public static By PolicyPeriod1 = By.xpath("//*[contains(@text,'1 year')]");
	//public static By PolicyPeriod2 = By.xpath("//*[contains(@text,'2 year')]");
	public static By GetQuote=By.xpath("//*[contains(@text,'GET QUOTE')]");
	//public static By BuyNow = By.xpath("//*[contains(@text,'BUY NOW')]");
	public static By BuyNow = By.xpath("(//*[@class='android.widget.Button'])[1]");


	//24/02/1993
	public static By DOB=By.xpath("//*[contains(@resource-id,'dob')]");
	//public static By Enterdob = By.xpath("(//*[contains(@text,'5')])[4]");
	public static By addressOne=By.xpath("//*[contains(@resource-id,'addressOne')]");
	public static By addressTwo=By.xpath("//*[contains(@resource-id,'addressTwo')]");
	public static By pinCode=By.xpath("//*[contains(@resource-id,'pinCode')]");
	public static By InsurerDOB=By.xpath("//*[contains(@resource-id,'insurer_dob')]");
	//public static By EnterInsurerDOB=By.xpath("(//*[contains(@text,'5')])[5]");
	//BuyNow
	public static By AgreeTC=By.xpath("//*[contains(@text,'I Agreed to the Terms and Conditionsand authorize Star Health insurance to contact me.')]");
	//public static By GotIt=By.xpath("//*[contains(@text,'GOT IT!')]");
	public static By GotIt = By.xpath("(//*[@class='android.widget.Button'])[3]");

	//CardDetails/Payment
	public static String Debitorcreditcard = "//*[contains(@text,'#')]";
	//public static By CreditCard=By.xpath("//*[contains(@text,'Credit Card')]");
	//public static By DebitCard=By.xpath("//*[contains(@text,'Debit Card')]");
	public static By CardNumber = By.xpath("(//*[@class='android.widget.EditText'])[1]");
	public static By Nameoncard = By.xpath("(//*[@class='android.widget.EditText'])[2]");
	public static By ExpiryMonth=By.xpath("//*[contains(@text,'MM')]");
	public static String SelectMonth= "//*[contains(@text,'#')]";
	public static By ExpiryYear=By.xpath("//*[contains(@text,'YY')]");
	public static String SelectYear="//*[contains(@text,'#')]";
	public static By CVV = By.xpath("(//*[@class='android.widget.EditText'])[3]");
	public static By PaynowButton=By.xpath("//*[contains(@text,'Pay Now')]");

  //2nd product
	//Add Age and kidage from existing
    public static By Policytypeclick=By.xpath("//*[contains(@text,'Choose')]");
    //public static By Policytypeclick = By.xpath("(//*[@class='android.view.View'])[4]");
	public static By Policytype=By.xpath("//*[contains(@text,'Floater')]");
	//public static By liketobuyclick = By.xpath("(//*[@class='android.view.View'])[4]");
	public static By liketobuyclick=By.xpath("//*[contains(@text,'Choose')]");
	public static String SelectPlan="//*[contains(@text,'#')]";
	//Gold Plan or Silver Plan
	//public static By Deductiblesclick = By.xpath("(//*[@class='android.view.View'])[4]");
	public static By Deductiblesclick=By.xpath("//*[contains(@text,'Choose')]");
	public static String SelectDeduamount="//*[contains(@text,'#')]";
	//Coverage Amount //3 Lakhs , 5 Lakhs , 10 Lakhs
	public static By Pincode=By.xpath("//*[contains(@resource-id,'pincode')]");
	//android.widget.EditText













	public static By EnterName = By.xpath("(//* [@class='android.widget.EditText'])[1]");
	public static By ExistingCust = By.xpath("//*[contains(@text,'Existing Customer')]");
	public static By NewCust = By.xpath("//*[contains(@text,'New Customer')]");
	public static By Agent = By.xpath("//*[contains(@text,'Agent')]");
	public static By Others = By.xpath("//*[contains(@text,'Other')]");
	//If new Customer use Mobileoremail
	public static By Mobileoremail = By.xpath("(//* [@class='android.widget.EditText'])[2]");
	public static By LetsChatButton = By.xpath("//*[contains(@text,'Let's Chat')]");
	public static By Policies = By.xpath("//*[contains(@text,'Policies')]");
	public static By Claims = By.xpath("//*[contains(@text,'Claims')]");
	public static By Checkup = By.xpath("//*[contains(@text,'Health Checkup')]");
	public static By Hospitalization = By.xpath("//*[contains(@text,'Hospitalization')]");
	public static By WhyStar = By.xpath("//*[contains(@text,'Why Star')]");
	public static By Queries = By.xpath("//*[contains(@text,'Common Queries')]");
	//After Selecting chat window open
	public static By Chatwindow = By.xpath("//*[contains(@text,'Buy Now')]");
	public static By Chrome = By.xpath("//*[contains(@text,'Chrome')]");

}

