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
		click(By.xpath(IwnattoInsure.replace("#", selectwhomtoinsure)), "Selecting the person to insure");
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
}


