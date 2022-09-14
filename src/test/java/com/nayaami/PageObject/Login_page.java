package com.nayaami.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	WebDriver ldriver;

	public Login_page(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//button[@class='MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButtonBase-root navbar_sign_in_btn__BPRcy css-18p864d']")
	@CacheLookup
	WebElement signinBtn;

	@FindBy(xpath = "//input[@id='email-or-phone']")
	@CacheLookup
	WebElement txtEmailid;

	@FindBy(xpath = "//button[@id='mui-4']")
	@CacheLookup
	WebElement continueBtn;

	@FindBy(xpath = "//input[@class='Signin_input__DXnZn']")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//input[@name='remember-me']")
	@CacheLookup
	WebElement checkBox;

	@FindBy(xpath = "//button[@id='mui-5']")
	@CacheLookup
	WebElement loginButton;

	@FindBy(xpath = "//button[@class='MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButtonBase-root navbar_sign_in_btn__BPRcy css-18p864d']")
	@CacheLookup
	WebElement logoutButton;

	@FindBy(xpath = "/html/body/div/div[1]/div[20]/div/div[30]/div/div/div[6]/button']")
	@CacheLookup
	WebElement productAddcart;

	public void clicksSigninButton(String signin) {
		signinBtn.click();

	}

	public void setEmailId(String emailid) {
		txtEmailid.sendKeys(emailid);

	}

	public void clickContinueBtn(String ctnButton) {
		continueBtn.click();

	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);

	}

	public void selCheckBox(String rm_me) {
		checkBox.isSelected();

	}

	public void clickLoginButton(String login) {
		loginButton.click();

	}

	public void clicksLogoutButton(String logout) {
		logoutButton.click();

	}

	public void clickAddTocart(String addtocart) {
		productAddcart.click();

	}

}
// for 'x' button on sign in page
//    //button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk']
//      //div[@class='Sign-up_close_dialog__ysxFV']