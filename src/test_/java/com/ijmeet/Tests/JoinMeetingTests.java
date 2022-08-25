package com.ijmeet.Tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ijmeet.config.TestBase;
import com.ijmeet.keyword.UIKeyword;
import com.ijmeet.pages.JoinMeetingPage;
import com.ijmeet.utils.EnvironmentUtil;

public class JoinMeetingTests extends TestBase {

	@Test
	public void verifyJoinMeetingButton() {
		EnvironmentUtil env = new EnvironmentUtil();
		JoinMeetingPage jm = new JoinMeetingPage();

		UIKeyword.launchUrl(env.getappUrl());

		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		jm.clickOnJoinMeetingButton();


		List<WebElement> l= UIKeyword.driver.findElements(By.xpath("//*[contains(text(),'Join Meeting')]"));

		Assert.assertTrue(l.size() > 0);

	}

	@Test
	public void verifyUserCanJoinMeetingByWrongDetails() {
		EnvironmentUtil env = new EnvironmentUtil();
		JoinMeetingPage jm = new JoinMeetingPage();
		UIKeyword.launchUrl(env.getappUrl());

		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		jm.clickOnJoinMeetingButton();
		jm.enterTextinFeilds();
		jm.clickOnJoinMeetingButton1();
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		jm.checkErrorMsg();
	}

}
