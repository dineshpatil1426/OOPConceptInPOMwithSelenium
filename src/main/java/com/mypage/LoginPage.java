
package com.mypage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	
	
	// Page Locator
	
	private By emailid=By.id("loginFrm_loginname");
	private By pass=By.id("loginFrm_password");
	private By loginbutton=By.xpath("//*[@title='Login']");
	private By header=By.xpath("//*[text()=' Account Login']");
			 
	

	public LoginPage(WebDriver driver) {
		super(driver);
	}


	/**
	 * @return the emailid
	 */
	public WebElement getEmailid() {
		return getElement(emailid);
	}


	/**
	 * @return the pass
	 */
	public WebElement getPass() {
		return getElement(pass);
	}


	/**
	 * @return the loginbutton
	 */
	public WebElement getLoginbutton() {
		return getElement(loginbutton);
	}


	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement(header);
	}

	
	public String getloginPageTitle() {
		return getPageTitle();
	}
	
	public String getLoginPageHeader() {
		return getPageHeader(header);
	}
	
	
	
	public MyAccountPage doLogin(String userName,String password) {
		 
		getEmailid().sendKeys(userName);
		getPass().sendKeys(password);
		getLoginbutton().click();
		
		return getInstance(MyAccountPage.class);
	}
	
	// used of Method overLoading 
	public MyAccountPage doLogin() {
		 
		getEmailid().sendKeys("");
		getPass().sendKeys("");
		getLoginbutton().click();
		
		return getInstance(MyAccountPage.class);
	}
     	
	
	
	
}
