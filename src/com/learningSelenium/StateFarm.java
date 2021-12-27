package com.learningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StateFarm {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "/Users/shanjidaroshni/eclipse-workspace/LearningSelinium/driver/chromedriver");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	}
	@Test
	public void stateFarmHomePage() {
		driver.get("https://www.statefarm.com/");
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	

}
