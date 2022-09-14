package com.nayaami.test_cases;

import org.testng.annotations.Test;

import com.nayaami.PageObject.Login_page;

public class TC_AddToCart_003 extends Base_Class {

	@Test
	public void AddToCart(  String emailid, String pwd) throws InterruptedException {

		
		Login_page lp = new Login_page(driver);
		
		
		lp.clicksSigninButton(null);

		lp.setEmailId(emailid);
		logger.info("email id provided 003");
		Thread.sleep(3000);

		lp.clickContinueBtn(null);
		Thread.sleep(3000);

		lp.setPassword(pwd);
		logger.info("password is provided 003");
		Thread.sleep(3000);

		lp.selCheckBox(null);

		lp.clickLoginButton(null);
		Thread.sleep(3000);

		lp.clickAddTocart(null);
		Thread.sleep(3000);


	}

}
