package com.nayaami.test_cases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nayaami.PageObject.Login_page;

public class TC_LoginTest_001 extends Base_Class {

	@Test
	public void loginTest() throws InterruptedException, IOException {

		
		
		logger.info("url is open");

		Login_page lp = new Login_page(driver);

		

		lp.clicksSigninButton(null);
		logger.info("click in sign in button");
		Thread.sleep(3000);

		lp.setEmailId(emailid);
		logger.info("enter email id");

		lp.clickContinueBtn(null);
		Thread.sleep(3000);
		
		lp.setPassword(password);
		logger.info("enter Password");

		lp.selCheckBox(null);
		Thread.sleep(3000);
		
		lp.clickLoginButton(null);
		logger.info("click on Login button");

		if (driver.getTitle().equals("Nayaami-Buy menstual products online from Nayaami at the best...")) {

			Assert.assertTrue(false);
			logger.info("Login Test failed");

		} 
		else
		{
			captureScreen(driver, "loginTest");
            Assert.assertTrue(true);
			logger.info("Login Test passed");
		}

	}

}
