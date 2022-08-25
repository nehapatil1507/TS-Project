package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ijmeet.keyword.UIKeyword;

public class TwitterPage {

	@FindBy(xpath = "//a[@href='https://twitter.com/ijtimaati']")
	public WebElement twitter;

	public TwitterPage() {
		PageFactory.initElements(UIKeyword.driver, this);
	}

	public void clickOnTwitter() {

		UIKeyword.clickOn(twitter);
		
	}
}
