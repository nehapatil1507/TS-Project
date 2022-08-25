package com.ijmeet.keyword;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeyword {
	// private static final Logger log = Logger.getLogger(UIKeyword.class);

	public static RemoteWebDriver driver = null;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			// System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications", "start-maximized");

			driver = new ChromeDriver(option);

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions opn = new FirefoxOptions();
			opn.addArguments("--disable-notifications", "start-maximized", "--incognito");

			driver = new FirefoxDriver(opn);

		}
		System.out.println(browserName + "browser is launched successfully");
	}

	public static void launchUrl(String url) {
		driver.get(url);
		System.out.println("url is launched " + url);

	}

	public static void closeBrowser() {
		driver.close();
		System.out.println("browser is closed successfully");
	}

	public static void switchToWindow(String byTitle) {
		Set<String> windows = driver.getWindowHandles();

		for (String window : windows) {
			if (driver.switchTo().window(window).getTitle().equalsIgnoreCase(byTitle)) {
				System.out.println("Switched to window" + byTitle);
				break;
			}
		}
	}

	public static void enterText(By element, String text) {

		driver.findElement(element).sendKeys(text);

	}

	public static void hitButton(int keyCode) {
		Robot robo = null;
		try {
			robo = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robo.keyPress(keyCode);
		robo.keyRelease(keyCode);

	}

	public static void clickON(WebElement element) {

		Actions act = new Actions(driver);
		act.click(element).build().perform();
	}

	public static void enterText(WebElement element, String text) {

	}

	public static void clickOn(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].scrollIntoView()", element);
	}

}