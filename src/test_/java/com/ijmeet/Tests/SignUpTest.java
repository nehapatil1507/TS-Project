package com.ijmeet.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.ijmeet.config.TestBase;
import com.ijmeet.keyword.UIKeyword;
import com.ijmeet.pages.SignUpPage;
import com.ijmeet.utils.EnvironmentUtil;

public class SignUpTest extends TestBase {

	@Test
	public void verifyIfClickOnSignUpBttnNavToRegisterPage() {

		EnvironmentUtil env = new EnvironmentUtil();
		SignUpPage sup = new SignUpPage();
		String expected ="Sign Up";
		String actual=null;

		UIKeyword.launchUrl(env.getappUrl());
	//	UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		sup.clickOnSign_UP();
		String actualurl =UIKeyword.driver.getCurrentUrl() ;
		
		if((actualurl.contains("/login"))||(actualurl.contains("/register")) ){
			actual="Sign Up";
		}
		
           Assert.assertEquals(actual, expected,
				"does not match : actual Title :" + actual + " expected Title is : " + expected);
	}
	
	@Test
	 public void verifyAfterRegistrationIsPagePopulatesToDashboard() {
		
		EnvironmentUtil env = new EnvironmentUtil();
		SignUpPage sup = new SignUpPage();
		String expectedurlcontains ="Dashboard";
		String actualurlcontains=null;

		UIKeyword.launchUrl(env.getappUrl());
	    sup.clickOnSign_UP();
	    sup.fillForm();
	 //   sup.reCaptchaClick();
	    sup.clickOnsignUP();
	    
		String actualurl =UIKeyword.driver.getCurrentUrl();
		
		if((actualurl.contains("dashboard"))){
			actualurlcontains="Dashboard";
		}
		
           Assert.assertEquals(actualurlcontains, expectedurlcontains,
				"does not match : actual Title :" + actualurlcontains + " expected Title is : " + expectedurlcontains);
	}

	}
	


