package com.ijmeet.Tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ijmeet.config.TestBase;
import com.ijmeet.keyword.UIKeyword;
import com.ijmeet.pages.TwitterPage;
import com.ijmeet.utils.EnvironmentUtil;

public class TwitterTests extends TestBase {

	@Test
	public void verifyIfTwitterButtonWorks() {
		EnvironmentUtil env = new EnvironmentUtil();
		TwitterPage tp = new TwitterPage();

		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(250));
		tp.clickOnTwitter();
		Assert.assertTrue((UIKeyword.driver.getPageSource().contains("twitter")));
	}

}
