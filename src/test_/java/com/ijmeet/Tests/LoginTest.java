package com.ijmeet.Tests;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ijmeet.config.TestBase;
import com.ijmeet.keyword.UIKeyword;
import com.ijmeet.pages.LoginPage;
import com.ijmeet.utils.EnvironmentUtil;

public class LoginTest extends TestBase {

	@Test
	public void verityloginToijmeetBy(String Username, String Password) {

		EnvironmentUtil env = new EnvironmentUtil();
		LoginPage lp = new LoginPage();
		String expectedurl = "dashboard";

		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(250));
		lp.clickOnSignInButton();
		lp.enterUserName(Username, Password);
		lp.click_Sign_IN();

		String actualurl = UIKeyword.driver.getCurrentUrl();

		if (actualurl.contains(expectedurl)) {
			expectedurl = actualurl;
		}

		Assert.assertEquals(actualurl, expectedurl);
		System.out.println("Actual : " + actualurl + " Expected : " + expectedurl);

	}

}