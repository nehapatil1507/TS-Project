package com.ijmeet.pages;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ijmeet.keyword.UIKeyword;

public class SignInPage {

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

	@FindBy(xpath = "//a[@class='nav-link nav-right-cutom-bg font-weight-bold']")
	public WebElement signup;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement email;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;

	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement checkBox;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement SignIn;

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

	@FindBy(xpath = "//a[@class='auth-link text-black']")
	public WebElement forgotpasswordlink;

	@FindBy(xpath = "(//li[@class='nav-item m-navitemone mx-1'])[1]/a")
	public WebElement SignInImpButton;

	public SignInPage() {

		PageFactory.initElements(UIKeyword.driver, this);

	}

	public void clickOnSignIn_Button() {
		UIKeyword.clickON(SignInImpButton);
	}

	public void loginInToUserAccount() {

		/*
		 * UIKeyword.enterText(email, "meera@gmail.com"); UIKeyword.enterText(password,
		 * "MeeraD562@"); UIKeyword.clickON(checkBox); UIKeyword.clickON(SignIn);
		 */
		Actions act = new Actions(UIKeyword.driver);
		act.sendKeys(email, "meera@gmail.com").sendKeys(password, "MeeraD562@").click(checkBox).click(SignIn).build()
				.perform();
	}

	public void clickOnHostMeeting() {
		UIKeyword.driver.switchTo().defaultContent();
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignIn).click(hostMeeting).build().perform();

	}

	public void clickOnJoinMeeting() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(joinMeeting).build().perform();
	}

	public void clickOnContactSale() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignIn).click(contactSale).build().perform();
	}

	public void clickOnSignInTab() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignIn).click(Sign_In_tab).build().perform();
	}

	public void clickOnSignUpTab() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignIn).click(Sign_In_tab).build().perform();
	}

	public void clickOnArabicLanguageTranslatorTab() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignIn).build().perform();
		UIKeyword.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(250));
		act.click(arabic_language_convertor_tab).build().perform();
	}

	public void clickOnSignInWithGoogleLink() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignIn).click(Sign_In_With_GoogleLink).build().perform();

	}

	public void clickOnSignInWithFaceBookLink() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignIn).click(Sign_In_With_FaceBookLink).build().perform();
	}

	public void clickOnSignInWithFederationLink() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignIn).click(Sign_In_With_FederationLink).build().perform();
	}

	public void checkForLoginIn() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignIn).build().perform();

	}

	public void clickonForgotPassword() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(forgotpasswordlink).build().perform();

	}

	public void clickOnTwitterLink() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignIn).scrollToElement(Twitter_Link).click(Twitter_Link).build().perform();
	}

	public void clickOnInstagramLink() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignIn).scrollToElement(Instagram_Link).click(Instagram_Link).build().perform();
	}

	public void clickOnFacebookLink() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignIn).scrollToElement(Facebook_Link).click(Facebook_Link).build().perform();
	}

	public void clickOnSupportLink() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignIn).scrollToElement(Support_Link).click(Support_Link).build().perform();

	}

	public void clickOnContactUsLink() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignIn).scrollToElement(Contact_us_link).click(Contact_us_link).build().perform();
	}

	public void clickOnAboutUsLink() {

		Actions act = new Actions(UIKeyword.driver);
		act.click(SignIn).scrollToElement(About_Us_Link).click(About_Us_Link).build().perform();
	}

	public void clickOnTermsAndConditionsLink() {
		Actions act = new Actions(UIKeyword.driver);
		act.click(SignIn).scrollToElement(Terms_And_Conditions_Link).click(Terms_And_Conditions_Link).build().perform();
	}

	public void clickOnPrivacyPolicyLink() {

		Actions act = new Actions(UIKeyword.driver);
		act.click(SignIn).scrollToElement(Privacy_Policy_Link).click(Privacy_Policy_Link).build().perform();
	}
}
