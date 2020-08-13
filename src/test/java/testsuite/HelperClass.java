package testsuite;



import java.time.Duration;
import java.util.Hashtable;
import java.util.List;

import com.sun.glass.events.SwipeGesture;
import io.appium.java_client.*;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;
import java.util.Random;

import org.openqa.selenium.remote.server.handler.interactions.touch.Down;

public class HelperClass extends PageLocator {

	/*
	 *created By : Vinay Gajula
	 */
	public static void Startingpage() throws Throwable {
		click(next1, "next");
		Thread.sleep(2000);
		click(next2, "next");
		Thread.sleep(2000);
		click(next3, "next");
		Thread.sleep(2000);
		click(next4, "next");
		Thread.sleep(2000);
		click(next5, "next");
		Thread.sleep(2000);
		click(Done, "next");
	}

	public static void LoginRegistration(String firstName, String lastName) throws Throwable {
		click(LoginButton, "Click on login");
		Thread.sleep(2000);
		click(Register, "Click on Register");
		Thread.sleep(2000);
		type(FirstName, firstName, "Enter FirstName");
		Thread.sleep(2000);
		type(LastName, lastName, "Enter LastName");
		Thread.sleep(5000);
		waitForElementPresent(LetsStartButton, "letsstart");
		click(LetsStartButton, "LetsStartButton");

	}

	public static void Registration(String mobilenumber, String email, String password, String confpassword) throws Throwable {
		Thread.sleep(2000);
		type(MobileNumber, mobilenumber, "Enter mobile number");
		Thread.sleep(2000);
		type(Email, email, "Enter email");
		Thread.sleep(2000);
		type(Password, password, "Enter password");
		Thread.sleep(2000);
		type(ConfPassword, confpassword, "Enter confirm password");
		Thread.sleep(2000);
		click(ContinueButton, "CLick on Continue Button");
		Thread.sleep(20000);
		//click(Selectotpfield,"Selecting the otp field");
		//waitForElementPresent(Verify,"Waiting to enter otp");
		hideKeyboard();
		Thread.sleep(2000);
		click(Verify, "Verifying the OTP");
		Thread.sleep(2000);
		click(regsuccess, "Clicking on Success button");
		Thread.sleep(2000);
		click(PersonalizationSkip, "Skiping the Updatename");
		Thread.sleep(2000);
		click(LinkPolicySkip, "Clicking on link policy skip");
	}

	public static void Login(String useremail, String userpass) throws Throwable {
		click(LoginButton, "loginbutton");
		Thread.sleep(2000);
		type(staremail, useremail, "email");
		Thread.sleep(2000);
		type(starpassword, userpass, "password");
		Thread.sleep(2000);
		click(continuebutton, "continuelogin");
		Thread.sleep(2000);
	}

	public static void MenuButtonclick() throws Throwable {
		click(opendrawer, "loginbutton");
		Thread.sleep(2000);
		click(products, "continuelogin");
		Thread.sleep(2000);
	}

	public static void Products(String option) throws Throwable {

		switch (option) {

			case "Comprehensive":
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(Comprehensive, "Comprehensive");
				Thread.sleep(2000);
				break;
			case "Super Surplus - Top up Cover":
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(SuperSurplus, "SuperSurplus");
				Thread.sleep(2000);
				break;
			case "Family Health Optima - FHO":
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(FamilyHealthOptima, "FamilyHealthOptima");
				Thread.sleep(2000);
				break;
			case "Mediclassic - MCI":
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(Mediclassic, "Mediclassic");
				Thread.sleep(2000);
				break;
			case "Corona Virus Policy - COVID":
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(CoronaVirusPolicy, "CoronaVirusPolicy");
				Thread.sleep(2000);
				break;
			case "Health Gain":
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(HealthGain, "HealthGain");
				Thread.sleep(2000);
				break;
			case "Diabetes Safe":
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(DiabetesSafe, "DiabetesSafe");
				Thread.sleep(2000);
				break;
			case "Cardiac care":
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(Cardiaccare, "Cardiaccare");
				Thread.sleep(2000);
				break;
			case "Cancer Gold":
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(CancerGold, "CancerGold");
				Thread.sleep(2000);
				break;
			case "Arogya Sanjeev":
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(ArogyaSanjeev, "ArogyaSanjeev");
				Thread.sleep(2000);
				break;
			case "Star Care Micro Insurance Policy":
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(StarCareMicro, "StarCareMicro");
				Thread.sleep(2000);
				break;
			case "Star Criticare Plus Insurance Policy":
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(StarCriticarePlus, "StarCriticarePlus");
				Thread.sleep(2000);
				break;
			case "Star Family Delite Insurance Policy":
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(StarFamilyDelite, "StarFamilyDelite");
				Thread.sleep(2000);
				break;
			case "Special care":
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(Specialcare, "Specialcare");
				Thread.sleep(2000);
				break;
			case "Micro Rural":
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(MicroRuralSimple, "MicroRuralSimple");
				Thread.sleep(2000);
				break;
			case "Hospital Cash":
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(HospitalCash, "HospitalCash");
				Thread.sleep(2000);
				break;
			case "Outpatient Care":
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(OutpatientCare, "OutpatientCare");
				Thread.sleep(2000);
				break;
			case "Young Star":
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(YoungStarBuy, "YoungStarBuy");
				Thread.sleep(2000);
				break;
			default:
				System.out.println("There is no value");
		}
	}

	public static void GetQuote() throws Throwable {
		click(Clickongetquote, "loginbutton");
		Thread.sleep(2000);
	}

	public static void SelectingIwnattoInsure(String selectwhomtoinsure) throws Throwable {
		Thread.sleep(2000);
		click(clickonchoose, "clicking on choose");
		Thread.sleep(2000);
		click(By.xpath(IwnattoInsure.replace("#",selectwhomtoinsure)), "Selecting the person to insure");
	}

