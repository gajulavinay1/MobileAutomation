package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import accelerators.ActionEngine;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;

import java.util.List;

public class PageLocator extends ActionEngine {

	//StarHealth APK Testing  Home to Rigister Loactors
	public static By LoginButton = By.xpath("//*[contains(@text,'LOGIN')]");
	
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


	
	//After get quote need to enter details
	public static By clickonchoose = By.xpath("//*[contains(@text,'Choose')]");
	

	//Select the option
	//public static By Myself = By.xpath("//*[contains(@text,'Myself')]");
	//public static By MyselfandSpouse = By.xpath("//*[contains(@text,'Myself and My Spouse')]");
	//public static By MyselfandKids= By.xpath("//*[contains(@text,'Myself and My Kids')]");
	//public static By MyselfSpouseandKids = By.xpath("//*[contains(@text,'Myself, Spouse and My Kids')]");

	//Myself and Myspouse Locators
	//public static By Ageclick=By.id("age");
	public static By Ageclick = By.xpath("(//*[@class='android.widget.EditText'])");
	
	public static String Years = "//*[contains(@text,'#')]";

	//public static By Year1 = By.xpath("//*[contains(@text,'1')]");
	//public static By Year2 = By.xpath("//*[contains(@text,'2')]");
	//public static By Year3 = By.xpath("//*[contains(@text,'3')]");

	
	//public static String CoverageAMount = "//*[contains(@text,'#')]";
	//public static By CoverateAMount1 = By.xpath("//*[contains(@text,'5 Lakhs')]");
	//public static By CoverateAMount2 = By.xpath("//*[contains(@text,'7.5 Lakhs')]");
	//public static By CoverateAMount3 = By.xpath("//*[contains(@text,'10 Lakhs')]");
	//public static By CoverateAMount4 = By.xpath("//*[contains(@text,'15 Lakhs')]");
	//public static By CoverateAMount5 = By.xpath("//*[contains(@text,'20 Lakhs')]");
	//public static By CoverateAMount6 = By.xpath("//*[contains(@text,'25 Lakhs')]");
	//public static By CoverateAMount7 = By.xpath("//*[contains(@text,'50 Lakhs')]");
	//public static By CoverateAMount8 = By.xpath("//*[contains(@text,'75 Lakhs')]");
	//public static By CoverateAMount9 = By.xpath("//*[contains(@text,'1 Crore')]");


	//public static By Policyperiodclick = By.xpath("//*[contains(@text,'Choose')]");
	//public static String PolicyPeriod = "//*[contains(@text,'#')]";
	//public static By PolicyPeriod1 = By.xpath("//*[contains(@text,'1 year')]");
	//public static By PolicyPeriod2 = By.xpath("//*[contains(@text,'2 year')]");
	public static By GetQuote=By.xpath("//*[contains(@text,'GET QUOTE')]");
	//public static By BuyNow = By.xpath("//*[contains(@text,'BUY NOW')]");
	public static By BuyNow = By.xpath("(//*[@class='android.widget.Button'])[1]");


	//24/02/1993
	//public static By DOB=By.xpath("//*[contains(@resource-id,'dob')]");
	//public static By Enterdob = By.xpath("(//*[contains(@text,'5')])[4]");
	//public static By addressOne=By.xpath("//*[contains(@resource-id,'addressOne')]");
	//public static By addressTwo=By.xpath("//*[contains(@resource-id,'addressTwo')]");
	//public static By pinCode=By.xpath("//*[contains(@resource-id,'pinCode')]");
	//public static By InsurerDOB=By.xpath("//*[contains(@resource-id,'insurer_dob')]");
	//public static By EnterInsurerDOB=By.xpath("(//*[contains(@text,'5')])[5]");
	//BuyNow
	//public static By AgreeTC=By.xpath("//*[contains(@text,'I Agreed to the Terms and Conditionsand authorize Star Health insurance to contact me.')]");
	//public static By GotIt=By.xpath("//*[contains(@text,'GOT IT!')]");
	//public static By GotIt = By.xpath("(//*[@class='android.widget.Button'])[3]");

