package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ijmeet.keyword.UIKeyword;

public class LoginPage {

	/*
	 * @FindBy(xpath = "//a[@class='nav-link nav-right-cutom-bg font-weight-bold']")
	 * public WebElement signup;
	 * 
	 * @FindBy(xpath = "=//input[@id='email']") public WebElement email;
	 * 
	 * @FindBy(xpath = "=//input[@id='password']") public WebElement password;
	 * 
	 * @FindBy(xpath = "=//input[@type='checkbox']") public WebElement checkBox;
	 */
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement SignIn;

	public LoginPage() {

		PageFactory.initElements(UIKeyword.driver, this);

	}

	public void clickOnSignInButton() {
		UIKeyword.clickON(SignIn);
	}

}
