package com.mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypage.LoginPage;
import com.mypage.MyAccountPage;

public class LoginTest extends BaseTest {

	@Test(priority = 1)
	public void VerifyLoginPageTitleTest() {
		String title = page.getInstance(LoginPage.class).getloginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login");
	}

	@Test(priority = 2)
	public void VerifyLoginPageHeaderTest() {
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println(header);
		Assert.assertEquals(header, "ACCOUNT LOGIN");
	}

	@Test(priority = 3)
	public void doLoginTest() {

		MyAccountPage myAccount = page.getInstance(LoginPage.class).doLogin("dinesh","dinesh@123");
		String myAccountHeader = myAccount.getMyAccountPageHeader();
		System.out.println(myAccountHeader);
		Assert.assertEquals(myAccountHeader, "MY ACCOUNT");

	}

}