	//CardDetails/Payment
	//public static String Debitorcreditcard = "//*[contains(@text,'#')]";
	//public static By CreditCard=By.xpath("//*[contains(@text,'Credit Card')]");
	//public static By DebitCard=By.xpath("//*[contains(@text,'Debit Card')]");
	//public static By CardNumber = By.xpath("(//*[@class='android.widget.EditText'])[1]");
	//public static By Nameoncard = By.xpath("(//*[@class='android.widget.EditText'])[2]");
	//public static By ExpiryMonth=By.xpath("//*[contains(@text,'MM')]");
	//public static String SelectMonth= "//*[contains(@text,'#')]";
	//public static By ExpiryYear=By.xpath("//*[contains(@text,'YY')]");
	//public static String SelectYear="//*[contains(@text,'#')]";
	//public static By CVV = By.xpath("(//*[@class='android.widget.EditText'])[3]");
	//public static By PaynowButton=By.xpath("//*[contains(@text,'Pay Now')]");

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

//sangeetha
	
//	Starhealth pagelocators
	
	public static By login = By.xpath("//*[contains(@text,'LOGIN')]");
	public static By staremail = By.xpath("(//*[@class='android.widget.EditText'])[1]");
	public static By starpassword = By.xpath("(//*[@class='android.widget.EditText'])[2]");
	public static By continuebutton = By.xpath("//*[contains(@text,'CONTINUE')]");
	public static By opendrawer = By.xpath("//*[contains(@text,'open drawer')]");
	public static By products = By.xpath("(//*[@class='android.widget.Button'])[3]");
	public static By getquote = By.xpath("(//*[contains(@text,'Get Quote')])[3]");
	public static By choose1= By.xpath("//*[contains(@text,'Choose')]");
	
	public static By myself= By.xpath("(//*[contains(@text,'Myself')])[1]");
	public static By ageins= By.xpath("//*[contains(@resource-id,'age')]");
	
	public static By myselfandspouse= By.xpath("//*[contains(@text,'Myself and My Spouse')]");
	public static By ageinss= By.xpath("//*[contains(@resource-id,'age')]");
	
	
	public static By myselfandmykids= By.xpath("//*[contains(@text,'Myself and My Kids')]");
	public static By ageinsk= By.xpath("//*[contains(@resource-id,'age')]");
	public static By choose1kisinsk= By.xpath("//*[contains(@text,'1')]");
	public static By choose2kidinsk= By.xpath("//*[contains(@text,'2')]");
	public static By choose3kidinsk= By.xpath("//*[contains(@text,'3')]");
	
	public static By myselfspouseandmykids= By.xpath("//*[contains(@text,'Myself, Spouse and My Kids')]");
	public static By ageinssk= By.xpath("//*[contains(@resource-id,'age')]");
	public static By choose1kidsinssk= By.xpath("//*[contains(@text,'1')]");
	public static By choose2kidsinssk= By.xpath("//*[contains(@text,'2')]");
	public static By choose3kidsinssk= By.xpath("//*[contains(@text,'3')]");
	
	public static By choosepolicyamount= By.xpath("//*[contains(@resource-id,'policy_cover')]");
	public static By chooseamount5Lakhs= By.xpath("(//*[contains(@text,'5 Lakhs')])[1]");
	
	
	public static By choosepolicyperiod= By.xpath("//*[contains(@resource-id,'policyPeriod')]");
	public static By choose1year= By.xpath("(//*[@class='android.view.View'])[5]");
	public static By choose2year= By.xpath("(//*[@class='android.view.View'])[6]");
	
	
	public static By clickgetquote= By.xpath("//*[contains(@text,'GET QUOTE')]");
	public static By clickbuynow= By.xpath("//*[contains(@text,'BUY NOW')]");
	
	public static By clickdate= By.xpath("//android.widget.EditText[@resource-id='dob'][@clickable='true']");
	public static By selectdate= By.xpath("(//*[contains(@text,'2')])[9]");
	
	//copied from vinay
	//starting page next pagelocators
			public static By next1 = By.xpath("(//*[contains(@text,'Next')])[3]");
			public static By next2 = By.xpath("(//*[contains(@text,'Next')])[3]");
			public static By next3 = By.xpath("(//*[contains(@text,'Next')])[3]");
			public static By next4 = By.xpath("(//*[contains(@text,'Next')])[3]");
			public static By next5 = By.xpath("(//*[contains(@text,'Next')])[3]");
			public static By next6 = By.xpath("(//*[contains(@text,'Next')])[3]");
			public static By Done = By.xpath("(//*[contains(@text,'Done')])[3]");
			
	

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
		
