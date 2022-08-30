package com.ijmeet.Tests;

import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ijmeet.config.TestBase;
import com.ijmeet.keyword.UIKeyword;
import com.ijmeet.pages.SignInPage;
import com.ijmeet.utils.EnvironmentUtil;

public class SignInTest extends TestBase {

	@Test
	public void verifyloginPageOfijmeetIsPresentByClickOnSignInTab() {

		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		String Expectedurl = "/login";

		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		String actualurl = UIKeyword.driver.getCurrentUrl();
		if (actualurl.contains(Expectedurl)) {
			actualurl = Expectedurl;
			Assert.assertEquals(actualurl, Expectedurl, "Actual and expected is not match");
		}
	}

	@Test
	public void verifyUserCanLoginWithEmailAndPassword() {

		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.loginInToUserAccount();
		String expectedUrl = "/dashboard";
		String actualUrl = UIKeyword.driver.getCurrentUrl();

		if (actualUrl.contains(expectedUrl)) {
			actualUrl = expectedUrl;
		}
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@Test
	public void verifySignInPageConsistOfHostMeetinglink() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		lp.clickOnSignIn_Button();
		lp.clickOnHostMeeting();
		String actual = UIKeyword.driver.getCurrentUrl();
		String expected = "/host";
		if (actual.contains(expected)) {
			actual = expected;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}

	}

	@Test
	public void verifySignInPageConsistOfJoinMeetinglink() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.clickOnJoinMeeting();

