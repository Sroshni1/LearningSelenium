package com.collin;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Collin {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","/Users/shanjidaroshni/eclipse-workspace/JavaSeleniumMethods/browser/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.collin.edu/");
		driver.manage().window().maximize();
		
	}
	@Test(priority = 1, enabled = false)
	public void testResource() {
		WebElement resource =driver.findElement(By.xpath("(//a[@class='dropdown-toggle hasChildren'])[3]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(resource).build().perform();
	}
	@Test(priority = 2)
	public void testAcademy() throws InterruptedException, IOException {
		WebElement resource =driver.findElement(By.xpath("(//a[@class='dropdown-toggle hasChildren'])[3]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(resource).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Academic and Master Calendars")).click();
	File picture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(picture, new File("/Users/shanjidaroshni/eclipse-workspace/LearningSelinium/screenShot/shot.png"));	
	}
	
	
	
	
	
	
}