		public static By Kidageclick = By.xpath("//*[contains(@resource-id,'kids')]");
		public static By PolicyCoverclick=By.xpath("//*[contains(@resource-id,'policy_cover')]");
		public static String CoverageAMount = "//*[contains(@text,'#')]";
		public static By Policyperiodclick = By.xpath("//*[contains(@text,'Choose')]");
		public static String PolicyPeriod = "//*[contains(@text,'#')]";
		//public static By clickonchoose = By.xpath("//*[contains(@text,'Choose')]");
		public static String IwnattoInsure = "//*[contains(@text,'#')]";
		//*[contains(@text,'Myself and My Spouse')]
		
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

//page locators for gain health product
		public static By chooseyearormonth = By.xpath("//*[contains(@resource-id,'suffixAge')]");
		public static String clickyearsormonths= "//*[contains(@text,'#')]";
	public static By choosepolicytype= By.xpath("//*[contains(@resource-id,'policyType')]")	;
	public static By clickpolicytype= By.xpath("//*[contains(@text,'Individual')]");
	public static By choosepolicyamount1 = By.xpath("//*[contains(@resource-id,'premiumAmountSelect')]");
	public static String clickpolicyamount1 = "//*[contains(@text,'#')]";
	
	
	//Diabetes safe
	
   public static By choosepolicytypeinDS = By.xpath("//*[contains(@resource-id,'policyType')]");
   public static String policytypeinDS = "//*[contains(@text,'#')]";
   public static By ageinDS  = By.xpath("//*[contains(@resource-id,'age')]");
   public static By chooseprefferedplaninDS = By.xpath("//*[contains(@text,'Choose')]");
   public static String prefferedplaninDS ="//*[contains(@text,'Plan A')]";
   public static By policycoverinDS = By.xpath("//*[contains(@resource-id,'policy_cover')]");
   public static String clickamountinDS= "//*[contains(@text,'#')]";
   public static By getquoteinDS = By.xpath("//*[contains(@resource-id,'getQuote')]");
   public static By buynowinDS = By.xpath("//*[contains(@text,'BUY NOW')]");
   public static By nextinDS =By.xpath("//*[contains(@text,'NEXT')]");
   public static By startdateinDS = By.xpath("//*[contains(@resource-id,'policy_start_on')]");
   public static By policytype = By.xpath("//*[contains(@resource-id,'policyCategory')]");
   public static By proposerdobinDS = By.xpath("//*[contains(@resource-id,'proposerDob')]");
   public static By selectoccupationinDS =By.xpath("(//*[contains(@text,'Select')])[1]");
   public static By selectvaluefromdropdown = By.xpath("//*[contains(@text,'BUSINESS/TRADERS')]");
   public static By incomeinDS = By.xpath("//*[contains(@resource-id,'income')]");
   public static By GSTtypeinDS = By.xpath("//*[contains(@resource-id,'gstType')]");
   public static By selectingGSTtypevalueinDS= By.xpath("//*[contains(@text,'Normal')]");
   public static By GSTidnumberinDS =By.xpath("//*[contains(@resource-id,'GstIdNumber1')]");
   public static By nationalityinDS = By.xpath("//*[contains(@resource-id,'nationality')]");
   public static By selectNationalityvalueinDS   = By.xpath("//*[contains(@text,'Indian Citizen')]") ;                      
   public static By digitsaadharinDS = By.xpath("//*[contains(@resource-id,'aadhaarNumber')]");
   public static By aadharenrollmentnoinDS = By.xpath("//*[contains(@resource-id,'aadhaarEnrolNumber')]");
   public static By panyesinDS = By.xpath("(//*[contains(@text,'Yes')])[1]");
   public static By pannoinDS = By.xpath("(//*[contains(@text,'No')])[1]");
   public static By enterpaninDS = By.xpath("//*[contains(@resource-id,'panNumber')]");
   public static By eiayesinDS = By.xpath("(//*[contains(@text,'Yes')])[2]");
   public static By eianoinDS = By.xpath("(//*[contains(@text,'No')])[2]");
   public static By healthinsuyesinDS = By.xpath("(//*[contains(@text,'Yes')])[3]");
   public static By healthinsunoinDS = By.xpath("(//*[contains(@text,'No')])[3]");
   public static By addressoneinDs = By.xpath("//*[contains(@resource-id,'addressOne')]");
   public static By addresstwoinDS = By.xpath("//*[contains(@resource-id,'addressTwo')]");
   public static By pincodeinDS = By.xpath("//*[contains(@resource-id,'proposerPincode')]");
   public static By checkboxtocopyaddressinDS = By.xpath("(//*[contains(@resource-id,'copyAddress')])[2]");
   public static By yesbplinDS = By.xpath("(//*[contains(@text,'Yes')])[7]");
   public static By nobplinDS = By.xpath("(//*[contains(@text,'No')])[4]");
   public static By nomineenameinDS = By.xpath("//*[contains(@resource-id,'nomineeName')]");
   public static By nomineeageinDS = By.xpath("//*[contains(@resource-id,'nomineeAge')]");
   public static By nomineerelationshipinDS = By.xpath("//*[contains(@resource-id,'nomineeRelationship')]");
   public static By selectingValuefromNomineeDropdown = By.xpath("(//*[contains(@text,'Father')])[1]");
   public static By perclaiminDS = By.xpath("//*[contains(@resource-id,'percentClaim')]");
   public static By next2inDS = By.xpath("//*[contains(@text,'NEXT')]");
   //3rd page details
   
