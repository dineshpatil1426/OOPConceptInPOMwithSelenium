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
public class HomePage extends BasePage{

	private By homeHeader =By.xpath("//*[text()=' My Account']");
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	public WebElement getHeader() {
		return getElement(homeHeader);
	}

	//Page Actions
	public String getHomePageTitle() {
		return getPageTitle();
	}
	
	public void getHomePageHeader() {
		getPageHeader(homeHeader);
	}

}
