package com.mytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.mypage.BasePage;
import com.mypage.Page;

public class BaseTest {

	WebDriver driver;
	public Page page;

	@BeforeMethod
	@Parameters(value = { "browser" })
	public void setUpTest(String browser1) {

		if (browser1.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium jar/chromedriver");
			driver = new ChromeDriver();

		} else if (browser1.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "/Users/macmini/Documents/Selenium jar/geckodriver");
			driver = new FirefoxDriver();
		} else {
			System.out.println("No browser Define in Xml file....");
		}

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://automationteststore.com/index.php?rt=account/login");
		driver.manage().window().maximize();

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		page = new BasePage(driver);
	}

	@AfterMethod
	public void closeBrower() {
		driver.quit();
	}

}
