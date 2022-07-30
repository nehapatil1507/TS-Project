package com.ijmeet.keyword;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeyword {
	private static final Logger log = Logger.getLogger(UIKeyword.class);

	public static RemoteWebDriver driver;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("FireFox")) {
			FirefoxOptions option = new FirefoxOptions();
			option.addArguments("--disable-notifications", "start-maximized", "--incognito");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("Chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications", "start-maximized", "--incognito");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(option);

		} else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		}
		log.info(browserName + "browser is launched successfully");
	}

	public static void launchUrl(String url) {
		driver.get(url);
		log.info("url is launched " + url);

	}

	public static void closeBrowser() {
		driver.close();
		log.info("browser is closed successfully");
	}

	public static void switchToWindow(String byTitle) {
		String parentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();

		String title = driver.getTitle();
		for (String window : windows) {
			if (driver.switchTo().window(window).getTitle().equalsIgnoreCase(byTitle)) {
				System.out.println("Switched towindow" + byTitle);
				break;

			}

		}

	}
}
