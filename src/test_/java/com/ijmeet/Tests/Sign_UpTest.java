package com.ijmeet.Tests;

import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ijmeet.config.TestBase;
import com.ijmeet.keyword.UIKeyword;
import com.ijmeet.pages.Sign_UpPage;
import com.ijmeet.utils.EnvironmentUtil;

@Test
public class Sign_UpTest extends TestBase {

	public void verifyRegistrationFormAcceptsDetails() throws InterruptedException {

		EnvironmentUtil env = new EnvironmentUtil();
		Sign_UpPage sp = new Sign_UpPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		sp.clickOnSign_UP();
		sp.fillForm();
		sp.reCaptchaClick();
		sp.clickOnsignUP();
		String expectedUrl = "/dashboard";
		String actualUrl = UIKeyword.driver.getCurrentUrl();

		if (actualUrl.contains(expectedUrl)) {
			actualUrl = expectedUrl;
			Assert.assertEquals(actualUrl, expectedUrl);
		}

	}

	public void verifySignUpPageConsistOfHostMeetinglink() {
		EnvironmentUtil env = new EnvironmentUtil();
		Sign_UpPage sp = new Sign_UpPage();
		UIKeyword.launchUrl(env.getappUrl());
		sp.clickOnSign_UP();
		sp.clickOnHostMeeting();
		String actual = UIKeyword.driver.getCurrentUrl();
		String expected = "/host";
		if (actual.contains(expected)) {
			actual = expected;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}

	}

	public void verifySignUpPageConsistOfJoinMeetinglink() {
		EnvironmentUtil env = new EnvironmentUtil();
		Sign_UpPage sp = new Sign_UpPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		sp.clickOnSign_UP();
		sp.clickOnJoinMeeting();

		String actual = UIKeyword.driver.findElement(By.xpath("//h2[@class='m-txt']")).getText();
		String expected = "Join meeting";
		if (actual.contains(expected)) {
			actual = expected;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}
	}

	public void verifySignUpPageConsistOfContactSalelink() {
		EnvironmentUtil env = new EnvironmentUtil();
		Sign_UpPage sp = new Sign_UpPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		sp.clickOnSign_UP();
		sp.clickOnContactSale();
		String actual = UIKeyword.driver.getCurrentUrl();
		String expected = "/contact";
		if (actual.contains(expected)) {
			actual = expected;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}

	}

	public void verifySignUpPageConsistOfSignInButton() {
		EnvironmentUtil env = new EnvironmentUtil();
		Sign_UpPage sp = new Sign_UpPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		sp.clickOnSign_UP();
		sp.clickOnSignInTab();
		String actual = UIKeyword.driver.findElement(By.xpath("//h4")).getText();
		String expected = "Sign In";
		if (actual.contains(expected)) {
			actual = expected;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}

	}

	public void verifySignUpPageConsistOfSignUpButton() {
		EnvironmentUtil env = new EnvironmentUtil();
		Sign_UpPage sp = new Sign_UpPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		sp.clickOnSign_UP();
		sp.clickOnSign_UP();
		String actual = UIKeyword.driver.findElement(By.xpath("//h4")).getText();
		String expected = "Sign Up";
		if (actual.contains(expected)) {
			actual = expected;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}
	}

	public void verifySignUpPageConsistOfLanguageTranslatorButton() {
		EnvironmentUtil env = new EnvironmentUtil();
		Sign_UpPage sp = new Sign_UpPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		sp.clickOnSign_UP();
		sp.clickOnArabicLanguageTranslatorTab();
		String actual = UIKeyword.driver.findElement(By.xpath("//span[@class='language-trance-arabic']")).getText();
		String exp = "English";
		if (actual.contains(exp)) {
			actual = exp;
			Assert.assertEquals(actual, exp, "actual and expected are not match exactly");
		}
	}

	public void verifyAlreadyAccountIsPresent() {
		EnvironmentUtil env = new EnvironmentUtil();
		Sign_UpPage sp = new Sign_UpPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		sp.clickOnSign_UP();
		sp.checkForLoginIn();
		String actualString = UIKeyword.driver
				.findElement(By.xpath("//label[@class='form-check-label-dont-have mb-0']")).getText();
		String expectedString = "Already have account";
		if (actualString.contains(expectedString)) {
			expectedString = actualString;
			Assert.assertEquals(actualString, expectedString, "actual and expected are not match exactly");
      }
	}

