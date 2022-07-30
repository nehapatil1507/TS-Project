package com.ijmeet.config;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.ijmeet.keyword.UIKeyword;

public class TestBase {
	private static final Logger log = Logger.getLogger(TestBase.class);

	@Parameters("browser-name")
	@BeforeMethod
	public void setUp(@Optional String browserName) throws Exception {
		UIKeyword.openBrowser(null);
		if (browserName == null) {
			browserName = "Chrome";
		}

		if (browserName.isEmpty()) {
			browserName = "Chrome";
			log.info("setting default browser as " + browserName);
		}
		UIKeyword.openBrowser(browserName);

	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		UIKeyword.closeBrowser();
	}

}
