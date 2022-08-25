package com.ijmeet.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.ijmeet.keyword.UIKeyword;
import com.ijmeet.utils.ExcelReaderFile;

public class LoginPage {
	
	//signin button for navigate to new page of signin 
	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	public WebElement SignIn;	

	@FindBy(xpath = "//a[@class='nav-link nav-right-cutom-bg font-weight-bold']")
	public WebElement signup;

	@FindBy(xpath = "//input[@id='email']")
	public By email;

	@FindBy(xpath = "//input[@id='password']")
	public By password;

	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement checkBox;
	
	// sign in button for submit
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	public WebElement SIGN_iN;
	
	
	public LoginPage() {

	PageFactory.initElements(UIKeyword.driver, this);

	}

	public void clickOnSignInButton() {
		 UIKeyword.clickON(SignIn);
	}
	
	
	public void enterUserName(String usernm ,String pass) {
        ((WebElement) UIKeyword.driver.findElements(email)).sendKeys(usernm);
        ((WebElement) UIKeyword.driver.findElements(this.password)).sendKeys(pass);
         
          
	}
	
	   public void click_Sign_IN() {

		  Actions act=new Actions(UIKeyword.driver);
		  act.click(SIGN_iN).build().perform();
	}
	

	

}
