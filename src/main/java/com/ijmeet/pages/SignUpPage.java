package com.ijmeet.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ijmeet.keyword.UIKeyword;

public class SignUpPage {
	@FindBy(xpath = "//input[@placeholder=' Enter full name ']")
	public WebElement fullName;

	@FindBy(xpath = "//input[@id='company_name']")
	public WebElement companyName;

	@FindBy(xpath = "//input[@placeholder=' Enter email id ']")
	public WebElement EmailId;

	@FindBy(xpath = "//input[@placeholder=' Enter mobile number ']")
	public WebElement MobileNo;

	@FindBy(xpath = "//input[@placeholder=' Enter password ']")
	public WebElement Password;

	@FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
	public WebElement RoBootCheckBox;

	@FindBy(xpath = "(//a[contains(text(),'Sign Up')])[1]")
	public WebElement Sign_Up;

	@FindBy(xpath = "//iframe[@title='reCAPTCHA']")
	public WebElement frameOuter;

	@FindBy(xpath = "//div[@class='button-holder help-button-holder']")
	public WebElement Shadow_button;

	@FindBy(xpath = "//iframe[@name='c-lmf05huvuebc']")
	public WebElement FrameInner;

	@FindBy(xpath = "/html/body/div/div/div[8]/div[2]/div[1]/div[1]/div[4]//button")
	public WebElement pressAgain;

	@FindBy(xpath = "//div[@class='my-0 mb-3 d-flex justify-content-between align-items-center']/div/button")
	public WebElement SignUp;
	
	// trafic light src
	//  //img[@src='https://www.google.com/recaptcha/api2/payload?p=06ANYolqu5EvL4zI2cMjAmq1TBDqNM0fTUCjcfNqwQaZJmoBp6iZn0mUirFdP_11WpTihQEG-4BpkERUI1BX0S67Bw6gxpm9bVHPHDcEheZlFmFw578RKNmcdr79r2YKrcMefLI3FQe0ZMMh_Je-WV9K_Glg_IkrhylWDQ6tqWeNCxnbdnynZ1F8hvrWYs-qSS8jYA6K8UXbPjPYcrqkZfDO5azayXVGY2dFvzwJStMfukwwLHdcC55l0&k=6LdapKsZAAAAABMIgOXhvFxh2OA3IMxrURT0r7rv']
   //titles click bycle
	// (//div[@class='rc-imageselect-checkbox'])[8]
	//   (//div[@class='rc-imageselect-checkbox'])[1]
	//   (//div[@class='rc-imageselect-checkbox'])[1]
	//  //img[@class='rc-image-tile-33']
	public SignUpPage() {

		PageFactory.initElements(UIKeyword.driver, this);
	}

	public void clickOnSign_UP() {

		Actions act = new Actions(UIKeyword.driver);
		act.click(Sign_Up).build().perform();

	}

	public void fillForm() {
		/*
		 * UIKeyword.driver.findElement(fullName).sendKeys("Divya Dhoke");
		 * UIKeyword.driver.findElement(companyName).sendKeys("Divya Dresses");
		 * UIKeyword.driver.findElement(EmailId).sendKeys("divyadhoke@gmail.com");
		 * UIKeyword.driver.findElement(MobileNo).sendKeys("8976541236");
		 * UIKeyword.driver.findElement(Password).sendKeys("DivyaD236@");
		 */
		Actions act = new Actions(UIKeyword.driver);
		act.sendKeys(fullName, "Divya Dhoke").sendKeys(companyName, "Divya Dresses")
				.sendKeys(EmailId, "divyadhoke@gmail.com").sendKeys(MobileNo, "8976541236")
				.sendKeys(Password, "DivyaD236@").build().perform();
	}

	public void reCaptchaClick() {
		WebDriverWait wait = new WebDriverWait(UIKeyword.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameOuter));
		Actions act = new Actions(UIKeyword.driver);
		act.click(RoBootCheckBox).build().perform();
		wait=new WebDriverWait(UIKeyword.driver, Duration.ofSeconds(120));
		
	//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameInner));
	//	wait.until(ExpectedConditions.elementToBeClickable(Shadow_button));
	//	act.click(Shadow_button).build().perform();
	//	act.click(pressAgain).build().perform();

	}

	public void clickOnsignUP() {

		// WebDriverWait wait=new WebDriverWait(UIKeyword.driver,
		// Duration.ofSeconds(20));

		UIKeyword.driver.switchTo().defaultContent();
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).build().perform();

	}

}