   public static By relationshipinDS = By.xpath("//*[contains(@resource-id,'insureds_0_relationship_id')]");
   public static By nameinDS = By.xpath("//*[contains(@resource-id,'insuredsName2')]");
   public static By insureddobinDS = By.xpath("//*[contains(@resource-id,'insureds_0_dob')]");
   public static By genderinDS = By.xpath("//*[contains(@resource-id,'insureds_0_sex')]");
   public static By heightinDS = By.xpath("//*[contains(@resource-id,'insureds_0_height_field')]");
   public static By weightinDS = By.xpath("//*[contains(@resource-id,'insureds_0_weight_field')]");
   public static By suminsuredinDS = By.xpath("//*[contains(@resource-id,'sumInsured1')]");
   public static By yesindiabetes = By.xpath("(//*[contains(@text,'Yes')])[1]");
   public static By yesinsulininDS = By.xpath("(//*[contains(@text,'Yes')])[2]");
   public static By selectyear = By.xpath("//*[contains(@resource-id,'insureds_0_diabetesMellitus')]");
   public static By noindiabetes = By.xpath("(//*[contains(@text,'No')])[1]");
   
   public static By fastingsugar = By.xpath("//*[contains(@resource-id,'insureds_0_fastingBloodSugar')]");
   public static By seruminDS = By.xpath("//*[contains(@resource-id,'insureds_0_serumCreatinine')]");
   public static By h1bacinDS = By.xpath("//*[contains(@resource-id,'insureds_0_hba1c')]");
   public static By noinsulininDS = By.xpath("(//*[contains(@text,'No')])[2]");
   public static By noeyesproblem = By.xpath("(//*[contains(@text,'No')])[3]");
   public static By nokidneysproblem = By.xpath("(//*[contains(@text,'No')])[4]");
   public static By nohealingwounds = By.xpath("(//*[contains(@text,'No')])[5]");
   public static By yeshealthprobleminDS = By.xpath("(//*[contains(@text,'No')])[2]");
   public static By nohealthprobleminDS = By.xpath("(//*[contains(@text,'No')])[6]");
   public static By next3inDS = By.xpath("//*[contains(@text,'NEXT')]");
   
   //submit proposal
   
   public static By submitproposal = By.xpath("//*[contains(@text,'Close')]");
   
   //otp
public static By otp1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.widget.EditText[1]");
 public static By otp2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.widget.EditText[2]");
 public static By otp3 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.widget.EditText[3]");
 public static By otp4 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.widget.EditText[4]");
 public static By otp5 = By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.widget.EditText[5]");
 public static By otp6 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.widget.EditText[6]");
   
   
 public static By valuesinOccupationDropdown = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View") ;
 public static By valuesinGstTypeDropdown = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View") ;
 public static By valuesinNationalityDropdown = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View");
 public static By valuesinNomineeDropdown = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View");
 public static By valuesinRelationshipDropdown = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View");
 public static By valuesinGenderDropdown = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View");
 public static By valuesinSumInsuredDropdown = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View");
 public static By valuesinSelectyearDropdown = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View");
 
 
 //file upload
 public static By clickFileUplaoinDS = By.xpath("//*[contains(@resource-id,'mui-component-select-age')]");
  public static By ageProof = By.xpath("//*[contains(@text,'Age Proof')]");
  public static By clickOnUploadFiles = By.xpath("//*[contains(@text,'Click and upload files here')]");
  
public static By threeLines = By.xpath("//android.widget.ImageButton[@content-desc=\"Show roots\"]");
public static By clickDownloads = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]");
public static By clickFile = By.id("com.android.documentsui:id/icon_thumb") ;
public static By clickNoMedicalDeclaration = By.xpath("//*[contains(@text,'No')]") ;
public static By clickyesMedicalDeclaration = By.xpath("//*[contains(@text,'Yes')]");
public static By clickAgreement = By.xpath("//*[contains(@text,'I have read and agree to the Terms and Conditions..I understand that by clicking on yes and making a payment, I accept the policy terms')]");