		String actual = UIKeyword.driver.findElement(By.xpath("//h2[@class='m-txt']")).getText();
		String expected = "Join meeting";
		if (actual.contains(expected)) {
			actual = expected;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}
	}

	@Test
	public void verifySignInPageConsistOfContactSalelink() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.clickOnContactSale();
		String actual = UIKeyword.driver.getCurrentUrl();
		String expected = "/contact";
		if (actual.contains(expected)) {
			actual = expected;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}

	}

	@Test
	public void verifySignInPageConsistOfSignInButton() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.clickOnSignInTab();
		String actual = UIKeyword.driver.findElement(By.xpath("//h4")).getText();
		String expected = "Sign In";
		if (actual.contains(expected)) {
			actual = expected;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}

	}

	@Test
	public void verifySignInPageConsistOfSignUpButton() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.clickOnSignUpTab();
		String actual = UIKeyword.driver.findElement(By.xpath("//h4")).getText();
		String expected = "Sign Up";
		if (actual.contains(expected)) {
			actual = expected;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}
	}

	@Test
	public void verifySignInPageConsistOfLanguageTranslatorButton() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.clickOnArabicLanguageTranslatorTab();
		String actual = UIKeyword.driver.findElement(By.xpath("//span[@class='language-trance-arabic']")).getText();
		String exp = "English";
		if (actual.contains(exp)) {
			actual = exp;
			Assert.assertEquals(actual, exp, "actual and expected are not match exactly");
		}
	}

	@Test
	public void verifyLoginWithSignInLinkIsPresent() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		String actualString = UIKeyword.driver
				.findElement(By.xpath("//label[@class='form-check-label-dont-have mb-0']/a/span")).getText();
		String expectedString = "Login In";
		if (actualString.contains(expectedString)) {
			expectedString = actualString;
			Assert.assertEquals(actualString, expectedString, "actual and expected are not match exactly");
		}

	}

	@Test
	public void verifyLoginLinkNavigateToLoginPage() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		lp.clickOnSignInTab();
		String actualUrl = UIKeyword.driver.getCurrentUrl();
		String expectedUrl = "/login";
		if (actualUrl.contains(expectedUrl)) {
			expectedUrl = actualUrl;
			Assert.assertEquals(actualUrl, expectedUrl, "actual and expected are not match exactly");
		}
	}

	@Test
	public void verifySignInWithGoogleLinkIsPresent() {

		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();

		String actualString = UIKeyword.driver
				.findElement(By.xpath("//div[@class='form-group common-view-sign-in']/a[1]")).getText();
		String expectedString = "Sign in with Google";
		if (actualString.contains(expectedString)) {
			expectedString = actualString;
			Assert.assertEquals(actualString, expectedString, "actual and expected are not match exactly");
		}
	}

	@Test
	public void verifyGoogleLinkNavigateToSignInWithGooglePage() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		lp.clickOnSignInWithGoogleLink();
		String actualUrl = UIKeyword.driver.getCurrentUrl();
		String expUrl = "/google";
		if (actualUrl.contains(expUrl)) {
			expUrl = actualUrl;
			Assert.assertEquals(actualUrl, expUrl, "actual and expected are not match exactly");

		}
	}

	@Test
	public void verifySignInWithFaceBookLinkIsPresent() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		String actualString = UIKeyword.driver
				.findElement(By.xpath("//div[@class='form-group common-view-sign-in']/a[2]")).getText();
		String expectedString = "Sign in with Facebook";
		if (actualString.contains(expectedString)) {
			expectedString = actualString;
			Assert.assertEquals(actualString, expectedString, "actual and expected are not match exactly");
		}
	}

	@Test
	public void verifyFacebookLinkNavigateToSignInWithFacebookPage() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		lp.clickOnSignInWithFaceBookLink();
		String actualUrl = UIKeyword.driver.getCurrentUrl();
		String expUrl = "https://ijmeet.com/login/facebook";
		if (actualUrl.contains(expUrl)) {
			expUrl = actualUrl;
			Assert.assertEquals(actualUrl, expUrl, "actual and expected are not match exactly");
		}
	}

	@Test
	public void verifySignInWithFederationLinkIsPresent() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();

		String actualString = UIKeyword.driver
				.findElement(By.xpath("//div[@class='form-group common-view-sign-in']/a[3]")).getText();
		String expectedString = "Sign in with Federation";
		if (actualString.contains(expectedString)) {
			expectedString = actualString;
			Assert.assertEquals(actualString, expectedString, "actual and expected are not match exactly");
		}
	}

	@Test
	public void verifyFederationLinkNavigateToSignInWithFederationPage() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		lp.clickOnSignInWithFederationLink();
		String actualUrl = UIKeyword.driver.getCurrentUrl();
		String expUrl = "https://ijmeet.com/login/google";
		if (actualUrl.contains(expUrl)) {
			expUrl = actualUrl;
			Assert.assertEquals(actualUrl, expUrl, "actual and expected are not match exactly");
		}
	}

	@Test
	public void verifyDontHaveAccountIsPresent() {

		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		String actualString = UIKeyword.driver
				.findElement(By.xpath("//label[@class='form-check-label-dont-have px-0 mb-0']")).getText();
		String expectedString = "Don't have an account";
		if (actualString.contains(expectedString)) {
			expectedString = actualString;
			Assert.assertEquals(actualString, expectedString, "actual and expected are not match exactly");
		}
	}

	@Test
	public void verifySignUpButtonIsPresent() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		String actual = UIKeyword.driver
				.findElement(By.xpath("//label[@class='form-check-label-dont-have px-0 mb-0']/a")).getText();
		String expe = "Sign Up";
		if (actual.contains(expe)) {
			expe = actual;
			Assert.assertEquals(actual, expe, "actual and expected are not match exactly");
		}

	}

	@Test
	public void verifyFogottPasswordLinkIsPresent() {

		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		String actual = UIKeyword.driver.findElement(By.xpath("//a[@class='auth-link text-black']")).getText();
		String expe = "Forgot your password";
		if (actual.contains(expe)) {
			expe = actual;
			Assert.assertEquals(actual, expe, "actual and expected are not match exactly");
		}

	}

	@Test
	public void verifyForgottPasswordNavigateToPasswordResetPage() {

		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		lp.clickonForgotPassword();
		String actual = UIKeyword.driver.getCurrentUrl();
		String expe = "/reset";
		if (actual.contains(expe)) {
			expe = actual;
			Assert.assertEquals(actual, expe, "actual and expected are not match exactly");
		}
	}

	@Test
	public void verifyAddressisPresentOnSignInPage() {

		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		String actual = UIKeyword.driver.findElement(By.xpath("//div[@class='footer-address-customer']/h6")).getText();
		String expected = "Address";
		if (actual.contains(expected)) {
			expected = actual;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}

	}

	@Test
	public void verifySupportLinkIsPresentOnSignInPage() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		String actual = UIKeyword.driver
				.findElement(By.xpath("//div[@class='row footer-last-view-support']/div[2]/ul/li[1]/a")).getText();
		String expected = "Support";
		if (actual.contains(expected)) {
			expected = actual;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}

	}

	@Test
	public void verifyContact_Us_LinkIsPresentOnSignInPage() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		String actual = UIKeyword.driver
				.findElement(By.xpath("//div[@class='row footer-last-view-support']/div[2]/ul/li[2]/a")).getText();
		String expected = "Contact Us";
		if (actual.contains(expected)) {
			expected = actual;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}

	}

	@Test
	public void verifyAbout_us_LinkIsPresentOnSignInPage() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		String actual = UIKeyword.driver
				.findElement(By.xpath("//div[@class='row footer-last-view-support']/div[3]/ul/li[1]/a")).getText();
		String expected = "About Us";
		if (actual.contains(expected)) {
			expected = actual;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}

	}

	@Test
	public void verifyTermsAndConditionsLinkIsPresentOnSignInPage() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		String actual = UIKeyword.driver
				.findElement(By.xpath("//div[@class='row footer-last-view-support']/div[3]/ul/li[2]/a")).getText();
		String expected = "Terms and Conditions";
		if (actual.contains(expected)) {
			expected = actual;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}

	}

	@Test
	public void verifyPrivacyAndPolicyLinkIsPresentOnSignInPage() {

		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		String actual = UIKeyword.driver
				.findElement(By.xpath("//div[@class='row footer-last-view-support']/div[3]/ul/li[3]/a")).getText();
		String expected = "Privacy Policy";
		if (actual.contains(expected)) {
			expected = actual;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}

	}

	@Test
	public void verifyTwitterLinkIsPresentOnSignInPage() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		String actual = UIKeyword.driver
				.findElement(By.xpath("//div[@class='row footer-last-view-support']/div[4]/ul/li[1]/a")).getText();
		String expected = "Twitter";
		if (actual.contains(expected)) {
			expected = actual;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}

	}

	@Test
	public void verifyFaceBookLinkIsPresentOnSignInPage() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		String actual = UIKeyword.driver
				.findElement(By.xpath("//div[@class='row footer-last-view-support']/div[4]/ul/li[2]/a")).getText();
		String expected = "Facebook";
		if (actual.contains(expected)) {
			expected = actual;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}

	}

	@Test
	public void verifyInstagramLinkIsPresentOnSignInPage() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.checkForLoginIn();
		String actual = UIKeyword.driver
				.findElement(By.xpath("//div[@class='row footer-last-view-support']/div[4]/ul/li[3]/a")).getText();
		String expected = "Instagram";
		if (actual.contains(expected)) {
			expected = actual;
			Assert.assertEquals(actual, expected, "actual and expected are not match exactly");
		}

	}

	@Test
	public void verifySignInTwitterLinkNavigateToTwitterPage() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.clickOnTwitterLink();
		String actualUrl = UIKeyword.driver.getCurrentUrl();
		String expUrl = "/twitter";
		if (actualUrl.contains(expUrl)) {
			actualUrl = expUrl;
			Assert.assertEquals(actualUrl, expUrl, "actual and expected are not match exactly");

		}
	}

	@Test
	public void verifySignInInstagramLinkNavigateToInstagramPage() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.clickOnInstagramLink();
		String actualUrl = UIKeyword.driver.getCurrentUrl();
		String expUrl = "/instagram";
		if (actualUrl.contains(expUrl)) {
			actualUrl = expUrl;
			Assert.assertEquals(actualUrl, expUrl, "actual and expected are not match exactly");

		}
	}

	@Test
	public void verifySignInFacebookLinkNavigateToFacebookPage() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.clickOnFacebookLink();
		String actualUrl = UIKeyword.driver.getCurrentUrl();
		String expUrl = "/facebook";
		if (actualUrl.contains(expUrl)) {
			actualUrl = expUrl;
			Assert.assertEquals(actualUrl, expUrl, "actual and expected are not match exactly");

		}
	}

	@Test
	public void verifySignInSupportLinkNavigateToSupportPage() {

		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.clickOnSupportLink();
		String actualUrl = UIKeyword.driver.getCurrentUrl();
		String expUrl = "/support";
		if (actualUrl.contains(expUrl)) {
			actualUrl = expUrl;
			Assert.assertEquals(actualUrl, expUrl, "actual and expected are not match exactly");

		}
	}

	@Test
	public void verifySignInContact_UsLinkNavigateTo_Contact_Us_Page() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.clickOnContactUsLink();
		String actualUrl = UIKeyword.driver.getCurrentUrl();
		String expUrl = "/contact";
		if (actualUrl.contains(expUrl)) {
			actualUrl = expUrl;
			Assert.assertEquals(actualUrl, expUrl, "actual and expected are not match exactly");

		}
	}

	@Test
	public void verifySignInAbout_UsLinkNavigateToAboutUsPage() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.clickOnAboutUsLink();
		String actualUrl = UIKeyword.driver.getCurrentUrl();
		String expUrl = "/about";
		if (actualUrl.contains(expUrl)) {
			actualUrl = expUrl;
			Assert.assertEquals(actualUrl, expUrl, "actual and expected are not match exactly");

		}
	}

	@Test
	public void verifySignInTermsAndConditionsLinkNavigateToTermsAndConditionsPage() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.clickOnTermsAndConditionsLink();
		String actualUrl = UIKeyword.driver.getCurrentUrl();
		String expUrl = "/terms";
		if (actualUrl.contains(expUrl)) {
			actualUrl = expUrl;
			Assert.assertEquals(actualUrl, expUrl, "actual and expected are not match exactly");

		}
	}

	@Test
	public void verifySignInPrivacyPolicyLinkNavigateToPrivacyPolicysPage() {
		EnvironmentUtil env = new EnvironmentUtil();
		SignInPage lp = new SignInPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignIn_Button();
		lp.clickOnPrivacyPolicyLink();
		String actualUrl = UIKeyword.driver.getCurrentUrl();
		String expUrl = "/privacy";
		if (actualUrl.contains(expUrl)) {
			actualUrl = expUrl;
			Assert.assertEquals(actualUrl, expUrl, "actual and expected are not match exactly");

		}
	}

}