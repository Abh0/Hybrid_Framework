package com.nayaami.test_cases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nayaami.PageObject.Login_page;
import com.nayaami.utilities.XLUtils;

public class TC_LoginDDT_002 extends Base_Class {

	@Test(dataProvider = "NayaamiLoginData")
	public void loginDDT(String emailid, String pwd) throws InterruptedException {
		Login_page lp = new Login_page(driver);

		
		lp.clicksSigninButton(null);

		lp.setEmailId(emailid);
		logger.info("email id provided");
		Thread.sleep(3000);

		lp.clickContinueBtn(null);
		Thread.sleep(3000);

		lp.setPassword(pwd);
		logger.info("password is provided");
		Thread.sleep(3000);
		

		lp.selCheckBox(null);

		lp.clickLoginButton(null);
		Thread.sleep(3000);

		lp.clicksLogoutButton(null);
		Thread.sleep(3000);
		

	}

	@DataProvider(name = "NayaamiLoginData")
	String[][] getData() throws IOException {

		String path = System.getProperty("user.dir") + "/src/test/java/com/nayaami/testdata/NayaamiLoginData.xlsx";

		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);

		String logindata[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcount; j++) {

				logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j); // 1 , 0

			}

		}
		return logindata;
	}
}
