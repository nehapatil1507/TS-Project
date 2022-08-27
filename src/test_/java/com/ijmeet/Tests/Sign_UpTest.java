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

}
