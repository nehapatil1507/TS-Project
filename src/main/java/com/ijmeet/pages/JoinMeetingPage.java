package com.ijmeet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ijmeet.keyword.UIKeyword;

public class JoinMeetingPage {

	@FindBy(css = "li.nav-item:nth-child(1)")
	public WebElement JoinMeeting;

	@FindBy(css = "input#username")
	public WebElement name;

	@FindBy(css = "input#meetingid")
	public WebElement meetingid;

	@FindBy(css = "button#before_start")
	public WebElement JoinMeeting1;

	@FindBy(css = "div.bootbox-body")
	public static WebElement errorMsg;

	public JoinMeetingPage() {
		PageFactory.initElements(UIKeyword.driver, this);
	}

	public void clickOnJoinMeetingButton() {
		UIKeyword.clickON(JoinMeeting);
	}

	public void enterTextinFeilds() {
		UIKeyword.enterText(name, "Neha");
		UIKeyword.enterText(meetingid, "12345");

	}

	public void clickOnJoinMeetingButton1() {
		UIKeyword.clickON(JoinMeeting);
		System.out.println("Clicked ON Join Meeting");
	}

	public void checkErrorMsg() {
		
		Assert.assertTrue(errorMsg!=null);
	}

}
