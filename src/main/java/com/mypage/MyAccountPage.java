/**
 * 
 */
package com.mypage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class MyAccountPage extends BasePage {
	
	private By accountHeader =By.xpath("//*[text()=' My Account']");
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}

	public WebElement getHeader() {
		return getElement(accountHeader);
	}

	//Page Actions
	public String getMyAccountPageTitle() {
		return getPageTitle();
	}
	
	public String getMyAccountPageHeader() {
		
		return getPageHeader(accountHeader);
	}
	
	
	

}