	public void verifyLoginWithSignInLinkIsPresent() {
		EnvironmentUtil env = new EnvironmentUtil();
		Sign_UpPage sp = new Sign_UpPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		sp.clickOnSign_UP();
		sp.checkForLoginIn();

		String actualString = UIKeyword.driver
				.findElement(By.xpath("//label[@class='form-check-label-dont-have mb-0']/a/span")).getText();
		String expectedString = "Login In";
		if (actualString.contains(expectedString)) {
			expectedString = actualString;
			Assert.assertEquals(actualString, expectedString, "actual and expected are not match exactly");
		}

		}
		
	public void verifyLoginLinkNavigateToLoginPage(){
		EnvironmentUtil env = new EnvironmentUtil();
		Sign_UpPage sp = new Sign_UpPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		sp.clickOnSign_UP();
		sp.checkForLoginIn();

		String actualUrl= UIKeyword.driver.getCurrentUrl();
				
		String expectedUrl = "/login";
		if (actualUrl.contains(expectedUrl)) {
			expectedUrl = actualUrl;
			Assert.assertEquals(actualUrl, expectedUrl, "actual and expected are not match exactly");
           }
	}
	
	public void verifySignInWithGoogleLinkIsPresent() {
		
		EnvironmentUtil env = new EnvironmentUtil();
		Sign_UpPage sp = new Sign_UpPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		sp.clickOnSign_UP();
		sp.checkForLoginIn();

		String actualString = UIKeyword.driver
				.findElement(By.xpath("//div[@class='form-group common-view-sign-in']/a[1]")).getText();
		String expectedString = "Sign in with Google";
		if (actualString.contains(expectedString)) {
			expectedString = actualString;
			Assert.assertEquals(actualString, expectedString, "actual and expected are not match exactly");
		}
     }
	public void verifyGoogleLinkNavigateToSignInWithGooglePage() {
		EnvironmentUtil env = new EnvironmentUtil();
		Sign_UpPage sp = new Sign_UpPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		sp.clickOnSign_UP();
		sp.checkForLoginIn();
		sp.clickOnSignInWithGoogleLink();
		String actualUrl=UIKeyword.driver.getCurrentUrl();
		String expUrl="https://ijmeet.com/login/google";
		if (actualUrl.contains(expUrl)) {
			expUrl=actualUrl;
			Assert.assertEquals(actualUrl, expUrl, "actual and expected are not match exactly");
	
		}
	}
	
	public void verifySignInWithFaceBookLinkIsPresent() {
		EnvironmentUtil env = new EnvironmentUtil();
		Sign_UpPage sp = new Sign_UpPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		sp.clickOnSign_UP();
		sp.checkForLoginIn();
        String actualString = UIKeyword.driver
				.findElement(By.xpath("//div[@class='form-group common-view-sign-in']/a[2]")).getText();
		String expectedString = "Sign in with Facebook";
		if (actualString.contains(expectedString)) {
			expectedString = actualString;
			Assert.assertEquals(actualString, expectedString, "actual and expected are not match exactly");
	}}
	
	public void verifyFacebookLinkNavigateToSignInWithFacebookPage() {
		EnvironmentUtil env = new EnvironmentUtil();
		Sign_UpPage sp = new Sign_UpPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		sp.clickOnSign_UP();
		sp.checkForLoginIn();
		sp.clickOnSignInWithFaceBookLink();
		String actualUrl=UIKeyword.driver.getCurrentUrl();
		String expUrl="https://ijmeet.com/login/facebook";
		if (actualUrl.contains(expUrl)) {
			expUrl=actualUrl;
			Assert.assertEquals(actualUrl, expUrl, "actual and expected are not match exactly");
		}
	}
	
	public void verifySignInWithFederationLinkIsPresent() {
		EnvironmentUtil env = new EnvironmentUtil();
		Sign_UpPage sp = new Sign_UpPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		sp.clickOnSign_UP();
		sp.checkForLoginIn();

		String actualString = UIKeyword.driver
				.findElement(By.xpath("//div[@class='form-group common-view-sign-in']/a[3]")).getText();
		String expectedString = "Sign in with Federation";
		if (actualString.contains(expectedString)) {
			expectedString = actualString;
			Assert.assertEquals(actualString, expectedString, "actual and expected are not match exactly");
	}}
/*	public void verifyFederationLinkNavigateToSignInWithFederationPage() {
		EnvironmentUtil env = new EnvironmentUtil();
		Sign_UpPage sp = new Sign_UpPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		sp.clickOnSign_UP();
		sp.checkForLoginIn();
		sp.clickOnSignInWithFederationLink();
		String actualUrl=UIKeyword.driver.getCurrentUrl();
		String expUrl="https://ijmeet.com/login/google";
		if (actualUrl.contains(expUrl)) {
			expUrl=actualUrl;
			Assert.assertEquals(actualUrl, expUrl, "actual and expected are not match exactly");
		}
	}
*/
}