//page locators for corona virus policy

public static By age = By.xpath("//*[contains(@resource-id,'ageYear')]");
public static By chooseYearorMonthinCV = By.xpath("//*[contains(@resource-id,'suffixAge')]");
public static String clickYearorMonthinCV = "//*[contains(@text,'#')]";
public static By chooseInsureMembersinCV = By.xpath("//*[contains(@resource-id,'adults')]");
public static String selectInsureMembersinCV = "//*[contains(@text,'#')]";
public static By chooseCoverageAmountinCV = By.xpath("//*[contains(@resource-id,'policy_cover')]");
public static String  selectCoverageAmountinCV = "//*[contains(@text,'#')]";

public static By getQuoteinCV = By.xpath("//*[contains(@resource-id,'getQuote')]");

//page locators for cardiac care
public static By ageinCC = By.xpath("(//*[contains(@resource-id,'Age')])[2]");
public static By planinCC = By.xpath("(//*[contains(@resource-id,'Plan')])[2]");
public static String typeofPlaninCC = "//*[contains(@text,'#')]";
public static By coverageAmountinCC = By.xpath("//*[contains(@resource-id,'policy_cover')]");
public static String selectCoverageAmount = "//*[contains(@text,'#')]";

public static By surgeryyesinCC = By.xpath("(//*[contains(@text,'Yes')])[4]");
public static By PTCAinCC = By.xpath("(//*[contains(@text,'PTCA')])[2]");
public static By PTCAsurgeryDate = By.xpath("//*[contains(@resource-id,'insureds_0_ptcaDate')]");
public static By CABGinCC = By.xpath("(//*[contains(@text,'CABG')])[2]");
public static By ASDinCC = By.xpath("(//*[contains(@text,'CABG')])[2]");
public static By yesgoodHealth = By.xpath("(//*[contains(@text,'Yes')])[5]");

//medical declaration
public static By Noincc = By.xpath("(//*[contains(@text,'No')])[1]");




//page locators in CancerGold

public static By ageinCG = By.xpath("//*[contains(@resource-id,'ageYear')]");
public static By chooseyearsormonthsinCG = By.xpath("//*[contains(@text,'Choose')]");

public static String  yearsormonthsinCG= "//*[contains(@text,'#')]";
public static By choosecoverageAmountinCG = By.xpath("//*[contains(@resource-id,'policy_cover')]");
public static String clickamount = "//*[contains(@text,'#')]";

//3rd page locators

public static By noHealthprobleminCG = By.xpath("(//*[contains(@text,'No')])[1]");
public static By clicktypeStageofCancer = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[5]/android.view.View[1]/android.view.View[11]/android.view.View/android.view.View/android.view.View[2]/android.view.View");

public static By cancerStage = By.xpath("(//*[contains(@resource-id,'insureds_0_treatmentDetails')])[2]");

public static By yeschemo = By.xpath("(//*[contains(@text,'Yes')])[2]");
public static By chemoDate = By.xpath("//*[contains(@resource-id,'insureds_0_therapyDetails')]");

public static By noCancerSurgery = By.xpath("(//*[contains(@text,'No')])[3]");

public static By yesTobacco = By.xpath("(//*[contains(@text,'Yes')])[7]");
public static By sinceTobacco = By.xpath("//*[contains(@resource-id,'insureds_0_tobaccoDetails')]");

public static By noSmoke = By.xpath("(//*[contains(@text,'No')])[5]");
public static By noAlcohol = By.xpath("(//*[contains(@text,'No')])[6]");

//page locators for FHO

public static By liveinFHO = By.xpath("//*[contains(@resource-id,'pincode')]");


}

