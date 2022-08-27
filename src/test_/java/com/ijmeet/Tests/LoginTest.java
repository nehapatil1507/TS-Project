package com.ijmeet.Tests;

import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ijmeet.config.TestBase;
import com.ijmeet.keyword.UIKeyword;
import com.ijmeet.pages.LoginPage;
import com.ijmeet.utils.EnvironmentUtil;

public class LoginTest extends TestBase{
	
	@Test
	public void verityloginToijmeetBy() {

		EnvironmentUtil env = new EnvironmentUtil();
		LoginPage lp = new LoginPage();
		String ExpectedTitle = "Sign In";
	
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignInButton();
        String actualTitle = UIKeyword.driver.getTitle();
        
        
		Assert.assertEquals(actualTitle, ExpectedTitle);
		System.out.println("Actual : "+actualTitle+" Expected : "+ExpectedTitle);

	}
	
	@Test
	public void verifyUserCanLoginWithEmailAndPassword() {
      
		EnvironmentUtil env = new EnvironmentUtil();
		LoginPage lp = new LoginPage();
		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		lp.clickOnSignInButton();
		lp.loginInToUserAccount();
		String expectedUrl="/dashboard";
		String actualUrl=UIKeyword.driver.getCurrentUrl();
		
		if (actualUrl.contains(expectedUrl)) {
			actualUrl=expectedUrl;
		}
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	

}