	public static void Kids(String Enterkids) throws Throwable {
		click(Kidageclick, "Selecting done");
		click(By.xpath(Years.replace("#", Enterkids)), "Coverage Amount");
	}

	public static void GetquoteData(String option,String Age, String CoverageAmount, String Periodofpolicy,String Selecttheplan,String Deductamount,String zipcode) throws Throwable {

		switch (option) {

			case "Comprehensive":
				click(Ageclick, "Clicking on age");
				Thread.sleep(2000);
				type(Ageclick, Age, "TypeAge");
				Thread.sleep(3000);
				if (isElementDisplayed(Kidageclick, "Kid Age")) {
					Kids("2");
				}
				Thread.sleep(2000);
				click(PolicyCoverclick, "Policy Coverage");
				Thread.sleep(2000);
				click(By.xpath(CoverageAMount.replace("#", CoverageAmount)), "Coverage Amount");
				Thread.sleep(5000);
				click(Policyperiodclick, "Clicking on Policy Period");
				Thread.sleep(2000);
				click(By.xpath(PolicyPeriod.replace("#", Periodofpolicy)), "Policy Period");
				Thread.sleep(2000);
				click(GetQuote, "Click on Get Quote");
				Thread.sleep(5000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(BuyNow, "Click on buy Now");
				break;

			case "Super Surplus - Top up Cover":
				click(Ageclick, "Clicking on age");
				Thread.sleep(2000);
				type(Ageclick, Age, "TypeAge");
				Thread.sleep(3000);
				if (isElementDisplayed(Kidageclick, "Kid Age")) {
					Kids("2");
				}
				Thread.sleep(2000);
				click(Policytypeclick, "Clicking on policy");
				Thread.sleep(2000);
				click(Policytype, "Selecting Floter");
				Thread.sleep(2000);
				click(liketobuyclick, "liketobuyclick");
				Thread.sleep(2000);
				click(By.xpath(SelectPlan.replace("#", Selecttheplan)), "Plan gold or siver selection");
				Thread.sleep(2000);
				click(Deductiblesclick, "Deductiblesclick");
				Thread.sleep(2000);
				click(By.xpath(SelectDeduamount.replace("#", Deductamount)), "Amount Selection");
				Thread.sleep(2000);
				click(PolicyCoverclick, "Policy Coverage");
				Thread.sleep(2000);
				click(By.xpath(CoverageAMount.replace("#", CoverageAmount)), "Coverage Amount");
				Thread.sleep(2000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(GetQuote, "Click on Get Quote");
				Thread.sleep(5000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(BuyNow, "Click on buy Now");
				break;
			case "Family Health Optima - FHO":
				click(Ageclick, "Clicking on age");
				Thread.sleep(2000);
				type(Ageclick, Age, "TypeAge");
				Thread.sleep(3000);
				if (isElementDisplayed(Kidageclick, "Kid Age")) {
					Kids("2");
				}
				Thread.sleep(2000);
				click(PolicyCoverclick, "Policy Coverage");
				Thread.sleep(2000);
				click(By.xpath(CoverageAMount.replace("#", CoverageAmount)), "Coverage Amount");
				Thread.sleep(2000);
				click(Pincode, "Click on  pincode");
				Thread.sleep(2000);
				type(Pincode,zipcode, "Give the Pincode");
				Thread.sleep(4000);
				click(GetQuote, "Click on Get Quote");
				Thread.sleep(5000);
				swipe(AndroidDriver, DIRECTION.DOWN);
				Thread.sleep(2000);
				click(BuyNow, "Click on buy Now");
				break;
			default:
				System.out.println("There is no value");

		}
	}
	public static void GetquoteDatacom(String Age, String CoverageAmount, String Periodofpolicy) throws Throwable {
		click(ageins, "Clicking on age");
		Thread.sleep(2000);
		type(ageins, Age, "TypeAge");
		Thread.sleep(3000);
		if (isElementDisplayed(Kidageclick, "Kid Age")) {
			Kids("2");
		}
		Thread.sleep(2000);
		click(PolicyCoverclick, "Policy Coverage");
		Thread.sleep(2000);
		click(By.xpath(CoverageAMount.replace("#", CoverageAmount)), "Coverage Amount");
		Thread.sleep(5000);
		click(Policyperiodclick, "Clicking on Policy Period");
		Thread.sleep(2000);
		click(By.xpath(PolicyPeriod.replace("#", Periodofpolicy)), "Policy Period");
		Thread.sleep(2000);
		click(clickgetquote, "Click on Get Quote");
		Thread.sleep(4000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		click(clickbuynow, "Click on buy Now");
	}
	
	public static void GetquoteDataHG(String Age,String yearsormonths ,String policyamount, String CoverageAmount) throws Throwable {
		 click(ageins,"age");
		Thread.sleep(2000);
		type(ageins, Age, "age");
		Thread.sleep(3000);
		
		if (isElementDisplayed(Kidageclick, "Kid Age")) {
			Kids("2");
		}
		Thread.sleep(2000);
		click(chooseyearormonth,"clicking on choose year or month");
		Thread.sleep(2000);
		click(By.xpath(clickyearsormonths.replace("#", yearsormonths)),"entering the year");
		Thread.sleep(2000);
		click(choosepolicytype, "clickonchoosepolicytype");
		Thread.sleep(2000);
		click(clickpolicytype,"click on policy type");
		Thread.sleep(2000);
		click(choosepolicyamount1,"click on choose policy amount");
		Thread.sleep(2000);
		click(By.xpath(clickpolicyamount1.replace("#", policyamount)),"enter the policy amount");
		Thread.sleep(2000);
		click(choosepolicyamount,"clickonchoosetoselectamount");
		Thread.sleep(2000);
		click(By.xpath(CoverageAMount.replace("#", CoverageAmount)), "Coverage Amount");
		Thread.sleep(5000);
		//click(choosepolicyperiod,"policyperiodtoselectyear");
		//Thread.sleep(2000);
		//click(By.xpath(PolicyPeriod.replace("#", Periodofpolicy)), "Policy Period");
		//Thread.sleep(2000);
		click(clickgetquote,"clickgetquote");
		//Thread.sleep(4000);
		//swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		 click(clickbuynow,"clickonbuynow");
	}
	

	public static void Details(String Address1, String Address2, String pincode) throws Throwable {
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		click(DOB, "clicking on DOB field");
		Thread.sleep(2000);
		//pressByCoordinates(548,1793);
		clickByCondindates(548, 1793);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		type(addressOne, Address1, "Enter addressOne");
		Thread.sleep(2000);
		type(addressTwo, Address2, "Enter addressTwo");
		Thread.sleep(2000);
		type(pinCode, pincode, "Enter pincode");
		Thread.sleep(4000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		click(InsurerDOB, "clicking on InsurerDOB field");
		Thread.sleep(2000);
		clickByCondindates(548, 1042);
		Thread.sleep(5000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		clickByCondindates(913, 2267);
		Thread.sleep(2000);
		click(AgreeTC, "Agree Terms and conditions");
		Thread.sleep(4000);
		clickByCondindates(888, 2097);
		Thread.sleep(2000);
	}
	
	
	public static void Details_HG(String Address1, String Address2, String pincode) throws Throwable {
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		click(clickdate,"click on date");
		Thread.sleep(2000);
	
		clickByCondindates(676,1545);
		//clickByCondindates(673, 2000);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		type(addressOne, Address1, "Enter addressOne");
		Thread.sleep(2000);
		type(addressTwo, Address2, "Enter addressTwo");
		Thread.sleep(2000);
		type(pinCode, pincode, "Enter pincode");
		Thread.sleep(4000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		click(InsurerDOB, "clicking on InsurerDOB field");
		Thread.sleep(5000);
		clickByCondindates(676, 1182);
		Thread.sleep(5000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		clickByCondindates(913, 2267);
		Thread.sleep(2000);
		click(AgreeTC, "Agree Terms and conditions");
		Thread.sleep(4000);
		clickByCondindates(888, 2097);
		Thread.sleep(2000);
	}
	

	public static void Payment(String SelectCard,String Entercardnumber,String Nameincard,String month,String year,String Cvvnumber) throws Throwable {
		Thread.sleep(2000);
		click(By.xpath(Debitorcreditcard.replace("#",SelectCard)), "Select the Card");
		Thread.sleep(2000);
		click(CardNumber,"Click on Card number");
		Thread.sleep(2000);
		type(CardNumber,Entercardnumber,"Enter Card Number");
		Thread.sleep(4000);
		click(Nameoncard,"Name on card");
		Thread.sleep(2000);
		type(Nameoncard,Nameincard,"Enther the name on card");
		Thread.sleep(4000);
		click(ExpiryMonth,"Click on expirymonth");
		Thread.sleep(4000);
		click(By.xpath(SelectMonth.replace("#",month)), "Select the Card");
		Thread.sleep(2000);
		click(ExpiryYear,"click on the year");
		Thread.sleep(2000);
		click(By.xpath(SelectYear.replace("#",year)), "Select the Card");
		Thread.sleep(2000);
		click(CVV,"Click on CVV");
		Thread.sleep(2000);
		type(CVV,Cvvnumber,"Give the CVV number");
		Thread.sleep(3000);
		hideKeyboard();
		click(PaynowButton,"Click on the Paynow Button");

	}
	
	public static void insuranceDetailsinDS(String policytype,String Age,String prefferedplan,String policyamount) throws Throwable
	{
		Thread.sleep(2000);
		click(choosepolicytypeinDS,"click on choose");
		Thread.sleep(2000);
		click(By.xpath(policytypeinDS.replace("#", policytype)),"selecting policy type");
		Thread.sleep(2000);
		click(ageinDS, "click on Age");
		Thread.sleep(2000);
		type(ageinDS, Age, "age");
		Thread.sleep(2000);
		click(chooseprefferedplaninDS,"click on choose");
		Thread.sleep(2000);
		click(By.xpath(prefferedplaninDS.replace("#", prefferedplan)),"click type of plan");
		Thread.sleep(2000);
		click(policycoverinDS,"click on choose policy cover");
		Thread.sleep(2000);
		click(By.xpath(clickamountinDS.replace("#", policyamount)),"selecting amount");
		Thread.sleep(2000);
		click(getquoteinDS,"clicking on getquote");
		Thread.sleep(2000);
		click(buynowinDS,"clicking on buy now");
		
	}
	
	public static void detailsinDS(String income,String GSTidnumber,String aadhar,String pannum,String addressone,String addresstwo,String pin,String nomineename,String nomineeage,String perofclaim,String height,String weight,String sugar,String serum,String h1bac) throws Throwable
	{
		//first page details
		Thread.sleep(2000);
		click(startdateinDS,"clicking on start date");
		Thread.sleep(2000);
		clickByCondindates(623, 1985);
		Thread.sleep(2000);
		//dropDown(policytype, "Portability Policy");
		//Thread.sleep(2000);
		click(nextinDS,"clicking next");
		Thread.sleep(2000);
		
		
		//second page details
		//proposer dob
		Thread.sleep(2000);
		click(proposerdobinDS,"clicking on proposerdob");
		Thread.sleep(2000);
		clickByCondindates(742, 1700);
		Thread.sleep(2000);
		
		//selecting occupation
		click(selectoccupationinDS,"clicking on occupation");
		Thread.sleep(5000);
		//dropdown for occupation
		dropDown(valuesinOccupationDropdown, "BUSINESS/TRADERS");
		Thread.sleep(5000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//Annual income
		click(incomeinDS,"clicking on income");
		Thread.sleep(2000);
		type(incomeinDS,income, "income");
		Thread.sleep(2000);
		
		//GST type
		click(GSTtypeinDS,"clicking GST Type");
		Thread.sleep(5000);
		dropDown(valuesinGstTypeDropdown, "normal");
		Thread.sleep(2000);
		
		//GST id number
		
		click(GSTidnumberinDS,"clicking on GST id number");
		Thread.sleep(2000);
		type(GSTidnumberinDS, GSTidnumber, "gstidnumber");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//Nationality
		click(nationalityinDS,"clicking nationality");
		Thread.sleep(2000);
		dropDown(valuesinNationalityDropdown, "Indian citizen");
		Thread.sleep(2000);
		
		//4 digits of aadhar number
		click(digitsaadharinDS,"clicking on aadhar");
		Thread.sleep(2000);
		type(digitsaadharinDS,aadhar,"aadhar number");
		
		Thread.sleep(2000);
		
		//pan number
		//click(pannoinDS,"clicking on 'no' in pan");
		Thread.sleep(2000);
		MobileElement panyes = (MobileElement) driver.findElement(By.xpath("(//*[contains(@text,'Yes')])[1]"));
		boolean panyesselected = panyes.isSelected();
		if(panyesselected)
		{
			click(enterpaninDS,"clicking on pan number");
			//Thread.sleep(2000);
			type(enterpaninDS,pannum,"pan number");
			//Thread.sleep(2000);
		}
		Thread.sleep(10000);
		//eia number
		//click(eianoinDS,"clicking on  no in eia number");
		//clickByCondindates(404, 1789);
		clickByCondindates(406, 1312);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		
		//need to add code for yes 
		
		//other health insurance
		//click(healthinsunoinDS,"clicking on no health insurance");
		clickByCondindates(404, 1889);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		
		//address1
		click(addressoneinDs,"clicking on addressone");
		Thread.sleep(2000);
		type(addressoneinDs,addressone,"entering addressone ");
		Thread.sleep(2000);
		
		
		//address2
		click(addresstwoinDS,"clicking on address2");
		Thread.sleep(2000);
		type(addresstwoinDS, addresstwo, "entering addresstwo");
		Thread.sleep(2000);
		
		//pincode
		click(pincodeinDS,"clicking on pincode");
		Thread.sleep(2000);
		type(pincodeinDS,pin,"entering pincode");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//clicking on checkbox to copy address
		click(checkboxtocopyaddressinDS,"clicking on checkbox");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		
		//selecting social status
		click(nobplinDS,"clicking no in social status");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//nominee name
		click(nomineenameinDS,"clicking on nominee name");
		Thread.sleep(2000);
		type(nomineenameinDS,nomineename,"entering nominee name");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//nominee age
		click(nomineeageinDS,"clicking nominee age");
		Thread.sleep(2000);
		type(nomineeageinDS,nomineeage,"enter nominee age");
		Thread.sleep(2000);
		
		//nominee relationship
		click(nomineerelationshipinDS,"clicking on nominee relation ship");
		Thread.sleep(2000);
		//dropdown for nominee
		dropDown(valuesinNomineeDropdown, "Father");
		
		//% of claim
		click(perclaiminDS,"clicking on per claim");
		Thread.sleep(2000);
		type(perclaiminDS,perofclaim,"per claim");
		Thread.sleep(2000);
		
		//next button
		click(next2inDS,"clicking next");
		Thread.sleep(10000);
		
		//third page details
		
		//relationship
		click(relationshipinDS,"clicking on relation ship");
		Thread.sleep(2000);
		//dropdown for relatioship
		dropDown(valuesinRelationshipDropdown, "SELF");
		
		//gender
		click(genderinDS,"clicking on gender");
		Thread.sleep(2000);
		//dropdown for gender
		dropDown(valuesinGenderDropdown,"Female");
		
		//height
		click(heightinDS,"clicking height");
		type(heightinDS,height,"height");
		Thread.sleep(2000);
		
		//weight
		click(weightinDS," clicking weight");
		type(weightinDS,weight,"weight");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		
		//sum insured
		click(suminsuredinDS,"clicking on sum insured");
		Thread.sleep(2000);
		
		
		//dropdown for sum insured
		dropDown(valuesinSumInsuredDropdown,"3,00,000");
		
		
		//diabetes mellitus
		click(yesindiabetes,"clicking on yes in diabetes mellitus");
		Thread.sleep(2000);
		click(selectyear,"clicking on selecting year");
		Thread.sleep(2000);
		
		//dropdown for selecting year
		dropDown(valuesinSelectyearDropdown, "Past 1 year");
		
		
		//insulin
		click(noinsulininDS,"clicking on no in insulin");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//fasting blood sugar
		click(fastingsugar,"sugar");
		type(fastingsugar,sugar,"fasting sugar");
		Thread.sleep(2000);
		
		
		
		//serum creatinen
		click(seruminDS,"clicking on serum");
		type(seruminDS,serum,"enter the serum");
		Thread.sleep(2000);
		
		
		//h1bac
		click(h1bacinDS,"clicking on h1bac");
		type(h1bacinDS,h1bac,"entering h1bac");
		Thread.sleep(2000);
		
		//eyes problem
		click(noeyesproblem,"clicking on eyes");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//kidneys
		click(nokidneysproblem,"kidney");
		Thread.sleep(2000);
		
		
		//non-healing wounds
		click(nohealingwounds,"non-healing wounds");
		Thread.sleep(2000);
		
		//health problem
		click(nohealthprobleminDS,"no health problem");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);

		
		//next
		click(next3inDS,"clicking on next");
		Thread.sleep(2000);
	
	
	}
	public static void submitProposal() throws Exception 
	{
		Thread.sleep(2000);
		clickByCondindates(1001, 2274);
		Thread.sleep(22000);
	}
	public static void fileUpload() throws Throwable
	{
		Thread.sleep(2000);
		click(clickFileUplaoinDS,"clicking on file upload");
		Thread.sleep(2000);
		click(ageProof,"clicking on age proof");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		click(clickOnUploadFiles,"clicking on upload files");
		Thread.sleep(2000);
		click(clickFile,"clicking on file");
		Thread.sleep(10000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		click(clickNoMedicalDeclaration,"clicking on no in medical declaration");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		click(clickAgreement,"clicking on agreement");
		Thread.sleep(2000);
		clickByCondindates(1025, 2215);
	}
	
	
	public static void insuranceDetailsinCV(String Age,String yearsormonths,String insuremembers,String coverageamount) throws Throwable
	{
		
		Thread.sleep(2000);
		click(age,"age");
		Thread.sleep(2000);
		type(age, Age, "age");
		Thread.sleep(2000);
		click(chooseYearorMonthinCV,"choose years or months");
		Thread.sleep(2000);
		click(By.xpath(clickYearorMonthinCV.replace("#", yearsormonths)),"select years or months");
		Thread.sleep(2000);
		
		click(chooseInsureMembersinCV,"choose insure members");
		Thread.sleep(2000);
		click(By.xpath(selectInsureMembersinCV.replace("#", insuremembers)),"select members");
		Thread.sleep(2000);
		click(chooseCoverageAmountinCV,"choose amount");
		Thread.sleep(2000);
		click(By.xpath(selectCoverageAmountinCV.replace("#",coverageamount)),"select amount");
		Thread.sleep(2000);
		click(getQuoteinCV,"get quote");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		click(buynowinDS,"clicking on buy now");
	}
	
	public static void detailsinCV(String income,String GSTidnumber,String aadhar,String pannum,String addressone,String addresstwo,String pin,String nomineename,String nomineeage,String perofclaim,String height,String weight) throws Throwable
	{
		//first page details
		Thread.sleep(2000);
		click(startdateinDS,"clicking on start date");
		Thread.sleep(2000);
		clickByCondindates(623, 1985);
		Thread.sleep(2000);
		//dropDown(policytype, "Portability Policy");
		//Thread.sleep(2000);
		click(nextinDS,"clicking next");
		Thread.sleep(2000);
		
		
		//second page details
		//proposer dob
		Thread.sleep(2000);
		click(proposerdobinDS,"clicking on proposerdob");
		Thread.sleep(2000);
		clickByCondindates(742, 1700);
		Thread.sleep(2000);
		
		//selecting occupation
		click(selectoccupationinDS,"clicking on occupation");
		Thread.sleep(5000);
		//dropdown for occupation
		dropDown(valuesinOccupationDropdown, "BUSINESS/TRADERS");
		Thread.sleep(5000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//Annual income
		click(incomeinDS,"clicking on income");
		Thread.sleep(2000);
		type(incomeinDS,income, "income");
		Thread.sleep(2000);
		
		//GST type
		click(GSTtypeinDS,"clicking GST Type");
		Thread.sleep(5000);
		dropDown(valuesinGstTypeDropdown, "normal");
		Thread.sleep(2000);
		
		//GST id number
		
		click(GSTidnumberinDS,"clicking on GST id number");
		Thread.sleep(2000);
		type(GSTidnumberinDS, GSTidnumber, "gstidnumber");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//Nationality
		click(nationalityinDS,"clicking nationality");
		Thread.sleep(2000);
		dropDown(valuesinNationalityDropdown, "Indian citizen");
		Thread.sleep(2000);
		
		//4 digits of aadhar number
		click(digitsaadharinDS,"clicking on aadhar");
		Thread.sleep(2000);
		type(digitsaadharinDS,aadhar,"aadhar number");
		
		Thread.sleep(2000);
		
		//pan number
		//click(pannoinDS,"clicking on 'no' in pan");
		Thread.sleep(2000);
		MobileElement panyes = (MobileElement) driver.findElement(By.xpath("(//*[contains(@text,'Yes')])[1]"));
		boolean panyesselected = panyes.isSelected();
		if(panyesselected)
		{
			click(enterpaninDS,"clicking on pan number");
			//Thread.sleep(2000);
			type(enterpaninDS,pannum,"pan number");
			//Thread.sleep(2000);
		}
		Thread.sleep(10000);
		//eia number
		//click(eianoinDS,"clicking on  no in eia number");
		//clickByCondindates(404, 1789);
		clickByCondindates(406, 1312);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		
		//need to add code for yes 
		
		//other health insurance
		//click(healthinsunoinDS,"clicking on no health insurance");
		clickByCondindates(406, 1457);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		
		//address1
		click(addressoneinDs,"clicking on addressone");
		Thread.sleep(2000);
		type(addressoneinDs,addressone,"entering addressone ");
		Thread.sleep(2000);
		
		
		//address2
		click(addresstwoinDS,"clicking on address2");
		Thread.sleep(2000);
		type(addresstwoinDS, addresstwo, "entering addresstwo");
		Thread.sleep(2000);
		
		//pincode
		click(pincodeinDS,"clicking on pincode");
		Thread.sleep(2000);
		type(pincodeinDS,pin,"entering pincode");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//clicking on checkbox to copy address
		click(checkboxtocopyaddressinDS,"clicking on checkbox");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//selecting social status
		click(nobplinDS,"clicking no in social status");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//nominee name
		click(nomineenameinDS,"clicking on nominee name");
		Thread.sleep(2000);
		type(nomineenameinDS,nomineename,"entering nominee name");
	
		
	
		
		//nominee age
		click(nomineeageinDS,"clicking nominee age");
		Thread.sleep(2000);
		type(nomineeageinDS,nomineeage,"enter nominee age");
		Thread.sleep(2000);
		
		//nominee relationship
		click(nomineerelationshipinDS,"clicking on nominee relation ship");
		Thread.sleep(2000);
		//dropdown for nominee
		dropDown(valuesinNomineeDropdown, "Father");
		
		//% of claim
		click(perclaiminDS,"clicking on per claim");
		Thread.sleep(2000);
		type(perclaiminDS,perofclaim,"per claim");
		Thread.sleep(2000);
		
		//next button
		click(next2inDS,"clicking next");
		Thread.sleep(10000);
		
		//third page details
		
		//relationship
		click(relationshipinDS,"clicking on relation ship");
		Thread.sleep(2000);
		//dropdown for relatioship
		dropDown(valuesinRelationshipDropdown, "SELF");
		
		//gender
		click(genderinDS,"clicking on gender");
		Thread.sleep(2000);
		//dropdown for gender
		dropDown(valuesinGenderDropdown,"Female");
		
		//height
		click(heightinDS,"clicking height");
		type(heightinDS,height,"height");
		Thread.sleep(2000);
		
		//weight
		click(weightinDS," clicking weight");
		type(weightinDS,weight,"weight");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		/*//selecting occupation
		click(selectoccupationinDS,"clicking on occupation");
		Thread.sleep(2000);
		//dropdown for occupation
		dropDown(valuesinOccupationDropdown, "BUSINESS/TRADERS");
		
		
		
		//sum insured
		click(suminsuredinDS,"clicking on sum insured");
		Thread.sleep(2000);
		//dropdown for sum insured
		dropDown(valuesinSumInsuredDropdown,"42,000");
		*/
		
		//next
		click(next3inDS,"clicking on next");
		Thread.sleep(2000);
	
	
	}
	public static void insuranceDetailsinCC(String Age,String plan,String coverageamount) throws Throwable
	{
		
	click(ageinCC,"age");	
	Thread.sleep(2000);
	type(ageinCC, Age, "age");
	Thread.sleep(2000);
	click(planinCC,"choose plan");
	Thread.sleep(2000);
	click(By.xpath(typeofPlaninCC.replace("#",plan)),"selecting plan");
	Thread.sleep(2000);
	click(coverageAmountinCC,"coverage amount");
	Thread.sleep(2000);
	click(By.xpath(selectCoverageAmount.replace("#",coverageamount)),"selecting coverage amount");
	Thread.sleep(2000);
	Thread.sleep(2000);
	click(getQuoteinCV,"get quote");
	Thread.sleep(2000);
	swipe(AndroidDriver, DIRECTION.DOWN);
	click(buynowinDS,"clicking on buy now");
	}
	
	public static void detailsinCC(String income,String GSTidnumber,String aadhar,String pannum,String addressone,String addresstwo,String pin,String nomineename,String nomineeage,String perofclaim,String height,String weight) throws Throwable
	{
		//first page details
		Thread.sleep(2000);
		click(startdateinDS,"clicking on start date");
		Thread.sleep(2000);
		clickByCondindates(623, 1985);
		Thread.sleep(2000);
		//dropDown(policytype, "Portability Policy");
		//Thread.sleep(2000);
		click(nextinDS,"clicking next");
		Thread.sleep(2000);
		
		
		//second page details
		//proposer dob
		Thread.sleep(2000);
		click(proposerdobinDS,"clicking on proposerdob");
		Thread.sleep(2000);
		clickByCondindates(742, 1700);
		Thread.sleep(2000);
		
		//selecting occupation
		click(selectoccupationinDS,"clicking on occupation");
		Thread.sleep(5000);
		//dropdown for occupation
		dropDown(valuesinOccupationDropdown, "BUSINESS/TRADERS");
		Thread.sleep(5000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//Annual income
		click(incomeinDS,"clicking on income");
		Thread.sleep(2000);
		type(incomeinDS,income, "income");
		Thread.sleep(2000);
		
		//GST type
		click(GSTtypeinDS,"clicking GST Type");
		Thread.sleep(5000);
		dropDown(valuesinGstTypeDropdown, "normal");
		Thread.sleep(2000);
		
		//GST id number
		
		click(GSTidnumberinDS,"clicking on GST id number");
		Thread.sleep(2000);
		type(GSTidnumberinDS, GSTidnumber, "gstidnumber");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//Nationality
		click(nationalityinDS,"clicking nationality");
		Thread.sleep(2000);
		dropDown(valuesinNationalityDropdown, "Indian citizen");
		Thread.sleep(2000);
		
		//4 digits of aadhar number
		click(digitsaadharinDS,"clicking on aadhar");
		Thread.sleep(2000);
		type(digitsaadharinDS,aadhar,"aadhar number");
		
		Thread.sleep(2000);
		
		//pan number
		//click(pannoinDS,"clicking on 'no' in pan");
		Thread.sleep(2000);
		MobileElement panyes = (MobileElement) driver.findElement(By.xpath("(//*[contains(@text,'Yes')])[1]"));
		boolean panyesselected = panyes.isSelected();
		if(panyesselected)
		{
			click(enterpaninDS,"clicking on pan number");
			//Thread.sleep(2000);
			type(enterpaninDS,pannum,"pan number");
			//Thread.sleep(2000);
		}
		Thread.sleep(10000);
		//eia number
		//click(eianoinDS,"clicking on  no in eia number");
		clickByCondindates(406, 1312);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		
		//need to add code for yes 
		
		//other health insurance
		//click(healthinsunoinDS,"clicking on no health insurance");
		clickByCondindates(406, 1457);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		
		//address1
		click(addressoneinDs,"clicking on addressone");
		Thread.sleep(2000);
		type(addressoneinDs,addressone,"entering addressone ");
		Thread.sleep(2000);
		
		
		//address2
		click(addresstwoinDS,"clicking on address2");
		Thread.sleep(2000);
		type(addresstwoinDS, addresstwo, "entering addresstwo");
		Thread.sleep(2000);
		
		//pincode
		click(pincodeinDS,"clicking on pincode");
		Thread.sleep(2000);
		type(pincodeinDS,pin,"entering pincode");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//clicking on checkbox to copy address
		click(checkboxtocopyaddressinDS,"clicking on checkbox");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//selecting social status
		click(nobplinDS,"clicking no in social status");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//nominee name
		click(nomineenameinDS,"clicking on nominee name");
		Thread.sleep(2000);
		type(nomineenameinDS,nomineename,"entering nominee name");
	
		
	
		
		//nominee age
		click(nomineeageinDS,"clicking nominee age");
		Thread.sleep(2000);
		type(nomineeageinDS,nomineeage,"enter nominee age");
		Thread.sleep(2000);
		
		//nominee relationship
		click(nomineerelationshipinDS,"clicking on nominee relation ship");
		Thread.sleep(2000);
		//dropdown for nominee
		dropDown(valuesinNomineeDropdown, "Father");
		
		//% of claim
		click(perclaiminDS,"clicking on per claim");
		Thread.sleep(2000);
		type(perclaiminDS,perofclaim,"per claim");
		Thread.sleep(2000);
		
		//next button
		click(next2inDS,"clicking next");
		Thread.sleep(10000);
		
		//third page details
		
		//relationship
		click(relationshipinDS,"clicking on relation ship");
		Thread.sleep(2000);
		//dropdown for relatioship
		dropDown(valuesinRelationshipDropdown, "SELF");
		
		//gender
		click(genderinDS,"clicking on gender");
		Thread.sleep(2000);
		//dropdown for gender
		dropDown(valuesinGenderDropdown,"Female");
		
		//height
		click(heightinDS,"clicking height");
		type(heightinDS,height,"height");
		Thread.sleep(2000);
		
		//weight
		click(weightinDS," clicking weight");
		type(weightinDS,weight,"weight");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//yes in surgery
		click(surgeryyesinCC,"yes surgery");
		Thread.sleep(2000);
		//click on PTCA
		click(PTCAinCC,"PTCA");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		//PTCA surgery date
		click(PTCAsurgeryDate,"surgery date");
		Thread.sleep(2000);
	    
		clickByCondindates(417, 1396);
		Thread.sleep(2000);
		
		click(yesgoodHealth,"good health");
		Thread.sleep(2000);
		//next
		click(next3inDS,"clicking on next");
		Thread.sleep(2000);
	
	
	}
	
	public static void medicalDeclarationCC() throws Throwable
	{
		
		click(Noincc,"No in  medical declaration");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		click(clickAgreement,"terms and conditions");
		Thread.sleep(2000);
		clickByCondindates(1025, 2215);
		
	}
	
	public static void insuranceDetailsinCG(String Age,String yearsormonths,String coverageamount) throws Throwable
	{
		
		Thread.sleep(2000);
		click(ageinCG,"age");
		Thread.sleep(2000);
		type(ageinCG, Age, "age");
		Thread.sleep(2000);
		click(chooseyearsormonthsinCG,"choose years or months");
		Thread.sleep(2000);
		click(By.xpath(clickYearorMonthinCV.replace("#", yearsormonths)),"select years or months");
		Thread.sleep(2000);
		click(choosecoverageAmountinCG,"choose amount");
		Thread.sleep(2000);
		click(By.xpath(clickamount.replace("#",coverageamount)),"select amount");
		Thread.sleep(2000);
		click(getQuoteinCV,"get quote");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		click(buynowinDS,"clicking on buy now");
	}
	
	
	
	
	public static void detailsinCG(String income,String GSTidnumber,String aadhar,String pannum,String addressone,String addresstwo,String pin,String nomineename,String nomineeage,String perofclaim,String height,String weight,String datenstage,String chemodate,String tobaccoyears) throws Throwable
	{
		//first page details
		Thread.sleep(2000);
		click(startdateinDS,"clicking on start date");
		Thread.sleep(2000);
		clickByCondindates(623, 1985);
		Thread.sleep(2000);
		//dropDown(policytype, "Portability Policy");
		//Thread.sleep(2000);
		click(nextinDS,"clicking next");
		Thread.sleep(2000);
		
		
		//second page details
		//proposer dob
		Thread.sleep(2000);
		click(proposerdobinDS,"clicking on proposerdob");
		Thread.sleep(2000);
		clickByCondindates(742, 1700);
		Thread.sleep(2000);
		
		//selecting occupation
		click(selectoccupationinDS,"clicking on occupation");
		Thread.sleep(5000);
		//dropdown for occupation
		dropDown(valuesinOccupationDropdown, "BUSINESS/TRADERS");
		Thread.sleep(5000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//Annual income
		click(incomeinDS,"clicking on income");
		Thread.sleep(2000);
		type(incomeinDS,income, "income");
		Thread.sleep(2000);
		
		//GST type
		click(GSTtypeinDS,"clicking GST Type");
		Thread.sleep(5000);
		dropDown(valuesinGstTypeDropdown, "normal");
		Thread.sleep(2000);
		
		//GST id number
		
		click(GSTidnumberinDS,"clicking on GST id number");
		Thread.sleep(2000);
		type(GSTidnumberinDS, GSTidnumber, "gstidnumber");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//Nationality
		click(nationalityinDS,"clicking nationality");
		Thread.sleep(2000);
		dropDown(valuesinNationalityDropdown, "Indian citizen");
		Thread.sleep(2000);
		
		//4 digits of aadhar number
		click(digitsaadharinDS,"clicking on aadhar");
		Thread.sleep(2000);
		type(digitsaadharinDS,aadhar,"aadhar number");
		
		Thread.sleep(2000);
		
		//pan number
		//click(pannoinDS,"clicking on 'no' in pan");
		Thread.sleep(2000);
		MobileElement panyes = (MobileElement) driver.findElement(By.xpath("(//*[contains(@text,'Yes')])[1]"));
		boolean panyesselected = panyes.isSelected();
		if(panyesselected)
		{
			click(enterpaninDS,"clicking on pan number");
			//Thread.sleep(2000);
			type(enterpaninDS,pannum,"pan number");
			//Thread.sleep(2000);
		}
		Thread.sleep(10000);
		//eia number
		//click(eianoinDS,"clicking on  no in eia number");
		clickByCondindates(404, 1789);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		
		//need to add code for yes 
		
		//other health insurance
		//click(healthinsunoinDS,"clicking on no health insurance");
		clickByCondindates(406, 1457);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		
		//address1
		click(addressoneinDs,"clicking on addressone");
		Thread.sleep(2000);
		type(addressoneinDs,addressone,"entering addressone ");
		Thread.sleep(2000);
		
		
		//address2
		click(addresstwoinDS,"clicking on address2");
		Thread.sleep(2000);
		type(addresstwoinDS, addresstwo, "entering addresstwo");
		Thread.sleep(2000);
		
		//pincode
		click(pincodeinDS,"clicking on pincode");
		Thread.sleep(2000);
		type(pincodeinDS,pin,"entering pincode");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//clicking on checkbox to copy address
		click(checkboxtocopyaddressinDS,"clicking on checkbox");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//selecting social status
		click(nobplinDS,"clicking no in social status");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//nominee name
		click(nomineenameinDS,"clicking on nominee name");
		Thread.sleep(2000);
		type(nomineenameinDS,nomineename,"entering nominee name");
	
		
	
		
		//nominee age
		click(nomineeageinDS,"clicking nominee age");
		Thread.sleep(2000);
		type(nomineeageinDS,nomineeage,"enter nominee age");
		Thread.sleep(2000);
		
		//nominee relationship
		click(nomineerelationshipinDS,"clicking on nominee relation ship");
		Thread.sleep(2000);
		//dropdown for nominee
		dropDown(valuesinNomineeDropdown, "Father");
		
		//% of claim
		click(perclaiminDS,"clicking on per claim");
		Thread.sleep(2000);
		type(perclaiminDS,perofclaim,"per claim");
		Thread.sleep(2000);
		
		//next button
		click(next2inDS,"clicking next");
		Thread.sleep(10000);
		
		//third page details
		
		//relationship
		click(relationshipinDS,"clicking on relation ship");
		Thread.sleep(2000);
		//dropdown for relatioship
		dropDown(valuesinRelationshipDropdown, "SELF");
		
		//gender
		click(genderinDS,"clicking on gender");
		Thread.sleep(2000);
		//dropdown for gender
		dropDown(valuesinGenderDropdown,"Female");
		
		//height
		click(heightinDS,"clicking height");
		type(heightinDS,height,"height");
		Thread.sleep(2000);
		
		//weight
		click(weightinDS," clicking weight");
		type(weightinDS,weight,"weight");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		
		
		//no health problem
		Thread.sleep(2000);
		click(noHealthprobleminCG,"no health problem");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		//clicking on type and stage of cancer
		click(clicktypeStageofCancer,"type n stage of cancer");
		Thread.sleep(2000);
		
		type(cancerStage,datenstage,"date n stage of cancer");
		Thread.sleep(2000);
		
		//chemotherapy
		click(yeschemo,"chemotheraphy");
		Thread.sleep(2000);
		
		type(chemoDate,chemodate,"entering chemo date");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		
		
		//cancer surgery
		click(noCancerSurgery,"no cancer surgery");
		Thread.sleep(2000);
		
		
		//tobacco
		click(yesTobacco,"tobacco");
		Thread.sleep(2000);
		type(sinceTobacco,tobaccoyears,"consuming tobacco ");
		
		//smoke
		click(noSmoke,"no smoke");
		Thread.sleep(2000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		//alcohol
		click(noAlcohol,"no alcohol");
		Thread.sleep(2000);
		
		//next
		click(next3inDS,"clicking on next");
		Thread.sleep(2000);
	
	
	}
	
	public static void GetquoteDatafho(String Age, String CoverageAmount, String livein) throws Throwable {
		click(ageins, "Clicking on age");
		Thread.sleep(2000);
		type(ageins, Age, "TypeAge");
		Thread.sleep(3000);
		if (isElementDisplayed(Kidageclick, "Kid Age")) {
			Kids("2");
		}
		Thread.sleep(2000);
		click(PolicyCoverclick, "Policy Coverage");
		Thread.sleep(2000);
		click(By.xpath(CoverageAMount.replace("#", CoverageAmount)), "Coverage Amount");
		Thread.sleep(5000);
		click(liveinFHO, "pincode");
		Thread.sleep(2000);
		type(liveinFHO,livein,"pincode");
		Thread.sleep(2000);
		click(clickgetquote, "Click on Get Quote");
		Thread.sleep(4000);
		swipe(AndroidDriver, DIRECTION.DOWN);
		Thread.sleep(2000);
		click(clickbuynow, "Click on buy Now");
	}
	
		






}


