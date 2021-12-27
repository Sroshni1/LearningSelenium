package com.learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonWebsite {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","/Users/shanjidaroshni/eclipse-workspace/JavaSeleniumMethods/browser/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.collin.edu/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.navigate().refresh();
    WebElement resource =driver.findElement(By.xpath("(//a[@class='dropdown-toggle hasChildren'])[3]"));
	Actions actions=new Actions(driver);
	actions.moveToElement(resource).build().perform();
	Thread.sleep(3000);
    driver.findElement(By.linkText("Academic and Master Calendars")).click();
	   
}
}
