package com.ijmeet.config;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.ijmeet.keyword.UIKeyword;
import com.ijmeet.utils.CaptureScreenShot;

@Listeners(CaptureScreenShot.class)
public class TestBase {
//	private static final Logger log = Logger.getLogger(TestBase.class);

	@Parameters("Browser-name")
	@BeforeMethod
	public void setUp(@Optional("Chrome") String browserNm) throws Exception {

		if ((browserNm.isEmpty()) || (browserNm.equals("null"))) {
			browserNm = "Chrome";
			System.out.println("Setting default browser as Chrome ");
		}

		UIKeyword.openBrowser(browserNm);
	}

	@Test
	public void onTestFailure() {
		CaptureScreenShot cs = new CaptureScreenShot();
		Assert.assertEquals(false, true);

	}

	@AfterMethod
	public void tearDown() {

		UIKeyword.closeBrowser();
	}

}
