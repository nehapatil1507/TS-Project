package com.ijmeet.pages;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ijmeet.keyword.UIKeyword;

public class Sign_UpPage {

	@FindBy(xpath = "//div[@class='row footer-last-view-support']/div[2]/ul/li[1]/a")
	public WebElement Support_Link;

	@FindBy(xpath = "//div[@class='row footer-last-view-support']/div[2]/ul/li[2]/a")
	public WebElement Contact_us_link;

	@FindBy(xpath = "//div[@class='row footer-last-view-support']/div[4]/ul/li[1]/a")
	public WebElement Twitter_Link;

	@FindBy(xpath = "//div[@class='row footer-last-view-support']/div[4]/ul/li[2]/a")
	public WebElement Facebook_Link;

	@FindBy(xpath = "//div[@class='row footer-last-view-support']/div[4]/ul/li[3]/a")
	public WebElement Instagram_Link;

	@FindBy(xpath = "//div[@class='row footer-last-view-support']/div[3]/ul/li[1]/a")
	public WebElement About_Us_Link;

	@FindBy(xpath = "//div[@class='row footer-last-view-support']/div[3]/ul/li[2]/a")
	public WebElement Terms_And_Conditions_Link;

	@FindBy(xpath = "//div[@class='row footer-last-view-support']/div[3]/ul/li[3]/a")
	public WebElement Privacy_Policy_Link;

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
	// div[@class='my-0 mb-3 d-flex justify-content-between
	// align-items-center']/div/button"}

	@FindBy(xpath = "//ul[@class='navbar-nav ml-auto customize-right-navbar']/li[1]/a")
	public WebElement joinMeeting;

	@FindBy(xpath = "//ul[@class='navbar-nav ml-auto customize-right-navbar']/li[2]/a")
	public WebElement hostMeeting;

	@FindBy(xpath = "//ul[@class='navbar-nav ml-auto customize-right-navbar']/li[3]/a")
	public WebElement contactSale;

	@FindBy(xpath = "//ul[@class='navbar-nav ml-auto customize-right-navbar']/li[4]/a")
	public WebElement Sign_In_tab;

	@FindBy(xpath = "//ul[@class='navbar-nav ml-auto customize-right-navbar']/li[5]/a")
	public WebElement Sign_up_tab;

	@FindBy(xpath = "//ul[@class='navbar-nav ml-auto customize-right-navbar']/li[6]/a/span[2]")
	public WebElement arabic_language_convertor_tab;

	@FindBy(xpath = "//a[@href='https://ijmeet.com/login/google?csrt=4494339304593800721']")
	public WebElement Sign_In_With_GoogleLink;

	@FindBy(xpath = "//a[@href='https://ijmeet.com/login/facebook?csrt=4494339304593800721']")
	public WebElement Sign_In_With_FaceBookLink;

	@FindBy(xpath = "//a[@href='https://saml.ijmeet.com/shibauth/sso-live.php']")
	public WebElement Sign_In_With_FederationLink;

	public Sign_UpPage() {

		PageFactory.initElements(UIKeyword.driver, this);
	}

	public void clickOnSign_UP() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(Sign_Up).build().perform();
	}

	public void fillForm() throws InterruptedException {
		Thread.sleep(500);
		/*
		 * // UIKeyword.enterText((By) fullName, "Divya Dhoke");
		 * UIKeyword.driver.findElement((By) fullName).sendKeys("Divya Dhoke");
		 * Thread.sleep(500); UIKeyword.driver.findElement((By)
		 * companyName).sendKeys("Divya Dresses"); Thread.sleep(500);
		 * UIKeyword.driver.findElement((By) EmailId).sendKeys("divyadhoke@gmail.com");
		 * Thread.sleep(500); UIKeyword.driver.findElement((By)
		 * MobileNo).sendKeys("8976541236"); Thread.sleep(500);
		 * UIKeyword.driver.findElement((By) Password).sendKeys("DivyaD236@");
		 * 
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
		wait = new WebDriverWait(UIKeyword.driver, Duration.ofSeconds(120));

		// wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameInner));
		// wait.until(ExpectedConditions.elementToBeClickable(Shadow_button));
		// act.click(Shadow_button).build().perform();
		// act.click(pressAgain).build().perform();

	}

	public void clickOnsignUP() {

		// WebDriverWait wait=new WebDriverWait(UIKeyword.driver,
		// Duration.ofSeconds(20));

		UIKeyword.driver.switchTo().defaultContent();
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).build().perform();

	}

	public void clickOnHostMeeting() {
		UIKeyword.driver.switchTo().defaultContent();
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).click(hostMeeting).build().perform();

	}

	public void clickOnJoinMeeting() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(joinMeeting).build().perform();
	}

	public void clickOnContactSale() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).click(contactSale).build().perform();
	}

	public void clickOnSignInTab() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).click(Sign_In_tab).build().perform();
	}

	public void clickOnSignUpTab() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).click(Sign_In_tab).build().perform();
	}

	public void clickOnArabicLanguageTranslatorTab() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).build().perform();
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(250));
		act.click(arabic_language_convertor_tab).build().perform();
	}

	public void clickOnSignInWithGoogleLink() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).click(Sign_In_With_GoogleLink).build().perform();

	}

	public void clickOnSignInWithFaceBookLink() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).click(Sign_In_With_FaceBookLink).build().perform();
	}

	public void clickOnSignInWithFederationLink() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).click(Sign_In_With_FederationLink).build().perform();
	}

	public void checkForLoginIn() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).build().perform();

	}

	public void clickOnTwitterLink() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).scrollToElement(Twitter_Link).click(Twitter_Link).build().perform();
	}

	public void clickOnInstagramLink() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).scrollToElement(Instagram_Link).click(Instagram_Link).build().perform();
	}

	public void clickOnFacebookLink() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).scrollToElement(Facebook_Link).click(Facebook_Link).build().perform();
	}

	public void clickOnSupportLink() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).scrollToElement(Support_Link).click(Support_Link).build().perform();

	}

	public void clickOnContactUsLink() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).scrollToElement(Contact_us_link).click(Contact_us_link).build().perform();
	}

	public void clickOnAboutUsLink() {

		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).scrollToElement(About_Us_Link).click(About_Us_Link).build().perform();
	}

	public void clickOnTermsAndConditionsLink() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).scrollToElement(Terms_And_Conditions_Link).click(Terms_And_Conditions_Link).build().perform();
	}

	public void clickOnPrivacyPolicyLink() {

		Actions act = new Actions(UIKeyword.driver);
		act.click(SignUp).scrollToElement(Privacy_Policy_Link).click(Privacy_Policy_Link).build().perform();
	}

}
